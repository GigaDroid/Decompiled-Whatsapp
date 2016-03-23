package com.whatsapp;

import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class arc implements Runnable {
    private static final String z;
    final VoiceService a;

    static {
        char[] toCharArray = "\u000e\u0011\u0007_\u000b\u001b\u001f\u0002Cg\u0019\u000e\u001aZV\u001dQ\u001d[E\n\nNIE\u0011\u0012".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 120;
                    break;
                case at.g /*1*/:
                    i2 = 126;
                    break;
                case at.i /*2*/:
                    i2 = 110;
                    break;
                case at.o /*3*/:
                    i2 = 47;
                    break;
                default:
                    i2 = 36;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    arc(VoiceService voiceService) {
        this.a = voiceService;
    }

    public void run() {
        if (!Voip.startCallRecording(VoiceService.Q(this.a))) {
            Log.w(z);
        }
    }
}
