package com.whatsapp.util;

import java.io.RandomAccessFile;
import org.v;
import org.whispersystems.at;

public class ca extends co {
    private static final String[] z;

    static {
        String[] strArr = new String[2];
        String str = "x2";
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
                        i3 = 26;
                        break;
                    case at.i /*2*/:
                        i3 = 66;
                        break;
                    case at.o /*3*/:
                        i3 = 66;
                        break;
                    default:
                        i3 = 14;
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
                    str = "xx;6k+3b";
                    obj = null;
            }
        }
    }

    public String toString() {
        return this.b + z[0] + this.c + z[1];
    }

    public ca(long j, String str, RandomAccessFile randomAccessFile) {
        super(j, str);
    }
}
