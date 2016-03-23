package com.whatsapp;

import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class aid implements Runnable {
    private static final String z;
    final Runnable a;
    final azf b;
    final Runnable c;

    static {
        char[] toCharArray = "\u001er\u007f;=\u001cs}g;\u0016b}!?\u0016e7:,\u0010dq>,\u0017.}:;\u001cs8".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 115;
                    break;
                case at.g /*1*/:
                    i2 = 1;
                    break;
                case at.i /*2*/:
                    i2 = 24;
                    break;
                case at.o /*3*/:
                    i2 = 72;
                    break;
                default:
                    i2 = 73;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void run() {
        boolean z = l5.s;
        for (a5o com_whatsapp_a5o : azf.a(this.b).values()) {
            if (com_whatsapp_a5o.a < 500) {
                if (z) {
                    break;
                }
            }
            Log.w(z + com_whatsapp_a5o.a);
            if (this.c != null) {
                this.c.run();
                return;
            }
            return;
        }
        if (this.a != null) {
            this.a.run();
        }
    }

    aid(azf com_whatsapp_azf, Runnable runnable, Runnable runnable2) {
        this.b = com_whatsapp_azf;
        this.c = runnable;
        this.a = runnable2;
    }
}
