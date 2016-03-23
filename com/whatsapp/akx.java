package com.whatsapp;

import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class akx implements Runnable {
    private static final String z;
    final ga a;

    static {
        char[] toCharArray = "n'\u0006P9\u007f;\tR5b&\u001b\u000b;i:\u0001P9 '\nU9\u007f>\rTs~-\u001c\u000b1h;\u001bG;hg\u001bN3ze\u0006I(e!\u0006A".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 13;
                    break;
                case at.g /*1*/:
                    i2 = 72;
                    break;
                case at.i /*2*/:
                    i2 = arj.Theme_editTextStyle;
                    break;
                case at.o /*3*/:
                    i2 = 38;
                    break;
                default:
                    i2 = 92;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void run() {
        Log.i(z);
        ConversationsFragment.i(this.a.e).setVisibility(8);
        ConversationsFragment.c(this.a.e).setImageResource(2130839476);
    }

    akx(ga gaVar) {
        this.a = gaVar;
    }
}
