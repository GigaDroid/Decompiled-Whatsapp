package com.whatsapp;

import android.hardware.Camera;
import android.hardware.Camera.PreviewCallback;

class axi implements PreviewCallback {
    final IdentityVerificationActivity a;

    public void onPreviewFrame(byte[] bArr, Camera camera) {
        IdentityVerificationActivity.f(this.a).post(new au9(this, bArr));
    }

    axi(IdentityVerificationActivity identityVerificationActivity) {
        this.a = identityVerificationActivity;
    }
}
