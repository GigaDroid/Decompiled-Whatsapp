package com.whatsapp;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import org.v;
import org.whispersystems.at;

class il implements OnClickListener {
    private static final String z;
    final ContactInfo a;

    static {
        char[] toCharArray = "o4L".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 5;
                    break;
                case at.g /*1*/:
                    i2 = 93;
                    break;
                case at.i /*2*/:
                    i2 = 40;
                    break;
                case at.o /*3*/:
                    i2 = 33;
                    break;
                default:
                    i2 = 41;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void onClick(View view) {
        this.a.startActivityForResult(new Intent(this.a.getBaseContext(), SettingsJidNotificationActivity.class).putExtra(z, ContactInfo.h(this.a).p), 15);
    }

    il(ContactInfo contactInfo) {
        this.a = contactInfo;
    }
}
