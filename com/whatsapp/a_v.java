package com.whatsapp;

class a_v implements Runnable {
    final Conversation a;

    a_v(Conversation conversation) {
        this.a = conversation;
    }

    public void run() {
        Conversation.n(this.a).setUnfreezeHeight();
        Conversation.n(this.a).requestLayout();
    }
}
