package com.whatsapp.camera;

import android.hardware.Camera;
import android.hardware.Camera.AutoFocusCallback;

class a3 implements AutoFocusCallback {
    final CameraView a;

    public void onAutoFocus(boolean z, Camera camera) {
        CameraView.f(this.a).a(z);
    }

    a3(CameraView cameraView) {
        this.a = cameraView;
    }
}
