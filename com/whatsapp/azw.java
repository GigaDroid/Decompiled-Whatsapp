package com.whatsapp;

import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class azw implements as8 {
    private static final String[] z;
    final an3 a;

    static {
        String[] strArr = new String[4];
        String str = "\"iH\u001ej!sOJ(*<X\u000b&#y_";
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
                        i3 = 79;
                        break;
                    case at.g /*1*/:
                        i3 = 28;
                        break;
                    case at.i /*2*/:
                        i3 = 59;
                        break;
                    case at.o /*3*/:
                        i3 = arj.Theme_ratingBarStyle;
                        break;
                    default:
                        i3 = 74;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "+yH\t8&~^\u001a8 ~W\u000f'.\u007fO\u0003<&hBE/7h^\u0018$.pH\u001e%=}\\\u000fe.jZ\u0003&oyC\u001e/=rZ\u0006j<hT\u0018+(y\u001b\u0004%;<X\u000b&,iW\u000b>*x\u0017J:*nV\u00039<uT\u0004j+yU\u0003/+";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "+yH\t8&~^\u001a8 ~W\u000f'.\u007fO\u0003<&hBE/7h^\u0018$.pH\u001e%=}\\\u000fe.jZ\u0003&oyC\u001e/=rZ\u0006j<hT\u0018+(y\u001b\u0004%;<X\u000b&,iW\u000b>*x\u0017J9;}O\u000fw";
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\"iH\u001ej!sOJ(*<X\u000b&#y_";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void a(String str) {
        an3.a(this.a, -2);
        Log.i(z[3] + an3.a(this.a));
    }

    public void a() {
        throw new IllegalStateException(z[0]);
    }

    public void b(String str) {
        throw new IllegalStateException(z[1]);
    }

    azw(an3 com_whatsapp_an3) {
        this.a = com_whatsapp_an3;
    }

    public void b() {
        an3.a(this.a, -2);
        Log.i(z[2]);
    }
}
