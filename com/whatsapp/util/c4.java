package com.whatsapp.util;

import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;

final class c4 implements OnGlobalLayoutListener {
    final Runnable a;
    final View b;

    c4(View view, Runnable runnable) {
        this.b = view;
        this.a = runnable;
    }

    public void onGlobalLayout() {
        this.b.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        this.a.run();
    }
}
