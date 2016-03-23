package org.spongycastle.jcajce.provider.symmetric.util;

import javax.crypto.interfaces.PBEKey;
import javax.crypto.spec.PBEKeySpec;
import org.spongycastle.crypto.CipherParameters;
import org.v;
import org.whispersystems.at;

public class BCPBEKey implements PBEKey {
    private static final String z;
    String algorithm;
    int digest;
    int ivSize;
    int keySize;
    CipherParameters param;
    PBEKeySpec pbeKeySpec;
    boolean tryWrong;
    int type;

    static {
        char[] toCharArray = "\r/s".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 95;
                    break;
                case at.g /*1*/:
                    i2 = 110;
                    break;
                case at.i /*2*/:
                    i2 = 36;
                    break;
                case at.o /*3*/:
                    i2 = 53;
                    break;
                default:
                    i2 = 120;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public byte[] getSalt() {
        return this.pbeKeySpec.getSalt();
    }

    int getDigest() {
        return this.digest;
    }

    boolean shouldTryWrongPKCS12() {
        return this.tryWrong;
    }

    public String getFormat() {
        return z;
    }

    int getType() {
        return this.type;
    }

    public void setTryWrongPKCS12Zero(boolean z) {
        this.tryWrong = z;
    }

    int getKeySize() {
        return this.keySize;
    }

    public int getIvSize() {
        return this.ivSize;
    }

    public char[] getPassword() {
        return this.pbeKeySpec.getPassword();
    }

    public CipherParameters getParam() {
        return this.param;
    }

    public BCPBEKey(String str, int i, int i2, int i3, int i4, PBEKeySpec pBEKeySpec, CipherParameters cipherParameters) {
        this.tryWrong = false;
        this.algorithm = str;
        this.type = i;
        this.digest = i2;
        this.keySize = i3;
        this.ivSize = i4;
        this.pbeKeySpec = pBEKeySpec;
        this.param = cipherParameters;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] getEncoded() {
        /*
        r2 = this;
        r0 = r2.param;
        if (r0 == 0) goto L_0x0021;
    L_0x0004:
        r0 = r2.param;
        r0 = r0 instanceof org.spongycastle.crypto.params.ParametersWithIV;
        if (r0 == 0) goto L_0x0018;
    L_0x000a:
        r0 = r2.param;
        r0 = (org.spongycastle.crypto.params.ParametersWithIV) r0;
        r0 = r0.getParameters();
        r0 = (org.spongycastle.crypto.params.KeyParameter) r0;
        r1 = org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator.a;
        if (r1 == 0) goto L_0x001c;
    L_0x0018:
        r0 = r2.param;
        r0 = (org.spongycastle.crypto.params.KeyParameter) r0;
    L_0x001c:
        r0 = r0.getKey();
    L_0x0020:
        return r0;
    L_0x0021:
        r0 = r2.type;
        r1 = 5;
        if (r0 != r1) goto L_0x0031;
    L_0x0026:
        r0 = r2.pbeKeySpec;
        r0 = r0.getPassword();
        r0 = org.spongycastle.crypto.PBEParametersGenerator.PKCS5PasswordToUTF8Bytes(r0);
        goto L_0x0020;
    L_0x0031:
        r0 = r2.pbeKeySpec;
        r0 = r0.getPassword();
        r0 = org.spongycastle.crypto.PBEParametersGenerator.PKCS5PasswordToBytes(r0);
        goto L_0x0020;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.spongycastle.jcajce.provider.symmetric.util.BCPBEKey.getEncoded():byte[]");
    }

    public String getAlgorithm() {
        return this.algorithm;
    }

    public int getIterationCount() {
        return this.pbeKeySpec.getIterationCount();
    }
}
