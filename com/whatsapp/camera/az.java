package com.whatsapp.camera;

import android.content.Context;
import android.view.OrientationEventListener;

public class az extends OrientationEventListener {
    final CameraActivity a;
    public int b;

    public az(CameraActivity cameraActivity, Context context) {
        this.a = cameraActivity;
        super(context);
        this.b = -1;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onOrientationChanged(int r4) {
        /*
        r3 = this;
        r1 = com.whatsapp.camera.CameraActivity.I;
        r0 = -1;
        r2 = 330; // 0x14a float:4.62E-43 double:1.63E-321;
        if (r4 >= r2) goto L_0x000b;
    L_0x0007:
        r2 = 30;
        if (r4 >= r2) goto L_0x000e;
    L_0x000b:
        r0 = 0;
        if (r1 == 0) goto L_0x002d;
    L_0x000e:
        r2 = 60;
        if (r4 < r2) goto L_0x0019;
    L_0x0012:
        r2 = 120; // 0x78 float:1.68E-43 double:5.93E-322;
        if (r4 >= r2) goto L_0x0019;
    L_0x0016:
        r0 = 1;
        if (r1 == 0) goto L_0x002d;
    L_0x0019:
        r2 = 150; // 0x96 float:2.1E-43 double:7.4E-322;
        if (r4 < r2) goto L_0x0024;
    L_0x001d:
        r2 = 210; // 0xd2 float:2.94E-43 double:1.04E-321;
        if (r4 >= r2) goto L_0x0024;
    L_0x0021:
        r0 = 2;
        if (r1 == 0) goto L_0x002d;
    L_0x0024:
        r1 = 240; // 0xf0 float:3.36E-43 double:1.186E-321;
        if (r4 < r1) goto L_0x002d;
    L_0x0028:
        r1 = 300; // 0x12c float:4.2E-43 double:1.48E-321;
        if (r4 >= r1) goto L_0x002d;
    L_0x002c:
        r0 = 3;
    L_0x002d:
        r3.b = r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.camera.az.onOrientationChanged(int):void");
    }
}
