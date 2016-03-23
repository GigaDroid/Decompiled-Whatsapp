package com.whatsapp;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import org.v;
import org.whispersystems.at;

class u4 implements OnClickListener {
    private static final String z;
    final ContactInfo a;

    static {
        char[] toCharArray = ":|]".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 80;
                    break;
                case at.g /*1*/:
                    i2 = 21;
                    break;
                case at.i /*2*/:
                    i2 = 57;
                    break;
                case at.o /*3*/:
                    i2 = 16;
                    break;
                default:
                    i2 = 8;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    u4(ContactInfo contactInfo) {
        this.a = contactInfo;
    }

    public void onClick(View view) {
        Intent intent = new Intent(this.a, MediaGallery.class);
        intent.putExtra(z, ContactInfo.h(this.a).p);
        this.a.startActivity(intent);
    }
}
