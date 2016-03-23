package com.whatsapp.notification;

class ae implements Runnable {
    final PopupNotification a;

    ae(PopupNotification popupNotification) {
        this.a = popupNotification;
    }

    public void run() {
        if (PopupNotification.r(this.a) != null && PopupNotification.r(this.a).isHeld()) {
            PopupNotification.r(this.a).release();
        }
    }
}
