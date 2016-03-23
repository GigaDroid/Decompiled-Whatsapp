package android.support.v4.view;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.support.v4.app.RemoteInputCompatBase.RemoteInput;
import android.view.View;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.WindowInsets;

class ViewCompatLollipop {

    final class 1 implements OnApplyWindowInsetsListener {
        final OnApplyWindowInsetsListener val$listener;

        1(OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
            this.val$listener = onApplyWindowInsetsListener;
        }

        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            int i = WindowInsetsCompat.a;
            WindowInsets unwrap = ((WindowInsetsCompatApi21) this.val$listener.onApplyWindowInsets(view, new WindowInsetsCompatApi21(windowInsets))).unwrap();
            if (RemoteInput.a != 0) {
                WindowInsetsCompat.a = i + 1;
            }
            return unwrap;
        }
    }

    public static void setElevation(View view, float f) {
        view.setElevation(f);
    }

    public static void setOnApplyWindowInsetsListener(View view, OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        view.setOnApplyWindowInsetsListener(new 1(onApplyWindowInsetsListener));
    }

    static void setBackgroundTintList(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    public static WindowInsetsCompat dispatchApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        if (!(windowInsetsCompat instanceof WindowInsetsCompatApi21)) {
            return windowInsetsCompat;
        }
        WindowInsets unwrap = ((WindowInsetsCompatApi21) windowInsetsCompat).unwrap();
        WindowInsets dispatchApplyWindowInsets = view.dispatchApplyWindowInsets(unwrap);
        return dispatchApplyWindowInsets != unwrap ? new WindowInsetsCompatApi21(dispatchApplyWindowInsets) : windowInsetsCompat;
    }

    public static float getElevation(View view) {
        return view.getElevation();
    }

    public static boolean isNestedScrollingEnabled(View view) {
        return view.isNestedScrollingEnabled();
    }

    public static float getZ(View view) {
        return view.getZ();
    }

    public static void setTransitionName(View view, String str) {
        view.setTransitionName(str);
    }

    public static void stopNestedScroll(View view) {
        view.stopNestedScroll();
    }

    public static float getTranslationZ(View view) {
        return view.getTranslationZ();
    }

    public static WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        if (!(windowInsetsCompat instanceof WindowInsetsCompatApi21)) {
            return windowInsetsCompat;
        }
        WindowInsets unwrap = ((WindowInsetsCompatApi21) windowInsetsCompat).unwrap();
        WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(unwrap);
        return onApplyWindowInsets != unwrap ? new WindowInsetsCompatApi21(onApplyWindowInsets) : windowInsetsCompat;
    }

    static void setBackgroundTintMode(View view, Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    public static void setNestedScrollingEnabled(View view, boolean z) {
        view.setNestedScrollingEnabled(z);
    }

    public static void requestApplyInsets(View view) {
        view.requestApplyInsets();
    }
}
