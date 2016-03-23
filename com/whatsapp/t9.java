package com.whatsapp;

class t9 implements Runnable {
    final ap a;

    t9(ap apVar) {
        this.a = apVar;
    }

    public void run() {
        SettingsNetworkUsage.b(this.a.a);
    }
}
