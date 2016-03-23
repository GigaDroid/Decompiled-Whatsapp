package com.whatsapp.util;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

public class ClippingLayout extends FrameLayout {
    private Rect a;

    public ClippingLayout(Context context) {
        super(context);
        this.a = null;
    }

    public ClippingLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = null;
    }

    public ClippingLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = null;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setClipBounds(android.graphics.Rect r3) {
        /*
        r2 = this;
        r0 = com.whatsapp.util.Log.h;
        r1 = r2.a;
        if (r3 == r1) goto L_0x0010;
    L_0x0006:
        if (r3 == 0) goto L_0x0011;
    L_0x0008:
        r1 = r2.a;
        r1 = r3.equals(r1);
        if (r1 == 0) goto L_0x0011;
    L_0x0010:
        return;
    L_0x0011:
        if (r3 == 0) goto L_0x0027;
    L_0x0013:
        r1 = r2.a;
        if (r1 != 0) goto L_0x0020;
    L_0x0017:
        r1 = new android.graphics.Rect;
        r1.<init>(r3);
        r2.a = r1;
        if (r0 == 0) goto L_0x002a;
    L_0x0020:
        r1 = r2.a;
        r1.set(r3);
        if (r0 == 0) goto L_0x002a;
    L_0x0027:
        r0 = 0;
        r2.a = r0;
    L_0x002a:
        r2.invalidate();
        goto L_0x0010;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.ClippingLayout.setClipBounds(android.graphics.Rect):void");
    }

    protected boolean drawChild(Canvas canvas, View view, long j) {
        if (this.a != null) {
            canvas.clipRect(this.a);
        }
        return super.drawChild(canvas, view, j);
    }
}
