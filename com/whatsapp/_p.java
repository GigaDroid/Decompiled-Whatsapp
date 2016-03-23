package com.whatsapp;

import com.whatsapp.protocol.bz;
import org.v;
import org.whispersystems.at;
import org.whispersystems.aw;

class _p implements Runnable {
    private static final String z;
    final App a;
    final bz b;
    final byte[] c;
    final int d;
    final bz[] e;

    static {
        char[] toCharArray = "U@Ec\u0016tG\u0018u\u000ee\u001d\u0005q\n".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 21;
                    break;
                case at.g /*1*/:
                    i2 = 51;
                    break;
                case at.i /*2*/:
                    i2 = arj.Theme_seekBarStyle;
                    break;
                case at.o /*3*/:
                    i2 = 20;
                    break;
                default:
                    i2 = 126;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void run() {
        this.a.aW.remove(App.ad() + z);
        App.a(this.c, aw.c(this.d), (byte) 5, this.e, this.b);
    }

    _p(App app, byte[] bArr, int i, bz[] bzVarArr, bz bzVar) {
        this.a = app;
        this.c = bArr;
        this.d = i;
        this.e = bzVarArr;
        this.b = bzVar;
    }
}
