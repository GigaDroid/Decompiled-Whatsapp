package com.whatsapp;

import java.util.ArrayList;
import java.util.Iterator;

final class am4 implements Runnable {
    final pi a;
    final boolean b;
    final String c;

    am4(boolean z, String str, pi piVar) {
        this.b = z;
        this.c = str;
        this.a = piVar;
    }

    public void run() {
        boolean z = DialogToastActivity.f;
        ArrayList arrayList = this.b ? (ArrayList) ae2.a().remove(this.c) : (ArrayList) ae2.a().get(this.c);
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                av1 com_whatsapp_av1 = (av1) it.next();
                if (com_whatsapp_av1 != null) {
                    com_whatsapp_av1.a(this.a);
                    continue;
                }
                if (z) {
                    break;
                }
            }
        }
        if (this.a != null) {
            ae2.b().put(this.c, this.a);
        }
    }
}
