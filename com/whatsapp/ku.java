package com.whatsapp;

class ku implements Runnable {
    final a35 a;

    ku(a35 com_whatsapp_a35) {
        this.a = com_whatsapp_a35;
    }

    public void run() {
        GroupChatInfo.u(this.a.j).setVisibility(8);
        GroupChatInfo.n(this.a.j).setVisibility(0);
    }
}
