package com.whatsapp;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.annotation.NonNull;
import com.whatsapp.util.bq;
import org.v;
import org.whispersystems.at;

class xm extends Handler {
    private static final String z;
    final VerifySms a;

    static {
        char[] toCharArray = "f78Rwq6".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 20;
                    break;
                case at.g /*1*/:
                    i2 = 82;
                    break;
                case at.i /*2*/:
                    i2 = 76;
                    break;
                case at.o /*3*/:
                    i2 = 32;
                    break;
                default:
                    i2 = 30;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void handleMessage(Message message) {
        switch (message.what) {
            case at.g /*1*/:
                bq.a(new aze(this.a), new String[]{(String) message.obj, z});
            default:
        }
    }

    public xm(@NonNull VerifySms verifySms, Looper looper) {
        this.a = verifySms;
        super((Looper) auv.a((Object) looper));
    }
}
