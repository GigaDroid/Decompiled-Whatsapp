package com.whatsapp;

import com.whatsapp.protocol.ay;
import org.v;
import org.whispersystems.at;

class aor implements ay {
    private static final String z;
    final String a;
    final String b;
    final kd c;

    static {
        char[] toCharArray = "=\u001au0C\u001c\u001d(&[\rG5\"_".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 125;
                    break;
                case at.g /*1*/:
                    i2 = arj.Theme_radioButtonStyle;
                    break;
                case at.i /*2*/:
                    i2 = 91;
                    break;
                case at.o /*3*/:
                    i2 = 71;
                    break;
                default:
                    i2 = 43;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void a(String str) {
        wn.a(this.b, 200);
        App.v = this.a;
        App.y(App.ad() + z);
    }

    aor(kd kdVar, String str, String str2) {
        this.c = kdVar;
        this.b = str;
        this.a = str2;
    }
}
