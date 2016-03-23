package com.whatsapp;

class _0 implements Runnable {
    final String a;
    final ga b;
    final String c;
    final int d;

    public void run() {
        ConversationsFragment.i(this.b.e).setProgress(this.d);
        ConversationsFragment.h(this.b.e).setText(this.a);
        ConversationsFragment.b(this.b.e).setText(this.c);
    }

    _0(ga gaVar, int i, String str, String str2) {
        this.b = gaVar;
        this.d = i;
        this.a = str;
        this.c = str2;
    }
}
