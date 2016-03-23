package com.whatsapp.gcm.experiment;

import com.whatsapp.a47;

class e implements Runnable {
    final d a;
    final a47 b;
    final long c;

    public void run() {
        if (d.a(this.a) == null || this.b.a != d.a(this.a).booleanValue()) {
            d.a(this.a, Boolean.valueOf(this.b.a));
            if (this.b.a) {
                d.a(this.a, 1, this.c);
                if (!d.d) {
                    return;
                }
            }
            d.a(this.a, 2, this.c);
        }
    }

    e(d dVar, a47 com_whatsapp_a47, long j) {
        this.a = dVar;
        this.b = com_whatsapp_a47;
        this.c = j;
    }
}
