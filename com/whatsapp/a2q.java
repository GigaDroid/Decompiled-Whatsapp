package com.whatsapp;

import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class a2q {
    private static final String[] z;
    private final int a;
    private final int b;
    private final int c;

    static {
        String[] strArr = new String[2];
        String str = ".\b";
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
                        i3 = 114;
                        break;
                    case at.g /*1*/:
                        i3 = 38;
                        break;
                    case at.i /*2*/:
                        i3 = 2;
                        break;
                    case at.o /*3*/:
                        i3 = 118;
                        break;
                    default:
                        i3 = 7;
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
                    str = "\u0004Cp\u0005n\u001dH-\u0006f\u0000UgV\\";
                    obj = null;
            }
        }
    }

    public a2q(int i, int i2, int i3) {
        this.a = i;
        this.c = i2;
        this.b = i3;
    }

    public static a2q a(String str) {
        try {
            String[] split = str.split(z[0]);
            return new a2q(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]));
        } catch (Exception e) {
            Log.e(z[1] + str + "]");
            return null;
        }
    }

    public String toString() {
        return this.a + "." + this.c + "." + this.b;
    }

    public int a(a2q com_whatsapp_a2q) {
        if (this.a < com_whatsapp_a2q.a) {
            return -1;
        }
        if (this.a > com_whatsapp_a2q.a) {
            return 1;
        }
        if (this.c < com_whatsapp_a2q.c) {
            return -1;
        }
        if (this.c > com_whatsapp_a2q.c) {
            return 1;
        }
        if (this.b < com_whatsapp_a2q.b) {
            return -1;
        }
        if (this.b > com_whatsapp_a2q.b) {
            return 1;
        }
        return 0;
    }
}
