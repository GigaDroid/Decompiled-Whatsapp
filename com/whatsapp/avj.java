package com.whatsapp;

import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class avj extends avc {
    private static final String[] z;

    static {
        String[] strArr = new String[2];
        String str = "Q#V\u0005\u0010L";
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
                        i3 = 113;
                        break;
                    case at.g /*1*/:
                        i3 = 80;
                        break;
                    case at.i /*2*/:
                        i3 = 63;
                        break;
                    case at.o /*3*/:
                        i3 = 127;
                        break;
                    default:
                        i3 = 117;
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
                    str = "4=P\u0015\u001c!9\\\u0014\u0010\u0003\u007fz\u0012\u001a\u001b9o\u001e\u0012\u0014\u007fX\u001a\u00014=P\u0015\u001cQ P\fH";
                    obj = null;
            }
        }
    }

    avj(int i, int i2, int i3, asi com_whatsapp_asi) {
        this(i, i2, i3);
    }

    public int[] a(int i) {
        if (i < aol.a().size()) {
            return ((EmojiPicker$EmojiWeight) aol.a().get(i)).emoji;
        }
        Log.e(z[1] + i + z[0] + aol.a().size());
        return aol.h()[0];
    }

    public int a() {
        return Math.min(35, aol.a().size());
    }

    private avj(int i, int i2, int i3) {
        super(i, (int[][]) null, i2, i3, null);
    }
}
