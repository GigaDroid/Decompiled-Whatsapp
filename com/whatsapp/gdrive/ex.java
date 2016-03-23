package com.whatsapp.gdrive;

import android.view.View;
import android.view.View.OnClickListener;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class ex implements OnClickListener {
    private static final String z;
    final GoogleDriveActivity a;

    static {
        char[] toCharArray = "l_\u0006qAn\u0016\u0015{CbM\u001dlN$H\u001cw@&W\u001b{Vg\u0016\u0006}D\u007fT\u0006}\u001axP\u001dh\u001aoR\u0015tXl".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 11;
                    break;
                case at.g /*1*/:
                    i2 = 59;
                    break;
                case at.i /*2*/:
                    i2 = 116;
                    break;
                case at.o /*3*/:
                    i2 = 24;
                    break;
                default:
                    i2 = 55;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    ex(GoogleDriveActivity googleDriveActivity) {
        this.a = googleDriveActivity;
    }

    public void onClick(View view) {
        Log.i(z);
        GoogleDriveActivity.a(this.a, 10);
    }
}
