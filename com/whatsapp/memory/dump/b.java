package com.whatsapp.memory.dump;

import com.whatsapp.WAAppCompatActivity;
import com.whatsapp.azx;
import com.whatsapp.mk;
import com.whatsapp.ui;
import java.io.FileInputStream;
import org.v;
import org.whispersystems.at;

public class b {
    private static final String[] z;
    private final q a;

    static {
        String[] strArr = new String[5];
        String str = "ul*hk}f\u0011rtfm(";
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
                        i3 = 20;
                        break;
                    case at.g /*1*/:
                        i3 = 2;
                        break;
                    case at.i /*2*/:
                        i3 = 78;
                        break;
                    case at.o /*3*/:
                        i3 = 26;
                        break;
                    default:
                        i3 = 4;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "ul*hk}f\u0011rtfm(";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "ul*hk}f\u0011rtfm(Ealv<{w";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "`{>\u007f";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "ue+tp";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void a(ui uiVar) {
        boolean z = n.a;
        mk mkVar = new mk(azx.g, uiVar);
        mkVar.a(new FileInputStream(this.a.b()), z[2], this.a.b().getName(), 0);
        mkVar.a(z[1], this.a.a());
        mkVar.a(z[4], z[0]);
        mkVar.a(z[3], this.a.c());
        mkVar.b();
        if (WAAppCompatActivity.c != 0) {
            n.a = !z;
        }
    }

    public b(q qVar) {
        this.a = qVar;
    }
}
