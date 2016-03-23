package com.whatsapp;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

class ec implements OnTouchListener {
    final pz a;
    int[] b;

    public boolean onTouch(View view, MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        view.getLocationOnScreen(this.b);
        x += this.b[0];
        y += this.b[1];
        pz.a(this.a).getLocationOnScreen(this.b);
        x -= this.b[0];
        int i = y - this.b[1];
        if (x < 0 || x >= pz.a(this.a).getWidth() || i < 0 || i >= pz.a(this.a).getHeight()) {
            pz.b(this.a).getLocationOnScreen(this.b);
            x = y - this.b[1];
            if (x >= 0 && x < pz.b(this.a).getHeight()) {
                return true;
            }
            pz.e(this.a).a(view, motionEvent);
            return false;
        }
        pz.a(this.a, true);
        return false;
    }

    ec(pz pzVar) {
        this.a = pzVar;
        this.b = new int[2];
    }
}
