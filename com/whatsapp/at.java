package com.whatsapp;

import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;

class at extends Drawable {
    final Drawable a;
    final ViewGroup b;
    final MessageDetailsActivity c;

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public int getOpacity() {
        return 0;
    }

    public void setAlpha(int i) {
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void draw(android.graphics.Canvas r8) {
        /*
        r7 = this;
        r6 = 0;
        r0 = r7.a;
        r2 = r0.getIntrinsicHeight();
        r0 = r7.a;
        r3 = r0.getIntrinsicWidth();
        r0 = r7.b;
        r1 = r0.getWidth();
        r0 = r7.b;
        r0 = r0.getHeight();
        r4 = r1 * r2;
        r5 = r0 * r3;
        if (r4 <= r5) goto L_0x0026;
    L_0x001f:
        r0 = r2 * r1;
        r0 = r0 / r3;
        r4 = com.whatsapp.DialogToastActivity.f;
        if (r4 == 0) goto L_0x0029;
    L_0x0026:
        r1 = r3 * r0;
        r1 = r1 / r2;
    L_0x0029:
        r2 = r7.a;
        r2.setBounds(r6, r6, r1, r0);
        r0 = r7.a;
        r0.draw(r8);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.at.draw(android.graphics.Canvas):void");
    }

    at(MessageDetailsActivity messageDetailsActivity, Drawable drawable, ViewGroup viewGroup) {
        this.c = messageDetailsActivity;
        this.a = drawable;
        this.b = viewGroup;
    }
}
