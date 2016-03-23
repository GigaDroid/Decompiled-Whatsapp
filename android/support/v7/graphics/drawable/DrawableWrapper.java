package android.support.v7.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v7.app.AppCompatActivity;

public class DrawableWrapper extends Drawable implements Callback {
    public static int a;
    private Drawable mDrawable;

    public void setDither(boolean z) {
        this.mDrawable.setDither(z);
    }

    public int[] getState() {
        return this.mDrawable.getState();
    }

    protected void onBoundsChange(Rect rect) {
        this.mDrawable.setBounds(rect);
    }

    public DrawableWrapper(Drawable drawable) {
        setWrappedDrawable(drawable);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.mDrawable.setColorFilter(colorFilter);
    }

    public void setAutoMirrored(boolean z) {
        DrawableCompat.setAutoMirrored(this.mDrawable, z);
    }

    public int getIntrinsicHeight() {
        return this.mDrawable.getIntrinsicHeight();
    }

    public void setFilterBitmap(boolean z) {
        this.mDrawable.setFilterBitmap(z);
    }

    public Drawable getWrappedDrawable() {
        return this.mDrawable;
    }

    public void setHotspot(float f, float f2) {
        DrawableCompat.setHotspot(this.mDrawable, f, f2);
    }

    public void setAlpha(int i) {
        this.mDrawable.setAlpha(i);
    }

    public void setTint(int i) {
        DrawableCompat.setTint(this.mDrawable, i);
    }

    public void jumpToCurrentState() {
        DrawableCompat.jumpToCurrentState(this.mDrawable);
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    protected boolean onLevelChange(int i) {
        return this.mDrawable.setLevel(i);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    public int getOpacity() {
        return this.mDrawable.getOpacity();
    }

    public int getMinimumHeight() {
        return this.mDrawable.getMinimumHeight();
    }

    public void draw(Canvas canvas) {
        this.mDrawable.draw(canvas);
    }

    public int getChangingConfigurations() {
        return this.mDrawable.getChangingConfigurations();
    }

    public boolean isStateful() {
        return this.mDrawable.isStateful();
    }

    public int getIntrinsicWidth() {
        return this.mDrawable.getIntrinsicWidth();
    }

    public void setTintList(ColorStateList colorStateList) {
        DrawableCompat.setTintList(this.mDrawable, colorStateList);
    }

    public int getMinimumWidth() {
        return this.mDrawable.getMinimumWidth();
    }

    public boolean getPadding(Rect rect) {
        return this.mDrawable.getPadding(rect);
    }

    public boolean setState(int[] iArr) {
        return this.mDrawable.setState(iArr);
    }

    public Region getTransparentRegion() {
        return this.mDrawable.getTransparentRegion();
    }

    public void setWrappedDrawable(Drawable drawable) {
        int i = a;
        if (this.mDrawable != null) {
            this.mDrawable.setCallback(null);
        }
        this.mDrawable = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        if (i != 0) {
            AppCompatActivity.b++;
        }
    }

    public void setChangingConfigurations(int i) {
        this.mDrawable.setChangingConfigurations(i);
    }

    public Drawable getCurrent() {
        return this.mDrawable.getCurrent();
    }

    public void setTintMode(Mode mode) {
        DrawableCompat.setTintMode(this.mDrawable, mode);
    }

    public boolean isAutoMirrored() {
        return DrawableCompat.isAutoMirrored(this.mDrawable);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public boolean setVisible(boolean z, boolean z2) {
        int i = a;
        boolean z3 = super.setVisible(z, z2) || this.mDrawable.setVisible(z, z2);
        if (AppCompatActivity.b != 0) {
            a = i + 1;
        }
        return z3;
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        DrawableCompat.setHotspotBounds(this.mDrawable, i, i2, i3, i4);
    }
}
