package com.whatsapp;

import android.os.Handler.Callback;
import android.os.Message;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class att implements Callback {
    private static final String z;
    final VoiceService a;

    static {
        char[] toCharArray = "\u0013+a.?\u0016!z(y\u0006!'-d\n4[;|\u0003\fi0t\t!z~c\u0011+x\ru\t\"(0\u007f\u0012".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = arj.Theme_buttonStyleSmall;
                    break;
                case at.g /*1*/:
                    i2 = 68;
                    break;
                case at.i /*2*/:
                    i2 = 8;
                    break;
                case at.o /*3*/:
                    i2 = 94;
                    break;
                default:
                    i2 = 16;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public boolean handleMessage(Message message) {
        switch (message.what) {
            case v.m /*0*/:
                if (Voip.d()) {
                    return true;
                }
                if (VoiceService.q().get() > 0) {
                    VoiceService.n(this.a);
                    if (!DialogToastActivity.f) {
                        return true;
                    }
                }
                Log.i(z);
                VoiceService.g(this.a, true);
                this.a.stopSelf();
                return true;
            default:
                return false;
        }
    }

    att(VoiceService voiceService) {
        this.a = voiceService;
    }
}
