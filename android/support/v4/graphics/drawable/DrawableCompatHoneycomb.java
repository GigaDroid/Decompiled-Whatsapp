package android.support.v4.graphics.drawable;

import android.graphics.drawable.Drawable;

class DrawableCompatHoneycomb {
    public static Drawable wrapForTinting(Drawable drawable) {
        return !(drawable instanceof DrawableWrapperHoneycomb) ? new DrawableWrapperHoneycomb(drawable) : drawable;
    }

    public static void jumpToCurrentState(Drawable drawable) {
        drawable.jumpToCurrentState();
    }
}
