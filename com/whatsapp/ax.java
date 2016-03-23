package com.whatsapp;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;
import org.v;
import org.whispersystems.at;

class ax implements OnClickListener {
    private static final String z;
    final ViewSharedContactActivity a;

    static {
        char[] toCharArray = "OMS*aGG\u00191`ZFY, O@C1a@\ra\u0011Ky".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 46;
                    break;
                case at.g /*1*/:
                    i2 = 35;
                    break;
                case at.i /*2*/:
                    i2 = 55;
                    break;
                case at.o /*3*/:
                    i2 = 88;
                    break;
                default:
                    i2 = 14;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    ax(ViewSharedContactActivity viewSharedContactActivity) {
        this.a = viewSharedContactActivity;
    }

    public void onClick(View view) {
        this.a.startActivity(new Intent(z, Uri.parse(view.getTag().toString())));
    }
}
