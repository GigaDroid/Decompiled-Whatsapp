package android.support.v4.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.animation.Interpolator;

class ViewPropertyAnimatorCompatICS {

    final class 1 extends AnimatorListenerAdapter {
        final ViewPropertyAnimatorListener val$listener;
        final View val$view;

        public void onAnimationEnd(Animator animator) {
            this.val$listener.onAnimationEnd(this.val$view);
        }

        1(ViewPropertyAnimatorListener viewPropertyAnimatorListener, View view) {
            this.val$listener = viewPropertyAnimatorListener;
            this.val$view = view;
        }

        public void onAnimationStart(Animator animator) {
            this.val$listener.onAnimationStart(this.val$view);
        }

        public void onAnimationCancel(Animator animator) {
            this.val$listener.onAnimationCancel(this.val$view);
        }
    }

    public static void cancel(View view) {
        view.animate().cancel();
    }

    public static void translationX(View view, float f) {
        view.animate().translationX(f);
    }

    public static void start(View view) {
        view.animate().start();
    }

    public static void setStartDelay(View view, long j) {
        view.animate().setStartDelay(j);
    }

    public static long getDuration(View view) {
        return view.animate().getDuration();
    }

    public static void alpha(View view, float f) {
        view.animate().alpha(f);
    }

    public static void setDuration(View view, long j) {
        view.animate().setDuration(j);
    }

    public static void setListener(View view, ViewPropertyAnimatorListener viewPropertyAnimatorListener) {
        if (viewPropertyAnimatorListener != null) {
            view.animate().setListener(new 1(viewPropertyAnimatorListener, view));
            if (WindowInsetsCompat.a == 0) {
                return;
            }
        }
        view.animate().setListener(null);
    }

    public static void translationY(View view, float f) {
        view.animate().translationY(f);
    }

    public static void setInterpolator(View view, Interpolator interpolator) {
        view.animate().setInterpolator(interpolator);
    }
}
