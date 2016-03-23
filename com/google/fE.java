package com.google;

import org.v;
import org.whispersystems.at;

public final class fE {
    private static final String[] z;
    private final Object a;
    private final fO b;
    private final fO c;
    private final s d;

    static {
        String[] strArr = new String[2];
        char[] toCharArray = "E2.\u0002?h(,\u001a~b)+\u0000x_>2\u000b[n!#\u001bs\u007f\u000e,\u001dkj)!\u000b".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 11;
                    break;
                case at.g /*1*/:
                    i2 = 71;
                    break;
                case at.i /*2*/:
                    i2 = 66;
                    break;
                case at.o /*3*/:
                    i2 = 110;
                    break;
                default:
                    i2 = 31;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "E2.\u0002?f\"1\u001d~l\"\u0006\u000byj2.\u001aVe46\u000fqh\"".toCharArray();
        int length2 = toCharArray.length;
        cArr = toCharArray;
        for (length = 0; length2 > length; length++) {
            c = cArr[length];
            switch (length % 5) {
                case v.m /*0*/:
                    i2 = 11;
                    break;
                case at.g /*1*/:
                    i2 = 71;
                    break;
                case at.i /*2*/:
                    i2 = 66;
                    break;
                case at.o /*3*/:
                    i2 = 110;
                    break;
                default:
                    i2 = 31;
                    break;
            }
            cArr[length] = (char) (i2 ^ c);
        }
        strArr[1] = new String(cArr).intern();
        z = strArr;
    }

    public fO a() {
        return this.c;
    }

    static s a(fE fEVar) {
        return fEVar.d;
    }

    static Object c(fE fEVar) {
        return fEVar.a;
    }

    private fE(fO fOVar, Object obj, fO fOVar2, s sVar) {
        if (fOVar == null) {
            throw new IllegalArgumentException(z[0]);
        }
        try {
            if (sVar.d() == eK.MESSAGE && fOVar2 == null) {
                throw new IllegalArgumentException(z[1]);
            }
            this.c = fOVar;
            this.a = obj;
            this.b = fOVar2;
            this.d = sVar;
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    public int b() {
        return this.d.e();
    }

    fE(fO fOVar, Object obj, fO fOVar2, s sVar, dS dSVar) {
        this(fOVar, obj, fOVar2, sVar);
    }

    static fO b(fE fEVar) {
        return fEVar.b;
    }
}
