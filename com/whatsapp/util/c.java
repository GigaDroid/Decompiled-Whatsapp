package com.whatsapp.util;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

class c implements AnimationListener {
    final boolean a;
    final Runnable b;
    final FloatingChildLayout c;

    public void onAnimationEnd(Animation animation) {
        if (this.a) {
            if (FloatingChildLayout.a(this.c) == 3) {
                FloatingChildLayout.a(this.c, 4);
                if (this.b != null) {
                    this.b.run();
                    if (Log.h == 0) {
                        return;
                    }
                }
                return;
            }
            return;
        }
        if (FloatingChildLayout.a(this.c) == 1) {
            FloatingChildLayout.a(this.c, 2);
            if (this.b != null) {
                this.b.run();
            }
        }
    }

    public void onAnimationStart(Animation animation) {
    }

    public void onAnimationRepeat(Animation animation) {
    }

    c(FloatingChildLayout floatingChildLayout, boolean z, Runnable runnable) {
        this.c = floatingChildLayout;
        this.a = z;
        this.b = runnable;
    }
}
