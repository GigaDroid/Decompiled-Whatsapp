package com.whatsapp;

class ea implements Runnable {
    final adk a;

    ea(adk com_whatsapp_adk) {
        this.a = com_whatsapp_adk;
    }

    public void run() {
        App.e(this.a.a);
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
        }
        this.a.b.runOnUiThread(new ant(this));
    }
}
