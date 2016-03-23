package com.whatsapp;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import org.v;
import org.whispersystems.at;

class a46 implements OnTouchListener {
    final Handler a;
    final aol b;

    public boolean onTouch(View view, MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            case v.m /*0*/:
                if (aol.h(this.b) != null) {
                    aol.h(this.b).a();
                    this.a.sendEmptyMessageDelayed(0, (long) aol.g());
                    break;
                }
                break;
            case at.g /*1*/:
                this.a.removeMessages(0);
                break;
            case at.o /*3*/:
                this.a.removeMessages(0);
                break;
        }
        return false;
    }

    a46(aol com_whatsapp_aol, Handler handler) {
        this.b = com_whatsapp_aol;
        this.a = handler;
    }
}
