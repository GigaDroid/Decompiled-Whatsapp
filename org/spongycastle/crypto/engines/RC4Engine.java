package org.spongycastle.crypto.engines;

import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.OutputLengthException;
import org.spongycastle.crypto.StreamCipher;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.jcajce.provider.digest.BCMessageDigest;
import org.v;
import org.whispersystems.at;

public class RC4Engine implements StreamCipher {
    private static final int STATE_LENGTH = 256;
    private static final String[] z;
    private byte[] engineState;
    private byte[] workingKey;
    private int x;
    private int y;

    static {
        int i;
        String[] strArr = new String[4];
        char[] toCharArray = "bmsh\u0015+av{\u0007nq#i\u000ed#pu\u000eyw".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 11;
                    break;
                case at.g /*1*/:
                    i2 = 3;
                    break;
                case at.i /*2*/:
                    i2 = 3;
                    break;
                case at.o /*3*/:
                    i2 = 29;
                    break;
                default:
                    i2 = 97;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "dvwm\u0014\u007f#ah\u0007mfq=\u0015dl#n\tdqw".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 11;
                    break;
                case at.g /*1*/:
                    i2 = 3;
                    break;
                case at.i /*2*/:
                    i2 = 3;
                    break;
                case at.o /*3*/:
                    i2 = 29;
                    break;
                default:
                    i2 = 97;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[1] = new String(cArr).intern();
        toCharArray = "Y@7".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 11;
                    break;
                case at.g /*1*/:
                    i2 = 3;
                    break;
                case at.i /*2*/:
                    i2 = 3;
                    break;
                case at.o /*3*/:
                    i2 = 29;
                    break;
                default:
                    i2 = 97;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[2] = new String(cArr).intern();
        toCharArray = "bmu|\rbg#m\u0000ybnx\u0015nq#m\u0000xpfyA\u007fl#O\"?#js\b\u007f#.=".toCharArray();
        int length2 = toCharArray.length;
        cArr = toCharArray;
        for (length = 0; length2 > length; length++) {
            char c3 = cArr[length];
            switch (length % 5) {
                case v.m /*0*/:
                    i2 = 11;
                    break;
                case at.g /*1*/:
                    i2 = 3;
                    break;
                case at.i /*2*/:
                    i2 = 3;
                    break;
                case at.o /*3*/:
                    i2 = 29;
                    break;
                default:
                    i2 = 97;
                    break;
            }
            cArr[length] = (char) (i2 ^ c3);
        }
        strArr[3] = new String(cArr).intern();
        z = strArr;
    }

    public byte returnByte(byte b) {
        int i = AESFastEngine.a;
        this.x = (this.x + 1) & 255;
        this.y = (this.engineState[this.x] + this.y) & 255;
        byte b2 = this.engineState[this.x];
        try {
            this.engineState[this.x] = this.engineState[this.y];
            this.engineState[this.y] = b2;
            b2 = (byte) (this.engineState[(this.engineState[this.x] + this.engineState[this.y]) & 255] ^ b);
            if (i != 0) {
                BCMessageDigest.a = !BCMessageDigest.a;
            }
            return b2;
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        int i4 = 0;
        int i5 = AESFastEngine.a;
        try {
            if (i + i2 > bArr.length) {
                throw new DataLengthException(z[0]);
            }
            try {
                if (i3 + i2 > bArr2.length) {
                    throw new OutputLengthException(z[1]);
                }
                while (i4 < i2) {
                    this.x = (this.x + 1) & 255;
                    this.y = (this.engineState[this.x] + this.y) & 255;
                    byte b = this.engineState[this.x];
                    this.engineState[this.x] = this.engineState[this.y];
                    this.engineState[this.y] = b;
                    bArr2[i4 + i3] = (byte) (bArr[i4 + i] ^ this.engineState[(this.engineState[this.x] + this.engineState[this.y]) & 255]);
                    i4++;
                    if (i5 != 0) {
                        break;
                    }
                }
                return i2;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    public void init(boolean z, CipherParameters cipherParameters) {
        try {
            if (cipherParameters instanceof KeyParameter) {
                this.workingKey = ((KeyParameter) cipherParameters).getKey();
                setKey(this.workingKey);
                return;
            }
            throw new IllegalArgumentException(z[3] + cipherParameters.getClass().getName());
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public void reset() {
        setKey(this.workingKey);
    }

    public RC4Engine() {
        this.engineState = null;
        this.x = 0;
        this.y = 0;
        this.workingKey = null;
    }

    public String getAlgorithmName() {
        return z[2];
    }

    private void setKey(byte[] bArr) {
        int i = 0;
        int i2 = AESFastEngine.a;
        try {
            this.workingKey = bArr;
            this.x = 0;
            this.y = 0;
            if (this.engineState == null) {
                this.engineState = new byte[STATE_LENGTH];
            }
            int i3 = 0;
            while (i3 < STATE_LENGTH) {
                this.engineState[i3] = (byte) i3;
                i3++;
                if (i2 != 0) {
                    break;
                }
            }
            i3 = 0;
            int i4 = 0;
            while (i < STATE_LENGTH) {
                i3 = (i3 + ((bArr[i4] & 255) + this.engineState[i])) & 255;
                byte b = this.engineState[i];
                this.engineState[i] = this.engineState[i3];
                this.engineState[i3] = b;
                i4 = (i4 + 1) % bArr.length;
                i++;
                if (i2 != 0) {
                    return;
                }
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }
}
