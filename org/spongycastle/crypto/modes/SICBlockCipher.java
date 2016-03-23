package org.spongycastle.crypto.modes;

import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.SkippingCipher;
import org.spongycastle.crypto.StreamBlockCipher;
import org.spongycastle.crypto.StreamCipher;
import org.spongycastle.crypto.params.ParametersWithIV;
import org.spongycastle.util.Arrays;
import org.v;
import org.whispersystems.at;

public class SICBlockCipher extends StreamBlockCipher implements StreamCipher, SkippingCipher {
    private static final String[] z;
    private byte[] IV;
    private final int blockSize;
    private int byteCount;
    private final BlockCipher cipher;
    private byte[] counter;
    private byte[] counterOut;

    static {
        int i;
        int i2;
        String[] strArr = new String[7];
        char[] toCharArray = "M\bd_".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 98;
                    break;
                case at.g /*1*/:
                    i2 = 91;
                    break;
                case at.i /*2*/:
                    i2 = 45;
                    break;
                case at.o /*3*/:
                    i2 = 28;
                    break;
                default:
                    i2 = 2;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "!4Xrv\u0007)\rulB\u0018yN-1\u0012n<o\r?H<m\u0017/\rsdB)Lre\u0007u".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 98;
                    break;
                case at.g /*1*/:
                    i2 = 91;
                    break;
                case at.i /*2*/:
                    i2 = 45;
                    break;
                case at.o /*3*/:
                    i2 = 28;
                    break;
                default:
                    i2 = 2;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[1] = new String(cArr).intern();
        toCharArray = "!\u000f\u007f3Q+\u0018\rqm\u0006>\rng\u0013.Dng\u0011{}}p\u00036Hhg\u0010(zuv\n\u0012{".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 98;
                    break;
                case at.g /*1*/:
                    i2 = 91;
                    break;
                case at.i /*2*/:
                    i2 = 45;
                    break;
                case at.o /*3*/:
                    i2 = 28;
                    break;
                default:
                    i2 = 2;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[2] = new String(cArr).intern();
        toCharArray = "!\u000f\u007f3Q+\u0018\rqm\u0006>\rng\u0013.Dng\u0011{dJ\"\f4\r{p\u0007:YypB/E}lX{".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 98;
                    break;
                case at.g /*1*/:
                    i2 = 91;
                    break;
                case at.i /*2*/:
                    i2 = 45;
                    break;
                case at.o /*3*/:
                    i2 = 28;
                    break;
                default:
                    i2 = 2;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[3] = new String(cArr).intern();
        toCharArray = "!\u000f\u007f3Q+\u0018\rqm\u0006>\rng\u0013.Dng\u0011{dJ\"\r=\r}vB7H}q\u0016a\r".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 98;
                    break;
                case at.g /*1*/:
                    i2 = 91;
                    break;
                case at.i /*2*/:
                    i2 = 45;
                    break;
                case at.o /*3*/:
                    i2 = 28;
                    break;
                default:
                    i2 = 2;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[4] = new String(cArr).intern();
        toCharArray = "B9Thg\u0011u".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 98;
                    break;
                case at.g /*1*/:
                    i2 = 91;
                    break;
                case at.i /*2*/:
                    i2 = 45;
                    break;
                case at.o /*3*/:
                    i2 = 28;
                    break;
                default:
                    i2 = 2;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[5] = new String(cArr).intern();
        toCharArray = "B9Thg\u0011u".toCharArray();
        int length2 = toCharArray.length;
        cArr = toCharArray;
        for (length = 0; length2 > length; length++) {
            c = cArr[length];
            switch (length % 5) {
                case v.m /*0*/:
                    i2 = 98;
                    break;
                case at.g /*1*/:
                    i2 = 91;
                    break;
                case at.i /*2*/:
                    i2 = 45;
                    break;
                case at.o /*3*/:
                    i2 = 28;
                    break;
                default:
                    i2 = 2;
                    break;
            }
            cArr[length] = (char) (i2 ^ c);
        }
        strArr[6] = new String(cArr).intern();
        z = strArr;
    }

    private void incrementCounter(int i) {
        byte b = this.counter[this.counter.length - 1];
        try {
            byte[] bArr = this.counter;
            int length = this.counter.length - 1;
            bArr[length] = (byte) (bArr[length] + i);
            if (b == null) {
                return;
            }
            if (this.counter[this.counter.length - 1] < b) {
                incrementCounterAt(1);
            }
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        processBytes(bArr, i, this.blockSize, bArr2, i2);
        return this.blockSize;
    }

    public void init(boolean z, CipherParameters cipherParameters) {
        int i = 8;
        if (cipherParameters instanceof ParametersWithIV) {
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            try {
                this.IV = Arrays.clone(parametersWithIV.getIV());
                if (this.blockSize < this.IV.length) {
                    throw new IllegalArgumentException(z[3] + this.blockSize + z[5]);
                }
                try {
                    if (8 > this.blockSize / 2) {
                        i = this.blockSize / 2;
                    }
                    try {
                        if (this.blockSize - this.IV.length > i) {
                            throw new IllegalArgumentException(z[4] + (this.blockSize - i) + z[6]);
                        }
                        try {
                            if (parametersWithIV.getParameters() != null) {
                                this.cipher.init(true, parametersWithIV.getParameters());
                            }
                            try {
                                reset();
                                if (!GCMBlockCipher.a) {
                                    return;
                                }
                            } catch (IllegalArgumentException e) {
                                throw e;
                            }
                        } catch (IllegalArgumentException e2) {
                            throw e2;
                        }
                    } catch (IllegalArgumentException e22) {
                        throw e22;
                    }
                } catch (IllegalArgumentException e222) {
                    throw e222;
                }
            } catch (IllegalArgumentException e2222) {
                throw e2222;
            }
        }
        throw new IllegalArgumentException(z[2]);
    }

    protected byte calculateByte(byte b) {
        try {
            byte[] bArr;
            int i;
            if (this.byteCount == 0) {
                this.cipher.processBlock(this.counter, 0, this.counterOut, 0);
                bArr = this.counterOut;
                i = this.byteCount;
                this.byteCount = i + 1;
                return (byte) (bArr[i] ^ b);
            }
            bArr = this.counterOut;
            i = this.byteCount;
            this.byteCount = i + 1;
            byte b2 = (byte) (bArr[i] ^ b);
            try {
                if (this.byteCount != this.counter.length) {
                    return b2;
                }
                this.byteCount = 0;
                incrementCounterAt(0);
                checkCounter();
                return b2;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    public String getAlgorithmName() {
        return this.cipher.getAlgorithmName() + z[0];
    }

    public SICBlockCipher(BlockCipher blockCipher) {
        super(blockCipher);
        this.cipher = blockCipher;
        this.blockSize = this.cipher.getBlockSize();
        this.IV = new byte[this.blockSize];
        this.counter = new byte[this.blockSize];
        this.counterOut = new byte[this.blockSize];
        this.byteCount = 0;
    }

    private void decrementCounterAt(int i) {
        int length = this.counter.length - i;
        byte b;
        do {
            length--;
            if (length >= 0) {
                byte[] bArr = this.counter;
                b = (byte) (bArr[length] - 1);
                bArr[length] = b;
            } else {
                return;
            }
        } while (b == -1);
    }

    private void checkCounter() {
        boolean z = GCMBlockCipher.a;
        if (this.IV.length < this.blockSize) {
            int i = 0;
            while (i != this.IV.length) {
                try {
                    if (this.counter[i] != this.IV[i]) {
                        throw new IllegalStateException(z[1]);
                    }
                    i++;
                    if (z) {
                        return;
                    }
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long getPosition() {
        /*
        r6 = this;
        r4 = 0;
        r2 = org.spongycastle.crypto.modes.GCMBlockCipher.a;
        r0 = r6.counter;
        r0 = r0.length;
        r3 = new byte[r0];
        r0 = r6.counter;
        r1 = r3.length;
        java.lang.System.arraycopy(r0, r4, r3, r4, r1);
        r0 = r3.length;
        r0 = r0 + -1;
        r1 = r0;
    L_0x0012:
        r0 = 1;
        if (r1 < r0) goto L_0x003f;
    L_0x0015:
        r0 = r6.IV;
        r0 = r0.length;
        if (r1 >= r0) goto L_0x0027;
    L_0x001a:
        r0 = r3[r1];
        r0 = r0 & 255;
        r4 = r6.IV;
        r4 = r4[r1];
        r4 = r4 & 255;
        r0 = r0 - r4;
        if (r2 == 0) goto L_0x002b;
    L_0x0027:
        r0 = r3[r1];
        r0 = r0 & 255;
    L_0x002b:
        if (r0 >= 0) goto L_0x0038;
    L_0x002d:
        r4 = r1 + -1;
        r5 = r3[r4];	 Catch:{ IllegalArgumentException -> 0x004f }
        r5 = r5 + -1;
        r5 = (byte) r5;	 Catch:{ IllegalArgumentException -> 0x004f }
        r3[r4] = r5;	 Catch:{ IllegalArgumentException -> 0x004f }
        r0 = r0 + 256;
    L_0x0038:
        r0 = (byte) r0;
        r3[r1] = r0;
        r0 = r1 + -1;
        if (r2 == 0) goto L_0x0051;
    L_0x003f:
        r0 = r3.length;
        r0 = r0 + -8;
        r0 = org.spongycastle.util.Pack.bigEndianToLong(r3, r0);
        r2 = r6.blockSize;
        r2 = (long) r2;
        r0 = r0 * r2;
        r2 = r6.byteCount;
        r2 = (long) r2;
        r0 = r0 + r2;
        return r0;
    L_0x004f:
        r0 = move-exception;
        throw r0;
    L_0x0051:
        r1 = r0;
        goto L_0x0012;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.spongycastle.crypto.modes.SICBlockCipher.getPosition():long");
    }

    public int getBlockSize() {
        return this.cipher.getBlockSize();
    }

    private void incrementCounterAt(int i) {
        int length = this.counter.length - i;
        byte b;
        do {
            length--;
            if (length >= 0) {
                byte[] bArr = this.counter;
                b = (byte) (bArr[length] + 1);
                bArr[length] = b;
            } else {
                return;
            }
        } while (b == null);
    }

    public long skip(long j) {
        adjustCounter(j);
        checkCounter();
        this.cipher.processBlock(this.counter, 0, this.counterOut, 0);
        return j;
    }

    public long seekTo(long j) {
        reset();
        return skip(j);
    }

    public void reset() {
        Arrays.fill(this.counter, (byte) 0);
        System.arraycopy(this.IV, 0, this.counter, 0, this.IV.length);
        this.cipher.reset();
        this.byteCount = 0;
    }

    private void adjustCounter(long j) {
        long j2;
        int i;
        long j3;
        long j4;
        boolean z = GCMBlockCipher.a;
        if (j >= 0) {
            j2 = (((long) this.byteCount) + j) / ((long) this.blockSize);
            if (j2 > 255) {
                i = 5;
                j3 = j2;
                while (i >= 1) {
                    j4 = 1 << (i * 8);
                    while (j3 >= j4) {
                        incrementCounterAt(i);
                        j3 -= j4;
                        if (z) {
                            break;
                        }
                    }
                    i--;
                    if (z) {
                        break;
                    }
                }
            }
            j3 = j2;
            incrementCounter((int) j3);
            this.byteCount = (int) ((((long) this.byteCount) + j) - (j2 * ((long) this.blockSize)));
            if (!z) {
                return;
            }
        }
        j2 = ((-j) - ((long) this.byteCount)) / ((long) this.blockSize);
        if (j2 > 255) {
            i = 5;
            j3 = j2;
            while (i >= 1) {
                j4 = 1 << (i * 8);
                while (j3 > j4) {
                    decrementCounterAt(i);
                    j3 -= j4;
                    if (z) {
                        break;
                    }
                }
                i--;
                if (z) {
                    break;
                }
            }
        }
        j3 = j2;
        long j5 = 0;
        while (j5 != j3) {
            decrementCounterAt(0);
            j5++;
            if (z) {
                break;
            }
        }
        int i2 = (int) ((((long) this.byteCount) + j) + (j2 * ((long) this.blockSize)));
        if (i2 >= 0) {
            try {
                this.byteCount = 0;
                if (!z) {
                    return;
                }
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        decrementCounterAt(0);
        this.byteCount = i2 + this.blockSize;
    }
}
