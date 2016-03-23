package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class wc implements OnClickListener {
    private static final String z;
    final OverlayAlert a;

    static {
        char[] toCharArray = "\u0005$\u00187p\u000b+R7y\u00187\u001a,o\u001e7\u000fj\u007f\u0006;\u001e.y\u000e".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = arj.Theme_ratingBarStyle;
                    break;
                case at.g /*1*/:
                    i2 = 82;
                    break;
                case at.i /*2*/:
                    i2 = 125;
                    break;
                case at.o /*3*/:
                    i2 = 69;
                    break;
                default:
                    i2 = 28;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void onClick(View view) {
        Log.i(z);
        OverlayAlert.a(this.a);
    }

    wc(OverlayAlert overlayAlert) {
        this.a = overlayAlert;
    }
}
