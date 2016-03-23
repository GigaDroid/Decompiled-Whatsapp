package com.whatsapp.qrcode;

class e implements Runnable {
    final byte[] a;
    final l b;

    e(l lVar, byte[] bArr) {
        this.b = lVar;
        this.a = bArr;
    }

    public void run() {
        QrCodeActivity.a(this.b.a, this.a);
    }
}
