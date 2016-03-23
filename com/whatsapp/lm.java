package com.whatsapp;

import com.whatsapp.util.b3;

class lm implements b3 {
    final VoiceService a;

    public void a(boolean z) {
        if (z) {
            VoiceService.q(this.a);
            if (!DialogToastActivity.f) {
                return;
            }
        }
        VoiceService.P(this.a);
    }

    lm(VoiceService voiceService) {
        this.a = voiceService;
    }
}
