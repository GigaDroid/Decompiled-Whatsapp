package com.whatsapp;

import com.whatsapp.jobqueue.job.GetPreKeyJob;
import com.whatsapp.protocol.ct;
import org.whispersystems.b0;
import org.whispersystems.j;

class a32 implements Runnable {
    final ct a;
    final j b;
    final VoiceService c;

    a32(VoiceService voiceService, j jVar, ct ctVar) {
        this.c = voiceService;
        this.b = jVar;
        this.a = ctVar;
    }

    public void run() {
        b0 a = awc.a(App.z()).a(this.b);
        App.p.ai.a(new GetPreKeyJob(this.a.e, a.b() ? null : a.a().j()));
    }
}
