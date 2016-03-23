package org.spongycastle.crypto.paddings;

import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.BufferedBlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.OutputLengthException;
import org.spongycastle.crypto.params.ParametersWithRandom;
import org.spongycastle.jcajce.provider.digest.BCMessageDigest;
import org.v;
import org.whispersystems.at;

public class PaddedBufferedBlockCipher extends BufferedBlockCipher {
    public static boolean a;
    private static final String[] z;
    BlockCipherPadding padding;

    static {
        int i;
        String[] strArr = new String[4];
        char[] toCharArray = ",_\u00025z7\n\u00140i%O\u0004e{,EV6g,X\u0002".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 67;
                    break;
                case at.g /*1*/:
                    i2 = 42;
                    break;
                case at.i /*2*/:
                    i2 = 118;
                    break;
                case at.o /*3*/:
                    i2 = 69;
                    break;
                default:
                    i2 = 15;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "/K\u00051/!F\u0019&dcC\u0018&`.Z\u001a {&\n\u001f+/'O\u00157v3^\u001f*a".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 67;
                    break;
                case at.g /*1*/:
                    i2 = 42;
                    break;
                case at.i /*2*/:
                    i2 = 118;
                    break;
                case at.o /*3*/:
                    i2 = 69;
                    break;
                default:
                    i2 = 15;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[1] = new String(cArr).intern();
        toCharArray = "\u0000K\u0018b{cB\u00173jcKV+j$K\u0002,y&\n\u001f+\u007f6^V)j-M\u0002-.".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 67;
                    break;
                case at.g /*1*/:
                    i2 = 42;
                    break;
                case at.i /*2*/:
                    i2 = 118;
                    break;
                case at.o /*3*/:
                    i2 = 69;
                    break;
                default:
                    i2 = 15;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[2] = new String(cArr).intern();
        toCharArray = ",_\u00025z7\n\u00140i%O\u0004e{,EV6g,X\u0002".toCharArray();
        int length2 = toCharArray.length;
        cArr = toCharArray;
        for (length = 0; length2 > length; length++) {
            c = cArr[length];
            switch (length % 5) {
                case v.m /*0*/:
                    i2 = 67;
                    break;
                case at.g /*1*/:
                    i2 = 42;
                    break;
                case at.i /*2*/:
                    i2 = 118;
                    break;
                case at.o /*3*/:
                    i2 = 69;
                    break;
                default:
                    i2 = 15;
                    break;
            }
            cArr[length] = (char) (i2 ^ c);
        }
        strArr[3] = new String(cArr).intern();
        z = strArr;
    }

    public int processByte(byte b, byte[] bArr, int i) {
        int processBlock;
        if (this.bufOff == this.buf.length) {
            processBlock = this.cipher.processBlock(this.buf, 0, bArr, i);
            this.bufOff = 0;
        } else {
            processBlock = 0;
        }
        byte[] bArr2 = this.buf;
        int i2 = this.bufOff;
        this.bufOff = i2 + 1;
        bArr2[i2] = b;
        return processBlock;
    }

    public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        boolean z = false;
        boolean z2 = a;
        if (i2 < 0) {
            try {
                throw new IllegalArgumentException(z[2]);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        int i4;
        int blockSize = getBlockSize();
        int updateOutputSize = getUpdateOutputSize(i2);
        if (updateOutputSize > 0) {
            try {
                if (updateOutputSize + i3 > bArr2.length) {
                    throw new OutputLengthException(z[3]);
                }
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        }
        int length = this.buf.length - this.bufOff;
        if (i2 > length) {
            System.arraycopy(bArr, i, this.buf, this.bufOff, length);
            updateOutputSize = this.cipher.processBlock(this.buf, 0, bArr2, i3) + 0;
            this.bufOff = 0;
            i4 = i2 - length;
            length += i;
            while (i4 > this.buf.length) {
                updateOutputSize += this.cipher.processBlock(bArr, length, bArr2, i3 + updateOutputSize);
                i4 -= blockSize;
                length += blockSize;
                if (z2) {
                    try {
                        if (!BCMessageDigest.a) {
                            z = true;
                        }
                        BCMessageDigest.a = z;
                    } catch (IllegalArgumentException e22) {
                        throw e22;
                    }
                }
            }
        }
        updateOutputSize = 0;
        i4 = i2;
        length = i;
        System.arraycopy(bArr, length, this.buf, this.bufOff, i4);
        this.bufOff = i4 + this.bufOff;
        return updateOutputSize;
    }

    public PaddedBufferedBlockCipher(BlockCipher blockCipher, BlockCipherPadding blockCipherPadding) {
        this.cipher = blockCipher;
        this.padding = blockCipherPadding;
        this.buf = new byte[blockCipher.getBlockSize()];
        this.bufOff = 0;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int doFinal(byte[] r9, int r10) {
        /*
        r8 = this;
        r2 = 1;
        r1 = 0;
        r3 = a;
        r0 = r8.cipher;
        r4 = r0.getBlockSize();
        r0 = r8.forEncryption;	 Catch:{ IllegalArgumentException -> 0x0028 }
        if (r0 == 0) goto L_0x004f;
    L_0x000e:
        r0 = r8.bufOff;	 Catch:{ IllegalArgumentException -> 0x0028 }
        if (r0 != r4) goto L_0x009a;
    L_0x0012:
        r0 = r4 * 2;
        r0 = r0 + r10;
        r5 = r9.length;	 Catch:{ IllegalArgumentException -> 0x002a }
        if (r0 <= r5) goto L_0x002c;
    L_0x0018:
        r8.reset();	 Catch:{ IllegalArgumentException -> 0x0026 }
        r0 = new org.spongycastle.crypto.OutputLengthException;	 Catch:{ IllegalArgumentException -> 0x0026 }
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x0026 }
        r2 = 0;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x0026 }
        r0.<init>(r1);	 Catch:{ IllegalArgumentException -> 0x0026 }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0026 }
    L_0x0026:
        r0 = move-exception;
        throw r0;
    L_0x0028:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x002a }
    L_0x002a:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0026 }
    L_0x002c:
        r0 = r8.cipher;
        r5 = r8.buf;
        r0 = r0.processBlock(r5, r1, r9, r10);
        r8.bufOff = r1;
    L_0x0036:
        r5 = r8.padding;
        r6 = r8.buf;
        r7 = r8.bufOff;
        r5.addPadding(r6, r7);
        r5 = r8.cipher;
        r6 = r8.buf;
        r7 = r10 + r0;
        r5 = r5.processBlock(r6, r1, r9, r7);
        r0 = r0 + r5;
        r8.reset();	 Catch:{ IllegalArgumentException -> 0x0072 }
        if (r3 == 0) goto L_0x0086;
    L_0x004f:
        r0 = r8.bufOff;	 Catch:{ IllegalArgumentException -> 0x0072 }
        if (r0 != r4) goto L_0x0062;
    L_0x0053:
        r0 = r8.cipher;
        r4 = r8.buf;
        r5 = r8.buf;
        r0 = r0.processBlock(r4, r1, r5, r1);
        r4 = 0;
        r8.bufOff = r4;	 Catch:{ IllegalArgumentException -> 0x0070 }
        if (r3 == 0) goto L_0x0074;
    L_0x0062:
        r8.reset();	 Catch:{ IllegalArgumentException -> 0x0070 }
        r0 = new org.spongycastle.crypto.DataLengthException;	 Catch:{ IllegalArgumentException -> 0x0070 }
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x0070 }
        r2 = 1;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x0070 }
        r0.<init>(r1);	 Catch:{ IllegalArgumentException -> 0x0070 }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0070 }
    L_0x0070:
        r0 = move-exception;
        throw r0;
    L_0x0072:
        r0 = move-exception;
        throw r0;
    L_0x0074:
        r4 = r8.padding;	 Catch:{ all -> 0x008f }
        r5 = r8.buf;	 Catch:{ all -> 0x008f }
        r4 = r4.padCount(r5);	 Catch:{ all -> 0x008f }
        r0 = r0 - r4;
        r4 = r8.buf;	 Catch:{ all -> 0x008f }
        r5 = 0;
        java.lang.System.arraycopy(r4, r5, r9, r10, r0);	 Catch:{ all -> 0x008f }
        r8.reset();
    L_0x0086:
        r4 = org.spongycastle.jcajce.provider.digest.BCMessageDigest.a;	 Catch:{ IllegalArgumentException -> 0x0094 }
        if (r4 == 0) goto L_0x008e;
    L_0x008a:
        if (r3 == 0) goto L_0x0098;
    L_0x008c:
        a = r1;
    L_0x008e:
        return r0;
    L_0x008f:
        r0 = move-exception;
        r8.reset();
        throw r0;
    L_0x0094:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0096 }
    L_0x0096:
        r0 = move-exception;
        throw r0;
    L_0x0098:
        r1 = r2;
        goto L_0x008c;
    L_0x009a:
        r0 = r1;
        goto L_0x0036;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.spongycastle.crypto.paddings.PaddedBufferedBlockCipher.doFinal(byte[], int):int");
    }

    public int getOutputSize(int i) {
        int i2 = this.bufOff + i;
        int length = i2 % this.buf.length;
        if (length != 0) {
            return (i2 - length) + this.buf.length;
        }
        try {
            return this.forEncryption ? i2 + this.buf.length : i2;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public void init(boolean z, CipherParameters cipherParameters) {
        this.forEncryption = z;
        reset();
        if (cipherParameters instanceof ParametersWithRandom) {
            ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
            try {
                this.padding.init(parametersWithRandom.getRandom());
                this.cipher.init(z, parametersWithRandom.getParameters());
                if (!a) {
                    return;
                }
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        this.padding.init(null);
        this.cipher.init(z, cipherParameters);
    }

    public PaddedBufferedBlockCipher(BlockCipher blockCipher) {
        this(blockCipher, new PKCS7Padding());
    }

    public int getUpdateOutputSize(int i) {
        int i2 = this.bufOff + i;
        int length = i2 % this.buf.length;
        if (length != 0) {
            return i2 - length;
        }
        try {
            return Math.max(0, i2 - this.buf.length);
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }
}
