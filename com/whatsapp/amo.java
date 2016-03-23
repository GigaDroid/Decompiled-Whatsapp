package com.whatsapp;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

class amo implements OnTouchListener {
    final k3 a;

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 4) {
            this.a.dismiss();
            return true;
        }
        k3.a(this.a).a(view, motionEvent);
        return false;
    }

    amo(k3 k3Var) {
        this.a = k3Var;
    }
}
