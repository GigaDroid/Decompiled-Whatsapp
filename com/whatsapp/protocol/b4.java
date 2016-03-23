package com.whatsapp.protocol;

import org.v;
import org.whispersystems.at;

public final class b4 {
    private static final String[] z;
    public final Boolean a;
    public final Boolean b;

    static {
        String[] strArr = new String[4];
        String str = "\u000flxD{O)~gvG\rHk*";
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
                        i3 = 35;
                        break;
                    case at.g /*1*/:
                        i3 = 76;
                        break;
                    case at.i /*2*/:
                        i3 = 27;
                        break;
                    case at.o /*3*/:
                        i3 = 37;
                        break;
                    default:
                        i3 = 23;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "@-wIrQ\u0013yDs|-hK";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "@-wIrF\u0013yDs|-hK";
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "` r@yW7xD{O)igvG\rHk*";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public b4(Boolean bool, Boolean bool2) {
        this.b = bool;
        this.a = bool2;
    }

    public String toString() {
        return z[1] + this.b + z[0] + this.a + "}";
    }

    public static b4 a(cw cwVar) {
        if (cwVar == null) {
            return null;
        }
        return new b4(VoipOptions.access$200(cwVar.b(z[2])), VoipOptions.access$200(cwVar.b(z[3])));
    }
}
