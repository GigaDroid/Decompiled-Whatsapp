package com.whatsapp;

import com.whatsapp.qrcode.h;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class k0 implements h {
    private static final String[] z;
    final IdentityVerificationActivity a;

    static {
        String[] strArr = new String[2];
        String str = "mvu]@mtj[Sp{lV\u001dgsn]@ewqJ]v";
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
                        i3 = 4;
                        break;
                    case at.g /*1*/:
                        i3 = 18;
                        break;
                    case at.i /*2*/:
                        i3 = 3;
                        break;
                    case at.o /*3*/:
                        i3 = 56;
                        break;
                    default:
                        i3 = 50;
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
                    str = "mvu]@mtj[Sp{lV\u001dt`fN[aeq]S`k";
                    obj = null;
            }
        }
    }

    public void b() {
        Log.i(z[1]);
        IdentityVerificationActivity.b(this.a, true);
        this.a.runOnUiThread(new a48(this));
    }

    public void a() {
        Log.e(z[0]);
        this.a.runOnUiThread(new atv(this));
    }

    k0(IdentityVerificationActivity identityVerificationActivity) {
        this.a = identityVerificationActivity;
    }
}
