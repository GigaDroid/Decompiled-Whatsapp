package com.whatsapp.camera;

import android.view.View;
import com.whatsapp.util.ap;

class w extends ap {
    final CameraActivity b;

    w(CameraActivity cameraActivity) {
        this.b = cameraActivity;
    }

    public void a(View view) {
        if (!CameraActivity.j(this.b).e() && CameraActivity.w(this.b) == null) {
            CameraActivity.m(this.b);
        }
    }
}
