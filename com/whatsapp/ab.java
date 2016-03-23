package com.whatsapp;

class ab implements Runnable {
    final LocationSharingService a;

    public void run() {
        this.a.stopSelf();
    }

    ab(LocationSharingService locationSharingService) {
        this.a = locationSharingService;
    }
}
