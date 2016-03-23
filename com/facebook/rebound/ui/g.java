package com.facebook.rebound.ui;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

class g implements OnTouchListener {
    final SpringConfiguratorView a;

    g(SpringConfiguratorView springConfiguratorView, d dVar) {
        this(springConfiguratorView);
    }

    private g(SpringConfiguratorView springConfiguratorView) {
        this.a = springConfiguratorView;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            SpringConfiguratorView.e(this.a);
        }
        return true;
    }
}
