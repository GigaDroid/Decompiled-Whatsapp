package android.support.v7.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources.Theme;
import android.support.annotation.StyleRes;
import android.support.v7.appcompat.R;
import android.view.LayoutInflater;
import org.v;
import org.whispersystems.at;

public class ContextThemeWrapper extends ContextWrapper {
    private static final String z;
    private LayoutInflater mInflater;
    private Theme mTheme;
    private int mThemeResource;

    static {
        char[] toCharArray = "(\\\u0007\u0016&0b\u0017\u00175(\\\n\u001c!".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 68;
                    break;
                case at.g /*1*/:
                    i2 = 61;
                    break;
                case at.i /*2*/:
                    i2 = 126;
                    break;
                case at.o /*3*/:
                    i2 = 121;
                    break;
                default:
                    i2 = 83;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    protected void onApplyThemeResource(Theme theme, int i, boolean z) {
        theme.applyStyle(i, true);
    }

    private void initializeTheme() {
        boolean z;
        if (this.mTheme == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.mTheme = getResources().newTheme();
            Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.mTheme.setTo(theme);
            }
        }
        onApplyThemeResource(this.mTheme, this.mThemeResource, z);
    }

    public Object getSystemService(String str) {
        if (!z.equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.mInflater == null) {
            this.mInflater = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.mInflater;
    }

    public void setTheme(int i) {
        if (this.mThemeResource != i) {
            this.mThemeResource = i;
            initializeTheme();
        }
    }

    public int getThemeResId() {
        return this.mThemeResource;
    }

    public ContextThemeWrapper(Context context, @StyleRes int i) {
        super(context);
        this.mThemeResource = i;
    }

    public ContextThemeWrapper(Context context, Theme theme) {
        super(context);
        this.mTheme = theme;
    }

    public Theme getTheme() {
        if (this.mTheme != null) {
            return this.mTheme;
        }
        if (this.mThemeResource == 0) {
            this.mThemeResource = R.style.Theme_AppCompat_Light;
        }
        initializeTheme();
        return this.mTheme;
    }
}
