package com.whatsapp.appwidget;

import com.whatsapp.App;
import com.whatsapp.WAAppCompatActivity;
import com.whatsapp.l5;
import com.whatsapp.notification.an;
import com.whatsapp.notification.aw;
import com.whatsapp.qa;
import java.util.Iterator;

class c implements Runnable {
    private final an a;

    c(an anVar, f fVar) {
        this(anVar);
    }

    private c(an anVar) {
        this.a = anVar;
    }

    public void run() {
        int i;
        boolean z = false;
        boolean z2 = WidgetProvider.a;
        Iterator it = qa.g().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            l5 b = App.as.b((String) it.next());
            if (b.d > 0) {
                i = b.d + i2;
            } else {
                i = i2;
            }
            if (z2) {
                break;
            }
            i2 = i;
        }
        i = i2;
        this.a.a(i + aw.a().d().size());
        if (WAAppCompatActivity.c != 0) {
            if (!z2) {
                z = true;
            }
            WidgetProvider.a = z;
        }
    }
}
