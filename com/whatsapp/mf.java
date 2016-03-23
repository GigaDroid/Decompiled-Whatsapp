package com.whatsapp;

import com.facebook.rebound.e;
import com.facebook.rebound.j;
import com.facebook.rebound.m;

class mf extends j {
    int a;
    final a9z b;

    mf(a9z com_whatsapp_a9z, int i) {
        this.b = com_whatsapp_a9z;
        this.a = i;
    }

    public void c(m mVar) {
        float a = (float) e.a(mVar.f(), 0.0d, 1.0d, 0.5d, 1.0d);
        a9z.m(this.b).setScaleX(a);
        a9z.m(this.b).setScaleY(a);
        if (this.a != 0) {
            int a2 = (int) e.a(mVar.f(), 0.0d, 1.0d, 0.0d, (double) this.a);
            int width = a9z.m(this.b).getWidth() / 4;
            if (App.av) {
                width = -width;
            }
            a9z.m(this.b).setTranslationX((float) (width + a2));
        }
    }
}
