package com.whatsapp;

import android.telephony.PhoneStateListener;

class si extends PhoneStateListener {
    final VoiceService a;

    si(VoiceService voiceService) {
        this.a = voiceService;
    }

    public void onCallStateChanged(int i, String str) {
        VoiceService.e(this.a).removeMessages(6);
        if (i != 0) {
            VoiceService.e(this.a).sendEmptyMessage(6);
            if (!DialogToastActivity.f) {
                return;
            }
        }
        VoiceService.e(this.a).sendEmptyMessageDelayed(6, 1000);
    }
}
