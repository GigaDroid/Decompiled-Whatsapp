package com.whatsapp.util;

import android.view.View;
import android.view.ViewTreeObserver.OnDrawListener;

final class a9 implements OnDrawListener {
    final View a;
    final Runnable b;

    public void onDraw() {
        this.a.getViewTreeObserver().removeOnDrawListener(this);
        this.b.run();
    }

    a9(View view, Runnable runnable) {
        this.a = view;
        this.b = runnable;
    }
}
