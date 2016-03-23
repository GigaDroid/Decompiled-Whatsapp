package org.spongycastle.crypto;

import org.spongycastle.util.Strings;

public abstract class PBEParametersGenerator {
    protected int iterationCount;
    protected byte[] password;
    protected byte[] salt;

    public abstract CipherParameters generateDerivedMacParameters(int i);

    public abstract CipherParameters generateDerivedParameters(int i);

    public abstract CipherParameters generateDerivedParameters(int i, int i2);

    public void init(byte[] bArr, byte[] bArr2, int i) {
        this.password = bArr;
        this.salt = bArr2;
        this.iterationCount = i;
    }

    public static byte[] PKCS5PasswordToUTF8Bytes(char[] cArr) {
        if (cArr == null) {
            return new byte[0];
        }
        try {
            return Strings.toUTF8ByteArray(cArr);
        } catch (DataLengthException e) {
            throw e;
        }
    }

    protected PBEParametersGenerator() {
    }

    public static byte[] PKCS12PasswordToBytes(char[] cArr) {
        int i = 0;
        boolean z = DataLengthException.a;
        if (cArr != null) {
            try {
                if (cArr.length > 0) {
                    byte[] bArr = new byte[((cArr.length + 1) * 2)];
                    while (i != cArr.length) {
                        bArr[i * 2] = (byte) (cArr[i] >>> 8);
                        bArr[(i * 2) + 1] = (byte) cArr[i];
                        i++;
                        if (z) {
                            break;
                        }
                    }
                    return bArr;
                }
            } catch (DataLengthException e) {
                throw e;
            }
        }
        return new byte[0];
    }

    public static byte[] PKCS5PasswordToBytes(char[] cArr) {
        int i = 0;
        boolean z = DataLengthException.a;
        if (cArr == null) {
            return new byte[0];
        }
        byte[] bArr = new byte[cArr.length];
        while (i != bArr.length) {
            bArr[i] = (byte) cArr[i];
            i++;
            if (z) {
                break;
            }
        }
        return bArr;
    }

    public byte[] getSalt() {
        return this.salt;
    }

    public byte[] getPassword() {
        return this.password;
    }

    public int getIterationCount() {
        return this.iterationCount;
    }
}
