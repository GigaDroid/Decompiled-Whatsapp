package org.whispersystems.curve25519;

class NativeCurve25519Provider implements K {
    private static boolean a;
    private static Throwable b;
    private X c;

    private native boolean smokeCheck(int i);

    public native byte[] calculateAgreement(byte[] bArr, byte[] bArr2);

    public native byte[] calculateSignature(byte[] bArr, byte[] bArr2, byte[] bArr3);

    public native byte[] generatePrivateKey(byte[] bArr);

    public native byte[] generatePublicKey(byte[] bArr);

    public native boolean verifySignature(byte[] bArr, byte[] bArr2, byte[] bArr3);

    public boolean b() {
        return true;
    }

    public byte[] a(int i) {
        byte[] bArr = new byte[i];
        this.c.a(bArr);
        return bArr;
    }

    public byte[] a() {
        return generatePrivateKey(a(32));
    }

    NativeCurve25519Provider() {
        this.c = new ad();
        if (a) {
            try {
                smokeCheck(31337);
                return;
            } catch (Throwable e) {
                throw new e(e);
            }
        }
        throw new e(b);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static {
        /*
        r4 = 0;
        a = r4;
        r0 = 0;
        b = r0;
        r0 = "f\b\u0017*Z7HPm\u0006";
        r0 = r0.toCharArray();
        r1 = r0.length;
        r2 = r1;
        r3 = r4;
        r1 = r0;
    L_0x0011:
        if (r2 > r3) goto L_0x0023;
    L_0x0013:
        r0 = new java.lang.String;
        r0.<init>(r1);
        r0 = r0.intern();
        java.lang.System.loadLibrary(r0);	 Catch:{ UnsatisfiedLinkError -> 0x003f, SecurityException -> 0x0045 }
        r0 = 1;
        a = r0;	 Catch:{ UnsatisfiedLinkError -> 0x003f, SecurityException -> 0x0045 }
    L_0x0022:
        return;
    L_0x0023:
        r5 = r1[r3];
        r0 = r3 % 5;
        switch(r0) {
            case 0: goto L_0x0034;
            case 1: goto L_0x0036;
            case 2: goto L_0x0039;
            case 3: goto L_0x003c;
            default: goto L_0x002a;
        };
    L_0x002a:
        r0 = 63;
    L_0x002c:
        r0 = r0 ^ r5;
        r0 = (char) r0;
        r1[r3] = r0;
        r0 = r3 + 1;
        r3 = r0;
        goto L_0x0011;
    L_0x0034:
        r0 = 5;
        goto L_0x002c;
    L_0x0036:
        r0 = 125; // 0x7d float:1.75E-43 double:6.2E-322;
        goto L_0x002c;
    L_0x0039:
        r0 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
        goto L_0x002c;
    L_0x003c:
        r0 = 92;
        goto L_0x002c;
    L_0x003f:
        r0 = move-exception;
    L_0x0040:
        a = r4;
        b = r0;
        goto L_0x0022;
    L_0x0045:
        r0 = move-exception;
        goto L_0x0040;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.curve25519.NativeCurve25519Provider.<clinit>():void");
    }

    public void a(X x) {
        this.c = x;
    }
}
