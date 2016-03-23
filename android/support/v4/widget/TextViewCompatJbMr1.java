package android.support.v4.widget;

import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.RemoteInputCompatBase.RemoteInput;
import android.support.v4.widget.SearchViewCompatIcs.MySearchView;
import android.widget.TextView;

class TextViewCompatJbMr1 {
    public static void setCompoundDrawablesRelative(@NonNull TextView textView, @Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        Drawable drawable5;
        int i = MySearchView.a;
        Object obj = textView.getLayoutDirection() == 1 ? 1 : null;
        if (obj != null) {
            drawable5 = drawable3;
        } else {
            drawable5 = drawable;
        }
        if (obj == null) {
            drawable = drawable3;
        }
        textView.setCompoundDrawables(drawable5, drawable2, drawable, drawable4);
        if (RemoteInput.a != 0) {
            MySearchView.a = i + 1;
        }
    }
}
