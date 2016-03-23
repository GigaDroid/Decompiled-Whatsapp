package com.whatsapp.util;

import android.os.Process;

class j implements Runnable {
    final cx a;
    final Runnable b;

    public void run() {
        Process.setThreadPriority(10);
        this.b.run();
    }

    j(cx cxVar, Runnable runnable) {
        this.a = cxVar;
        this.b = runnable;
    }
}
