package com.whatsapp.gdrive;

import android.os.Process;

class d4 implements Runnable {
    final Runnable a;
    final a1 b;

    d4(a1 a1Var, Runnable runnable) {
        this.b = a1Var;
        this.a = runnable;
    }

    public void run() {
        Process.setThreadPriority(10);
        this.a.run();
    }
}
