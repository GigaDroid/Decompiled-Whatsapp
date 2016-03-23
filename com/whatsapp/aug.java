package com.whatsapp;

import com.whatsapp.protocol.co;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class aug implements aau {
    private static final String[] z;
    final CallsFragment a;

    static {
        String[] strArr = new String[2];
        String str = "\\\u00011h\u000f\u0010\u000f3G\u001dS\f\u0010m\u000fL\u00059";
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
                        i3 = 63;
                        break;
                    case at.g /*1*/:
                        i3 = 96;
                        break;
                    case at.i /*2*/:
                        i3 = 93;
                        break;
                    case at.o /*3*/:
                        i3 = 4;
                        break;
                    default:
                        i3 = 124;
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
                    str = "\\\u00011h\u000f\u0010\u000f3G\u001dS\f\u0018j\u0018Z\u0004";
                    obj = null;
            }
        }
    }

    public void a(String str, long j) {
    }

    aug(CallsFragment callsFragment) {
        this.a = callsFragment;
    }

    public void a(co coVar) {
        Log.i(z[0]);
        CallsFragment.i(this.a);
    }

    public void b(co coVar) {
        Log.i(z[1]);
        if (!Voip.b(coVar)) {
            CallsFragment.i(this.a);
        }
    }

    public void c(co coVar) {
    }
}
