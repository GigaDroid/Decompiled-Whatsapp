package com.whatsapp.gallerypicker;

class a implements Runnable {
    final GalleryPickerFragment a;
    final boolean b;

    a(GalleryPickerFragment galleryPickerFragment, boolean z) {
        this.a = galleryPickerFragment;
        this.b = z;
    }

    public void run() {
        GalleryPickerFragment.b(this.a, this.b);
        GalleryPickerFragment.a(this.a, this.b);
    }
}
