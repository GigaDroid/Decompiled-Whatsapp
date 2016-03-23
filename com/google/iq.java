package com.google;

import org.v;

public enum iq implements ij {
    ;
    
    public static final iq TYPE_BOOL;
    public static final int TYPE_BOOL_VALUE = 8;
    public static final iq TYPE_BYTES;
    public static final int TYPE_BYTES_VALUE = 12;
    public static final iq TYPE_DOUBLE;
    public static final int TYPE_DOUBLE_VALUE = 1;
    public static final iq TYPE_ENUM;
    public static final int TYPE_ENUM_VALUE = 14;
    public static final iq TYPE_FIXED32;
    public static final int TYPE_FIXED32_VALUE = 7;
    public static final iq TYPE_FIXED64;
    public static final int TYPE_FIXED64_VALUE = 6;
    public static final iq TYPE_FLOAT;
    public static final int TYPE_FLOAT_VALUE = 2;
    public static final iq TYPE_GROUP;
    public static final int TYPE_GROUP_VALUE = 10;
    public static final iq TYPE_INT32;
    public static final int TYPE_INT32_VALUE = 5;
    public static final iq TYPE_INT64;
    public static final int TYPE_INT64_VALUE = 3;
    public static final iq TYPE_MESSAGE;
    public static final int TYPE_MESSAGE_VALUE = 11;
    public static final iq TYPE_SFIXED32;
    public static final int TYPE_SFIXED32_VALUE = 15;
    public static final iq TYPE_SFIXED64;
    public static final int TYPE_SFIXED64_VALUE = 16;
    public static final iq TYPE_SINT32;
    public static final int TYPE_SINT32_VALUE = 17;
    public static final iq TYPE_SINT64;
    public static final int TYPE_SINT64_VALUE = 18;
    public static final iq TYPE_STRING;
    public static final int TYPE_STRING_VALUE = 9;
    public static final iq TYPE_UINT32;
    public static final int TYPE_UINT32_VALUE = 13;
    public static final iq TYPE_UINT64;
    public static final int TYPE_UINT64_VALUE = 4;
    private static eR a;
    private static final iq[] b;
    private static final iq[] e;
    private static final String[] z;
    private final int c;
    private final int d;

    public final c1 getDescriptorForType() {
        return getDescriptor();
    }

    private iq(int i, int i2) {
        this.d = i;
        this.c = i2;
    }

    public static eR internalGetValueMap() {
        return a;
    }

    public static iq valueOf(int i) {
        switch (i) {
            case TYPE_DOUBLE_VALUE:
                try {
                    return TYPE_DOUBLE;
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            case TYPE_FLOAT_VALUE:
                return TYPE_FLOAT;
            case TYPE_INT64_VALUE:
                return TYPE_INT64;
            case TYPE_UINT64_VALUE:
                return TYPE_UINT64;
            case TYPE_INT32_VALUE:
                return TYPE_INT32;
            case TYPE_FIXED64_VALUE:
                return TYPE_FIXED64;
            case TYPE_FIXED32_VALUE:
                return TYPE_FIXED32;
            case TYPE_BOOL_VALUE:
                return TYPE_BOOL;
            case TYPE_STRING_VALUE:
                return TYPE_STRING;
            case TYPE_GROUP_VALUE:
                return TYPE_GROUP;
            case TYPE_MESSAGE_VALUE:
                return TYPE_MESSAGE;
            case TYPE_BYTES_VALUE:
                return TYPE_BYTES;
            case TYPE_UINT32_VALUE:
                return TYPE_UINT32;
            case TYPE_ENUM_VALUE:
                return TYPE_ENUM;
            case TYPE_SFIXED32_VALUE:
                return TYPE_SFIXED32;
            case TYPE_SFIXED64_VALUE:
                return TYPE_SFIXED64;
            case TYPE_SINT32_VALUE:
                return TYPE_SINT32;
            case TYPE_SINT64_VALUE:
                return TYPE_SINT64;
            default:
                return null;
        }
    }

    public static iq valueOf(fG fGVar) {
        try {
            if (fGVar.a() == getDescriptor()) {
                return e[fGVar.b()];
            }
            throw new IllegalArgumentException(z[0]);
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public final int getNumber() {
        return this.c;
    }

    static {
        int i;
        int i2;
        String[] strArr = new String[19];
        char[] toCharArray = "aYYMeE[YEwADORZTCCR\u0013MD\fN\\P\u0017JOA\u0004CDI@\u0004CUPV\n".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (i = 0; length > i; i += TYPE_DOUBLE_VALUE) {
            char c = cArr[i];
            switch (i % TYPE_INT32_VALUE) {
                case v.m /*0*/:
                    i2 = 36;
                    break;
                case TYPE_DOUBLE_VALUE:
                    i2 = 55;
                    break;
                case TYPE_FLOAT_VALUE:
                    i2 = 44;
                    break;
                case TYPE_INT64_VALUE:
                    i2 = 32;
                    break;
                default:
                    i2 = 51;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "pn|elb{cag".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i += TYPE_DOUBLE_VALUE) {
            char c2 = cArr[i];
            switch (i % TYPE_INT32_VALUE) {
                case v.m /*0*/:
                    i2 = 36;
                    break;
                case TYPE_DOUBLE_VALUE:
                    i2 = 55;
                    break;
                case TYPE_FLOAT_VALUE:
                    i2 = 44;
                    break;
                case TYPE_INT64_VALUE:
                    i2 = 32;
                    break;
                default:
                    i2 = 51;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[TYPE_DOUBLE_VALUE] = new String(cArr).intern();
        toCharArray = "pn|elq~bt\u0005\u0010".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i += TYPE_DOUBLE_VALUE) {
            c2 = cArr[i];
            switch (i % TYPE_INT32_VALUE) {
                case v.m /*0*/:
                    i2 = 36;
                    break;
                case TYPE_DOUBLE_VALUE:
                    i2 = 55;
                    break;
                case TYPE_FLOAT_VALUE:
                    i2 = 44;
                    break;
                case TYPE_INT64_VALUE:
                    i2 = 32;
                    break;
                default:
                    i2 = 51;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[TYPE_FLOAT_VALUE] = new String(cArr).intern();
        toCharArray = "pn|elw~bt\u0000\u0016".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i += TYPE_DOUBLE_VALUE) {
            c2 = cArr[i];
            switch (i % TYPE_INT32_VALUE) {
                case v.m /*0*/:
                    i2 = 36;
                    break;
                case TYPE_DOUBLE_VALUE:
                    i2 = 55;
                    break;
                case TYPE_FLOAT_VALUE:
                    i2 = 44;
                    break;
                case TYPE_INT64_VALUE:
                    i2 = 32;
                    break;
                default:
                    i2 = 51;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[TYPE_INT64_VALUE] = new String(cArr).intern();
        toCharArray = "pn|elmyx\u0016\u0007".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i += TYPE_DOUBLE_VALUE) {
            c2 = cArr[i];
            switch (i % TYPE_INT32_VALUE) {
                case v.m /*0*/:
                    i2 = 36;
                    break;
                case TYPE_DOUBLE_VALUE:
                    i2 = 55;
                    break;
                case TYPE_FLOAT_VALUE:
                    i2 = 44;
                    break;
                case TYPE_INT64_VALUE:
                    i2 = 32;
                    break;
                default:
                    i2 = 51;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[TYPE_UINT64_VALUE] = new String(cArr).intern();
        toCharArray = "pn|elq~bt\u0000\u0016".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i += TYPE_DOUBLE_VALUE) {
            c2 = cArr[i];
            switch (i % TYPE_INT32_VALUE) {
                case v.m /*0*/:
                    i2 = 36;
                    break;
                case TYPE_DOUBLE_VALUE:
                    i2 = 55;
                    break;
                case TYPE_FLOAT_VALUE:
                    i2 = 44;
                    break;
                case TYPE_INT64_VALUE:
                    i2 = 32;
                    break;
                default:
                    i2 = 51;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[TYPE_INT32_VALUE] = new String(cArr).intern();
        toCharArray = "pn|el`xyb\u007fa".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i += TYPE_DOUBLE_VALUE) {
            c2 = cArr[i];
            switch (i % TYPE_INT32_VALUE) {
                case v.m /*0*/:
                    i2 = 36;
                    break;
                case TYPE_DOUBLE_VALUE:
                    i2 = 55;
                    break;
                case TYPE_FLOAT_VALUE:
                    i2 = 44;
                    break;
                case TYPE_INT64_VALUE:
                    i2 = 32;
                    break;
                default:
                    i2 = 51;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[TYPE_FIXED64_VALUE] = new String(cArr).intern();
        toCharArray = "pn|elmyx\u0013\u0001".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i += TYPE_DOUBLE_VALUE) {
            c2 = cArr[i];
            switch (i % TYPE_INT32_VALUE) {
                case v.m /*0*/:
                    i2 = 36;
                    break;
                case TYPE_DOUBLE_VALUE:
                    i2 = 55;
                    break;
                case TYPE_FLOAT_VALUE:
                    i2 = 44;
                    break;
                case TYPE_INT64_VALUE:
                    i2 = 32;
                    break;
                default:
                    i2 = 51;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[TYPE_FIXED32_VALUE] = new String(cArr).intern();
        toCharArray = "pn|elfxcl".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i += TYPE_DOUBLE_VALUE) {
            c2 = cArr[i];
            switch (i % TYPE_INT32_VALUE) {
                case v.m /*0*/:
                    i2 = 36;
                    break;
                case TYPE_DOUBLE_VALUE:
                    i2 = 55;
                    break;
                case TYPE_FLOAT_VALUE:
                    i2 = 44;
                    break;
                case TYPE_INT64_VALUE:
                    i2 = 32;
                    break;
                default:
                    i2 = 51;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[TYPE_BOOL_VALUE] = new String(cArr).intern();
        toCharArray = "pn|elb~tew\u0012\u0003".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i += TYPE_DOUBLE_VALUE) {
            c2 = cArr[i];
            switch (i % TYPE_INT32_VALUE) {
                case v.m /*0*/:
                    i2 = 36;
                    break;
                case TYPE_DOUBLE_VALUE:
                    i2 = 55;
                    break;
                case TYPE_FLOAT_VALUE:
                    i2 = 44;
                    break;
                case TYPE_INT64_VALUE:
                    i2 = 32;
                    break;
                default:
                    i2 = 51;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[TYPE_STRING_VALUE] = new String(cArr).intern();
        toCharArray = "pn|elayym".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i += TYPE_DOUBLE_VALUE) {
            c2 = cArr[i];
            switch (i % TYPE_INT32_VALUE) {
                case v.m /*0*/:
                    i2 = 36;
                    break;
                case TYPE_DOUBLE_VALUE:
                    i2 = 55;
                    break;
                case TYPE_FLOAT_VALUE:
                    i2 = 44;
                    break;
                case TYPE_INT64_VALUE:
                    i2 = 32;
                    break;
                default:
                    i2 = 51;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[TYPE_GROUP_VALUE] = new String(cArr).intern();
        toCharArray = "pn|elfnxe`".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i += TYPE_DOUBLE_VALUE) {
            c2 = cArr[i];
            switch (i % TYPE_INT32_VALUE) {
                case v.m /*0*/:
                    i2 = 36;
                    break;
                case TYPE_DOUBLE_VALUE:
                    i2 = 55;
                    break;
                case TYPE_FLOAT_VALUE:
                    i2 = 44;
                    break;
                case TYPE_INT64_VALUE:
                    i2 = 32;
                    break;
                default:
                    i2 = 51;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[TYPE_MESSAGE_VALUE] = new String(cArr).intern();
        toCharArray = "pn|elwc~i}c".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i += TYPE_DOUBLE_VALUE) {
            c2 = cArr[i];
            switch (i % TYPE_INT32_VALUE) {
                case v.m /*0*/:
                    i2 = 36;
                    break;
                case TYPE_DOUBLE_VALUE:
                    i2 = 55;
                    break;
                case TYPE_FLOAT_VALUE:
                    i2 = 44;
                    break;
                case TYPE_INT64_VALUE:
                    i2 = 32;
                    break;
                default:
                    i2 = 51;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[TYPE_BYTES_VALUE] = new String(cArr).intern();
        toCharArray = "pn|elwqexv`\u0001\u0018".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i += TYPE_DOUBLE_VALUE) {
            c2 = cArr[i];
            switch (i % TYPE_INT32_VALUE) {
                case v.m /*0*/:
                    i2 = 36;
                    break;
                case TYPE_DOUBLE_VALUE:
                    i2 = 55;
                    break;
                case TYPE_FLOAT_VALUE:
                    i2 = 44;
                    break;
                case TYPE_INT64_VALUE:
                    i2 = 32;
                    break;
                default:
                    i2 = 51;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[TYPE_UINT32_VALUE] = new String(cArr).intern();
        toCharArray = "pn|elir\u007fsrcr".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i += TYPE_DOUBLE_VALUE) {
            c2 = cArr[i];
            switch (i % TYPE_INT32_VALUE) {
                case v.m /*0*/:
                    i2 = 36;
                    break;
                case TYPE_DOUBLE_VALUE:
                    i2 = 55;
                    break;
                case TYPE_FLOAT_VALUE:
                    i2 = 44;
                    break;
                case TYPE_INT64_VALUE:
                    i2 = 32;
                    break;
                default:
                    i2 = 51;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[TYPE_ENUM_VALUE] = new String(cArr).intern();
        toCharArray = "pn|elb~tew\u0017\u0005".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i += TYPE_DOUBLE_VALUE) {
            c2 = cArr[i];
            switch (i % TYPE_INT32_VALUE) {
                case v.m /*0*/:
                    i2 = 36;
                    break;
                case TYPE_DOUBLE_VALUE:
                    i2 = 55;
                    break;
                case TYPE_FLOAT_VALUE:
                    i2 = 44;
                    break;
                case TYPE_INT64_VALUE:
                    i2 = 32;
                    break;
                default:
                    i2 = 51;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[TYPE_SFIXED32_VALUE] = new String(cArr).intern();
        toCharArray = "pn|elcecuc".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i += TYPE_DOUBLE_VALUE) {
            c2 = cArr[i];
            switch (i % TYPE_INT32_VALUE) {
                case v.m /*0*/:
                    i2 = 36;
                    break;
                case TYPE_DOUBLE_VALUE:
                    i2 = 55;
                    break;
                case TYPE_FLOAT_VALUE:
                    i2 = 44;
                    break;
                case TYPE_INT64_VALUE:
                    i2 = 32;
                    break;
                default:
                    i2 = 51;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[TYPE_SFIXED64_VALUE] = new String(cArr).intern();
        toCharArray = "pn|elw~bt\u0005\u0010".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i += TYPE_DOUBLE_VALUE) {
            c2 = cArr[i];
            switch (i % TYPE_INT32_VALUE) {
                case v.m /*0*/:
                    i2 = 36;
                    break;
                case TYPE_DOUBLE_VALUE:
                    i2 = 55;
                    break;
                case TYPE_FLOAT_VALUE:
                    i2 = 44;
                    break;
                case TYPE_INT64_VALUE:
                    i2 = 32;
                    break;
                default:
                    i2 = 51;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[TYPE_SINT32_VALUE] = new String(cArr).intern();
        toCharArray = "pn|elwqexv`\u0004\u001e".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i += TYPE_DOUBLE_VALUE) {
            c2 = cArr[i];
            switch (i % TYPE_INT32_VALUE) {
                case v.m /*0*/:
                    i2 = 36;
                    break;
                case TYPE_DOUBLE_VALUE:
                    i2 = 55;
                    break;
                case TYPE_FLOAT_VALUE:
                    i2 = 44;
                    break;
                case TYPE_INT64_VALUE:
                    i2 = 32;
                    break;
                default:
                    i2 = 51;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[TYPE_SINT64_VALUE] = new String(cArr).intern();
        z = strArr;
        TYPE_DOUBLE = new iq(z[TYPE_FIXED64_VALUE], 0, 0, TYPE_DOUBLE_VALUE);
        TYPE_FLOAT = new iq(z[TYPE_DOUBLE_VALUE], TYPE_DOUBLE_VALUE, TYPE_DOUBLE_VALUE, TYPE_FLOAT_VALUE);
        TYPE_INT64 = new iq(z[TYPE_UINT64_VALUE], TYPE_FLOAT_VALUE, TYPE_FLOAT_VALUE, TYPE_INT64_VALUE);
        TYPE_UINT64 = new iq(z[TYPE_FLOAT_VALUE], TYPE_INT64_VALUE, TYPE_INT64_VALUE, TYPE_UINT64_VALUE);
        TYPE_INT32 = new iq(z[TYPE_FIXED32_VALUE], TYPE_UINT64_VALUE, TYPE_UINT64_VALUE, TYPE_INT32_VALUE);
        TYPE_FIXED64 = new iq(z[TYPE_STRING_VALUE], TYPE_INT32_VALUE, TYPE_INT32_VALUE, TYPE_FIXED64_VALUE);
        TYPE_FIXED32 = new iq(z[TYPE_SFIXED32_VALUE], TYPE_FIXED64_VALUE, TYPE_FIXED64_VALUE, TYPE_FIXED32_VALUE);
        TYPE_BOOL = new iq(z[TYPE_BOOL_VALUE], TYPE_FIXED32_VALUE, TYPE_FIXED32_VALUE, TYPE_BOOL_VALUE);
        TYPE_STRING = new iq(z[TYPE_BYTES_VALUE], TYPE_BOOL_VALUE, TYPE_BOOL_VALUE, TYPE_STRING_VALUE);
        TYPE_GROUP = new iq(z[TYPE_SFIXED64_VALUE], TYPE_STRING_VALUE, TYPE_STRING_VALUE, TYPE_GROUP_VALUE);
        TYPE_MESSAGE = new iq(z[TYPE_ENUM_VALUE], TYPE_GROUP_VALUE, TYPE_GROUP_VALUE, TYPE_MESSAGE_VALUE);
        TYPE_BYTES = new iq(z[TYPE_MESSAGE_VALUE], TYPE_MESSAGE_VALUE, TYPE_MESSAGE_VALUE, TYPE_BYTES_VALUE);
        TYPE_UINT32 = new iq(z[TYPE_INT32_VALUE], TYPE_BYTES_VALUE, TYPE_BYTES_VALUE, TYPE_UINT32_VALUE);
        TYPE_ENUM = new iq(z[TYPE_GROUP_VALUE], TYPE_UINT32_VALUE, TYPE_UINT32_VALUE, TYPE_ENUM_VALUE);
        TYPE_SFIXED32 = new iq(z[TYPE_SINT64_VALUE], TYPE_ENUM_VALUE, TYPE_ENUM_VALUE, TYPE_SFIXED32_VALUE);
        TYPE_SFIXED64 = new iq(z[TYPE_UINT32_VALUE], TYPE_SFIXED32_VALUE, TYPE_SFIXED32_VALUE, TYPE_SFIXED64_VALUE);
        TYPE_SINT32 = new iq(z[TYPE_INT64_VALUE], TYPE_SFIXED64_VALUE, TYPE_SFIXED64_VALUE, TYPE_SINT32_VALUE);
        TYPE_SINT64 = new iq(z[TYPE_SINT32_VALUE], TYPE_SINT32_VALUE, TYPE_SINT32_VALUE, TYPE_SINT64_VALUE);
        iq[] iqVarArr = new iq[TYPE_SINT64_VALUE];
        iqVarArr[0] = TYPE_DOUBLE;
        iqVarArr[TYPE_DOUBLE_VALUE] = TYPE_FLOAT;
        iqVarArr[TYPE_FLOAT_VALUE] = TYPE_INT64;
        iqVarArr[TYPE_INT64_VALUE] = TYPE_UINT64;
        iqVarArr[TYPE_UINT64_VALUE] = TYPE_INT32;
        iqVarArr[TYPE_INT32_VALUE] = TYPE_FIXED64;
        iqVarArr[TYPE_FIXED64_VALUE] = TYPE_FIXED32;
        iqVarArr[TYPE_FIXED32_VALUE] = TYPE_BOOL;
        iqVarArr[TYPE_BOOL_VALUE] = TYPE_STRING;
        iqVarArr[TYPE_STRING_VALUE] = TYPE_GROUP;
        iqVarArr[TYPE_GROUP_VALUE] = TYPE_MESSAGE;
        iqVarArr[TYPE_MESSAGE_VALUE] = TYPE_BYTES;
        iqVarArr[TYPE_BYTES_VALUE] = TYPE_UINT32;
        iqVarArr[TYPE_UINT32_VALUE] = TYPE_ENUM;
        iqVarArr[TYPE_ENUM_VALUE] = TYPE_SFIXED32;
        iqVarArr[TYPE_SFIXED32_VALUE] = TYPE_SFIXED64;
        iqVarArr[TYPE_SFIXED64_VALUE] = TYPE_SINT32;
        iqVarArr[TYPE_SINT32_VALUE] = TYPE_SINT64;
        b = iqVarArr;
        a = new e1();
        e = values();
    }

    public final fG getValueDescriptor() {
        return (fG) getDescriptor().a().get(this.d);
    }

    public static final c1 getDescriptor() {
        return (c1) b6.e().g().get(0);
    }
}
