package com.whatsapp.qrcode;

import android.hardware.Camera;
import android.hardware.Camera.AutoFocusCallback;

class m implements AutoFocusCallback {
    final QrCodeView a;

    m(QrCodeView qrCodeView) {
        this.a = qrCodeView;
    }

    public void onAutoFocus(boolean z, Camera camera) {
        this.a.postDelayed(new a(this), 2000);
    }
}
