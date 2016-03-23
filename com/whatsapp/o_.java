package com.whatsapp;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class o_ implements OnClickListener {
    private static final String z;
    final DeleteAccount a;

    static {
        char[] toCharArray = "CdhP\rB,eV\u001aHtjAVDie[\u001eBoqX\u001bBs".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 39;
                    break;
                case at.g /*1*/:
                    i2 = 1;
                    break;
                case at.i /*2*/:
                    i2 = 4;
                    break;
                case at.o /*3*/:
                    i2 = 53;
                    break;
                default:
                    i2 = 121;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void onClick(View view) {
        Log.i(z);
        this.a.startActivity(new Intent(this.a, ChangeNumberOverview.class));
    }

    o_(DeleteAccount deleteAccount) {
        this.a = deleteAccount;
    }
}
