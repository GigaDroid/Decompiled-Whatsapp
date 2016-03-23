package com.whatsapp;

import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class sp implements OnGlobalLayoutListener {
    private static final String z;
    final Conversation a;
    int b;
    Runnable c;

    static {
        char[] toCharArray = "C?\u001aI\u001aR#\u0015K\u0016O>[\\\u0010N$\u0015\\\u000b\u007f8\u001bS\u001bE\"[H\u0016D$\u001c\u0005".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 32;
                    break;
                case at.g /*1*/:
                    i2 = 80;
                    break;
                case at.i /*2*/:
                    i2 = 116;
                    break;
                case at.o /*3*/:
                    i2 = 63;
                    break;
                default:
                    i2 = 127;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void onGlobalLayout() {
        int width = Conversation.aq(this.a).getWidth();
        if (width != this.b) {
            this.b = width;
            Log.i(z + width);
            App.p.M().removeCallbacks(this.c);
            App.p.M().post(this.c);
        }
    }

    sp(Conversation conversation) {
        this.a = conversation;
        this.c = new h6(this);
    }
}
