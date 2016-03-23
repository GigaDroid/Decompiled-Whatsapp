package android.support.design.widget;

import android.view.animation.Interpolator;

class ValueAnimatorCompat {
    private final Impl mImpl;

    interface AnimatorUpdateListener {
        void onAnimationUpdate(ValueAnimatorCompat valueAnimatorCompat);
    }

    interface AnimatorListener {
        void onAnimationCancel(ValueAnimatorCompat valueAnimatorCompat);

        void onAnimationEnd(ValueAnimatorCompat valueAnimatorCompat);

        void onAnimationStart(ValueAnimatorCompat valueAnimatorCompat);
    }

    class AnimatorListenerAdapter implements AnimatorListener {
        public void onAnimationCancel(ValueAnimatorCompat valueAnimatorCompat) {
        }

        public void onAnimationEnd(ValueAnimatorCompat valueAnimatorCompat) {
        }

        AnimatorListenerAdapter() {
        }

        public void onAnimationStart(ValueAnimatorCompat valueAnimatorCompat) {
        }
    }

    class 1 implements AnimatorUpdateListenerProxy {
        final ValueAnimatorCompat this$0;
        final AnimatorUpdateListener val$updateListener;

        public void onAnimationUpdate() {
            this.val$updateListener.onAnimationUpdate(this.this$0);
        }

        1(ValueAnimatorCompat valueAnimatorCompat, AnimatorUpdateListener animatorUpdateListener) {
            this.this$0 = valueAnimatorCompat;
            this.val$updateListener = animatorUpdateListener;
        }
    }

    class 2 implements AnimatorListenerProxy {
        final ValueAnimatorCompat this$0;
        final AnimatorListener val$listener;

        public void onAnimationStart() {
            this.val$listener.onAnimationStart(this.this$0);
        }

        public void onAnimationCancel() {
            this.val$listener.onAnimationCancel(this.this$0);
        }

        2(ValueAnimatorCompat valueAnimatorCompat, AnimatorListener animatorListener) {
            this.this$0 = valueAnimatorCompat;
            this.val$listener = animatorListener;
        }

        public void onAnimationEnd() {
            this.val$listener.onAnimationEnd(this.this$0);
        }
    }

    interface Creator {
        ValueAnimatorCompat createAnimator();
    }

    abstract class Impl {

        interface AnimatorUpdateListenerProxy {
            void onAnimationUpdate();
        }

        interface AnimatorListenerProxy {
            void onAnimationCancel();

            void onAnimationEnd();

            void onAnimationStart();
        }

        abstract void cancel();

        abstract float getAnimatedFloatValue();

        abstract float getAnimatedFraction();

        abstract int getAnimatedIntValue();

        abstract long getDuration();

        abstract boolean isRunning();

        abstract void setDuration(int i);

        abstract void setFloatValues(float f, float f2);

        abstract void setIntValues(int i, int i2);

        abstract void setInterpolator(Interpolator interpolator);

        abstract void setListener(AnimatorListenerProxy animatorListenerProxy);

        abstract void setUpdateListener(AnimatorUpdateListenerProxy animatorUpdateListenerProxy);

        abstract void start();

        Impl() {
        }
    }

    public boolean isRunning() {
        return this.mImpl.isRunning();
    }

    ValueAnimatorCompat(Impl impl) {
        this.mImpl = impl;
    }

    public int getAnimatedIntValue() {
        return this.mImpl.getAnimatedIntValue();
    }

    public void setUpdateListener(AnimatorUpdateListener animatorUpdateListener) {
        if (animatorUpdateListener != null) {
            this.mImpl.setUpdateListener(new 1(this, animatorUpdateListener));
            if (!CoordinatorLayout.a) {
                return;
            }
        }
        this.mImpl.setUpdateListener(null);
    }

    public float getAnimatedFraction() {
        return this.mImpl.getAnimatedFraction();
    }

    public long getDuration() {
        return this.mImpl.getDuration();
    }

    public void setInterpolator(Interpolator interpolator) {
        this.mImpl.setInterpolator(interpolator);
    }

    public void setFloatValues(float f, float f2) {
        this.mImpl.setFloatValues(f, f2);
    }

    public void start() {
        this.mImpl.start();
    }

    public void setDuration(int i) {
        this.mImpl.setDuration(i);
    }

    public float getAnimatedFloatValue() {
        return this.mImpl.getAnimatedFloatValue();
    }

    public void setListener(AnimatorListener animatorListener) {
        if (animatorListener != null) {
            this.mImpl.setListener(new 2(this, animatorListener));
            if (!CoordinatorLayout.a) {
                return;
            }
        }
        this.mImpl.setListener(null);
    }

    public void setIntValues(int i, int i2) {
        this.mImpl.setIntValues(i, i2);
    }

    public void cancel() {
        this.mImpl.cancel();
    }
}
