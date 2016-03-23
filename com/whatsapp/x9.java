package com.whatsapp;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import org.v;
import org.whispersystems.at;

final class x9 implements OnClickListener {
    private static final String z;
    final Context a;

    static {
        char[] toCharArray = "^g3I.VmyH$K}>U&L'\u001eu\u0015z[\u0019z\r`Z\u0003t\u0013~N\u0012d\u0012z]\u0003r\u000fxZ".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 63;
                    break;
                case at.g /*1*/:
                    i2 = 9;
                    break;
                case at.i /*2*/:
                    i2 = 87;
                    break;
                case at.o /*3*/:
                    i2 = 59;
                    break;
                default:
                    i2 = 65;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    x9(Context context) {
        this.a = context;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.startActivity(new Intent(z));
    }
}
