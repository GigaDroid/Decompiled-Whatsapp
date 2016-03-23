package com.whatsapp.notification;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;
import com.whatsapp.App;
import org.v;
import org.whispersystems.at;

class t implements OnClickListener {
    private static final String[] z;
    final String a;
    final PopupNotification b;

    static {
        String[] strArr = new String[2];
        String str = "}\u001bv\u001c}u\u0011<\u0007|h\u0010|\u001a<}\u0016f\u0007}r[D'WK";
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
                        i3 = 28;
                        break;
                    case at.g /*1*/:
                        i3 = 117;
                        break;
                    case at.i /*2*/:
                        i3 = 18;
                        break;
                    case at.o /*3*/:
                        i3 = 110;
                        break;
                    default:
                        i3 = 18;
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
                    str = "t\u0001f\u001e(3Z";
                    obj = null;
            }
        }
    }

    public void onClick(View view) {
        Uri parse = Uri.parse(this.a);
        if (parse.getScheme() == null) {
            parse = Uri.parse(z[1] + this.a);
        }
        try {
            this.b.startActivity(new Intent(z[0], parse));
        } catch (ActivityNotFoundException e) {
            App.a(App.z().getApplicationContext(), 2131230782, 0);
        }
    }

    t(PopupNotification popupNotification, String str) {
        this.b = popupNotification;
        this.a = str;
    }
}
