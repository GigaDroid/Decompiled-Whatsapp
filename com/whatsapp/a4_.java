package com.whatsapp;

import com.whatsapp.util.bq;

class a4_ implements Runnable {
    final b0 a;
    final l b;

    a4_(b0 b0Var, l lVar) {
        this.a = b0Var;
        this.b = lVar;
    }

    public void run() {
        if (!this.a.e.isCancelled()) {
            bq.a(this.a.e, new l[]{this.b});
            if (!DialogToastActivity.f) {
                return;
            }
        }
        this.a.e.a(aki.CANCEL);
    }
}
