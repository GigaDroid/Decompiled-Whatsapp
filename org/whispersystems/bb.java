package org.whispersystems;

import com.whatsapp.arj;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.LinkedList;
import java.util.List;
import org.v;

public class bb {
    private static final String[] z;

    static {
        String[] strArr = new String[4];
        String str = "bMa\u00055cKg";
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
                        i3 = 49;
                        break;
                    case at.g /*1*/:
                        i3 = 5;
                        break;
                    case at.i /*2*/:
                        i3 = 32;
                        break;
                    case at.o /*3*/:
                        i3 = 52;
                        break;
                    default:
                        i3 = arj.Theme_buttonStyleSmall;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "bMa\u00055cKg";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "bMa\u00055cKg";
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "bMa\u00055cKg";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public static int a(int i) {
        try {
            return SecureRandom.getInstance(z[2]).nextInt(i);
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    public static aZ a(k kVar, int i) {
        e a = bx.a();
        return new aZ(i, System.currentTimeMillis(), a, bx.a(kVar.a(), a.b().a()));
    }

    public static byte[] d() {
        try {
            byte[] bArr = new byte[32];
            SecureRandom.getInstance(z[3]).nextBytes(bArr);
            return bArr;
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    public static k b() {
        e a = bx.a();
        return new k(new bp(a.b()), a.a());
    }

    public static List a(int i, int i2) {
        boolean z = aw.a;
        List linkedList = new LinkedList();
        int i3 = i - 1;
        int i4 = 0;
        while (i4 < i2) {
            linkedList.add(new b5(((i3 + i4) % (G.a - 1)) + 1, bx.a()));
            i4++;
            if (z) {
                break;
            }
        }
        return linkedList;
    }

    public static int a(boolean z) {
        try {
            SecureRandom instance = SecureRandom.getInstance(z[0]);
            if (z) {
                return instance.nextInt(2147483646) + 1;
            }
            return instance.nextInt(16380) + 1;
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    public static int c() {
        try {
            return SecureRandom.getInstance(z[1]).nextInt(Integer.MAX_VALUE);
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    public static e a() {
        return bx.a();
    }
}
