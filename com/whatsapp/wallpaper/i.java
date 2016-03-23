package com.whatsapp.wallpaper;

class i implements Runnable {
    final float a;
    final float b;
    final long c;
    final Runnable d;
    final ImageViewTouchBase e;
    final float f;
    final float g;
    final float h;

    public void run() {
        float min = Math.min(this.b, (float) (System.currentTimeMillis() - this.c));
        this.e.a(this.f + (this.g * min), this.a, this.h);
        if (this.d != null) {
            this.d.run();
        }
        if (min < this.b) {
            this.e.a.post(this);
        }
    }

    i(ImageViewTouchBase imageViewTouchBase, float f, long j, float f2, float f3, float f4, float f5, Runnable runnable) {
        this.e = imageViewTouchBase;
        this.b = f;
        this.c = j;
        this.f = f2;
        this.g = f3;
        this.a = f4;
        this.h = f5;
        this.d = runnable;
    }
}
