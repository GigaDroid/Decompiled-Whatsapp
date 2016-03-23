package com.whatsapp;

import android.view.View;
import com.whatsapp.util.Log;
import com.whatsapp.util.ap;
import org.v;
import org.whispersystems.at;

class zs extends ap {
    private static final String[] z;
    final VoipActivity b;

    static {
        String[] strArr = new String[2];
        String str = "w \b=+t&%4#~\u001e\u001b#&s.%'7{-\u0013\";";
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
                        i3 = 26;
                        break;
                    case at.g /*1*/:
                        i3 = 65;
                        break;
                    case at.i /*2*/:
                        i3 = 122;
                        break;
                    case at.o /*3*/:
                        i3 = 86;
                        break;
                    default:
                        i3 = 66;
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
                    str = "l.\u0013&mw \b=+t&%4#~\u001e\u001b#&s.%'7{-\u0013\";";
                    obj = null;
            }
        }
    }

    public void a(View view) {
        if (App.am >= 3) {
            Log.i(z[1]);
            App.a(this.b, z[0], 0);
        }
    }

    zs(VoipActivity voipActivity) {
        this.b = voipActivity;
    }
}
