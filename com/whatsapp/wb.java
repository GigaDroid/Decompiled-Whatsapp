package com.whatsapp;

class wb implements Runnable {
    final ga a;

    public void run() {
        ConversationsFragment.l(this.a.e).removeHeaderView(ConversationsFragment.k(this.a.e));
        ConversationsFragment.a(this.a.e, null);
    }

    wb(ga gaVar) {
        this.a = gaVar;
    }
}
