package com.whatsapp;

class kh implements Runnable {
    final MediaView a;

    kh(MediaView mediaView) {
        this.a = mediaView;
    }

    public void run() {
        this.a.finish();
    }
}
