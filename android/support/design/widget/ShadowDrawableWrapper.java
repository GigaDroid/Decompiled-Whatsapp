package android.support.design.widget;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.support.design.R;
import android.support.v7.graphics.drawable.DrawableWrapper;
import com.whatsapp.arj;
import org.v;
import org.whispersystems.at;

class ShadowDrawableWrapper extends DrawableWrapper {
    static final double COS_45;
    private static final String z;
    private boolean mAddPaddingForCorners;
    final RectF mContentBounds;
    float mCornerRadius;
    final Paint mCornerShadowPaint;
    Path mCornerShadowPath;
    private boolean mDirty;
    final Paint mEdgeShadowPaint;
    float mMaxShadowSize;
    private boolean mPrintedShadowClipWarning;
    float mRawMaxShadowSize;
    float mRawShadowSize;
    private float mRotation;
    private final int mShadowEndColor;
    private final int mShadowMiddleColor;
    float mShadowSize;
    private final int mShadowStartColor;

    public float getShadowSize() {
        return this.mRawShadowSize;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void buildShadowCorners() {
        /*
        r14 = this;
        r13 = 2;
        r12 = 1;
        r11 = 3;
        r10 = 0;
        r1 = 0;
        r7 = new android.graphics.RectF;
        r0 = r14.mCornerRadius;
        r0 = -r0;
        r2 = r14.mCornerRadius;
        r2 = -r2;
        r3 = r14.mCornerRadius;
        r4 = r14.mCornerRadius;
        r7.<init>(r0, r2, r3, r4);
        r8 = new android.graphics.RectF;
        r8.<init>(r7);
        r0 = r14.mShadowSize;	 Catch:{ IllegalArgumentException -> 0x00cc }
        r0 = -r0;
        r2 = r14.mShadowSize;	 Catch:{ IllegalArgumentException -> 0x00cc }
        r2 = -r2;
        r8.inset(r0, r2);	 Catch:{ IllegalArgumentException -> 0x00cc }
        r0 = r14.mCornerShadowPath;	 Catch:{ IllegalArgumentException -> 0x00cc }
        if (r0 != 0) goto L_0x0031;
    L_0x0026:
        r0 = new android.graphics.Path;	 Catch:{ IllegalArgumentException -> 0x00ce }
        r0.<init>();	 Catch:{ IllegalArgumentException -> 0x00ce }
        r14.mCornerShadowPath = r0;	 Catch:{ IllegalArgumentException -> 0x00ce }
        r0 = android.support.design.widget.CoordinatorLayout.a;	 Catch:{ IllegalArgumentException -> 0x00ce }
        if (r0 == 0) goto L_0x0036;
    L_0x0031:
        r0 = r14.mCornerShadowPath;	 Catch:{ IllegalArgumentException -> 0x00ce }
        r0.reset();	 Catch:{ IllegalArgumentException -> 0x00ce }
    L_0x0036:
        r0 = r14.mCornerShadowPath;
        r2 = android.graphics.Path.FillType.EVEN_ODD;
        r0.setFillType(r2);
        r0 = r14.mCornerShadowPath;
        r2 = r14.mCornerRadius;
        r2 = -r2;
        r0.moveTo(r2, r1);
        r0 = r14.mCornerShadowPath;
        r2 = r14.mShadowSize;
        r2 = -r2;
        r0.rLineTo(r2, r1);
        r0 = r14.mCornerShadowPath;
        r2 = 1127481344; // 0x43340000 float:180.0 double:5.570497984E-315;
        r3 = 1119092736; // 0x42b40000 float:90.0 double:5.529052754E-315;
        r0.arcTo(r8, r2, r3, r10);
        r0 = r14.mCornerShadowPath;
        r2 = 1132920832; // 0x43870000 float:270.0 double:5.597372625E-315;
        r3 = -1028390912; // 0xffffffffc2b40000 float:-90.0 double:NaN;
        r0.arcTo(r7, r2, r3, r10);
        r0 = r14.mCornerShadowPath;
        r0.close();
        r0 = r8.top;
        r3 = -r0;
        r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1));
        if (r0 <= 0) goto L_0x00a2;
    L_0x006b:
        r0 = r14.mCornerRadius;
        r2 = r0 / r3;
        r0 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r0 = r0 - r2;
        r4 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r0 = r0 / r4;
        r6 = r2 + r0;
        r9 = r14.mCornerShadowPaint;
        r0 = new android.graphics.RadialGradient;
        r4 = 4;
        r4 = new int[r4];
        r4[r10] = r10;
        r5 = r14.mShadowStartColor;
        r4[r12] = r5;
        r5 = r14.mShadowMiddleColor;
        r4[r13] = r5;
        r5 = r14.mShadowEndColor;
        r4[r11] = r5;
        r5 = 4;
        r5 = new float[r5];
        r5[r10] = r1;
        r5[r12] = r2;
        r5[r13] = r6;
        r2 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r5[r11] = r2;
        r6 = android.graphics.Shader.TileMode.CLAMP;
        r2 = r1;
        r0.<init>(r1, r2, r3, r4, r5, r6);
        r9.setShader(r0);
    L_0x00a2:
        r9 = r14.mEdgeShadowPaint;
        r0 = new android.graphics.LinearGradient;
        r2 = r7.top;
        r4 = r8.top;
        r5 = new int[r11];
        r3 = r14.mShadowStartColor;
        r5[r10] = r3;
        r3 = r14.mShadowMiddleColor;
        r5[r12] = r3;
        r3 = r14.mShadowEndColor;
        r5[r13] = r3;
        r6 = new float[r11];
        r6 = {0, 1056964608, 1065353216};
        r7 = android.graphics.Shader.TileMode.CLAMP;
        r3 = r1;
        r0.<init>(r1, r2, r3, r4, r5, r6, r7);
        r9.setShader(r0);
        r0 = r14.mEdgeShadowPaint;
        r0.setAntiAlias(r10);
        return;
    L_0x00cc:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00ce }
    L_0x00ce:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.ShadowDrawableWrapper.buildShadowCorners():void");
    }

    private static int toEven(float f) {
        int round = Math.round(f);
        try {
            return round % 2 == 1 ? round - 1 : round;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    static {
        char[] toCharArray = "%\u0004\u0010%\"%\u000eF7&-\u000e\t3n?\u0003\u001c!".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 76;
                    break;
                case at.g /*1*/:
                    i2 = arj.Theme_ratingBarStyle;
                    break;
                case at.i /*2*/:
                    i2 = arj.Theme_checkboxStyle;
                    break;
                case at.o /*3*/:
                    i2 = 68;
                    break;
                default:
                    i2 = 78;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
        COS_45 = Math.cos(Math.toRadians(45.0d));
    }

    public void setMaxShadowSize(float f) {
        setShadowSize(this.mRawShadowSize, f);
    }

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i) {
        super.setAlpha(i);
        this.mCornerShadowPaint.setAlpha(i);
        this.mEdgeShadowPaint.setAlpha(i);
    }

    void setShadowSize(float f, float f2) {
        if (f < 0.0f || f2 < 0.0f) {
            try {
                throw new IllegalArgumentException(z);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        float toEven = (float) toEven(f);
        float toEven2 = (float) toEven(f2);
        if (toEven > toEven2) {
            try {
                if (this.mPrintedShadowClipWarning) {
                    toEven = toEven2;
                } else {
                    this.mPrintedShadowClipWarning = true;
                    toEven = toEven2;
                }
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        }
        try {
            if (this.mRawShadowSize == toEven) {
                if (this.mRawMaxShadowSize == toEven2) {
                    return;
                }
            }
            this.mRawShadowSize = toEven;
            this.mRawMaxShadowSize = toEven2;
            this.mShadowSize = (float) Math.round(toEven * 1.5f);
            this.mMaxShadowSize = toEven2;
            this.mDirty = true;
            invalidateSelf();
        } catch (IllegalArgumentException e22) {
            throw e22;
        } catch (IllegalArgumentException e222) {
            throw e222;
        }
    }

    public void setAddPaddingForCorners(boolean z) {
        this.mAddPaddingForCorners = z;
        invalidateSelf();
    }

    public ShadowDrawableWrapper(Resources resources, Drawable drawable, float f, float f2, float f3) {
        super(drawable);
        this.mDirty = true;
        this.mAddPaddingForCorners = true;
        this.mPrintedShadowClipWarning = false;
        this.mShadowStartColor = resources.getColor(R.color.design_fab_shadow_start_color);
        this.mShadowMiddleColor = resources.getColor(R.color.design_fab_shadow_mid_color);
        this.mShadowEndColor = resources.getColor(R.color.design_fab_shadow_end_color);
        this.mCornerShadowPaint = new Paint(5);
        this.mCornerShadowPaint.setStyle(Style.FILL);
        this.mCornerRadius = (float) Math.round(f);
        this.mContentBounds = new RectF();
        this.mEdgeShadowPaint = new Paint(this.mCornerShadowPaint);
        this.mEdgeShadowPaint.setAntiAlias(false);
        setShadowSize(f2, f3);
    }

    private void drawShadow(Canvas canvas) {
        int save = canvas.save();
        canvas.rotate(this.mRotation, this.mContentBounds.centerX(), this.mContentBounds.centerY());
        float f = (-this.mCornerRadius) - this.mShadowSize;
        float f2 = this.mCornerRadius;
        try {
            Object obj = this.mContentBounds.width() - (2.0f * f2) > 0.0f ? 1 : null;
            try {
                Object obj2;
                if (this.mContentBounds.height() - (2.0f * f2) > 0.0f) {
                    obj2 = 1;
                } else {
                    obj2 = null;
                }
                float f3 = f2 / ((this.mRawShadowSize - (this.mRawShadowSize * 0.5f)) + f2);
                float f4 = f2 / ((this.mRawShadowSize - (this.mRawShadowSize * 0.25f)) + f2);
                float f5 = f2 / (f2 + (this.mRawShadowSize - (this.mRawShadowSize * 1.0f)));
                int save2 = canvas.save();
                try {
                    canvas.translate(this.mContentBounds.left + f2, this.mContentBounds.top + f2);
                    canvas.scale(f3, f4);
                    canvas.drawPath(this.mCornerShadowPath, this.mCornerShadowPaint);
                    if (obj != null) {
                        canvas.scale(1.0f / f3, 1.0f);
                        canvas.drawRect(0.0f, f, this.mContentBounds.width() - (2.0f * f2), -this.mCornerRadius, this.mEdgeShadowPaint);
                    }
                    canvas.restoreToCount(save2);
                    save2 = canvas.save();
                    try {
                        canvas.translate(this.mContentBounds.right - f2, this.mContentBounds.bottom - f2);
                        canvas.scale(f3, f5);
                        canvas.rotate(180.0f);
                        canvas.drawPath(this.mCornerShadowPath, this.mCornerShadowPaint);
                        if (obj != null) {
                            canvas.scale(1.0f / f3, 1.0f);
                            canvas.drawRect(0.0f, f, this.mContentBounds.width() - (2.0f * f2), this.mShadowSize + (-this.mCornerRadius), this.mEdgeShadowPaint);
                        }
                        canvas.restoreToCount(save2);
                        int save3 = canvas.save();
                        try {
                            canvas.translate(this.mContentBounds.left + f2, this.mContentBounds.bottom - f2);
                            canvas.scale(f3, f5);
                            canvas.rotate(270.0f);
                            canvas.drawPath(this.mCornerShadowPath, this.mCornerShadowPaint);
                            if (obj2 != null) {
                                canvas.scale(1.0f / f5, 1.0f);
                                canvas.drawRect(0.0f, f, this.mContentBounds.height() - (2.0f * f2), -this.mCornerRadius, this.mEdgeShadowPaint);
                            }
                            canvas.restoreToCount(save3);
                            save3 = canvas.save();
                            try {
                                canvas.translate(this.mContentBounds.right - f2, this.mContentBounds.top + f2);
                                canvas.scale(f3, f4);
                                canvas.rotate(90.0f);
                                canvas.drawPath(this.mCornerShadowPath, this.mCornerShadowPaint);
                                if (obj2 != null) {
                                    canvas.scale(1.0f / f4, 1.0f);
                                    canvas.drawRect(0.0f, f, this.mContentBounds.height() - (2.0f * f2), -this.mCornerRadius, this.mEdgeShadowPaint);
                                }
                                canvas.restoreToCount(save3);
                                canvas.restoreToCount(save);
                            } catch (IllegalArgumentException e) {
                                throw e;
                            }
                        } catch (IllegalArgumentException e2) {
                            throw e2;
                        }
                    } catch (IllegalArgumentException e22) {
                        throw e22;
                    }
                } catch (IllegalArgumentException e222) {
                    throw e222;
                }
            } catch (IllegalArgumentException e2222) {
                throw e2222;
            }
        } catch (IllegalArgumentException e22222) {
            throw e22222;
        }
    }

    public void setShadowSize(float f) {
        setShadowSize(f, this.mRawMaxShadowSize);
    }

    private void buildComponents(Rect rect) {
        float f = this.mRawMaxShadowSize * 1.5f;
        this.mContentBounds.set(((float) rect.left) + this.mRawMaxShadowSize, ((float) rect.top) + f, ((float) rect.right) - this.mRawMaxShadowSize, ((float) rect.bottom) - f);
        getWrappedDrawable().setBounds((int) this.mContentBounds.left, (int) this.mContentBounds.top, (int) this.mContentBounds.right, (int) this.mContentBounds.bottom);
        buildShadowCorners();
    }

    protected void onBoundsChange(Rect rect) {
        this.mDirty = true;
    }

    final void setRotation(float f) {
        try {
            if (this.mRotation != f) {
                this.mRotation = f;
                invalidateSelf();
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public static float calculateHorizontalPadding(float f, float f2, boolean z) {
        if (!z) {
            return f;
        }
        try {
            return (float) (((double) f) + ((1.0d - COS_45) * ((double) f2)));
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public static float calculateVerticalPadding(float f, float f2, boolean z) {
        if (!z) {
            return 1.5f * f;
        }
        try {
            return (float) (((double) (1.5f * f)) + ((1.0d - COS_45) * ((double) f2)));
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public void draw(Canvas canvas) {
        try {
            if (this.mDirty) {
                buildComponents(getBounds());
                this.mDirty = false;
            }
            drawShadow(canvas);
            super.draw(canvas);
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public boolean getPadding(Rect rect) {
        int ceil = (int) Math.ceil((double) calculateVerticalPadding(this.mRawMaxShadowSize, this.mCornerRadius, this.mAddPaddingForCorners));
        int ceil2 = (int) Math.ceil((double) calculateHorizontalPadding(this.mRawMaxShadowSize, this.mCornerRadius, this.mAddPaddingForCorners));
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }
}
