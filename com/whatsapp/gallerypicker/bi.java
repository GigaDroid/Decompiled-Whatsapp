package com.whatsapp.gallerypicker;

class bi extends Thread {
    final GalleryPickerFragment a;

    public void run() {
        GalleryPickerFragment.h(this.a);
    }

    bi(GalleryPickerFragment galleryPickerFragment, String str) {
        this.a = galleryPickerFragment;
        super(str);
    }
}
