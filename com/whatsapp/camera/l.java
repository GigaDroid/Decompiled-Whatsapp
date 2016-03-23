package com.whatsapp.camera;

import android.content.Context;
import android.view.OrientationEventListener;

class l extends OrientationEventListener {
    int a;
    final CameraLayout b;

    public void onOrientationChanged(int i) {
        int orientation = CameraLayout.a(this.b).getOrientation();
        if (orientation != -1 && ((this.a == 1 && orientation == 3) || (this.a == 3 && orientation == 1))) {
            CameraLayout.a(this.b, orientation, 0, 0, CameraLayout.a(this.b).getWidth(), CameraLayout.a(this.b).getHeight());
        }
        this.a = orientation;
    }

    public l(CameraLayout cameraLayout, Context context) {
        this.b = cameraLayout;
        super(context);
        this.a = CameraLayout.a(cameraLayout).getOrientation();
    }
}
