package android.support.design.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.support.annotation.Nullable;
import android.support.design.R;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;

class FloatingActionButtonEclairMr1 extends FloatingActionButtonImpl {
    private int mAnimationDuration;
    CircularBorderDrawable mBorderDrawable;
    private float mElevation;
    private boolean mIsHiding;
    private float mPressedTranslationZ;
    Drawable mRippleDrawable;
    ShadowDrawableWrapper mShadowDrawable;
    Drawable mShapeDrawable;
    private StateListAnimator mStateListAnimator;

    class 1 extends AnimationListenerAdapter {
        final FloatingActionButtonEclairMr1 this$0;
        final InternalVisibilityChangedListener val$listener;

        public void onAnimationEnd(Animation animation) {
            FloatingActionButtonEclairMr1.access$202(this.this$0, false);
            this.this$0.mView.setVisibility(8);
            if (this.val$listener != null) {
                this.val$listener.onHidden();
            }
        }

        public void onAnimationStart(Animation animation) {
            FloatingActionButtonEclairMr1.access$202(this.this$0, true);
        }

        1(FloatingActionButtonEclairMr1 floatingActionButtonEclairMr1, InternalVisibilityChangedListener internalVisibilityChangedListener) {
            this.this$0 = floatingActionButtonEclairMr1;
            this.val$listener = internalVisibilityChangedListener;
        }
    }

    class 2 extends AnimationListenerAdapter {
        final FloatingActionButtonEclairMr1 this$0;
        final InternalVisibilityChangedListener val$listener;

        2(FloatingActionButtonEclairMr1 floatingActionButtonEclairMr1, InternalVisibilityChangedListener internalVisibilityChangedListener) {
            this.this$0 = floatingActionButtonEclairMr1;
            this.val$listener = internalVisibilityChangedListener;
        }

        public void onAnimationEnd(Animation animation) {
            if (this.val$listener != null) {
                this.val$listener.onShown();
            }
        }
    }

    abstract class BaseShadowAnimation extends Animation {
        private float mShadowSizeDiff;
        private float mShadowSizeStart;
        final FloatingActionButtonEclairMr1 this$0;

        protected abstract float getTargetShadowSize();

        private BaseShadowAnimation(FloatingActionButtonEclairMr1 floatingActionButtonEclairMr1) {
            this.this$0 = floatingActionButtonEclairMr1;
        }

        BaseShadowAnimation(FloatingActionButtonEclairMr1 floatingActionButtonEclairMr1, 1 1) {
            this(floatingActionButtonEclairMr1);
        }

        public void reset() {
            super.reset();
            this.mShadowSizeStart = this.this$0.mShadowDrawable.getShadowSize();
            this.mShadowSizeDiff = getTargetShadowSize() - this.mShadowSizeStart;
        }

        protected void applyTransformation(float f, Transformation transformation) {
            this.this$0.mShadowDrawable.setShadowSize(this.mShadowSizeStart + (this.mShadowSizeDiff * f));
        }
    }

    class ElevateToTranslationZAnimation extends BaseShadowAnimation {
        final FloatingActionButtonEclairMr1 this$0;

        private ElevateToTranslationZAnimation(FloatingActionButtonEclairMr1 floatingActionButtonEclairMr1) {
            this.this$0 = floatingActionButtonEclairMr1;
            super(floatingActionButtonEclairMr1, null);
        }

        protected float getTargetShadowSize() {
            return FloatingActionButtonEclairMr1.access$400(this.this$0) + FloatingActionButtonEclairMr1.access$500(this.this$0);
        }

        ElevateToTranslationZAnimation(FloatingActionButtonEclairMr1 floatingActionButtonEclairMr1, 1 1) {
            this(floatingActionButtonEclairMr1);
        }
    }

    class ResetElevationAnimation extends BaseShadowAnimation {
        final FloatingActionButtonEclairMr1 this$0;

        private ResetElevationAnimation(FloatingActionButtonEclairMr1 floatingActionButtonEclairMr1) {
            this.this$0 = floatingActionButtonEclairMr1;
            super(floatingActionButtonEclairMr1, null);
        }

        ResetElevationAnimation(FloatingActionButtonEclairMr1 floatingActionButtonEclairMr1, 1 1) {
            this(floatingActionButtonEclairMr1);
        }

        protected float getTargetShadowSize() {
            return FloatingActionButtonEclairMr1.access$400(this.this$0);
        }
    }

    private static ColorStateList createColorStateList(int i) {
        r0 = new int[3][];
        int[] iArr = new int[]{FOCUSED_ENABLED_STATE_SET, i, PRESSED_ENABLED_STATE_SET};
        iArr[1] = i;
        r0[2] = new int[0];
        iArr[2] = 0;
        return new ColorStateList(r0, iArr);
    }

    void onDrawableStateChanged(int[] iArr) {
        this.mStateListAnimator.setState(iArr);
    }

    private void updatePadding() {
        Rect rect = new Rect();
        this.mShadowDrawable.getPadding(rect);
        this.mShadowViewDelegate.setShadowPadding(rect.left, rect.top, rect.right, rect.bottom);
    }

    static float access$400(FloatingActionButtonEclairMr1 floatingActionButtonEclairMr1) {
        return floatingActionButtonEclairMr1.mElevation;
    }

    void setPressedTranslationZ(float f) {
        if (this.mPressedTranslationZ != f && this.mShadowDrawable != null) {
            this.mPressedTranslationZ = f;
            this.mShadowDrawable.setMaxShadowSize(this.mElevation + f);
            updatePadding();
        }
    }

    void hide(@Nullable InternalVisibilityChangedListener internalVisibilityChangedListener) {
        if (!this.mIsHiding && this.mView.getVisibility() == 0) {
            Animation loadAnimation = AnimationUtils.loadAnimation(this.mView.getContext(), R.anim.design_fab_out);
            loadAnimation.setInterpolator(AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
            loadAnimation.setDuration(200);
            loadAnimation.setAnimationListener(new 1(this, internalVisibilityChangedListener));
            this.mView.startAnimation(loadAnimation);
        } else if (internalVisibilityChangedListener != null) {
            internalVisibilityChangedListener.onHidden();
        }
    }

    static boolean access$202(FloatingActionButtonEclairMr1 floatingActionButtonEclairMr1, boolean z) {
        floatingActionButtonEclairMr1.mIsHiding = z;
        return z;
    }

    void setBackgroundDrawable(ColorStateList colorStateList, Mode mode, int i, int i2) {
        Drawable[] drawableArr;
        this.mShapeDrawable = DrawableCompat.wrap(createShapeDrawable());
        DrawableCompat.setTintList(this.mShapeDrawable, colorStateList);
        if (mode != null) {
            DrawableCompat.setTintMode(this.mShapeDrawable, mode);
        }
        this.mRippleDrawable = DrawableCompat.wrap(createShapeDrawable());
        DrawableCompat.setTintList(this.mRippleDrawable, createColorStateList(i));
        DrawableCompat.setTintMode(this.mRippleDrawable, Mode.MULTIPLY);
        if (i2 > 0) {
            this.mBorderDrawable = createBorderDrawable(i2, colorStateList);
            Drawable[] drawableArr2 = new Drawable[]{this.mBorderDrawable, this.mShapeDrawable, this.mRippleDrawable};
            if (!CoordinatorLayout.a) {
                drawableArr = drawableArr2;
                this.mShadowDrawable = new ShadowDrawableWrapper(this.mView.getResources(), new LayerDrawable(drawableArr), this.mShadowViewDelegate.getRadius(), this.mElevation, this.mElevation + this.mPressedTranslationZ);
                this.mShadowDrawable.setAddPaddingForCorners(false);
                this.mShadowViewDelegate.setBackgroundDrawable(this.mShadowDrawable);
                updatePadding();
            }
        }
        this.mBorderDrawable = null;
        drawableArr = new Drawable[]{this.mShapeDrawable, this.mRippleDrawable};
        this.mShadowDrawable = new ShadowDrawableWrapper(this.mView.getResources(), new LayerDrawable(drawableArr), this.mShadowViewDelegate.getRadius(), this.mElevation, this.mElevation + this.mPressedTranslationZ);
        this.mShadowDrawable.setAddPaddingForCorners(false);
        this.mShadowViewDelegate.setBackgroundDrawable(this.mShadowDrawable);
        updatePadding();
    }

    void show(@Nullable InternalVisibilityChangedListener internalVisibilityChangedListener) {
        if (this.mView.getVisibility() != 0 || this.mIsHiding) {
            this.mView.clearAnimation();
            this.mView.setVisibility(0);
            Animation loadAnimation = AnimationUtils.loadAnimation(this.mView.getContext(), R.anim.design_fab_in);
            loadAnimation.setDuration(200);
            loadAnimation.setInterpolator(AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
            loadAnimation.setAnimationListener(new 2(this, internalVisibilityChangedListener));
            this.mView.startAnimation(loadAnimation);
            if (!CoordinatorLayout.a) {
                return;
            }
        }
        if (internalVisibilityChangedListener != null) {
            internalVisibilityChangedListener.onShown();
        }
    }

    FloatingActionButtonEclairMr1(View view, ShadowViewDelegate shadowViewDelegate) {
        super(view, shadowViewDelegate);
        this.mAnimationDuration = view.getResources().getInteger(17694720);
        this.mStateListAnimator = new StateListAnimator();
        this.mStateListAnimator.setTarget(view);
        this.mStateListAnimator.addState(PRESSED_ENABLED_STATE_SET, setupAnimation(new ElevateToTranslationZAnimation(this, null)));
        this.mStateListAnimator.addState(FOCUSED_ENABLED_STATE_SET, setupAnimation(new ElevateToTranslationZAnimation(this, null)));
        this.mStateListAnimator.addState(EMPTY_STATE_SET, setupAnimation(new ResetElevationAnimation(this, null)));
    }

    void setBackgroundTintList(ColorStateList colorStateList) {
        DrawableCompat.setTintList(this.mShapeDrawable, colorStateList);
        if (this.mBorderDrawable != null) {
            this.mBorderDrawable.setBorderTint(colorStateList);
        }
    }

    static float access$500(FloatingActionButtonEclairMr1 floatingActionButtonEclairMr1) {
        return floatingActionButtonEclairMr1.mPressedTranslationZ;
    }

    void jumpDrawableToCurrentState() {
        this.mStateListAnimator.jumpToCurrentState();
    }

    void setElevation(float f) {
        if (this.mElevation != f && this.mShadowDrawable != null) {
            this.mShadowDrawable.setShadowSize(f, this.mPressedTranslationZ + f);
            this.mElevation = f;
            updatePadding();
        }
    }

    void setBackgroundTintMode(Mode mode) {
        DrawableCompat.setTintMode(this.mShapeDrawable, mode);
    }

    private Animation setupAnimation(Animation animation) {
        animation.setInterpolator(AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
        animation.setDuration((long) this.mAnimationDuration);
        return animation;
    }
}
