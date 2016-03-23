package com.whatsapp.gallerypicker;

import com.whatsapp.gallerypicker.MediaGalleryFragmentBase.MediaItemView;

class aq implements a8 {
    final int a;
    final f b;
    final ah c;
    final b7 d;
    final MediaItemView e;

    aq(ah ahVar, MediaItemView mediaItemView, b7 b7Var, f fVar, int i) {
        this.c = ahVar;
        this.e = mediaItemView;
        this.d = b7Var;
        this.b = fVar;
        this.a = i;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(android.graphics.Bitmap r7, boolean r8) {
        /*
        r6 = this;
        r5 = 1;
        r4 = 0;
        r0 = com.whatsapp.gallerypicker.MediaGalleryFragmentBase.e;
        r1 = r6.c;
        r1 = r1.b;
        r1 = r1.getActivity();
        if (r1 != 0) goto L_0x000f;
    L_0x000e:
        return;
    L_0x000f:
        r1 = r6.e;
        r1 = r1.getTag();
        r2 = r6.d;
        if (r1 != r2) goto L_0x000e;
    L_0x0019:
        r1 = com.whatsapp.gallerypicker.MediaGalleryFragmentBase.l;
        if (r7 != r1) goto L_0x00ce;
    L_0x001d:
        r1 = r6.e;
        r2 = android.widget.ImageView.ScaleType.CENTER;
        r1.setScaleType(r2);
        r1 = r6.b;
        r1 = com.whatsapp.gallerypicker.ag.b(r1);
        if (r1 == 0) goto L_0x004a;
    L_0x002c:
        r1 = r6.e;
        r2 = r6.c;
        r2 = r2.b;
        r2 = r2.getContext();
        r3 = 2131624049; // 0x7f0e0071 float:1.8875267E38 double:1.0531622125E-314;
        r2 = android.support.v4.content.ContextCompat.getColor(r2, r3);
        r1.setBackgroundColor(r2);
        r1 = r6.e;
        r2 = 2130839410; // 0x7f020772 float:1.728383E38 double:1.0527745493E-314;
        r1.setImageResource(r2);
        if (r0 == 0) goto L_0x011b;
    L_0x004a:
        r1 = r6.b;
        r1 = com.whatsapp.gallerypicker.ag.a(r1);
        if (r1 == 0) goto L_0x0069;
    L_0x0052:
        r1 = r6.e;
        r2 = r6.c;
        r2 = r2.b;
        r2 = com.whatsapp.gallerypicker.MediaGalleryFragmentBase.a(r2);
        r1.setBackgroundColor(r2);
        r1 = r6.e;
        r2 = 2130839525; // 0x7f0207e5 float:1.7284063E38 double:1.052774606E-314;
        r1.setImageResource(r2);
        if (r0 == 0) goto L_0x011b;
    L_0x0069:
        r1 = r6.b;
        r1 = com.whatsapp.gallerypicker.ag.c(r1);
        if (r1 == 0) goto L_0x0088;
    L_0x0071:
        r1 = r6.e;
        r2 = r6.c;
        r2 = r2.b;
        r2 = com.whatsapp.gallerypicker.MediaGalleryFragmentBase.a(r2);
        r1.setBackgroundColor(r2);
        r1 = r6.e;
        r2 = 2130839526; // 0x7f0207e6 float:1.7284065E38 double:1.0527746066E-314;
        r1.setImageResource(r2);
        if (r0 == 0) goto L_0x011b;
    L_0x0088:
        r1 = r6.b;
        r1 = r1.d();
        r1 = com.whatsapp.util.cb.b(r1);
        if (r1 == 0) goto L_0x00ba;
    L_0x0094:
        r1 = r6.e;
        r2 = r6.c;
        r2 = r2.b;
        r2 = com.whatsapp.gallerypicker.MediaGalleryFragmentBase.a(r2);
        r1.setBackgroundColor(r2);
        r1 = r6.e;
        r2 = r6.c;
        r2 = r2.b;
        r2 = r2.getActivity();
        r3 = r6.b;
        r3 = r3.d();
        r2 = com.whatsapp.util.cb.a(r2, r3);
        r1.setImageDrawable(r2);
        if (r0 == 0) goto L_0x011b;
    L_0x00ba:
        r1 = r6.e;
        r2 = r6.c;
        r2 = r2.b;
        r2 = com.whatsapp.gallerypicker.MediaGalleryFragmentBase.a(r2);
        r1.setBackgroundColor(r2);
        r1 = r6.e;
        r1.setImageResource(r4);
        if (r0 == 0) goto L_0x011b;
    L_0x00ce:
        r1 = r6.e;
        r2 = android.widget.ImageView.ScaleType.CENTER_CROP;
        r1.setScaleType(r2);
        r1 = r6.e;
        r1.setBackgroundResource(r4);
        if (r8 != 0) goto L_0x0116;
    L_0x00dc:
        r1 = r6.c;
        r2 = r6.a;
        r1 = com.whatsapp.gallerypicker.ah.a(r1, r2);
        if (r1 != 0) goto L_0x0116;
    L_0x00e6:
        r1 = 2;
        r1 = new android.graphics.drawable.Drawable[r1];
        r2 = r6.c;
        r2 = r2.b;
        r2 = com.whatsapp.gallerypicker.MediaGalleryFragmentBase.c(r2);
        r1[r4] = r2;
        r2 = new android.graphics.drawable.BitmapDrawable;
        r3 = r6.c;
        r3 = r3.b;
        r3 = r3.getResources();
        r2.<init>(r3, r7);
        r1[r5] = r2;
        r2 = new android.graphics.drawable.TransitionDrawable;
        r2.<init>(r1);
        r2.setCrossFadeEnabled(r5);
        r1 = 150; // 0x96 float:2.1E-43 double:7.4E-322;
        r2.startTransition(r1);
        r1 = r6.e;
        r1.setImageDrawable(r2);
        if (r0 == 0) goto L_0x011b;
    L_0x0116:
        r0 = r6.e;
        r0.setImageBitmap(r7);
    L_0x011b:
        r0 = r6.c;
        r1 = r6.a;
        r0 = com.whatsapp.gallerypicker.ah.a(r0, r1);
        if (r0 == 0) goto L_0x000e;
    L_0x0125:
        r0 = r6.c;
        r0 = com.whatsapp.gallerypicker.ah.b(r0);
        r1 = r6.a;
        r0.put(r1, r5);
        r0 = r6.e;
        r0.setVisibility(r4);
        r0 = r6.e;
        r0 = r0.getViewTreeObserver();
        r1 = new com.whatsapp.gallerypicker.bq;
        r1.<init>(r6);
        r0.addOnPreDrawListener(r1);
        goto L_0x000e;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallerypicker.aq.a(android.graphics.Bitmap, boolean):void");
    }

    public void a() {
        this.e.setBackgroundColor(MediaGalleryFragmentBase.a(this.c.b));
        this.e.setImageDrawable(null);
    }
}
