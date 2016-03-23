package org.whispersystems;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.v;

public class aG {
    static final Object c;
    private static final String[] z;
    private final bi a;
    private final bI b;

    private byte[] b(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        Object e;
        try {
            AlgorithmParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
            Cipher instance = Cipher.getInstance(z[6]);
            instance.init(1, new SecretKeySpec(bArr2, z[5]), ivParameterSpec);
            return instance.doFinal(bArr3);
        } catch (NoSuchAlgorithmException e2) {
            e = e2;
            throw new AssertionError(e);
        } catch (NoSuchPaddingException e3) {
            e = e3;
            throw new AssertionError(e);
        } catch (InvalidAlgorithmParameterException e4) {
            e = e4;
            throw new AssertionError(e);
        } catch (IllegalBlockSizeException e5) {
            e = e5;
            throw new AssertionError(e);
        } catch (BadPaddingException e6) {
            e = e6;
            throw new AssertionError(e);
        } catch (InvalidKeyException e7) {
            e = e7;
            throw new AssertionError(e);
        }
    }

    public byte[] a(byte[] bArr) {
        byte[] b;
        int i = bI.a;
        synchronized (c) {
            try {
                z a = this.a.a(this.b);
                bR c = a.c();
                g a2 = c.d().a();
                aN aNVar = new aN(c.c(), a2.b(), b(a2.d(), a2.a(), bArr), c.a());
                c.a(c.d().c());
                this.a.a(this.b, a);
                b = aNVar.b();
            } catch (Exception e) {
                throw new bX(e);
            }
        }
        if (a5.o) {
            bI.a = i + 1;
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] a(byte[] r7, org.whispersystems.az r8) {
        /*
        r6 = this;
        r0 = org.whispersystems.bI.a;
        r1 = c;
        monitor-enter(r1);
        r2 = r6.a;	 Catch:{ av -> 0x0033, y -> 0x0082 }
        r3 = r6.b;	 Catch:{ av -> 0x0033, y -> 0x0082 }
        r2 = r2.a(r3);	 Catch:{ av -> 0x0033, y -> 0x0082 }
        r3 = r2.a();	 Catch:{ av -> 0x0031, y -> 0x0082 }
        if (r3 == 0) goto L_0x003d;
    L_0x0013:
        r0 = new org.whispersystems.bX;	 Catch:{ av -> 0x0031, y -> 0x0082 }
        r2 = new java.lang.StringBuilder;	 Catch:{ av -> 0x0031, y -> 0x0082 }
        r2.<init>();	 Catch:{ av -> 0x0031, y -> 0x0082 }
        r3 = z;	 Catch:{ av -> 0x0031, y -> 0x0082 }
        r4 = 7;
        r3 = r3[r4];	 Catch:{ av -> 0x0031, y -> 0x0082 }
        r2 = r2.append(r3);	 Catch:{ av -> 0x0031, y -> 0x0082 }
        r3 = r6.b;	 Catch:{ av -> 0x0031, y -> 0x0082 }
        r2 = r2.append(r3);	 Catch:{ av -> 0x0031, y -> 0x0082 }
        r2 = r2.toString();	 Catch:{ av -> 0x0031, y -> 0x0082 }
        r0.<init>(r2);	 Catch:{ av -> 0x0031, y -> 0x0082 }
        throw r0;	 Catch:{ av -> 0x0031, y -> 0x0082 }
    L_0x0031:
        r0 = move-exception;
        throw r0;	 Catch:{ av -> 0x0033, y -> 0x0082 }
    L_0x0033:
        r0 = move-exception;
    L_0x0034:
        r2 = new org.whispersystems.bH;	 Catch:{ all -> 0x003a }
        r2.<init>(r0);	 Catch:{ all -> 0x003a }
        throw r2;	 Catch:{ all -> 0x003a }
    L_0x003a:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x003a }
        throw r0;
    L_0x003d:
        r3 = new org.whispersystems.aN;	 Catch:{ av -> 0x0033, y -> 0x0082 }
        r3.<init>(r7);	 Catch:{ av -> 0x0033, y -> 0x0082 }
        r4 = r3.c();	 Catch:{ av -> 0x0033, y -> 0x0082 }
        r4 = r2.a(r4);	 Catch:{ av -> 0x0033, y -> 0x0082 }
        r5 = r4.b();	 Catch:{ av -> 0x0033, y -> 0x0082 }
        r3.a(r5);	 Catch:{ av -> 0x0033, y -> 0x0082 }
        r5 = r3.b();	 Catch:{ av -> 0x0033, y -> 0x0082 }
        r4 = r6.a(r4, r5);	 Catch:{ av -> 0x0033, y -> 0x0082 }
        r5 = r4.d();	 Catch:{ av -> 0x0033, y -> 0x0082 }
        r4 = r4.a();	 Catch:{ av -> 0x0033, y -> 0x0082 }
        r3 = r3.d();	 Catch:{ av -> 0x0033, y -> 0x0082 }
        r3 = r6.a(r5, r4, r3);	 Catch:{ av -> 0x0033, y -> 0x0082 }
        r8.a(r3);	 Catch:{ av -> 0x0033, y -> 0x0082 }
        r4 = r6.a;	 Catch:{ av -> 0x0033, y -> 0x0082 }
        r5 = r6.b;	 Catch:{ av -> 0x0033, y -> 0x0082 }
        r4.a(r5, r2);	 Catch:{ av -> 0x0033, y -> 0x0082 }
        monitor-exit(r1);	 Catch:{ all -> 0x003a }
        if (r0 == 0) goto L_0x007d;
    L_0x0076:
        r0 = org.whispersystems.a5.o;	 Catch:{ av -> 0x007e }
        if (r0 == 0) goto L_0x0080;
    L_0x007a:
        r0 = 0;
    L_0x007b:
        org.whispersystems.a5.o = r0;
    L_0x007d:
        return r3;
    L_0x007e:
        r0 = move-exception;
        throw r0;
    L_0x0080:
        r0 = 1;
        goto L_0x007b;
    L_0x0082:
        r0 = move-exception;
        goto L_0x0034;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.aG.a(byte[], org.whispersystems.az):byte[]");
    }

    public aG(bi biVar, bI bIVar) {
        this.a = biVar;
        this.b = bIVar;
    }

    static {
        String[] strArr = new String[8];
        String str = "\u0012\fPe\u001boJ\u0005'\u001b0\u001fFdZ:\u001fF7R3\u000eZ7O5\u001f\u0015qN)\u000fGr\u001a";
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
                        i3 = 93;
                        break;
                    case at.g /*1*/:
                        i3 = 122;
                        break;
                    case at.i /*2*/:
                        i3 = 53;
                        break;
                    case at.o /*3*/:
                        i3 = 23;
                        break;
                    default:
                        i3 = 59;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\u000f\u001fVrR+\u001fQ7V8\tFv\\8ZB~O5ZZ{_}\u0019ZbU)\u001fG-\u001b";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "\u001c?f";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "\u001c?f8x\u001f9\u001aGp\u001e)\u0000GZ9\u001e\\y\\";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "\u001c?f";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\u001c?f8x\u001f9\u001aGp\u001e)\u0000GZ9\u001e\\y\\";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\u0013\u0015\u0015d^3\u001ePe\u001b6\u001fL7]2\b\u000f7";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    z = strArr3;
                    c = new Object();
                    return;
                default:
                    strArr2[i] = str;
                    str = "}V\u0015";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    private g a(bR bRVar, int i) {
        int i2 = bI.a;
        bj d = bRVar.d();
        if (d.d() > i) {
            if (bRVar.b(i)) {
                return bRVar.a(i);
            }
            throw new ar(z[2] + d.d() + z[1] + i);
        } else if (i - d.d() > 2000) {
            throw new bH(z[0]);
        } else {
            while (d.d() < i) {
                bRVar.a(d.a());
                d = d.c();
                if (i2 != 0) {
                    break;
                }
            }
            bRVar.a(d.c());
            return d.a();
        }
    }

    private byte[] a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        Object e;
        Throwable e2;
        try {
            AlgorithmParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
            Cipher instance = Cipher.getInstance(z[4]);
            instance.init(2, new SecretKeySpec(bArr2, z[3]), ivParameterSpec);
            return instance.doFinal(bArr3);
        } catch (NoSuchAlgorithmException e3) {
            e = e3;
            throw new AssertionError(e);
        } catch (NoSuchPaddingException e4) {
            e = e4;
            throw new AssertionError(e);
        } catch (InvalidKeyException e5) {
            e = e5;
            throw new AssertionError(e);
        } catch (InvalidAlgorithmParameterException e6) {
            e = e6;
            throw new AssertionError(e);
        } catch (IllegalBlockSizeException e7) {
            e2 = e7;
            throw new bH(e2);
        } catch (BadPaddingException e8) {
            e2 = e8;
            throw new bH(e2);
        }
    }
}
