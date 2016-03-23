package com.whatsapp;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

class r1 implements OnTouchListener {
    final QuickContactActivity a;

    r1(QuickContactActivity quickContactActivity) {
        this.a = quickContactActivity;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        QuickContactActivity.d(this.a);
        return true;
    }
}
