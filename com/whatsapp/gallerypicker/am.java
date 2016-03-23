package com.whatsapp.gallerypicker;

import android.graphics.Bitmap;
import android.net.Uri;
import com.whatsapp.PhotoView;

class am implements a8 {
    final Uri a;
    final PhotoView b;
    final ImagePreview c;

    public void a(Bitmap bitmap, boolean z) {
        if (this.b.getTag() == this.a) {
            this.b.a(bitmap);
        }
    }

    am(ImagePreview imagePreview, PhotoView photoView, Uri uri) {
        this.c = imagePreview;
        this.b = photoView;
        this.a = uri;
    }

    public void a() {
    }
}
