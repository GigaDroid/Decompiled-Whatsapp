package com.whatsapp.util;

import java.io.Closeable;
import java.io.InputStream;

public final class b1 implements Closeable {
    private final InputStream[] a;
    final b6 b;
    private final long c;
    private final String d;

    private b1(b6 b6Var, String str, long j, InputStream[] inputStreamArr) {
        this.b = b6Var;
        this.d = str;
        this.c = j;
        this.a = inputStreamArr;
    }

    b1(b6 b6Var, String str, long j, InputStream[] inputStreamArr, aa aaVar) {
        this(b6Var, str, j, inputStreamArr);
    }

    public void close() {
        int i = Log.h;
        InputStream[] inputStreamArr = this.a;
        int length = inputStreamArr.length;
        int i2 = 0;
        while (i2 < length) {
            b6.a(inputStreamArr[i2]);
            i2++;
            if (i != 0) {
                return;
            }
        }
    }

    public InputStream a(int i) {
        return this.a[i];
    }
}
