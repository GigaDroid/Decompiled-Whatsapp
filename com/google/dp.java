package com.google;

import org.v;
import org.whispersystems.at;

public enum dp implements ij {
    ;
    
    public static final dp CORD;
    public static final int CORD_VALUE = 1;
    public static final dp STRING;
    public static final dp STRING_PIECE;
    public static final int STRING_PIECE_VALUE = 2;
    public static final int STRING_VALUE = 0;
    private static final dp[] a;
    private static final dp[] c;
    private static eR e;
    private static final String[] z;
    private final int b;
    private final int d;

    public static dp valueOf(int i) {
        switch (i) {
            case v.m /*0*/:
                try {
                    return STRING;
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            case CORD_VALUE:
                return CORD;
            case STRING_PIECE_VALUE:
                return STRING_PIECE;
            default:
                return null;
        }
    }

    public final int getNumber() {
        return this.b;
    }

    public static dp valueOf(fG fGVar) {
        try {
            if (fGVar.a() == getDescriptor()) {
                return a[fGVar.b()];
            }
            throw new IllegalArgumentException(z[0]);
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public static eR internalGetValueMap() {
        return e;
    }

    private dp(int i, int i2) {
        this.d = i;
        this.b = i2;
    }

    static {
        int i;
        String[] strArr = new String[4];
        char[] toCharArray = "\tF[\"%-D[*7)[M=\u001a<\\A=S%[\u000e!\u001c8\bH \u0001l\\F&\u0000l\\W?\u0016b".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (i = 0; length > i; i += CORD_VALUE) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 76;
                    break;
                case CORD_VALUE:
                    i2 = 40;
                    break;
                case STRING_PIECE_VALUE:
                    i2 = 46;
                    break;
                case at.o /*3*/:
                    i2 = 79;
                    break;
                default:
                    i2 = 115;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "\u001f||\u0006=\u000b".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i += CORD_VALUE) {
            c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 76;
                    break;
                case CORD_VALUE:
                    i2 = 40;
                    break;
                case STRING_PIECE_VALUE:
                    i2 = 46;
                    break;
                case at.o /*3*/:
                    i2 = 79;
                    break;
                default:
                    i2 = 115;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[CORD_VALUE] = new String(cArr).intern();
        toCharArray = "\u000fg|\u000b".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i += CORD_VALUE) {
            c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 76;
                    break;
                case CORD_VALUE:
                    i2 = 40;
                    break;
                case STRING_PIECE_VALUE:
                    i2 = 46;
                    break;
                case at.o /*3*/:
                    i2 = 79;
                    break;
                default:
                    i2 = 115;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[STRING_PIECE_VALUE] = new String(cArr).intern();
        toCharArray = "\u001f||\u0006=\u000bw~\u00066\u000fm".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i += CORD_VALUE) {
            char c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 76;
                    break;
                case CORD_VALUE:
                    i2 = 40;
                    break;
                case STRING_PIECE_VALUE:
                    i2 = 46;
                    break;
                case at.o /*3*/:
                    i2 = 79;
                    break;
                default:
                    i2 = 115;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[3] = new String(cArr).intern();
        z = strArr;
        STRING = new dp(z[CORD_VALUE], 0, 0, 0);
        CORD = new dp(z[STRING_PIECE_VALUE], CORD_VALUE, CORD_VALUE, CORD_VALUE);
        STRING_PIECE = new dp(z[3], STRING_PIECE_VALUE, STRING_PIECE_VALUE, STRING_PIECE_VALUE);
        c = new dp[]{STRING, CORD, STRING_PIECE};
        e = new gn();
        a = values();
    }

    public final fG getValueDescriptor() {
        return (fG) getDescriptor().a().get(this.d);
    }

    public final c1 getDescriptorForType() {
        return getDescriptor();
    }

    public static final c1 getDescriptor() {
        return (c1) cY.f().g().get(0);
    }
}
