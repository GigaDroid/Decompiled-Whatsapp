package com.whatsapp;

import com.whatsapp.App.Me;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

final class ae5 implements Runnable {
    private static final String[] z;

    static {
        String[] strArr = new String[3];
        String str = "z:\u0017sY|<\u0003p\\| Yo[j\"\u0019sM|}\u0019v\u001ev>\u0012 ";
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
                        i3 = 25;
                        break;
                    case at.g /*1*/:
                        i3 = 82;
                        break;
                    case at.i /*2*/:
                        i3 = 118;
                        break;
                    case at.o /*3*/:
                        i3 = 29;
                        break;
                    default:
                        i3 = 62;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    strArr2 = strArr3;
                    str = "9<\u0013j\u0003";
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "z:\u0017sY|<\u0003p\\| Yo[j\"\u0019sM|}\u0019v\u001ex>\u0004x_}+V~Vx<\u0011xZ&";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void run() {
        Me ag = App.ag();
        if (ag != null) {
            ChangeNumber.d(ag.jabber_id);
            Log.i(z[0] + ChangeNumber.l() + z[2] + App.ay.jabber_id);
            ChangeNumber.e(VerifyNumber.b(ag.cc, ag.number));
            ChangeNumber.h().sendEmptyMessage(7);
            ve.o();
            App.aT();
            ChangeNumber.a(App.z(), true);
            if (!DialogToastActivity.f) {
                return;
            }
        }
        Log.w(z[1]);
        ve.o();
    }

    ae5() {
    }
}
