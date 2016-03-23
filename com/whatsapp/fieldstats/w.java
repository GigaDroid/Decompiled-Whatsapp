package com.whatsapp.fieldstats;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import org.v;
import org.whispersystems.at;

public final class w {
    private static final String[] z;

    static {
        String[] strArr = new String[7];
        String str = "J>X\u007fz~jFsz~>B6}jjF\u007fyp>Or4m%\n'$+~\nC@_g\u00126v`>Oe";
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
                        i3 = 25;
                        break;
                    case at.g /*1*/:
                        i3 = 74;
                        break;
                    case at.i /*2*/:
                        i3 = 42;
                        break;
                    case at.o /*3*/:
                        i3 = 22;
                        break;
                    default:
                        i3 = 20;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "p.\nyamjEp4k+Dqq";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "o+Fcq9)Kxzv>\ntq9$_zx";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "J>X\u007fz~jKxp9\u000eEcvu/\nwf|j^~q9%Dzm99_fdv8^sp9<Kza|j^od|9";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "L\u001el;,";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "m#GsYp&F\u007fg9%_b4v,\nduw-O";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "L\u001el;,";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public static ByteBuffer b() {
        return ByteBuffer.allocate(16);
    }

    public static void a(byte b, int i, long j, String str, ByteBuffer byteBuffer) {
        a(b, i, j, (Object) str, byteBuffer);
    }

    private static void a(byte b, int i, long j, Object obj, ByteBuffer byteBuffer) {
        if (obj == null) {
            try {
                throw new NullPointerException(z[3]);
            } catch (UnsupportedEncodingException e) {
                throw e;
            }
        }
        try {
            if ((obj instanceof Double) || (obj instanceof String)) {
                if (obj instanceof String) {
                    try {
                        if (((String) obj).getBytes(z[1]).length > 1024) {
                            throw new IllegalArgumentException(z[0]);
                        }
                    } catch (NullPointerException e2) {
                        throw e2;
                    } catch (Throwable e3) {
                        throw new Error(e3);
                    }
                }
                if (i < 0 || i >= 16777216) {
                    try {
                        throw new IllegalArgumentException(z[2]);
                    } catch (UnsupportedEncodingException e4) {
                        throw e4;
                    }
                }
                try {
                    if (j / 1000 < 0 || j / 1000 >= 4294967296L) {
                        throw new IllegalArgumentException(z[6]);
                    }
                    byteBuffer.put(b);
                    byteBuffer.put((byte) i);
                    byteBuffer.put((byte) (i >> 8));
                    byteBuffer.put((byte) (i >> 16));
                    int i2 = (int) (j / 1000);
                    byteBuffer.put((byte) i2);
                    byteBuffer.put((byte) (i2 >> 8));
                    byteBuffer.put((byte) (i2 >> 16));
                    byteBuffer.put((byte) (i2 >> 24));
                    if (obj instanceof String) {
                        try {
                            byte[] bytes = ((String) obj).getBytes(z[5]);
                            try {
                                byteBuffer.put((byte) bytes.length);
                                byteBuffer.put((byte) (bytes.length >> 8));
                                byteBuffer.put(bytes);
                                if (b7.a == 0) {
                                    return;
                                }
                            } catch (UnsupportedEncodingException e42) {
                                throw e42;
                            }
                        } catch (Throwable e32) {
                            throw new Error(e32);
                        }
                    }
                    if (obj instanceof Double) {
                        long doubleToRawLongBits = Double.doubleToRawLongBits(((Double) obj).doubleValue());
                        byteBuffer.put((byte) ((int) doubleToRawLongBits));
                        byteBuffer.put((byte) ((int) (doubleToRawLongBits >> 8)));
                        byteBuffer.put((byte) ((int) (doubleToRawLongBits >> 16)));
                        byteBuffer.put((byte) ((int) (doubleToRawLongBits >> 24)));
                        byteBuffer.put((byte) ((int) (doubleToRawLongBits >> 32)));
                        byteBuffer.put((byte) ((int) (doubleToRawLongBits >> 40)));
                        byteBuffer.put((byte) ((int) (doubleToRawLongBits >> 48)));
                        byteBuffer.put((byte) ((int) (doubleToRawLongBits >> 56)));
                        return;
                    }
                    return;
                } catch (UnsupportedEncodingException e422) {
                    throw e422;
                } catch (UnsupportedEncodingException e4222) {
                    throw e4222;
                }
            }
            throw new IllegalArgumentException(z[4]);
        } catch (UnsupportedEncodingException e42222) {
            throw e42222;
        } catch (UnsupportedEncodingException e422222) {
            throw e422222;
        }
    }

    public static void a(byte b, int i, long j, Double d, ByteBuffer byteBuffer) {
        a(b, i, j, (Object) d, byteBuffer);
    }

    public static ByteBuffer a() {
        return ByteBuffer.allocate(1034);
    }
}
