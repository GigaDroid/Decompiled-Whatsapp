package com.whatsapp;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.ImageView;

public class ThumbnailButton extends ImageView {
    private static int b;
    float a;
    final RectF c;
    float d;
    int e;
    Paint f;
    int g;
    final Rect h;
    float i;
    boolean j;

    public ThumbnailButton(Context context) {
        super(context);
        this.a = 0.0f;
        this.g = b;
        this.c = new RectF();
        this.h = new Rect();
        a(context, null);
    }

    public void setBorderColor(int i) {
        this.e = i;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r4) {
        /*
        r3 = this;
        r0 = r3.c;
        r1 = r3.getPaddingLeft();
        r1 = (float) r1;
        r0.left = r1;
        r0 = r3.c;
        r1 = r3.getWidth();
        r2 = r3.getPaddingLeft();
        r1 = r1 - r2;
        r1 = (float) r1;
        r0.right = r1;
        r0 = r3.c;
        r1 = r3.getPaddingTop();
        r1 = (float) r1;
        r0.top = r1;
        r0 = r3.c;
        r1 = r3.getHeight();
        r2 = r3.getPaddingBottom();
        r1 = r1 - r2;
        r1 = (float) r1;
        r0.bottom = r1;
        r0 = r3.j;
        if (r0 != 0) goto L_0x003a;
    L_0x0032:
        r0 = r3.getDrawable();
        r0 = r0 instanceof android.graphics.drawable.BitmapDrawable;
        if (r0 != 0) goto L_0x0041;
    L_0x003a:
        super.onDraw(r4);
        r0 = com.whatsapp.DialogToastActivity.f;
        if (r0 == 0) goto L_0x0044;
    L_0x0041:
        r3.a(r4);
    L_0x0044:
        r3.b(r4);
        r3.c(r4);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ThumbnailButton.onDraw(android.graphics.Canvas):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static {
        /*
        r0 = android.os.Build.VERSION.SDK_INT;
        r1 = 19;
        if (r0 < r1) goto L_0x002b;
    L_0x0006:
        r0 = android.os.Build.VERSION.SDK_INT;
        r1 = 21;
        if (r0 >= r1) goto L_0x004e;
    L_0x000c:
        r0 = "\u007f:#yEb<";
        r0 = r0.toCharArray();
        r1 = r0.length;
        r2 = 0;
        r3 = r2;
        r2 = r1;
        r1 = r0;
    L_0x0018:
        if (r2 > r3) goto L_0x0031;
    L_0x001a:
        r0 = new java.lang.String;
        r0.<init>(r1);
        r0 = r0.intern();
        r1 = android.os.Build.MANUFACTURER;
        r0 = r0.equalsIgnoreCase(r1);
        if (r0 == 0) goto L_0x004e;
    L_0x002b:
        r0 = 1711315455; // 0x660099ff float:1.5182591E23 double:8.455021755E-315;
    L_0x002e:
        b = r0;
        return;
    L_0x0031:
        r4 = r1[r3];
        r0 = r3 % 5;
        switch(r0) {
            case 0: goto L_0x0042;
            case 1: goto L_0x0045;
            case 2: goto L_0x0048;
            case 3: goto L_0x004b;
            default: goto L_0x0038;
        };
    L_0x0038:
        r0 = 48;
    L_0x003a:
        r0 = r0 ^ r4;
        r0 = (char) r0;
        r1[r3] = r0;
        r0 = r3 + 1;
        r3 = r0;
        goto L_0x0018;
    L_0x0042:
        r0 = 12;
        goto L_0x003a;
    L_0x0045:
        r0 = 91;
        goto L_0x003a;
    L_0x0048:
        r0 = 78;
        goto L_0x003a;
    L_0x004b:
        r0 = 10;
        goto L_0x003a;
    L_0x004e:
        r0 = 419430400; // 0x19000000 float:6.617445E-24 double:2.072261515E-315;
        goto L_0x002e;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ThumbnailButton.<clinit>():void");
    }

    protected void c(Canvas canvas) {
        if (!isEnabled()) {
            return;
        }
        if (isSelected() || isPressed()) {
            this.f.setStyle(Style.FILL);
            this.f.setColor(this.g);
            if (this.a >= 0.0f) {
                canvas.drawRoundRect(this.c, this.a, this.a, this.f);
                if (!DialogToastActivity.f) {
                    return;
                }
            }
            canvas.drawArc(this.c, 0.0f, 360.0f, true, this.f);
        }
    }

    protected void b(Canvas canvas) {
        if (this.d > 0.0f && this.e != 0) {
            this.f.setColor(this.e);
            this.f.setStrokeWidth(this.d);
            this.f.setStyle(Style.STROKE);
            if (this.a >= 0.0f) {
                canvas.drawRoundRect(this.c, this.a, this.a, this.f);
                if (!DialogToastActivity.f) {
                    return;
                }
            }
            canvas.drawArc(this.c, 0.0f, 360.0f, true, this.f);
        }
    }

    public void setBorderSize(float f) {
        this.d = f;
    }

    public ThumbnailButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = 0.0f;
        this.g = b;
        this.c = new RectF();
        this.h = new Rect();
        a(context, attributeSet);
    }

    private void a(Context context, AttributeSet attributeSet) {
        setBackgroundDrawable(new xr(null));
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, arj.ThumbnailButton);
            this.a = obtainStyledAttributes.getDimension(1, this.a);
            this.i = obtainStyledAttributes.getFloat(4, this.i);
            this.g = obtainStyledAttributes.getInteger(0, this.g);
            this.d = obtainStyledAttributes.getDimension(2, this.d);
            this.e = obtainStyledAttributes.getInteger(3, this.e);
            this.j = obtainStyledAttributes.getBoolean(5, this.j);
            obtainStyledAttributes.recycle();
        }
        this.f = new Paint();
        this.f.setAntiAlias(true);
        this.f.setDither(true);
        this.f.setFilterBitmap(true);
        this.f.setColor(-1);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void a(android.graphics.Canvas r13) {
        /*
        r12 = this;
        r11 = 0;
        r10 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r2 = 0;
        r1 = 0;
        r3 = com.whatsapp.DialogToastActivity.f;
        r0 = r12.getDrawable();
        if (r0 == 0) goto L_0x0102;
    L_0x000d:
        r0 = r12.getDrawable();
        r0 = (android.graphics.drawable.BitmapDrawable) r0;
        r7 = r0.getBitmap();
        r0 = r7.getWidth();
        r4 = r7.getHeight();
        r5 = r12.getScaleType();
        r6 = android.widget.ImageView.ScaleType.FIT_CENTER;
        if (r5 != r6) goto L_0x008c;
    L_0x0027:
        r5 = r12.h;
        r5.set(r1, r1, r0, r4);
        r5 = r0 / r4;
        r5 = (float) r5;
        r6 = r12.c;
        r6 = r6.width();
        r8 = r12.c;
        r8 = r8.height();
        r6 = r6 / r8;
        r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1));
        if (r5 <= 0) goto L_0x0066;
    L_0x0040:
        r5 = r12.c;
        r5 = r5.width();
        r6 = (float) r4;
        r5 = r5 * r6;
        r6 = (float) r0;
        r5 = r5 / r6;
        r6 = r12.c;
        r6 = r6.top;
        r8 = r12.c;
        r8 = r8.bottom;
        r6 = r6 + r8;
        r6 = r6 / r10;
        r8 = r12.c;
        r9 = r5 / r10;
        r6 = r6 - r9;
        r8.top = r6;
        r6 = r12.c;
        r8 = r12.c;
        r8 = r8.top;
        r5 = r5 + r8;
        r6.bottom = r5;
        if (r3 == 0) goto L_0x00a2;
    L_0x0066:
        r5 = r12.c;
        r5 = r5.height();
        r6 = (float) r0;
        r5 = r5 * r6;
        r6 = (float) r4;
        r5 = r5 / r6;
        r6 = r12.c;
        r6 = r6.left;
        r8 = r12.c;
        r8 = r8.right;
        r6 = r6 + r8;
        r6 = r6 / r10;
        r8 = r12.c;
        r9 = r5 / r10;
        r6 = r6 - r9;
        r8.left = r6;
        r6 = r12.c;
        r8 = r12.c;
        r8 = r8.left;
        r5 = r5 + r8;
        r6.right = r5;
        if (r3 == 0) goto L_0x00a2;
    L_0x008c:
        r5 = r0 - r4;
        r5 = r5 / 2;
        if (r5 <= 0) goto L_0x009b;
    L_0x0092:
        r6 = r12.h;
        r8 = r0 - r5;
        r6.set(r5, r1, r8, r4);
        if (r3 == 0) goto L_0x00a2;
    L_0x009b:
        r6 = r12.h;
        r8 = -r5;
        r4 = r4 + r5;
        r6.set(r1, r8, r0, r4);
    L_0x00a2:
        r0 = r12.f;
        r4 = -1;
        r0.setColor(r4);
        r0 = r12.f;
        r4 = android.graphics.Paint.Style.FILL;
        r0.setStyle(r4);
        r0 = r12.a;
        r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r0 == 0) goto L_0x0103;
    L_0x00b5:
        r0 = r12.c;
        r4 = 31;
        r6 = r13.saveLayer(r0, r11, r4);
        r13.drawARGB(r1, r1, r1, r1);
        r0 = r12.a;
        r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r0 < 0) goto L_0x00d3;
    L_0x00c6:
        r0 = r12.c;
        r1 = r12.a;
        r4 = r12.a;
        r5 = r12.f;
        r13.drawRoundRect(r0, r1, r4, r5);
        if (r3 == 0) goto L_0x00de;
    L_0x00d3:
        r1 = r12.c;
        r3 = 1135869952; // 0x43b40000 float:360.0 double:5.611943214E-315;
        r4 = 1;
        r5 = r12.f;
        r0 = r13;
        r0.drawArc(r1, r2, r3, r4, r5);
    L_0x00de:
        r0 = r12.f;
        r1 = new android.graphics.PorterDuffXfermode;
        r3 = android.graphics.PorterDuff.Mode.SRC_IN;
        r1.<init>(r3);
        r0.setXfermode(r1);
        r0 = r6;
    L_0x00eb:
        r1 = r12.h;
        r3 = r12.c;
        r4 = r12.f;
        r13.drawBitmap(r7, r1, r3, r4);
        r1 = r12.a;
        r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1));
        if (r1 == 0) goto L_0x0102;
    L_0x00fa:
        r1 = r12.f;
        r1.setXfermode(r11);
        r13.restoreToCount(r0);
    L_0x0102:
        return;
    L_0x0103:
        r0 = r1;
        goto L_0x00eb;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ThumbnailButton.a(android.graphics.Canvas):void");
    }

    public void setRadius(float f) {
        this.a = f;
    }

    public ThumbnailButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 0.0f;
        this.g = b;
        this.c = new RectF();
        this.h = new Rect();
        a(context, attributeSet);
    }

    protected void onMeasure(int i, int i2) {
        if (this.i == 1.0f) {
            int defaultSize = getDefaultSize(getSuggestedMinimumWidth(), i);
            setMeasuredDimension(defaultSize, defaultSize);
            if (!DialogToastActivity.f) {
                return;
            }
        }
        super.onMeasure(i, i2);
    }
}
