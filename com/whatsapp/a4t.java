package com.whatsapp;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;
import org.v;
import org.whispersystems.at;

class a4t implements OnClickListener {
    private static final String[] z;
    final ai0 a;

    static {
        String[] strArr = new String[2];
        String str = "[B\u000bRR\t\u0019P@M\\QQUIRB\fCQC\u0018\u001cML\u001cW\u001bQ";
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
                        i3 = 51;
                        break;
                    case at.g /*1*/:
                        i3 = 54;
                        break;
                    case at.i /*2*/:
                        i3 = 127;
                        break;
                    case at.o /*3*/:
                        i3 = 34;
                        break;
                    default:
                        i3 = 33;
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
                    str = "RX\u001bPNZRQKOGS\u0011V\u000fRU\u000bKN]\u0018)kdd";
                    obj = null;
            }
        }
    }

    public void onClick(View view) {
        this.a.d.startActivity(new Intent(z[1], Uri.parse(z[0])));
    }

    a4t(ai0 com_whatsapp_ai0) {
        this.a = com_whatsapp_ai0;
    }
}
