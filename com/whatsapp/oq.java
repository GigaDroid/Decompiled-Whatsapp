package com.whatsapp;

import android.os.Bundle;
import android.os.Parcelable;
import com.whatsapp.util.undobar.c;
import org.v;
import org.whispersystems.at;

class oq implements c {
    private static final String z;
    final wj a;

    static {
        char[] toCharArray = "9,W".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 83;
                    break;
                case at.g /*1*/:
                    i2 = 69;
                    break;
                case at.i /*2*/:
                    i2 = 51;
                    break;
                case at.o /*3*/:
                    i2 = 45;
                    break;
                default:
                    i2 = 59;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    oq(wj wjVar) {
        this.a = wjVar;
    }

    public void b(Parcelable parcelable) {
        if (parcelable != null) {
            String string = ((Bundle) parcelable).getString(z);
            ConversationsFragment.a(this.a.a.a, string);
            App.aK.c(string, false);
        }
    }
}
