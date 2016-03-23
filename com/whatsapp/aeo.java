package com.whatsapp;

class aeo implements Runnable {
    final MediaView a;

    public void run() {
        this.a.finish();
    }

    aeo(MediaView mediaView) {
        this.a = mediaView;
    }
}
