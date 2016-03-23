package com.whatsapp;

import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

final class ip implements Runnable {
    private static final String z;
    final axy a;
    private final boolean b;

    static {
        char[] toCharArray = "s'~l=u<zs?0+rp=r)pwqv'a<>~\u000fvh\u0001b-Xy(^'}yk0".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 16;
                    break;
                case at.g /*1*/:
                    i2 = 72;
                    break;
                case at.i /*2*/:
                    i2 = 19;
                    break;
                case at.o /*3*/:
                    i2 = 28;
                    break;
                default:
                    i2 = 81;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void run() {
        Log.i(z + this.b);
        i1.b(this.a.b).aW.remove(this.a.a);
        if (this.b) {
            App.aM();
        }
    }

    ip(axy com_whatsapp_axy, boolean z) {
        this.a = com_whatsapp_axy;
        this.b = z;
    }
}
