package org.spongycastle.jcajce.provider.symmetric.util;

import java.security.InvalidKeyException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactorySpi;
import javax.crypto.spec.SecretKeySpec;
import org.v;
import org.whispersystems.at;

public class BaseSecretKeyFactory extends SecretKeyFactorySpi implements PBE {
    private static final String[] z;
    protected String algName;

    static {
        int i;
        int i2;
        String[] strArr = new String[5];
        char[] toCharArray = "f,\u0007<Bh*^\u001fS\u007f(\u0013\nFh;^\u0006A-'\u000b\u0003^".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 13;
                    break;
                case at.g /*1*/:
                    i2 = 73;
                    break;
                case at.i /*2*/:
                    i2 = 126;
                    break;
                case at.o /*3*/:
                    i2 = 111;
                    break;
                default:
                    i2 = 50;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "f,\u0007OBl;\u001f\u0002Wy,\fO[~i\u0010\u001a^a".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 13;
                    break;
                case at.g /*1*/:
                    i2 = 73;
                    break;
                case at.i /*2*/:
                    i2 = 126;
                    break;
                case at.o /*3*/:
                    i2 = 111;
                    break;
                default:
                    i2 = 50;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[1] = new String(cArr).intern();
        toCharArray = "D'\b\u000e^d-^$Wt\u001a\u000e\nQ".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 13;
                    break;
                case at.g /*1*/:
                    i2 = 73;
                    break;
                case at.i /*2*/:
                    i2 = 126;
                    break;
                case at.o /*3*/:
                    i2 = 111;
                    break;
                default:
                    i2 = 50;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[2] = new String(cArr).intern();
        toCharArray = "F,\u0007O\\b=^\u0000T-=\u0007\u001fW-".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 13;
                    break;
                case at.g /*1*/:
                    i2 = 73;
                    break;
                case at.i /*2*/:
                    i2 = 126;
                    break;
                case at.o /*3*/:
                    i2 = 111;
                    break;
                default:
                    i2 = 50;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[3] = new String(cArr).intern();
        toCharArray = "f,\u0007OBl;\u001f\u0002Wy,\fO[~i\u0010\u001a^a".toCharArray();
        int length2 = toCharArray.length;
        cArr = toCharArray;
        for (length = 0; length2 > length; length++) {
            c = cArr[length];
            switch (length % 5) {
                case v.m /*0*/:
                    i2 = 13;
                    break;
                case at.g /*1*/:
                    i2 = 73;
                    break;
                case at.i /*2*/:
                    i2 = 126;
                    break;
                case at.o /*3*/:
                    i2 = 111;
                    break;
                default:
                    i2 = 50;
                    break;
            }
            cArr[length] = (char) (i2 ^ c);
        }
        strArr[4] = new String(cArr).intern();
        z = strArr;
    }

    protected KeySpec engineGetKeySpec(SecretKey secretKey, Class cls) {
        if (cls == null) {
            try {
                throw new InvalidKeySpecException(z[0]);
            } catch (Exception e) {
                throw e;
            }
        } else if (secretKey == null) {
            try {
                throw new InvalidKeySpecException(z[1]);
            } catch (Exception e2) {
                throw e2;
            }
        } else {
            try {
                if (SecretKeySpec.class.isAssignableFrom(cls)) {
                    return new SecretKeySpec(secretKey.getEncoded(), this.algName);
                }
                try {
                    return (KeySpec) cls.getConstructor(new Class[]{byte[].class}).newInstance(new Object[]{secretKey.getEncoded()});
                } catch (Exception e22) {
                    throw new InvalidKeySpecException(e22.toString());
                }
            } catch (Exception e222) {
                throw e222;
            }
        }
    }

    protected SecretKey engineTranslateKey(SecretKey secretKey) {
        if (secretKey == null) {
            throw new InvalidKeyException(z[4]);
        } else if (secretKey.getAlgorithm().equalsIgnoreCase(this.algName)) {
            return new SecretKeySpec(secretKey.getEncoded(), this.algName);
        } else {
            throw new InvalidKeyException(z[3] + this.algName + ".");
        }
    }

    protected SecretKey engineGenerateSecret(KeySpec keySpec) {
        if (keySpec instanceof SecretKeySpec) {
            return (SecretKey) keySpec;
        }
        throw new InvalidKeySpecException(z[2]);
    }

    protected BaseSecretKeyFactory(String str) {
        this.algName = str;
    }
}
