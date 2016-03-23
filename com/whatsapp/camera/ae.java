package com.whatsapp.camera;

class ae implements Runnable {
    final AutofocusOverlay a;

    public void run() {
        this.a.setVisibility(8);
    }

    ae(AutofocusOverlay autofocusOverlay) {
        this.a = autofocusOverlay;
    }
}
