package com.whatsapp.util;

class w {
    byte[] a;
    int b;

    private w() {
        this.a = new byte[200];
    }

    boolean a(byte[] bArr) {
        int i = Log.h;
        int i2 = 0;
        while (i2 < bArr.length) {
            int i3 = (this.b - i2) - 1;
            if (i3 < 0) {
                i3 += this.a.length;
            }
            if (this.a[i3] == bArr[(bArr.length - i2) - 1]) {
                i2++;
                if (i != 0) {
                    break;
                }
            }
            return false;
        }
        return true;
    }

    w(c5 c5Var) {
        this();
    }

    void a(byte b) {
        this.a[this.b] = b;
        this.b++;
        this.b %= this.a.length;
    }
}
