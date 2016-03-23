package com.whatsapp.gallerypicker;

class b_ implements Runnable {
    final GalleryPickerFragment a;

    b_(GalleryPickerFragment galleryPickerFragment) {
        this.a = galleryPickerFragment;
    }

    public void run() {
        GalleryPickerFragment.e(this.a);
    }
}
