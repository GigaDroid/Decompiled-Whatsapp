package com.whatsapp.qrcode;

class a implements Runnable {
    final m a;

    public void run() {
        if (QrCodeView.f(this.a.a) != null) {
            QrCodeView.f(this.a.a).autoFocus(this.a.a.b);
        }
    }

    a(m mVar) {
        this.a = mVar;
    }
}
