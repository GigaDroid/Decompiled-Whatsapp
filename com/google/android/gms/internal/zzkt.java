package com.google.android.gms.internal;

import android.graphics.Canvas;
import android.graphics.Path;
import android.widget.ImageView;

public final class zzkt extends ImageView {
    private int zzacv;
    private zza zzacw;
    private int zzacx;
    private float zzacy;

    public interface zza {
        Path zzl(int i, int i2);
    }

    protected void onDraw(Canvas canvas) {
        if (this.zzacw != null) {
            canvas.clipPath(this.zzacw.zzl(getWidth(), getHeight()));
        }
        super.onDraw(canvas);
        if (this.zzacv != 0) {
            canvas.drawColor(this.zzacv);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onMeasure(int r5, int r6) {
        /*
        r4 = this;
        r2 = com.google.android.gms.internal.zzkq.a;
        super.onMeasure(r5, r6);
        r0 = r4.zzacx;
        switch(r0) {
            case 1: goto L_0x000b;
            case 2: goto L_0x0016;
            default: goto L_0x000a;
        };
    L_0x000a:
        return;
    L_0x000b:
        r0 = r4.getMeasuredHeight();
        r1 = (float) r0;
        r3 = r4.zzacy;
        r1 = r1 * r3;
        r1 = (int) r1;
        if (r2 == 0) goto L_0x0021;
    L_0x0016:
        r1 = r4.getMeasuredWidth();
        r0 = (float) r1;
        r3 = r4.zzacy;
        r0 = r0 / r3;
        r0 = (int) r0;
        if (r2 != 0) goto L_0x000a;
    L_0x0021:
        r4.setMeasuredDimension(r1, r0);
        goto L_0x000a;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzkt.onMeasure(int, int):void");
    }
}
