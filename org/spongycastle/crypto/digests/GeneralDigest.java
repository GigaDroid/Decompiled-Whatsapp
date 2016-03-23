package org.spongycastle.crypto.digests;

import org.spongycastle.crypto.ExtendedDigest;
import org.spongycastle.util.Memoable;
import org.spongycastle.util.Pack;

public abstract class GeneralDigest implements ExtendedDigest, Memoable {
    private static final int BYTE_LENGTH = 64;
    public static boolean a;
    private long byteCount;
    private final byte[] xBuf;
    private int xBufOff;

    protected abstract void processBlock();

    protected abstract void processLength(long j);

    protected abstract void processWord(byte[] bArr, int i);

    public void finish() {
        boolean z = a;
        long j = this.byteCount << 3;
        update(Byte.MIN_VALUE);
        while (this.xBufOff != 0) {
            update((byte) 0);
            if (z) {
                break;
            }
        }
        processLength(j);
        processBlock();
    }

    protected GeneralDigest() {
        this.xBuf = new byte[4];
        this.xBufOff = 0;
    }

    public void update(byte[] bArr, int i, int i2) {
        int i3;
        int i4 = 0;
        boolean z = a;
        int max = Math.max(0, i2);
        if (this.xBufOff != 0) {
            int i5 = 0;
            while (i5 < max) {
                byte[] bArr2 = this.xBuf;
                int i6 = this.xBufOff;
                this.xBufOff = i6 + 1;
                i3 = i5 + 1;
                bArr2[i6] = bArr[i5 + i];
                if (this.xBufOff == 4) {
                    processWord(this.xBuf, 0);
                    this.xBufOff = 0;
                    i4 = i3;
                    break;
                }
                i5 = i3;
            }
            i4 = i5;
        }
        i3 = ((max - i4) & -4) + i4;
        while (i4 < i3) {
            processWord(bArr, i + i4);
            i4 += 4;
            if (z) {
                break;
            }
        }
        while (i4 < max) {
            byte[] bArr3 = this.xBuf;
            int i7 = this.xBufOff;
            this.xBufOff = i7 + 1;
            i3 = i4 + 1;
            bArr3[i7] = bArr[i4 + i];
            if (z) {
                break;
            }
            i4 = i3;
        }
        this.byteCount += (long) max;
    }

    public int getByteLength() {
        return BYTE_LENGTH;
    }

    public void reset() {
        boolean z = a;
        this.byteCount = 0;
        this.xBufOff = 0;
        int i = 0;
        while (i < this.xBuf.length) {
            this.xBuf[i] = (byte) 0;
            i++;
            if (z) {
                return;
            }
        }
    }

    protected void populateState(byte[] bArr) {
        System.arraycopy(this.xBuf, 0, bArr, 0, this.xBufOff);
        Pack.intToBigEndian(this.xBufOff, bArr, 4);
        Pack.longToBigEndian(this.byteCount, bArr, 8);
    }

    protected void copyIn(GeneralDigest generalDigest) {
        System.arraycopy(generalDigest.xBuf, 0, this.xBuf, 0, generalDigest.xBuf.length);
        this.xBufOff = generalDigest.xBufOff;
        this.byteCount = generalDigest.byteCount;
    }

    protected GeneralDigest(GeneralDigest generalDigest) {
        this.xBuf = new byte[4];
        copyIn(generalDigest);
    }

    protected GeneralDigest(byte[] bArr) {
        this.xBuf = new byte[4];
        System.arraycopy(bArr, 0, this.xBuf, 0, this.xBuf.length);
        this.xBufOff = Pack.bigEndianToInt(bArr, 4);
        this.byteCount = Pack.bigEndianToLong(bArr, 8);
    }

    public void update(byte b) {
        byte[] bArr = this.xBuf;
        int i = this.xBufOff;
        this.xBufOff = i + 1;
        bArr[i] = b;
        if (this.xBufOff == this.xBuf.length) {
            processWord(this.xBuf, 0);
            this.xBufOff = 0;
        }
        this.byteCount++;
    }
}
