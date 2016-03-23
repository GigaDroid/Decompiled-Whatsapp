package com.whatsapp;

class kx implements Runnable {
    final MediaView a;

    public void run() {
        this.a.finish();
    }

    kx(MediaView mediaView) {
        this.a = mediaView;
    }
}
