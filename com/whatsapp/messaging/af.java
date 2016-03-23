package com.whatsapp.messaging;

import com.whatsapp.protocol.b5;
import com.whatsapp.protocol.cu;
import org.v;
import org.whispersystems.at;

public final class af {
    private static final String[] z;
    public final Runnable a;
    public final byte[] b;
    public final cu c;
    public final b5 d;

    static {
        String[] strArr = new String[5];
        String str = "N\u0012\u0001\u000f\u001b\u001d";
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
                        i3 = 110;
                        break;
                    case at.g /*1*/:
                        i3 = 112;
                        break;
                    case at.i /*2*/:
                        i3 = 120;
                        break;
                    case at.o /*3*/:
                        i3 = 123;
                        break;
                    default:
                        i3 = 126;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "BP\u000b\u000e\u001d\r\u0015\u000b\b=\u000f\u001c\u0014\u0019\u001f\r\u001bE";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "BP\n\u001e\u001f\n5\n\t\u0011\u001c3\u0019\u0017\u0012\f\u0011\u001b\u0010C";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "=\u0015\u0016\u001f8\u0007\u0015\u0014\u001f-\u001a\u0011\f\b\u0005\b\u0019\u001d\u0017\u001a=\u0004\u0019\u000f\r,\u001c\u0017\u0019C";
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "BP\u001d\t\f\u0001\u0002;\u001a\u0012\u0002\u0012\u0019\u0018\u0015S";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public af(byte[] bArr, Runnable runnable, b5 b5Var, cu cuVar) {
        this.b = bArr;
        this.a = runnable;
        this.d = b5Var;
        this.c = cuVar;
    }

    public String toString() {
        return z[4] + (this.b != null ? this.b.length : 0) + z[0] + z[2] + this.a + z[1] + this.d + z[3] + this.c + '}';
    }
}
