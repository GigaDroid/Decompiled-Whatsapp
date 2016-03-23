package com.whatsapp;

class j1 implements Runnable {
    final ConversationsFragment a;

    j1(ConversationsFragment conversationsFragment) {
        this.a = conversationsFragment;
    }

    public void run() {
        ConversationsFragment.f(this.a);
    }
}
