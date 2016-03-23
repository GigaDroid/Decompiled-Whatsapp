package org.whispersystems.curve25519;

interface K {
    void a(X x);

    byte[] a();

    byte[] a(int i);

    boolean b();

    byte[] calculateAgreement(byte[] bArr, byte[] bArr2);

    byte[] calculateSignature(byte[] bArr, byte[] bArr2, byte[] bArr3);

    byte[] generatePrivateKey(byte[] bArr);

    byte[] generatePublicKey(byte[] bArr);

    boolean verifySignature(byte[] bArr, byte[] bArr2, byte[] bArr3);
}
