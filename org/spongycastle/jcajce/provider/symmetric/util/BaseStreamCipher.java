package org.spongycastle.jcajce.provider.symmetric.util;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;
import javax.crypto.spec.RC5ParameterSpec;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.StreamCipher;
import org.spongycastle.crypto.params.ParametersWithIV;
import org.v;
import org.whispersystems.at;

public class BaseStreamCipher extends BaseWrapCipher implements PBE {
    private static final String[] z;
    private Class[] availableSpecs;
    private StreamCipher cipher;
    private int digest;
    private int ivLength;
    private ParametersWithIV ivParam;
    private int keySizeInBits;
    private String pbeAlgorithm;
    private PBEParameterSpec pbeSpec;

    static {
        int i;
        int i2;
        String[] strArr = new String[16];
        char[] toCharArray = "5\\\u0016%L.\t\u0000 _<L\u0010uM5FB&Q5[\u0016u_5[B<W*\\\u0016{".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 90;
                    break;
                case at.g /*1*/:
                    i2 = 41;
                    break;
                case at.i /*2*/:
                    i2 = 98;
                    break;
                case at.o /*3*/:
                    i2 = 85;
                    break;
                default:
                    i2 = 57;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "\u001fj ".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 90;
                    break;
                case at.g /*1*/:
                    i2 = 41;
                    break;
                case at.i /*2*/:
                    i2 = 98;
                    break;
                case at.o /*3*/:
                    i2 = 85;
                    break;
                default:
                    i2 = 57;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[1] = new String(cArr).intern();
        toCharArray = "9H\frMzZ\u0017%I5[\u0016uT5M\u0007u".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 90;
                    break;
                case at.g /*1*/:
                    i2 = 41;
                    break;
                case at.i /*2*/:
                    i2 = 98;
                    break;
                case at.o /*3*/:
                    i2 = 85;
                    break;
                default:
                    i2 = 57;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[2] = new String(cArr).intern();
        toCharArray = "\nH\u00061P4NB".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 90;
                    break;
                case at.g /*1*/:
                    i2 = 41;
                    break;
                case at.i /*2*/:
                    i2 = 98;
                    break;
                case at.o /*3*/:
                    i2 = 85;
                    break;
                default:
                    i2 = 57;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[3] = new String(cArr).intern();
        toCharArray = "\u0014F24]>@\f2".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 90;
                    break;
                case at.g /*1*/:
                    i2 = 41;
                    break;
                case at.i /*2*/:
                    i2 = 98;
                    break;
                case at.o /*3*/:
                    i2 = 85;
                    break;
                default:
                    i2 = 57;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[4] = new String(cArr).intern();
        toCharArray = "z\\\f>W5^\f{".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 90;
                    break;
                case at.g /*1*/:
                    i2 = 41;
                    break;
                case at.i /*2*/:
                    i2 = 98;
                    break;
                case at.o /*3*/:
                    i2 = 85;
                    break;
                default:
                    i2 = 57;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[5] = new String(cArr).intern();
        toCharArray = "/G\t;V-GB:I7F\u00060\u0019".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 90;
                    break;
                case at.g /*1*/:
                    i2 = 41;
                    break;
                case at.i /*2*/:
                    i2 = 98;
                    break;
                case at.o /*3*/:
                    i2 = 85;
                    break;
                default:
                    i2 = 57;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[6] = new String(cArr).intern();
        toCharArray = "zY\u0003&J?M".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 90;
                    break;
                case at.g /*1*/:
                    i2 = 41;
                    break;
                case at.i /*2*/:
                    i2 = 98;
                    break;
                case at.o /*3*/:
                    i2 = 85;
                    break;
                default:
                    i2 = 57;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[7] = new String(cArr).intern();
        toCharArray = "\u0011L\u001bu_5[B4U=F\u0010<M2DB".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 90;
                    break;
                case at.g /*1*/:
                    i2 = 41;
                    break;
                case at.i /*2*/:
                    i2 = 98;
                    break;
                case at.o /*3*/:
                    i2 = 85;
                    break;
                default:
                    i2 = 57;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[8] = new String(cArr).intern();
        toCharArray = "\u001bE\u0005:K3]\n8\u0019(L\u0013 P(L\u0011uXzy \u0010\u00191L\u001b".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 90;
                    break;
                case at.g /*1*/:
                    i2 = 41;
                    break;
                case at.i /*2*/:
                    i2 = 98;
                    break;
                case at.o /*3*/:
                    i2 = 85;
                    break;
                default:
                    i2 = 57;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[9] = new String(cArr).intern();
        toCharArray = "\nk'uK?X\u0017<K?ZB\u0005{\u001f\t\u00124K;D\u0007!\\(ZB!VzK\u0007uJ?]L".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 90;
                    break;
                case at.g /*1*/:
                    i2 = 41;
                    break;
                case at.i /*2*/:
                    i2 = 98;
                    break;
                case at.o /*3*/:
                    i2 = 85;
                    break;
                default:
                    i2 = 57;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[10] = new String(cArr).intern();
        toCharArray = "4FB\u001cozZ\u0007!\u0019-A\u0007;\u00195G\u0007u\\\"Y\u00076M?M".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 90;
                    break;
                case at.g /*1*/:
                    i2 = 41;
                    break;
                case at.i /*2*/:
                    i2 = 98;
                    break;
                case at.o /*3*/:
                    i2 = 85;
                    break;
                default:
                    i2 = 57;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[11] = new String(cArr).intern();
        toCharArray = "zG\r!\u0019)\\\u000b!X8E\u0007u_5[B&@7D\u0007!K3JB0W(P\u0012!P5GL".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 90;
                    break;
                case at.g /*1*/:
                    i2 = 41;
                    break;
                case at.i /*2*/:
                    i2 = 98;
                    break;
                case at.o /*3*/:
                    i2 = 85;
                    break;
                default:
                    i2 = 57;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[12] = new String(cArr).intern();
        toCharArray = "/G\t;V-GB%X(H\u000f0M?[B!@*LL".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 90;
                    break;
                case at.g /*1*/:
                    i2 = 41;
                    break;
                case at.i /*2*/:
                    i2 = 98;
                    break;
                case at.o /*3*/:
                    i2 = 85;
                    break;
                default:
                    i2 = 57;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[13] = new String(cArr).intern();
        toCharArray = "9H\frMzA\u0003;]6LB%X(H\u000f0M?[B".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 90;
                    break;
                case at.g /*1*/:
                    i2 = 41;
                    break;
                case at.i /*2*/:
                    i2 = 98;
                    break;
                case at.o /*3*/:
                    i2 = 85;
                    break;
                default:
                    i2 = 57;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[14] = new String(cArr).intern();
        toCharArray = "5\\\u0016%L.\t\u0000 _<L\u0010uM5FB&Q5[\u0016u_5[B<W*\\\u0016{".toCharArray();
        int length2 = toCharArray.length;
        cArr = toCharArray;
        for (length = 0; length2 > length; length++) {
            c = cArr[length];
            switch (length % 5) {
                case v.m /*0*/:
                    i2 = 90;
                    break;
                case at.g /*1*/:
                    i2 = 41;
                    break;
                case at.i /*2*/:
                    i2 = 98;
                    break;
                case at.o /*3*/:
                    i2 = 85;
                    break;
                default:
                    i2 = 57;
                    break;
            }
            cArr[length] = (char) (i2 ^ c);
        }
        strArr[15] = new String(cArr).intern();
        z = strArr;
    }

    protected int engineUpdate(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        try {
            if (i3 + i2 > bArr2.length) {
                throw new ShortBufferException(z[0]);
            }
            try {
                this.cipher.processBytes(bArr, i, i2, bArr2, i3);
                return i2;
            } catch (DataLengthException e) {
                throw new IllegalStateException(e.getMessage());
            }
        } catch (DataLengthException e2) {
            throw e2;
        }
    }

    protected BaseStreamCipher(StreamCipher streamCipher, int i) {
        this(streamCipher, i, -1, -1);
    }

    protected byte[] engineDoFinal(byte[] bArr, int i, int i2) {
        if (i2 != 0) {
            byte[] engineUpdate = engineUpdate(bArr, i, i2);
            this.cipher.reset();
            return engineUpdate;
        }
        this.cipher.reset();
        return new byte[0];
    }

    protected byte[] engineGetIV() {
        try {
            return this.ivParam != null ? this.ivParam.getIV() : null;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    protected void engineSetMode(String str) {
        try {
            if (!str.equalsIgnoreCase(z[1])) {
                throw new IllegalArgumentException(z[2] + str);
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    protected int engineGetBlockSize() {
        return 0;
    }

    protected void engineInit(int i, Key key, SecureRandom secureRandom) {
        try {
            engineInit(i, key, (AlgorithmParameterSpec) null, secureRandom);
        } catch (InvalidAlgorithmParameterException e) {
            throw new InvalidKeyException(e.getMessage());
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void engineInit(int r9, java.security.Key r10, java.security.spec.AlgorithmParameterSpec r11, java.security.SecureRandom r12) {
        /*
        r8 = this;
        r7 = 1;
        r4 = org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator.a;
        r1 = 0;
        r8.pbeSpec = r1;	 Catch:{ Exception -> 0x003b }
        r1 = 0;
        r8.pbeAlgorithm = r1;	 Catch:{ Exception -> 0x003b }
        r1 = 0;
        r8.engineParams = r1;	 Catch:{ Exception -> 0x003b }
        r1 = r10 instanceof javax.crypto.SecretKey;	 Catch:{ Exception -> 0x003b }
        if (r1 != 0) goto L_0x003d;
    L_0x0010:
        r1 = new java.security.InvalidKeyException;	 Catch:{ Exception -> 0x003b }
        r2 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x003b }
        r2.<init>();	 Catch:{ Exception -> 0x003b }
        r3 = z;	 Catch:{ Exception -> 0x003b }
        r4 = 8;
        r3 = r3[r4];	 Catch:{ Exception -> 0x003b }
        r2 = r2.append(r3);	 Catch:{ Exception -> 0x003b }
        r3 = r10.getAlgorithm();	 Catch:{ Exception -> 0x003b }
        r2 = r2.append(r3);	 Catch:{ Exception -> 0x003b }
        r3 = z;	 Catch:{ Exception -> 0x003b }
        r4 = 12;
        r3 = r3[r4];	 Catch:{ Exception -> 0x003b }
        r2 = r2.append(r3);	 Catch:{ Exception -> 0x003b }
        r2 = r2.toString();	 Catch:{ Exception -> 0x003b }
        r1.<init>(r2);	 Catch:{ Exception -> 0x003b }
        throw r1;	 Catch:{ Exception -> 0x003b }
    L_0x003b:
        r1 = move-exception;
        throw r1;
    L_0x003d:
        r1 = r10 instanceof org.spongycastle.jcajce.provider.symmetric.util.BCPBEKey;
        if (r1 == 0) goto L_0x009a;
    L_0x0041:
        r1 = r10;
        r1 = (org.spongycastle.jcajce.provider.symmetric.util.BCPBEKey) r1;
        r2 = r1.getAlgorithm();
        r8.pbeAlgorithm = r2;
        r2 = r1.getParam();
        if (r2 == 0) goto L_0x0065;
    L_0x0050:
        r2 = r1.getParam();
        r3 = new javax.crypto.spec.PBEParameterSpec;	 Catch:{ Exception -> 0x0089 }
        r5 = r1.getSalt();	 Catch:{ Exception -> 0x0089 }
        r6 = r1.getIterationCount();	 Catch:{ Exception -> 0x0089 }
        r3.<init>(r5, r6);	 Catch:{ Exception -> 0x0089 }
        r8.pbeSpec = r3;	 Catch:{ Exception -> 0x0089 }
        if (r4 == 0) goto L_0x008c;
    L_0x0065:
        r2 = r11 instanceof javax.crypto.spec.PBEParameterSpec;	 Catch:{ Exception -> 0x0089 }
        if (r2 == 0) goto L_0x007b;
    L_0x0069:
        r2 = r8.cipher;
        r2 = r2.getAlgorithmName();
        r3 = org.spongycastle.jcajce.provider.symmetric.util.PBE.Util.makePBEParameters(r1, r11, r2);
        r0 = r11;
        r0 = (javax.crypto.spec.PBEParameterSpec) r0;	 Catch:{ Exception -> 0x0087 }
        r2 = r0;
        r8.pbeSpec = r2;	 Catch:{ Exception -> 0x0087 }
        if (r4 == 0) goto L_0x008b;
    L_0x007b:
        r1 = new java.security.InvalidAlgorithmParameterException;	 Catch:{ Exception -> 0x0087 }
        r2 = z;	 Catch:{ Exception -> 0x0087 }
        r3 = 10;
        r2 = r2[r3];	 Catch:{ Exception -> 0x0087 }
        r1.<init>(r2);	 Catch:{ Exception -> 0x0087 }
        throw r1;	 Catch:{ Exception -> 0x0087 }
    L_0x0087:
        r1 = move-exception;
        throw r1;
    L_0x0089:
        r1 = move-exception;
        throw r1;
    L_0x008b:
        r2 = r3;
    L_0x008c:
        r1 = r1.getIvSize();	 Catch:{ Exception -> 0x00ae }
        if (r1 <= 0) goto L_0x0098;
    L_0x0092:
        r0 = r2;
        r0 = (org.spongycastle.crypto.params.ParametersWithIV) r0;	 Catch:{ Exception -> 0x00ae }
        r1 = r0;
        r8.ivParam = r1;	 Catch:{ Exception -> 0x00ae }
    L_0x0098:
        if (r4 == 0) goto L_0x0174;
    L_0x009a:
        if (r11 != 0) goto L_0x00bd;
    L_0x009c:
        r1 = r8.digest;	 Catch:{ Exception -> 0x00b0 }
        if (r1 <= 0) goto L_0x00b2;
    L_0x00a0:
        r1 = new java.security.InvalidKeyException;	 Catch:{ Exception -> 0x00ac }
        r2 = z;	 Catch:{ Exception -> 0x00ac }
        r3 = 9;
        r2 = r2[r3];	 Catch:{ Exception -> 0x00ac }
        r1.<init>(r2);	 Catch:{ Exception -> 0x00ac }
        throw r1;	 Catch:{ Exception -> 0x00ac }
    L_0x00ac:
        r1 = move-exception;
        throw r1;
    L_0x00ae:
        r1 = move-exception;
        throw r1;
    L_0x00b0:
        r1 = move-exception;
        throw r1;	 Catch:{ Exception -> 0x00ac }
    L_0x00b2:
        r2 = new org.spongycastle.crypto.params.KeyParameter;
        r1 = r10.getEncoded();
        r2.<init>(r1);
        if (r4 == 0) goto L_0x0171;
    L_0x00bd:
        r1 = r11 instanceof javax.crypto.spec.IvParameterSpec;	 Catch:{ Exception -> 0x00eb }
        if (r1 == 0) goto L_0x00dd;
    L_0x00c1:
        r2 = new org.spongycastle.crypto.params.ParametersWithIV;
        r1 = new org.spongycastle.crypto.params.KeyParameter;
        r3 = r10.getEncoded();
        r1.<init>(r3);
        r11 = (javax.crypto.spec.IvParameterSpec) r11;
        r3 = r11.getIV();
        r2.<init>(r1, r3);
        r0 = r2;
        r0 = (org.spongycastle.crypto.params.ParametersWithIV) r0;	 Catch:{ Exception -> 0x00e9 }
        r1 = r0;
        r8.ivParam = r1;	 Catch:{ Exception -> 0x00e9 }
        if (r4 == 0) goto L_0x00ed;
    L_0x00dd:
        r1 = new java.security.InvalidAlgorithmParameterException;	 Catch:{ Exception -> 0x00e9 }
        r2 = z;	 Catch:{ Exception -> 0x00e9 }
        r3 = 13;
        r2 = r2[r3];	 Catch:{ Exception -> 0x00e9 }
        r1.<init>(r2);	 Catch:{ Exception -> 0x00e9 }
        throw r1;	 Catch:{ Exception -> 0x00e9 }
    L_0x00e9:
        r1 = move-exception;
        throw r1;
    L_0x00eb:
        r1 = move-exception;
        throw r1;
    L_0x00ed:
        r1 = r2;
    L_0x00ee:
        r2 = r8.ivLength;	 Catch:{ Exception -> 0x0124 }
        if (r2 == 0) goto L_0x0126;
    L_0x00f2:
        r2 = r1 instanceof org.spongycastle.crypto.params.ParametersWithIV;	 Catch:{ Exception -> 0x0124 }
        if (r2 != 0) goto L_0x0126;
    L_0x00f6:
        if (r12 != 0) goto L_0x00fd;
    L_0x00f8:
        r12 = new java.security.SecureRandom;
        r12.<init>();
    L_0x00fd:
        if (r9 == r7) goto L_0x0102;
    L_0x00ff:
        r2 = 3;
        if (r9 != r2) goto L_0x0116;
    L_0x0102:
        r2 = r8.ivLength;
        r3 = new byte[r2];
        r12.nextBytes(r3);
        r2 = new org.spongycastle.crypto.params.ParametersWithIV;
        r2.<init>(r1, r3);
        r0 = r2;
        r0 = (org.spongycastle.crypto.params.ParametersWithIV) r0;	 Catch:{ Exception -> 0x0122 }
        r1 = r0;
        r8.ivParam = r1;	 Catch:{ Exception -> 0x0122 }
        if (r4 == 0) goto L_0x0127;
    L_0x0116:
        r1 = new java.security.InvalidAlgorithmParameterException;	 Catch:{ Exception -> 0x0122 }
        r2 = z;	 Catch:{ Exception -> 0x0122 }
        r3 = 11;
        r2 = r2[r3];	 Catch:{ Exception -> 0x0122 }
        r1.<init>(r2);	 Catch:{ Exception -> 0x0122 }
        throw r1;	 Catch:{ Exception -> 0x0122 }
    L_0x0122:
        r1 = move-exception;
        throw r1;
    L_0x0124:
        r1 = move-exception;
        throw r1;
    L_0x0126:
        r2 = r1;
    L_0x0127:
        switch(r9) {
            case 1: goto L_0x015c;
            case 2: goto L_0x0164;
            case 3: goto L_0x015c;
            case 4: goto L_0x0164;
            default: goto L_0x012a;
        };
    L_0x012a:
        r1 = new java.security.InvalidParameterException;	 Catch:{ Exception -> 0x014f }
        r2 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x014f }
        r2.<init>();	 Catch:{ Exception -> 0x014f }
        r3 = z;	 Catch:{ Exception -> 0x014f }
        r4 = 6;
        r3 = r3[r4];	 Catch:{ Exception -> 0x014f }
        r2 = r2.append(r3);	 Catch:{ Exception -> 0x014f }
        r2 = r2.append(r9);	 Catch:{ Exception -> 0x014f }
        r3 = z;	 Catch:{ Exception -> 0x014f }
        r4 = 7;
        r3 = r3[r4];	 Catch:{ Exception -> 0x014f }
        r2 = r2.append(r3);	 Catch:{ Exception -> 0x014f }
        r2 = r2.toString();	 Catch:{ Exception -> 0x014f }
        r1.<init>(r2);	 Catch:{ Exception -> 0x014f }
        throw r1;	 Catch:{ Exception -> 0x014f }
    L_0x014f:
        r1 = move-exception;
        throw r1;	 Catch:{ Exception -> 0x0151 }
    L_0x0151:
        r1 = move-exception;
        r2 = new java.security.InvalidKeyException;
        r1 = r1.getMessage();
        r2.<init>(r1);
        throw r2;
    L_0x015c:
        r1 = r8.cipher;	 Catch:{ Exception -> 0x016d }
        r3 = 1;
        r1.init(r3, r2);	 Catch:{ Exception -> 0x016d }
        if (r4 == 0) goto L_0x016c;
    L_0x0164:
        r1 = r8.cipher;	 Catch:{ Exception -> 0x016f }
        r3 = 0;
        r1.init(r3, r2);	 Catch:{ Exception -> 0x016f }
        if (r4 != 0) goto L_0x012a;
    L_0x016c:
        return;
    L_0x016d:
        r1 = move-exception;
        throw r1;	 Catch:{ Exception -> 0x016f }
    L_0x016f:
        r1 = move-exception;
        throw r1;	 Catch:{ Exception -> 0x014f }
    L_0x0171:
        r1 = r2;
        goto L_0x00ee;
    L_0x0174:
        r1 = r2;
        goto L_0x00ee;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.spongycastle.jcajce.provider.symmetric.util.BaseStreamCipher.engineInit(int, java.security.Key, java.security.spec.AlgorithmParameterSpec, java.security.SecureRandom):void");
    }

    protected AlgorithmParameters engineGetParameters() {
        try {
            if (this.engineParams != null || this.pbeSpec == null) {
                return this.engineParams;
            }
            try {
                AlgorithmParameters createParametersInstance = createParametersInstance(this.pbeAlgorithm);
                createParametersInstance.init(this.pbeSpec);
                return createParametersInstance;
            } catch (Exception e) {
                return null;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    protected int engineDoFinal(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        try {
            if (i3 + i2 > bArr2.length) {
                throw new ShortBufferException(z[15]);
            }
            if (i2 != 0) {
                try {
                    this.cipher.processBytes(bArr, i, i2, bArr2, i3);
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            }
            this.cipher.reset();
            return i2;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    protected int engineGetOutputSize(int i) {
        return i;
    }

    protected byte[] engineUpdate(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        this.cipher.processBytes(bArr, i, i2, bArr2, 0);
        return bArr2;
    }

    protected BaseStreamCipher(StreamCipher streamCipher, int i, int i2, int i3) {
        this.availableSpecs = new Class[]{RC2ParameterSpec.class, RC5ParameterSpec.class, IvParameterSpec.class, PBEParameterSpec.class};
        this.ivLength = 0;
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.cipher = streamCipher;
        this.ivLength = i;
        this.keySizeInBits = i2;
        this.digest = i3;
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
                    throw new InvalidAlgorithmParameterException(z[14] + algorithmParameters.toString());
                } catch (Exception e2) {
                    throw e2;
                }
            }
        }
        parameterSpec = null;
        engineInit(i, key, parameterSpec, secureRandom);
        this.engineParams = algorithmParameters;
    }

    protected int engineGetKeySize(Key key) {
        return key.getEncoded().length * 8;
    }

    protected void engineSetPadding(String str) {
        try {
            if (!str.equalsIgnoreCase(z[4])) {
                throw new NoSuchPaddingException(z[3] + str + z[5]);
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }
}
