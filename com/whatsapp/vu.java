package com.whatsapp;

import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class vu implements Runnable {
    private static final String z;
    final ga a;

    static {
        char[] toCharArray = "mC|\b\u000e|_s\n\u0002aBaS\fj^{\b\u000e#Cp\r\u000e|Zw\fD}IfS\u0006k_a\u001f\fk\u0003a\u0016\u0004y\u0001v\u001b\u001fk^\u007f\u0017\u0005oXw".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 14;
                    break;
                case at.g /*1*/:
                    i2 = 44;
                    break;
                case at.i /*2*/:
                    i2 = 18;
                    break;
                case at.o /*3*/:
                    i2 = 126;
                    break;
                default:
                    i2 = arj.Theme_seekBarStyle;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    vu(ga gaVar) {
        this.a = gaVar;
    }

    public void run() {
        Log.i(z);
        ConversationsFragment.i(this.a.e).setVisibility(0);
        ConversationsFragment.i(this.a.e).setIndeterminate(false);
    }
}
