package com.chaintope.tapyrus.spv;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    static {
        System.loadLibrary("tapyrus_spv");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FFI.initialize();

        RustGreetings g = new RustGreetings();
        String r = g.sayHello("Android world");
        ((TextView)findViewById(R.id.greetingField)).setText(r);
    }
}
