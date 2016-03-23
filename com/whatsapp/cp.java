package com.whatsapp;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import org.v;
import org.whispersystems.at;

class cp implements OnClickListener {
    private static final String z;
    final ContactInfo a;

    static {
        char[] toCharArray = "\u001e\u0007:".toCharArray();
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
                    i2 = 110;
                    break;
                case at.i /*2*/:
                    i2 = 94;
                    break;
                case at.o /*3*/:
                    i2 = 23;
                    break;
                default:
                    i2 = 20;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void onClick(View view) {
        this.a.startActivity(new Intent(App.z().getApplicationContext(), Conversation.class).putExtra(z, ContactInfo.h(this.a).p).addFlags(335544320));
    }

    cp(ContactInfo contactInfo) {
        this.a = contactInfo;
    }
}
