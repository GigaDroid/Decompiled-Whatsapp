package com.whatsapp;

import android.view.View;
import com.whatsapp.util.Log;
import com.whatsapp.util.ap;
import org.v;
import org.whispersystems.at;

class yl extends ap {
    private static final String z;
    final ConversationRowMedia b;

    static {
        char[] toCharArray = "eT\u0006pmr\u0015\fquhY\u0007\u007ff&X\rzkg\u0015\u0005{quT\u000f{\"q\\\u001cv\"hZHsgb\\\t>crA\t}jcQ".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 6;
                    break;
                case at.g /*1*/:
                    i2 = 53;
                    break;
                case at.i /*2*/:
                    i2 = arj.Theme_editTextStyle;
                    break;
                case at.o /*3*/:
                    i2 = 30;
                    break;
                default:
                    i2 = 2;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    yl(ConversationRowMedia conversationRowMedia) {
        this.b = conversationRowMedia;
    }

    public void a(View view) {
        if (this.b.e.q != null) {
            App.a((DialogToastActivity) this.b.getContext(), this.b.e);
            if (!DialogToastActivity.f) {
                return;
            }
        }
        Log.e(z);
        App.a(this.b.getContext(), 2131231379, 0);
    }
}
