package com.whatsapp;

import android.backport.util.Base64;
import com.whatsapp.protocol.bh;
import com.whatsapp.util.Log;
import java.security.Key;
import java.security.MessageDigest;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class ft implements bh {
    private static final String[] z;
    SecureRandom a;

    static {
        String[] strArr = new String[14];
        String str = "F~\u0015|\nT~Lh\u001b\u0017dXy\f\u0017a\\k\u0002VxVpO";
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
                        i3 = 55;
                        break;
                    case at.g /*1*/:
                        i3 = 12;
                        break;
                    case at.i /*2*/:
                        i3 = 53;
                        break;
                    case at.o /*3*/:
                        i3 = 24;
                        break;
                    default:
                        i3 = 111;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "F~\u0015|\nT~Lh\u001b\u0017aT{OQm\\t";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "vIf7,uO\u001aH$t_\u0002H\u000eSh\\v\b";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "vIf";
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "F~\u0015y\nD,Sy\u0006[,";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "vIf";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "vIf7,uO\u001aH$t_\u0002H\u000eSh\\v\b";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "F~\u0015}\u0001T~Lh\u001b\u0017jTq\u0003\u0017";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "F~\u0015}\u0001T~Lh\u001b\u0017aT{OQm\\t";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "F~\u0015}\u0001T~Lh\u001b\u0017mPkOQm\\t";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "\u007faT{<\u007fM\u0007-Y";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    str = "F~\u0015p\u0002Vo\u0015~\u000e^`\u0015";
                    obj = 11;
                    i = 12;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    strArr2 = strArr3;
                    str = "\u007faT{<\u007fM\u0007-Y";
                    obj = 12;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "F~\u0015|\nT~Lh\u001b\u0017jTq\u0003\u0017";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public static byte[] b(byte[] bArr, byte[] bArr2) {
        Object obj = new byte[(bArr.length + bArr2.length)];
        System.arraycopy(bArr, 0, obj, 0, bArr.length);
        System.arraycopy(bArr2, 0, obj, bArr.length, bArr2.length);
        return obj;
    }

    public byte[] b(byte[] bArr) {
        byte[] bArr2 = null;
        byte[] bArr3 = wn.n;
        byte[] bArr4 = wn.k;
        if (!(bArr3 == null || bArr4 == null || bArr == null)) {
            try {
                byte[] bArr5 = new byte[16];
                this.a.nextBytes(bArr5);
                bArr3 = a(bArr3, bArr5, bArr);
                if (bArr3 == null) {
                    Log.e(z[10]);
                } else {
                    bArr3 = b(bArr5, bArr3);
                    bArr4 = a(bArr4, bArr3);
                    if (bArr4 == null) {
                        Log.e(z[9]);
                    } else {
                        bArr2 = b(bArr4, bArr3);
                    }
                }
            } catch (Exception e) {
                Log.e(z[8] + e);
            }
        }
        return bArr2;
    }

    public byte[] a(byte[] bArr) {
        byte[] bArr2 = null;
        byte[] bArr3 = wn.n;
        byte[] bArr4 = wn.k;
        if (!(bArr3 == null || bArr4 == null || bArr == null)) {
            try {
                Object obj = new byte[32];
                Object obj2 = new byte[(bArr.length - 32)];
                System.arraycopy(bArr, 0, obj, 0, obj.length);
                System.arraycopy(bArr, obj.length, obj2, 0, obj2.length);
                bArr4 = a(bArr4, obj2);
                if (bArr4 == null) {
                    Log.e(z[2]);
                } else if (MessageDigest.isEqual(obj, bArr4)) {
                    Object obj3 = new byte[16];
                    obj = new byte[(obj2.length - 16)];
                    System.arraycopy(obj2, 0, obj3, 0, obj3.length);
                    System.arraycopy(obj2, obj3.length, obj, 0, obj.length);
                    Key secretKeySpec = new SecretKeySpec(bArr3, z[4]);
                    Cipher instance = Cipher.getInstance(z[3]);
                    instance.init(2, secretKeySpec, new IvParameterSpec(obj3));
                    bArr2 = instance.doFinal(obj);
                } else {
                    Log.e(z[0] + Base64.encodeToString(obj, 2) + ' ' + Base64.encodeToString(bArr4, 2));
                }
            } catch (Exception e) {
                Log.e(z[1] + e);
            }
        }
        return bArr2;
    }

    public ft() {
        this.a = new SecureRandom();
    }

    public static byte[] a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] bArr4 = null;
        if (!(bArr == null || bArr2 == null || bArr3 == null)) {
            try {
                Key secretKeySpec = new SecretKeySpec(bArr, z[6]);
                Cipher instance = Cipher.getInstance(z[7]);
                instance.init(1, secretKeySpec, new IvParameterSpec(bArr2));
                bArr4 = instance.doFinal(bArr3);
            } catch (Exception e) {
                Log.e(z[5] + e);
            }
        }
        return bArr4;
    }

    public static byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = null;
        if (bArr != null) {
            try {
                Key secretKeySpec = new SecretKeySpec(bArr, z[13]);
                Mac instance = Mac.getInstance(z[11]);
                instance.init(secretKeySpec);
                bArr3 = instance.doFinal(bArr2);
            } catch (Exception e) {
                Log.e(z[12] + e);
            }
        }
        return bArr3;
    }
}
