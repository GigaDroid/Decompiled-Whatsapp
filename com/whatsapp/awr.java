package com.whatsapp;

class awr implements Runnable {
    final VoiceService a;

    awr(VoiceService voiceService) {
        this.a = voiceService;
    }

    public void run() {
        Voip.acceptCall();
    }
}
