package com.whatsapp;

import android.os.Handler.Callback;
import android.os.Message;
import org.whispersystems.at;

class axa implements Callback {
    final VoipActivity a;

    public boolean handleMessage(Message message) {
        switch (message.what) {
            case at.g /*1*/:
                VoipActivity.d(this.a);
                break;
            case at.i /*2*/:
                VoipActivity.b(this.a);
                break;
        }
        return true;
    }

    axa(VoipActivity voipActivity) {
        this.a = voipActivity;
    }
}
