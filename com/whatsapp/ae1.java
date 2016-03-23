package com.whatsapp;

import com.whatsapp.fieldstats.bn;
import com.whatsapp.fieldstats.i;

class ae1 implements Runnable {
    final App a;

    ae1(App app) {
        this.a = app;
    }

    public void run() {
        if (ve.G()) {
            i.a(App.z(), bn.IS_MONKEYRUNNER_RUNNING, Boolean.valueOf(true));
        }
    }
}
