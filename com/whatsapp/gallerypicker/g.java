package com.whatsapp.gallerypicker;

class g implements Runnable {
    final bt a;
    final GalleryPickerFragment b;

    public void run() {
        GalleryPickerFragment.a(this.b, this.a);
    }

    g(GalleryPickerFragment galleryPickerFragment, bt btVar) {
        this.b = galleryPickerFragment;
        this.a = btVar;
    }
}
