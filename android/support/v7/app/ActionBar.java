package android.support.v7.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.support.v7.appcompat.R;
import android.support.v7.view.ActionMode;
import android.support.v7.view.ActionMode.Callback;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import org.v;
import org.whispersystems.at;

public abstract class ActionBar {
    public static boolean a;
    private static final String z;

    public class LayoutParams extends MarginLayoutParams {
        public int gravity;

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.gravity = 0;
        }

        public LayoutParams(@NonNull Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.gravity = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ActionBarLayout);
            this.gravity = obtainStyledAttributes.getInt(R.styleable.ActionBarLayout_android_layout_gravity, 0);
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.gravity = 0;
            this.gravity = 8388627;
        }

        public LayoutParams(int i, int i2, int i3) {
            super(i, i2);
            this.gravity = 0;
            this.gravity = i3;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
            this.gravity = 0;
            this.gravity = layoutParams.gravity;
        }
    }

    public interface OnMenuVisibilityListener {
        void onMenuVisibilityChanged(boolean z);
    }

    public abstract class Tab {
        public abstract CharSequence getContentDescription();

        public abstract View getCustomView();

        public abstract Drawable getIcon();

        public abstract CharSequence getText();

        public abstract void select();
    }

    static {
        char[] toCharArray = ".x%1%\u0013zq$l\u0013r?h6\u0018o>e)\u0011x'$8\u0014r?e%\u000e=?*8]n$5<\u0012o% (]t?e8\u0015t\"e-\u001ei8*\"]\u007f07l\u001er?#%\u001ah#$8\u0014r?k".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 125;
                    break;
                case at.g /*1*/:
                    i2 = 29;
                    break;
                case at.i /*2*/:
                    i2 = 81;
                    break;
                case at.o /*3*/:
                    i2 = 69;
                    break;
                default:
                    i2 = 76;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public abstract int getDisplayOptions();

    public abstract void hide();

    public void onConfigurationChanged(Configuration configuration) {
    }

    public abstract void setBackgroundDrawable(@Nullable Drawable drawable);

    public abstract void setCustomView(View view);

    public abstract void setCustomView(View view, LayoutParams layoutParams);

    public abstract void setDisplayHomeAsUpEnabled(boolean z);

    public abstract void setDisplayShowCustomEnabled(boolean z);

    public abstract void setDisplayShowHomeEnabled(boolean z);

    public abstract void setDisplayShowTitleEnabled(boolean z);

    public abstract void setIcon(Drawable drawable);

    public abstract void setSubtitle(CharSequence charSequence);

    public abstract void setTitle(@StringRes int i);

    public abstract void setTitle(CharSequence charSequence);

    public abstract void show();

    public boolean onKeyShortcut(int i, KeyEvent keyEvent) {
        return false;
    }

    public void setElevation(float f) {
        if (f != 0.0f) {
            try {
                throw new UnsupportedOperationException(z);
            } catch (UnsupportedOperationException e) {
                throw e;
            }
        }
    }

    public boolean invalidateOptionsMenu() {
        return false;
    }

    public void dispatchMenuVisibilityChanged(boolean z) {
    }

    public void setShowHideAnimationEnabled(boolean z) {
    }

    public boolean collapseActionView() {
        return false;
    }

    public void setDefaultDisplayHomeAsUpEnabled(boolean z) {
    }

    public ActionMode startActionMode(Callback callback) {
        return null;
    }

    public void setWindowTitle(CharSequence charSequence) {
    }

    public void setHomeAsUpIndicator(@Nullable Drawable drawable) {
    }

    public Context getThemedContext() {
        return null;
    }
}
