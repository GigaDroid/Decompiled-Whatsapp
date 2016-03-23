package com.whatsapp.camera;

import android.view.View;
import android.view.View.OnClickListener;

class p implements OnClickListener {
    final CameraActivity a;

    public void onClick(View view) {
        CameraActivity.a(this.a, CameraActivity.s(this.a) + 90);
        if (CameraActivity.s(this.a) >= 360) {
            CameraActivity.a(this.a, CameraActivity.s(this.a) - 360);
        }
        CameraActivity.i(this.a).f();
    }

    p(CameraActivity cameraActivity) {
        this.a = cameraActivity;
    }
}
