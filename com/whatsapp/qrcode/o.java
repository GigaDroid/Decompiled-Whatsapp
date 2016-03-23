package com.whatsapp.qrcode;

class o implements Runnable {
    final QrCodeActivity a;

    o(QrCodeActivity qrCodeActivity) {
        this.a = qrCodeActivity;
    }

    public void run() {
        this.a.a(2131232148);
        this.a.setSupportProgressBarIndeterminateVisibility(false);
        QrCodeActivity.a(this.a, null);
        QrCodeActivity.f(this.a);
    }
}
