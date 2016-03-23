package com.whatsapp;

import com.whatsapp.util.Log;
import java.util.TimerTask;
import org.v;
import org.whispersystems.at;

class p5 extends TimerTask {
    private static final String z;
    anv a;

    static {
        char[] toCharArray = "=R}\b\r;[L\u001f\u001a+Bv\u001e\u000b\u0005Cz\u0000\u001a5BgB\u000b#GvW".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 90;
                    break;
                case at.g /*1*/:
                    i2 = 55;
                    break;
                case at.i /*2*/:
                    i2 = 19;
                    break;
                case at.o /*3*/:
                    i2 = arj.Theme_switchStyle;
                    break;
                default:
                    i2 = 127;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void run() {
        if (!this.a.h) {
            Log.i(z);
            this.a.j = true;
            App.p.M().post(anv.a(this.a));
            anv.g.remove(this.a.b);
        }
    }

    public p5(anv com_whatsapp_anv) {
        this.a = com_whatsapp_anv;
    }
}
