package com.whatsapp.camera;

import android.view.View;
import android.view.View.OnClickListener;

class q implements OnClickListener {
    final CameraActivity a;

    public void onClick(View view) {
        if (CameraActivity.t(this.a).isShowing()) {
            CameraActivity.t(this.a).dismiss();
            if (CameraActivity.I == 0) {
                return;
            }
        }
        CameraActivity.t(this.a).a(CameraActivity.o(this.a), CameraActivity.o(this.a), CameraActivity.o(this.a), CameraActivity.f(this.a));
        CameraActivity.o(this.a).setImageResource(2130839607);
    }

    q(CameraActivity cameraActivity) {
        this.a = cameraActivity;
    }
}
