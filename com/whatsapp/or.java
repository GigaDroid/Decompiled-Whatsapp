package com.whatsapp;

import android.view.Display;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;

class or implements OnGlobalLayoutListener {
    final pz a;

    or(pz pzVar) {
        this.a = pzVar;
    }

    public void onGlobalLayout() {
        if (pz.c(this.a) != null) {
            boolean z;
            int i;
            int height = pz.c(this.a).getHeight();
            int[] iArr = new int[2];
            pz.c(this.a).getLocationOnScreen(iArr);
            int i2 = iArr[1] + height;
            Display defaultDisplay = pz.d(this.a).getWindowManager().getDefaultDisplay();
            int width = defaultDisplay.getWidth();
            if (((float) (defaultDisplay.getHeight() - i2)) < a4d.a().g * 128.0f) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.a.dismiss();
                if (!DialogToastActivity.f) {
                    i = 0;
                    this.a.update(0, i2, width, i, true);
                }
            }
            i = defaultDisplay.getHeight() - i2;
            pz.a(this.a, i);
            this.a.update(0, i2, width, i, true);
        }
    }
}
