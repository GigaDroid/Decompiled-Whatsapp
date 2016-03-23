package com.whatsapp;

class an1 implements nt {
    final Conversation a;

    public void a() {
        this.a.bd.notifyDataSetChanged();
    }

    an1(Conversation conversation) {
        this.a = conversation;
    }

    public void b() {
        if (Conversation.f(this.a) > 0) {
            Conversation.b(this.a, Conversation.f(this.a) + Conversation.aj(this.a).size());
        }
        Conversation.aj(this.a).clear();
        Conversation.b(this.a).clear();
        Conversation.m(this.a, true);
    }
}
