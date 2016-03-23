package org.whispersystems;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.v;

public class i {
    public static final Object a;
    private static final String[] z;
    private final n b;
    private final aM c;
    private final j d;
    private final I e;

    public byte[] a(b bVar, az azVar) {
        byte[] a;
        synchronized (a) {
            if (this.e.b(this.d)) {
                b0 a2 = this.e.a(this.d);
                a = a(a2, bVar);
                azVar.a(a);
                this.e.a(this.d, a2);
            } else {
                throw new bX(z[0] + this.d);
            }
        }
        return a;
    }

    public byte[] a(w wVar) {
        return a(wVar, new F(null));
    }

    private cd a(t tVar, E e) {
        try {
            if (tVar.c(e)) {
                return tVar.a(e);
            }
            C a = tVar.n().a(e, tVar.b());
            e a2 = bx.a();
            C a3 = ((h) a.a()).a(e, a2);
            tVar.a((h) a3.a());
            tVar.b(e, (cd) a.b());
            tVar.a(Math.max(tVar.h().d() - 1, 0));
            tVar.a(a2, (cd) a3.b());
            return (cd) a.b();
        } catch (Throwable e2) {
            throw new bH(e2);
        }
    }

    private byte[] a(t tVar, b bVar) {
        if (!tVar.f()) {
            throw new bH(z[3]);
        } else if (bVar.c() != tVar.p()) {
            throw new bH(String.format(z[2], new Object[]{Integer.valueOf(bVar.c()), Integer.valueOf(tVar.p())}));
        } else {
            int c = bVar.c();
            E b = bVar.b();
            an a = a(tVar, b, a(tVar, b), bVar.d());
            bVar.a(c, tVar.o(), tVar.e(), a.b());
            byte[] b2 = b(c, a, bVar.a());
            tVar.d();
            return b2;
        }
    }

    public m a(byte[] bArr) {
        m wVar;
        boolean z = av.a;
        synchronized (a) {
            b0 a = this.e.a(this.d);
            t a2 = a.a();
            cd h = a2.h();
            an b = h.b();
            E i = a2.i();
            int g = a2.g();
            int p = a2.p();
            b bVar = new b(p, b.b(), i, h.d(), g, a(p, b, bArr), a2.e(), a2.o());
            if (a2.l()) {
                bu a3 = a2.a();
                wVar = new w(p, a2.m(), a3.b(), a3.c(), a3.a(), a2.e(), bVar);
            } else {
                Object obj = bVar;
            }
            a2.a(h.a());
            this.e.a(this.d, a);
        }
        if (a5.o) {
            av.a = !z;
        }
        return wVar;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private byte[] a(int r4, org.whispersystems.an r5, byte[] r6) {
        /*
        r3 = this;
        r0 = 3;
        if (r4 < r0) goto L_0x0014;
    L_0x0003:
        r0 = 1;
        r1 = r5.d();	 Catch:{ IllegalBlockSizeException -> 0x002d, BadPaddingException -> 0x0026 }
        r2 = r5.a();	 Catch:{ IllegalBlockSizeException -> 0x002d, BadPaddingException -> 0x0026 }
        r0 = r3.a(r0, r1, r2);	 Catch:{ IllegalBlockSizeException -> 0x002d, BadPaddingException -> 0x0026 }
        r1 = org.whispersystems.av.a;	 Catch:{ IllegalBlockSizeException -> 0x002d, BadPaddingException -> 0x0026 }
        if (r1 == 0) goto L_0x0021;
    L_0x0014:
        r0 = 1;
        r1 = r5.d();	 Catch:{ IllegalBlockSizeException -> 0x002d, BadPaddingException -> 0x0026 }
        r2 = r5.c();	 Catch:{ IllegalBlockSizeException -> 0x002d, BadPaddingException -> 0x0026 }
        r0 = r3.a(r0, r1, r2);	 Catch:{ IllegalBlockSizeException -> 0x002d, BadPaddingException -> 0x0026 }
    L_0x0021:
        r0 = r0.doFinal(r6);	 Catch:{ IllegalBlockSizeException -> 0x002d, BadPaddingException -> 0x0026 }
        return r0;
    L_0x0026:
        r0 = move-exception;
    L_0x0027:
        r1 = new java.lang.AssertionError;
        r1.<init>(r0);
        throw r1;
    L_0x002d:
        r0 = move-exception;
        goto L_0x0027;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.i.a(int, org.whispersystems.an, byte[]):byte[]");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private byte[] b(int r4, org.whispersystems.an r5, byte[] r6) {
        /*
        r3 = this;
        r0 = 3;
        if (r4 < r0) goto L_0x0014;
    L_0x0003:
        r0 = 2;
        r1 = r5.d();	 Catch:{ IllegalBlockSizeException -> 0x002d, BadPaddingException -> 0x0026 }
        r2 = r5.a();	 Catch:{ IllegalBlockSizeException -> 0x002d, BadPaddingException -> 0x0026 }
        r0 = r3.a(r0, r1, r2);	 Catch:{ IllegalBlockSizeException -> 0x002d, BadPaddingException -> 0x0026 }
        r1 = org.whispersystems.av.a;	 Catch:{ IllegalBlockSizeException -> 0x002d, BadPaddingException -> 0x0026 }
        if (r1 == 0) goto L_0x0021;
    L_0x0014:
        r0 = 2;
        r1 = r5.d();	 Catch:{ IllegalBlockSizeException -> 0x002d, BadPaddingException -> 0x0026 }
        r2 = r5.c();	 Catch:{ IllegalBlockSizeException -> 0x002d, BadPaddingException -> 0x0026 }
        r0 = r3.a(r0, r1, r2);	 Catch:{ IllegalBlockSizeException -> 0x002d, BadPaddingException -> 0x0026 }
    L_0x0021:
        r0 = r0.doFinal(r6);	 Catch:{ IllegalBlockSizeException -> 0x002d, BadPaddingException -> 0x0026 }
        return r0;
    L_0x0026:
        r0 = move-exception;
    L_0x0027:
        r1 = new org.whispersystems.bH;
        r1.<init>(r0);
        throw r1;
    L_0x002d:
        r0 = move-exception;
        goto L_0x0027;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.i.b(int, org.whispersystems.an, byte[]):byte[]");
    }

    public i(I i, aM aMVar, ai aiVar, ab abVar, j jVar) {
        this.e = i;
        this.c = aMVar;
        this.d = jVar;
        this.b = new n(i, aMVar, aiVar, abVar, jVar);
    }

    private byte[] a(b0 b0Var, b bVar) {
        byte[] a;
        synchronized (a) {
            Iterator it = b0Var.e().iterator();
            List linkedList = new LinkedList();
            try {
                r4 = new t(b0Var.a());
                a = a(r4, bVar);
                b0Var.b(r4);
            } catch (bH e) {
                linkedList.add(e);
                do {
                    if (!it.hasNext()) {
                        break;
                    }
                    try {
                        t tVar;
                        tVar = new t((t) it.next());
                        a = a(tVar, bVar);
                        it.remove();
                        b0Var.a(tVar);
                    } catch (bH e2) {
                        linkedList.add(e2);
                        if (av.a) {
                            throw new bH(z[4], linkedList);
                        }
                    }
                } while (av.a);
                throw new bH(z[4], linkedList);
            }
        }
        return a;
    }

    private an a(t tVar, E e, cd cdVar, int i) {
        boolean z = av.a;
        if (cdVar.d() > i) {
            if (tVar.b(e, i)) {
                return tVar.a(e, i);
            }
            throw new ar(z[6] + cdVar.d() + z[7] + i);
        } else if (i - cdVar.d() > 2000) {
            throw new bH(z[5]);
        } else {
            while (cdVar.d() < i) {
                tVar.a(e, cdVar.b());
                cdVar = cdVar.a();
                if (z) {
                    break;
                }
            }
            tVar.a(e, cdVar.a());
            return cdVar.b();
        }
    }

    static {
        String[] strArr = new String[9];
        String str = "4^!q\u0010\tBhm\u001bZWnpOZ";
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
                        i3 = 122;
                        break;
                    case at.g /*1*/:
                        i3 = 49;
                        break;
                    case at.i /*2*/:
                        i3 = 1;
                        break;
                    case at.o /*3*/:
                        i3 = 2;
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
                    str = "7Trq\u0014\u001dT!t\u0010\bBhm\u001bZ\u0014e.U\u0018Du\"\u0006\u001fBrk\u001a\u0014\u0011wg\u0007\tXnlU_U";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "/_hl\u001c\u000eX`n\u001c\u0000Te\"\u0006\u001fBrk\u001a\u0014\u0010";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "4^!t\u0014\u0016Xe\"\u0006\u001fBrk\u001a\u0014B/";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "5GdpUH\u000112U\u0017Trq\u0014\u001dTr\"\u001c\u0014En\"\u0001\u0012T!d\u0000\u000eDsgT";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "(Tbg\u001c\fTe\"\u0018\u001fBrc\u0012\u001f\u0011vk\u0001\u0012\u0011nn\u0011ZRnw\u001b\u000eTs8U";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "Z\u001d!";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = ";tR-68r.R>9b4R\u0014\u001eUhl\u0012";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    z = strArr3;
                    a = new Object();
                    return;
                default:
                    strArr2[i] = str;
                    str = ";tR-6.c.L\u001a*Pef\u001c\u0014V";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    private Cipher a(int i, SecretKeySpec secretKeySpec, IvParameterSpec ivParameterSpec) {
        Object e;
        try {
            Cipher instance = Cipher.getInstance(z[8]);
            instance.init(i, secretKeySpec, ivParameterSpec);
            return instance;
        } catch (NoSuchAlgorithmException e2) {
            e = e2;
            throw new AssertionError(e);
        } catch (NoSuchPaddingException e3) {
            e = e3;
            throw new AssertionError(e);
        } catch (InvalidKeyException e4) {
            e = e4;
            throw new AssertionError(e);
        } catch (InvalidAlgorithmParameterException e5) {
            e = e5;
            throw new AssertionError(e);
        }
    }

    public byte[] a(b bVar) {
        return a(bVar, new F(null));
    }

    private Cipher a(int i, SecretKeySpec secretKeySpec, int i2) {
        Object e;
        try {
            Cipher instance = Cipher.getInstance(z[1]);
            byte[] bArr = new byte[16];
            aw.d(bArr, 0, i2);
            instance.init(i, secretKeySpec, new IvParameterSpec(bArr));
            return instance;
        } catch (NoSuchAlgorithmException e2) {
            e = e2;
            throw new AssertionError(e);
        } catch (NoSuchPaddingException e3) {
            e = e3;
            throw new AssertionError(e);
        } catch (InvalidKeyException e4) {
            e = e4;
            throw new AssertionError(e);
        } catch (InvalidAlgorithmParameterException e5) {
            e = e5;
            throw new AssertionError(e);
        }
    }

    public byte[] a(w wVar, az azVar) {
        byte[] a;
        synchronized (a) {
            b0 a2 = this.e.a(this.d);
            o b = this.b.b(a2, wVar);
            a = a(a2, wVar.c());
            azVar.a(a);
            this.e.a(this.d, a2);
            if (b.a()) {
                this.c.c(((Integer) b.c()).intValue());
            }
        }
        return a;
    }
}
