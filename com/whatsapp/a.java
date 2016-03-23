package com.whatsapp;

class a implements Runnable {
    final VoiceService a;

    public void run() {
        Voip.rejectCall();
    }

    a(VoiceService voiceService) {
        this.a = voiceService;
    }
}
