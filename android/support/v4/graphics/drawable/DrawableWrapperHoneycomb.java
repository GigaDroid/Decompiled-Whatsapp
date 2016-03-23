package android.support.v4.graphics.drawable;

import android.graphics.drawable.Drawable;

class DrawableWrapperHoneycomb extends DrawableWrapperDonut {
    public void jumpToCurrentState() {
        this.mDrawable.jumpToCurrentState();
    }

    DrawableWrapperHoneycomb(Drawable drawable) {
        super(drawable);
    }
}
