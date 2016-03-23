package com.whatsapp;

class avo implements Runnable {
    final VoiceService a;

    public void run() {
        if (VoiceService.L(this.a) != null) {
            Voip.notifyAudioRouteChange(a7.a(VoiceService.L(this.a)));
        }
    }

    avo(VoiceService voiceService) {
        this.a = voiceService;
    }
}
