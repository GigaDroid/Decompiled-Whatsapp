package com.whatsapp;

class akd implements Runnable {
    private float a;
    private float b;
    private boolean c;
    private final PhotoView d;
    private float e;
    private float f;
    private boolean g;
    private float h;
    private boolean i;
    private long j;

    public boolean a(float f, float f2, float f3, float f4) {
        if (this.i) {
            return false;
        }
        boolean z;
        this.b = f3;
        this.h = f4;
        this.e = f2;
        this.j = System.currentTimeMillis();
        this.f = f;
        if (this.e > this.f) {
            z = true;
        } else {
            z = false;
        }
        this.g = z;
        this.a = (this.e - this.f) / 200.0f;
        this.i = true;
        this.c = false;
        this.d.post(this);
        return true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
        r6 = this;
        r1 = 1;
        r0 = r6.c;
        if (r0 == 0) goto L_0x0006;
    L_0x0005:
        return;
    L_0x0006:
        r2 = java.lang.System.currentTimeMillis();
        r4 = r6.j;
        r2 = r2 - r4;
        r0 = r6.f;
        r4 = r6.a;
        r2 = (float) r2;
        r2 = r2 * r4;
        r0 = r0 + r2;
        r2 = r6.d;
        r3 = r6.b;
        r4 = r6.h;
        com.whatsapp.PhotoView.a(r2, r0, r3, r4, r1);
        r2 = r6.e;
        r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r2 == 0) goto L_0x002e;
    L_0x0023:
        r2 = r6.g;
        r3 = r6.e;
        r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1));
        if (r0 <= 0) goto L_0x0046;
    L_0x002b:
        r0 = r1;
    L_0x002c:
        if (r2 != r0) goto L_0x003c;
    L_0x002e:
        r0 = r6.d;
        r2 = r6.e;
        r3 = r6.b;
        r4 = r6.h;
        com.whatsapp.PhotoView.a(r0, r2, r3, r4, r1);
        r6.a();
    L_0x003c:
        r0 = r6.c;
        if (r0 != 0) goto L_0x0005;
    L_0x0040:
        r0 = r6.d;
        r0.post(r6);
        goto L_0x0005;
    L_0x0046:
        r0 = 0;
        goto L_0x002c;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.akd.run():void");
    }

    public akd(PhotoView photoView) {
        this.d = photoView;
    }

    public void a() {
        this.i = false;
        this.c = true;
    }
}
