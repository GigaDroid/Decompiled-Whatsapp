package com.whatsapp;

class aaf implements Runnable {
    final Conversation a;
    final int b;

    aaf(Conversation conversation, int i) {
        this.a = conversation;
        this.b = i;
    }

    public void run() {
        this.a.bc.setTranscriptMode(0);
        int a = a4l.a(this.a.bd);
        if (Conversation.i(this.a) != null) {
            a++;
        }
        this.a.bc.setSelectionFromTop(a, this.b);
        Conversation.i(this.a, false);
        Conversation.f(this.a, false);
    }
}
