package com.whatsapp.gdrive;

import android.os.Process;

class b3 implements Runnable {
    final Runnable a;
    final d1 b;

    b3(d1 d1Var, Runnable runnable) {
        this.b = d1Var;
        this.a = runnable;
    }

    public void run() {
        Process.setThreadPriority(10);
        this.a.run();
    }
}
