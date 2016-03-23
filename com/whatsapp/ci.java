package com.whatsapp;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Path.FillType;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

public class ci extends Drawable {
    private int a;
    private float b;
    private int c;
    private Paint d;

    private Path a(float f, float f2) {
        Path path = new Path();
        int i = (int) (a4d.a().g * 2.0f);
        path.moveTo((f / 2.0f) - ((float) ((this.a * 2) / 3)), f2 - ((float) this.a));
        path.lineTo(f / 2.0f, f2);
        path.lineTo((f / 2.0f) + ((float) ((this.a * 2) / 3)), f2 - ((float) this.a));
        path.lineTo(f - ((float) i), f2 - ((float) this.a));
        path.arcTo(new RectF(f - ((float) (i * 2)), (f2 - ((float) this.a)) - ((float) (i * 2)), f, f2 - ((float) this.a)), 90.0f, -90.0f);
        path.lineTo(f, (float) i);
        path.arcTo(new RectF(f - ((float) (i * 2)), 0.0f, f, (float) (i * 2)), 0.0f, -90.0f);
        path.lineTo((float) i, 0.0f);
        path.arcTo(new RectF(0.0f, 0.0f, (float) (i * 2), (float) (i * 2)), -90.0f, -90.0f);
        path.lineTo(0.0f, (f2 - ((float) this.a)) - ((float) i));
        path.arcTo(new RectF(0.0f, (f2 - ((float) this.a)) - ((float) (i * 2)), (float) (i * 2), f2 - ((float) this.a)), -180.0f, -90.0f);
        path.close();
        path.setFillType(FillType.WINDING);
        return path;
    }

    public boolean setState(int[] iArr) {
        boolean z = DialogToastActivity.f;
        int i = this.c;
        this.c = 16842921;
        int length = iArr.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = iArr[i2];
            if (i3 == 16842919) {
                this.c = 16842919;
                if (!z) {
                    break;
                }
            }
            if (i3 == 16842913) {
                this.c = 16842913;
                if (!z) {
                    break;
                }
            }
            if (i3 == 16842908) {
                this.c = 16842908;
            }
            i2++;
            if (z) {
                break;
            }
        }
        if (i == this.c) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void draw(android.graphics.Canvas r7) {
        /*
        r6 = this;
        r5 = -13388315; // 0xffffffffff33b5e5 float:-2.3887626E38 double:NaN;
        r3 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r4 = 1069547520; // 0x3fc00000 float:1.5 double:5.28426686E-315;
        r2 = 0;
        r0 = r6.d;
        r1 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r0.setARGB(r1, r2, r2, r2);
        r0 = r6.getBounds();
        r1 = r0.width();
        r0 = r0.height();
        r1 = (float) r1;
        r2 = r6.b;
        r2 = r2 * r3;
        r1 = r1 - r2;
        r0 = (float) r0;
        r2 = r6.b;
        r2 = r2 * r3;
        r0 = r0 - r2;
        r0 = r6.a(r1, r0);
        r1 = new android.graphics.BlurMaskFilter;
        r2 = r6.b;
        r3 = android.graphics.BlurMaskFilter.Blur.NORMAL;
        r1.<init>(r2, r3);
        r2 = r6.d;
        r3 = -1724697805; // 0xffffffff99333333 float:-9.264423E-24 double:NaN;
        r2.setColor(r3);
        r2 = r6.d;
        r3 = android.graphics.Paint.Style.FILL;
        r2.setStyle(r3);
        r2 = r6.d;
        r2.setMaskFilter(r1);
        r1 = r6.b;
        r2 = r6.b;
        r2 = r2 * r4;
        r7.translate(r1, r2);
        r1 = r6.d;
        r7.drawPath(r0, r1);
        r1 = r6.b;
        r1 = -r1;
        r2 = r6.b;
        r2 = -r2;
        r2 = r2 * r4;
        r7.translate(r1, r2);
        r1 = r6.b;
        r2 = r6.b;
        r7.translate(r1, r2);
        r1 = r6.c;
        r2 = 16842919; // 0x10100a7 float:2.3694026E-38 double:8.3215077E-317;
        if (r1 != r2) goto L_0x0074;
    L_0x006b:
        r1 = r6.d;
        r1.setColor(r5);
        r1 = com.whatsapp.DialogToastActivity.f;
        if (r1 == 0) goto L_0x007a;
    L_0x0074:
        r1 = r6.d;
        r2 = -1;
        r1.setColor(r2);
    L_0x007a:
        r1 = r6.d;
        r2 = 0;
        r1.setMaskFilter(r2);
        r1 = r6.d;
        r7.drawPath(r0, r1);
        r1 = r6.c;
        r2 = 16842913; // 0x10100a1 float:2.369401E-38 double:8.3215047E-317;
        if (r1 != r2) goto L_0x00a4;
    L_0x008c:
        r1 = r6.d;
        r2 = r6.b;
        r1.setStrokeWidth(r2);
        r1 = r6.d;
        r2 = android.graphics.Paint.Style.STROKE;
        r1.setStyle(r2);
        r1 = r6.d;
        r1.setColor(r5);
        r1 = r6.d;
        r7.drawPath(r0, r1);
    L_0x00a4:
        r0 = r6.b;
        r0 = -r0;
        r1 = r6.b;
        r1 = -r1;
        r7.translate(r0, r1);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ci.draw(android.graphics.Canvas):void");
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public boolean isStateful() {
        return true;
    }

    public void a(int i) {
        this.a = i;
    }

    public ci() {
        this.a = 18;
        this.c = 16842921;
        this.b = 3.0f;
        this.d = new Paint(1);
        this.b = 2.0f * a4d.a().g;
    }

    public int getOpacity() {
        return 0;
    }

    public void setAlpha(int i) {
    }

    public boolean getPadding(Rect rect) {
        rect.top = (int) this.b;
        rect.bottom = this.a + ((int) this.b);
        rect.left = (int) this.b;
        rect.right = (int) this.b;
        return true;
    }
}
