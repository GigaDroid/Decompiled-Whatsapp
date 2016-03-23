package com.whatsapp;

class akm implements Runnable {
    final ConversationRow a;

    public void run() {
        this.a.i();
    }

    akm(ConversationRow conversationRow) {
        this.a = conversationRow;
    }
}
