package com.google;

public final class fu {
    private final b[] a;
    private final int b;

    public int a() {
        return this.b * c();
    }

    public int d() {
        return this.b;
    }

    public b[] b() {
        return this.a;
    }

    fu(int i, b[] bVarArr) {
        this.b = i;
        this.a = bVarArr;
    }

    public int c() {
        int i = 0;
        boolean z = fQ.b;
        b[] bVarArr = this.a;
        int length = bVarArr.length;
        int i2 = 0;
        while (i2 < length) {
            i += bVarArr[i2].b();
            i2++;
            if (z) {
                break;
            }
        }
        return i;
    }
}
