package com.whatsapp;

import android.text.TextUtils;
import org.v;
import org.whispersystems.at;

class _j implements Runnable {
    private static final String z;
    final ProfileInfoActivity a;
    final String b;

    static {
        char[] toCharArray = "d(\"\u0004-E/\u007f\u00125Tub\u00161".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 36;
                    break;
                case at.g /*1*/:
                    i2 = 91;
                    break;
                case at.i /*2*/:
                    i2 = 12;
                    break;
                case at.o /*3*/:
                    i2 = 115;
                    break;
                default:
                    i2 = 69;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    _j(ProfileInfoActivity profileInfoActivity, String str) {
        this.a = profileInfoActivity;
        this.b = str;
    }

    public void run() {
        if (TextUtils.equals(this.b, App.ad() + z)) {
            ProfileInfoActivity.a(this.a, App.v);
        }
    }
}
