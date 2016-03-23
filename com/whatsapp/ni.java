package com.whatsapp;

class ni implements Runnable {
    private boolean a;
    private boolean b;
    private float c;
    private float d;
    private final PhotoView e;
    private long f;

    public ni(PhotoView photoView) {
        this.f = -1;
        this.e = photoView;
    }

    public void a() {
        this.b = false;
        this.a = true;
    }

    public boolean a(float f, float f2) {
        if (this.b) {
            return false;
        }
        this.f = -1;
        this.c = f;
        this.d = f2;
        this.a = false;
        this.b = true;
        this.e.postDelayed(this, 250);
        return true;
    }

    public void run() {
        if (!this.a) {
            float f;
            float f2;
            float f3;
            long currentTimeMillis = System.currentTimeMillis();
            if (this.f != -1) {
                f = (float) (currentTimeMillis - this.f);
            } else {
                f = 0.0f;
            }
            if (this.f == -1) {
                this.f = currentTimeMillis;
            }
            if (f >= 100.0f) {
                f2 = this.c;
                f3 = this.d;
                if (!DialogToastActivity.f) {
                    f = f3;
                    f3 = f2;
                    PhotoView.a(this.e, f3, f);
                    this.c -= f3;
                    this.d -= f;
                    if (this.c == 0.0f && this.d == 0.0f) {
                        a();
                    }
                    if (!this.a) {
                        this.e.post(this);
                    }
                }
            }
            f3 = (this.c / (100.0f - f)) * 10.0f;
            f2 = (this.d / (100.0f - f)) * 10.0f;
            if (Math.abs(f3) > Math.abs(this.c) || f3 == Float.NaN) {
                f = this.c;
            } else {
                f = f3;
            }
            if (Math.abs(f2) > Math.abs(this.d) || f2 == Float.NaN) {
                f3 = f;
                f = this.d;
            } else {
                f3 = f;
                f = f2;
            }
            PhotoView.a(this.e, f3, f);
            this.c -= f3;
            this.d -= f;
            a();
            if (!this.a) {
                this.e.post(this);
            }
        }
    }
}
