package com.whatsapp;

import android.support.annotation.NonNull;
import java.io.OutputStream;

public class at2 extends OutputStream {
    final OutputStream a;
    @ak2
    final int b;

    public void write(@NonNull byte[] bArr, int i, int i2) {
        this.a.write(bArr, i, i2);
        amd.b((long) i2, this.b);
    }

    public void write(int i) {
        this.a.write(i);
        amd.b(1, this.b);
    }

    public at2(OutputStream outputStream, @ak2 int i) {
        this.b = i;
        this.a = outputStream;
    }

    public void write(@NonNull byte[] bArr) {
        this.a.write(bArr);
        amd.b((long) bArr.length, this.b);
    }
}
