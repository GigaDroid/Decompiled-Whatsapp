package com.whatsapp;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.v;
import org.whispersystems.at;
import org.whispersystems.bd;

public abstract class mt {
    private static final String[] z;

    static {
        String[] strArr = new String[5];
        String str = "1\u0012jl\u000f1>9:j";
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
                        i3 = 121;
                        break;
                    case at.g /*1*/:
                        i3 = 127;
                        break;
                    case at.i /*2*/:
                        i3 = 11;
                        break;
                    case at.o /*3*/:
                        i3 = 15;
                        break;
                    default:
                        i3 = 92;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "0\u0011}n0\u0010\u001b+c9\u0017\u0018\u007fg|\u0016\u0019+k9\u000b\u0016}j8Y\fnl.\u001c\u000b0/0\u001c\u0011l{4D";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "8:X \u001f;<$_\u0017:,>_=\u001d\u001bba;";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "8:X";
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "1\u0012jl\u000f1>9:j";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    static Mac a(byte[] bArr, byte[] bArr2) {
        Object e;
        try {
            Mac instance = Mac.getInstance(z[1]);
            instance.init(new SecretKeySpec(bArr2, z[0]));
            instance.update(bArr);
            return instance;
        } catch (NoSuchAlgorithmException e2) {
            e = e2;
            throw new AssertionError(e);
        } catch (InvalidKeyException e3) {
            e = e3;
            throw new AssertionError(e);
        }
    }

    static Cipher a(byte[] bArr, byte[] bArr2, int i) {
        Object e;
        try {
            Cipher instance = Cipher.getInstance(z[3]);
            instance.init(i, new SecretKeySpec(bArr2, z[4]), new IvParameterSpec(bArr));
            return instance;
        } catch (NoSuchAlgorithmException e2) {
            e = e2;
            throw new AssertionError(e);
        } catch (NoSuchPaddingException e3) {
            e = e3;
            throw new AssertionError(e);
        } catch (InvalidAlgorithmParameterException e4) {
            e = e4;
            throw new AssertionError(e);
        } catch (InvalidKeyException e5) {
            e = e5;
            throw new AssertionError(e);
        }
    }

    public static vq a(byte[] bArr, String str) {
        int i = vq.d;
        Object b = new bd().b(bArr, str.getBytes(), 112);
        if (b.length != 112) {
            throw new AssertionError(z[2] + b.length);
        }
        Object obj = new byte[16];
        System.arraycopy(b, 0, obj, 0, obj.length);
        int length = obj.length + 0;
        Object obj2 = new byte[32];
        System.arraycopy(b, length, obj2, 0, obj2.length);
        length += obj2.length;
        Object obj3 = new byte[32];
        System.arraycopy(b, length, obj3, 0, obj3.length);
        Object obj4 = new byte[32];
        System.arraycopy(b, length + obj3.length, obj4, 0, obj4.length);
        vq vqVar = new vq(obj2, obj3, obj, obj4);
        if (i != 0) {
            WAAppCompatActivity.c++;
        }
        return vqVar;
    }
}
