package org.spongycastle.jcajce.provider.symmetric.util;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.BadPaddingException;
import javax.crypto.CipherSpi;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;
import javax.crypto.spec.RC5ParameterSpec;
import org.spongycastle.crypto.Wrapper;
import org.spongycastle.jcajce.util.BCJcaJceHelper;
import org.spongycastle.jcajce.util.JcaJceHelper;
import org.spongycastle.util.Arrays;
import org.v;
import org.whispersystems.at;

public abstract class BaseWrapCipher extends CipherSpi implements PBE {
    private static final String[] z;
    private Class[] availableSpecs;
    protected AlgorithmParameters engineParams;
    private final JcaJceHelper helper;
    private byte[] iv;
    private int ivSize;
    protected Wrapper wrapEngine;

    static {
        int i;
        int i2;
        String[] strArr = new String[13];
        char[] toCharArray = "i\\7=;^\u001d.!5Z\u001d26-\u0006\u001d7&8F\u001d<=7EY0=3\u0004".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 42;
                    break;
                case at.g /*1*/:
                    i2 = 61;
                    break;
                case at.i /*2*/:
                    i2 = 89;
                    break;
                case at.o /*3*/:
                    i2 = 83;
                    break;
                default:
                    i2 = 84;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "z\u007f\u001cs&OL,:&ONy\u0003\u0016o\u001d)2&KP<'1XNy';\n_<s'OIw".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 42;
                    break;
                case at.g /*1*/:
                    i2 = 61;
                    break;
                case at.i /*2*/:
                    i2 = 89;
                    break;
                case at.o /*3*/:
                    i2 = 83;
                    break;
                default:
                    i2 = 84;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[1] = new String(cArr).intern();
        toCharArray = "OX<8u".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 42;
                    break;
                case at.g /*1*/:
                    i2 = 61;
                    break;
                case at.i /*2*/:
                    i2 = 89;
                    break;
                case at.o /*3*/:
                    i2 = 83;
                    break;
                default:
                    i2 = 84;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[2] = new String(cArr).intern();
        toCharArray = "OS>::O\u001d6=8S\u001d/28CYy5;X\u001d.!5ZM0=3".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 42;
                    break;
                case at.g /*1*/:
                    i2 = 61;
                    break;
                case at.i /*2*/:
                    i2 = 89;
                    break;
                case at.o /*3*/:
                    i2 = 83;
                    break;
                default:
                    i2 = 84;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[3] = new String(cArr).intern();
        toCharArray = "I\\7t \nU8=0FXy#5X\\46 OOy".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 42;
                    break;
                case at.g /*1*/:
                    i2 = 61;
                    break;
                case at.i /*2*/:
                    i2 = 89;
                    break;
                case at.o /*3*/:
                    i2 = 83;
                    break;
                default:
                    i2 = 84;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[4] = new String(cArr).intern();
        toCharArray = "DR-s'_M)<&^X=s2EOy$&KM)::M".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 42;
                    break;
                case at.g /*1*/:
                    i2 = 61;
                    break;
                case at.i /*2*/:
                    i2 = 89;
                    break;
                case at.o /*3*/:
                    i2 = 83;
                    break;
                default:
                    i2 = 84;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[5] = new String(cArr).intern();
        toCharArray = "I\\7t \nN,#$EO-s9EY<s".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 42;
                    break;
                case at.g /*1*/:
                    i2 = 61;
                    break;
                case at.i /*2*/:
                    i2 = 89;
                    break;
                case at.o /*3*/:
                    i2 = 83;
                    break;
                default:
                    i2 = 84;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[6] = new String(cArr).intern();
        toCharArray = "DR-s'_M)<&^X=s2EOy$&KM)::M".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 42;
                    break;
                case at.g /*1*/:
                    i2 = 61;
                    break;
                case at.i /*2*/:
                    i2 = 89;
                    break;
                case at.o /*3*/:
                    i2 = 83;
                    break;
                default:
                    i2 = 84;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[7] = new String(cArr).intern();
        toCharArray = "z\\=7=DZy".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 42;
                    break;
                case at.g /*1*/:
                    i2 = 61;
                    break;
                case at.i /*2*/:
                    i2 = 89;
                    break;
                case at.o /*3*/:
                    i2 = 83;
                    break;
                default:
                    i2 = 84;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[8] = new String(cArr).intern();
        toCharArray = "\nH78:EJ7}".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 42;
                    break;
                case at.g /*1*/:
                    i2 = 61;
                    break;
                case at.i /*2*/:
                    i2 = 89;
                    break;
                case at.o /*3*/:
                    i2 = 83;
                    break;
                default:
                    i2 = 84;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[9] = new String(cArr).intern();
        toCharArray = "\u007fS2=;]Sy81S\u001d-*$O\u001d".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 42;
                    break;
                case at.g /*1*/:
                    i2 = 61;
                    break;
                case at.i /*2*/:
                    i2 = 89;
                    break;
                case at.o /*3*/:
                    i2 = 83;
                    break;
                default:
                    i2 = 84;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[10] = new String(cArr).intern();
        toCharArray = "\u007fS2=;]Sy81S\u001d-*$O\u001d".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 42;
                    break;
                case at.g /*1*/:
                    i2 = 61;
                    break;
                case at.i /*2*/:
                    i2 = 89;
                    break;
                case at.o /*3*/:
                    i2 = 83;
                    break;
                default:
                    i2 = 84;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[11] = new String(cArr).intern();
        toCharArray = "\u007fS2=;]Sy81S\u001d-*$O\u001d".toCharArray();
        int length2 = toCharArray.length;
        cArr = toCharArray;
        for (length = 0; length2 > length; length++) {
            c = cArr[length];
            switch (length % 5) {
                case v.m /*0*/:
                    i2 = 42;
                    break;
                case at.g /*1*/:
                    i2 = 61;
                    break;
                case at.i /*2*/:
                    i2 = 89;
                    break;
                case at.o /*3*/:
                    i2 = 83;
                    break;
                default:
                    i2 = 84;
                    break;
            }
            cArr[length] = (char) (i2 ^ c);
        }
        strArr[12] = new String(cArr).intern();
        z = strArr;
    }

    protected BaseWrapCipher(Wrapper wrapper) {
        this(wrapper, 0);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void engineInit(int r5, java.security.Key r6, java.security.spec.AlgorithmParameterSpec r7, java.security.SecureRandom r8) {
        /*
        r4 = this;
        r2 = org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator.a;
        r0 = r6 instanceof org.spongycastle.jcajce.provider.symmetric.util.BCPBEKey;
        if (r0 == 0) goto L_0x0037;
    L_0x0006:
        r0 = r6;
        r0 = (org.spongycastle.jcajce.provider.symmetric.util.BCPBEKey) r0;
        r1 = r7 instanceof javax.crypto.spec.PBEParameterSpec;
        if (r1 == 0) goto L_0x0019;
    L_0x000d:
        r1 = r4.wrapEngine;
        r1 = r1.getAlgorithmName();
        r1 = org.spongycastle.jcajce.provider.symmetric.util.PBE.Util.makePBEParameters(r0, r7, r1);
        if (r2 == 0) goto L_0x0034;
    L_0x0019:
        r1 = r0.getParam();	 Catch:{ IllegalArgumentException -> 0x0032 }
        if (r1 == 0) goto L_0x0025;
    L_0x001f:
        r0 = r0.getParam();
        if (r2 == 0) goto L_0x0035;
    L_0x0025:
        r0 = new java.security.InvalidAlgorithmParameterException;	 Catch:{ IllegalArgumentException -> 0x0030 }
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x0030 }
        r2 = 1;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x0030 }
        r0.<init>(r1);	 Catch:{ IllegalArgumentException -> 0x0030 }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0030 }
    L_0x0030:
        r0 = move-exception;
        throw r0;
    L_0x0032:
        r0 = move-exception;
        throw r0;
    L_0x0034:
        r0 = r1;
    L_0x0035:
        if (r2 == 0) goto L_0x0040;
    L_0x0037:
        r0 = new org.spongycastle.crypto.params.KeyParameter;
        r1 = r6.getEncoded();
        r0.<init>(r1);
    L_0x0040:
        r1 = r7 instanceof javax.crypto.spec.IvParameterSpec;
        if (r1 == 0) goto L_0x0050;
    L_0x0044:
        r7 = (javax.crypto.spec.IvParameterSpec) r7;
        r1 = new org.spongycastle.crypto.params.ParametersWithIV;
        r3 = r7.getIV();
        r1.<init>(r0, r3);
        r0 = r1;
    L_0x0050:
        r1 = r0 instanceof org.spongycastle.crypto.params.KeyParameter;	 Catch:{ IllegalArgumentException -> 0x007f }
        if (r1 == 0) goto L_0x00a2;
    L_0x0054:
        r1 = r4.ivSize;	 Catch:{ IllegalArgumentException -> 0x007f }
        if (r1 == 0) goto L_0x00a2;
    L_0x0058:
        r1 = r4.ivSize;
        r1 = new byte[r1];
        r4.iv = r1;
        r1 = r4.iv;
        r8.nextBytes(r1);
        r1 = new org.spongycastle.crypto.params.ParametersWithIV;
        r3 = r4.iv;
        r1.<init>(r0, r3);
    L_0x006a:
        if (r8 == 0) goto L_0x00a0;
    L_0x006c:
        r0 = new org.spongycastle.crypto.params.ParametersWithRandom;
        r0.<init>(r1, r8);
    L_0x0071:
        switch(r5) {
            case 1: goto L_0x0091;
            case 2: goto L_0x0091;
            case 3: goto L_0x0081;
            case 4: goto L_0x0089;
            default: goto L_0x0074;
        };
    L_0x0074:
        r0 = java.lang.System.out;
        r1 = z;
        r2 = 2;
        r1 = r1[r2];
        r0.println(r1);
    L_0x007e:
        return;
    L_0x007f:
        r0 = move-exception;
        throw r0;
    L_0x0081:
        r1 = r4.wrapEngine;	 Catch:{ IllegalArgumentException -> 0x009e }
        r3 = 1;
        r1.init(r3, r0);	 Catch:{ IllegalArgumentException -> 0x009e }
        if (r2 == 0) goto L_0x007e;
    L_0x0089:
        r1 = r4.wrapEngine;	 Catch:{ IllegalArgumentException -> 0x009c }
        r3 = 0;
        r1.init(r3, r0);	 Catch:{ IllegalArgumentException -> 0x009c }
        if (r2 == 0) goto L_0x007e;
    L_0x0091:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x009c }
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x009c }
        r2 = 3;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x009c }
        r0.<init>(r1);	 Catch:{ IllegalArgumentException -> 0x009c }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x009c }
    L_0x009c:
        r0 = move-exception;
        throw r0;
    L_0x009e:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x009c }
    L_0x00a0:
        r0 = r1;
        goto L_0x0071;
    L_0x00a2:
        r1 = r0;
        goto L_0x006a;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.spongycastle.jcajce.provider.symmetric.util.BaseWrapCipher.engineInit(int, java.security.Key, java.security.spec.AlgorithmParameterSpec, java.security.SecureRandom):void");
    }

    protected byte[] engineGetIV() {
        return Arrays.clone(this.iv);
    }

    protected BaseWrapCipher(Wrapper wrapper, int i) {
        this.availableSpecs = new Class[]{IvParameterSpec.class, PBEParameterSpec.class, RC2ParameterSpec.class, RC5ParameterSpec.class};
        this.engineParams = null;
        this.wrapEngine = null;
        this.helper = new BCJcaJceHelper();
        this.wrapEngine = wrapper;
        this.ivSize = i;
    }

    protected void engineSetMode(String str) {
        throw new NoSuchAlgorithmException(z[6] + str);
    }

    protected byte[] engineUpdate(byte[] bArr, int i, int i2) {
        throw new RuntimeException(z[7]);
    }

    protected int engineGetBlockSize() {
        return 0;
    }

    protected int engineGetKeySize(Key key) {
        return key.getEncoded().length;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected java.security.Key engineUnwrap(byte[] r6, java.lang.String r7, int r8) {
        /*
        r5 = this;
        r0 = r5.wrapEngine;	 Catch:{ InvalidCipherTextException -> 0x0020, BadPaddingException -> 0x002b, IllegalBlockSizeException -> 0x0036 }
        if (r0 != 0) goto L_0x000e;
    L_0x0004:
        r0 = 0;
        r1 = r6.length;	 Catch:{ InvalidCipherTextException -> 0x0020, BadPaddingException -> 0x002b, IllegalBlockSizeException -> 0x0036 }
        r0 = r5.engineDoFinal(r6, r0, r1);	 Catch:{ InvalidCipherTextException -> 0x0020, BadPaddingException -> 0x002b, IllegalBlockSizeException -> 0x0036 }
        r1 = org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator.a;	 Catch:{ InvalidCipherTextException -> 0x0020, BadPaddingException -> 0x002b, IllegalBlockSizeException -> 0x0036 }
        if (r1 == 0) goto L_0x0016;
    L_0x000e:
        r0 = r5.wrapEngine;	 Catch:{ InvalidCipherTextException -> 0x0020, BadPaddingException -> 0x002b, IllegalBlockSizeException -> 0x0036 }
        r1 = 0;
        r2 = r6.length;	 Catch:{ InvalidCipherTextException -> 0x0020, BadPaddingException -> 0x002b, IllegalBlockSizeException -> 0x0036 }
        r0 = r0.unwrap(r6, r1, r2);	 Catch:{ InvalidCipherTextException -> 0x0020, BadPaddingException -> 0x002b, IllegalBlockSizeException -> 0x0036 }
    L_0x0016:
        r1 = 3;
        if (r8 != r1) goto L_0x0043;
    L_0x0019:
        r1 = new javax.crypto.spec.SecretKeySpec;	 Catch:{ InvalidCipherTextException -> 0x0041 }
        r1.<init>(r0, r7);	 Catch:{ InvalidCipherTextException -> 0x0041 }
        r0 = r1;
    L_0x001f:
        return r0;
    L_0x0020:
        r0 = move-exception;
        r1 = new java.security.InvalidKeyException;
        r0 = r0.getMessage();
        r1.<init>(r0);
        throw r1;
    L_0x002b:
        r0 = move-exception;
        r1 = new java.security.InvalidKeyException;
        r0 = r0.getMessage();
        r1.<init>(r0);
        throw r1;
    L_0x0036:
        r0 = move-exception;
        r1 = new java.security.InvalidKeyException;
        r0 = r0.getMessage();
        r1.<init>(r0);
        throw r1;
    L_0x0041:
        r0 = move-exception;
        throw r0;
    L_0x0043:
        r1 = r5.helper;	 Catch:{ NoSuchProviderException -> 0x0065, InvalidKeySpecException -> 0x0087 }
        r1 = r1.createKeyFactory(r7);	 Catch:{ NoSuchProviderException -> 0x0065, InvalidKeySpecException -> 0x0087 }
        r2 = 1;
        if (r8 != r2) goto L_0x0056;
    L_0x004c:
        r2 = new java.security.spec.X509EncodedKeySpec;	 Catch:{ NoSuchProviderException -> 0x0065, InvalidKeySpecException -> 0x0087 }
        r2.<init>(r0);	 Catch:{ NoSuchProviderException -> 0x0065, InvalidKeySpecException -> 0x0087 }
        r0 = r1.generatePublic(r2);	 Catch:{ NoSuchProviderException -> 0x0065, InvalidKeySpecException -> 0x0087 }
        goto L_0x001f;
    L_0x0056:
        r2 = 2;
        if (r8 != r2) goto L_0x00a9;
    L_0x0059:
        r2 = new java.security.spec.PKCS8EncodedKeySpec;	 Catch:{ InvalidCipherTextException -> 0x0063 }
        r2.<init>(r0);	 Catch:{ InvalidCipherTextException -> 0x0063 }
        r0 = r1.generatePrivate(r2);	 Catch:{ InvalidCipherTextException -> 0x0063 }
        goto L_0x001f;
    L_0x0063:
        r0 = move-exception;
        throw r0;
    L_0x0065:
        r0 = move-exception;
        r1 = new java.security.InvalidKeyException;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r4 = 10;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r0 = r0.getMessage();
        r0 = r2.append(r0);
        r0 = r0.toString();
        r1.<init>(r0);
        throw r1;
    L_0x0087:
        r0 = move-exception;
        r1 = new java.security.InvalidKeyException;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r4 = 11;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r0 = r0.getMessage();
        r0 = r2.append(r0);
        r0 = r0.toString();
        r1.<init>(r0);
        throw r1;
    L_0x00a9:
        r0 = new java.security.InvalidKeyException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r3 = 12;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r1 = r1.append(r8);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.spongycastle.jcajce.provider.symmetric.util.BaseWrapCipher.engineUnwrap(byte[], java.lang.String, int):java.security.Key");
    }

    protected int engineGetOutputSize(int i) {
        return -1;
    }

    protected final AlgorithmParameters createParametersInstance(String str) {
        return this.helper.createAlgorithmParameters(str);
    }

    protected byte[] engineWrap(Key key) {
        byte[] encoded = key.getEncoded();
        if (encoded == null) {
            try {
                throw new InvalidKeyException(z[0]);
            } catch (BadPaddingException e) {
                throw e;
            }
        }
        try {
            if (this.wrapEngine == null) {
                encoded = engineDoFinal(encoded, 0, encoded.length);
            } else {
                try {
                    encoded = this.wrapEngine.wrap(encoded, 0, encoded.length);
                } catch (BadPaddingException e2) {
                    throw new IllegalBlockSizeException(e2.getMessage());
                }
            }
            return encoded;
        } catch (IllegalArgumentException e3) {
            throw e3;
        }
    }

    protected BaseWrapCipher() {
        this.availableSpecs = new Class[]{IvParameterSpec.class, PBEParameterSpec.class, RC2ParameterSpec.class, RC5ParameterSpec.class};
        this.engineParams = null;
        this.wrapEngine = null;
        this.helper = new BCJcaJceHelper();
    }

    protected int engineUpdate(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        throw new RuntimeException(z[5]);
    }

    protected void engineInit(int i, Key key, SecureRandom secureRandom) {
        try {
            engineInit(i, key, (AlgorithmParameterSpec) null, secureRandom);
        } catch (InvalidAlgorithmParameterException e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }

    protected AlgorithmParameters engineGetParameters() {
        return null;
    }

    protected void engineInit(int i, Key key, AlgorithmParameters algorithmParameters, SecureRandom secureRandom) {
        AlgorithmParameterSpec parameterSpec;
        AlgorithmParameterSpec algorithmParameterSpec = null;
        if (algorithmParameters != null) {
            int i2 = 0;
            while (i2 != this.availableSpecs.length) {
                try {
                    parameterSpec = algorithmParameters.getParameterSpec(this.availableSpecs[i2]);
                    break;
                } catch (Exception e) {
                    i2++;
                    if (BaseKeyGenerator.a != 0) {
                        break;
                    }
                }
            }
            parameterSpec = algorithmParameterSpec;
            if (parameterSpec == null) {
                try {
                    throw new InvalidAlgorithmParameterException(z[4] + algorithmParameters.toString());
                } catch (Exception e2) {
                    throw e2;
                }
            }
        }
        parameterSpec = null;
        this.engineParams = algorithmParameters;
        engineInit(i, key, parameterSpec, secureRandom);
    }

    protected byte[] engineDoFinal(byte[] bArr, int i, int i2) {
        return null;
    }

    protected int engineDoFinal(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        return 0;
    }

    protected void engineSetPadding(String str) {
        throw new NoSuchPaddingException(z[8] + str + z[9]);
    }
}
