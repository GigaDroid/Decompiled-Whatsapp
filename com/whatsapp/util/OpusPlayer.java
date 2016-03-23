package com.whatsapp.util;

import java.io.Closeable;

public class OpusPlayer implements Closeable {
    private long nativeHandle;

    private native void allocateNative(String str, int i);

    private native void freeNative();

    public native long getCurrentPosition();

    public native long getLength();

    public native boolean isPlaying();

    public native void pause();

    public native void prepare();

    public native void resume();

    public native void seek(long j);

    public native void start();

    public native void stop();

    public OpusPlayer(String str, int i) {
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
