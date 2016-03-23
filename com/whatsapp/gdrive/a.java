package com.whatsapp.gdrive;

import android.view.View;
import android.view.View.OnClickListener;
import com.whatsapp.arj;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class a implements OnClickListener {
    private static final String z;
    final GoogleDriveActivity a;

    static {
        char[] toCharArray = "\u0000\u0015^\u0011\u0006\u0002\\M\u001b\u0004\u000e\u0007E\f\tH\u0002D\u0017\u0007J\u0002G\u0011\u0000J\u0016H\n\u0019\u0011\u0014\u0001\n\u0015\u0014\u0005C\n\u0015J\u0015E\u0019\u001c\b\u0016".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = arj.Theme_checkedTextViewStyle;
                    break;
                case at.g /*1*/:
                    i2 = 113;
                    break;
                case at.i /*2*/:
                    i2 = 44;
                    break;
                case at.o /*3*/:
                    i2 = 120;
                    break;
                default:
                    i2 = 112;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void onClick(View view) {
        Log.i(z);
        GoogleDriveActivity.a(this.a, 11);
    }

    a(GoogleDriveActivity googleDriveActivity) {
        this.a = googleDriveActivity;
    }
}
