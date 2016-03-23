package com.whatsapp.gallerypicker;

import android.support.v4.view.ViewPager.SimpleOnPageChangeListener;

class bp extends SimpleOnPageChangeListener {
    final GalleryPicker a;
    final p b;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onPageSelected(int r3) {
        /*
        r2 = this;
        super.onPageSelected(r3);
        r0 = r2.b;
        r0.a(r3);
        r0 = r2.a;
        r0 = com.whatsapp.gallerypicker.GalleryPicker.a(r0);
        r1 = 5;
        if (r0 != r1) goto L_0x0014;
    L_0x0011:
        switch(r3) {
            case 0: goto L_0x001a;
            case 1: goto L_0x0024;
            default: goto L_0x0014;
        };
    L_0x0014:
        r0 = r2.a;
        r0.invalidateOptionsMenu();
        return;
    L_0x001a:
        r0 = r2.a;
        r1 = 1;
        com.whatsapp.gallerypicker.GalleryPicker.a(r0, r1);
        r0 = com.whatsapp.gallerypicker.MediaGalleryFragmentBase.e;
        if (r0 == 0) goto L_0x0014;
    L_0x0024:
        r0 = r2.a;
        r1 = 4;
        com.whatsapp.gallerypicker.GalleryPicker.a(r0, r1);
        goto L_0x0014;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallerypicker.bp.onPageSelected(int):void");
    }

    bp(GalleryPicker galleryPicker, p pVar) {
        this.a = galleryPicker;
        this.b = pVar;
    }
}
