package com.whatsapp;

class ams implements Runnable {
    final VoiceService a;

    ams(VoiceService voiceService) {
        this.a = voiceService;
    }

    public void run() {
        Voip.onNetworkChange();
    }
}
