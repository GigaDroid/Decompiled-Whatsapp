package com.whatsapp.wallpaper;

class b implements Runnable {
    final CropImageView a;
    final l b;

    public void run() {
        CropImageView.a(this.a, this.b);
    }

    b(CropImageView cropImageView, l lVar) {
        this.a = cropImageView;
        this.b = lVar;
    }
}
