package com.whatsapp;

import com.whatsapp.protocol.bz;
import com.whatsapp.protocol.co;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;
import org.whispersystems.aw;

final class adi implements Runnable {
    private static final String[] z;
    private final boolean a;
    private final int b;
    final auh c;
    private final bz d;
    private final byte[] e;
    private final bz[] f;

    static {
        String[] strArr = new String[5];
        String str = "\u0003SYAX\u0016G\u0016_R\u0011NXI^\fL\u0016_R\u0016YO\rE\u0007ZCHD\u0016\u000b";
        Object obj = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i = 0;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i2 = 0; length > i2; i2++) {
                int i3;
                char c = cArr[i2];
                switch (i2 % 5) {
                    case v.m /*0*/:
                        i3 = 98;
                        break;
                    case at.g /*1*/:
                        i3 = 43;
                        break;
                    case at.i /*2*/:
                        i3 = 54;
                        break;
                    case at.o /*3*/:
                        i3 = 45;
                        break;
                    default:
                        i3 = 55;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "BMY_\u0017";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "\u0003SYAX\u0016G\u0016_R\u0011NXI^\fL\u0016]E\u0007@STD";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "BYSNR\u000b]SI\u0017\u0003_\u0016Y^\u000fN\u0016";
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "B\\_Y_B";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    adi(auh com_whatsapp_auh, byte[] bArr, int i, bz[] bzVarArr, bz bzVar, boolean z) {
        this.c = com_whatsapp_auh;
        this.e = bArr;
        this.b = i;
        this.f = bzVarArr;
        this.d = bzVar;
        this.a = z;
    }

    public void run() {
        byte[] c = aw.c(this.b);
        if (this.a) {
            Log.i(z[3]);
            App.a(this.e, c, (byte) 5, this.f, this.d);
        }
        Log.i(z[0] + this.c.b + z[2] + this.c.a + z[1] + this.b + z[4] + this.c.e);
        co coVar = new co(this.c.a);
        coVar.b = this.c.e;
        App.a(coVar, this.c.b, c, null);
    }
}
