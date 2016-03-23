package com.whatsapp;

import android.view.View;
import android.view.View.OnLongClickListener;
import org.v;
import org.whispersystems.at;

class iv implements OnLongClickListener {
    private static final String[] z;
    final a_2 a;

    static {
        String[] strArr = new String[2];
        String str = "p\u0007sX8{\tj\u0005.c\u0018A\u0006=v\u000e{\u0004*}\u000b{\u0005";
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
                        i3 = 19;
                        break;
                    case at.g /*1*/:
                        i3 = arj.Theme_editTextStyle;
                        break;
                    case at.i /*2*/:
                        i3 = 30;
                        break;
                    case at.o /*3*/:
                        i3 = 118;
                        break;
                    default:
                        i3 = 79;
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
                    str = "`\u0003w\u0018\u0010v\u0005q\u001c&L\u001cw\u0006";
                    obj = null;
            }
        }
    }

    iv(a_2 com_whatsapp_a_2) {
        this.a = com_whatsapp_a_2;
    }

    public boolean onLongClick(View view) {
        App.z().getSharedPreferences(z[0], 0).edit().putInt(z[1], 3).commit();
        aol.a(this.a.b, (EmojiPicker$EmojiImageView) view);
        return false;
    }
}
