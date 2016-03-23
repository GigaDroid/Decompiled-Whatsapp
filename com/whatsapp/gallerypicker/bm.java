package com.whatsapp.gallerypicker;

import android.graphics.Bitmap;
import com.whatsapp.gallerypicker.MediaGalleryFragmentBase.MediaItemView;

class bm implements b7 {
    final MediaItemView a;
    final ah b;
    final f c;

    public String a() {
        String b = this.c.b();
        return b == null ? "" : b;
    }

    bm(ah ahVar, MediaItemView mediaItemView, f fVar) {
        this.b = ahVar;
        this.a = mediaItemView;
        this.c = fVar;
    }

    public Bitmap b() {
        if (this.a.getTag() != this) {
            return null;
        }
        Bitmap a = this.c.a(MediaGalleryFragmentBase.g(this.b.b));
        if (a == null) {
            return MediaGalleryFragmentBase.l;
        }
        return a;
    }
}
