package com.whatsapp.gdrive;

import android.view.View;
import android.view.View.OnClickListener;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class dd implements OnClickListener {
    private static final String z;
    final GoogleDriveActivity a;

    static {
        char[] toCharArray = "ZX&^\u0002X\u00115T\u0000TJ=C\r\u0012O<X\u0003\u0010O?^\u0004\u0010[0E\u001dKYyE\u0011NH;E\u0011\u0010X=V\u0018R[".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 61;
                    break;
                case at.g /*1*/:
                    i2 = 60;
                    break;
                case at.i /*2*/:
                    i2 = 84;
                    break;
                case at.o /*3*/:
                    i2 = 55;
                    break;
                default:
                    i2 = 116;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    dd(GoogleDriveActivity googleDriveActivity) {
        this.a = googleDriveActivity;
    }

    public void onClick(View view) {
        Log.i(z);
        GoogleDriveActivity.a(this.a, 11);
    }
}
