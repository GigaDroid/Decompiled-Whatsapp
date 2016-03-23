package com.whatsapp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map.Entry;

class m8 implements Runnable {
    final j2 a;

    public void run() {
        boolean z = DialogToastActivity.f;
        ArrayList arrayList = new ArrayList();
        synchronized (j2.d(this.a)) {
            for (Entry entry : j2.b(this.a).entrySet()) {
                Long l = (Long) entry.getValue();
                if (l.longValue() != 0 && l.longValue() < System.currentTimeMillis()) {
                    arrayList.add(entry);
                    continue;
                }
                if (z) {
                    break;
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) ((Entry) it.next()).getKey();
            this.a.b(str);
            Iterator it2 = j2.a(this.a).iterator();
            while (it2.hasNext()) {
                ((at7) it2.next()).a(str);
                App.l(str);
                if (z) {
                    break;
                    continue;
                }
            }
            if (z) {
                break;
            }
        }
        j2.c(this.a);
    }

    m8(j2 j2Var) {
        this.a = j2Var;
    }
}
