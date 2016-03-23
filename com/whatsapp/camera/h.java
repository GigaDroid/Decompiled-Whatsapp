package com.whatsapp.camera;

import android.hardware.Camera;
import android.hardware.Camera.AutoFocusCallback;

class h implements AutoFocusCallback {
    final CameraView a;

    public void onAutoFocus(boolean z, Camera camera) {
    }

    h(CameraView cameraView) {
        this.a = cameraView;
    }
}
