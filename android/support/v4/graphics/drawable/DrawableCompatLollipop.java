package android.support.v4.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.support.v4.app.FragmentTransitionCompat21.EpicenterView;

class DrawableCompatLollipop {
    public static void setTintList(Drawable drawable, ColorStateList colorStateList) {
        if (drawable instanceof DrawableWrapperLollipop) {
            DrawableCompatBase.setTintList(drawable, colorStateList);
            if (!EpicenterView.a) {
                return;
            }
        }
        drawable.setTintList(colorStateList);
    }

    public static void setTint(Drawable drawable, int i) {
        if (drawable instanceof DrawableWrapperLollipop) {
            DrawableCompatBase.setTint(drawable, i);
            if (!EpicenterView.a) {
                return;
            }
        }
        drawable.setTint(i);
    }

    public static void setHotspotBounds(Drawable drawable, int i, int i2, int i3, int i4) {
        drawable.setHotspotBounds(i, i2, i3, i4);
    }

    public static Drawable wrapForTinting(Drawable drawable) {
        if ((drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer)) {
            return new DrawableWrapperLollipop(drawable);
        }
        return drawable;
    }

    public static void setTintMode(Drawable drawable, Mode mode) {
        if (drawable instanceof DrawableWrapperLollipop) {
            DrawableCompatBase.setTintMode(drawable, mode);
            if (!EpicenterView.a) {
                return;
            }
        }
        drawable.setTintMode(mode);
    }

    public static void setHotspot(Drawable drawable, float f, float f2) {
        drawable.setHotspot(f, f2);
    }
}
