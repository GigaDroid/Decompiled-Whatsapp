package android.support.design.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.design.R;
import android.support.design.widget.CoordinatorLayout.Behavior;
import android.support.v7.widget.LinearLayoutCompat;
import android.util.AttributeSet;

public class ForegroundLinearLayout extends LinearLayoutCompat {
    private Drawable mForeground;
    boolean mForegroundBoundsChanged;
    private int mForegroundGravity;
    protected boolean mForegroundInPadding;
    private final Rect mOverlayBounds;
    private final Rect mSelfBounds;

    public void setForegroundGravity(int i) {
        if (this.mForegroundGravity != i) {
            int i2;
            if ((8388615 & i) == 0) {
                i2 = 8388611 | i;
            } else {
                i2 = i;
            }
            if ((i2 & 112) == 0) {
                i2 |= 48;
            }
            this.mForegroundGravity = i2;
            if (this.mForegroundGravity == 119 && this.mForeground != null) {
                this.mForeground.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    public Drawable getForeground() {
        return this.mForeground;
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.mForegroundBoundsChanged |= z;
    }

    public ForegroundLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.mForeground != null && this.mForeground.isStateful()) {
            this.mForeground.setState(getDrawableState());
        }
    }

    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.mForeground;
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.mForegroundBoundsChanged = true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setForeground(android.graphics.drawable.Drawable r3) {
        /*
        r2 = this;
        r0 = r2.mForeground;
        if (r0 == r3) goto L_0x0047;
    L_0x0004:
        r0 = r2.mForeground;
        if (r0 == 0) goto L_0x0013;
    L_0x0008:
        r0 = r2.mForeground;
        r1 = 0;
        r0.setCallback(r1);
        r0 = r2.mForeground;
        r2.unscheduleDrawable(r0);
    L_0x0013:
        r2.mForeground = r3;
        if (r3 == 0) goto L_0x003d;
    L_0x0017:
        r0 = 0;
        r2.setWillNotDraw(r0);
        r3.setCallback(r2);
        r0 = r3.isStateful();
        if (r0 == 0) goto L_0x002b;
    L_0x0024:
        r0 = r2.getDrawableState();
        r3.setState(r0);
    L_0x002b:
        r0 = r2.mForegroundGravity;
        r1 = 119; // 0x77 float:1.67E-43 double:5.9E-322;
        if (r0 != r1) goto L_0x0041;
    L_0x0031:
        r0 = new android.graphics.Rect;
        r0.<init>();
        r3.getPadding(r0);
        r0 = android.support.design.internal.NavigationMenuPresenter.a;
        if (r0 == 0) goto L_0x0041;
    L_0x003d:
        r0 = 1;
        r2.setWillNotDraw(r0);
    L_0x0041:
        r2.requestLayout();
        r2.invalidate();
    L_0x0047:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.internal.ForegroundLinearLayout.setForeground(android.graphics.drawable.Drawable):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void draw(@android.support.annotation.NonNull android.graphics.Canvas r9) {
        /*
        r8 = this;
        r6 = 0;
        super.draw(r9);
        r0 = r8.mForeground;
        if (r0 == 0) goto L_0x0059;
    L_0x0008:
        r0 = r8.mForeground;
        r1 = r8.mForegroundBoundsChanged;
        if (r1 == 0) goto L_0x0056;
    L_0x000e:
        r8.mForegroundBoundsChanged = r6;
        r1 = r8.mSelfBounds;
        r2 = r8.mOverlayBounds;
        r3 = r8.getRight();
        r4 = r8.getLeft();
        r3 = r3 - r4;
        r4 = r8.getBottom();
        r5 = r8.getTop();
        r4 = r4 - r5;
        r5 = r8.mForegroundInPadding;
        if (r5 == 0) goto L_0x0031;
    L_0x002a:
        r1.set(r6, r6, r3, r4);
        r5 = android.support.design.internal.NavigationMenuPresenter.a;
        if (r5 == 0) goto L_0x0046;
    L_0x0031:
        r5 = r8.getPaddingLeft();
        r6 = r8.getPaddingTop();
        r7 = r8.getPaddingRight();
        r3 = r3 - r7;
        r7 = r8.getPaddingBottom();
        r4 = r4 - r7;
        r1.set(r5, r6, r3, r4);
    L_0x0046:
        r3 = r8.mForegroundGravity;
        r4 = r0.getIntrinsicWidth();
        r5 = r0.getIntrinsicHeight();
        android.view.Gravity.apply(r3, r4, r5, r1, r2);
        r0.setBounds(r2);
    L_0x0056:
        r0.draw(r9);
    L_0x0059:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.internal.ForegroundLinearLayout.draw(android.graphics.Canvas):void");
    }

    public ForegroundLinearLayout(Context context, AttributeSet attributeSet, int i) {
        int i2 = NavigationMenuPresenter.a;
        super(context, attributeSet, i);
        this.mSelfBounds = new Rect();
        this.mOverlayBounds = new Rect();
        this.mForegroundGravity = 119;
        this.mForegroundInPadding = true;
        this.mForegroundBoundsChanged = false;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ForegroundLinearLayout, i, 0);
        this.mForegroundGravity = obtainStyledAttributes.getInt(R.styleable.ForegroundLinearLayout_android_foregroundGravity, this.mForegroundGravity);
        Drawable drawable = obtainStyledAttributes.getDrawable(R.styleable.ForegroundLinearLayout_android_foreground);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.mForegroundInPadding = obtainStyledAttributes.getBoolean(R.styleable.ForegroundLinearLayout_foregroundInsidePadding, true);
        obtainStyledAttributes.recycle();
        if (i2 != 0) {
            Behavior.a++;
        }
    }

    public ForegroundLinearLayout(Context context) {
        super(context);
        this.mSelfBounds = new Rect();
        this.mOverlayBounds = new Rect();
        this.mForegroundGravity = 119;
        this.mForegroundInPadding = true;
        this.mForegroundBoundsChanged = false;
    }

    public void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        if (this.mForeground != null) {
            this.mForeground.setHotspot(f, f2);
        }
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        if (this.mForeground != null) {
            this.mForeground.jumpToCurrentState();
        }
    }

    public int getForegroundGravity() {
        return this.mForegroundGravity;
    }
}
