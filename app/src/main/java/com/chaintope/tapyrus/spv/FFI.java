package com.chaintope.tapyrus.spv;

public class FFI {
    private static native void enableLog();
    private static native void spvRun(String remote, String network);

    public String remote;
    public String network;

    public FFI(String remote, String network) {
        this.remote = remote;
        this.network = network;

        FFI.enableLog();
    }

    public void runSPV() {
        FFI.spvRun(this.remote, this.network);
    }
}
