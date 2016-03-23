package android.support.v7.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.graphics.drawable.Drawable;

class TintContextWrapper extends ContextWrapper {
    private Resources mResources;

    class TintResources extends ResourcesWrapper {
        private final TintManager mTintManager;

        public Drawable getDrawable(int i) {
            Drawable drawable = super.getDrawable(i);
            if (drawable != null) {
                try {
                    this.mTintManager.tintDrawableUsingColorFilter(i, drawable);
                } catch (NotFoundException e) {
                    throw e;
                }
            }
            return drawable;
        }

        public TintResources(Resources resources, TintManager tintManager) {
            super(resources);
            this.mTintManager = tintManager;
        }
    }

    private TintContextWrapper(Context context) {
        super(context);
    }

    public Resources getResources() {
        if (this.mResources == null) {
            this.mResources = new TintResources(super.getResources(), TintManager.get(this));
        }
        return this.mResources;
    }

    public static Context wrap(Context context) {
        if (context instanceof TintContextWrapper) {
            return context;
        }
        return new TintContextWrapper(context);
    }
}
