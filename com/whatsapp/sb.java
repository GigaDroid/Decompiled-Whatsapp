package com.whatsapp;

import android.graphics.Camera;
import android.view.animation.Animation;
import android.widget.ImageView;

public class sb extends Animation {
    private boolean a;
    private ImageView b;
    private int c;
    private Camera d;

    sb(ImageView imageView, int i) {
        this.b = imageView;
        this.c = i;
    }

    public void initialize(int i, int i2, int i3, int i4) {
        super.initialize(i, i2, i3, i4);
        this.d = new Camera();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void applyTransformation(float r13, android.view.animation.Transformation r14) {
        /*
        r12 = this;
        r11 = 90;
        r10 = 0;
        super.applyTransformation(r13, r14);
        r0 = 1127481344; // 0x43340000 float:180.0 double:5.570497984E-315;
        r0 = r0 * r13;
        r0 = (int) r0;
        r0 = r0 % 360;
        r1 = r14.getMatrix();
        r2 = r12.d;
        r2.save();
        r2 = r12.d;
        r3 = r12.b;
        r3 = r3.getWidth();
        r4 = (double) r3;
        r6 = 4614256656552045848; // 0x400921fb54442d18 float:3.37028055E12 double:3.141592653589793;
        r8 = (double) r0;
        r6 = r6 * r8;
        r8 = 4640537203540230144; // 0x4066800000000000 float:0.0 double:180.0;
        r6 = r6 / r8;
        r6 = java.lang.Math.sin(r6);
        r4 = r4 * r6;
        r3 = (float) r4;
        r2.translate(r10, r10, r3);
        if (r0 >= r11) goto L_0x0040;
    L_0x0036:
        r2 = r12.d;
        r3 = (float) r0;
        r2.rotateY(r3);
        r2 = com.whatsapp.DialogToastActivity.f;
        if (r2 == 0) goto L_0x0048;
    L_0x0040:
        r2 = r12.d;
        r3 = r0 + 180;
        r3 = (float) r3;
        r2.rotateY(r3);
    L_0x0048:
        r2 = r12.d;
        r2.getMatrix(r1);
        r2 = r12.d;
        r2.restore();
        r2 = r12.b;
        r2 = r2.getWidth();
        r2 = -r2;
        r2 = r2 / 2;
        r2 = (float) r2;
        r3 = r12.b;
        r3 = r3.getHeight();
        r3 = -r3;
        r3 = r3 / 2;
        r3 = (float) r3;
        r1.preTranslate(r2, r3);
        r2 = r12.b;
        r2 = r2.getWidth();
        r2 = r2 / 2;
        r2 = (float) r2;
        r3 = r12.b;
        r3 = r3.getHeight();
        r3 = r3 / 2;
        r3 = (float) r3;
        r1.postTranslate(r2, r3);
        if (r0 <= r11) goto L_0x008e;
    L_0x0080:
        r0 = r12.a;
        if (r0 != 0) goto L_0x008e;
    L_0x0084:
        r0 = 1;
        r12.a = r0;
        r0 = r12.b;
        r1 = r12.c;
        r0.setImageResource(r1);
    L_0x008e:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.sb.applyTransformation(float, android.view.animation.Transformation):void");
    }
}
