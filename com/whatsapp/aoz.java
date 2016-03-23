package com.whatsapp;

import com.whatsapp.protocol.co;
import java.util.concurrent.CountDownLatch;

class aoz implements Runnable {
    final ael a;
    final co b;
    final CountDownLatch c;

    aoz(ael com_whatsapp_ael, co coVar, CountDownLatch countDownLatch) {
        this.a = com_whatsapp_ael;
        this.b = coVar;
        this.c = countDownLatch;
    }

    public void run() {
        ael.f(this.a).c(this.b);
        this.c.countDown();
    }
}
