package com.whatsapp;

import android.os.Message;
import com.whatsapp.messaging.co;

class hi implements Runnable {
    final Message a;
    final VoiceService b;

    hi(VoiceService voiceService, Message message) {
        this.b = voiceService;
        this.a = message;
    }

    public void run() {
        co.a(this.a, this.b);
        if (VoiceService.q().decrementAndGet() == 0 && !Voip.d()) {
            VoiceService.n(this.b);
        }
    }
}
