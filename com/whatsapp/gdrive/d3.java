package com.whatsapp.gdrive;

import com.whatsapp.App;
import com.whatsapp.arj;
import com.whatsapp.dg;
import com.whatsapp.util.Log;
import com.whatsapp.util.l;
import java.io.File;
import java.io.IOException;
import org.v;
import org.whispersystems.at;

class d3 implements Runnable {
    private static final String z;
    final String a;
    final GoogleDriveActivity b;

    static {
        char[] toCharArray = "~\r><f|D-6dp\u001f%!i6\u001a$:g4\u001b)&dv\u001b)x`x\u0007)9=\u007f\u0006>x|v\n-9={\b/>ei".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 25;
                    break;
                case at.g /*1*/:
                    i2 = arj.Theme_radioButtonStyle;
                    break;
                case at.i /*2*/:
                    i2 = 76;
                    break;
                case at.o /*3*/:
                    i2 = 85;
                    break;
                default:
                    i2 = 16;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    d3(GoogleDriveActivity googleDriveActivity, String str) {
        this.b = googleDriveActivity;
        this.a = str;
    }

    public void run() {
        File t;
        try {
            t = App.aK.t();
        } catch (Throwable e) {
            Log.b(z, e);
            t = null;
        }
        try {
            this.b.runOnUiThread(new d7(this, l.a(this.b, (t != null ? t.length() : 0) + fn.b(dg.g()))));
        } catch (IOException e2) {
            throw e2;
        }
    }
}
