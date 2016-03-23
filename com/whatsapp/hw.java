package com.whatsapp;

import android.content.Intent;
import android.os.Process;
import android.view.View;
import android.view.View.OnClickListener;
import org.v;
import org.whispersystems.at;

class hw implements OnClickListener {
    private static final String z;
    final ai7 a;

    static {
        char[] toCharArray = "$d$H\u0004,nnI\u000e1~)T\f6$\u0004{?\u0000U\u0013\u007f?\u0011C\u000e}8".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 69;
                    break;
                case at.g /*1*/:
                    i2 = 10;
                    break;
                case at.i /*2*/:
                    i2 = 64;
                    break;
                case at.o /*3*/:
                    i2 = 58;
                    break;
                default:
                    i2 = arj.Theme_seekBarStyle;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    hw(ai7 com_whatsapp_ai7) {
        this.a = com_whatsapp_ai7;
    }

    public void onClick(View view) {
        this.a.c.startActivity(new Intent(z));
        this.a.c.finish();
        Process.killProcess(Process.myPid());
    }
}
