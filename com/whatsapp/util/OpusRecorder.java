package com.whatsapp.util;

import java.io.Closeable;

public class OpusRecorder implements Closeable {
    private long nativeHandle;

    private native void allocateNative(String str, int i);

    private native void freeNative();

    public native void prepare();

    public native void start();

    public native void stop();

    public OpusRecorder(String str, int i) {
        allocateNative(str, i);
    }

    public void close() {
        freeNative();
    }

    protected void finalize() {
        super.finalize();
        if (this.nativeHandle != 0) {
            freeNative();
        }
    }
}
