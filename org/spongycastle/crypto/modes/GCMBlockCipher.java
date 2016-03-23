package org.spongycastle.crypto.modes;

import com.whatsapp.arj;
import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.OutputLengthException;
import org.spongycastle.crypto.modes.gcm.GCMUtil;
import org.spongycastle.crypto.modes.gcm.Tables1kGCMExponentiator;
import org.spongycastle.crypto.modes.gcm.Tables8kGCMMultiplier;
import org.spongycastle.util.Arrays;
import org.v;
import org.whispersystems.at;

public class GCMBlockCipher implements AEADBlockCipher {
    private static final int BLOCK_SIZE = 16;
    public static boolean a;
    private static final String[] z;
    private byte[] H;
    private byte[] J0;
    private byte[] S;
    private byte[] S_at;
    private byte[] S_atPre;
    private byte[] atBlock;
    private int atBlockPos;
    private long atLength;
    private long atLengthPre;
    private byte[] bufBlock;
    private int bufOff;
    private BlockCipher cipher;
    private byte[] counter;
    private Tables1kGCMExponentiator exp;
    private boolean forEncryption;
    private byte[] initialAssociatedText;
    private byte[] macBlock;
    private int macSize;
    private Tables8kGCMMultiplier multiplier;
    private byte[] nonce;
    private long totalLength;

    static {
        int i;
        int i2;
        String[] strArr = new String[12];
        char[] toCharArray = "Y\u0007\n]XI\t\u0011\u001c\u000bU\t\fH".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 61;
                    break;
                case at.g /*1*/:
                    i2 = arj.Theme_checkboxStyle;
                    break;
                case at.i /*2*/:
                    i2 = 126;
                    break;
                case at.o /*3*/:
                    i2 = 60;
                    break;
                default:
                    i2 = 120;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "r\u0013\nL\rIF\u001cI\u001e[\u0003\f\u001c\fR\t^O\u0010R\u0014\n".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 61;
                    break;
                case at.g /*1*/:
                    i2 = arj.Theme_checkboxStyle;
                    break;
                case at.i /*2*/:
                    i2 = 126;
                    break;
                case at.o /*3*/:
                    i2 = 60;
                    break;
                default:
                    i2 = 120;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[1] = new String(cArr).intern();
        toCharArray = "P\u0007\u001d\u001c\u001bU\u0003\u001dWXT\b^{;pF\u0018]\u0011Q\u0003\u001a".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 61;
                    break;
                case at.g /*1*/:
                    i2 = arj.Theme_checkboxStyle;
                    break;
                case at.i /*2*/:
                    i2 = 126;
                    break;
                case at.o /*3*/:
                    i2 = 60;
                    break;
                default:
                    i2 = 120;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[2] = new String(cArr).intern();
        toCharArray = "r\u0013\nL\rIF\u001cI\u001e[\u0003\f\u001c\fR\t^O\u0010R\u0014\n".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 61;
                    break;
                case at.g /*1*/:
                    i2 = arj.Theme_checkboxStyle;
                    break;
                case at.i /*2*/:
                    i2 = 126;
                    break;
                case at.o /*3*/:
                    i2 = 60;
                    break;
                default:
                    i2 = 120;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[3] = new String(cArr).intern();
        toCharArray = "r\u0013\nL\rIF\u001cI\u001e[\u0003\f\u001c\fR\t^O\u0010R\u0014\n".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 61;
                    break;
                case at.g /*1*/:
                    i2 = arj.Theme_checkboxStyle;
                    break;
                case at.i /*2*/:
                    i2 = 126;
                    break;
                case at.o /*3*/:
                    i2 = 60;
                    break;
                default:
                    i2 = 120;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[4] = new String(cArr).intern();
        toCharArray = "^\u000f\u000eT\u001dOF\fY\tH\u000f\fY\u001c\u001d\u0011\u0017H\u0010\u001d\u0007^^\u0014R\u0005\u0015\u001c\u000bT\u001c\u001b\u001c\u0017[FO\nV".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 61;
                    break;
                case at.g /*1*/:
                    i2 = arj.Theme_checkboxStyle;
                    break;
                case at.i /*2*/:
                    i2 = 126;
                    break;
                case at.o /*3*/:
                    i2 = 60;
                    break;
                default:
                    i2 = 120;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[5] = new String(cArr).intern();
        toCharArray = "t\b\u000eI\f\u001d\u0004\u000bZ\u001eX\u0014^H\u0017RF\rT\u0017O\u0012".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 61;
                    break;
                case at.g /*1*/:
                    i2 = arj.Theme_checkboxStyle;
                    break;
                case at.i /*2*/:
                    i2 = 126;
                    break;
                case at.o /*3*/:
                    i2 = 60;
                    break;
                default:
                    i2 = 120;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[6] = new String(cArr).intern();
        toCharArray = "\u0012!=q".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 61;
                    break;
                case at.g /*1*/:
                    i2 = arj.Theme_checkboxStyle;
                    break;
                case at.i /*2*/:
                    i2 = 126;
                    break;
                case at.o /*3*/:
                    i2 = 60;
                    break;
                default:
                    i2 = 120;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[7] = new String(cArr).intern();
        toCharArray = "t\b\b]\u0014T\u0002^J\u0019Q\u0013\u001b\u001c\u001eR\u0014^q9~F\rU\u0002X\\^".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 61;
                    break;
                case at.g /*1*/:
                    i2 = arj.Theme_checkboxStyle;
                    break;
                case at.i /*2*/:
                    i2 = 126;
                    break;
                case at.o /*3*/:
                    i2 = 60;
                    break;
                default:
                    i2 = 120;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[8] = new String(cArr).intern();
        toCharArray = "T\b\b]\u0014T\u0002^L\u0019O\u0007\u0013Y\fX\u0014\r\u001c\b\\\u0015\rY\u001c\u001d\u0012\u0011\u001c?~+".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 61;
                    break;
                case at.g /*1*/:
                    i2 = arj.Theme_checkboxStyle;
                    break;
                case at.i /*2*/:
                    i2 = 126;
                    break;
                case at.o /*3*/:
                    i2 = 60;
                    break;
                default:
                    i2 = 120;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[9] = new String(cArr).intern();
        toCharArray = "t0^Q\rN\u0012^^\u001d\u001d\u0007\n\u001c\u0014X\u0007\rHX\fF\u001cE\fX".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 61;
                    break;
                case at.g /*1*/:
                    i2 = arj.Theme_checkboxStyle;
                    break;
                case at.i /*2*/:
                    i2 = 126;
                    break;
                case at.o /*3*/:
                    i2 = 60;
                    break;
                default:
                    i2 = 120;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[10] = new String(cArr).intern();
        toCharArray = "v\u0003\u0007\u001c\u0015H\u0015\n\u001c\u001aXF\rL\u001d^\u000f\u0018U\u001dYF\u0017RXT\b\u0017H\u0011\\\n^U\u0016T\u0012".toCharArray();
        int length2 = toCharArray.length;
        cArr = toCharArray;
        for (length = 0; length2 > length; length++) {
            c = cArr[length];
            switch (length % 5) {
                case v.m /*0*/:
                    i2 = 61;
                    break;
                case at.g /*1*/:
                    i2 = arj.Theme_checkboxStyle;
                    break;
                case at.i /*2*/:
                    i2 = 126;
                    break;
                case at.o /*3*/:
                    i2 = 60;
                    break;
                default:
                    i2 = 120;
                    break;
            }
            cArr[length] = (char) (i2 ^ c);
        }
        strArr[11] = new String(cArr).intern();
        z = strArr;
    }

    public int processByte(byte b, byte[] bArr, int i) {
        try {
            this.bufBlock[this.bufOff] = b;
            int i2 = this.bufOff + 1;
            this.bufOff = i2;
            if (i2 != this.bufBlock.length) {
                return 0;
            }
            outputBlock(bArr, i);
            return BLOCK_SIZE;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    private byte[] getNextCounterBlock() {
        int i = 1 + (this.counter[15] & 255);
        this.counter[15] = (byte) i;
        i = (i >>> 8) + (this.counter[14] & 255);
        this.counter[14] = (byte) i;
        i = (i >>> 8) + (this.counter[13] & 255);
        this.counter[13] = (byte) i;
        this.counter[12] = (byte) ((i >>> 8) + (this.counter[12] & 255));
        byte[] bArr = new byte[BLOCK_SIZE];
        this.cipher.processBlock(this.counter, 0, bArr, 0);
        return bArr;
    }

    public String getAlgorithmName() {
        return this.cipher.getAlgorithmName() + z[7];
    }

    public void reset() {
        reset(true);
    }

    private void gHASHPartial(byte[] bArr, byte[] bArr2, int i, int i2) {
        GCMUtil.xor(bArr, bArr2, i, i2);
        this.multiplier.multiplyH(bArr);
    }

    public int getUpdateOutputSize(int i) {
        int i2 = this.bufOff + i;
        try {
            if (!this.forEncryption) {
                if (i2 < this.macSize) {
                    return 0;
                }
                i2 -= this.macSize;
            }
            return i2 - (i2 % BLOCK_SIZE);
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    private void initCipher() {
        try {
            if (this.atLength > 0) {
                System.arraycopy(this.S_at, 0, this.S_atPre, 0, BLOCK_SIZE);
                this.atLengthPre = this.atLength;
            }
            try {
                if (this.atBlockPos > 0) {
                    gHASHPartial(this.S_atPre, this.atBlock, 0, this.atBlockPos);
                    this.atLengthPre += (long) this.atBlockPos;
                }
                try {
                    if (this.atLengthPre > 0) {
                        System.arraycopy(this.S_atPre, 0, this.S, 0, BLOCK_SIZE);
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
    }

    public GCMBlockCipher(BlockCipher blockCipher) {
        if (blockCipher.getBlockSize() != BLOCK_SIZE) {
            throw new IllegalArgumentException(z[5]);
        }
        this.cipher = blockCipher;
        this.multiplier = new Tables8kGCMMultiplier();
    }

    private void gCTRPartial(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        Object nextCounterBlock = getNextCounterBlock();
        try {
            GCMUtil.xor(nextCounterBlock, bArr, i, i2);
            System.arraycopy(nextCounterBlock, 0, bArr2, i3, i2);
            byte[] bArr3 = this.S;
            if (this.forEncryption) {
                bArr = nextCounterBlock;
            }
            gHASHPartial(bArr3, bArr, 0, i2);
            this.totalLength += (long) i2;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public void processAADBytes(byte[] bArr, int i, int i2) {
        int i3 = 0;
        boolean z = a;
        while (i3 < i2) {
            try {
                this.atBlock[this.atBlockPos] = bArr[i + i3];
                int i4 = this.atBlockPos + 1;
                this.atBlockPos = i4;
                if (i4 == BLOCK_SIZE) {
                    gHASHBlock(this.S_at, this.atBlock);
                    this.atBlockPos = 0;
                    this.atLength += 16;
                }
                i3++;
                if (z) {
                    return;
                }
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
    }

    public byte[] getMac() {
        return Arrays.clone(this.macBlock);
    }

    private void gHASHBlock(byte[] bArr, byte[] bArr2) {
        GCMUtil.xor(bArr, bArr2);
        this.multiplier.multiplyH(bArr);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void init(boolean r9, org.spongycastle.crypto.CipherParameters r10) {
        /*
        r8 = this;
        r7 = 0;
        r2 = 1;
        r1 = 0;
        r3 = 16;
        r4 = a;
        r8.forEncryption = r9;
        r8.macBlock = r7;
        r0 = r10 instanceof org.spongycastle.crypto.params.AEADParameters;
        if (r0 == 0) goto L_0x005e;
    L_0x000f:
        r0 = r10;
        r0 = (org.spongycastle.crypto.params.AEADParameters) r0;
        r5 = r0.getNonce();
        r8.nonce = r5;
        r5 = r0.getAssociatedText();
        r8.initialAssociatedText = r5;
        r5 = r0.getMacSize();
        r6 = 32;
        if (r5 < r6) goto L_0x002e;
    L_0x0026:
        r6 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        if (r5 > r6) goto L_0x002e;
    L_0x002a:
        r6 = r5 % 8;
        if (r6 == 0) goto L_0x004d;
    L_0x002e:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x004b }
        r1 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x004b }
        r1.<init>();	 Catch:{ IllegalArgumentException -> 0x004b }
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x004b }
        r3 = 8;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x004b }
        r1 = r1.append(r2);	 Catch:{ IllegalArgumentException -> 0x004b }
        r1 = r1.append(r5);	 Catch:{ IllegalArgumentException -> 0x004b }
        r1 = r1.toString();	 Catch:{ IllegalArgumentException -> 0x004b }
        r0.<init>(r1);	 Catch:{ IllegalArgumentException -> 0x004b }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x004b }
    L_0x004b:
        r0 = move-exception;
        throw r0;
    L_0x004d:
        r5 = r5 / 8;
        r8.macSize = r5;
        r0 = r0.getKey();
        if (r4 == 0) goto L_0x0088;
    L_0x0057:
        r0 = org.spongycastle.jcajce.provider.digest.BCMessageDigest.a;	 Catch:{ IllegalArgumentException -> 0x0084 }
        if (r0 == 0) goto L_0x0086;
    L_0x005b:
        r0 = r1;
    L_0x005c:
        org.spongycastle.jcajce.provider.digest.BCMessageDigest.a = r0;
    L_0x005e:
        r0 = r10 instanceof org.spongycastle.crypto.params.ParametersWithIV;
        if (r0 == 0) goto L_0x0076;
    L_0x0062:
        r10 = (org.spongycastle.crypto.params.ParametersWithIV) r10;
        r0 = r10.getIV();
        r8.nonce = r0;
        r8.initialAssociatedText = r7;
        r8.macSize = r3;
        r0 = r10.getParameters();
        r0 = (org.spongycastle.crypto.params.KeyParameter) r0;
        if (r4 == 0) goto L_0x0088;
    L_0x0076:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0082 }
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x0082 }
        r2 = 9;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x0082 }
        r0.<init>(r1);	 Catch:{ IllegalArgumentException -> 0x0082 }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0082 }
    L_0x0082:
        r0 = move-exception;
        throw r0;
    L_0x0084:
        r0 = move-exception;
        throw r0;
    L_0x0086:
        r0 = r2;
        goto L_0x005c;
    L_0x0088:
        r1 = r0;
        if (r9 == 0) goto L_0x00a7;
    L_0x008b:
        r0 = r3;
    L_0x008c:
        r0 = new byte[r0];	 Catch:{ IllegalArgumentException -> 0x00ac }
        r8.bufBlock = r0;	 Catch:{ IllegalArgumentException -> 0x00ac }
        r0 = r8.nonce;	 Catch:{ IllegalArgumentException -> 0x00ac }
        if (r0 == 0) goto L_0x0099;
    L_0x0094:
        r0 = r8.nonce;	 Catch:{ IllegalArgumentException -> 0x00a5 }
        r0 = r0.length;	 Catch:{ IllegalArgumentException -> 0x00a5 }
        if (r0 >= r2) goto L_0x00ae;
    L_0x0099:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x00a5 }
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x00a5 }
        r2 = 10;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x00a5 }
        r0.<init>(r1);	 Catch:{ IllegalArgumentException -> 0x00a5 }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00a5 }
    L_0x00a5:
        r0 = move-exception;
        throw r0;
    L_0x00a7:
        r0 = r8.macSize;
        r0 = r0 + 16;
        goto L_0x008c;
    L_0x00ac:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00a5 }
    L_0x00ae:
        if (r1 == 0) goto L_0x00d3;
    L_0x00b0:
        r0 = r8.cipher;	 Catch:{ IllegalArgumentException -> 0x00e5 }
        r2 = 1;
        r0.init(r2, r1);	 Catch:{ IllegalArgumentException -> 0x00e5 }
        r0 = 16;
        r0 = new byte[r0];	 Catch:{ IllegalArgumentException -> 0x00e5 }
        r8.H = r0;	 Catch:{ IllegalArgumentException -> 0x00e5 }
        r0 = r8.cipher;	 Catch:{ IllegalArgumentException -> 0x00e5 }
        r1 = r8.H;	 Catch:{ IllegalArgumentException -> 0x00e5 }
        r2 = 0;
        r5 = r8.H;	 Catch:{ IllegalArgumentException -> 0x00e5 }
        r6 = 0;
        r0.processBlock(r1, r2, r5, r6);	 Catch:{ IllegalArgumentException -> 0x00e5 }
        r0 = r8.multiplier;	 Catch:{ IllegalArgumentException -> 0x00e5 }
        r1 = r8.H;	 Catch:{ IllegalArgumentException -> 0x00e5 }
        r0.init(r1);	 Catch:{ IllegalArgumentException -> 0x00e5 }
        r0 = 0;
        r8.exp = r0;	 Catch:{ IllegalArgumentException -> 0x00e5 }
        if (r4 == 0) goto L_0x00e7;
    L_0x00d3:
        r0 = r8.H;	 Catch:{ IllegalArgumentException -> 0x00e3 }
        if (r0 != 0) goto L_0x00e7;
    L_0x00d7:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x00e3 }
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x00e3 }
        r2 = 11;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x00e3 }
        r0.<init>(r1);	 Catch:{ IllegalArgumentException -> 0x00e3 }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00e3 }
    L_0x00e3:
        r0 = move-exception;
        throw r0;
    L_0x00e5:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00e3 }
    L_0x00e7:
        r0 = 16;
        r0 = new byte[r0];	 Catch:{ IllegalArgumentException -> 0x0166 }
        r8.J0 = r0;	 Catch:{ IllegalArgumentException -> 0x0166 }
        r0 = r8.nonce;	 Catch:{ IllegalArgumentException -> 0x0166 }
        r0 = r0.length;	 Catch:{ IllegalArgumentException -> 0x0166 }
        r1 = 12;
        if (r0 != r1) goto L_0x0109;
    L_0x00f4:
        r0 = r8.nonce;	 Catch:{ IllegalArgumentException -> 0x0166 }
        r1 = 0;
        r2 = r8.J0;	 Catch:{ IllegalArgumentException -> 0x0166 }
        r5 = 0;
        r6 = r8.nonce;	 Catch:{ IllegalArgumentException -> 0x0166 }
        r6 = r6.length;	 Catch:{ IllegalArgumentException -> 0x0166 }
        java.lang.System.arraycopy(r0, r1, r2, r5, r6);	 Catch:{ IllegalArgumentException -> 0x0166 }
        r0 = r8.J0;	 Catch:{ IllegalArgumentException -> 0x0166 }
        r1 = 15;
        r2 = 1;
        r0[r1] = r2;	 Catch:{ IllegalArgumentException -> 0x0166 }
        if (r4 == 0) goto L_0x0126;
    L_0x0109:
        r0 = r8.J0;
        r1 = r8.nonce;
        r2 = r8.nonce;
        r2 = r2.length;
        r8.gHASH(r0, r1, r2);
        r0 = new byte[r3];
        r1 = r8.nonce;
        r1 = r1.length;
        r2 = (long) r1;
        r4 = 8;
        r2 = r2 * r4;
        r1 = 8;
        org.spongycastle.util.Pack.longToBigEndian(r2, r0, r1);
        r1 = r8.J0;
        r8.gHASHBlock(r1, r0);
    L_0x0126:
        r0 = 16;
        r0 = new byte[r0];	 Catch:{ IllegalArgumentException -> 0x0168 }
        r8.S = r0;	 Catch:{ IllegalArgumentException -> 0x0168 }
        r0 = 16;
        r0 = new byte[r0];	 Catch:{ IllegalArgumentException -> 0x0168 }
        r8.S_at = r0;	 Catch:{ IllegalArgumentException -> 0x0168 }
        r0 = 16;
        r0 = new byte[r0];	 Catch:{ IllegalArgumentException -> 0x0168 }
        r8.S_atPre = r0;	 Catch:{ IllegalArgumentException -> 0x0168 }
        r0 = 16;
        r0 = new byte[r0];	 Catch:{ IllegalArgumentException -> 0x0168 }
        r8.atBlock = r0;	 Catch:{ IllegalArgumentException -> 0x0168 }
        r0 = 0;
        r8.atBlockPos = r0;	 Catch:{ IllegalArgumentException -> 0x0168 }
        r0 = 0;
        r8.atLength = r0;	 Catch:{ IllegalArgumentException -> 0x0168 }
        r0 = 0;
        r8.atLengthPre = r0;	 Catch:{ IllegalArgumentException -> 0x0168 }
        r0 = r8.J0;	 Catch:{ IllegalArgumentException -> 0x0168 }
        r0 = org.spongycastle.util.Arrays.clone(r0);	 Catch:{ IllegalArgumentException -> 0x0168 }
        r8.counter = r0;	 Catch:{ IllegalArgumentException -> 0x0168 }
        r0 = 0;
        r8.bufOff = r0;	 Catch:{ IllegalArgumentException -> 0x0168 }
        r0 = 0;
        r8.totalLength = r0;	 Catch:{ IllegalArgumentException -> 0x0168 }
        r0 = r8.initialAssociatedText;	 Catch:{ IllegalArgumentException -> 0x0168 }
        if (r0 == 0) goto L_0x0165;
    L_0x015c:
        r0 = r8.initialAssociatedText;	 Catch:{ IllegalArgumentException -> 0x0168 }
        r1 = 0;
        r2 = r8.initialAssociatedText;	 Catch:{ IllegalArgumentException -> 0x0168 }
        r2 = r2.length;	 Catch:{ IllegalArgumentException -> 0x0168 }
        r8.processAADBytes(r0, r1, r2);	 Catch:{ IllegalArgumentException -> 0x0168 }
    L_0x0165:
        return;
    L_0x0166:
        r0 = move-exception;
        throw r0;
    L_0x0168:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.spongycastle.crypto.modes.GCMBlockCipher.init(boolean, org.spongycastle.crypto.CipherParameters):void");
    }

    public void processAADByte(byte b) {
        try {
            this.atBlock[this.atBlockPos] = b;
            int i = this.atBlockPos + 1;
            this.atBlockPos = i;
            if (i == BLOCK_SIZE) {
                gHASHBlock(this.S_at, this.atBlock);
                this.atBlockPos = 0;
                this.atLength += 16;
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int doFinal(byte[] r11, int r12) {
        /*
        r10 = this;
        r6 = a;
        r0 = r10.totalLength;	 Catch:{ IllegalArgumentException -> 0x0028 }
        r2 = 0;
        r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r0 != 0) goto L_0x000d;
    L_0x000a:
        r10.initCipher();	 Catch:{ IllegalArgumentException -> 0x0028 }
    L_0x000d:
        r3 = r10.bufOff;
        r0 = r10.forEncryption;	 Catch:{ IllegalArgumentException -> 0x002a }
        if (r0 == 0) goto L_0x002c;
    L_0x0013:
        r0 = r11.length;	 Catch:{ IllegalArgumentException -> 0x0026 }
        r1 = r12 + r3;
        r2 = r10.macSize;	 Catch:{ IllegalArgumentException -> 0x0026 }
        r1 = r1 + r2;
        if (r0 >= r1) goto L_0x0052;
    L_0x001b:
        r0 = new org.spongycastle.crypto.OutputLengthException;	 Catch:{ IllegalArgumentException -> 0x0026 }
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x0026 }
        r2 = 3;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x0026 }
        r0.<init>(r1);	 Catch:{ IllegalArgumentException -> 0x0026 }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0026 }
    L_0x0026:
        r0 = move-exception;
        throw r0;
    L_0x0028:
        r0 = move-exception;
        throw r0;
    L_0x002a:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0026 }
    L_0x002c:
        r0 = r10.macSize;	 Catch:{ IllegalArgumentException -> 0x003b }
        if (r3 >= r0) goto L_0x003d;
    L_0x0030:
        r0 = new org.spongycastle.crypto.InvalidCipherTextException;	 Catch:{ IllegalArgumentException -> 0x003b }
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x003b }
        r2 = 0;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x003b }
        r0.<init>(r1);	 Catch:{ IllegalArgumentException -> 0x003b }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x003b }
    L_0x003b:
        r0 = move-exception;
        throw r0;
    L_0x003d:
        r0 = r10.macSize;
        r3 = r3 - r0;
        r0 = r11.length;	 Catch:{ IllegalArgumentException -> 0x0050 }
        r1 = r12 + r3;
        if (r0 >= r1) goto L_0x0052;
    L_0x0045:
        r0 = new org.spongycastle.crypto.OutputLengthException;	 Catch:{ IllegalArgumentException -> 0x0050 }
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x0050 }
        r2 = 1;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x0050 }
        r0.<init>(r1);	 Catch:{ IllegalArgumentException -> 0x0050 }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0050 }
    L_0x0050:
        r0 = move-exception;
        throw r0;
    L_0x0052:
        if (r3 <= 0) goto L_0x005d;
    L_0x0054:
        r1 = r10.bufBlock;	 Catch:{ IllegalArgumentException -> 0x012d }
        r2 = 0;
        r0 = r10;
        r4 = r11;
        r5 = r12;
        r0.gCTRPartial(r1, r2, r3, r4, r5);	 Catch:{ IllegalArgumentException -> 0x012d }
    L_0x005d:
        r0 = r10.atLength;	 Catch:{ IllegalArgumentException -> 0x012f }
        r2 = r10.atBlockPos;	 Catch:{ IllegalArgumentException -> 0x012f }
        r4 = (long) r2;	 Catch:{ IllegalArgumentException -> 0x012f }
        r0 = r0 + r4;
        r10.atLength = r0;	 Catch:{ IllegalArgumentException -> 0x012f }
        r0 = r10.atLength;	 Catch:{ IllegalArgumentException -> 0x012f }
        r4 = r10.atLengthPre;	 Catch:{ IllegalArgumentException -> 0x012f }
        r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1));
        if (r0 <= 0) goto L_0x00bb;
    L_0x006d:
        r0 = r10.atBlockPos;	 Catch:{ IllegalArgumentException -> 0x0131 }
        if (r0 <= 0) goto L_0x007b;
    L_0x0071:
        r0 = r10.S_at;	 Catch:{ IllegalArgumentException -> 0x0131 }
        r1 = r10.atBlock;	 Catch:{ IllegalArgumentException -> 0x0131 }
        r2 = 0;
        r4 = r10.atBlockPos;	 Catch:{ IllegalArgumentException -> 0x0131 }
        r10.gHASHPartial(r0, r1, r2, r4);	 Catch:{ IllegalArgumentException -> 0x0131 }
    L_0x007b:
        r0 = r10.atLengthPre;	 Catch:{ IllegalArgumentException -> 0x0133 }
        r4 = 0;
        r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1));
        if (r0 <= 0) goto L_0x008a;
    L_0x0083:
        r0 = r10.S_at;	 Catch:{ IllegalArgumentException -> 0x0133 }
        r1 = r10.S_atPre;	 Catch:{ IllegalArgumentException -> 0x0133 }
        org.spongycastle.crypto.modes.gcm.GCMUtil.xor(r0, r1);	 Catch:{ IllegalArgumentException -> 0x0133 }
    L_0x008a:
        r0 = r10.totalLength;
        r4 = 8;
        r0 = r0 * r4;
        r4 = 127; // 0x7f float:1.78E-43 double:6.27E-322;
        r0 = r0 + r4;
        r2 = 7;
        r0 = r0 >>> r2;
        r2 = 16;
        r2 = new byte[r2];
        r4 = r10.exp;	 Catch:{ IllegalArgumentException -> 0x0135 }
        if (r4 != 0) goto L_0x00aa;
    L_0x009c:
        r4 = new org.spongycastle.crypto.modes.gcm.Tables1kGCMExponentiator;	 Catch:{ IllegalArgumentException -> 0x0135 }
        r4.<init>();	 Catch:{ IllegalArgumentException -> 0x0135 }
        r10.exp = r4;	 Catch:{ IllegalArgumentException -> 0x0135 }
        r4 = r10.exp;	 Catch:{ IllegalArgumentException -> 0x0135 }
        r5 = r10.H;	 Catch:{ IllegalArgumentException -> 0x0135 }
        r4.init(r5);	 Catch:{ IllegalArgumentException -> 0x0135 }
    L_0x00aa:
        r4 = r10.exp;
        r4.exponentiateX(r0, r2);
        r0 = r10.S_at;
        org.spongycastle.crypto.modes.gcm.GCMUtil.multiply(r0, r2);
        r0 = r10.S;
        r1 = r10.S_at;
        org.spongycastle.crypto.modes.gcm.GCMUtil.xor(r0, r1);
    L_0x00bb:
        r0 = 16;
        r0 = new byte[r0];
        r4 = r10.atLength;
        r8 = 8;
        r4 = r4 * r8;
        r1 = 0;
        org.spongycastle.util.Pack.longToBigEndian(r4, r0, r1);
        r4 = r10.totalLength;
        r8 = 8;
        r4 = r4 * r8;
        r1 = 8;
        org.spongycastle.util.Pack.longToBigEndian(r4, r0, r1);
        r1 = r10.S;
        r10.gHASHBlock(r1, r0);
        r0 = 16;
        r0 = new byte[r0];
        r1 = r10.cipher;
        r2 = r10.J0;
        r4 = 0;
        r5 = 0;
        r1.processBlock(r2, r4, r0, r5);
        r1 = r10.S;
        org.spongycastle.crypto.modes.gcm.GCMUtil.xor(r0, r1);
        r1 = r10.macSize;
        r1 = new byte[r1];
        r10.macBlock = r1;
        r1 = 0;
        r2 = r10.macBlock;
        r4 = 0;
        r5 = r10.macSize;
        java.lang.System.arraycopy(r0, r1, r2, r4, r5);
        r0 = r10.forEncryption;
        if (r0 == 0) goto L_0x014c;
    L_0x00fc:
        r0 = r10.macBlock;
        r1 = 0;
        r2 = r10.bufOff;
        r2 = r2 + r12;
        r4 = r10.macSize;
        java.lang.System.arraycopy(r0, r1, r11, r2, r4);
        r0 = r10.macSize;
        r0 = r0 + r3;
        if (r6 == 0) goto L_0x0137;
    L_0x010c:
        r1 = r10.macSize;
        r1 = new byte[r1];
        r2 = r10.bufBlock;	 Catch:{ IllegalArgumentException -> 0x012b }
        r4 = 0;
        r5 = r10.macSize;	 Catch:{ IllegalArgumentException -> 0x012b }
        java.lang.System.arraycopy(r2, r3, r1, r4, r5);	 Catch:{ IllegalArgumentException -> 0x012b }
        r2 = r10.macBlock;	 Catch:{ IllegalArgumentException -> 0x012b }
        r1 = org.spongycastle.util.Arrays.constantTimeAreEqual(r2, r1);	 Catch:{ IllegalArgumentException -> 0x012b }
        if (r1 != 0) goto L_0x0137;
    L_0x0120:
        r0 = new org.spongycastle.crypto.InvalidCipherTextException;	 Catch:{ IllegalArgumentException -> 0x012b }
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x012b }
        r2 = 2;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x012b }
        r0.<init>(r1);	 Catch:{ IllegalArgumentException -> 0x012b }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x012b }
    L_0x012b:
        r0 = move-exception;
        throw r0;
    L_0x012d:
        r0 = move-exception;
        throw r0;
    L_0x012f:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0131 }
    L_0x0131:
        r0 = move-exception;
        throw r0;
    L_0x0133:
        r0 = move-exception;
        throw r0;
    L_0x0135:
        r0 = move-exception;
        throw r0;
    L_0x0137:
        r1 = r0;
        r0 = 0;
        r10.reset(r0);	 Catch:{ IllegalArgumentException -> 0x0146 }
        r0 = org.spongycastle.jcajce.provider.digest.BCMessageDigest.a;	 Catch:{ IllegalArgumentException -> 0x0146 }
        if (r0 == 0) goto L_0x0145;
    L_0x0140:
        if (r6 == 0) goto L_0x014a;
    L_0x0142:
        r0 = 0;
    L_0x0143:
        a = r0;
    L_0x0145:
        return r1;
    L_0x0146:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0148 }
    L_0x0148:
        r0 = move-exception;
        throw r0;
    L_0x014a:
        r0 = 1;
        goto L_0x0143;
    L_0x014c:
        r0 = r3;
        goto L_0x010c;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.spongycastle.crypto.modes.GCMBlockCipher.doFinal(byte[], int):int");
    }

    private void reset(boolean z) {
        try {
            this.cipher.reset();
            this.S = new byte[BLOCK_SIZE];
            this.S_at = new byte[BLOCK_SIZE];
            this.S_atPre = new byte[BLOCK_SIZE];
            this.atBlock = new byte[BLOCK_SIZE];
            this.atBlockPos = 0;
            this.atLength = 0;
            this.atLengthPre = 0;
            this.counter = Arrays.clone(this.J0);
            this.bufOff = 0;
            this.totalLength = 0;
            if (this.bufBlock != null) {
                Arrays.fill(this.bufBlock, (byte) 0);
            }
            if (z) {
                try {
                    this.macBlock = null;
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            }
            try {
                if (this.initialAssociatedText != null) {
                    processAADBytes(this.initialAssociatedText, 0, this.initialAssociatedText.length);
                }
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        } catch (IllegalArgumentException e22) {
            throw e22;
        }
    }

    public BlockCipher getUnderlyingCipher() {
        return this.cipher;
    }

    private void outputBlock(byte[] bArr, int i) {
        try {
            if (bArr.length < i + BLOCK_SIZE) {
                throw new OutputLengthException(z[4]);
            }
            try {
                if (this.totalLength == 0) {
                    initCipher();
                }
                try {
                    gCTRBlock(this.bufBlock, bArr, i);
                    if (this.forEncryption) {
                        this.bufOff = 0;
                        if (!a) {
                            return;
                        }
                    }
                    System.arraycopy(this.bufBlock, BLOCK_SIZE, this.bufBlock, 0, this.macSize);
                    this.bufOff = this.macSize;
                } catch (IllegalArgumentException e) {
                    throw e;
                } catch (IllegalArgumentException e2) {
                    throw e2;
                }
            } catch (IllegalArgumentException e22) {
                throw e22;
            }
        } catch (IllegalArgumentException e222) {
            throw e222;
        }
    }

    private void gCTRBlock(byte[] bArr, byte[] bArr2, int i) {
        byte[] nextCounterBlock = getNextCounterBlock();
        try {
            GCMUtil.xor(nextCounterBlock, bArr);
            System.arraycopy(nextCounterBlock, 0, bArr2, i, BLOCK_SIZE);
            byte[] bArr3 = this.S;
            if (this.forEncryption) {
                bArr = nextCounterBlock;
            }
            gHASHBlock(bArr3, bArr);
            this.totalLength += 16;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public int getOutputSize(int i) {
        int i2 = this.bufOff + i;
        try {
            if (this.forEncryption) {
                return i2 + this.macSize;
            }
            try {
                return i2 < this.macSize ? 0 : i2 - this.macSize;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        int i4 = 0;
        boolean z = a;
        try {
            if (bArr.length < i + i2) {
                throw new DataLengthException(z[6]);
            }
            int i5 = 0;
            while (i5 < i2) {
                try {
                    this.bufBlock[this.bufOff] = bArr[i + i5];
                    int i6 = this.bufOff + 1;
                    this.bufOff = i6;
                    if (i6 == this.bufBlock.length) {
                        outputBlock(bArr2, i3 + i4);
                        i4 += BLOCK_SIZE;
                    }
                    i5++;
                    if (z) {
                        break;
                    }
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            }
            return i4;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    private void gHASH(byte[] bArr, byte[] bArr2, int i) {
        boolean z = a;
        int i2 = 0;
        while (i2 < i) {
            gHASHPartial(bArr, bArr2, i2, Math.min(i - i2, BLOCK_SIZE));
            i2 += BLOCK_SIZE;
            if (z) {
                return;
            }
        }
    }
}
