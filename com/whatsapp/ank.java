package com.whatsapp;

import android.os.SystemClock;

class ank implements av1 {
    final Conversation a;
    final long b;

    public void a(pi piVar) {
        long j = 0;
        long elapsedRealtime = 1000 - (SystemClock.elapsedRealtime() - this.b);
        if (elapsedRealtime >= 0) {
            j = elapsedRealtime;
        }
        App.p.M().postDelayed(new a_l(this, piVar), j);
    }

    ank(Conversation conversation, long j) {
        this.a = conversation;
        this.b = j;
    }
}
