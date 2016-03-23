package com.whatsapp;

import com.whatsapp.VoiceService.DefaultSignalingCallback;
import com.whatsapp.protocol.co;

class ai8 implements Runnable {
    final co a;
    final DefaultSignalingCallback b;

    ai8(DefaultSignalingCallback defaultSignalingCallback, co coVar) {
        this.b = defaultSignalingCallback;
        this.a = coVar;
    }

    public void run() {
        App.j(this.a);
    }
}
