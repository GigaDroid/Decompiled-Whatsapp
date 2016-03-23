package com.whatsapp;

class azo implements Runnable {
    final ga a;

    azo(ga gaVar) {
        this.a = gaVar;
    }

    public void run() {
        ConversationsFragment.i(this.a.e).setVisibility(0);
        ConversationsFragment.i(this.a.e).setIndeterminate(true);
    }
}
