package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;
import com.whatsapp.util.Log;
import com.whatsapp.util.bq;
import org.v;
import org.whispersystems.at;

class a41 implements OnClickListener {
    private static final String[] z;
    final VerifySms a;

    static {
        String[] strArr = new String[2];
        String str = "<\u0007IX%3\u0014TX /MIT2?\u0007HEl)\u0001\u0006";
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
                        i3 = 74;
                        break;
                    case at.g /*1*/:
                        i3 = 98;
                        break;
                    case at.i /*2*/:
                        i3 = 59;
                        break;
                    case at.o /*3*/:
                        i3 = 49;
                        break;
                    default:
                        i3 = 67;
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
                    str = "e\fN\\!/\u0010\u0006";
                    obj = null;
            }
        }
    }

    public void onClick(View view) {
        Log.i(z[0] + VerifySms.k(this.a) + z[1] + VerifySms.v(this.a));
        bq.a(new ba(this.a), new String[0]);
    }

    a41(VerifySms verifySms) {
        this.a = verifySms;
    }
}
