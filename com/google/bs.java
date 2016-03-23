package com.google;

import com.whatsapp.arj;
import org.v;
import org.whispersystems.at;

public abstract class bs implements fO {
    public static int a;
    private static final String[] z;

    static {
        int i;
        String[] strArr = new String[2];
        char[] toCharArray = "1\nn\fc\u000e\u0006f\fl\u0005Oh\n\"\u0003O^\u001cv\u0007<h\u0017k\f\b<\u0011j\u0010\nkEc\fOU*G\u001a\fy\u0015v\u000b\u0000rE*\u0011\u0007s\u0010n\u0006Or\u0000t\u0007\u001d<\rc\u0012\u001fy\u000b+L".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i2 = 0; length > i2; i2++) {
            char c = cArr[i2];
            switch (i2 % 5) {
                case v.m /*0*/:
                    i = 98;
                    break;
                case at.g /*1*/:
                    i = 111;
                    break;
                case at.i /*2*/:
                    i = 28;
                    break;
                case at.o /*3*/:
                    i = arj.Theme_buttonStyleSmall;
                    break;
                default:
                    i = 2;
                    break;
            }
            cArr[i2] = (char) (i ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "1\nn\fc\u000e\u0006f\fl\u0005Oh\n\"\u0003O~\u001cv\u0007O}\u0017p\u0003\u0016<\u0011j\u0010\nkEc\fOU*G\u001a\fy\u0015v\u000b\u0000rE*\u0011\u0007s\u0010n\u0006Or\u0000t\u0007\u001d<\rc\u0012\u001fy\u000b+L".toCharArray();
        int length2 = toCharArray.length;
        cArr = toCharArray;
        for (length = 0; length2 > length; length++) {
            c = cArr[length];
            switch (length % 5) {
                case v.m /*0*/:
                    i = 98;
                    break;
                case at.g /*1*/:
                    i = 111;
                    break;
                case at.i /*2*/:
                    i = 28;
                    break;
                case at.o /*3*/:
                    i = arj.Theme_buttonStyleSmall;
                    break;
                default:
                    i = 2;
                    break;
            }
            cArr[length] = (char) (i ^ c);
        }
        strArr[1] = new String(cArr).intern();
        z = strArr;
    }

    public hx a() {
        try {
            c9 a = hx.a(getSerializedSize());
            writeTo(a.b());
            return a.a();
        } catch (Throwable e) {
            throw new RuntimeException(z[0], e);
        }
    }

    public byte[] b() {
        try {
            byte[] bArr = new byte[getSerializedSize()];
            eb a = eb.a(bArr);
            writeTo(a);
            a.a();
            return bArr;
        } catch (Throwable e) {
            throw new RuntimeException(z[1], e);
        }
    }

    x m121a() {
        return new x((fO) this);
    }
}
