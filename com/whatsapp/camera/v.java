package com.whatsapp.camera;

import android.view.View;
import com.whatsapp.util.ap;

class v extends ap {
    final CameraActivity b;

    v(CameraActivity cameraActivity) {
        this.b = cameraActivity;
    }

    public void a(View view) {
        CameraActivity.w(this.b).delete();
        CameraActivity.r(this.b);
    }
}
