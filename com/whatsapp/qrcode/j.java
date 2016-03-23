package com.whatsapp.qrcode;

class j implements Runnable {
    final QrCodeActivity a;

    j(QrCodeActivity qrCodeActivity) {
        this.a = qrCodeActivity;
    }

    public void run() {
        QrCodeActivity.f(this.a);
    }
}
