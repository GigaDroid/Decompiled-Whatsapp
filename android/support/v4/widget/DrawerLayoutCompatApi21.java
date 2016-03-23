package android.support.v4.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v4.app.RemoteInputCompatBase.RemoteInput;
import android.support.v4.widget.SearchViewCompatIcs.MySearchView;
import android.view.View;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.WindowInsets;

class DrawerLayoutCompatApi21 {
    private static final int[] THEME_ATTRS;

    class InsetsListener implements OnApplyWindowInsetsListener {
        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            ((DrawerLayoutImpl) view).setChildInsets(windowInsets, windowInsets.getSystemWindowInsetTop() > 0);
            return windowInsets.consumeSystemWindowInsets();
        }

        InsetsListener() {
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void dispatchChildInsets(android.view.View r5, java.lang.Object r6, int r7) {
        /*
        r4 = 0;
        r6 = (android.view.WindowInsets) r6;
        r0 = 3;
        if (r7 != r0) goto L_0x0031;
    L_0x0006:
        r0 = r6.getSystemWindowInsetLeft();
        r1 = r6.getSystemWindowInsetTop();
        r2 = r6.getSystemWindowInsetBottom();
        r0 = r6.replaceSystemWindowInsets(r0, r1, r4, r2);
        r1 = android.support.v4.widget.SearchViewCompatIcs.MySearchView.a;
        if (r1 == 0) goto L_0x002d;
    L_0x001a:
        r1 = 5;
        if (r7 != r1) goto L_0x002d;
    L_0x001d:
        r1 = r0.getSystemWindowInsetTop();
        r2 = r0.getSystemWindowInsetRight();
        r3 = r0.getSystemWindowInsetBottom();
        r0 = r0.replaceSystemWindowInsets(r4, r1, r2, r3);
    L_0x002d:
        r5.dispatchApplyWindowInsets(r0);
        return;
    L_0x0031:
        r0 = r6;
        goto L_0x001a;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.DrawerLayoutCompatApi21.dispatchChildInsets(android.view.View, java.lang.Object, int):void");
    }

    public static void configureApplyInsets(View view) {
        if (view instanceof DrawerLayoutImpl) {
            view.setOnApplyWindowInsetsListener(new InsetsListener());
            view.setSystemUiVisibility(1280);
        }
    }

    public static Drawable getDefaultStatusBarBackground(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(THEME_ATTRS);
        try {
            Drawable drawable = obtainStyledAttributes.getDrawable(0);
            return drawable;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static int getTopInset(Object obj) {
        return obj != null ? ((WindowInsets) obj).getSystemWindowInsetTop() : 0;
    }

    static {
        THEME_ATTRS = new int[]{16843828};
    }

    public static void applyMarginInsets(MarginLayoutParams marginLayoutParams, Object obj, int i) {
        WindowInsets replaceSystemWindowInsets;
        int i2 = MySearchView.a;
        WindowInsets windowInsets = (WindowInsets) obj;
        if (i == 3) {
            replaceSystemWindowInsets = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), 0, windowInsets.getSystemWindowInsetBottom());
            if (i2 != 0) {
                RemoteInput.a++;
            }
            marginLayoutParams.leftMargin = replaceSystemWindowInsets.getSystemWindowInsetLeft();
            marginLayoutParams.topMargin = replaceSystemWindowInsets.getSystemWindowInsetTop();
            marginLayoutParams.rightMargin = replaceSystemWindowInsets.getSystemWindowInsetRight();
            marginLayoutParams.bottomMargin = replaceSystemWindowInsets.getSystemWindowInsetBottom();
        }
        replaceSystemWindowInsets = windowInsets;
        if (i == 5) {
            replaceSystemWindowInsets = replaceSystemWindowInsets.replaceSystemWindowInsets(0, replaceSystemWindowInsets.getSystemWindowInsetTop(), replaceSystemWindowInsets.getSystemWindowInsetRight(), replaceSystemWindowInsets.getSystemWindowInsetBottom());
        }
        marginLayoutParams.leftMargin = replaceSystemWindowInsets.getSystemWindowInsetLeft();
        marginLayoutParams.topMargin = replaceSystemWindowInsets.getSystemWindowInsetTop();
        marginLayoutParams.rightMargin = replaceSystemWindowInsets.getSystemWindowInsetRight();
        marginLayoutParams.bottomMargin = replaceSystemWindowInsets.getSystemWindowInsetBottom();
    }
}
