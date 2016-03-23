package org.whispersystems;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.v;

public abstract class ag {
    public static boolean a;
    private static final String[] z;

    static {
        String[] strArr = new String[5];
        String str = "\\^\u00166C\\rE`&";
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
                        i3 = 20;
                        break;
                    case at.g /*1*/:
                        i3 = 51;
                        break;
                    case at.i /*2*/:
                        i3 = 119;
                        break;
                    case at.o /*3*/:
                        i3 = 85;
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
                    str = "\\^\u00166C\\rE`&";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "\\^\u00166C\\rE`&";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "A]\u001c;\u007fc]W#uf@\u001e:~.\u0013";
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\\^\u00166C\\rE`&";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    protected abstract int a();

    public byte[] a(byte[] bArr, byte[] bArr2, byte[] bArr3, int i) {
        return a(a(bArr2, bArr), bArr3, i);
    }

    public static ag a(int i) {
        switch (i) {
            case at.i /*2*/:
                return new aW();
            case at.o /*3*/:
                return new bd();
            default:
                throw new AssertionError(z[4] + i);
        }
    }

    private byte[] a(byte[] bArr, byte[] bArr2) {
        Object e;
        try {
            Mac instance = Mac.getInstance(z[0]);
            instance.init(new SecretKeySpec(bArr, z[1]));
            return instance.doFinal(bArr2);
        } catch (NoSuchAlgorithmException e2) {
            e = e2;
            throw new AssertionError(e);
        } catch (InvalidKeyException e3) {
            e = e3;
            throw new AssertionError(e);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private byte[] a(byte[] r10, byte[] r11, int r12) {
        /*
        r9 = this;
        r2 = a;
        r0 = (double) r12;
        r4 = 4629700416936869888; // 0x4040000000000000 float:0.0 double:32.0;
        r0 = r0 / r4;
        r0 = java.lang.Math.ceil(r0);	 Catch:{ NoSuchAlgorithmException -> 0x0059, InvalidKeyException -> 0x0060 }
        r3 = (int) r0;	 Catch:{ NoSuchAlgorithmException -> 0x0059, InvalidKeyException -> 0x0060 }
        r0 = 0;
        r1 = new byte[r0];	 Catch:{ NoSuchAlgorithmException -> 0x0059, InvalidKeyException -> 0x0060 }
        r4 = new java.io.ByteArrayOutputStream;	 Catch:{ NoSuchAlgorithmException -> 0x0059, InvalidKeyException -> 0x0060 }
        r4.<init>();	 Catch:{ NoSuchAlgorithmException -> 0x0059, InvalidKeyException -> 0x0060 }
        r0 = r9.a();	 Catch:{ NoSuchAlgorithmException -> 0x0059, InvalidKeyException -> 0x0060 }
    L_0x0017:
        r5 = r9.a();	 Catch:{ NoSuchAlgorithmException -> 0x0059, InvalidKeyException -> 0x0060 }
        r5 = r5 + r3;
        if (r0 >= r5) goto L_0x0052;
    L_0x001e:
        r5 = z;	 Catch:{ NoSuchAlgorithmException -> 0x0059, InvalidKeyException -> 0x0060 }
        r6 = 3;
        r5 = r5[r6];	 Catch:{ NoSuchAlgorithmException -> 0x0059, InvalidKeyException -> 0x0060 }
        r5 = javax.crypto.Mac.getInstance(r5);	 Catch:{ NoSuchAlgorithmException -> 0x0059, InvalidKeyException -> 0x0060 }
        r6 = new javax.crypto.spec.SecretKeySpec;	 Catch:{ NoSuchAlgorithmException -> 0x0057, InvalidKeyException -> 0x0060 }
        r7 = z;	 Catch:{ NoSuchAlgorithmException -> 0x0057, InvalidKeyException -> 0x0060 }
        r8 = 2;
        r7 = r7[r8];	 Catch:{ NoSuchAlgorithmException -> 0x0057, InvalidKeyException -> 0x0060 }
        r6.<init>(r10, r7);	 Catch:{ NoSuchAlgorithmException -> 0x0057, InvalidKeyException -> 0x0060 }
        r5.init(r6);	 Catch:{ NoSuchAlgorithmException -> 0x0057, InvalidKeyException -> 0x0060 }
        r5.update(r1);	 Catch:{ NoSuchAlgorithmException -> 0x0057, InvalidKeyException -> 0x0060 }
        if (r11 == 0) goto L_0x003c;
    L_0x0039:
        r5.update(r11);	 Catch:{ NoSuchAlgorithmException -> 0x0057, InvalidKeyException -> 0x0060 }
    L_0x003c:
        r1 = (byte) r0;
        r5.update(r1);	 Catch:{ NoSuchAlgorithmException -> 0x0059, InvalidKeyException -> 0x0060 }
        r1 = r5.doFinal();	 Catch:{ NoSuchAlgorithmException -> 0x0059, InvalidKeyException -> 0x0060 }
        r5 = r1.length;	 Catch:{ NoSuchAlgorithmException -> 0x0059, InvalidKeyException -> 0x0060 }
        r5 = java.lang.Math.min(r12, r5);	 Catch:{ NoSuchAlgorithmException -> 0x0059, InvalidKeyException -> 0x0060 }
        r6 = 0;
        r4.write(r1, r6, r5);	 Catch:{ NoSuchAlgorithmException -> 0x0059, InvalidKeyException -> 0x0060 }
        r12 = r12 - r5;
        r0 = r0 + 1;
        if (r2 == 0) goto L_0x0017;
    L_0x0052:
        r0 = r4.toByteArray();	 Catch:{ NoSuchAlgorithmException -> 0x0059, InvalidKeyException -> 0x0060 }
        return r0;
    L_0x0057:
        r0 = move-exception;
        throw r0;	 Catch:{ NoSuchAlgorithmException -> 0x0059, InvalidKeyException -> 0x0060 }
    L_0x0059:
        r0 = move-exception;
    L_0x005a:
        r1 = new java.lang.AssertionError;
        r1.<init>(r0);
        throw r1;
    L_0x0060:
        r0 = move-exception;
        goto L_0x005a;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.ag.a(byte[], byte[], int):byte[]");
    }

    public byte[] b(byte[] bArr, byte[] bArr2, int i) {
        return a(bArr, new byte[32], bArr2, i);
    }
}
