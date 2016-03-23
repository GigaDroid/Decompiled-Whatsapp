package com.whatsapp.gdrive;

import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class q extends n {
    private static final String[] z;
    final fs a;
    final GoogleDriveService b;
    final fs c;

    static {
        String[] strArr = new String[5];
        String str = "mf7_8zb&I\t|b'U\txl8T3l\\=T";
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
                        i3 = 30;
                        break;
                    case at.g /*1*/:
                        i3 = 3;
                        break;
                    case at.i /*2*/:
                        i3 = 84;
                        break;
                    case at.o /*3*/:
                        i3 = 48;
                        break;
                    default:
                        i3 = 86;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "yg&Y {.'U$hj7Uy\u007fp'_5wb U{mf7_8zb&I{ij X{nq=]7lzt@$wn5B/$";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = ">p1S9pg5B/$";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "1p!S5{p'";
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "mf7_8zb&I\t|b'U\txl8T3l\\=T";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public Object m761a() {
        return a();
    }

    q(GoogleDriveService googleDriveService, fs fsVar, fs fsVar2) {
        this.b = googleDriveService;
        this.c = fsVar;
        this.a = fsVar2;
    }

    public Boolean a() {
        if (!GoogleDriveService.m(this.b).a(this.c.g(), z[0], this.a.g())) {
            return null;
        }
        this.c.a(z[1], this.a.g());
        Log.i(z[2] + this.c.g() + z[3] + this.a.g() + z[4]);
        return Boolean.TRUE;
    }
}
