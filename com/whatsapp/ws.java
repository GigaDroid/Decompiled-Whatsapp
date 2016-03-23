package com.whatsapp;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;
import org.v;
import org.whispersystems.at;

class ws implements OnClickListener {
    private static final String z;
    final VoipNotAllowedActivity a;
    final String b;

    static {
        char[] toCharArray = "SiIY,[c\u0003B-FbC_mSdYB,\\){b\u0006e".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 50;
                    break;
                case at.g /*1*/:
                    i2 = 7;
                    break;
                case at.i /*2*/:
                    i2 = 45;
                    break;
                case at.o /*3*/:
                    i2 = 43;
                    break;
                default:
                    i2 = 67;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    ws(VoipNotAllowedActivity voipNotAllowedActivity, String str) {
        this.a = voipNotAllowedActivity;
        this.b = str;
    }

    public void onClick(View view) {
        this.a.finish();
        this.a.startActivity(new Intent(z, Uri.parse(this.b)));
    }
}
