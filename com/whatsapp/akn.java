package com.whatsapp;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import org.v;
import org.whispersystems.at;

class akn implements OnClickListener {
    private static final String z;
    final ListChatInfo a;

    static {
        char[] toCharArray = "5B\u001b".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 95;
                    break;
                case at.g /*1*/:
                    i2 = 43;
                    break;
                case at.i /*2*/:
                    i2 = 127;
                    break;
                case at.o /*3*/:
                    i2 = 42;
                    break;
                default:
                    i2 = 12;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void onClick(View view) {
        Intent intent = new Intent(this.a, MediaGallery.class);
        intent.putExtra(z, ListChatInfo.f(this.a).p);
        this.a.startActivity(intent);
    }

    akn(ListChatInfo listChatInfo) {
        this.a = listChatInfo;
    }
}
