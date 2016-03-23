package org.spongycastle.jcajce.provider.symmetric.util;

import javax.crypto.MacSpi;
import org.spongycastle.crypto.Mac;
import org.v;
import org.whispersystems.at;

public class BaseMac extends MacSpi implements PBE {
    private static final String[] z;
    private Mac macEngine;

    static {
        int i;
        String[] strArr = new String[3];
        char[] toCharArray = "\tL!7[\u0011\t6b^\u000e".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 98;
                    break;
                case at.g /*1*/:
                    i2 = 41;
                    break;
                case at.i /*2*/:
                    i2 = 88;
                    break;
                case at.o /*3*/:
                    i2 = 23;
                    break;
                default:
                    i2 = 50;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "\u0017G3y]\u0015GxgS\u0010H5rF\u0007[xcK\u0012Lv".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 98;
                    break;
                case at.g /*1*/:
                    i2 = 41;
                    break;
                case at.i /*2*/:
                    i2 = 88;
                    break;
                case at.o /*3*/:
                    i2 = 23;
                    break;
                default:
                    i2 = 50;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[1] = new String(cArr).intern();
        toCharArray = "2k\u001d7@\u0007X-~@\u0007ZxGp'\t(v@\u0003D=cW\u0010Zxc]BK=7A\u0007]v".toCharArray();
        int length2 = toCharArray.length;
        cArr = toCharArray;
        for (length = 0; length2 > length; length++) {
            c = cArr[length];
            switch (length % 5) {
                case v.m /*0*/:
                    i2 = 98;
                    break;
                case at.g /*1*/:
                    i2 = 41;
                    break;
                case at.i /*2*/:
                    i2 = 88;
                    break;
                case at.o /*3*/:
                    i2 = 23;
                    break;
                default:
                    i2 = 50;
                    break;
            }
            cArr[length] = (char) (i2 ^ c);
        }
        strArr[2] = new String(cArr).intern();
        z = strArr;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void engineInit(java.security.Key r5, java.security.spec.AlgorithmParameterSpec r6) {
        /*
        r4 = this;
        r2 = org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator.a;
        if (r5 != 0) goto L_0x000f;
    L_0x0004:
        r0 = new java.security.InvalidKeyException;
        r1 = z;
        r2 = 0;
        r1 = r1[r2];
        r0.<init>(r1);
        throw r0;
    L_0x000f:
        r0 = r5 instanceof org.spongycastle.jcajce.provider.symmetric.util.BCPBEKey;
        if (r0 == 0) goto L_0x003a;
    L_0x0013:
        r0 = r5;
        r0 = (org.spongycastle.jcajce.provider.symmetric.util.BCPBEKey) r0;
        r1 = r0.getParam();
        if (r1 == 0) goto L_0x0022;
    L_0x001c:
        r1 = r0.getParam();
        if (r2 == 0) goto L_0x0037;
    L_0x0022:
        r1 = r6 instanceof javax.crypto.spec.PBEParameterSpec;
        if (r1 == 0) goto L_0x002c;
    L_0x0026:
        r0 = org.spongycastle.jcajce.provider.symmetric.util.PBE.Util.makePBEMacParameters(r0, r6);
        if (r2 == 0) goto L_0x0038;
    L_0x002c:
        r0 = new java.security.InvalidAlgorithmParameterException;
        r1 = z;
        r2 = 2;
        r1 = r1[r2];
        r0.<init>(r1);
        throw r0;
    L_0x0037:
        r0 = r1;
    L_0x0038:
        if (r2 == 0) goto L_0x006e;
    L_0x003a:
        r0 = r6 instanceof javax.crypto.spec.IvParameterSpec;
        if (r0 == 0) goto L_0x0055;
    L_0x003e:
        r1 = new org.spongycastle.crypto.params.ParametersWithIV;
        r3 = new org.spongycastle.crypto.params.KeyParameter;
        r0 = r5.getEncoded();
        r3.<init>(r0);
        r0 = r6;
        r0 = (javax.crypto.spec.IvParameterSpec) r0;
        r0 = r0.getIV();
        r1.<init>(r3, r0);
        if (r2 == 0) goto L_0x006d;
    L_0x0055:
        if (r6 != 0) goto L_0x0062;
    L_0x0057:
        r0 = new org.spongycastle.crypto.params.KeyParameter;
        r1 = r5.getEncoded();
        r0.<init>(r1);
        if (r2 == 0) goto L_0x006e;
    L_0x0062:
        r0 = new java.security.InvalidAlgorithmParameterException;
        r1 = z;
        r2 = 1;
        r1 = r1[r2];
        r0.<init>(r1);
        throw r0;
    L_0x006d:
        r0 = r1;
    L_0x006e:
        r1 = r4.macEngine;
        r1.init(r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.spongycastle.jcajce.provider.symmetric.util.BaseMac.engineInit(java.security.Key, java.security.spec.AlgorithmParameterSpec):void");
    }

    protected BaseMac(Mac mac) {
        this.macEngine = mac;
    }

    protected void engineUpdate(byte[] bArr, int i, int i2) {
        this.macEngine.update(bArr, i, i2);
    }

    protected void engineUpdate(byte b) {
        this.macEngine.update(b);
    }

    protected byte[] engineDoFinal() {
        byte[] bArr = new byte[engineGetMacLength()];
        this.macEngine.doFinal(bArr, 0);
        return bArr;
    }

    protected void engineReset() {
        this.macEngine.reset();
    }

    protected int engineGetMacLength() {
        return this.macEngine.getMacSize();
    }
}
