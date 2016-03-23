package com.whatsapp.gallerypicker;

class bj implements Runnable {
    final GalleryPickerFragment a;
    final bt b;

    public void run() {
        GalleryPickerFragment.a(this.a, this.b);
    }

    bj(GalleryPickerFragment galleryPickerFragment, bt btVar) {
        this.a = galleryPickerFragment;
        this.b = btVar;
    }
}
