package com.google;

import java.util.Collections;
import java.util.List;
import org.v;
import org.whispersystems.at;

public class x extends RuntimeException {
    private static final long serialVersionUID = -7466929953374883507L;
    private static final String[] z;
    private final List a;

    static {
        int i;
        int i2;
        String[] strArr = new String[3];
        char[] toCharArray = "\\\u0013~R\u0011v\u0013-V\u0011bV`H\u0003b\u001fcFPc\u0013|T\u0019c\u0013i\u0001\u0016x\u0013aE\u0003?V-\t<x\u0002h\u0001\u0002d\u0018yH\u001dtVnN\u0005}\u0012-O\u001feViD\u0004t\u0004`H\u001etVzI\u0019r\u001e-G\u0019t\u001aiRPf\u0013\u007fDP|\u001f~R\u0019\u007f\u0011$\u000f".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 17;
                    break;
                case at.g /*1*/:
                    i2 = 118;
                    break;
                case at.i /*2*/:
                    i2 = 13;
                    break;
                case at.o /*3*/:
                    i2 = 33;
                    break;
                default:
                    i2 = 112;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "\\\u0013~R\u0011v\u0013-L\u0019b\u0005dO\u00171\u0004hP\u0005x\u0004hEPw\u001fhM\u0014bL-".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 17;
                    break;
                case at.g /*1*/:
                    i2 = 118;
                    break;
                case at.i /*2*/:
                    i2 = 13;
                    break;
                case at.o /*3*/:
                    i2 = 33;
                    break;
                default:
                    i2 = 112;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[1] = new String(cArr).intern();
        toCharArray = "=V".toCharArray();
        int length2 = toCharArray.length;
        cArr = toCharArray;
        for (length = 0; length2 > length; length++) {
            c = cArr[length];
            switch (length % 5) {
                case v.m /*0*/:
                    i2 = 17;
                    break;
                case at.g /*1*/:
                    i2 = 118;
                    break;
                case at.i /*2*/:
                    i2 = 13;
                    break;
                case at.o /*3*/:
                    i2 = 33;
                    break;
                default:
                    i2 = 112;
                    break;
            }
            cArr[length] = (char) (i2 ^ c);
        }
        strArr[2] = new String(cArr).intern();
        z = strArr;
    }

    public x(List list) {
        super(a(list));
        this.a = list;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String a(java.util.List r7) {
        /*
        r0 = 1;
        r2 = com.google.bA.b;
        r3 = new java.lang.StringBuilder;
        r1 = z;
        r1 = r1[r0];
        r3.<init>(r1);
        r4 = r7.iterator();
        r1 = r0;
    L_0x0011:
        r0 = r4.hasNext();
        if (r0 == 0) goto L_0x002f;
    L_0x0017:
        r0 = r4.next();
        r0 = (java.lang.String) r0;
        if (r1 == 0) goto L_0x0022;
    L_0x001f:
        r1 = 0;
        if (r2 == 0) goto L_0x002a;
    L_0x0022:
        r5 = z;	 Catch:{ x -> 0x0034 }
        r6 = 2;
        r5 = r5[r6];	 Catch:{ x -> 0x0034 }
        r3.append(r5);	 Catch:{ x -> 0x0034 }
    L_0x002a:
        r3.append(r0);
        if (r2 == 0) goto L_0x0011;
    L_0x002f:
        r0 = r3.toString();
        return r0;
    L_0x0034:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.x.a(java.util.List):java.lang.String");
    }

    public fN b() {
        return new fN(getMessage());
    }

    public x(fO fOVar) {
        super(z[0]);
        this.a = null;
    }

    public List a() {
        return Collections.unmodifiableList(this.a);
    }
}
