package com.whatsapp;

import android.os.Binder;

public class dp extends Binder {
    final VoiceService a;

    public VoiceService a() {
        return this.a;
    }

    public dp(VoiceService voiceService) {
        this.a = voiceService;
    }
}
