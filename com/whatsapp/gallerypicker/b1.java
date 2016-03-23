package com.whatsapp.gallerypicker;

class b1 implements Runnable {
    final bt a;
    final GalleryPickerFragment b;

    public void run() {
        GalleryPickerFragment.a(this.b, this.a);
    }

    b1(GalleryPickerFragment galleryPickerFragment, bt btVar) {
        this.b = galleryPickerFragment;
        this.a = btVar;
    }
}
