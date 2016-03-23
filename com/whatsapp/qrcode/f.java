package com.whatsapp.qrcode;

import android.os.Vibrator;
import com.whatsapp.App;
import com.whatsapp.nh;
import com.whatsapp.wn;
import org.v;
import org.whispersystems.at;

class f implements nh {
    private static final String[] z;
    final QrCodeActivity a;

    static {
        String[] strArr = new String[2];
        String str = "3\u0011\fPT1\u0017\u001c";
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
                        i3 = 69;
                        break;
                    case at.g /*1*/:
                        i3 = 120;
                        break;
                    case at.i /*2*/:
                        i3 = 110;
                        break;
                    case at.o /*3*/:
                        i3 = 34;
                        break;
                    default:
                        i3 = 53;
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
                    str = "2\u001d\f\fB-\u0019\u001aQT5\b@AZ(";
                    obj = null;
            }
        }
    }

    public void a() {
        if (wn.d(QrCodeActivity.h(this.a))) {
            ((Vibrator) this.a.getSystemService(z[0])).vibrate(75);
            this.a.finish();
        }
    }

    f(QrCodeActivity qrCodeActivity) {
        this.a = qrCodeActivity;
    }

    public void a(int i) {
        if (i == 403) {
            QrCodeActivity.f(this.a);
            if (!QrCodeView.g) {
                return;
            }
        }
        App.b(this.a.getBaseContext(), this.a.getString(2131231381, new Object[]{z[1]}), 1);
        this.a.finish();
    }
}
