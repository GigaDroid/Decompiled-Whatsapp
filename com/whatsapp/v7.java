package com.whatsapp;

import java.util.Collection;

class v7 implements Runnable {
    final Collection a;
    final md b;

    v7(md mdVar, Collection collection) {
        this.b = mdVar;
        this.a = collection;
    }

    public void run() {
        if (!this.b.isCancelled()) {
            App.b((String[]) this.a.toArray(new String[this.a.size()]));
        }
    }
}
