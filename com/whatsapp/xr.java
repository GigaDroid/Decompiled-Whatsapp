package com.whatsapp;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

class xr extends Drawable {
    private int a;

    public boolean setState(int[] iArr) {
        boolean z = DialogToastActivity.f;
        int i = this.a;
        this.a = 16842921;
        int length = iArr.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = iArr[i2];
            if (i3 == 16842919) {
                this.a = 16842919;
                if (!z) {
                    break;
                }
            }
            if (i3 == 16842908) {
                this.a = 16842908;
            }
            i2++;
            if (z) {
                break;
            }
        }
        if (i == this.a) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    public void draw(Canvas canvas) {
    }

    private xr() {
        this.a = 16842921;
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public int getOpacity() {
        return 0;
    }

    xr(nv nvVar) {
        this();
    }

    public void setAlpha(int i) {
    }

    public boolean isStateful() {
        return true;
    }
}
