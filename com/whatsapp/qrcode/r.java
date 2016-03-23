package com.whatsapp.qrcode;

import android.view.animation.Animation;
import android.view.animation.Transformation;

class r extends Animation {
    final QrEducationView a;

    protected void applyTransformation(float f, Transformation transformation) {
        QrEducationView.a(this.a, f);
        this.a.invalidate();
    }

    private r(QrEducationView qrEducationView) {
        this.a = qrEducationView;
    }

    r(QrEducationView qrEducationView, d dVar) {
        this(qrEducationView);
    }
}
