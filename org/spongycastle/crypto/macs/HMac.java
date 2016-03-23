package org.spongycastle.crypto.macs;

import java.util.Hashtable;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.ExtendedDigest;
import org.spongycastle.crypto.Mac;
import org.spongycastle.util.Memoable;
import org.v;
import org.whispersystems.at;

public class HMac implements Mac {
    private static final byte IPAD = (byte) 54;
    private static final byte OPAD = (byte) 92;
    public static boolean a;
    private static Hashtable blockLengths;
    private static final String[] z;
    private int blockLength;
    private Digest digest;
    private int digestSize;
    private byte[] inputPad;
    private Memoable ipadState;
    private Memoable opadState;
    private byte[] outputBuf;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void init(org.spongycastle.crypto.CipherParameters r6) {
        /*
        r5 = this;
        r1 = 0;
        r3 = a;
        r0 = r5.digest;
        r0.reset();
        r6 = (org.spongycastle.crypto.params.KeyParameter) r6;
        r4 = r6.getKey();
        r0 = r4.length;
        r2 = r5.blockLength;
        if (r0 <= r2) goto L_0x002b;
    L_0x0013:
        r2 = r5.digest;
        r2.update(r4, r1, r0);
        r0 = r5.digest;
        r2 = r5.inputPad;
        r0.doFinal(r2, r1);
        r2 = r5.digestSize;
        if (r3 == 0) goto L_0x0031;
    L_0x0023:
        r0 = org.spongycastle.jcajce.provider.digest.BCMessageDigest.a;	 Catch:{ IllegalArgumentException -> 0x0093 }
        if (r0 == 0) goto L_0x0095;
    L_0x0027:
        r0 = r1;
    L_0x0028:
        org.spongycastle.jcajce.provider.digest.BCMessageDigest.a = r0;
        r0 = r2;
    L_0x002b:
        r2 = r5.inputPad;
        java.lang.System.arraycopy(r4, r1, r2, r1, r0);
        r2 = r0;
    L_0x0031:
        r0 = r5.inputPad;
        r0 = r0.length;
        if (r2 >= r0) goto L_0x003e;
    L_0x0036:
        r0 = r5.inputPad;
        r0[r2] = r1;
        r2 = r2 + 1;
        if (r3 == 0) goto L_0x0031;
    L_0x003e:
        r0 = r5.inputPad;	 Catch:{ IllegalArgumentException -> 0x0097 }
        r1 = 0;
        r2 = r5.outputBuf;	 Catch:{ IllegalArgumentException -> 0x0097 }
        r3 = 0;
        r4 = r5.blockLength;	 Catch:{ IllegalArgumentException -> 0x0097 }
        java.lang.System.arraycopy(r0, r1, r2, r3, r4);	 Catch:{ IllegalArgumentException -> 0x0097 }
        r0 = r5.inputPad;	 Catch:{ IllegalArgumentException -> 0x0097 }
        r1 = r5.blockLength;	 Catch:{ IllegalArgumentException -> 0x0097 }
        r2 = 54;
        xorPad(r0, r1, r2);	 Catch:{ IllegalArgumentException -> 0x0097 }
        r0 = r5.outputBuf;	 Catch:{ IllegalArgumentException -> 0x0097 }
        r1 = r5.blockLength;	 Catch:{ IllegalArgumentException -> 0x0097 }
        r2 = 92;
        xorPad(r0, r1, r2);	 Catch:{ IllegalArgumentException -> 0x0097 }
        r0 = r5.digest;	 Catch:{ IllegalArgumentException -> 0x0097 }
        r0 = r0 instanceof org.spongycastle.util.Memoable;	 Catch:{ IllegalArgumentException -> 0x0097 }
        if (r0 == 0) goto L_0x0077;
    L_0x0061:
        r0 = r5.digest;	 Catch:{ IllegalArgumentException -> 0x0097 }
        r0 = (org.spongycastle.util.Memoable) r0;	 Catch:{ IllegalArgumentException -> 0x0097 }
        r0 = r0.copy();	 Catch:{ IllegalArgumentException -> 0x0097 }
        r5.opadState = r0;	 Catch:{ IllegalArgumentException -> 0x0097 }
        r0 = r5.opadState;	 Catch:{ IllegalArgumentException -> 0x0097 }
        r0 = (org.spongycastle.crypto.Digest) r0;	 Catch:{ IllegalArgumentException -> 0x0097 }
        r1 = r5.outputBuf;	 Catch:{ IllegalArgumentException -> 0x0097 }
        r2 = 0;
        r3 = r5.blockLength;	 Catch:{ IllegalArgumentException -> 0x0097 }
        r0.update(r1, r2, r3);	 Catch:{ IllegalArgumentException -> 0x0097 }
    L_0x0077:
        r0 = r5.digest;	 Catch:{ IllegalArgumentException -> 0x0099 }
        r1 = r5.inputPad;	 Catch:{ IllegalArgumentException -> 0x0099 }
        r2 = 0;
        r3 = r5.inputPad;	 Catch:{ IllegalArgumentException -> 0x0099 }
        r3 = r3.length;	 Catch:{ IllegalArgumentException -> 0x0099 }
        r0.update(r1, r2, r3);	 Catch:{ IllegalArgumentException -> 0x0099 }
        r0 = r5.digest;	 Catch:{ IllegalArgumentException -> 0x0099 }
        r0 = r0 instanceof org.spongycastle.util.Memoable;	 Catch:{ IllegalArgumentException -> 0x0099 }
        if (r0 == 0) goto L_0x0092;
    L_0x0088:
        r0 = r5.digest;	 Catch:{ IllegalArgumentException -> 0x0099 }
        r0 = (org.spongycastle.util.Memoable) r0;	 Catch:{ IllegalArgumentException -> 0x0099 }
        r0 = r0.copy();	 Catch:{ IllegalArgumentException -> 0x0099 }
        r5.ipadState = r0;	 Catch:{ IllegalArgumentException -> 0x0099 }
    L_0x0092:
        return;
    L_0x0093:
        r0 = move-exception;
        throw r0;
    L_0x0095:
        r0 = 1;
        goto L_0x0028;
    L_0x0097:
        r0 = move-exception;
        throw r0;
    L_0x0099:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.spongycastle.crypto.macs.HMac.init(org.spongycastle.crypto.CipherParameters):void");
    }

    public void update(byte b) {
        this.digest.update(b);
    }

    private static int getByteLength(Digest digest) {
        try {
            if (digest instanceof ExtendedDigest) {
                return ((ExtendedDigest) digest).getByteLength();
            }
            Integer num = (Integer) blockLengths.get(digest.getAlgorithmName());
            if (num != null) {
                return num.intValue();
            }
            try {
                throw new IllegalArgumentException(z[1] + digest.getAlgorithmName());
            } catch (IllegalArgumentException e) {
                throw e;
            }
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    public int getMacSize() {
        return this.digestSize;
    }

    private HMac(Digest digest, int i) {
        this.digest = digest;
        this.digestSize = digest.getDigestSize();
        this.blockLength = i;
        this.inputPad = new byte[this.blockLength];
        this.outputBuf = new byte[(this.blockLength + this.digestSize)];
    }

    static {
        int i;
        int i2;
        String[] strArr = new String[2];
        char[] toCharArray = "1z| _".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 30;
                    break;
                case at.g /*1*/:
                    i2 = 50;
                    break;
                case at.i /*2*/:
                    i2 = 49;
                    break;
                case at.o /*3*/:
                    i2 = 97;
                    break;
                default:
                    i2 = 28;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "k\\Z\u000fsi\\\u0011\u0005uyWB\u0015<nSB\u0012yz\b\u0011".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 30;
                    break;
                case at.g /*1*/:
                    i2 = 50;
                    break;
                case at.i /*2*/:
                    i2 = 49;
                    break;
                case at.o /*3*/:
                    i2 = 97;
                    break;
                default:
                    i2 = 28;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[1] = new String(cArr).intern();
        z = strArr;
        blockLengths = new Hashtable();
        Hashtable hashtable = blockLengths;
        toCharArray = "Y}b5/*\u0003\u0000".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 30;
                    break;
                case at.g /*1*/:
                    i2 = 50;
                    break;
                case at.i /*2*/:
                    i2 = 49;
                    break;
                case at.o /*3*/:
                    i2 = 97;
                    break;
                default:
                    i2 = 28;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        hashtable.put(new String(cArr).intern(), Integer.valueOf(32));
        hashtable = blockLengths;
        toCharArray = "Sv\u0003".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 30;
                    break;
                case at.g /*1*/:
                    i2 = 50;
                    break;
                case at.i /*2*/:
                    i2 = 49;
                    break;
                case at.o /*3*/:
                    i2 = 97;
                    break;
                default:
                    i2 = 28;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        hashtable.put(new String(cArr).intern(), Integer.valueOf(16));
        hashtable = blockLengths;
        toCharArray = "Sv\u0005".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 30;
                    break;
                case at.g /*1*/:
                    i2 = 50;
                    break;
                case at.i /*2*/:
                    i2 = 49;
                    break;
                case at.o /*3*/:
                    i2 = 97;
                    break;
                default:
                    i2 = 28;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        hashtable.put(new String(cArr).intern(), Integer.valueOf(64));
        hashtable = blockLengths;
        toCharArray = "Sv\u0004".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 30;
                    break;
                case at.g /*1*/:
                    i2 = 50;
                    break;
                case at.i /*2*/:
                    i2 = 49;
                    break;
                case at.o /*3*/:
                    i2 = 97;
                    break;
                default:
                    i2 = 28;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        hashtable.put(new String(cArr).intern(), Integer.valueOf(64));
        hashtable = blockLengths;
        toCharArray = "L{a$QZ\u0003\u0003Y".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 30;
                    break;
                case at.g /*1*/:
                    i2 = 50;
                    break;
                case at.i /*2*/:
                    i2 = 49;
                    break;
                case at.o /*3*/:
                    i2 = 97;
                    break;
                default:
                    i2 = 28;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        hashtable.put(new String(cArr).intern(), Integer.valueOf(64));
        hashtable = blockLengths;
        toCharArray = "L{a$QZ\u0003\u0007Q".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 30;
                    break;
                case at.g /*1*/:
                    i2 = 50;
                    break;
                case at.i /*2*/:
                    i2 = 49;
                    break;
                case at.o /*3*/:
                    i2 = 97;
                    break;
                default:
                    i2 = 28;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        hashtable.put(new String(cArr).intern(), Integer.valueOf(64));
        hashtable = blockLengths;
        toCharArray = "MzpL-".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 30;
                    break;
                case at.g /*1*/:
                    i2 = 50;
                    break;
                case at.i /*2*/:
                    i2 = 49;
                    break;
                case at.o /*3*/:
                    i2 = 97;
                    break;
                default:
                    i2 = 28;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        hashtable.put(new String(cArr).intern(), Integer.valueOf(64));
        hashtable = blockLengths;
        toCharArray = "MzpL.,\u0006".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 30;
                    break;
                case at.g /*1*/:
                    i2 = 50;
                    break;
                case at.i /*2*/:
                    i2 = 49;
                    break;
                case at.o /*3*/:
                    i2 = 97;
                    break;
                default:
                    i2 = 28;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        hashtable.put(new String(cArr).intern(), Integer.valueOf(64));
        hashtable = blockLengths;
        toCharArray = "MzpL.+\u0004".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 30;
                    break;
                case at.g /*1*/:
                    i2 = 50;
                    break;
                case at.i /*2*/:
                    i2 = 49;
                    break;
                case at.o /*3*/:
                    i2 = 97;
                    break;
                default:
                    i2 = 28;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        hashtable.put(new String(cArr).intern(), Integer.valueOf(64));
        hashtable = blockLengths;
        toCharArray = "MzpL/&\u0006".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 30;
                    break;
                case at.g /*1*/:
                    i2 = 50;
                    break;
                case at.i /*2*/:
                    i2 = 49;
                    break;
                case at.o /*3*/:
                    i2 = 97;
                    break;
                default:
                    i2 = 28;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        hashtable.put(new String(cArr).intern(), Integer.valueOf(128));
        hashtable = blockLengths;
        toCharArray = "MzpL)/\u0000".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 30;
                    break;
                case at.g /*1*/:
                    i2 = 50;
                    break;
                case at.i /*2*/:
                    i2 = 49;
                    break;
                case at.o /*3*/:
                    i2 = 97;
                    break;
                default:
                    i2 = 28;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        hashtable.put(new String(cArr).intern(), Integer.valueOf(128));
        hashtable = blockLengths;
        toCharArray = "J[V\u0004n".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 30;
                    break;
                case at.g /*1*/:
                    i2 = 50;
                    break;
                case at.i /*2*/:
                    i2 = 49;
                    break;
                case at.o /*3*/:
                    i2 = 97;
                    break;
                default:
                    i2 = 28;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        hashtable.put(new String(cArr).intern(), Integer.valueOf(64));
        Hashtable hashtable2 = blockLengths;
        toCharArray = "IZX\u0013pn]^\r".toCharArray();
        int length2 = toCharArray.length;
        cArr = toCharArray;
        for (length = 0; length2 > length; length++) {
            char c3 = cArr[length];
            switch (length % 5) {
                case v.m /*0*/:
                    i2 = 30;
                    break;
                case at.g /*1*/:
                    i2 = 50;
                    break;
                case at.i /*2*/:
                    i2 = 49;
                    break;
                case at.o /*3*/:
                    i2 = 97;
                    break;
                default:
                    i2 = 28;
                    break;
            }
            cArr[length] = (char) (i2 ^ c3);
        }
        hashtable2.put(new String(cArr).intern(), Integer.valueOf(64));
    }

    public HMac(Digest digest) {
        this(digest, getByteLength(digest));
    }

    private static void xorPad(byte[] bArr, int i, byte b) {
        boolean z = a;
        int i2 = 0;
        while (i2 < i) {
            bArr[i2] = (byte) (bArr[i2] ^ b);
            i2++;
            if (z) {
                return;
            }
        }
    }

    public String getAlgorithmName() {
        return this.digest.getAlgorithmName() + z[0];
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int doFinal(byte[] r8, int r9) {
        /*
        r7 = this;
        r1 = 0;
        r2 = a;
        r0 = r7.digest;	 Catch:{ IllegalArgumentException -> 0x006e }
        r3 = r7.outputBuf;	 Catch:{ IllegalArgumentException -> 0x006e }
        r4 = r7.blockLength;	 Catch:{ IllegalArgumentException -> 0x006e }
        r0.doFinal(r3, r4);	 Catch:{ IllegalArgumentException -> 0x006e }
        r0 = r7.opadState;	 Catch:{ IllegalArgumentException -> 0x006e }
        if (r0 == 0) goto L_0x002a;
    L_0x0010:
        r0 = r7.digest;	 Catch:{ IllegalArgumentException -> 0x0070 }
        r0 = (org.spongycastle.util.Memoable) r0;	 Catch:{ IllegalArgumentException -> 0x0070 }
        r3 = r7.opadState;	 Catch:{ IllegalArgumentException -> 0x0070 }
        r0.reset(r3);	 Catch:{ IllegalArgumentException -> 0x0070 }
        r0 = r7.digest;	 Catch:{ IllegalArgumentException -> 0x0070 }
        r3 = r7.outputBuf;	 Catch:{ IllegalArgumentException -> 0x0070 }
        r4 = r7.blockLength;	 Catch:{ IllegalArgumentException -> 0x0070 }
        r5 = r7.digest;	 Catch:{ IllegalArgumentException -> 0x0070 }
        r5 = r5.getDigestSize();	 Catch:{ IllegalArgumentException -> 0x0070 }
        r0.update(r3, r4, r5);	 Catch:{ IllegalArgumentException -> 0x0070 }
        if (r2 == 0) goto L_0x0035;
    L_0x002a:
        r0 = r7.digest;	 Catch:{ IllegalArgumentException -> 0x0070 }
        r3 = r7.outputBuf;	 Catch:{ IllegalArgumentException -> 0x0070 }
        r4 = 0;
        r5 = r7.outputBuf;	 Catch:{ IllegalArgumentException -> 0x0070 }
        r5 = r5.length;	 Catch:{ IllegalArgumentException -> 0x0070 }
        r0.update(r3, r4, r5);	 Catch:{ IllegalArgumentException -> 0x0070 }
    L_0x0035:
        r0 = r7.digest;
        r3 = r0.doFinal(r8, r9);
        r0 = r7.blockLength;
    L_0x003d:
        r4 = r7.outputBuf;
        r4 = r4.length;
        if (r0 >= r4) goto L_0x004a;
    L_0x0042:
        r4 = r7.outputBuf;
        r4[r0] = r1;
        r0 = r0 + 1;
        if (r2 == 0) goto L_0x003d;
    L_0x004a:
        r0 = r7.ipadState;	 Catch:{ IllegalArgumentException -> 0x0072 }
        if (r0 == 0) goto L_0x0059;
    L_0x004e:
        r0 = r7.digest;	 Catch:{ IllegalArgumentException -> 0x0074 }
        r0 = (org.spongycastle.util.Memoable) r0;	 Catch:{ IllegalArgumentException -> 0x0074 }
        r4 = r7.ipadState;	 Catch:{ IllegalArgumentException -> 0x0074 }
        r0.reset(r4);	 Catch:{ IllegalArgumentException -> 0x0074 }
        if (r2 == 0) goto L_0x0064;
    L_0x0059:
        r0 = r7.digest;	 Catch:{ IllegalArgumentException -> 0x0074 }
        r4 = r7.inputPad;	 Catch:{ IllegalArgumentException -> 0x0074 }
        r5 = 0;
        r6 = r7.inputPad;	 Catch:{ IllegalArgumentException -> 0x0074 }
        r6 = r6.length;	 Catch:{ IllegalArgumentException -> 0x0074 }
        r0.update(r4, r5, r6);	 Catch:{ IllegalArgumentException -> 0x0074 }
    L_0x0064:
        r0 = org.spongycastle.jcajce.provider.digest.BCMessageDigest.a;	 Catch:{ IllegalArgumentException -> 0x0076 }
        if (r0 == 0) goto L_0x006d;
    L_0x0068:
        if (r2 == 0) goto L_0x007a;
    L_0x006a:
        r0 = r1;
    L_0x006b:
        a = r0;
    L_0x006d:
        return r3;
    L_0x006e:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0070 }
    L_0x0070:
        r0 = move-exception;
        throw r0;
    L_0x0072:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0074 }
    L_0x0074:
        r0 = move-exception;
        throw r0;
    L_0x0076:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0078 }
    L_0x0078:
        r0 = move-exception;
        throw r0;
    L_0x007a:
        r0 = 1;
        goto L_0x006b;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.spongycastle.crypto.macs.HMac.doFinal(byte[], int):int");
    }

    public Digest getUnderlyingDigest() {
        return this.digest;
    }

    public void reset() {
        this.digest.reset();
        this.digest.update(this.inputPad, 0, this.inputPad.length);
    }

    public void update(byte[] bArr, int i, int i2) {
        this.digest.update(bArr, i, i2);
    }
}
