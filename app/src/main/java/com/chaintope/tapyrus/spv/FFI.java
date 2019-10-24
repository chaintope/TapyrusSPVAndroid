package com.chaintope.tapyrus.spv;

public class FFI {
    private static native void enableLog();

    public static void initialize() {
        FFI.enableLog();
    }
}
