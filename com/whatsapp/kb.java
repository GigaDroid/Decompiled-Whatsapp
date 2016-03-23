package com.whatsapp;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

class kb extends Handler {
    final ViewProfilePhoto a;

    kb(ViewProfilePhoto viewProfilePhoto, Looper looper) {
        this.a = viewProfilePhoto;
        super(looper);
    }

    public void handleMessage(Message message) {
        App.a(App.z(), ViewProfilePhoto.b(this.a).c() ? 2131231145 : 2131231147, 0);
        this.a.findViewById(2131755177).setVisibility(8);
    }
}
