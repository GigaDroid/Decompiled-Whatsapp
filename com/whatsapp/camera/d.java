package com.whatsapp.camera;

import com.whatsapp.App;

class d implements an {
    final CameraActivity a;

    public void b(float f) {
        float a = CameraActivity.b(this.a).a();
        if (a >= 1.0f) {
            if (f > a) {
                f = a;
            }
            CameraActivity.b(this.a).a(f, ((float) CameraActivity.j(this.a).setZoomLevel(Math.round((((float) CameraActivity.j(this.a).i()) * (f - 1.0f)) / (a - 1.0f)))) / 100.0f);
        }
    }

    d(CameraActivity cameraActivity) {
        this.a = cameraActivity;
    }

    public void a(boolean z) {
        CameraActivity.y(this.a).a(z);
    }

    public void a(float f) {
        CameraActivity.b(this.a).b();
    }

    public void b() {
        App.a(this.a, 2131230894, 1);
        this.a.finish();
    }

    public void c(float f) {
        CameraActivity.b(this.a).a(f);
    }

    public void a(float f, float f2) {
        CameraActivity.y(this.a).a(f, f2);
    }

    public void a() {
        CameraActivity.a(this.a);
    }
}
