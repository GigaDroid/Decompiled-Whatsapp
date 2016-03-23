package com.whatsapp;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;
import com.whatsapp.fieldstats.cd;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class aud implements OnClickListener {
    private static final String[] z;
    final at4 a;
    final ContactInfo b;

    static {
        String[] strArr = new String[3];
        String str = "+>\tFf#4C]g>5\u0003@'+3\u0019]f$~)}H\u0006";
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
                        i3 = 74;
                        break;
                    case at.g /*1*/:
                        i3 = 80;
                        break;
                    case at.i /*2*/:
                        i3 = arj.Theme_switchStyle;
                        break;
                    case at.o /*3*/:
                        i3 = 52;
                        break;
                    default:
                        i3 = 9;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    strArr2 = strArr3;
                    str = ")?\u0003@h)$2]g,?BP`+<MP`+<\bF)+ \u001d\u0014g%$MRf?>\t";
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = ">5\u0001\u000e";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void onClick(View view) {
        try {
            if (at4.a(this.a) != null) {
                App.a(at4.a(this.a), this.b, cd.CONTACT_INFO, true);
                if (!DialogToastActivity.f) {
                    return;
                }
            }
            try {
                this.b.startActivity(new Intent(z[0], Uri.parse(z[1] + at4.d(this.a))));
            } catch (ActivityNotFoundException e) {
                Log.w(z[2]);
                App.aR();
            }
        } catch (ActivityNotFoundException e2) {
            throw e2;
        }
    }

    aud(ContactInfo contactInfo, at4 com_whatsapp_at4) {
        this.b = contactInfo;
        this.a = com_whatsapp_at4;
    }
}
