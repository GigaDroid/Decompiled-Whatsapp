package com.whatsapp;

import android.view.View;
import android.view.animation.Animation;

class a4v extends Animation {
    final u3 a;
    final int b;
    final View c;
    final int d;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void applyTransformation(float r5, android.view.animation.Transformation r6) {
        /*
        r4 = this;
        r0 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1));
        if (r0 != 0) goto L_0x0013;
    L_0x0006:
        r0 = r4.c;
        r0 = r0.getLayoutParams();
        r1 = -2;
        r0.height = r1;
        r0 = com.whatsapp.DialogToastActivity.f;
        if (r0 == 0) goto L_0x0026;
    L_0x0013:
        r0 = r4.c;
        r0 = r0.getLayoutParams();
        r1 = r4.b;
        r2 = r4.d;
        r3 = r4.b;
        r2 = r2 - r3;
        r2 = (float) r2;
        r2 = r2 * r5;
        r2 = (int) r2;
        r1 = r1 + r2;
        r0.height = r1;
    L_0x0026:
        r0 = r4.c;
        r0.requestLayout();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.a4v.applyTransformation(float, android.view.animation.Transformation):void");
    }

    public boolean willChangeBounds() {
        return true;
    }

    a4v(u3 u3Var, View view, int i, int i2) {
        this.a = u3Var;
        this.c = view;
        this.b = i;
        this.d = i2;
    }
}
