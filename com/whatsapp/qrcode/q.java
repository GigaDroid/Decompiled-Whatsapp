package com.whatsapp.qrcode;

class q implements Runnable {
    final QrCodeActivity a;

    public void run() {
        this.a.setSupportProgressBarIndeterminateVisibility(true);
    }

    q(QrCodeActivity qrCodeActivity) {
        this.a = qrCodeActivity;
    }
}
