package com.whatsapp;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class n7 implements AnimationListener {
    private static final String z;
    final Conversation a;
    final boolean b;
    final View c;

    static {
        char[] toCharArray = "\u0017\u0012qWq\u0006\u000e~U}\u001b\u00130I}\u0010\u0018sHz\u001f\rmDb\u001d\u0018h\u000eq\u001a\u0019".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 116;
                    break;
                case at.g /*1*/:
                    i2 = 125;
                    break;
                case at.i /*2*/:
                    i2 = 31;
                    break;
                case at.o /*3*/:
                    i2 = 33;
                    break;
                default:
                    i2 = 20;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
    }

    n7(Conversation conversation, View view, boolean z) {
        this.a = conversation;
        this.c = view;
        this.b = z;
    }

    public void onAnimationEnd(Animation animation) {
        Log.i(z);
        Conversation.w(this.a).setVisibility(8);
        this.c.getViewTreeObserver().addOnGlobalLayoutListener(new k_(this));
        Conversation.n(this.a).setClipChildren(true);
    }
}
