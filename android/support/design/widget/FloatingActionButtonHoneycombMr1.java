package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewCompat;
import android.view.View;

class FloatingActionButtonHoneycombMr1 extends FloatingActionButtonEclairMr1 {
    private boolean mIsHiding;

    class 1 extends AnimatorListenerAdapter {
        final FloatingActionButtonHoneycombMr1 this$0;
        final InternalVisibilityChangedListener val$listener;

        public void onAnimationCancel(Animator animator) {
            FloatingActionButtonHoneycombMr1.access$002(this.this$0, false);
        }

        public void onAnimationEnd(Animator animator) {
            FloatingActionButtonHoneycombMr1.access$002(this.this$0, false);
            this.this$0.mView.setVisibility(8);
            if (this.val$listener != null) {
                this.val$listener.onHidden();
            }
        }

        public void onAnimationStart(Animator animator) {
            FloatingActionButtonHoneycombMr1.access$002(this.this$0, true);
            this.this$0.mView.setVisibility(0);
        }

        1(FloatingActionButtonHoneycombMr1 floatingActionButtonHoneycombMr1, InternalVisibilityChangedListener internalVisibilityChangedListener) {
            this.this$0 = floatingActionButtonHoneycombMr1;
            this.val$listener = internalVisibilityChangedListener;
        }
    }

    class 2 extends AnimatorListenerAdapter {
        final FloatingActionButtonHoneycombMr1 this$0;
        final InternalVisibilityChangedListener val$listener;

        public void onAnimationStart(Animator animator) {
            this.this$0.mView.setVisibility(0);
        }

        2(FloatingActionButtonHoneycombMr1 floatingActionButtonHoneycombMr1, InternalVisibilityChangedListener internalVisibilityChangedListener) {
            this.this$0 = floatingActionButtonHoneycombMr1;
            this.val$listener = internalVisibilityChangedListener;
        }

        public void onAnimationEnd(Animator animator) {
            if (this.val$listener != null) {
                this.val$listener.onShown();
            }
        }
    }

    void onPreDraw() {
        updateFromViewRotation(this.mView.getRotation());
    }

    boolean requirePreDrawListener() {
        return true;
    }

    void show(@Nullable InternalVisibilityChangedListener internalVisibilityChangedListener) {
        if (this.mView.getVisibility() != 0) {
            if (ViewCompat.isLaidOut(this.mView) && !this.mView.isInEditMode()) {
                this.mView.setAlpha(0.0f);
                this.mView.setScaleY(0.0f);
                this.mView.setScaleX(0.0f);
                this.mView.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(200).setInterpolator(AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR).setListener(new 2(this, internalVisibilityChangedListener));
                if (!CoordinatorLayout.a) {
                    return;
                }
            }
            this.mView.setVisibility(0);
            this.mView.setAlpha(1.0f);
            this.mView.setScaleY(1.0f);
            this.mView.setScaleX(1.0f);
            if (internalVisibilityChangedListener != null) {
                internalVisibilityChangedListener.onShown();
            }
        }
    }

    FloatingActionButtonHoneycombMr1(View view, ShadowViewDelegate shadowViewDelegate) {
        super(view, shadowViewDelegate);
    }

    private void updateFromViewRotation(float f) {
        if (this.mShadowDrawable != null) {
            this.mShadowDrawable.setRotation(-f);
        }
        if (this.mBorderDrawable != null) {
            this.mBorderDrawable.setRotation(-f);
        }
    }

    static boolean access$002(FloatingActionButtonHoneycombMr1 floatingActionButtonHoneycombMr1, boolean z) {
        floatingActionButtonHoneycombMr1.mIsHiding = z;
        return z;
    }

    void hide(@Nullable InternalVisibilityChangedListener internalVisibilityChangedListener) {
        if (!this.mIsHiding && this.mView.getVisibility() == 0) {
            if (!ViewCompat.isLaidOut(this.mView) || this.mView.isInEditMode()) {
                this.mView.setVisibility(8);
                if (internalVisibilityChangedListener != null) {
                    internalVisibilityChangedListener.onHidden();
                    if (!CoordinatorLayout.a) {
                        return;
                    }
                }
                return;
            }
            this.mView.animate().scaleX(0.0f).scaleY(0.0f).alpha(0.0f).setDuration(200).setInterpolator(AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR).setListener(new 1(this, internalVisibilityChangedListener));
        } else if (internalVisibilityChangedListener != null) {
            internalVisibilityChangedListener.onHidden();
        }
    }
}
