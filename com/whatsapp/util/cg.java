package com.whatsapp.util;

import android.view.View;
import android.view.ViewTreeObserver.OnPreDrawListener;

final class cg implements OnPreDrawListener {
    final Runnable a;
    final View b;

    cg(View view, Runnable runnable) {
        this.b = view;
        this.a = runnable;
    }

    public boolean onPreDraw() {
        this.b.getViewTreeObserver().removeOnPreDrawListener(this);
        this.a.run();
        return true;
    }
}
