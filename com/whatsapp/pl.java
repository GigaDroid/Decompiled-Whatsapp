package com.whatsapp;

import com.whatsapp.jobqueue.job.GetPreKeyJob;
import com.whatsapp.protocol.ct;
import org.whispersystems.b0;
import org.whispersystems.j;
import org.whispersystems.t;

class pl implements Runnable {
    final ct a;
    final int b;
    final j c;
    final VoiceService d;

    pl(VoiceService voiceService, j jVar, int i, ct ctVar) {
        this.d = voiceService;
        this.c = jVar;
        this.b = i;
        this.a = ctVar;
    }

    public void run() {
        b0 a = awc.a(App.z()).a(this.c);
        t a2 = a.a();
        if (a.b() || a2.k() != this.b) {
            App.p.ai.a(new GetPreKeyJob(this.a.e, a.b() ? null : a2.j()));
        }
    }
}
