package com.whatsapp;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import org.v;
import org.whispersystems.at;

class anb implements OnClickListener {
    private static final String z;
    final ListChatInfo a;

    static {
        char[] toCharArray = "\u0000S^".toCharArray();
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
                    i2 = 58;
                    break;
                case at.i /*2*/:
                    i2 = 58;
                    break;
                case at.o /*3*/:
                    i2 = 63;
                    break;
                default:
                    i2 = 1;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    anb(ListChatInfo listChatInfo) {
        this.a = listChatInfo;
    }

    public void onClick(View view) {
        this.a.startActivity(new Intent(this.a, StarredMessagesActivity.class).putExtra(z, ListChatInfo.f(this.a).p));
    }
}
