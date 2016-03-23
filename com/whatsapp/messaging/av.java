package com.whatsapp.messaging;

import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

final class av {
    private static final String[] z;
    private boolean a;
    private final String b;
    private final int c;

    static {
        String[] strArr = new String[2];
        String str = "fWT;~!Q\u001c.\u007ff";
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
                        i3 = 70;
                        break;
                    case at.g /*1*/:
                        i3 = 52;
                        break;
                    case at.i /*2*/:
                        i3 = 60;
                        break;
                    case at.o /*3*/:
                        i3 = 90;
                        break;
                    default:
                        i3 = 16;
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
                    str = "f]R3d/UP3j#\u0014H50";
                    obj = null;
            }
        }
    }

    public av(int i, String str) {
        this(i, str, false);
    }

    public void a(boolean z) {
        Log.b(this.c, this.b + " " + this.a + z[0] + z);
        this.a = z;
    }

    public boolean a() {
        return this.a;
    }

    public av(int i, String str, boolean z) {
        this.c = i;
        this.b = str;
        Log.b(i, str + z[1] + z);
        this.a = z;
    }
}
