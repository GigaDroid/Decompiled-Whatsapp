package com.whatsapp;

class awv implements Runnable {
    final ta a;
    final v b;
    final MediaData c;
    final aav d;

    awv(aav com_whatsapp_aav, v vVar, MediaData mediaData, ta taVar) {
        this.d = com_whatsapp_aav;
        this.b = vVar;
        this.c = mediaData;
        this.a = taVar;
    }

    public void run() {
        if (!this.b.isCancelled() && this.b == this.c.downloader) {
            this.b.b(this.a);
        }
    }
}
