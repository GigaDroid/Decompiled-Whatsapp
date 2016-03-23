package com.whatsapp.util;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

class al extends AnimatorListenerAdapter {
    final boolean a;
    final Runnable b;
    final FloatingChildLayout c;

    public void onAnimationEnd(Animator animator) {
        FloatingChildLayout.b(this.c).setLayerType(0, null);
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

    al(FloatingChildLayout floatingChildLayout, boolean z, Runnable runnable) {
        this.c = floatingChildLayout;
        this.a = z;
        this.b = runnable;
    }
}
