package com.whatsapp.camera;

import android.os.Handler;
import android.os.Looper;

class n extends Handler {
    final CameraActivity a;

    n(CameraActivity cameraActivity, Looper looper) {
        this.a = cameraActivity;
        super(looper);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleMessage(android.os.Message r11) {
        /*
        r10 = this;
        r8 = 1048576; // 0x100000 float:1.469368E-39 double:5.180654E-318;
        r6 = 8;
        r0 = com.whatsapp.camera.CameraActivity.I;
        r1 = r10.a;
        r1 = com.whatsapp.camera.CameraActivity.j(r1);
        r1 = r1.e();
        if (r1 == 0) goto L_0x0072;
    L_0x0013:
        r2 = java.lang.System.currentTimeMillis();
        r1 = r10.a;
        r4 = com.whatsapp.camera.CameraActivity.l(r1);
        r2 = r2 - r4;
        r1 = r10.a;
        r1 = com.whatsapp.camera.CameraActivity.k(r1);
        r4 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r2 = r2 / r4;
        r2 = (int) r2;
        r2 = (long) r2;
        r2 = android.text.format.DateUtils.formatElapsedTime(r2);
        r1.setText(r2);
        r1 = r10.a;
        r1 = com.whatsapp.camera.CameraActivity.h(r1);
        r2 = 0;
        r4 = 50;
        r1.sendEmptyMessageDelayed(r2, r4);
        r1 = r10.a;
        r1 = com.whatsapp.camera.CameraActivity.w(r1);
        if (r1 == 0) goto L_0x0070;
    L_0x0044:
        r1 = r10.a;
        r1 = com.whatsapp.camera.CameraActivity.w(r1);
        r2 = r1.length();
        r1 = com.whatsapp.a59.e;
        r4 = (long) r1;
        r4 = r4 * r8;
        r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r1 <= 0) goto L_0x005e;
    L_0x0056:
        r1 = r10.a;
        r4 = 1;
        com.whatsapp.camera.CameraActivity.b(r1, r4);
        if (r0 == 0) goto L_0x0070;
    L_0x005e:
        r1 = r10.a;
        r1 = com.whatsapp.camera.CameraActivity.x(r1);
        r4 = 100;
        r2 = r2 * r4;
        r4 = com.whatsapp.a59.e;
        r4 = (long) r4;
        r4 = r4 * r8;
        r2 = r2 / r4;
        r2 = (int) r2;
        r1.setProgress(r2);
    L_0x0070:
        if (r0 == 0) goto L_0x0084;
    L_0x0072:
        r0 = r10.a;
        r0 = com.whatsapp.camera.CameraActivity.k(r0);
        r0.setVisibility(r6);
        r0 = r10.a;
        r0 = com.whatsapp.camera.CameraActivity.x(r0);
        r0.setVisibility(r6);
    L_0x0084:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.camera.n.handleMessage(android.os.Message):void");
    }
}
