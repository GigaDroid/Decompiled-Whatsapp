package com.whatsapp;

class ru implements Runnable {
    final ContactInfo a;

    public void run() {
        ContactInfo.f(this.a);
        this.a.C.postDelayed(this, ContactInfo.j(this.a));
    }

    ru(ContactInfo contactInfo) {
        this.a = contactInfo;
    }
}
