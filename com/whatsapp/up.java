package com.whatsapp;

class up implements Runnable {
    final long a;
    final es b;

    public void run() {
        if (!this.b.isCancelled()) {
            this.b.a.a(this.a);
        }
    }

    up(es esVar, long j) {
        this.b = esVar;
        this.a = j;
    }
}
