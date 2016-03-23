package com.whatsapp;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;
import org.v;
import org.whispersystems.at;

class a22 implements OnClickListener {
    private static final String[] z;
    final CorruptInstallationActivity a;

    static {
        String[] strArr = new String[2];
        String str = "|o\u001cXGteVCFid\u0016^\u0006|b\fCGs/<odXU=";
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
                        i3 = 29;
                        break;
                    case at.g /*1*/:
                        i3 = 1;
                        break;
                    case at.i /*2*/:
                        i3 = 120;
                        break;
                    case at.o /*3*/:
                        i3 = 42;
                        break;
                    default:
                        i3 = 40;
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
                    str = "m`\u001bAIzdBIGp/\u000fBIir\u0019ZX";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
            }
        }
    }

    public void onClick(View view) {
        this.a.startActivity(new Intent(z[0], Uri.parse(z[1])));
    }

    a22(CorruptInstallationActivity corruptInstallationActivity) {
        this.a = corruptInstallationActivity;
    }
}
