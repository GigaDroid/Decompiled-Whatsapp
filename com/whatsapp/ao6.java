package com.whatsapp;

class ao6 implements Runnable {
    final ContactInfo a;

    public void run() {
        ContactInfo.d(this.a);
    }

    ao6(ContactInfo contactInfo) {
        this.a = contactInfo;
    }
}
