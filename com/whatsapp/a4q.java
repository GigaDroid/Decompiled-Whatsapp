package com.whatsapp;

import android.os.Process;

class a4q implements Runnable {
    final Runnable a;
    final anz b;

    public void run() {
        Process.setThreadPriority(9);
        this.a.run();
    }

    a4q(anz com_whatsapp_anz, Runnable runnable) {
        this.b = com_whatsapp_anz;
        this.a = runnable;
    }
}
