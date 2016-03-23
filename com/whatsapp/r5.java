package com.whatsapp;

class r5 implements Runnable {
    final WebImagePicker a;

    public void run() {
        WebImagePicker.n(this.a);
    }

    r5(WebImagePicker webImagePicker) {
        this.a = webImagePicker;
    }
}
