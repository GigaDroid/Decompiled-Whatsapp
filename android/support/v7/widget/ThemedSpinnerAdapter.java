package android.support.v7.widget;

import android.content.res.Resources.Theme;
import android.support.annotation.Nullable;
import android.widget.SpinnerAdapter;

public interface ThemedSpinnerAdapter extends SpinnerAdapter {
    @Nullable
    Theme getDropDownViewTheme();

    void setDropDownViewTheme(@Nullable Theme theme);
}
