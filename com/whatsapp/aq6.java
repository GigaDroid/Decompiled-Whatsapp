package com.whatsapp;

import com.whatsapp.fieldstats.a;
import com.whatsapp.fieldstats.i;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class aq6 implements Runnable {
    private static final String z;
    final u1 a;

    static {
        char[] toCharArray = "P\u001d\u001en'\\\r\u000eh\"R\u000f\u0014k)\\\u001cUs/P\u001d\u0015r2\u001d\u001f\u001fs2T\u0016\u001d')[\u001e\u0016n(XX\u0019h+M\u0014\u001fs#\u001d\u0015\u001bu-X\nZ".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 61;
                    break;
                case at.g /*1*/:
                    i2 = 120;
                    break;
                case at.i /*2*/:
                    i2 = 122;
                    break;
                case at.o /*3*/:
                    i2 = 7;
                    break;
                default:
                    i2 = 70;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void run() {
        if (u1.b(this.a)) {
            Log.w(z + u1.b(this.a));
            i.a(App.z(), a.MISSING_OFFLINE_MARKER_C, Integer.valueOf(1));
        }
    }

    aq6(u1 u1Var) {
        this.a = u1Var;
    }
}
