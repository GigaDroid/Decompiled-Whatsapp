package com.whatsapp;

import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;

class aue implements Runnable {
    private int a;
    private Animation[] b;
    final ai6 c;

    aue(ai6 com_whatsapp_ai6) {
        this.c = com_whatsapp_ai6;
        this.a = 0;
    }

    public void run() {
        boolean z = DialogToastActivity.f;
        if (this.b == null) {
            this.b = new Animation[ai6.c(this.c).length];
            int i = 0;
            while (i < ai6.b(this.c).length) {
                AnimationSet animationSet = new AnimationSet(true);
                animationSet.addAnimation(new AlphaAnimation(1.0f, 0.5f));
                animationSet.addAnimation(new ScaleAnimation(1.2f, 1.0f, 1.2f, 1.0f, 1, 0.5f, 1, 0.5f));
                this.b[i] = animationSet;
                this.b[i].setDuration(400);
                this.b[i].setFillAfter(true);
                int i2 = i + 1;
                if (z) {
                    break;
                }
                i = i2;
            }
        }
        if (ai6.d(this.c) == 1) {
            if (this.a < ai6.b(this.c).length) {
                this.b[this.a].reset();
                ai6.b(this.c)[this.a].startAnimation(this.b[this.a]);
            }
            this.a = (this.a + 1) % ai6.b(this.c).length;
            ai6.a(this.c).postDelayed(this, this.a == 0 ? 800 : 100);
        }
    }
}
