package org.spongycastle.jcajce.provider.symmetric.util;

import org.v;
import org.whispersystems.at;

public class PBESecretKeyFactory extends BaseSecretKeyFactory implements PBE {
    private static final String z;
    private int digest;
    private boolean forCipher;
    private int ivSize;
    private int keySize;
    private int scheme;

    static {
        char[] toCharArray = "\r\"7&6-(a\f?=\u001f1\"9".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 68;
                    break;
                case at.g /*1*/:
                    i2 = 76;
                    break;
                case at.i /*2*/:
                    i2 = 65;
                    break;
                case at.o /*3*/:
                    i2 = 71;
                    break;
                default:
                    i2 = 90;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected javax.crypto.SecretKey engineGenerateSecret(java.security.spec.KeySpec r9) {
        /*
        r8 = this;
        r0 = r9 instanceof javax.crypto.spec.PBEKeySpec;
        if (r0 == 0) goto L_0x004c;
    L_0x0004:
        r6 = r9;
        r6 = (javax.crypto.spec.PBEKeySpec) r6;
        r0 = r6.getSalt();
        if (r0 != 0) goto L_0x001e;
    L_0x000d:
        r0 = new org.spongycastle.jcajce.provider.symmetric.util.BCPBEKey;
        r1 = r8.algName;
        r2 = r8.scheme;
        r3 = r8.digest;
        r4 = r8.keySize;
        r5 = r8.ivSize;
        r7 = 0;
        r0.<init>(r1, r2, r3, r4, r5, r6, r7);
    L_0x001d:
        return r0;
    L_0x001e:
        r0 = r8.forCipher;
        if (r0 == 0) goto L_0x0032;
    L_0x0022:
        r0 = r8.scheme;
        r1 = r8.digest;
        r2 = r8.keySize;
        r3 = r8.ivSize;
        r7 = org.spongycastle.jcajce.provider.symmetric.util.PBE.Util.makePBEParameters(r6, r0, r1, r2, r3);
        r0 = org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator.a;
        if (r0 == 0) goto L_0x003c;
    L_0x0032:
        r0 = r8.scheme;
        r1 = r8.digest;
        r2 = r8.keySize;
        r7 = org.spongycastle.jcajce.provider.symmetric.util.PBE.Util.makePBEMacParameters(r6, r0, r1, r2);
    L_0x003c:
        r0 = new org.spongycastle.jcajce.provider.symmetric.util.BCPBEKey;
        r1 = r8.algName;
        r2 = r8.scheme;
        r3 = r8.digest;
        r4 = r8.keySize;
        r5 = r8.ivSize;
        r0.<init>(r1, r2, r3, r4, r5, r6, r7);
        goto L_0x001d;
    L_0x004c:
        r0 = new java.security.spec.InvalidKeySpecException;
        r1 = z;
        r0.<init>(r1);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.spongycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory.engineGenerateSecret(java.security.spec.KeySpec):javax.crypto.SecretKey");
    }

    public PBESecretKeyFactory(String str, boolean z, int i, int i2, int i3, int i4) {
        super(str);
        this.forCipher = z;
        this.scheme = i;
        this.digest = i2;
        this.keySize = i3;
        this.ivSize = i4;
    }
}
