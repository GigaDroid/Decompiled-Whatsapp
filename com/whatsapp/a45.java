package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import org.v;
import org.whispersystems.at;

class a45 implements OnClickListener {
    private static final String[] z;
    final Main a;

    static {
        String[] strArr = new String[2];
        String str = "0_,iK2N(lM?\u0000*kF\u007fN2aP>F8+R0L7dE4\u0002=wA9F*`";
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
                        i3 = 81;
                        break;
                    case at.g /*1*/:
                        i3 = 47;
                        break;
                    case at.i /*2*/:
                        i3 = 92;
                        break;
                    case at.o /*3*/:
                        i3 = 5;
                        break;
                    default:
                        i3 = 34;
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
                    str = "0A8wM8KrlL%J2q\f0L(lM?\u0001\nLg\u0006";
                    obj = null;
            }
        }
    }

    a45(Main main) {
        this.a = main;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Intent intent = new Intent(z[1]);
        intent.setDataAndType(Main.b(this.a), z[0]);
        this.a.startActivity(intent);
        this.a.removeDialog(0);
        this.a.finish();
    }
}
