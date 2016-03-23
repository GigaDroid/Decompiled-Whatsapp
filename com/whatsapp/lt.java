package com.whatsapp;

import android.view.View;
import android.view.ViewTreeObserver.OnPreDrawListener;

class lt implements OnPreDrawListener {
    final View a;
    final HomeActivity b;

    lt(HomeActivity homeActivity, View view) {
        this.b = homeActivity;
        this.a = view;
    }

    public boolean onPreDraw() {
        HomeActivity.g(this.b).d();
        this.a.getViewTreeObserver().removeOnPreDrawListener(this);
        return true;
    }
}
