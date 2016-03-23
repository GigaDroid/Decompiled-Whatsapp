package com.whatsapp;

import android.os.Bundle;
import android.os.Parcelable;
import com.whatsapp.util.undobar.d;
import org.v;
import org.whispersystems.at;

class wj implements Runnable {
    private static final String z;
    final amj a;

    static {
        char[] toCharArray = "+\u0000{".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 65;
                    break;
                case at.g /*1*/:
                    i2 = arj.Theme_radioButtonStyle;
                    break;
                case at.i /*2*/:
                    i2 = 31;
                    break;
                case at.o /*3*/:
                    i2 = 96;
                    break;
                default:
                    i2 = 32;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void run() {
        App.aK.c(ConversationsFragment.q(this.a.a), true);
        Parcelable bundle = new Bundle();
        bundle.putString(z, ConversationsFragment.q(this.a.a));
        new d(this.a.a.getActivity()).a(2131230980).a(new oq(this)).a(bundle).a();
        ConversationsFragment.l(this.a.a).getViewTreeObserver().addOnGlobalLayoutListener(new arg(this));
    }

    wj(amj com_whatsapp_amj) {
        this.a = com_whatsapp_amj;
    }
}
