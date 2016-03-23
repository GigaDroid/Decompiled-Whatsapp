package android.support.design.widget;

import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.support.design.R;
import android.support.v4.text.TextDirectionHeuristicCompat;
import android.support.v4.text.TextDirectionHeuristicsCompat;
import android.support.v4.view.ViewCompat;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Interpolator;

final class CollapsingTextHelper {
    private static final Paint DEBUG_DRAW_PAINT;
    private static final boolean USE_SCALING_TEXTURE;
    private boolean mBoundsChanged;
    private final Rect mCollapsedBounds;
    private float mCollapsedDrawX;
    private float mCollapsedDrawY;
    private int mCollapsedShadowColor;
    private float mCollapsedShadowDx;
    private float mCollapsedShadowDy;
    private float mCollapsedShadowRadius;
    private int mCollapsedTextColor;
    private int mCollapsedTextGravity;
    private float mCollapsedTextSize;
    private Typeface mCollapsedTypeface;
    private final RectF mCurrentBounds;
    private float mCurrentDrawX;
    private float mCurrentDrawY;
    private float mCurrentTextSize;
    private Typeface mCurrentTypeface;
    private boolean mDrawTitle;
    private final Rect mExpandedBounds;
    private float mExpandedDrawX;
    private float mExpandedDrawY;
    private float mExpandedFraction;
    private int mExpandedShadowColor;
    private float mExpandedShadowDx;
    private float mExpandedShadowDy;
    private float mExpandedShadowRadius;
    private int mExpandedTextColor;
    private int mExpandedTextGravity;
    private float mExpandedTextSize;
    private Bitmap mExpandedTitleTexture;
    private Typeface mExpandedTypeface;
    private boolean mIsRtl;
    private Interpolator mPositionInterpolator;
    private float mScale;
    private CharSequence mText;
    private final TextPaint mTextPaint;
    private Interpolator mTextSizeInterpolator;
    private CharSequence mTextToDraw;
    private float mTextureAscent;
    private float mTextureDescent;
    private Paint mTexturePaint;
    private boolean mUseTexture;
    private final View mView;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void calculateOffsets(float r7) {
        /*
        r6 = this;
        r5 = 0;
        r6.interpolateBounds(r7);
        r0 = r6.mExpandedDrawX;
        r1 = r6.mCollapsedDrawX;
        r2 = r6.mPositionInterpolator;
        r0 = lerp(r0, r1, r7, r2);
        r6.mCurrentDrawX = r0;
        r0 = r6.mExpandedDrawY;
        r1 = r6.mCollapsedDrawY;
        r2 = r6.mPositionInterpolator;
        r0 = lerp(r0, r1, r7, r2);
        r6.mCurrentDrawY = r0;
        r0 = r6.mExpandedTextSize;
        r1 = r6.mCollapsedTextSize;
        r2 = r6.mTextSizeInterpolator;
        r0 = lerp(r0, r1, r7, r2);
        r6.setInterpolatedTextSize(r0);
        r0 = r6.mCollapsedTextColor;
        r1 = r6.mExpandedTextColor;
        if (r0 == r1) goto L_0x0040;
    L_0x002f:
        r0 = r6.mTextPaint;
        r1 = r6.mExpandedTextColor;
        r2 = r6.mCollapsedTextColor;
        r1 = blendColors(r1, r2, r7);
        r0.setColor(r1);
        r0 = android.support.design.widget.CoordinatorLayout.a;
        if (r0 == 0) goto L_0x0047;
    L_0x0040:
        r0 = r6.mTextPaint;
        r1 = r6.mCollapsedTextColor;
        r0.setColor(r1);
    L_0x0047:
        r0 = r6.mTextPaint;
        r1 = r6.mExpandedShadowRadius;
        r2 = r6.mCollapsedShadowRadius;
        r1 = lerp(r1, r2, r7, r5);
        r2 = r6.mExpandedShadowDx;
        r3 = r6.mCollapsedShadowDx;
        r2 = lerp(r2, r3, r7, r5);
        r3 = r6.mExpandedShadowDy;
        r4 = r6.mCollapsedShadowDy;
        r3 = lerp(r3, r4, r7, r5);
        r4 = r6.mExpandedShadowColor;
        r5 = r6.mCollapsedShadowColor;
        r4 = blendColors(r4, r5, r7);
        r0.setShadowLayer(r1, r2, r3, r4);
        r0 = r6.mView;
        android.support.v4.view.ViewCompat.postInvalidateOnAnimation(r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.CollapsingTextHelper.calculateOffsets(float):void");
    }

    float getExpansionFraction() {
        return this.mExpandedFraction;
    }

    CharSequence getText() {
        return this.mText;
    }

    private static float lerp(float f, float f2, float f3, Interpolator interpolator) {
        if (interpolator != null) {
            f3 = interpolator.getInterpolation(f3);
        }
        return AnimationUtils.lerp(f, f2, f3);
    }

    void setCollapsedTextAppearance(int i) {
        TypedArray obtainStyledAttributes = this.mView.getContext().obtainStyledAttributes(i, R.styleable.TextAppearance);
        if (obtainStyledAttributes.hasValue(R.styleable.TextAppearance_android_textColor)) {
            this.mCollapsedTextColor = obtainStyledAttributes.getColor(R.styleable.TextAppearance_android_textColor, this.mCollapsedTextColor);
        }
        if (obtainStyledAttributes.hasValue(R.styleable.TextAppearance_android_textSize)) {
            this.mCollapsedTextSize = (float) obtainStyledAttributes.getDimensionPixelSize(R.styleable.TextAppearance_android_textSize, (int) this.mCollapsedTextSize);
        }
        this.mCollapsedShadowColor = obtainStyledAttributes.getInt(R.styleable.TextAppearance_android_shadowColor, 0);
        this.mCollapsedShadowDx = obtainStyledAttributes.getFloat(R.styleable.TextAppearance_android_shadowDx, 0.0f);
        this.mCollapsedShadowDy = obtainStyledAttributes.getFloat(R.styleable.TextAppearance_android_shadowDy, 0.0f);
        this.mCollapsedShadowRadius = obtainStyledAttributes.getFloat(R.styleable.TextAppearance_android_shadowRadius, 0.0f);
        obtainStyledAttributes.recycle();
        if (VERSION.SDK_INT >= 16) {
            this.mCollapsedTypeface = readFontFamilyTypeface(i);
        }
        recalculate();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void calculateUsingTextSize(float r10) {
        /*
        r9 = this;
        r8 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r1 = 1;
        r2 = 0;
        r5 = android.support.design.widget.CoordinatorLayout.a;
        r0 = r9.mText;
        if (r0 != 0) goto L_0x000b;
    L_0x000a:
        return;
    L_0x000b:
        r0 = r9.mCollapsedTextSize;
        r0 = isClose(r10, r0);
        if (r0 == 0) goto L_0x00a4;
    L_0x0013:
        r0 = r9.mCollapsedBounds;
        r0 = r0.width();
        r3 = (float) r0;
        r0 = r9.mCollapsedTextSize;
        r9.mScale = r8;
        r4 = r9.mCurrentTypeface;
        r6 = r9.mCollapsedTypeface;
        if (r4 == r6) goto L_0x00a0;
    L_0x0024:
        r4 = r9.mCollapsedTypeface;
        r9.mCurrentTypeface = r4;
        if (r5 == 0) goto L_0x009c;
    L_0x002a:
        r0 = r1;
    L_0x002b:
        r3 = r9.mExpandedBounds;
        r3 = r3.width();
        r4 = (float) r3;
        r3 = r9.mExpandedTextSize;
        r6 = r9.mCurrentTypeface;
        r7 = r9.mExpandedTypeface;
        if (r6 == r7) goto L_0x003f;
    L_0x003a:
        r0 = r9.mExpandedTypeface;
        r9.mCurrentTypeface = r0;
        r0 = r1;
    L_0x003f:
        r6 = r9.mExpandedTextSize;
        r6 = isClose(r10, r6);
        if (r6 == 0) goto L_0x004b;
    L_0x0047:
        r9.mScale = r8;
        if (r5 == 0) goto L_0x0051;
    L_0x004b:
        r5 = r9.mExpandedTextSize;
        r5 = r10 / r5;
        r9.mScale = r5;
    L_0x0051:
        r5 = 0;
        r5 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1));
        if (r5 <= 0) goto L_0x009a;
    L_0x0056:
        r5 = r9.mCurrentTextSize;
        r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1));
        if (r5 != 0) goto L_0x0062;
    L_0x005c:
        r5 = r9.mBoundsChanged;
        if (r5 != 0) goto L_0x0062;
    L_0x0060:
        if (r0 == 0) goto L_0x0098;
    L_0x0062:
        r9.mCurrentTextSize = r3;
        r9.mBoundsChanged = r2;
    L_0x0066:
        r0 = r9.mTextToDraw;
        if (r0 == 0) goto L_0x006c;
    L_0x006a:
        if (r1 == 0) goto L_0x000a;
    L_0x006c:
        r0 = r9.mTextPaint;
        r1 = r9.mCurrentTextSize;
        r0.setTextSize(r1);
        r0 = r9.mTextPaint;
        r1 = r9.mCurrentTypeface;
        r0.setTypeface(r1);
        r0 = r9.mText;
        r1 = r9.mTextPaint;
        r2 = android.text.TextUtils.TruncateAt.END;
        r0 = android.text.TextUtils.ellipsize(r0, r1, r4, r2);
        r1 = r9.mTextToDraw;
        r1 = android.text.TextUtils.equals(r0, r1);
        if (r1 != 0) goto L_0x000a;
    L_0x008c:
        r9.mTextToDraw = r0;
        r0 = r9.mTextToDraw;
        r0 = r9.calculateIsRtl(r0);
        r9.mIsRtl = r0;
        goto L_0x000a;
    L_0x0098:
        r1 = r2;
        goto L_0x0062;
    L_0x009a:
        r1 = r0;
        goto L_0x0066;
    L_0x009c:
        r4 = r3;
        r3 = r0;
        r0 = r1;
        goto L_0x0051;
    L_0x00a0:
        r4 = r3;
        r3 = r0;
        r0 = r2;
        goto L_0x0051;
    L_0x00a4:
        r0 = r2;
        goto L_0x002b;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.CollapsingTextHelper.calculateUsingTextSize(float):void");
    }

    private void clearTexture() {
        if (this.mExpandedTitleTexture != null) {
            this.mExpandedTitleTexture.recycle();
            this.mExpandedTitleTexture = null;
        }
    }

    void setExpandedTextColor(int i) {
        if (this.mExpandedTextColor != i) {
            this.mExpandedTextColor = i;
            recalculate();
        }
    }

    void setExpandedTextAppearance(int i) {
        TypedArray obtainStyledAttributes = this.mView.getContext().obtainStyledAttributes(i, R.styleable.TextAppearance);
        if (obtainStyledAttributes.hasValue(R.styleable.TextAppearance_android_textColor)) {
            this.mExpandedTextColor = obtainStyledAttributes.getColor(R.styleable.TextAppearance_android_textColor, this.mExpandedTextColor);
        }
        if (obtainStyledAttributes.hasValue(R.styleable.TextAppearance_android_textSize)) {
            this.mExpandedTextSize = (float) obtainStyledAttributes.getDimensionPixelSize(R.styleable.TextAppearance_android_textSize, (int) this.mExpandedTextSize);
        }
        this.mExpandedShadowColor = obtainStyledAttributes.getInt(R.styleable.TextAppearance_android_shadowColor, 0);
        this.mExpandedShadowDx = obtainStyledAttributes.getFloat(R.styleable.TextAppearance_android_shadowDx, 0.0f);
        this.mExpandedShadowDy = obtainStyledAttributes.getFloat(R.styleable.TextAppearance_android_shadowDy, 0.0f);
        this.mExpandedShadowRadius = obtainStyledAttributes.getFloat(R.styleable.TextAppearance_android_shadowRadius, 0.0f);
        obtainStyledAttributes.recycle();
        if (VERSION.SDK_INT >= 16) {
            this.mExpandedTypeface = readFontFamilyTypeface(i);
        }
        recalculate();
    }

    void setCollapsedBounds(int i, int i2, int i3, int i4) {
        if (!rectEquals(this.mCollapsedBounds, i, i2, i3, i4)) {
            this.mCollapsedBounds.set(i, i2, i3, i4);
            this.mBoundsChanged = true;
            onBoundsChanged();
        }
    }

    void setExpandedTextSize(float f) {
        if (this.mExpandedTextSize != f) {
            this.mExpandedTextSize = f;
            recalculate();
        }
    }

    private void calculateCurrentOffsets() {
        calculateOffsets(this.mExpandedFraction);
    }

    float getCollapsedTextSize() {
        return this.mCollapsedTextSize;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void calculateBaseOffsets() {
        /*
        r10 = this;
        r3 = 1;
        r1 = 0;
        r4 = 0;
        r9 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r5 = android.support.design.widget.CoordinatorLayout.a;
        r6 = r10.mCurrentTextSize;
        r0 = r10.mCollapsedTextSize;
        r10.calculateUsingTextSize(r0);
        r0 = r10.mTextToDraw;
        if (r0 == 0) goto L_0x00b3;
    L_0x0012:
        r0 = r10.mTextPaint;
        r2 = r10.mTextToDraw;
        r7 = r10.mTextToDraw;
        r7 = r7.length();
        r0 = r0.measureText(r2, r4, r7);
    L_0x0020:
        r7 = r10.mCollapsedTextGravity;
        r2 = r10.mIsRtl;
        if (r2 == 0) goto L_0x00b6;
    L_0x0026:
        r2 = r3;
    L_0x0027:
        r2 = android.support.v4.view.GravityCompat.getAbsoluteGravity(r7, r2);
        r7 = r2 & 112;
        switch(r7) {
            case 48: goto L_0x00c2;
            case 80: goto L_0x00b9;
            default: goto L_0x0030;
        };
    L_0x0030:
        r7 = r10.mTextPaint;
        r7 = r7.descent();
        r8 = r10.mTextPaint;
        r8 = r8.ascent();
        r7 = r7 - r8;
        r7 = r7 / r9;
        r8 = r10.mTextPaint;
        r8 = r8.descent();
        r7 = r7 - r8;
        r8 = r10.mCollapsedBounds;
        r8 = r8.centerY();
        r8 = (float) r8;
        r7 = r7 + r8;
        r10.mCollapsedDrawY = r7;
    L_0x004f:
        r2 = r2 & 7;
        switch(r2) {
            case 1: goto L_0x00d4;
            case 5: goto L_0x00e2;
            default: goto L_0x0054;
        };
    L_0x0054:
        r0 = r10.mCollapsedBounds;
        r0 = r0.left;
        r0 = (float) r0;
        r10.mCollapsedDrawX = r0;
    L_0x005b:
        r0 = r10.mExpandedTextSize;
        r10.calculateUsingTextSize(r0);
        r0 = r10.mTextToDraw;
        if (r0 == 0) goto L_0x0072;
    L_0x0064:
        r0 = r10.mTextPaint;
        r1 = r10.mTextToDraw;
        r2 = r10.mTextToDraw;
        r2 = r2.length();
        r1 = r0.measureText(r1, r4, r2);
    L_0x0072:
        r0 = r10.mExpandedTextGravity;
        r2 = r10.mIsRtl;
        if (r2 == 0) goto L_0x00ef;
    L_0x0078:
        r0 = android.support.v4.view.GravityCompat.getAbsoluteGravity(r0, r3);
        r2 = r0 & 112;
        switch(r2) {
            case 48: goto L_0x00fa;
            case 80: goto L_0x00f1;
            default: goto L_0x0081;
        };
    L_0x0081:
        r2 = r10.mTextPaint;
        r2 = r2.descent();
        r3 = r10.mTextPaint;
        r3 = r3.ascent();
        r2 = r2 - r3;
        r2 = r2 / r9;
        r3 = r10.mTextPaint;
        r3 = r3.descent();
        r2 = r2 - r3;
        r3 = r10.mExpandedBounds;
        r3 = r3.centerY();
        r3 = (float) r3;
        r2 = r2 + r3;
        r10.mExpandedDrawY = r2;
    L_0x00a0:
        r0 = r0 & 7;
        switch(r0) {
            case 1: goto L_0x010c;
            case 5: goto L_0x011a;
            default: goto L_0x00a5;
        };
    L_0x00a5:
        r0 = r10.mExpandedBounds;
        r0 = r0.left;
        r0 = (float) r0;
        r10.mExpandedDrawX = r0;
    L_0x00ac:
        r10.clearTexture();
        r10.setInterpolatedTextSize(r6);
        return;
    L_0x00b3:
        r0 = r1;
        goto L_0x0020;
    L_0x00b6:
        r2 = r4;
        goto L_0x0027;
    L_0x00b9:
        r7 = r10.mCollapsedBounds;
        r7 = r7.bottom;
        r7 = (float) r7;
        r10.mCollapsedDrawY = r7;
        if (r5 == 0) goto L_0x004f;
    L_0x00c2:
        r7 = r10.mCollapsedBounds;
        r7 = r7.top;
        r7 = (float) r7;
        r8 = r10.mTextPaint;
        r8 = r8.ascent();
        r7 = r7 - r8;
        r10.mCollapsedDrawY = r7;
        if (r5 == 0) goto L_0x004f;
    L_0x00d2:
        goto L_0x0030;
    L_0x00d4:
        r2 = r10.mCollapsedBounds;
        r2 = r2.centerX();
        r2 = (float) r2;
        r7 = r0 / r9;
        r2 = r2 - r7;
        r10.mCollapsedDrawX = r2;
        if (r5 == 0) goto L_0x005b;
    L_0x00e2:
        r2 = r10.mCollapsedBounds;
        r2 = r2.right;
        r2 = (float) r2;
        r0 = r2 - r0;
        r10.mCollapsedDrawX = r0;
        if (r5 == 0) goto L_0x005b;
    L_0x00ed:
        goto L_0x0054;
    L_0x00ef:
        r3 = r4;
        goto L_0x0078;
    L_0x00f1:
        r2 = r10.mExpandedBounds;
        r2 = r2.bottom;
        r2 = (float) r2;
        r10.mExpandedDrawY = r2;
        if (r5 == 0) goto L_0x00a0;
    L_0x00fa:
        r2 = r10.mExpandedBounds;
        r2 = r2.top;
        r2 = (float) r2;
        r3 = r10.mTextPaint;
        r3 = r3.ascent();
        r2 = r2 - r3;
        r10.mExpandedDrawY = r2;
        if (r5 == 0) goto L_0x00a0;
    L_0x010a:
        goto L_0x0081;
    L_0x010c:
        r0 = r10.mExpandedBounds;
        r0 = r0.centerX();
        r0 = (float) r0;
        r2 = r1 / r9;
        r0 = r0 - r2;
        r10.mExpandedDrawX = r0;
        if (r5 == 0) goto L_0x00ac;
    L_0x011a:
        r0 = r10.mExpandedBounds;
        r0 = r0.right;
        r0 = (float) r0;
        r0 = r0 - r1;
        r10.mExpandedDrawX = r0;
        if (r5 == 0) goto L_0x00ac;
    L_0x0124:
        goto L_0x00a5;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.CollapsingTextHelper.calculateBaseOffsets():void");
    }

    private Typeface readFontFamilyTypeface(int i) {
        TypedArray obtainStyledAttributes = this.mView.getContext().obtainStyledAttributes(i, new int[]{16843692});
        try {
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                Typeface create = Typeface.create(string, 0);
                return create;
            }
            obtainStyledAttributes.recycle();
            return null;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public void recalculate() {
        if (this.mView.getHeight() > 0 && this.mView.getWidth() > 0) {
            calculateBaseOffsets();
            calculateCurrentOffsets();
        }
    }

    void setText(CharSequence charSequence) {
        if (charSequence == null || !charSequence.equals(this.mText)) {
            this.mText = charSequence;
            this.mTextToDraw = null;
            clearTexture();
            recalculate();
        }
    }

    static {
        boolean z;
        if (VERSION.SDK_INT < 18) {
            z = true;
        } else {
            z = false;
        }
        USE_SCALING_TEXTURE = z;
        DEBUG_DRAW_PAINT = null;
        if (DEBUG_DRAW_PAINT != null) {
            DEBUG_DRAW_PAINT.setAntiAlias(true);
            DEBUG_DRAW_PAINT.setColor(-65281);
        }
    }

    private static boolean isClose(float f, float f2) {
        return Math.abs(f - f2) < 0.001f;
    }

    private static int blendColors(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb((int) ((((float) Color.alpha(i)) * f2) + (((float) Color.alpha(i2)) * f)), (int) ((((float) Color.red(i)) * f2) + (((float) Color.red(i2)) * f)), (int) ((((float) Color.green(i)) * f2) + (((float) Color.green(i2)) * f)), (int) ((f2 * ((float) Color.blue(i))) + (((float) Color.blue(i2)) * f)));
    }

    void setCollapsedTextGravity(int i) {
        if (this.mCollapsedTextGravity != i) {
            this.mCollapsedTextGravity = i;
            recalculate();
        }
    }

    void setExpandedTextGravity(int i) {
        if (this.mExpandedTextGravity != i) {
            this.mExpandedTextGravity = i;
            recalculate();
        }
    }

    void setCollapsedTextColor(int i) {
        if (this.mCollapsedTextColor != i) {
            this.mCollapsedTextColor = i;
            recalculate();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void draw(android.graphics.Canvas r10) {
        /*
        r9 = this;
        r2 = 0;
        r3 = android.support.design.widget.CoordinatorLayout.a;
        r7 = r10.save();
        r0 = r9.mTextToDraw;
        if (r0 == 0) goto L_0x006e;
    L_0x000b:
        r0 = r9.mDrawTitle;
        if (r0 == 0) goto L_0x006e;
    L_0x000f:
        r4 = r9.mCurrentDrawX;
        r5 = r9.mCurrentDrawY;
        r0 = r9.mUseTexture;
        if (r0 == 0) goto L_0x0072;
    L_0x0017:
        r0 = r9.mExpandedTitleTexture;
        if (r0 == 0) goto L_0x0072;
    L_0x001b:
        r0 = 1;
    L_0x001c:
        r1 = r9.mTextPaint;
        r6 = r9.mCurrentTextSize;
        r1.setTextSize(r6);
        if (r0 == 0) goto L_0x0031;
    L_0x0025:
        r1 = r9.mTextureAscent;
        r6 = r9.mScale;
        r1 = r1 * r6;
        r6 = r9.mTextureDescent;
        r8 = r9.mScale;
        r6 = r6 * r8;
        if (r3 == 0) goto L_0x0043;
    L_0x0031:
        r1 = r9.mTextPaint;
        r1 = r1.ascent();
        r6 = r9.mScale;
        r1 = r1 * r6;
        r6 = r9.mTextPaint;
        r6 = r6.descent();
        r8 = r9.mScale;
        r6 = r6 * r8;
    L_0x0043:
        if (r0 == 0) goto L_0x0046;
    L_0x0045:
        r5 = r5 + r1;
    L_0x0046:
        r1 = r9.mScale;
        r6 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1));
        if (r1 == 0) goto L_0x0055;
    L_0x004e:
        r1 = r9.mScale;
        r6 = r9.mScale;
        r10.scale(r1, r6, r4, r5);
    L_0x0055:
        if (r0 == 0) goto L_0x0060;
    L_0x0057:
        r0 = r9.mExpandedTitleTexture;
        r1 = r9.mTexturePaint;
        r10.drawBitmap(r0, r4, r5, r1);
        if (r3 == 0) goto L_0x006e;
    L_0x0060:
        r1 = r9.mTextToDraw;
        r0 = r9.mTextToDraw;
        r3 = r0.length();
        r6 = r9.mTextPaint;
        r0 = r10;
        r0.drawText(r1, r2, r3, r4, r5, r6);
    L_0x006e:
        r10.restoreToCount(r7);
        return;
    L_0x0072:
        r0 = r2;
        goto L_0x001c;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.CollapsingTextHelper.draw(android.graphics.Canvas):void");
    }

    private boolean calculateIsRtl(CharSequence charSequence) {
        TextDirectionHeuristicCompat textDirectionHeuristicCompat;
        int i = 1;
        if (ViewCompat.getLayoutDirection(this.mView) != 1) {
            i = 0;
        }
        if (i != 0) {
            textDirectionHeuristicCompat = TextDirectionHeuristicsCompat.FIRSTSTRONG_RTL;
        } else {
            textDirectionHeuristicCompat = TextDirectionHeuristicsCompat.FIRSTSTRONG_LTR;
        }
        return textDirectionHeuristicCompat.isRtl(charSequence, 0, charSequence.length());
    }

    public CollapsingTextHelper(View view) {
        this.mExpandedTextGravity = 16;
        this.mCollapsedTextGravity = 16;
        this.mExpandedTextSize = 15.0f;
        this.mCollapsedTextSize = 15.0f;
        this.mView = view;
        this.mTextPaint = new TextPaint();
        this.mTextPaint.setAntiAlias(true);
        this.mCollapsedBounds = new Rect();
        this.mExpandedBounds = new Rect();
        this.mCurrentBounds = new RectF();
    }

    void setExpandedBounds(int i, int i2, int i3, int i4) {
        if (!rectEquals(this.mExpandedBounds, i, i2, i3, i4)) {
            this.mExpandedBounds.set(i, i2, i3, i4);
            this.mBoundsChanged = true;
            onBoundsChanged();
        }
    }

    void setTypefaces(Typeface typeface) {
        this.mExpandedTypeface = typeface;
        this.mCollapsedTypeface = typeface;
        recalculate();
    }

    void setExpansionFraction(float f) {
        float constrain = MathUtils.constrain(f, 0.0f, 1.0f);
        if (constrain != this.mExpandedFraction) {
            this.mExpandedFraction = constrain;
            calculateCurrentOffsets();
        }
    }

    private void ensureExpandedTexture() {
        if (this.mExpandedTitleTexture == null && !this.mExpandedBounds.isEmpty() && !TextUtils.isEmpty(this.mTextToDraw)) {
            calculateOffsets(0.0f);
            this.mTextureAscent = this.mTextPaint.ascent();
            this.mTextureDescent = this.mTextPaint.descent();
            int round = Math.round(this.mTextPaint.measureText(this.mTextToDraw, 0, this.mTextToDraw.length()));
            int round2 = Math.round(this.mTextureDescent - this.mTextureAscent);
            if (round > 0 && round2 > 0) {
                this.mExpandedTitleTexture = Bitmap.createBitmap(round, round2, Config.ARGB_8888);
                new Canvas(this.mExpandedTitleTexture).drawText(this.mTextToDraw, 0, this.mTextToDraw.length(), 0.0f, ((float) round2) - this.mTextPaint.descent(), this.mTextPaint);
                if (this.mTexturePaint == null) {
                    this.mTexturePaint = new Paint(3);
                }
            }
        }
    }

    private static boolean rectEquals(Rect rect, int i, int i2, int i3, int i4) {
        return rect.left == i && rect.top == i2 && rect.right == i3 && rect.bottom == i4;
    }

    void onBoundsChanged() {
        boolean z;
        if (this.mCollapsedBounds.width() <= 0 || this.mCollapsedBounds.height() <= 0 || this.mExpandedBounds.width() <= 0 || this.mExpandedBounds.height() <= 0) {
            z = false;
        } else {
            z = true;
        }
        this.mDrawTitle = z;
    }

    private void setInterpolatedTextSize(float f) {
        boolean z;
        calculateUsingTextSize(f);
        if (!USE_SCALING_TEXTURE || this.mScale == 1.0f) {
            z = false;
        } else {
            z = true;
        }
        this.mUseTexture = z;
        if (this.mUseTexture) {
            ensureExpandedTexture();
        }
        ViewCompat.postInvalidateOnAnimation(this.mView);
    }

    Typeface getCollapsedTypeface() {
        return this.mCollapsedTypeface != null ? this.mCollapsedTypeface : Typeface.DEFAULT;
    }

    void setPositionInterpolator(Interpolator interpolator) {
        this.mPositionInterpolator = interpolator;
        recalculate();
    }

    int getCollapsedTextColor() {
        return this.mCollapsedTextColor;
    }

    void setTextSizeInterpolator(Interpolator interpolator) {
        this.mTextSizeInterpolator = interpolator;
        recalculate();
    }

    private void interpolateBounds(float f) {
        this.mCurrentBounds.left = lerp((float) this.mExpandedBounds.left, (float) this.mCollapsedBounds.left, f, this.mPositionInterpolator);
        this.mCurrentBounds.top = lerp(this.mExpandedDrawY, this.mCollapsedDrawY, f, this.mPositionInterpolator);
        this.mCurrentBounds.right = lerp((float) this.mExpandedBounds.right, (float) this.mCollapsedBounds.right, f, this.mPositionInterpolator);
        this.mCurrentBounds.bottom = lerp((float) this.mExpandedBounds.bottom, (float) this.mCollapsedBounds.bottom, f, this.mPositionInterpolator);
    }
}
