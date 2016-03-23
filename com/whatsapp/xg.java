package com.whatsapp;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;
import org.v;
import org.whispersystems.at;

class xg implements OnClickListener {
    private static final String[] z;
    final CorruptInstallationActivity a;

    static {
        String[] strArr = new String[2];
        String str = "\u001ej0@K\u00071m\u0004J\u0016\u007f#BB\u00004+O\u0013\u0010d/\u0005Y\u001bj6XO\u0003{";
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
                        i3 = 115;
                        break;
                    case at.g /*1*/:
                        i3 = 11;
                        break;
                    case at.i /*2*/:
                        i3 = 66;
                        break;
                    case at.o /*3*/:
                        i3 = 43;
                        break;
                    default:
                        i3 = 46;
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
                    str = "\u0012e&YA\u001aolB@\u0007n,_\u0000\u0012h6BA\u001d%\u0014bk$";
                    obj = null;
            }
        }
    }

    public void onClick(View view) {
        this.a.startActivity(new Intent(z[1], Uri.parse(z[0])));
    }

    xg(CorruptInstallationActivity corruptInstallationActivity) {
        this.a = corruptInstallationActivity;
    }
}
