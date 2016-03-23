package com.whatsapp;

import android.hardware.Camera;

class aaj implements Runnable {
    final IdentityVerificationActivity a;

    public void run() {
        Camera b = IdentityVerificationActivity.b(this.a).b();
        if (b != null) {
            b.setOneShotPreviewCallback(IdentityVerificationActivity.d(this.a));
        }
    }

    aaj(IdentityVerificationActivity identityVerificationActivity) {
        this.a = identityVerificationActivity;
    }
}
