package com.whatsapp.observablelistview;

import android.view.MotionEvent;
import android.view.ViewGroup;

class a implements Runnable {
    final ObservableListView a;
    final ViewGroup b;
    final MotionEvent c;

    a(ObservableListView observableListView, ViewGroup viewGroup, MotionEvent motionEvent) {
        this.a = observableListView;
        this.b = viewGroup;
        this.c = motionEvent;
    }

    public void run() {
        this.b.dispatchTouchEvent(this.c);
    }
}
