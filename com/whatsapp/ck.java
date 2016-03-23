package com.whatsapp;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class ck implements AnimationListener {
    private static final String z;
    final uu a;

    static {
        char[] toCharArray = "J7\u001fD^[+\u0010FRF6^ASF/\u001d[UB(\u0003WM@=\u0006\u001d^G<".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 41;
                    break;
                case at.g /*1*/:
                    i2 = 88;
                    break;
                case at.i /*2*/:
                    i2 = 113;
                    break;
                case at.o /*3*/:
                    i2 = 50;
                    break;
                default:
                    i2 = 59;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    ck(uu uuVar) {
        this.a = uuVar;
    }

    public void onAnimationStart(Animation animation) {
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationEnd(Animation animation) {
        Log.i(z);
        Conversation.n(this.a.b).setClipChildren(true);
        Conversation.d(this.a.b, 0);
    }
}
