package com.whatsapp.qrcode;

import android.view.animation.Animation;
import android.view.animation.Transformation;

class g extends Animation {
    final QrCodeOverlay a;

    g(QrCodeOverlay qrCodeOverlay, k kVar) {
        this(qrCodeOverlay);
    }

    protected void applyTransformation(float f, Transformation transformation) {
        int width = this.a.getWidth();
        int height = this.a.getHeight();
        int min = (Math.min(width, height) * 3) / 4;
        width = (width - min) / 2;
        height = (height - min) / 2;
        this.a.invalidate(width, height, width + min, min + height);
    }

    private g(QrCodeOverlay qrCodeOverlay) {
        this.a = qrCodeOverlay;
    }
}
