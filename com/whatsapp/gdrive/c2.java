package com.whatsapp.gdrive;

import android.view.View;
import android.view.View.OnClickListener;
import com.whatsapp.App;
import com.whatsapp.util.Log;
import java.util.Locale;
import org.v;
import org.whispersystems.at;

class c2 implements OnClickListener {
    private static final String z;
    final GoogleDriveActivity a;
    final int b;

    static {
        char[] toCharArray = "{\u0013>\u0013\u0017yZ-\u0019\u0015u\u0001%\u000e\u00183\u0013%\t\u0011p\u00165W\fo\u0010?\u000e\u000en\u0012a\u001e\u000ek\u0019 \u0015\u0000xZ)\b\u0013s\u0005c_\u0005<\u0011>\u001f\u0004<\u0004<\u001b\u0002yMi\u001e".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 28;
                    break;
                case at.g /*1*/:
                    i2 = 119;
                    break;
                case at.i /*2*/:
                    i2 = 76;
                    break;
                case at.o /*3*/:
                    i2 = 122;
                    break;
                default:
                    i2 = 97;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    c2(GoogleDriveActivity googleDriveActivity, int i) {
        this.a = googleDriveActivity;
        this.b = i;
    }

    public void onClick(View view) {
        long T = App.T();
        Log.i(String.format(Locale.ENGLISH, z, new Object[]{Integer.valueOf(this.b), Long.valueOf(T)}));
        if (T > 0) {
            GoogleDriveActivity.k(this.a).d(10);
            GoogleDriveActivity.v(this.a);
        }
    }
}
