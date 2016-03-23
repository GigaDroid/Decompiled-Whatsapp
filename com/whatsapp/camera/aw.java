package com.whatsapp.camera;

import android.hardware.Camera.ShutterCallback;

class aw implements ShutterCallback {
    final c a;
    final CameraView b;

    public void onShutter() {
        this.a.a();
    }

    aw(CameraView cameraView, c cVar) {
        this.b = cameraView;
        this.a = cVar;
    }
}
