package com.whatsapp;

class mr implements Runnable {
    final String a;
    final String b;
    final ga c;

    public void run() {
        ConversationsFragment.h(this.c.e).setText(this.a);
        ConversationsFragment.b(this.c.e).setText(this.b);
    }

    mr(ga gaVar, String str, String str2) {
        this.c = gaVar;
        this.a = str;
        this.b = str2;
    }
}
