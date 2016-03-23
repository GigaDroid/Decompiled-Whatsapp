package com.google;

import org.v;

public enum cw implements ij {
    ;
    
    public static final cw LABEL_OPTIONAL;
    public static final int LABEL_OPTIONAL_VALUE = 1;
    public static final cw LABEL_REPEATED;
    public static final int LABEL_REPEATED_VALUE = 3;
    public static final cw LABEL_REQUIRED;
    public static final int LABEL_REQUIRED_VALUE = 2;
    private static final cw[] a;
    private static final cw[] c;
    private static eR d;
    private static final String[] z;
    private final int b;
    private final int e;

    public final c1 getDescriptorForType() {
        return getDescriptor();
    }

    public static eR internalGetValueMap() {
        return d;
    }

    private cw(int i, int i2) {
        this.e = i;
        this.b = i2;
    }

    public final fG getValueDescriptor() {
        return (fG) getDescriptor().a().get(this.e);
    }

    static {
        int i;
        int i2;
        String[] strArr = new String[4];
        char[] toCharArray = "\u001f0|});2|u;?-jb\u0016**fb_3-)~\u0010.~o\u007f\rz*ay\fz*p`\u001at".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (i = 0; length > i; i += LABEL_OPTIONAL_VALUE) {
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 90;
                    break;
                case LABEL_OPTIONAL_VALUE:
                    i2 = 94;
                    break;
                case LABEL_REQUIRED_VALUE:
                    i2 = 9;
                    break;
                case LABEL_REPEATED_VALUE:
                    i2 = 16;
                    break;
                default:
                    i2 = 127;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "\u0016\u001fKU3\u0005\fL@:\u001b\nLT".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i += LABEL_OPTIONAL_VALUE) {
            c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 90;
                    break;
                case LABEL_OPTIONAL_VALUE:
                    i2 = 94;
                    break;
                case LABEL_REQUIRED_VALUE:
                    i2 = 9;
                    break;
                case LABEL_REPEATED_VALUE:
                    i2 = 16;
                    break;
                default:
                    i2 = 127;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[LABEL_OPTIONAL_VALUE] = new String(cArr).intern();
        toCharArray = "\u0016\u001fKU3\u0005\u0011YD6\u0015\u0010H\\".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i += LABEL_OPTIONAL_VALUE) {
            c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 90;
                    break;
                case LABEL_OPTIONAL_VALUE:
                    i2 = 94;
                    break;
                case LABEL_REQUIRED_VALUE:
                    i2 = 9;
                    break;
                case LABEL_REPEATED_VALUE:
                    i2 = 16;
                    break;
                default:
                    i2 = 127;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[LABEL_REQUIRED_VALUE] = new String(cArr).intern();
        toCharArray = "\u0016\u001fKU3\u0005\fLA*\u0013\fLT".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i += LABEL_OPTIONAL_VALUE) {
            c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 90;
                    break;
                case LABEL_OPTIONAL_VALUE:
                    i2 = 94;
                    break;
                case LABEL_REQUIRED_VALUE:
                    i2 = 9;
                    break;
                case LABEL_REPEATED_VALUE:
                    i2 = 16;
                    break;
                default:
                    i2 = 127;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[LABEL_REPEATED_VALUE] = new String(cArr).intern();
        z = strArr;
        LABEL_OPTIONAL = new cw(z[LABEL_REQUIRED_VALUE], 0, 0, LABEL_OPTIONAL_VALUE);
        LABEL_REQUIRED = new cw(z[LABEL_REPEATED_VALUE], LABEL_OPTIONAL_VALUE, LABEL_OPTIONAL_VALUE, LABEL_REQUIRED_VALUE);
        LABEL_REPEATED = new cw(z[LABEL_OPTIONAL_VALUE], LABEL_REQUIRED_VALUE, LABEL_REQUIRED_VALUE, LABEL_REPEATED_VALUE);
        cw[] cwVarArr = new cw[LABEL_REPEATED_VALUE];
        cwVarArr[0] = LABEL_OPTIONAL;
        cwVarArr[LABEL_OPTIONAL_VALUE] = LABEL_REQUIRED;
        cwVarArr[LABEL_REQUIRED_VALUE] = LABEL_REPEATED;
        c = cwVarArr;
        d = new f9();
        a = values();
    }

    public static cw valueOf(int i) {
        switch (i) {
            case LABEL_OPTIONAL_VALUE:
                try {
                    return LABEL_OPTIONAL;
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            case LABEL_REQUIRED_VALUE:
                return LABEL_REQUIRED;
            case LABEL_REPEATED_VALUE:
                return LABEL_REPEATED;
            default:
                return null;
        }
    }

    public static cw valueOf(fG fGVar) {
        try {
            if (fGVar.a() == getDescriptor()) {
                return a[fGVar.b()];
            }
            throw new IllegalArgumentException(z[0]);
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public final int getNumber() {
        return this.b;
    }

    public static final c1 getDescriptor() {
        return (c1) b6.e().g().get(LABEL_OPTIONAL_VALUE);
    }
}
