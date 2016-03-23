package com.google;

import org.v;

public enum A implements ij {
    ;
    
    public static final A CODE_SIZE;
    public static final int CODE_SIZE_VALUE = 2;
    public static final A LITE_RUNTIME;
    public static final int LITE_RUNTIME_VALUE = 3;
    public static final A SPEED;
    public static final int SPEED_VALUE = 1;
    private static final A[] a;
    private static eR d;
    private static final A[] e;
    private static final String[] z;
    private final int b;
    private final int c;

    public static final c1 getDescriptor() {
        return (c1) cU.w().g().get(0);
    }

    public final int getNumber() {
        return this.b;
    }

    private A(int i, int i2) {
        this.c = i;
        this.b = i2;
    }

    public static A valueOf(fG fGVar) {
        try {
            if (fGVar.a() == getDescriptor()) {
                return e[fGVar.b()];
            }
            throw new IllegalArgumentException(z[0]);
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public final c1 getDescriptorForType() {
        return getDescriptor();
    }

    public final fG getValueDescriptor() {
        return (fG) getDescriptor().a().get(this.c);
    }

    public static A valueOf(int i) {
        switch (i) {
            case SPEED_VALUE:
                try {
                    return SPEED;
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            case CODE_SIZE_VALUE:
                return CODE_SIZE;
            case LITE_RUNTIME_VALUE:
                return LITE_RUNTIME;
            default:
                return null;
        }
    }

    public static eR internalGetValueMap() {
        return d;
    }

    static {
        int i;
        int i2;
        String[] strArr = new String[4];
        char[] toCharArray = "\u0011\u0017+G\u00105\u0015+O\u00021\n=X/$\r1Xf=\n~D) Y8E4t\r6C5t\r'Z#z".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (i = 0; length > i; i += SPEED_VALUE) {
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 84;
                    break;
                case SPEED_VALUE:
                    i2 = 121;
                    break;
                case CODE_SIZE_VALUE:
                    i2 = 94;
                    break;
                case LITE_RUNTIME_VALUE:
                    i2 = 42;
                    break;
                default:
                    i2 = 70;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "\u00180\no\u0019\u0006,\u0010~\u000f\u0019<".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i += SPEED_VALUE) {
            c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 84;
                    break;
                case SPEED_VALUE:
                    i2 = 121;
                    break;
                case CODE_SIZE_VALUE:
                    i2 = 94;
                    break;
                case LITE_RUNTIME_VALUE:
                    i2 = 42;
                    break;
                default:
                    i2 = 70;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[SPEED_VALUE] = new String(cArr).intern();
        toCharArray = "\u0007)\u001bo\u0002".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i += SPEED_VALUE) {
            c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 84;
                    break;
                case SPEED_VALUE:
                    i2 = 121;
                    break;
                case CODE_SIZE_VALUE:
                    i2 = 94;
                    break;
                case LITE_RUNTIME_VALUE:
                    i2 = 42;
                    break;
                default:
                    i2 = 70;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[CODE_SIZE_VALUE] = new String(cArr).intern();
        toCharArray = "\u00176\u001ao\u0019\u00070\u0004o".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i += SPEED_VALUE) {
            c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 84;
                    break;
                case SPEED_VALUE:
                    i2 = 121;
                    break;
                case CODE_SIZE_VALUE:
                    i2 = 94;
                    break;
                case LITE_RUNTIME_VALUE:
                    i2 = 42;
                    break;
                default:
                    i2 = 70;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[LITE_RUNTIME_VALUE] = new String(cArr).intern();
        z = strArr;
        SPEED = new A(z[CODE_SIZE_VALUE], 0, 0, SPEED_VALUE);
        CODE_SIZE = new A(z[LITE_RUNTIME_VALUE], SPEED_VALUE, SPEED_VALUE, CODE_SIZE_VALUE);
        LITE_RUNTIME = new A(z[SPEED_VALUE], CODE_SIZE_VALUE, CODE_SIZE_VALUE, LITE_RUNTIME_VALUE);
        A[] aArr = new A[LITE_RUNTIME_VALUE];
        aArr[0] = SPEED;
        aArr[SPEED_VALUE] = CODE_SIZE;
        aArr[CODE_SIZE_VALUE] = LITE_RUNTIME;
        a = aArr;
        d = new iF();
        e = values();
    }
}
