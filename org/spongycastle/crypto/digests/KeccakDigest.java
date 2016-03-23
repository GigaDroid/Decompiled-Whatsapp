package org.spongycastle.crypto.digests;

import com.whatsapp.arj;
import org.spongycastle.crypto.ExtendedDigest;
import org.spongycastle.util.Arrays;
import org.v;
import org.whispersystems.at;

public class KeccakDigest implements ExtendedDigest {
    private static int[] KeccakRhoOffsets;
    private static long[] KeccakRoundConstants;
    private static final String[] z;
    long[] C;
    protected int bitsAvailableForSqueezing;
    protected int bitsInQueue;
    long[] chiC;
    protected byte[] chunk;
    protected byte[] dataQueue;
    protected int fixedOutputLength;
    protected byte[] oneByte;
    protected int rate;
    protected boolean squeezing;
    protected byte[] state;
    long[] tempA;

    public KeccakDigest(KeccakDigest keccakDigest) {
        this.state = new byte[200];
        this.dataQueue = new byte[192];
        this.C = new long[5];
        this.tempA = new long[25];
        this.chiC = new long[5];
        System.arraycopy(keccakDigest.state, 0, this.state, 0, keccakDigest.state.length);
        System.arraycopy(keccakDigest.dataQueue, 0, this.dataQueue, 0, keccakDigest.dataQueue.length);
        this.rate = keccakDigest.rate;
        this.bitsInQueue = keccakDigest.bitsInQueue;
        this.fixedOutputLength = keccakDigest.fixedOutputLength;
        this.squeezing = keccakDigest.squeezing;
        this.bitsAvailableForSqueezing = keccakDigest.bitsAvailableForSqueezing;
        this.chunk = Arrays.clone(keccakDigest.chunk);
        this.oneByte = Arrays.clone(keccakDigest.oneByte);
    }

    public void update(byte[] bArr, int i, int i2) {
        absorb(bArr, i, ((long) i2) * 8);
    }

    public int doFinal(byte[] bArr, int i) {
        squeeze(bArr, i, (long) this.fixedOutputLength);
        reset();
        return getDigestSize();
    }

    protected void absorb(byte[] bArr, int i, long j) {
        boolean z = GeneralDigest.a;
        try {
            if (this.bitsInQueue % 8 != 0) {
                throw new IllegalStateException(z[5]);
            }
            try {
                if (this.squeezing) {
                    throw new IllegalStateException(z[6]);
                }
                long j2 = 0;
                while (j2 < j) {
                    try {
                        if (this.bitsInQueue == 0) {
                            if (j >= ((long) this.rate) && j2 <= j - ((long) this.rate)) {
                                long j3 = (j - j2) / ((long) this.rate);
                                long j4 = 0;
                                while (j4 < j3) {
                                    System.arraycopy(bArr, (int) ((((long) i) + (j2 / 8)) + (((long) this.chunk.length) * j4)), this.chunk, 0, this.chunk.length);
                                    KeccakAbsorb(this.state, this.chunk, this.chunk.length);
                                    j4++;
                                    if (z) {
                                        break;
                                    }
                                }
                                j2 += ((long) this.rate) * j3;
                                if (!z) {
                                    continue;
                                }
                            }
                        }
                        int i2 = (int) (j - j2);
                        if (this.bitsInQueue + i2 > this.rate) {
                            i2 = this.rate - this.bitsInQueue;
                        }
                        int i3 = i2 % 8;
                        i2 -= i3;
                        System.arraycopy(bArr, ((int) (j2 / 8)) + i, this.dataQueue, this.bitsInQueue / 8, i2 / 8);
                        this.bitsInQueue += i2;
                        j2 += (long) i2;
                        try {
                            if (this.bitsInQueue == this.rate) {
                                absorbQueue();
                            }
                            if (i3 > 0) {
                                this.dataQueue[this.bitsInQueue / 8] = (byte) (((1 << i3) - 1) & bArr[((int) (j2 / 8)) + i]);
                                this.bitsInQueue += i3;
                                j2 += (long) i3;
                            }
                            if (z) {
                                return;
                            }
                        } catch (IllegalArgumentException e) {
                            throw e;
                        }
                    } catch (IllegalArgumentException e2) {
                        throw e2;
                    } catch (IllegalArgumentException e22) {
                        throw e22;
                    }
                }
            } catch (IllegalArgumentException e222) {
                throw e222;
            }
        } catch (IllegalArgumentException e2222) {
            throw e2222;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void init(int r4) {
        /*
        r3 = this;
        r0 = org.spongycastle.crypto.digests.GeneralDigest.a;
        switch(r4) {
            case 128: goto L_0x001b;
            case 224: goto L_0x0024;
            case 256: goto L_0x002d;
            case 288: goto L_0x0012;
            case 384: goto L_0x0036;
            case 512: goto L_0x003f;
            default: goto L_0x0005;
        };
    L_0x0005:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0010 }
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x0010 }
        r2 = 4;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x0010 }
        r0.<init>(r1);	 Catch:{ IllegalArgumentException -> 0x0010 }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0010 }
    L_0x0010:
        r0 = move-exception;
        throw r0;
    L_0x0012:
        r1 = 1024; // 0x400 float:1.435E-42 double:5.06E-321;
        r2 = 576; // 0x240 float:8.07E-43 double:2.846E-321;
        r3.initSponge(r1, r2);	 Catch:{ IllegalArgumentException -> 0x0049 }
        if (r0 == 0) goto L_0x0048;
    L_0x001b:
        r1 = 1344; // 0x540 float:1.883E-42 double:6.64E-321;
        r2 = 256; // 0x100 float:3.59E-43 double:1.265E-321;
        r3.initSponge(r1, r2);	 Catch:{ IllegalArgumentException -> 0x004b }
        if (r0 == 0) goto L_0x0048;
    L_0x0024:
        r1 = 1152; // 0x480 float:1.614E-42 double:5.69E-321;
        r2 = 448; // 0x1c0 float:6.28E-43 double:2.213E-321;
        r3.initSponge(r1, r2);	 Catch:{ IllegalArgumentException -> 0x004d }
        if (r0 == 0) goto L_0x0048;
    L_0x002d:
        r1 = 1088; // 0x440 float:1.525E-42 double:5.375E-321;
        r2 = 512; // 0x200 float:7.175E-43 double:2.53E-321;
        r3.initSponge(r1, r2);	 Catch:{ IllegalArgumentException -> 0x004f }
        if (r0 == 0) goto L_0x0048;
    L_0x0036:
        r1 = 832; // 0x340 float:1.166E-42 double:4.11E-321;
        r2 = 768; // 0x300 float:1.076E-42 double:3.794E-321;
        r3.initSponge(r1, r2);	 Catch:{ IllegalArgumentException -> 0x0051 }
        if (r0 == 0) goto L_0x0048;
    L_0x003f:
        r1 = 576; // 0x240 float:8.07E-43 double:2.846E-321;
        r2 = 1024; // 0x400 float:1.435E-42 double:5.06E-321;
        r3.initSponge(r1, r2);	 Catch:{ IllegalArgumentException -> 0x0010 }
        if (r0 != 0) goto L_0x0005;
    L_0x0048:
        return;
    L_0x0049:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x004b }
    L_0x004b:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x004d }
    L_0x004d:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x004f }
    L_0x004f:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0051 }
    L_0x0051:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0010 }
        */
        throw new UnsupportedOperationException("Method not decompiled: org.spongycastle.crypto.digests.KeccakDigest.init(int):void");
    }

    private void clearDataQueueSection(int i, int i2) {
        boolean z = GeneralDigest.a;
        int i3 = i;
        while (i3 != i + i2) {
            this.dataQueue[i3] = (byte) 0;
            i3++;
            if (z) {
                return;
            }
        }
    }

    public int getDigestSize() {
        return this.fixedOutputLength / 8;
    }

    public void update(byte b) {
        this.oneByte[0] = b;
        absorb(this.oneByte, 0, 8);
    }

    public KeccakDigest(int i) {
        this.state = new byte[200];
        this.dataQueue = new byte[192];
        this.C = new long[5];
        this.tempA = new long[25];
        this.chiC = new long[5];
        init(i);
    }

    private void initSponge(int i, int i2) {
        if (i + i2 != 1600) {
            try {
                throw new IllegalStateException(z[1]);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        if (i > 0 && i < 1600) {
            try {
                if (i % 64 == 0) {
                    this.rate = i;
                    Arrays.fill(this.state, (byte) 0);
                    Arrays.fill(this.dataQueue, (byte) 0);
                    this.bitsInQueue = 0;
                    this.squeezing = false;
                    this.bitsAvailableForSqueezing = 0;
                    this.fixedOutputLength = i2 / 2;
                    this.chunk = new byte[(i / 8)];
                    this.oneByte = new byte[1];
                    return;
                }
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        }
        throw new IllegalStateException(z[0]);
    }

    public void reset() {
        init(this.fixedOutputLength);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void padAndSwitchToSqueezingPhase() {
        /*
        r7 = this;
        r6 = 1024; // 0x400 float:1.435E-42 double:5.06E-321;
        r5 = 1;
        r0 = org.spongycastle.crypto.digests.GeneralDigest.a;
        r1 = r7.bitsInQueue;	 Catch:{ IllegalArgumentException -> 0x008e }
        r1 = r1 + 1;
        r2 = r7.rate;	 Catch:{ IllegalArgumentException -> 0x008e }
        if (r1 != r2) goto L_0x002c;
    L_0x000d:
        r1 = r7.dataQueue;	 Catch:{ IllegalArgumentException -> 0x0090 }
        r2 = r7.bitsInQueue;	 Catch:{ IllegalArgumentException -> 0x0090 }
        r2 = r2 / 8;
        r3 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x0090 }
        r4 = r7.bitsInQueue;	 Catch:{ IllegalArgumentException -> 0x0090 }
        r4 = r4 % 8;
        r4 = r5 << r4;
        r3 = r3 | r4;
        r3 = (byte) r3;	 Catch:{ IllegalArgumentException -> 0x0090 }
        r1[r2] = r3;	 Catch:{ IllegalArgumentException -> 0x0090 }
        r7.absorbQueue();	 Catch:{ IllegalArgumentException -> 0x0090 }
        r1 = 0;
        r2 = r7.rate;	 Catch:{ IllegalArgumentException -> 0x0090 }
        r2 = r2 / 8;
        r7.clearDataQueueSection(r1, r2);	 Catch:{ IllegalArgumentException -> 0x0090 }
        if (r0 == 0) goto L_0x0052;
    L_0x002c:
        r1 = r7.bitsInQueue;	 Catch:{ IllegalArgumentException -> 0x0090 }
        r1 = r1 + 7;
        r1 = r1 / 8;
        r2 = r7.rate;	 Catch:{ IllegalArgumentException -> 0x0090 }
        r2 = r2 / 8;
        r3 = r7.bitsInQueue;	 Catch:{ IllegalArgumentException -> 0x0090 }
        r3 = r3 + 7;
        r3 = r3 / 8;
        r2 = r2 - r3;
        r7.clearDataQueueSection(r1, r2);	 Catch:{ IllegalArgumentException -> 0x0090 }
        r1 = r7.dataQueue;	 Catch:{ IllegalArgumentException -> 0x0090 }
        r2 = r7.bitsInQueue;	 Catch:{ IllegalArgumentException -> 0x0090 }
        r2 = r2 / 8;
        r3 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x0090 }
        r4 = r7.bitsInQueue;	 Catch:{ IllegalArgumentException -> 0x0090 }
        r4 = r4 % 8;
        r4 = r5 << r4;
        r3 = r3 | r4;
        r3 = (byte) r3;	 Catch:{ IllegalArgumentException -> 0x0090 }
        r1[r2] = r3;	 Catch:{ IllegalArgumentException -> 0x0090 }
    L_0x0052:
        r1 = r7.dataQueue;	 Catch:{ IllegalArgumentException -> 0x0092 }
        r2 = r7.rate;	 Catch:{ IllegalArgumentException -> 0x0092 }
        r2 = r2 + -1;
        r2 = r2 / 8;
        r3 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x0092 }
        r4 = r7.rate;	 Catch:{ IllegalArgumentException -> 0x0092 }
        r4 = r4 + -1;
        r4 = r4 % 8;
        r4 = r5 << r4;
        r3 = r3 | r4;
        r3 = (byte) r3;	 Catch:{ IllegalArgumentException -> 0x0092 }
        r1[r2] = r3;	 Catch:{ IllegalArgumentException -> 0x0092 }
        r7.absorbQueue();	 Catch:{ IllegalArgumentException -> 0x0092 }
        r1 = r7.rate;	 Catch:{ IllegalArgumentException -> 0x0092 }
        if (r1 != r6) goto L_0x007c;
    L_0x006f:
        r1 = r7.state;	 Catch:{ IllegalArgumentException -> 0x0094 }
        r2 = r7.dataQueue;	 Catch:{ IllegalArgumentException -> 0x0094 }
        r7.KeccakExtract1024bits(r1, r2);	 Catch:{ IllegalArgumentException -> 0x0094 }
        r1 = 1024; // 0x400 float:1.435E-42 double:5.06E-321;
        r7.bitsAvailableForSqueezing = r1;	 Catch:{ IllegalArgumentException -> 0x0094 }
        if (r0 == 0) goto L_0x008b;
    L_0x007c:
        r0 = r7.state;	 Catch:{ IllegalArgumentException -> 0x0094 }
        r1 = r7.dataQueue;	 Catch:{ IllegalArgumentException -> 0x0094 }
        r2 = r7.rate;	 Catch:{ IllegalArgumentException -> 0x0094 }
        r2 = r2 / 64;
        r7.KeccakExtract(r0, r1, r2);	 Catch:{ IllegalArgumentException -> 0x0094 }
        r0 = r7.rate;	 Catch:{ IllegalArgumentException -> 0x0094 }
        r7.bitsAvailableForSqueezing = r0;	 Catch:{ IllegalArgumentException -> 0x0094 }
    L_0x008b:
        r7.squeezing = r5;
        return;
    L_0x008e:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0090 }
    L_0x0090:
        r0 = move-exception;
        throw r0;
    L_0x0092:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0094 }
    L_0x0094:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.spongycastle.crypto.digests.KeccakDigest.padAndSwitchToSqueezingPhase():void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void squeeze(byte[] r12, int r13, long r14) {
        /*
        r11 = this;
        r4 = org.spongycastle.crypto.digests.GeneralDigest.a;
        r0 = r11.squeezing;	 Catch:{ IllegalArgumentException -> 0x0020 }
        if (r0 != 0) goto L_0x0009;
    L_0x0006:
        r11.padAndSwitchToSqueezingPhase();	 Catch:{ IllegalArgumentException -> 0x0020 }
    L_0x0009:
        r0 = 8;
        r0 = r14 % r0;
        r2 = 0;
        r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r0 == 0) goto L_0x0022;
    L_0x0013:
        r0 = new java.lang.IllegalStateException;	 Catch:{ IllegalArgumentException -> 0x001e }
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x001e }
        r2 = 3;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x001e }
        r0.<init>(r1);	 Catch:{ IllegalArgumentException -> 0x001e }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x001e }
    L_0x001e:
        r0 = move-exception;
        throw r0;
    L_0x0020:
        r0 = move-exception;
        throw r0;
    L_0x0022:
        r0 = 0;
        r2 = r0;
    L_0x0025:
        r0 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1));
        if (r0 >= 0) goto L_0x007d;
    L_0x0029:
        r0 = r11.bitsAvailableForSqueezing;	 Catch:{ IllegalArgumentException -> 0x007e }
        if (r0 != 0) goto L_0x0054;
    L_0x002d:
        r0 = r11.state;	 Catch:{ IllegalArgumentException -> 0x0080 }
        r11.keccakPermutation(r0);	 Catch:{ IllegalArgumentException -> 0x0080 }
        r0 = r11.rate;	 Catch:{ IllegalArgumentException -> 0x0080 }
        r1 = 1024; // 0x400 float:1.435E-42 double:5.06E-321;
        if (r0 != r1) goto L_0x0045;
    L_0x0038:
        r0 = r11.state;	 Catch:{ IllegalArgumentException -> 0x0082 }
        r1 = r11.dataQueue;	 Catch:{ IllegalArgumentException -> 0x0082 }
        r11.KeccakExtract1024bits(r0, r1);	 Catch:{ IllegalArgumentException -> 0x0082 }
        r0 = 1024; // 0x400 float:1.435E-42 double:5.06E-321;
        r11.bitsAvailableForSqueezing = r0;	 Catch:{ IllegalArgumentException -> 0x0082 }
        if (r4 == 0) goto L_0x0054;
    L_0x0045:
        r0 = r11.state;	 Catch:{ IllegalArgumentException -> 0x0082 }
        r1 = r11.dataQueue;	 Catch:{ IllegalArgumentException -> 0x0082 }
        r5 = r11.rate;	 Catch:{ IllegalArgumentException -> 0x0082 }
        r5 = r5 / 64;
        r11.KeccakExtract(r0, r1, r5);	 Catch:{ IllegalArgumentException -> 0x0082 }
        r0 = r11.rate;	 Catch:{ IllegalArgumentException -> 0x0082 }
        r11.bitsAvailableForSqueezing = r0;	 Catch:{ IllegalArgumentException -> 0x0082 }
    L_0x0054:
        r0 = r11.bitsAvailableForSqueezing;
        r6 = (long) r0;
        r8 = r14 - r2;
        r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r1 <= 0) goto L_0x0060;
    L_0x005d:
        r0 = r14 - r2;
        r0 = (int) r0;
    L_0x0060:
        r1 = r11.dataQueue;
        r5 = r11.rate;
        r6 = r11.bitsAvailableForSqueezing;
        r5 = r5 - r6;
        r5 = r5 / 8;
        r6 = 8;
        r6 = r2 / r6;
        r6 = (int) r6;
        r6 = r6 + r13;
        r7 = r0 / 8;
        java.lang.System.arraycopy(r1, r5, r12, r6, r7);
        r1 = r11.bitsAvailableForSqueezing;
        r1 = r1 - r0;
        r11.bitsAvailableForSqueezing = r1;
        r0 = (long) r0;
        r0 = r0 + r2;
        if (r4 == 0) goto L_0x0084;
    L_0x007d:
        return;
    L_0x007e:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0080 }
    L_0x0080:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0082 }
    L_0x0082:
        r0 = move-exception;
        throw r0;
    L_0x0084:
        r2 = r0;
        goto L_0x0025;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.spongycastle.crypto.digests.KeccakDigest.squeeze(byte[], int, long):void");
    }

    private void keccakPermutationAfterXor(byte[] bArr, byte[] bArr2, int i) {
        boolean z = GeneralDigest.a;
        int i2 = 0;
        while (i2 < i) {
            bArr[i2] = (byte) (bArr[i2] ^ bArr2[i2]);
            i2++;
            if (z) {
                break;
            }
        }
        keccakPermutation(bArr);
    }

    private void keccakPermutation(byte[] bArr) {
        long[] jArr = new long[(bArr.length / 8)];
        fromBytesToWords(jArr, bArr);
        keccakPermutationOnWords(jArr);
        fromWordsToBytes(bArr, jArr);
    }

    public int getByteLength() {
        return this.rate / 8;
    }

    private void fromWordsToBytes(byte[] bArr, long[] jArr) {
        boolean z = GeneralDigest.a;
        int i = 0;
        while (i < 25) {
            int i2 = i * 8;
            int i3 = 0;
            while (i3 < 8) {
                bArr[i2 + i3] = (byte) ((int) ((jArr[i] >>> (i3 * 8)) & 255));
                i3++;
                if (z) {
                    break;
                }
            }
            i3 = i + 1;
            if (!z) {
                i = i3;
            } else {
                return;
            }
        }
    }

    private void fromBytesToWords(long[] jArr, byte[] bArr) {
        boolean z = GeneralDigest.a;
        int i = 0;
        while (i < 25) {
            jArr[i] = 0;
            int i2 = i * 8;
            int i3 = 0;
            while (i3 < 8) {
                jArr[i] = jArr[i] | ((((long) bArr[i2 + i3]) & 255) << (i3 * 8));
                i3++;
                if (z) {
                    break;
                }
            }
            i3 = i + 1;
            if (!z) {
                i = i3;
            } else {
                return;
            }
        }
    }

    private static boolean LFSR86540(byte[] bArr) {
        try {
            boolean z;
            if ((bArr[0] & 1) != 0) {
                z = true;
            } else {
                z = false;
            }
            try {
                if ((bArr[0] & 128) != 0) {
                    bArr[0] = (byte) ((bArr[0] << 1) ^ 113);
                } else {
                    bArr[0] = (byte) (bArr[0] << 1);
                }
                return z;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    private static long[] keccakInitializeRoundConstants() {
        long[] jArr = new long[24];
        byte[] bArr = new byte[]{(byte) 1};
        for (int i = 0; i < 24; i++) {
            jArr[i] = 0;
            int i2 = 0;
            while (i2 < 7) {
                int i3 = (1 << i2) - 1;
                try {
                    if (LFSR86540(bArr)) {
                        jArr[i] = jArr[i] ^ (1 << i3);
                    }
                    i2++;
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            }
        }
        return jArr;
    }

    private void chi(long[] jArr) {
        boolean z = GeneralDigest.a;
        int i = 0;
        while (i < 5) {
            int i2 = 0;
            while (i2 < 5) {
                this.chiC[i2] = jArr[(i * 5) + i2] ^ ((jArr[((i2 + 1) % 5) + (i * 5)] ^ -1) & jArr[((i2 + 2) % 5) + (i * 5)]);
                i2++;
                if (z) {
                    break;
                }
            }
            i2 = 0;
            while (i2 < 5) {
                jArr[(i * 5) + i2] = this.chiC[i2];
                i2++;
                if (z) {
                    break;
                }
            }
            i2 = i + 1;
            if (!z) {
                i = i2;
            } else {
                return;
            }
        }
    }

    static {
        int i;
        int i2;
        String[] strArr = new String[7];
        char[] toCharArray = "mB\u001d\u001b8mHK\b5pIK\f5hY\u000e".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 4;
                    break;
                case at.g /*1*/:
                    i2 = 44;
                    break;
                case at.i /*2*/:
                    i2 = arj.Theme_seekBarStyle;
                    break;
                case at.o /*3*/:
                    i2 = 122;
                    break;
                default:
                    i2 = 84;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "vM\u001f\u001ft/\f\b\u001b$eO\u0002\u000e-$\rVZe2\u001c[".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 4;
                    break;
                case at.g /*1*/:
                    i2 = 44;
                    break;
                case at.i /*2*/:
                    i2 = arj.Theme_seekBarStyle;
                    break;
                case at.o /*3*/:
                    i2 = 122;
                    break;
                default:
                    i2 = 84;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[1] = new String(cArr).intern();
        toCharArray = "OI\b\u00195o\u0001".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 4;
                    break;
                case at.g /*1*/:
                    i2 = 44;
                    break;
                case at.i /*2*/:
                    i2 = arj.Theme_seekBarStyle;
                    break;
                case at.o /*3*/:
                    i2 = 122;
                    break;
                default:
                    i2 = 84;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[2] = new String(cArr).intern();
        toCharArray = "kY\u001f\n!p`\u000e\u00143pDK\u0014;p\f\nZ9q@\u001f\u0013$hIK\u00152$\u0014".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 4;
                    break;
                case at.g /*1*/:
                    i2 = 44;
                    break;
                case at.i /*2*/:
                    i2 = arj.Theme_seekBarStyle;
                    break;
                case at.o /*3*/:
                    i2 = 122;
                    break;
                default:
                    i2 = 84;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[3] = new String(cArr).intern();
        toCharArray = "fE\u001f61jK\u001f\u0012tiY\u0018\u000etfIK\u0015:a\f\u0004\u001ct5\u001eSVt6\u001e_Vt6\u0019]Vt6\u0014SVt7\u0014_Vtk^KOe6\u0002".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 4;
                    break;
                case at.g /*1*/:
                    i2 = 44;
                    break;
                case at.i /*2*/:
                    i2 = arj.Theme_seekBarStyle;
                    break;
                case at.o /*3*/:
                    i2 = 122;
                    break;
                default:
                    i2 = 84;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[4] = new String(cArr).intern();
        toCharArray = "eX\u001f\u001f9tXK\u000e;$M\t\t;vNK\r=pDK\u00150`\f\u0007\u001f:cX\u0003Z%qI\u001e\u001fz".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 4;
                    break;
                case at.g /*1*/:
                    i2 = 44;
                    break;
                case at.i /*2*/:
                    i2 = arj.Theme_seekBarStyle;
                    break;
                case at.o /*3*/:
                    i2 = 122;
                    break;
                default:
                    i2 = 84;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[5] = new String(cArr).intern();
        toCharArray = "eX\u001f\u001f9tXK\u000e;$M\t\t;vNK\r<m@\u000eZ'uY\u000e\u001f.mB\fT".toCharArray();
        int length2 = toCharArray.length;
        cArr = toCharArray;
        for (length = 0; length2 > length; length++) {
            c = cArr[length];
            switch (length % 5) {
                case v.m /*0*/:
                    i2 = 4;
                    break;
                case at.g /*1*/:
                    i2 = 44;
                    break;
                case at.i /*2*/:
                    i2 = arj.Theme_seekBarStyle;
                    break;
                case at.o /*3*/:
                    i2 = 122;
                    break;
                default:
                    i2 = 84;
                    break;
            }
            cArr[length] = (char) (i2 ^ c);
        }
        strArr[6] = new String(cArr).intern();
        z = strArr;
        KeccakRoundConstants = keccakInitializeRoundConstants();
        KeccakRhoOffsets = keccakInitializeRhoOffsets();
    }

    public KeccakDigest() {
        this(288);
    }

    private static int[] keccakInitializeRhoOffsets() {
        int i = 0;
        int[] iArr = new int[25];
        iArr[0] = 0;
        int i2 = 1;
        int i3 = 0;
        while (i < 24) {
            iArr[(i2 % 5) + ((i3 % 5) * 5)] = (((i + 1) * (i + 2)) / 2) % 64;
            i3 = ((i3 * 3) + (i2 * 2)) % 5;
            i++;
            i2 = ((i2 * 0) + (i3 * 1)) % 5;
        }
        return iArr;
    }

    public String getAlgorithmName() {
        return z[2] + this.fixedOutputLength;
    }

    private void pi(long[] jArr) {
        boolean z = GeneralDigest.a;
        System.arraycopy(jArr, 0, this.tempA, 0, this.tempA.length);
        int i = 0;
        while (i < 5) {
            int i2 = 0;
            while (i2 < 5) {
                jArr[((((i * 2) + (i2 * 3)) % 5) * 5) + i2] = this.tempA[(i2 * 5) + i];
                i2++;
                if (z) {
                    break;
                }
            }
            i2 = i + 1;
            if (!z) {
                i = i2;
            } else {
                return;
            }
        }
    }

    private void keccakPermutationOnWords(long[] jArr) {
        boolean z = GeneralDigest.a;
        int i = 0;
        while (i < 24) {
            theta(jArr);
            rho(jArr);
            pi(jArr);
            chi(jArr);
            iota(jArr, i);
            i++;
            if (z) {
                return;
            }
        }
    }

    private void KeccakExtract(byte[] bArr, byte[] bArr2, int i) {
        System.arraycopy(bArr, 0, bArr2, 0, i * 8);
    }

    private void theta(long[] jArr) {
        boolean z = GeneralDigest.a;
        int i = 0;
        while (i < 5) {
            this.C[i] = 0;
            int i2 = 0;
            while (i2 < 5) {
                long[] jArr2 = this.C;
                jArr2[i] = jArr2[i] ^ jArr[(i2 * 5) + i];
                i2++;
                if (z) {
                    break;
                }
            }
            i2 = i + 1;
            if (z) {
                break;
            }
            i = i2;
        }
        i = 0;
        while (i < 5) {
            long j = ((this.C[(i + 1) % 5] << 1) ^ (this.C[(i + 1) % 5] >>> 63)) ^ this.C[(i + 4) % 5];
            i2 = 0;
            while (i2 < 5) {
                int i3 = (i2 * 5) + i;
                jArr[i3] = jArr[i3] ^ j;
                i2++;
                if (z) {
                    break;
                }
            }
            i2 = i + 1;
            if (!z) {
                i = i2;
            } else {
                return;
            }
        }
    }

    private void absorbQueue() {
        KeccakAbsorb(this.state, this.dataQueue, this.rate / 8);
        this.bitsInQueue = 0;
    }

    private void KeccakExtract1024bits(byte[] bArr, byte[] bArr2) {
        System.arraycopy(bArr, 0, bArr2, 0, 128);
    }

    protected int doFinal(byte[] bArr, int i, byte b, int i2) {
        if (i2 > 0) {
            try {
                this.oneByte[0] = b;
                absorb(this.oneByte, 0, (long) i2);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        squeeze(bArr, i, (long) this.fixedOutputLength);
        reset();
        return getDigestSize();
    }

    private void iota(long[] jArr, int i) {
        jArr[0] = jArr[0] ^ KeccakRoundConstants[i];
    }

    private void KeccakAbsorb(byte[] bArr, byte[] bArr2, int i) {
        keccakPermutationAfterXor(bArr, bArr2, i);
    }

    private void rho(long[] jArr) {
        boolean z = GeneralDigest.a;
        int i = 0;
        while (i < 5) {
            int i2;
            int i3 = 0;
            while (i3 < 5) {
                int i4 = i + (i3 * 5);
                try {
                    long j;
                    if (KeccakRhoOffsets[i4] != 0) {
                        j = (jArr[i4] << KeccakRhoOffsets[i4]) ^ (jArr[i4] >>> (64 - KeccakRhoOffsets[i4]));
                    } else {
                        j = jArr[i4];
                    }
                    jArr[i4] = j;
                    i2 = i3 + 1;
                    if (z) {
                        break;
                    }
                    i3 = i2;
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            }
            i2 = i + 1;
            if (!z) {
                i = i2;
            } else {
                return;
            }
        }
    }
}
