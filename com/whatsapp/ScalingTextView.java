package com.whatsapp;

import android.content.Context;
import android.util.AttributeSet;

public class ScalingTextView extends TextEmojiLabel {
    private float g;
    private float h;

    public ScalingTextView(Context context) {
        super(context);
        this.g = 1.0f;
    }

    public void setMaxTextSize(float f) {
        this.h = f;
    }

    public void setTextScale(float f) {
        this.g = f;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onDraw(android.graphics.Canvas r6) {
        /*
        r5 = this;
        r4 = 0;
        r0 = com.whatsapp.DialogToastActivity.f;
        r1 = r5.getLayout();
        if (r1 == 0) goto L_0x0088;
    L_0x0009:
        r6.save();
        r2 = com.whatsapp.App.a1();
        if (r2 == 0) goto L_0x0033;
    L_0x0012:
        r2 = r5.getHeight();
        r2 = r2 / 2;
        r2 = (float) r2;
        r6.translate(r4, r2);
        r2 = r5.g;
        r3 = r5.g;
        r6.scale(r2, r3);
        r2 = r5.getHeight();
        r2 = -r2;
        r2 = r2 / 2;
        r2 = (float) r2;
        r3 = r5.g;
        r2 = r2 * r3;
        r6.translate(r4, r2);
        if (r0 == 0) goto L_0x005d;
    L_0x0033:
        r2 = r5.getWidth();
        r2 = (float) r2;
        r3 = r5.getHeight();
        r3 = r3 / 2;
        r3 = (float) r3;
        r6.translate(r2, r3);
        r2 = r5.g;
        r3 = r5.g;
        r6.scale(r2, r3);
        r2 = r5.getWidth();
        r2 = -r2;
        r2 = (float) r2;
        r3 = r5.getHeight();
        r3 = -r3;
        r3 = r3 / 2;
        r3 = (float) r3;
        r4 = r5.g;
        r3 = r3 * r4;
        r6.translate(r2, r3);
    L_0x005d:
        r2 = r1.getPaint();
        r3 = r5.getCurrentTextColor();
        r2.setColor(r3);
        r2 = r1.getPaint();
        r2 = r2.getTextSize();
        r3 = r1.getPaint();
        r4 = r5.h;
        r3.setTextSize(r4);
        r1.draw(r6);
        r1 = r1.getPaint();
        r1.setTextSize(r2);
        r6.restore();
        if (r0 == 0) goto L_0x008b;
    L_0x0088:
        super.onDraw(r6);
    L_0x008b:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ScalingTextView.onDraw(android.graphics.Canvas):void");
    }

    public ScalingTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.g = 1.0f;
    }

    public ScalingTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g = 1.0f;
    }
}
