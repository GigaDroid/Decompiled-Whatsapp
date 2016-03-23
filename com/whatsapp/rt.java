package com.whatsapp;

import com.whatsapp.protocol.co;
import java.util.ArrayList;
import java.util.Iterator;

class rt implements Runnable {
    final ArrayList a;
    final md b;

    rt(md mdVar, ArrayList arrayList) {
        this.b = mdVar;
        this.a = arrayList;
    }

    public void run() {
        boolean z = DialogToastActivity.f;
        if (!this.b.isCancelled()) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                co coVar = (co) it.next();
                if (coVar.d == 9) {
                    App.s(coVar);
                    if (!z) {
                        continue;
                        if (z) {
                            return;
                        }
                    }
                }
                if (coVar.d == 11) {
                    App.t(coVar);
                    continue;
                } else {
                    continue;
                }
                if (z) {
                    return;
                }
            }
        }
    }
}
