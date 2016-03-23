package com.google;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.v;
import org.whispersystems.at;

final class hr extends hL {
    private static final String[] z;
    private final Method k;
    private final Method l;

    static {
        String[] strArr = new String[2];
        char[] toCharArray = "u[M!0~K\\34a]K\u001e!fQK".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 18;
                    break;
                case at.g /*1*/:
                    i2 = 62;
                    break;
                case at.i /*2*/:
                    i2 = 57;
                    break;
                case at.o /*3*/:
                    i2 = 119;
                    break;
                default:
                    i2 = 81;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "d_U\u00024]X".toCharArray();
        int length2 = toCharArray.length;
        cArr = toCharArray;
        for (length = 0; length2 > length; length++) {
            c = cArr[length];
            switch (length % 5) {
                case v.m /*0*/:
                    i2 = 18;
                    break;
                case at.g /*1*/:
                    i2 = 62;
                    break;
                case at.i /*2*/:
                    i2 = 57;
                    break;
                case at.o /*3*/:
                    i2 = 119;
                    break;
                default:
                    i2 = 81;
                    break;
            }
            cArr[length] = (char) (i2 ^ c);
        }
        strArr[1] = new String(cArr).intern();
        z = strArr;
    }

    public void a(cJ cJVar, Object obj) {
        super.a(cJVar, bL.b(this.l, null, new Object[]{obj}));
    }

    hr(e0 e0Var, String str, Class cls, Class cls2) {
        super(e0Var, str, cls, cls2);
        this.l = bL.a(this.b, z[1], new Class[]{fG.class});
        this.k = bL.a(this.b, z[0], new Class[0]);
    }

    public Object b(cJ cJVar) {
        boolean z = bA.b;
        List arrayList = new ArrayList();
        for (Object b : (List) super.b(cJVar)) {
            arrayList.add(bL.b(this.k, b, new Object[0]));
            if (z) {
                break;
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public Object a(bL bLVar, int i) {
        return bL.b(this.k, super.a(bLVar, i), new Object[0]);
    }

    public Object b(bL bLVar) {
        boolean z = bA.b;
        List arrayList = new ArrayList();
        for (Object b : (List) super.b(bLVar)) {
            arrayList.add(bL.b(this.k, b, new Object[0]));
            if (z) {
                break;
            }
        }
        return Collections.unmodifiableList(arrayList);
    }
}
