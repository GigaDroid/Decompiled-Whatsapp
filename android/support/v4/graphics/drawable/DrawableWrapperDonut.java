package android.support.v4.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.support.v4.app.FragmentTransitionCompat21.EpicenterView;
import android.support.v4.app.RemoteInputCompatBase.RemoteInput;

class DrawableWrapperDonut extends Drawable implements Callback, DrawableWrapper {
    static final Mode DEFAULT_MODE;
    private boolean mColorFilterSet;
    private int mCurrentColor;
    private Mode mCurrentMode;
    Drawable mDrawable;
    private ColorStateList mTintList;
    private Mode mTintMode;

    public int getOpacity() {
        return this.mDrawable.getOpacity();
    }

    public int getIntrinsicWidth() {
        return this.mDrawable.getIntrinsicWidth();
    }

    public int getIntrinsicHeight() {
        return this.mDrawable.getIntrinsicHeight();
    }

    public void draw(Canvas canvas) {
        this.mDrawable.draw(canvas);
    }

    public void setFilterBitmap(boolean z) {
        this.mDrawable.setFilterBitmap(z);
    }

    static {
        DEFAULT_MODE = Mode.SRC_IN;
    }

    public Region getTransparentRegion() {
        return this.mDrawable.getTransparentRegion();
    }

    protected void onBoundsChange(Rect rect) {
        this.mDrawable.setBounds(rect);
    }

    public boolean setState(int[] iArr) {
        boolean z = EpicenterView.a;
        boolean state = this.mDrawable.setState(iArr);
        if (updateTint(iArr) || state) {
            state = true;
        } else {
            state = false;
        }
        if (z) {
            RemoteInput.a++;
        }
        return state;
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    public void setTintMode(Mode mode) {
        this.mTintMode = mode;
        updateTint(getState());
    }

    protected boolean onLevelChange(int i) {
        return this.mDrawable.setLevel(i);
    }

    public int getMinimumHeight() {
        return this.mDrawable.getMinimumHeight();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.mDrawable.setColorFilter(colorFilter);
    }

    public void setAlpha(int i) {
        this.mDrawable.setAlpha(i);
    }

    public boolean isStateful() {
        return (this.mTintList != null && this.mTintList.isStateful()) || this.mDrawable.isStateful();
    }

    DrawableWrapperDonut(Drawable drawable) {
        this.mTintMode = DEFAULT_MODE;
        setWrappedDrawable(drawable);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean updateTint(int[] r6) {
        /*
        r5 = this;
        r0 = 1;
        r1 = 0;
        r2 = r5.mTintList;
        if (r2 == 0) goto L_0x0032;
    L_0x0006:
        r2 = r5.mTintMode;
        if (r2 == 0) goto L_0x0032;
    L_0x000a:
        r2 = r5.mTintList;
        r3 = r5.mTintList;
        r3 = r3.getDefaultColor();
        r2 = r2.getColorForState(r6, r3);
        r3 = r5.mTintMode;
        r4 = r5.mColorFilterSet;
        if (r4 == 0) goto L_0x0024;
    L_0x001c:
        r4 = r5.mCurrentColor;
        if (r2 != r4) goto L_0x0024;
    L_0x0020:
        r4 = r5.mCurrentMode;
        if (r3 == r4) goto L_0x002e;
    L_0x0024:
        r5.setColorFilter(r2, r3);
        r5.mCurrentColor = r2;
        r5.mCurrentMode = r3;
        r5.mColorFilterSet = r0;
    L_0x002d:
        return r0;
    L_0x002e:
        r0 = android.support.v4.app.FragmentTransitionCompat21.EpicenterView.a;
        if (r0 == 0) goto L_0x0037;
    L_0x0032:
        r5.mColorFilterSet = r1;
        r5.clearColorFilter();
    L_0x0037:
        r0 = r1;
        goto L_0x002d;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.graphics.drawable.DrawableWrapperDonut.updateTint(int[]):boolean");
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.mDrawable.setVisible(z, z2);
    }

    public int[] getState() {
        return this.mDrawable.getState();
    }

    public void setTintList(ColorStateList colorStateList) {
        this.mTintList = colorStateList;
        updateTint(getState());
    }

    public Drawable getWrappedDrawable() {
        return this.mDrawable;
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void setDither(boolean z) {
        this.mDrawable.setDither(z);
    }

    public Drawable mutate() {
        Drawable drawable = this.mDrawable;
        Drawable mutate = drawable.mutate();
        if (mutate != drawable) {
            setWrappedDrawable(mutate);
        }
        return this;
    }

    public void setChangingConfigurations(int i) {
        this.mDrawable.setChangingConfigurations(i);
    }

    public Drawable getCurrent() {
        return this.mDrawable.getCurrent();
    }

    public int getChangingConfigurations() {
        return this.mDrawable.getChangingConfigurations();
    }

    public int getMinimumWidth() {
        return this.mDrawable.getMinimumWidth();
    }

    public boolean getPadding(Rect rect) {
        return this.mDrawable.getPadding(rect);
    }

    public void setWrappedDrawable(Drawable drawable) {
        boolean z = EpicenterView.a;
        if (this.mDrawable != null) {
            this.mDrawable.setCallback(null);
        }
        this.mDrawable = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        invalidateSelf();
        if (RemoteInput.a != 0) {
            EpicenterView.a = !z;
        }
    }
}
