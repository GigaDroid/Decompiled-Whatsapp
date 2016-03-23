package com.whatsapp;

import android.support.annotation.Nullable;
import org.v;
import org.whispersystems.at;

class rc implements as8 {
    private static final String[] z;
    final aqq a;

    static {
        String[] strArr = new String[2];
        String str = "5n\b`]6t\u000f4\u001f=;\u0018u\u00114~\u001f";
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
                        i3 = 88;
                        break;
                    case at.g /*1*/:
                        i3 = 27;
                        break;
                    case at.i /*2*/:
                        i3 = 123;
                        break;
                    case at.o /*3*/:
                        i3 = 20;
                        break;
                    default:
                        i3 = 125;
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
                    str = "5n\b`]6t\u000f4\u001f=;\u0018u\u00114~\u001f";
                    obj = null;
            }
        }
    }

    rc(aqq com_whatsapp_aqq) {
        this.a = com_whatsapp_aqq;
    }

    public void b(@Nullable String str) {
        throw new IllegalStateException(z[0]);
    }

    public void a() {
        throw new IllegalStateException(z[1]);
    }

    public void b() {
        this.a.a(false);
    }

    public void a(@Nullable String str) {
        aqq.b(this.a).showDialog(arj.Theme_seekBarStyle);
    }
}
