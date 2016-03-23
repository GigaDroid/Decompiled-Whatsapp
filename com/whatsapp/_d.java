package com.whatsapp;

import com.whatsapp.protocol.b5;
import com.whatsapp.protocol.cu;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

public class _d implements b5, cu {
    private static final String[] z;
    sc a;

    static {
        String[] strArr = new String[5];
        String str = "iRY<Wy_H!C<NY0RnR\u001c'HxY\u0006d";
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
                        i3 = 28;
                        break;
                    case at.g /*1*/:
                        i3 = 60;
                        break;
                    case at.i /*2*/:
                        i3 = 60;
                        break;
                    case at.o /*3*/:
                        i3 = 68;
                        break;
                    default:
                        i3 = 39;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "<SL~\u0007";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "mNc!UnSNd\u0012,\f\u001c5RyIY-I{\u0006\u001c";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "mNc!_\u007fYL0NsR\u0006d";
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "mNc!UnSNd\u0012,\f\u001c+W<UR2FpUXdCnSL4Nr[\u0006d";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void a(int i) {
        boolean z = DialogToastActivity.f;
        if (i >= 500) {
            if (this.a.a()) {
                Log.e(z[3] + this.a.toString());
                wn.m.add(this.a);
                if (!z) {
                    return;
                }
            }
            Log.e(z[1] + this.a.toString());
            if (!z) {
                return;
            }
        }
        if (i >= 400) {
            wn.b();
            if (!z) {
                return;
            }
        }
        Log.e(z[0] + i + z[2] + this.a.toString());
    }

    public void a(Exception exception) {
        Log.b(z[4] + this.a.toString(), (Throwable) exception);
    }

    public _d(sc scVar) {
        scVar.a(wn.q);
        this.a = scVar;
    }
}
