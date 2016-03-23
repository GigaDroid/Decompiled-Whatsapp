package com.whatsapp;

class ae4 implements Runnable {
    private float a;
    private float b;
    private long c;
    private final PhotoView d;
    private boolean e;
    private float f;
    private boolean g;

    public ae4(PhotoView photoView) {
        this.d = photoView;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(float r3) {
        /*
        r2 = this;
        r0 = r2.g;
        if (r0 == 0) goto L_0x000d;
    L_0x0004:
        r0 = r2.b;
        r0 = r0 + r3;
        r2.b = r0;
        r0 = com.whatsapp.DialogToastActivity.f;
        if (r0 == 0) goto L_0x001b;
    L_0x000d:
        r2.b = r3;
        r0 = 0;
        r2.a = r0;
        r0 = -1;
        r2.c = r0;
        r0 = r2.d;
        r0.post(r2);
    L_0x001b:
        r0 = r2.b;
        r1 = 1133903872; // 0x43960000 float:300.0 double:5.60222949E-315;
        r0 = r0 / r1;
        r2.f = r0;
        r0 = 0;
        r2.e = r0;
        r0 = 1;
        r2.g = r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ae4.a(float):void");
    }

    public void a() {
        this.g = false;
        this.e = true;
        PhotoView.a(this.d, (float) Math.round(PhotoView.a(this.d)));
        PhotoView.b(this.d, true);
        this.d.requestLayout();
        this.d.invalidate();
    }

    public void run() {
        if (!this.e) {
            if (this.a != this.b) {
                long j;
                long currentTimeMillis = System.currentTimeMillis();
                if (this.c != -1) {
                    j = currentTimeMillis - this.c;
                } else {
                    j = 0;
                }
                float f = ((float) j) * this.f;
                if ((this.a < this.b && this.a + f > this.b) || (this.a > this.b && this.a + f < this.b)) {
                    f = this.b - this.a;
                }
                this.d.a(f, false);
                this.a = f + this.a;
                if (this.a == this.b) {
                    a();
                }
                this.c = currentTimeMillis;
            }
            if (!this.e) {
                this.d.post(this);
            }
        }
    }
}
