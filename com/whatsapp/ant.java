package com.whatsapp;

import android.preference.Preference;
import org.v;
import org.whispersystems.at;

class ant implements Runnable {
    private static final String z;
    final ea a;

    static {
        char[] toCharArray = "<Ro\t&>Sm%3#B`\u0013$4~i\u0016>\u000eB`\u001b&\"".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 81;
                    break;
                case at.g /*1*/:
                    i2 = 33;
                    break;
                case at.i /*2*/:
                    i2 = 8;
                    break;
                case at.o /*3*/:
                    i2 = 122;
                    break;
                default:
                    i2 = 82;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    ant(ea eaVar) {
        this.a = eaVar;
    }

    public void run() {
        this.a.a.b.e();
        Preference findPreference = this.a.a.b.findPreference(z);
        int i = (qa.d() > 0 || qa.e() == 0) ? 2131230816 : 2131232173;
        findPreference.setTitle(i);
    }
}
