package com.whatsapp;

import java.util.ArrayList;

final class wg implements Runnable {
    final l5 a;

    public void run() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.a);
        App.as.b(arrayList);
    }

    wg(l5 l5Var) {
        this.a = l5Var;
    }
}
