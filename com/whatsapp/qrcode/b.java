package com.whatsapp.qrcode;

import com.whatsapp.App;
import com.whatsapp.arj;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class b implements h {
    private static final String z;
    final QrCodeActivity a;

    static {
        char[] toCharArray = ";\u001a!\u001b\u0019#\u001e)\f\u0014e\u00182\u001d\u001b#\r7\n\b+\f9".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 74;
                    break;
                case at.g /*1*/:
                    i2 = arj.Theme_editTextStyle;
                    break;
                case at.i /*2*/:
                    i2 = 64;
                    break;
                case at.o /*3*/:
                    i2 = 120;
                    break;
                default:
                    i2 = arj.Theme_switchStyle;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void a() {
        App.a(this.a, 2131230894, 1);
        this.a.finish();
    }

    b(QrCodeActivity qrCodeActivity) {
        this.a = qrCodeActivity;
    }

    public void b() {
        Log.i(z);
        QrCodeActivity.a(this.a, true);
        if (!QrCodeActivity.a(this.a)) {
            QrCodeActivity.g(this.a).b().setOneShotPreviewCallback(QrCodeActivity.c(this.a));
        }
    }
}
