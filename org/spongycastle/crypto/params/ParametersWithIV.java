package org.spongycastle.crypto.params;

import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.jcajce.provider.digest.BCMessageDigest;

public class ParametersWithIV implements CipherParameters {
    public static boolean a;
    private byte[] iv;
    private CipherParameters parameters;

    public ParametersWithIV(CipherParameters cipherParameters, byte[] bArr) {
        this(cipherParameters, bArr, 0, bArr.length);
    }

    public CipherParameters getParameters() {
        return this.parameters;
    }

    public ParametersWithIV(CipherParameters cipherParameters, byte[] bArr, int i, int i2) {
        boolean z = false;
        boolean z2 = a;
        this.iv = new byte[i2];
        this.parameters = cipherParameters;
        System.arraycopy(bArr, i, this.iv, 0, i2);
        if (z2) {
            if (!BCMessageDigest.a) {
                z = true;
            }
            BCMessageDigest.a = z;
        }
    }

    public byte[] getIV() {
        return this.iv;
    }
}
