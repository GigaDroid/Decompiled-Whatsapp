package android.support.v7.widget;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.v4.view.ViewCompat;
import android.support.v7.appcompat.R;
import android.support.v7.graphics.drawable.DrawableUtils;
import android.util.AttributeSet;
import android.view.View;

class AppCompatBackgroundHelper {
    private TintInfo mBackgroundTint;
    private TintInfo mInternalBackgroundTint;
    private final TintManager mTintManager;
    private final View mView;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void setInternalBackgroundTint(android.content.res.ColorStateList r3) {
        /*
        r2 = this;
        if (r3 == 0) goto L_0x001a;
    L_0x0002:
        r0 = r2.mInternalBackgroundTint;
        if (r0 != 0) goto L_0x000d;
    L_0x0006:
        r0 = new android.support.v7.widget.TintInfo;
        r0.<init>();
        r2.mInternalBackgroundTint = r0;
    L_0x000d:
        r0 = r2.mInternalBackgroundTint;
        r0.mTintList = r3;
        r0 = r2.mInternalBackgroundTint;
        r1 = 1;
        r0.mHasTintList = r1;
        r0 = android.support.v7.widget.LinearLayoutCompat.a;
        if (r0 == 0) goto L_0x001d;
    L_0x001a:
        r0 = 0;
        r2.mInternalBackgroundTint = r0;
    L_0x001d:
        r2.applySupportBackgroundTint();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.AppCompatBackgroundHelper.setInternalBackgroundTint(android.content.res.ColorStateList):void");
    }

    void applySupportBackgroundTint() {
        Drawable background = this.mView.getBackground();
        if (background != null) {
            if (this.mBackgroundTint != null) {
                TintManager.tintDrawable(background, this.mBackgroundTint, this.mView.getDrawableState());
                if (!LinearLayoutCompat.a) {
                    return;
                }
            }
            if (this.mInternalBackgroundTint != null) {
                TintManager.tintDrawable(background, this.mInternalBackgroundTint, this.mView.getDrawableState());
            }
        }
    }

    AppCompatBackgroundHelper(View view, TintManager tintManager) {
        this.mView = view;
        this.mTintManager = tintManager;
    }

    void setSupportBackgroundTintMode(Mode mode) {
        if (this.mBackgroundTint == null) {
            this.mBackgroundTint = new TintInfo();
        }
        this.mBackgroundTint.mTintMode = mode;
        this.mBackgroundTint.mHasTintMode = true;
        applySupportBackgroundTint();
    }

    void loadFromAttributes(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.mView.getContext().obtainStyledAttributes(attributeSet, R.styleable.ViewBackgroundHelper, i, 0);
        try {
            if (obtainStyledAttributes.hasValue(R.styleable.ViewBackgroundHelper_android_background)) {
                ColorStateList tintList = this.mTintManager.getTintList(obtainStyledAttributes.getResourceId(R.styleable.ViewBackgroundHelper_android_background, -1));
                if (tintList != null) {
                    setInternalBackgroundTint(tintList);
                }
            }
            if (obtainStyledAttributes.hasValue(R.styleable.ViewBackgroundHelper_backgroundTint)) {
                ViewCompat.setBackgroundTintList(this.mView, obtainStyledAttributes.getColorStateList(R.styleable.ViewBackgroundHelper_backgroundTint));
            }
            if (obtainStyledAttributes.hasValue(R.styleable.ViewBackgroundHelper_backgroundTintMode)) {
                ViewCompat.setBackgroundTintMode(this.mView, DrawableUtils.parseTintMode(obtainStyledAttributes.getInt(R.styleable.ViewBackgroundHelper_backgroundTintMode, -1), null));
            }
            obtainStyledAttributes.recycle();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
        }
    }

    void onSetBackgroundResource(int i) {
        ColorStateList tintList;
        if (this.mTintManager != null) {
            tintList = this.mTintManager.getTintList(i);
        } else {
            tintList = null;
        }
        setInternalBackgroundTint(tintList);
    }

    void onSetBackgroundDrawable(Drawable drawable) {
        setInternalBackgroundTint(null);
    }

    void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (this.mBackgroundTint == null) {
            this.mBackgroundTint = new TintInfo();
        }
        this.mBackgroundTint.mTintList = colorStateList;
        this.mBackgroundTint.mHasTintList = true;
        applySupportBackgroundTint();
    }
}
