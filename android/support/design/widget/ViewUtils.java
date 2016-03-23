package android.support.design.widget;

import android.os.Build.VERSION;
import android.view.View;

class ViewUtils {
    static final Creator DEFAULT_ANIMATOR_CREATOR;
    private static final ViewUtilsImpl IMPL;

    final class 1 implements Creator {
        public ValueAnimatorCompat createAnimator() {
            return new ValueAnimatorCompat(VERSION.SDK_INT >= 12 ? new ValueAnimatorCompatImplHoneycombMr1() : new ValueAnimatorCompatImplEclairMr1());
        }

        1() {
        }
    }

    interface ViewUtilsImpl {
        void setBoundsViewOutlineProvider(View view);
    }

    class ViewUtilsImplBase implements ViewUtilsImpl {
        ViewUtilsImplBase(1 1) {
            this();
        }

        public void setBoundsViewOutlineProvider(View view) {
        }

        private ViewUtilsImplBase() {
        }
    }

    class ViewUtilsImplLollipop implements ViewUtilsImpl {
        ViewUtilsImplLollipop(1 1) {
            this();
        }

        private ViewUtilsImplLollipop() {
        }

        public void setBoundsViewOutlineProvider(View view) {
            ViewUtilsLollipop.setBoundsViewOutlineProvider(view);
        }
    }

    static void setBoundsViewOutlineProvider(View view) {
        IMPL.setBoundsViewOutlineProvider(view);
    }

    static {
        DEFAULT_ANIMATOR_CREATOR = new 1();
        if (VERSION.SDK_INT >= 21) {
            IMPL = new ViewUtilsImplLollipop(null);
        } else {
            IMPL = new ViewUtilsImplBase(null);
        }
    }

    static ValueAnimatorCompat createAnimator() {
        return DEFAULT_ANIMATOR_CREATOR.createAnimator();
    }
}
