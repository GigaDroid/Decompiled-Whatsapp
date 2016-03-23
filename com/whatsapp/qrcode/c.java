package com.whatsapp.qrcode;

import android.hardware.Camera;

class c implements Runnable {
    final QrCodeActivity a;

    public void run() {
        Camera b = QrCodeActivity.g(this.a).b();
        if (b != null) {
            b.setOneShotPreviewCallback(QrCodeActivity.c(this.a));
        }
    }

    c(QrCodeActivity qrCodeActivity) {
        this.a = qrCodeActivity;
    }
}
