package com.whatsapp;

class axg implements Runnable {
    final CallsFragment a;

    axg(CallsFragment callsFragment) {
        this.a = callsFragment;
    }

    public void run() {
        CallsFragment.h(this.a).notifyDataSetChanged();
        CallsFragment.f(this.a);
    }
}
