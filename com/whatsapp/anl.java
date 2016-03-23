package com.whatsapp;

import com.whatsapp.appwidget.WidgetProvider;

final class anl implements Runnable {
    final l5 a;

    public void run() {
        App.a(new k4(this));
        App.l(this.a.p);
        WidgetProvider.a(App.z());
        App.at();
    }

    anl(l5 l5Var) {
        this.a = l5Var;
    }
}
