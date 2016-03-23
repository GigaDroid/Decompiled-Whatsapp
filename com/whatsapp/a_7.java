package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class a_7 implements OnClickListener {
    private static final String[] z;
    final SmsDefaultAppWarning a;

    static {
        String[] strArr = new String[2];
        String str = "[\fuA\u007fN\u0000sInI\u0011vR{Z\u000foK}\u0007\u0013cV\u007f\\";
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
                        i3 = 40;
                        break;
                    case at.g /*1*/:
                        i3 = 97;
                        break;
                    case at.i /*2*/:
                        i3 = 6;
                        break;
                    case at.o /*3*/:
                        i3 = 37;
                        break;
                    default:
                        i3 = 26;
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
                    str = "K\u000ek\u000bm@\u0000rV{X\u0011";
                    obj = null;
            }
        }
    }

    a_7(SmsDefaultAppWarning smsDefaultAppWarning) {
        this.a = smsDefaultAppWarning;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Log.i(z[0]);
        this.a.getPackageManager().clearPackagePreferredActivities(z[1]);
        this.a.finish();
    }
}
