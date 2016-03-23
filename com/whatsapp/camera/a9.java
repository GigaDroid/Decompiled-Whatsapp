package com.whatsapp.camera;

import android.content.Context;
import android.view.OrientationEventListener;

class a9 extends OrientationEventListener {
    private int a;
    final CameraView b;

    public void enable() {
        super.enable();
        this.a = CameraView.d(this.b).getOrientation();
    }

    public a9(CameraView cameraView, Context context) {
        this.b = cameraView;
        super(context);
        this.a = -1;
        this.a = CameraView.d(cameraView).getOrientation();
    }

    public void onOrientationChanged(int i) {
        int orientation = CameraView.d(this.b).getOrientation();
        if (!(orientation == -1 || orientation == this.a || Math.abs(this.a - orientation) % 2 != 0)) {
            this.b.surfaceChanged(CameraView.h(this.b), 0, 0, 0);
        }
        this.a = orientation;
    }
}
