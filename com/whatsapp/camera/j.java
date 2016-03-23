package com.whatsapp.camera;

import android.hardware.Camera.Size;
import java.util.Comparator;

class j implements Comparator {
    final CameraView a;

    public int compare(Object obj, Object obj2) {
        return a((Size) obj, (Size) obj2);
    }

    j(CameraView cameraView) {
        this.a = cameraView;
    }

    public int a(Size size, Size size2) {
        int i = size.width * size.height;
        int i2 = size2.width * size2.height;
        if (i > i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }
}
