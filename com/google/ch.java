package com.google;

import com.whatsapp.arj;
import org.v;
import org.whispersystems.at;

public abstract class ch implements il {
    private static final String[] z;

    static {
        String[] strArr = new String[2];
        char[] toCharArray = ".\u0015h]\f\u0012\u0017)_\u0017\u0013\u001d)XE>\t}\\6\b\u0002`W\u0002\\\u0004aK\u0000\u000bPhWE5?LA\u0006\u0019\u0000}P\n\u0012P!J\r\u0013\u0005e]E\u0012\u0015\u007f\\\u0017\\\u0018hI\u0015\u0019\u001e \u0017".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 124;
                    break;
                case at.g /*1*/:
                    i2 = 112;
                    break;
                case at.i /*2*/:
                    i2 = 9;
                    break;
                case at.o /*3*/:
                    i2 = 57;
                    break;
                default:
                    i2 = arj.Theme_buttonStyleSmall;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = ".\u0015h]\f\u0012\u0017)_\u0017\u0013\u001d)XE\u001e\t}\\E\u001d\u0002{X\u001c\\\u0004aK\u0000\u000bPhWE5?LA\u0006\u0019\u0000}P\n\u0012P!J\r\u0013\u0005e]E\u0012\u0015\u007f\\\u0017\\\u0018hI\u0015\u0019\u001e \u0017".toCharArray();
        int length2 = toCharArray.length;
        cArr = toCharArray;
        for (length = 0; length2 > length; length++) {
            c = cArr[length];
            switch (length % 5) {
                case v.m /*0*/:
                    i2 = 124;
                    break;
                case at.g /*1*/:
                    i2 = 112;
                    break;
                case at.i /*2*/:
                    i2 = 9;
                    break;
                case at.o /*3*/:
                    i2 = 57;
                    break;
                default:
                    i2 = arj.Theme_buttonStyleSmall;
                    break;
            }
            cArr[length] = (char) (i2 ^ c);
        }
        strArr[1] = new String(cArr).intern();
        z = strArr;
    }

    public abstract ch clone();

    public abstract ch mergeFrom(ad adVar, h hVar);

    public il m293a(byte[] bArr) {
        return a(bArr);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected static void a(java.lang.Iterable r4, java.util.Collection r5) {
        /*
        r2 = com.google.bA.b;
        r1 = r4 instanceof com.google.fs;	 Catch:{ RuntimeException -> 0x0036 }
        if (r1 == 0) goto L_0x0013;
    L_0x0006:
        r0 = r4;
        r0 = (com.google.fs) r0;	 Catch:{ RuntimeException -> 0x0038 }
        r1 = r0;
        r1 = r1.a();	 Catch:{ RuntimeException -> 0x0038 }
        a(r1);	 Catch:{ RuntimeException -> 0x0038 }
        if (r2 == 0) goto L_0x0016;
    L_0x0013:
        a(r4);	 Catch:{ RuntimeException -> 0x0038 }
    L_0x0016:
        r1 = r4 instanceof java.util.Collection;
        if (r1 == 0) goto L_0x0022;
    L_0x001a:
        r1 = r4;
        r1 = (java.util.Collection) r1;
        r5.addAll(r1);
        if (r2 == 0) goto L_0x0035;
    L_0x0022:
        r1 = r4.iterator();
    L_0x0026:
        r3 = r1.hasNext();
        if (r3 == 0) goto L_0x0035;
    L_0x002c:
        r3 = r1.next();
        r5.add(r3);
        if (r2 == 0) goto L_0x0026;
    L_0x0035:
        return;
    L_0x0036:
        r1 = move-exception;
        throw r1;	 Catch:{ RuntimeException -> 0x0038 }
    L_0x0038:
        r1 = move-exception;
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ch.a(java.lang.Iterable, java.util.Collection):void");
    }

    public ch a(hx hxVar, h hVar) {
        try {
            ad f = hxVar.f();
            mergeFrom(f, hVar);
            f.e(0);
            return this;
        } catch (fN e) {
            throw e;
        } catch (Throwable e2) {
            throw new RuntimeException(z[0], e2);
        }
    }

    public Object m294clone() {
        return clone();
    }

    public il m295mergeFrom(ad adVar, h hVar) {
        return mergeFrom(adVar, hVar);
    }

    public ch a(byte[] bArr, int i, int i2) {
        try {
            ad a = ad.a(bArr, i, i2);
            a(a);
            a.e(0);
            return this;
        } catch (fN e) {
            throw e;
        } catch (Throwable e2) {
            throw new RuntimeException(z[1], e2);
        }
    }

    public ch a(byte[] bArr) {
        return a(bArr, 0, bArr.length);
    }

    private static void a(Iterable iterable) {
        boolean z = bA.b;
        for (Object obj : iterable) {
            if (obj == null) {
                try {
                    throw new NullPointerException();
                } catch (RuntimeException e) {
                    throw e;
                }
            } else if (z) {
                return;
            }
        }
    }

    public ch a(ad adVar) {
        return mergeFrom(adVar, h.a());
    }
}
