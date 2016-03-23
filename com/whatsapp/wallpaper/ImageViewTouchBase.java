package com.whatsapp.wallpaper;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;

public abstract class ImageViewTouchBase extends ImageView {
    protected Handler a;
    protected Matrix b;
    public Matrix c;
    int d;
    int e;
    private final float[] f;
    protected final p g;
    private Runnable h;
    private f i;
    protected Matrix j;
    protected float k;
    private float l;

    protected void a(float f) {
        a(f, ((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f);
    }

    public void setImageBitmapResetBase(Bitmap bitmap, boolean z) {
        setImageRotateBitmapResetBase(new p(bitmap), z);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void a(boolean r9, boolean r10) {
        /*
        r8 = this;
        r7 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r1 = 0;
        r3 = com.whatsapp.wallpaper.CropImage.c;
        r0 = r8.g;
        r0 = r0.f();
        if (r0 != 0) goto L_0x000e;
    L_0x000d:
        return;
    L_0x000e:
        r0 = r8.e();
        r4 = new android.graphics.RectF;
        r2 = r8.g;
        r2 = r2.f();
        r2 = r2.getWidth();
        r2 = (float) r2;
        r5 = r8.g;
        r5 = r5.f();
        r5 = r5.getHeight();
        r5 = (float) r5;
        r4.<init>(r1, r1, r2, r5);
        r0.mapRect(r4);
        r0 = r4.height();
        r5 = r4.width();
        if (r10 == 0) goto L_0x00a4;
    L_0x003a:
        r2 = r8.getHeight();
        r6 = (float) r2;
        r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1));
        if (r6 >= 0) goto L_0x00a2;
    L_0x0043:
        r6 = (float) r2;
        r0 = r6 - r0;
        r0 = r0 / r7;
        r6 = r4.top;
        r0 = r0 - r6;
        if (r3 == 0) goto L_0x00a0;
    L_0x004c:
        r6 = r4.top;
        r6 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1));
        if (r6 <= 0) goto L_0x0057;
    L_0x0052:
        r0 = r4.top;
        r0 = -r0;
        if (r3 == 0) goto L_0x00a0;
    L_0x0057:
        r6 = r4.bottom;
        r2 = (float) r2;
        r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1));
        if (r2 >= 0) goto L_0x00a0;
    L_0x005e:
        r0 = r8.getHeight();
        r0 = (float) r0;
        r2 = r4.bottom;
        r0 = r0 - r2;
        r2 = r0;
    L_0x0067:
        if (r9 == 0) goto L_0x009e;
    L_0x0069:
        r6 = r8.getWidth();
        r0 = (float) r6;
        r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1));
        if (r0 >= 0) goto L_0x009c;
    L_0x0072:
        r0 = (float) r6;
        r0 = r0 - r5;
        r0 = r0 / r7;
        r5 = r4.left;
        r0 = r0 - r5;
        if (r3 == 0) goto L_0x0090;
    L_0x007a:
        r5 = r4.left;
        r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1));
        if (r1 <= 0) goto L_0x0085;
    L_0x0080:
        r0 = r4.left;
        r0 = -r0;
        if (r3 == 0) goto L_0x0090;
    L_0x0085:
        r1 = r4.right;
        r3 = (float) r6;
        r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1));
        if (r1 >= 0) goto L_0x0090;
    L_0x008c:
        r0 = (float) r6;
        r1 = r4.right;
        r0 = r0 - r1;
    L_0x0090:
        r8.b(r0, r2);
        r0 = r8.e();
        r8.setImageMatrix(r0);
        goto L_0x000d;
    L_0x009c:
        r0 = r1;
        goto L_0x007a;
    L_0x009e:
        r0 = r1;
        goto L_0x0090;
    L_0x00a0:
        r2 = r0;
        goto L_0x0067;
    L_0x00a2:
        r0 = r1;
        goto L_0x004c;
    L_0x00a4:
        r2 = r1;
        goto L_0x0067;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wallpaper.ImageViewTouchBase.a(boolean, boolean):void");
    }

    protected float a(Matrix matrix) {
        return a(matrix, 0);
    }

    public ImageViewTouchBase(Context context) {
        super(context);
        this.j = new Matrix();
        this.b = new Matrix();
        this.c = new Matrix();
        this.f = new float[9];
        this.g = new p(null);
        this.e = -1;
        this.d = -1;
        this.l = 3.0f;
        this.a = new Handler(Looper.getMainLooper());
        this.h = null;
        a();
    }

    protected float a(Matrix matrix, int i) {
        matrix.getValues(this.f);
        return this.f[i];
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setImageRotateBitmapResetBase(com.whatsapp.wallpaper.p r3, boolean r4) {
        /*
        r2 = this;
        r0 = r2.getWidth();
        if (r0 > 0) goto L_0x000e;
    L_0x0006:
        r0 = new com.whatsapp.wallpaper.m;
        r0.<init>(r2, r3, r4);
        r2.h = r0;
    L_0x000d:
        return;
    L_0x000e:
        r0 = r3.f();
        if (r0 == 0) goto L_0x0028;
    L_0x0014:
        r0 = r2.j;
        r2.a(r3, r0);
        r0 = r3.f();
        r1 = r3.d();
        r2.a(r0, r1);
        r0 = com.whatsapp.wallpaper.CropImage.c;
        if (r0 == 0) goto L_0x0031;
    L_0x0028:
        r0 = r2.j;
        r0.reset();
        r0 = 0;
        super.setImageBitmap(r0);
    L_0x0031:
        if (r4 == 0) goto L_0x0038;
    L_0x0033:
        r0 = r2.b;
        r0.reset();
    L_0x0038:
        r0 = r2.e();
        r2.setImageMatrix(r0);
        r0 = r2.c();
        r2.k = r0;
        goto L_0x000d;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wallpaper.ImageViewTouchBase.setImageRotateBitmapResetBase(com.whatsapp.wallpaper.p, boolean):void");
    }

    public Matrix e() {
        this.c.set(this.j);
        this.c.postConcat(this.b);
        return this.c;
    }

    private void a() {
        setScaleType(ScaleType.MATRIX);
    }

    protected void a(float f, float f2, float f3) {
        if (f > this.k) {
            f = this.k;
        }
        float b = f / b();
        this.b.postScale(b, b, f2, f3);
        setImageMatrix(e());
        a(true, true);
    }

    public void a(float f, float f2) {
        if (f != 0.0f || f2 != 0.0f) {
            b(f, f2);
            setImageMatrix(e());
        }
    }

    public void d() {
        setImageBitmapResetBase(null, true);
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.e = i3 - i;
        this.d = i4 - i2;
        Runnable runnable = this.h;
        if (runnable != null) {
            this.h = null;
            runnable.run();
        }
        if (this.g.f() != null) {
            a(this.g, this.j);
            setImageMatrix(e());
        }
    }

    protected void a(float f, float f2, float f3, float f4, Runnable runnable) {
        float b = (f - b()) / f4;
        float b2 = b();
        this.a.post(new i(this, f4, System.currentTimeMillis(), b2, b, f2, f3, runnable));
    }

    public void setImageBitmap(Bitmap bitmap) {
        if (bitmap == null) {
            super.setImageBitmap(bitmap);
            if (CropImage.c == 0) {
                return;
            }
        }
        setImageBitmapResetBase(bitmap, true);
    }

    protected void b(float f, float f2) {
        this.b.postTranslate(f, f2);
    }

    public float b() {
        return a(this.b);
    }

    private void a(p pVar, Matrix matrix) {
        float width = (float) getWidth();
        float height = (float) getHeight();
        float e = (float) pVar.e();
        float b = (float) pVar.b();
        matrix.reset();
        float min = Math.min(Math.min(width / e, this.l), Math.min(height / b, this.l));
        matrix.postConcat(pVar.a());
        matrix.postScale(min, min);
        matrix.postTranslate((width - (e * min)) / 2.0f, (height - (b * min)) / 2.0f);
    }

    public ImageViewTouchBase(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.j = new Matrix();
        this.b = new Matrix();
        this.c = new Matrix();
        this.f = new float[9];
        this.g = new p(null);
        this.e = -1;
        this.d = -1;
        this.l = 3.0f;
        this.a = new Handler(Looper.getMainLooper());
        this.h = null;
        a();
    }

    protected float c() {
        if (this.g.f() == null) {
            return 1.0f;
        }
        return Math.max(1.0f, Math.max(((float) this.g.e()) / ((float) this.e), ((float) this.g.b()) / ((float) this.d)) * 4.0f);
    }

    private void a(Bitmap bitmap, Matrix matrix) {
        super.setImageBitmap(bitmap);
        Drawable drawable = getDrawable();
        if (drawable != null) {
            drawable.setDither(true);
            drawable.setFilterBitmap(true);
        }
        Bitmap f = this.g.f();
        this.g.a(bitmap);
        this.g.a(matrix);
        if (f != null && f != bitmap && this.i != null) {
            this.i.a(f);
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || b() <= 1.0f) {
            return super.onKeyDown(i, keyEvent);
        }
        a(1.0f);
        return true;
    }
}
