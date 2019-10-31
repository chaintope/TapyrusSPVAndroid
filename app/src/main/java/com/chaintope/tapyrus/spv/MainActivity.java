package com.chaintope.tapyrus.spv;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
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
    }

    public void onClickRunButton(View view) {
        String remote = ((TextView)findViewById(R.id.remote)).getText().toString();
        int checkedId = ((RadioGroup)findViewById(R.id.network)).getCheckedRadioButtonId();
        String network = ((RadioButton)findViewById(checkedId)).getText().toString();

        FFI ffi = new FFI(remote, network);
        ffi.runSPV();

    }
}
