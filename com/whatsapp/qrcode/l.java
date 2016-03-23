package com.whatsapp.qrcode;

import android.hardware.Camera;
import android.hardware.Camera.PreviewCallback;

class l implements PreviewCallback {
    final QrCodeActivity a;

    public void onPreviewFrame(byte[] bArr, Camera camera) {
        QrCodeActivity.d(this.a).post(new e(this, bArr));
    }

    l(QrCodeActivity qrCodeActivity) {
        this.a = qrCodeActivity;
    }
}
