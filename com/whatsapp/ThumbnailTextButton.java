package com.whatsapp;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.AttributeSet;

public class ThumbnailTextButton extends ThumbnailButton {
    private int k;
    private Paint l;
    private float m;
    private TextPaint n;
    private Drawable o;
    private RectF p;
    private CharSequence q;
    private int r;
    private Rect s;
    private int t;

    private void b(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, arj.ThumbnailTextButton);
            this.q = obtainStyledAttributes.getText(0);
            this.m = obtainStyledAttributes.getDimension(2, this.m);
            this.t = obtainStyledAttributes.getInt(4, this.t);
            this.r = obtainStyledAttributes.getInt(3, this.r);
            this.k = obtainStyledAttributes.getInt(5, this.k);
            int resourceId = obtainStyledAttributes.getResourceId(1, 0);
            if (resourceId != 0) {
                this.o = context.getResources().getDrawable(resourceId);
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void b(android.graphics.Canvas r13) {
        /*
        r12 = this;
        r4 = 1;
        r2 = 0;
        r11 = 1119092736; // 0x42b40000 float:90.0 double:5.529052754E-315;
        r10 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r0 = com.whatsapp.DialogToastActivity.f;
        super.b(r13);
        r1 = r12.q;
        r1 = android.text.TextUtils.isEmpty(r1);
        if (r1 == 0) goto L_0x0014;
    L_0x0013:
        return;
    L_0x0014:
        r1 = r12.l;
        if (r1 != 0) goto L_0x0032;
    L_0x0018:
        r1 = new android.graphics.Paint;
        r1.<init>();
        r12.l = r1;
        r1 = r12.l;
        r1.setAntiAlias(r4);
        r1 = r12.l;
        r3 = android.graphics.Paint.Style.FILL;
        r1.setStyle(r3);
        r1 = r12.l;
        r3 = r12.k;
        r1.setColor(r3);
    L_0x0032:
        r1 = r12.n;
        if (r1 != 0) goto L_0x0057;
    L_0x0036:
        r1 = new android.text.TextPaint;
        r1.<init>();
        r12.n = r1;
        r1 = r12.n;
        r1.setAntiAlias(r4);
        r1 = r12.n;
        r3 = r12.r;
        r1.setColor(r3);
        r1 = r12.n;
        r3 = r12.m;
        r1.setTextSize(r3);
        r1 = r12.n;
        r3 = android.graphics.Paint.Align.CENTER;
        r1.setTextAlign(r3);
    L_0x0057:
        r1 = r12.p;
        if (r1 != 0) goto L_0x0062;
    L_0x005b:
        r1 = new android.graphics.RectF;
        r1.<init>();
        r12.p = r1;
    L_0x0062:
        r1 = r12.s;
        if (r1 != 0) goto L_0x006d;
    L_0x0066:
        r1 = new android.graphics.Rect;
        r1.<init>();
        r12.s = r1;
    L_0x006d:
        r1 = r12.m;
        r3 = 1067450368; // 0x3fa00000 float:1.25 double:5.273905555E-315;
        r7 = r1 * r3;
        r1 = r12.m;
        r8 = r7 - r1;
        r1 = new android.graphics.Path;
        r1.<init>();
        r3 = r12.c;
        r3 = r3.left;
        r4 = r12.c;
        r4 = r4.bottom;
        r4 = r4 - r7;
        r1.moveTo(r3, r4);
        r3 = r12.c;
        r3 = r3.right;
        r4 = r12.c;
        r4 = r4.bottom;
        r4 = r4 - r7;
        r1.lineTo(r3, r4);
        r3 = r12.c;
        r3 = r3.right;
        r4 = r12.c;
        r4 = r4.bottom;
        r5 = r12.a;
        r4 = r4 - r5;
        r1.lineTo(r3, r4);
        r3 = r12.p;
        r4 = r12.c;
        r4 = r4.right;
        r5 = r12.a;
        r5 = r5 * r10;
        r4 = r4 - r5;
        r5 = r12.c;
        r5 = r5.bottom;
        r6 = r12.a;
        r6 = r6 * r10;
        r5 = r5 - r6;
        r6 = r12.c;
        r6 = r6.right;
        r9 = r12.c;
        r9 = r9.bottom;
        r3.set(r4, r5, r6, r9);
        r3 = r12.p;
        r4 = 0;
        r1.arcTo(r3, r4, r11);
        r3 = r12.c;
        r3 = r3.left;
        r4 = r12.a;
        r3 = r3 + r4;
        r4 = r12.c;
        r4 = r4.bottom;
        r1.lineTo(r3, r4);
        r3 = r12.p;
        r4 = r12.c;
        r4 = r4.left;
        r5 = r12.c;
        r5 = r5.bottom;
        r6 = r12.a;
        r6 = r6 * r10;
        r5 = r5 - r6;
        r6 = r12.c;
        r6 = r6.left;
        r9 = r12.a;
        r9 = r9 * r10;
        r6 = r6 + r9;
        r9 = r12.c;
        r9 = r9.bottom;
        r3.set(r4, r5, r6, r9);
        r3 = r12.p;
        r1.arcTo(r3, r11, r11);
        r3 = r12.c;
        r3 = r3.left;
        r4 = r12.c;
        r4 = r4.bottom;
        r4 = r4 - r7;
        r1.lineTo(r3, r4);
        r3 = r12.l;
        r13.drawPath(r1, r3);
        r1 = r12.q;
        r3 = r12.n;
        r4 = r12.c;
        r4 = r4.width();
        r5 = r12.a;
        r4 = r4 - r5;
        r5 = android.text.TextUtils.TruncateAt.END;
        r1 = android.text.TextUtils.ellipsize(r1, r3, r4, r5);
        r1 = r1.toString();
        r3 = r12.n;
        r4 = r1.length();
        r5 = r12.s;
        r3.getTextBounds(r1, r2, r4, r5);
        r3 = r12.t;
        switch(r3) {
            case 3: goto L_0x01a0;
            case 4: goto L_0x012d;
            case 5: goto L_0x01b5;
            default: goto L_0x012d;
        };
    L_0x012d:
        r0 = r12.c;
        r0 = r0.right;
        r3 = r12.c;
        r3 = r3.left;
        r0 = r0 + r3;
        r4 = r0 / r10;
    L_0x0138:
        r3 = r1.length();
        r0 = r12.c;
        r0 = r0.bottom;
        r5 = r7 / r10;
        r0 = r0 - r5;
        r5 = r12.m;
        r5 = r5 / r10;
        r0 = r0 + r5;
        r5 = r12.n;
        r5 = r5.descent();
        r5 = r5 / r10;
        r5 = r0 - r5;
        r6 = r12.n;
        r0 = r13;
        r0.drawText(r1, r2, r3, r4, r5, r6);
        r0 = r12.o;
        if (r0 == 0) goto L_0x0013;
    L_0x015a:
        r0 = r12.o;
        r0 = r0.getIntrinsicWidth();
        r0 = (float) r0;
        r0 = r0 * r7;
        r1 = r12.o;
        r1 = r1.getIntrinsicHeight();
        r1 = (float) r1;
        r0 = r0 / r1;
        r1 = r12.o;
        r2 = r12.c;
        r2 = r2.left;
        r2 = r2 + r8;
        r3 = r12.a;
        r2 = r2 + r3;
        r2 = (int) r2;
        r3 = r12.c;
        r3 = r3.bottom;
        r3 = r3 - r7;
        r4 = r12.m;
        r4 = r7 - r4;
        r4 = r4 / r10;
        r3 = r3 + r4;
        r3 = (int) r3;
        r4 = r12.c;
        r4 = r4.left;
        r4 = r4 + r8;
        r5 = r12.a;
        r4 = r4 + r5;
        r0 = r0 + r4;
        r0 = (int) r0;
        r4 = r12.c;
        r4 = r4.bottom;
        r5 = r12.m;
        r5 = r7 - r5;
        r5 = r5 / r10;
        r4 = r4 - r5;
        r4 = (int) r4;
        r1.setBounds(r2, r3, r0, r4);
        r0 = r12.o;
        r0.draw(r13);
        goto L_0x0013;
    L_0x01a0:
        r3 = r12.c;
        r3 = r3.left;
        r4 = r12.s;
        r4 = r4.right;
        r5 = r12.s;
        r5 = r5.left;
        r4 = r4 - r5;
        r4 = r4 / 2;
        r4 = (float) r4;
        r3 = r3 + r4;
        r4 = r3 + r8;
        if (r0 == 0) goto L_0x0138;
    L_0x01b5:
        r3 = r12.c;
        r3 = r3.right;
        r4 = r12.s;
        r4 = r4.right;
        r5 = r12.s;
        r5 = r5.left;
        r4 = r4 - r5;
        r4 = r4 / 2;
        r4 = (float) r4;
        r3 = r3 - r4;
        r4 = r3 - r8;
        if (r0 == 0) goto L_0x0138;
    L_0x01ca:
        goto L_0x012d;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ThumbnailTextButton.b(android.graphics.Canvas):void");
    }

    public void setIcon(Drawable drawable) {
        this.o = drawable;
    }

    public ThumbnailTextButton(Context context) {
        super(context);
        this.k = -1728053248;
        this.r = -1;
        this.m = 15.0f;
        this.t = 17;
        b(context, null);
    }

    public void setTextSize(float f) {
        this.m = f;
    }

    public void setText(CharSequence charSequence) {
        this.q = charSequence;
    }

    public ThumbnailTextButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.k = -1728053248;
        this.r = -1;
        this.m = 15.0f;
        this.t = 17;
        b(context, attributeSet);
    }

    public void setBackgroundColor(int i) {
        this.k = i;
    }

    public ThumbnailTextButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.k = -1728053248;
        this.r = -1;
        this.m = 15.0f;
        this.t = 17;
        b(context, attributeSet);
    }

    public void setTextGravity(int i) {
        this.t = i;
    }
}
