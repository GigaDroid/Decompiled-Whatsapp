package com.whatsapp;

import android.content.Context;
import com.whatsapp.fieldstats.i;

class ali implements Runnable {
    final App a;
    final Context b;

    ali(App app, Context context) {
        this.a = app;
        this.b = context;
    }

    public void run() {
        i.o(this.b);
    }
}
