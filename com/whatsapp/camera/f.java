package com.whatsapp.camera;

class f implements Runnable {
    final ZoomOverlay a;

    public void run() {
        this.a.setVisibility(8);
    }

    f(ZoomOverlay zoomOverlay) {
        this.a = zoomOverlay;
    }
}
