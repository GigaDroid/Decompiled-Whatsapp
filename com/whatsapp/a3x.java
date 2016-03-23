package com.whatsapp;

import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class a3x implements Runnable {
    private static final String z;
    final awe a;

    static {
        char[] toCharArray = "\u0015\u001d)\u0018)\r\b!\u001e)\u001cW9\u0018%\u001d\u00178\u0005h".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 120;
                    break;
                case at.g /*1*/:
                    i2 = 120;
                    break;
                case at.i /*2*/:
                    i2 = 77;
                    break;
                case at.o /*3*/:
                    i2 = 113;
                    break;
                default:
                    i2 = 72;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    a3x(awe com_whatsapp_awe) {
        this.a = com_whatsapp_awe;
    }

    public void run() {
        Log.i(z + this.a.a.p.k);
        this.a.a.cancel(true);
    }
}
