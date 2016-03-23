package com.whatsapp.camera;

import android.app.Activity;
import com.whatsapp.pz;

class m extends pz {
    final CameraActivity k;

    public void dismiss() {
        super.dismiss();
        CameraActivity.o(this.k).setImageResource(2130839605);
    }

    m(CameraActivity cameraActivity, Activity activity) {
        this.k = cameraActivity;
        super(activity);
    }
}
