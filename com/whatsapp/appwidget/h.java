package com.whatsapp.appwidget;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import com.whatsapp.App;
import com.whatsapp.l5;
import com.whatsapp.qa;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

class h implements Runnable {
    private final AtomicBoolean a;
    private final Context b;
    private final AppWidgetManager c;
    private final int[] d;

    static Context a(h hVar) {
        return hVar.b;
    }

    private ArrayList c() {
        boolean z = WidgetProvider.a;
        if (b()) {
            return null;
        }
        ArrayList g = qa.g();
        List arrayList = new ArrayList();
        Iterator it = g.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!b()) {
                l5 b = App.as.b(str);
                if (b.d > 0) {
                    Collection b2 = App.aK.b(str, Math.min(b.d, 100));
                    if (b2 != null) {
                        arrayList.addAll(b2);
                        continue;
                    } else {
                        continue;
                    }
                }
                if (z) {
                    break;
                }
            }
            return null;
        }
        Collections.sort(arrayList, new d(this));
        return arrayList;
    }

    public void a() {
        this.a.set(true);
    }

    static AppWidgetManager c(h hVar) {
        return hVar.c;
    }

    private boolean b() {
        return this.a.get();
    }

    static int[] b(h hVar) {
        return hVar.d;
    }

    public void run() {
        ArrayList c = c();
        if (c != null) {
            App.p.M().post(new a(this, c));
        }
    }

    h(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        this.a = new AtomicBoolean();
        this.b = context;
        this.c = appWidgetManager;
        this.d = iArr;
    }
}
