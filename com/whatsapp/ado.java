package com.whatsapp;

class ado implements Runnable {
    final LocationPicker a;

    ado(LocationPicker locationPicker) {
        this.a = locationPicker;
    }

    public void run() {
        LocationPicker.o(this.a).b(LocationPicker.f(this.a).getMyLocation());
    }
}
