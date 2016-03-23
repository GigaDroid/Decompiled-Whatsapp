package com.whatsapp.wallpaper;

class m implements Runnable {
    final p a;
    final ImageViewTouchBase b;
    final boolean c;

    m(ImageViewTouchBase imageViewTouchBase, p pVar, boolean z) {
        this.b = imageViewTouchBase;
        this.a = pVar;
        this.c = z;
    }

    public void run() {
        this.b.setImageRotateBitmapResetBase(this.a, this.c);
    }
}
