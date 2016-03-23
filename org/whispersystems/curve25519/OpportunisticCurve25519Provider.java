package org.whispersystems.curve25519;

public class OpportunisticCurve25519Provider implements K {
    private K a;

    public byte[] generatePrivateKey(byte[] bArr) {
        return this.a.generatePrivateKey(bArr);
    }

    public byte[] calculateAgreement(byte[] bArr, byte[] bArr2) {
        return this.a.calculateAgreement(bArr, bArr2);
    }

    public boolean b() {
        return this.a.b();
    }

    public byte[] generatePublicKey(byte[] bArr) {
        return this.a.generatePublicKey(bArr);
    }

    public byte[] a() {
        return this.a.a();
    }

    OpportunisticCurve25519Provider() {
        try {
            this.a = new NativeCurve25519Provider();
        } catch (e e) {
            this.a = new JavaCurve25519Provider();
        }
    }

    public byte[] calculateSignature(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return this.a.calculateSignature(bArr, bArr2, bArr3);
    }

    public byte[] a(int i) {
        return this.a.a(i);
    }

    public void a(X x) {
        this.a.a(x);
    }

    public boolean verifySignature(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return this.a.verifySignature(bArr, bArr2, bArr3);
    }
}
