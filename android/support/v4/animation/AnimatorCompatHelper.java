package android.support.v4.animation;

import android.os.Build.VERSION;
import android.view.View;

public abstract class AnimatorCompatHelper {
    static AnimatorProvider IMPL;
    public static boolean a;

    public static void clearInterpolator(View view) {
        IMPL.clearInterpolator(view);
    }

    static {
        if (VERSION.SDK_INT >= 12) {
            IMPL = new HoneycombMr1AnimatorCompatProvider();
        } else {
            IMPL = new DonutAnimatorCompatProvider();
        }
    }
}
