package com.whatsapp;

class alw implements Runnable {
    final asc a;

    alw(asc com_whatsapp_asc) {
        this.a = com_whatsapp_asc;
    }

    public void run() {
        IdentityVerificationActivity.a(this.a.b, this.a.a == ro.OK);
    }
}
