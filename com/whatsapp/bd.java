package com.whatsapp;

class bd implements Runnable {
    final adq a;

    bd(adq com_whatsapp_adq) {
        this.a = com_whatsapp_adq;
    }

    public void run() {
        LocationPicker.o(this.a.a).b(LocationPicker.f(this.a.a).getMyLocation());
        LocationPicker.o(this.a.a).getController().setZoom(18);
    }
}
