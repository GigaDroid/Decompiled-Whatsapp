package com.whatsapp;

class tu implements Runnable {
    final DialogToastListActivity a;

    public void run() {
        this.a.s.focusableViewAvailable(this.a.s);
    }

    tu(DialogToastListActivity dialogToastListActivity) {
        this.a = dialogToastListActivity;
    }
}
