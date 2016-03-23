package com.whatsapp;

import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class az9 implements Runnable {
    private static final String z;
    final App a;

    static {
        char[] toCharArray = "<\u001cp\u0011\u0000)\u00175X\u0018l\u0000zEK5\u000ba\u0011\u0018)\u0000a\u0011\u001f#NfT\u0019:\u000bg\nK?\r}T\u000f9\u0002|_\fl\u001egTK'\u000bl\u0011\u0018)\u0000qX\u0005+".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 76;
                    break;
                case at.g /*1*/:
                    i2 = 110;
                    break;
                case at.i /*2*/:
                    i2 = 21;
                    break;
                case at.o /*3*/:
                    i2 = 49;
                    break;
                default:
                    i2 = arj.Theme_seekBarStyle;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    az9(App app) {
        this.a = app;
    }

    public void run() {
        awc a = awc.a(App.a(this.a));
        if (a.h()) {
            Log.i(z);
            App.aQ().post(new as2(this, a.f(), a.a(), a.g(), a.i().b()));
        }
    }
}
