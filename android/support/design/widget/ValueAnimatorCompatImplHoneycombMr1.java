package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.animation.Interpolator;

class ValueAnimatorCompatImplHoneycombMr1 extends Impl {
    final ValueAnimator mValueAnimator;

    class 1 implements AnimatorUpdateListener {
        final ValueAnimatorCompatImplHoneycombMr1 this$0;
        final AnimatorUpdateListenerProxy val$updateListener;

        1(ValueAnimatorCompatImplHoneycombMr1 valueAnimatorCompatImplHoneycombMr1, AnimatorUpdateListenerProxy animatorUpdateListenerProxy) {
            this.this$0 = valueAnimatorCompatImplHoneycombMr1;
            this.val$updateListener = animatorUpdateListenerProxy;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.val$updateListener.onAnimationUpdate();
        }
    }

    class 2 extends AnimatorListenerAdapter {
        final ValueAnimatorCompatImplHoneycombMr1 this$0;
        final AnimatorListenerProxy val$listener;

        public void onAnimationCancel(Animator animator) {
            this.val$listener.onAnimationCancel();
        }

        2(ValueAnimatorCompatImplHoneycombMr1 valueAnimatorCompatImplHoneycombMr1, AnimatorListenerProxy animatorListenerProxy) {
            this.this$0 = valueAnimatorCompatImplHoneycombMr1;
            this.val$listener = animatorListenerProxy;
        }

        public void onAnimationEnd(Animator animator) {
            this.val$listener.onAnimationEnd();
        }

        public void onAnimationStart(Animator animator) {
            this.val$listener.onAnimationStart();
        }
    }

    public void cancel() {
        this.mValueAnimator.cancel();
    }

    public float getAnimatedFraction() {
        return this.mValueAnimator.getAnimatedFraction();
    }

    public float getAnimatedFloatValue() {
        return ((Float) this.mValueAnimator.getAnimatedValue()).floatValue();
    }

    public void start() {
        this.mValueAnimator.start();
    }

    public void setDuration(int i) {
        this.mValueAnimator.setDuration((long) i);
    }

    public boolean isRunning() {
        return this.mValueAnimator.isRunning();
    }

    public void setFloatValues(float f, float f2) {
        this.mValueAnimator.setFloatValues(new float[]{f, f2});
    }

    public int getAnimatedIntValue() {
        return ((Integer) this.mValueAnimator.getAnimatedValue()).intValue();
    }

    public void setIntValues(int i, int i2) {
        this.mValueAnimator.setIntValues(new int[]{i, i2});
    }

    public long getDuration() {
        return this.mValueAnimator.getDuration();
    }

    ValueAnimatorCompatImplHoneycombMr1() {
        this.mValueAnimator = new ValueAnimator();
    }

    public void setUpdateListener(AnimatorUpdateListenerProxy animatorUpdateListenerProxy) {
        this.mValueAnimator.addUpdateListener(new 1(this, animatorUpdateListenerProxy));
    }

    public void setInterpolator(Interpolator interpolator) {
        this.mValueAnimator.setInterpolator(interpolator);
    }

    public void setListener(AnimatorListenerProxy animatorListenerProxy) {
        this.mValueAnimator.addListener(new 2(this, animatorListenerProxy));
    }
}
