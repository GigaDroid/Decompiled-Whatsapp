package com.whatsapp;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import org.v;
import org.whispersystems.at;

class b implements OnClickListener {
    private static final String z;
    final aif a;

    static {
        char[] toCharArray = "t)b')|#(<(a\"h!ht$r<){iP\u001c\u0003B".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 21;
                    break;
                case at.g /*1*/:
                    i2 = 71;
                    break;
                case at.i /*2*/:
                    i2 = 6;
                    break;
                case at.o /*3*/:
                    i2 = 85;
                    break;
                default:
                    i2 = 70;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    b(aif com_whatsapp_aif) {
        this.a = com_whatsapp_aif;
    }

    public void onClick(View view) {
        Intent intent = new Intent(z);
        intent.setData(auc.g());
        this.a.c.startActivity(intent);
        this.a.c.finish();
    }
}
