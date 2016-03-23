package org.whispersystems;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.v;

public class cd {
    private static final byte[] c;
    public static boolean d;
    private static final byte[] f;
    private static final String[] z;
    private final ag a;
    private final int b;
    private final byte[] e;

    public cd(ag agVar, byte[] bArr, int i) {
        this.a = agVar;
        this.e = bArr;
        this.b = i;
    }

    private byte[] a(byte[] bArr) {
        Object e;
        try {
            Mac instance = Mac.getInstance(z[1]);
            instance.init(new SecretKeySpec(this.e, z[0]));
            return instance.doFinal(bArr);
        } catch (NoSuchAlgorithmException e2) {
            e = e2;
            throw new AssertionError(e);
        } catch (InvalidKeyException e3) {
            e = e3;
            throw new AssertionError(e);
        }
    }

    public cd a() {
        return new cd(this.a, a(f), this.b + 1);
    }

    public int d() {
        return this.b;
    }

    public byte[] c() {
        return this.e;
    }

    public an b() {
        bU bUVar = new bU(this.a.b(a(c), z[2].getBytes(), 80));
        return new an(bUVar.b(), bUVar.a(), bUVar.c(), this.b);
    }

    static {
        String[] strArr = new String[3];
        String str = "vJ\u0012;mvfAm\b";
        int i = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i2 = 0;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i3 = 0; length > i3; i3++) {
                int i4;
                char c = cArr[i3];
                switch (i3 % 5) {
                    case v.m /*0*/:
                        i4 = 62;
                        break;
                    case at.g /*1*/:
                        i4 = 39;
                        break;
                    case at.i /*2*/:
                        i4 = 115;
                        break;
                    case at.o /*3*/:
                        i4 = 88;
                        break;
                    default:
                        i4 = 62;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "iO\u001a+N[U>=MMF\u0014=u[^\u0000";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = (byte) 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    c = new byte[]{(byte) 1};
                    f = new byte[]{(byte) 2};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "vJ\u0012;mvfAm\b";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
