package com.whatsapp;

class ad extends Thread {
    final zq a;

    public void run() {
        boolean z = DialogToastActivity.f;
        int i = 0;
        while (qm.d && i < 45000) {
            try {
                i += 200;
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    if (z) {
                        break;
                    }
                }
            } catch (InterruptedException e2) {
                throw e2;
            }
        }
        if (i >= 45000) {
            try {
                if (qm.d) {
                    qm.b();
                }
            } catch (InterruptedException e22) {
                throw e22;
            }
        }
    }

    ad(zq zqVar) {
        this.a = zqVar;
    }
}
