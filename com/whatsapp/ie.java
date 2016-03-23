package com.whatsapp;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import org.v;
import org.whispersystems.at;

class ie implements OnClickListener {
    private static final String z;
    final InsufficientStorageSpaceActivity a;

    static {
        char[] toCharArray = ",S\u000f_c$YE^i9I\u0002Ck>\u0013\"cX\bo%l@\u0012n?b^\fz.r_\bi?dB\nn".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 77;
                    break;
                case at.g /*1*/:
                    i2 = 61;
                    break;
                case at.i /*2*/:
                    i2 = arj.Theme_seekBarStyle;
                    break;
                case at.o /*3*/:
                    i2 = 45;
                    break;
                default:
                    i2 = 12;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    ie(InsufficientStorageSpaceActivity insufficientStorageSpaceActivity) {
        this.a = insufficientStorageSpaceActivity;
    }

    public void onClick(View view) {
        this.a.startActivity(new Intent(z));
    }
}
