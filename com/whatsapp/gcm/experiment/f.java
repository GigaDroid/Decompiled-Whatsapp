package com.whatsapp.gcm.experiment;

final class f implements Runnable {
    final long a;
    final long b;

    f(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public void run() {
        d.c().b(this.a, this.b);
    }
}
