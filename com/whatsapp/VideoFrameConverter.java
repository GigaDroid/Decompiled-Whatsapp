package com.whatsapp;

import java.nio.ByteBuffer;

public class VideoFrameConverter {
    private int a;

    private static native void configure(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11);

    private static native void convertFrame(int i, ByteBuffer byteBuffer, ByteBuffer byteBuffer2);

    private static native int create();

    private static native void release(int i);

    public static native void setLogFilePath(String str);

    public void a(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        convertFrame(this.a, byteBuffer, byteBuffer2);
    }

    public VideoFrameConverter() {
        this.a = create();
    }

    public void a() {
        release(this.a);
    }

    public void a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        configure(this.a, i, i2, i3, i4, i5, i6, i7, i8, i9, i10);
    }
}
