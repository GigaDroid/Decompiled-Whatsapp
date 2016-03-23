package com.whatsapp;

class a6 implements Runnable {
    final Conversation a;

    a6(Conversation conversation) {
        this.a = conversation;
    }

    public void run() {
        this.a.bc.setFastScrollEnabled(false);
        this.a.bc.setTranscriptMode(2);
        this.a.bd.notifyDataSetChanged();
    }
}
