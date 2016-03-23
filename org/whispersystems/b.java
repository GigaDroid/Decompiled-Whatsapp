package org.whispersystems;

import com.google.hx;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.v;

public class b implements m {
    private static final String[] z;
    private final E a;
    private final int b;
    private final byte[] c;
    private final int d;
    private final byte[] e;
    private final int f;

    static {
        String[] strArr = new String[5];
        String str = "\r\rQ`U\r!\u000260";
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
                        i3 = 69;
                        break;
                    case at.g /*1*/:
                        i3 = 96;
                        break;
                    case at.i /*2*/:
                        i3 = 48;
                        break;
                    case at.o /*3*/:
                        i3 = 3;
                        break;
                    default:
                        i3 = 6;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\t\u0005Wbe<@]fu6\u0001Wf<e";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "\u0010\u000e[mi2\u000e\u0010uc7\u0013Ylh\u007f@";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "\u0007\u0001T#K$\u0003\u0011";
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\f\u000eSlk5\fUwce\rUpu$\u0007U-";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public byte[] m725b() {
        return this.e;
    }

    private byte[] a(int i, bp bpVar, bp bpVar2, SecretKeySpec secretKeySpec, byte[] bArr) {
        Object e;
        try {
            Mac instance = Mac.getInstance(z[0]);
            instance.init(secretKeySpec);
            if (i >= 3) {
                instance.update(bpVar.a().a());
                instance.update(bpVar2.a().a());
            }
            return aw.d(instance.doFinal(bArr), 8);
        } catch (NoSuchAlgorithmException e2) {
            throw e2;
        } catch (InvalidKeyException e3) {
            e = e3;
            throw new AssertionError(e);
        } catch (NoSuchAlgorithmException e4) {
            e = e4;
            throw new AssertionError(e);
        }
    }

    public int c() {
        return this.f;
    }

    public int a() {
        return 2;
    }

    public E b() {
        return this.a;
    }

    public int d() {
        return this.b;
    }

    public byte[] m724a() {
        return this.c;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b(byte[] r7) {
        /*
        r6 = this;
        r5 = 3;
        r4 = 1;
        r6.<init>();
        r0 = 1;
        r1 = r7.length;	 Catch:{ fN -> 0x0045, av -> 0x0074, ParseException -> 0x0099 }
        r1 = r1 + -1;
        r1 = r1 + -8;
        r2 = 8;
        r0 = org.whispersystems.aw.a(r7, r0, r1, r2);	 Catch:{ fN -> 0x0045, av -> 0x0074, ParseException -> 0x0099 }
        r1 = 0;
        r1 = r0[r1];	 Catch:{ fN -> 0x0045, av -> 0x0074, ParseException -> 0x0099 }
        r2 = 0;
        r1 = r1[r2];	 Catch:{ fN -> 0x0045, av -> 0x0074, ParseException -> 0x0099 }
        r2 = 1;
        r2 = r0[r2];	 Catch:{ fN -> 0x0045, av -> 0x0074, ParseException -> 0x0099 }
        r3 = 2;
        r0 = r0[r3];	 Catch:{ fN -> 0x0045, av -> 0x0074, ParseException -> 0x0099 }
        r0 = org.whispersystems.aw.a(r1);	 Catch:{ fN -> 0x0043, av -> 0x0074, ParseException -> 0x0099 }
        if (r0 > r4) goto L_0x004c;
    L_0x0023:
        r0 = new org.whispersystems.bF;	 Catch:{ fN -> 0x0043, av -> 0x0074, ParseException -> 0x0099 }
        r2 = new java.lang.StringBuilder;	 Catch:{ fN -> 0x0043, av -> 0x0074, ParseException -> 0x0099 }
        r2.<init>();	 Catch:{ fN -> 0x0043, av -> 0x0074, ParseException -> 0x0099 }
        r3 = z;	 Catch:{ fN -> 0x0043, av -> 0x0074, ParseException -> 0x0099 }
        r4 = 2;
        r3 = r3[r4];	 Catch:{ fN -> 0x0043, av -> 0x0074, ParseException -> 0x0099 }
        r2 = r2.append(r3);	 Catch:{ fN -> 0x0043, av -> 0x0074, ParseException -> 0x0099 }
        r1 = org.whispersystems.aw.a(r1);	 Catch:{ fN -> 0x0043, av -> 0x0074, ParseException -> 0x0099 }
        r1 = r2.append(r1);	 Catch:{ fN -> 0x0043, av -> 0x0074, ParseException -> 0x0099 }
        r1 = r1.toString();	 Catch:{ fN -> 0x0043, av -> 0x0074, ParseException -> 0x0099 }
        r0.<init>(r1);	 Catch:{ fN -> 0x0043, av -> 0x0074, ParseException -> 0x0099 }
        throw r0;	 Catch:{ fN -> 0x0043, av -> 0x0074, ParseException -> 0x0099 }
    L_0x0043:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x0045, av -> 0x0074, ParseException -> 0x0099 }
    L_0x0045:
        r0 = move-exception;
    L_0x0046:
        r1 = new org.whispersystems.bH;
        r1.<init>(r0);
        throw r1;
    L_0x004c:
        r0 = org.whispersystems.aw.a(r1);	 Catch:{ fN -> 0x0072, av -> 0x0074, ParseException -> 0x0099 }
        if (r0 <= r5) goto L_0x0076;
    L_0x0052:
        r0 = new org.whispersystems.bH;	 Catch:{ fN -> 0x0072, av -> 0x0074, ParseException -> 0x0099 }
        r2 = new java.lang.StringBuilder;	 Catch:{ fN -> 0x0072, av -> 0x0074, ParseException -> 0x0099 }
        r2.<init>();	 Catch:{ fN -> 0x0072, av -> 0x0074, ParseException -> 0x0099 }
        r3 = z;	 Catch:{ fN -> 0x0072, av -> 0x0074, ParseException -> 0x0099 }
        r4 = 3;
        r3 = r3[r4];	 Catch:{ fN -> 0x0072, av -> 0x0074, ParseException -> 0x0099 }
        r2 = r2.append(r3);	 Catch:{ fN -> 0x0072, av -> 0x0074, ParseException -> 0x0099 }
        r1 = org.whispersystems.aw.a(r1);	 Catch:{ fN -> 0x0072, av -> 0x0074, ParseException -> 0x0099 }
        r1 = r2.append(r1);	 Catch:{ fN -> 0x0072, av -> 0x0074, ParseException -> 0x0099 }
        r1 = r1.toString();	 Catch:{ fN -> 0x0072, av -> 0x0074, ParseException -> 0x0099 }
        r0.<init>(r1);	 Catch:{ fN -> 0x0072, av -> 0x0074, ParseException -> 0x0099 }
        throw r0;	 Catch:{ fN -> 0x0072, av -> 0x0074, ParseException -> 0x0099 }
    L_0x0072:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x0045, av -> 0x0074, ParseException -> 0x0099 }
    L_0x0074:
        r0 = move-exception;
        goto L_0x0046;
    L_0x0076:
        r0 = org.whispersystems.P.a(r2);	 Catch:{ fN -> 0x0045, av -> 0x0074, ParseException -> 0x0099 }
        r2 = r0.h();	 Catch:{ fN -> 0x009b, av -> 0x0074, ParseException -> 0x0099 }
        if (r2 == 0) goto L_0x008c;
    L_0x0080:
        r2 = r0.b();	 Catch:{ fN -> 0x009b, av -> 0x0074, ParseException -> 0x0099 }
        if (r2 == 0) goto L_0x008c;
    L_0x0086:
        r2 = r0.p();	 Catch:{ fN -> 0x009d, av -> 0x0074, ParseException -> 0x0099 }
        if (r2 != 0) goto L_0x009f;
    L_0x008c:
        r0 = new org.whispersystems.bH;	 Catch:{ fN -> 0x0097, av -> 0x0074, ParseException -> 0x0099 }
        r1 = z;	 Catch:{ fN -> 0x0097, av -> 0x0074, ParseException -> 0x0099 }
        r2 = 1;
        r1 = r1[r2];	 Catch:{ fN -> 0x0097, av -> 0x0074, ParseException -> 0x0099 }
        r0.<init>(r1);	 Catch:{ fN -> 0x0097, av -> 0x0074, ParseException -> 0x0099 }
        throw r0;	 Catch:{ fN -> 0x0097, av -> 0x0074, ParseException -> 0x0099 }
    L_0x0097:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x0045, av -> 0x0074, ParseException -> 0x0099 }
    L_0x0099:
        r0 = move-exception;
        goto L_0x0046;
    L_0x009b:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x009d, av -> 0x0074, ParseException -> 0x0099 }
    L_0x009d:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x0097, av -> 0x0074, ParseException -> 0x0099 }
    L_0x009f:
        r6.e = r7;	 Catch:{ fN -> 0x0045, av -> 0x0074, ParseException -> 0x0099 }
        r2 = r0.e();	 Catch:{ fN -> 0x0045, av -> 0x0074, ParseException -> 0x0099 }
        r2 = r2.h();	 Catch:{ fN -> 0x0045, av -> 0x0074, ParseException -> 0x0099 }
        r3 = 0;
        r2 = org.whispersystems.bx.a(r2, r3);	 Catch:{ fN -> 0x0045, av -> 0x0074, ParseException -> 0x0099 }
        r6.a = r2;	 Catch:{ fN -> 0x0045, av -> 0x0074, ParseException -> 0x0099 }
        r1 = org.whispersystems.aw.a(r1);	 Catch:{ fN -> 0x0045, av -> 0x0074, ParseException -> 0x0099 }
        r6.f = r1;	 Catch:{ fN -> 0x0045, av -> 0x0074, ParseException -> 0x0099 }
        r1 = r0.l();	 Catch:{ fN -> 0x0045, av -> 0x0074, ParseException -> 0x0099 }
        r6.b = r1;	 Catch:{ fN -> 0x0045, av -> 0x0074, ParseException -> 0x0099 }
        r1 = r0.i();	 Catch:{ fN -> 0x0045, av -> 0x0074, ParseException -> 0x0099 }
        r6.d = r1;	 Catch:{ fN -> 0x0045, av -> 0x0074, ParseException -> 0x0099 }
        r0 = r0.m();	 Catch:{ fN -> 0x0045, av -> 0x0074, ParseException -> 0x0099 }
        r0 = r0.h();	 Catch:{ fN -> 0x0045, av -> 0x0074, ParseException -> 0x0099 }
        r6.c = r0;	 Catch:{ fN -> 0x0045, av -> 0x0074, ParseException -> 0x0099 }
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.b.<init>(byte[]):void");
    }

    public b(int i, SecretKeySpec secretKeySpec, E e, int i2, int i3, byte[] bArr, bp bpVar, bp bpVar2) {
        byte[] bArr2 = new byte[]{aw.a(i, 3)};
        byte[] b = P.g().a(hx.a(e.a())).a(i2).b(i3).b(hx.a(bArr)).f().b();
        byte[] a = a(i, bpVar, bpVar2, secretKeySpec, aw.a(new byte[][]{bArr2, b}));
        this.e = aw.a(new byte[][]{bArr2, b, a});
        this.a = e;
        this.b = i2;
        this.d = i3;
        this.c = bArr;
        this.f = i;
    }

    public void a(int i, bp bpVar, bp bpVar2, SecretKeySpec secretKeySpec) {
        byte[][] c = aw.c(this.e, this.e.length - 8, 8);
        if (!MessageDigest.isEqual(a(i, bpVar, bpVar2, secretKeySpec, c[0]), c[1])) {
            throw new bH(z[4]);
        }
    }
}
