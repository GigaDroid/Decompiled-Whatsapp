package com.whatsapp;

import com.whatsapp.VoiceService.VoiceServiceEventCallback;

class so implements Runnable {
    final VoiceServiceEventCallback a;

    so(VoiceServiceEventCallback voiceServiceEventCallback) {
        this.a = voiceServiceEventCallback;
    }

    public void run() {
        this.a.bufferQueue.a();
    }
}
