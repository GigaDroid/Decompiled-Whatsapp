package com.whatsapp.gallerypicker;

import android.view.ViewTreeObserver.OnPreDrawListener;

class bq implements OnPreDrawListener {
    final aq a;

    bq(aq aqVar) {
        this.a = aqVar;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onPreDraw() {
        /*
        r13 = this;
        r10 = 40;
        r2 = 0;
        r1 = 1;
        r0 = r13.a;
        r0 = r0.e;
        r0 = r0.getViewTreeObserver();
        r0.removeOnPreDrawListener(r13);
        r0 = r13.a;
        r0 = r0.e;
        r0 = r0.getParent();
        r0 = r0 instanceof android.view.View;
        if (r0 == 0) goto L_0x009e;
    L_0x001b:
        r6 = android.os.SystemClock.uptimeMillis();
        r4 = 0;
        r0 = r13.a;
        r0 = r0.c;
        r8 = com.whatsapp.gallerypicker.ah.a(r0);
        r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r0 >= 0) goto L_0x004a;
    L_0x002d:
        r0 = r13.a;
        r0 = r0.c;
        r4 = com.whatsapp.gallerypicker.ah.a(r0);
        r4 = r4 - r6;
        r0 = r13.a;
        r0 = r0.c;
        r3 = r13.a;
        r3 = r3.c;
        r8 = com.whatsapp.gallerypicker.ah.a(r3);
        r8 = r8 + r10;
        com.whatsapp.gallerypicker.ah.a(r0, r8);
        r0 = com.whatsapp.gallerypicker.MediaGalleryFragmentBase.e;
        if (r0 == 0) goto L_0x0052;
    L_0x004a:
        r0 = r13.a;
        r0 = r0.c;
        r6 = r6 + r10;
        com.whatsapp.gallerypicker.ah.a(r0, r6);
    L_0x0052:
        r10 = r4;
        r0 = r13.a;
        r0 = r0.e;
        r0 = r0.getParent();
        r9 = r0;
        r9 = (android.view.View) r9;
        r12 = new android.view.animation.AnimationSet;
        r0 = 0;
        r12.<init>(r0);
        r0 = new android.view.animation.TranslateAnimation;
        r6 = 1048576000; // 0x3e800000 float:0.25 double:5.180653787E-315;
        r3 = r1;
        r4 = r2;
        r5 = r1;
        r7 = r1;
        r8 = r2;
        r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8);
        r3 = new android.view.animation.DecelerateInterpolator;
        r3.<init>();
        r0.setInterpolator(r3);
        r3 = new android.view.animation.AlphaAnimation;
        r4 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r3.<init>(r2, r4);
        r2 = new com.whatsapp.gallerypicker.ab;
        r2.<init>(r13);
        r3.setInterpolator(r2);
        r12.addAnimation(r0);
        r12.addAnimation(r3);
        r2 = 160; // 0xa0 float:2.24E-43 double:7.9E-322;
        r12.setDuration(r2);
        r12.setStartOffset(r10);
        r12.setFillBefore(r1);
        r12.setFillAfter(r1);
        r9.startAnimation(r12);
    L_0x009e:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallerypicker.bq.onPreDraw():boolean");
    }
}
