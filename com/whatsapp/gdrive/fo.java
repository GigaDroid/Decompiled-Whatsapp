package com.whatsapp.gdrive;

import android.os.Bundle;
import com.whatsapp.arj;
import org.v;
import org.whispersystems.at;

class fo implements Runnable {
    private static final String[] z;
    final GoogleDriveActivity a;
    final Bundle b;

    static {
        String[] strArr = new String[2];
        String str = "2v\bpe\u0000w\u0003nj3|\r}[,z\u0016|";
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
                        i3 = 95;
                        break;
                    case at.g /*1*/:
                        i3 = 19;
                        break;
                    case at.i /*2*/:
                        i3 = arj.Theme_spinnerStyle;
                        break;
                    case at.o /*3*/:
                        i3 = 25;
                        break;
                    default:
                        i3 = 4;
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
                    str = "+|\u0018xh\u0000w\u0003nj3|\r}[,z\u0016|";
                    obj = null;
            }
        }
    }

    public void run() {
        GoogleDriveActivity.a(this.a, this.b.getLong(z[1], -1), this.b.getLong(z[0], -1));
    }

    fo(GoogleDriveActivity googleDriveActivity, Bundle bundle) {
        this.a = googleDriveActivity;
        this.b = bundle;
    }
}
