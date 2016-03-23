package com.whatsapp.util;

import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.widget.ProgressBar;

public class h {
    public static void a(ProgressBar progressBar, int i) {
        if (VERSION.SDK_INT < 21) {
            Drawable indeterminateDrawable = progressBar.getIndeterminateDrawable();
            if (indeterminateDrawable != null) {
                indeterminateDrawable.setColorFilter(i, Mode.MULTIPLY);
                progressBar.setIndeterminateDrawable(indeterminateDrawable);
            }
            indeterminateDrawable = progressBar.getProgressDrawable();
            if (indeterminateDrawable != null) {
                indeterminateDrawable.setColorFilter(i, Mode.MULTIPLY);
                progressBar.setProgressDrawable(indeterminateDrawable);
            }
        }
    }
}
