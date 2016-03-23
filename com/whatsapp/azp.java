package com.whatsapp;

class azp implements Runnable {
    final ga a;

    azp(ga gaVar) {
        this.a = gaVar;
    }

    public void run() {
        ConversationsFragment.l(this.a.e).removeHeaderView(ConversationsFragment.k(this.a.e));
        ConversationsFragment.a(this.a.e, null);
    }
}
