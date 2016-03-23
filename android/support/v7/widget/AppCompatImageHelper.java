package android.support.v7.widget;

import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import android.widget.ImageView;

class AppCompatImageHelper {
    private static final int[] VIEW_ATTRS;
    private final TintManager mTintManager;
    private final ImageView mView;

    void setImageResource(int i) {
        if (i != 0) {
            this.mView.setImageDrawable(this.mTintManager != null ? this.mTintManager.getDrawable(i) : ContextCompat.getDrawable(this.mView.getContext(), i));
            if (!LinearLayoutCompat.a) {
                return;
            }
        }
        this.mView.setImageDrawable(null);
    }

    static {
        VIEW_ATTRS = new int[]{16843033};
    }

    AppCompatImageHelper(ImageView imageView, TintManager tintManager) {
        this.mView = imageView;
        this.mTintManager = tintManager;
    }

    void loadFromAttributes(AttributeSet attributeSet, int i) {
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(this.mView.getContext(), attributeSet, VIEW_ATTRS, i, 0);
        try {
            if (obtainStyledAttributes.hasValue(0)) {
                this.mView.setImageDrawable(obtainStyledAttributes.getDrawable(0));
            }
            obtainStyledAttributes.recycle();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
        }
    }
}
