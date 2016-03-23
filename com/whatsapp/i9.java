package com.whatsapp;

import android.support.annotation.NonNull;
import java.util.concurrent.ThreadFactory;
import org.v;
import org.whispersystems.at;

class i9 implements ThreadFactory {
    private static final String z;
    final VoiceService a;

    static {
        char[] toCharArray = "&h*AW#n\u0004\u007f\u0016\u001cn\rvW$o\u0011t\u0016\u0014".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 112;
                    break;
                case at.g /*1*/:
                    i2 = 7;
                    break;
                case at.i /*2*/:
                    i2 = 99;
                    break;
                case at.o /*3*/:
                    i2 = 17;
                    break;
                default:
                    i2 = 119;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public Thread newThread(@NonNull Runnable runnable) {
        return new Thread(runnable, z);
    }

    i9(VoiceService voiceService) {
        this.a = voiceService;
    }
}
