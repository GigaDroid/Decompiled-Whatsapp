package org.whispersystems;

import com.whatsapp.arj;
import java.text.ParseException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.v;

public class bU {
    private static final String[] z;
    private final SecretKeySpec a;
    private final IvParameterSpec b;
    private final SecretKeySpec c;

    static {
        String[] strArr = new String[2];
        String str = "\u0007P4";
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
                        i3 = 21;
                        break;
                    case at.i /*2*/:
                        i3 = arj.Theme_checkedTextViewStyle;
                        break;
                    case at.o /*3*/:
                        i3 = 6;
                        break;
                    default:
                        i3 = 97;
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
                    str = "\u000ex\u0006e2\u000eTU3W";
                    obj = null;
            }
        }
    }

    public IvParameterSpec c() {
        return this.b;
    }

    public bU(byte[] bArr) {
        boolean z = false;
        boolean z2 = ag.a;
        try {
            byte[][] a = aw.a(bArr, 32, 32, 16);
            this.c = new SecretKeySpec(a[0], z[0]);
            this.a = new SecretKeySpec(a[1], z[1]);
            this.b = new IvParameterSpec(a[2]);
            if (z2) {
                try {
                    if (!a5.o) {
                        z = true;
                    }
                    a5.o = z;
                } catch (ParseException e) {
                    throw e;
                }
            }
        } catch (ParseException e2) {
            throw new AssertionError(e2);
        }
    }

    public SecretKeySpec b() {
        return this.c;
    }

    public SecretKeySpec a() {
        return this.a;
    }
}
