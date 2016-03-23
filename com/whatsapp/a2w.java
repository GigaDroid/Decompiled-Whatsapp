package com.whatsapp;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import org.v;
import org.whispersystems.at;

class a2w implements OnClickListener {
    private static final String z;
    final at4 a;
    final ContactInfo b;

    static {
        char[] toCharArray = "\\#\u000b".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 54;
                    break;
                case at.g /*1*/:
                    i2 = 74;
                    break;
                case at.i /*2*/:
                    i2 = 111;
                    break;
                case at.o /*3*/:
                    i2 = 44;
                    break;
                default:
                    i2 = 98;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void onClick(View view) {
        this.b.startActivity(new Intent(App.z().getApplicationContext(), Conversation.class).putExtra(z, at4.b(this.a)).addFlags(335544320));
    }

    a2w(ContactInfo contactInfo, at4 com_whatsapp_at4) {
        this.b = contactInfo;
        this.a = com_whatsapp_at4;
    }
}
