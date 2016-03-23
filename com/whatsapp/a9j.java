package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import org.v;
import org.whispersystems.at;

class a9j implements OnClickListener {
    private static final String[] z;
    final VerifySms a;
    final int b;

    static {
        String[] strArr = new String[2];
        String str = "\u0002\u0005:\u0012\u0015\rM=V";
        Object obj = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i = 0;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i2 = 0; length > i2; i2++) {
                int i3;
                char c = cArr[i2];
                switch (i2 % 5) {
                    case v.m /*0*/:
                        i3 = 116;
                        break;
                    case at.g /*1*/:
                        i3 = 96;
                        break;
                    case at.i /*2*/:
                        i3 = 72;
                        break;
                    case at.o /*3*/:
                        i3 = 123;
                        break;
                    default:
                        i3 = 115;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    i = 1;
                    strArr2 = strArr3;
                    str = "\u0002\u0005:\u0012\u0015\rM*\u000b";
                    obj = null;
            }
        }
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(this.b);
        this.a.a(this.b == 26 ? z[0] : z[1]);
    }

    a9j(VerifySms verifySms, int i) {
        this.a = verifySms;
        this.b = i;
    }
}
