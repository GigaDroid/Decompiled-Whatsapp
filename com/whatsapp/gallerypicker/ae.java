package com.whatsapp.gallerypicker;

import android.graphics.Bitmap;
import android.widget.ImageView;

class ae implements b7 {
    final f a;
    final at b;
    final bt c;
    final ImageView d;

    ae(at atVar, ImageView imageView, f fVar, bt btVar) {
        this.b = atVar;
        this.d = imageView;
        this.a = fVar;
        this.c = btVar;
    }

    public Bitmap b() {
        if (this.d.getTag() != this) {
            return null;
        }
        Bitmap a = this.a.a(GalleryPickerFragment.f(this.b.d));
        return a == null ? MediaGalleryFragmentBase.l : a;
    }

    public String a() {
        return this.c.b();
    }
}
