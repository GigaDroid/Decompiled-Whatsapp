package com.whatsapp.camera;

class ai implements Runnable {
    final ShutterOverlay a;

    ai(ShutterOverlay shutterOverlay) {
        this.a = shutterOverlay;
    }

    public void run() {
        ShutterOverlay.a(this.a, false);
        this.a.invalidate();
    }
}
