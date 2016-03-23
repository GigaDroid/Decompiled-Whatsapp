package com.whatsapp.util.dns;

import java.io.OutputStream;

class a {
    static short a(byte b, byte b2) {
        return (short) (((b << 8) & 65280) | (b2 & 255));
    }

    static byte a(short s) {
        return (byte) ((65280 & s) >>> 8);
    }

    static short b(byte[] bArr, int i) {
        return a(bArr[i], bArr[i + 1]);
    }

    static void a(OutputStream outputStream, short s) {
        outputStream.write(a(s));
        outputStream.write(b(s));
    }

    static int a(byte[] bArr, int i) {
        return a(bArr[i], bArr[i + 1], bArr[i + 2], bArr[i + 3]);
    }

    static void a(short s, byte[] bArr, int i) {
        bArr[i] = a(s);
        bArr[i + 1] = b(s);
    }

    static void a(OutputStream outputStream, int i) {
        outputStream.write((i >>> 24) & 255);
        outputStream.write((i >>> 16) & 255);
        outputStream.write((i >>> 8) & 255);
        outputStream.write(i & 255);
    }

    static byte b(short s) {
        return (byte) (s & 255);
    }

    static int a(byte b, byte b2, byte b3, byte b4) {
        return ((((b << 24) & -16777216) | ((b2 << 16) & 16711680)) | ((b3 << 8) & 65280)) | (b4 & 255);
    }
}
