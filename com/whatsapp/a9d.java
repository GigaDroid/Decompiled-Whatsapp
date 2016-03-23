package com.whatsapp;

import java.util.ArrayList;

class a9d implements Runnable {
    final akk a;
    final ArrayList b;

    public void run() {
        if (!this.a.isCancelled()) {
            GroupChatInfo.a(this.a.a, this.b);
        }
    }

    a9d(akk com_whatsapp_akk, ArrayList arrayList) {
        this.a = com_whatsapp_akk;
        this.b = arrayList;
    }
}
