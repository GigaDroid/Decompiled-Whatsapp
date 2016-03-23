package com.whatsapp;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import org.v;
import org.whispersystems.at;

class adv implements OnClickListener {
    private static final String z;
    final ContactInfo a;

    static {
        char[] toCharArray = "_\u001bl".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 53;
                    break;
                case at.g /*1*/:
                    i2 = 114;
                    break;
                case at.i /*2*/:
                    i2 = 8;
                    break;
                case at.o /*3*/:
                    i2 = 44;
                    break;
                default:
                    i2 = 44;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    adv(ContactInfo contactInfo) {
        this.a = contactInfo;
    }

    public void onClick(View view) {
        this.a.startActivity(new Intent(this.a, StarredMessagesActivity.class).putExtra(z, ContactInfo.h(this.a).p));
    }
}
