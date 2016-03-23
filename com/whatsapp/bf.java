package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class bf implements OnClickListener {
    private static final String z;
    final RegisterName a;

    static {
        char[] toCharArray = "z{4N}|{!Ioe{|Dba}8Bj".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 8;
                    break;
                case at.g /*1*/:
                    i2 = 30;
                    break;
                case at.i /*2*/:
                    i2 = 83;
                    break;
                case at.o /*3*/:
                    i2 = 39;
                    break;
                default:
                    i2 = 14;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    bf(RegisterName registerName) {
        this.a = registerName;
    }

    public void onClick(View view) {
        Log.i(z);
        RegisterName.j(this.a);
    }
}
