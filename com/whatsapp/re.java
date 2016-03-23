package com.whatsapp;

class re implements Runnable {
    final a35 a;
    final int b;

    re(a35 com_whatsapp_a35, int i) {
        this.a = com_whatsapp_a35;
        this.b = i;
    }

    public void run() {
        GroupChatInfo.a(this.a.j, this.b);
    }
}
