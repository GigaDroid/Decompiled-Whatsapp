package com.whatsapp;

import android.app.Activity;
import android.content.Context;
import com.whatsapp.util.bq;
import de.greenrobot.event.h;
import java.util.Hashtable;

public class aup {
    private static long a;
    private static final Hashtable b;

    public static synchronized void d(String str) {
        synchronized (aup.class) {
            b.put(str, str);
        }
    }

    public static synchronized boolean a(String str) {
        boolean contains;
        synchronized (aup.class) {
            contains = b.contains(str);
        }
        return contains;
    }

    public static synchronized void c(String str) {
        synchronized (aup.class) {
            b.put(str, str);
        }
    }

    public static synchronized boolean b() {
        boolean z;
        synchronized (aup.class) {
            z = a == -1 || System.currentTimeMillis() - a >= 86400000;
        }
        return z;
    }

    public static synchronized int g() {
        int size;
        synchronized (aup.class) {
            size = b.size();
        }
        return size;
    }

    public static synchronized Hashtable f() {
        Hashtable hashtable;
        synchronized (aup.class) {
            hashtable = new Hashtable(b);
        }
        return hashtable;
    }

    public static boolean a(Activity activity, boolean z, String str) {
        if (App.Q()) {
            App.a((by) activity, 0, 2131231813);
            bq.a(new p6(activity, z, str));
            return true;
        }
        App.a((Context) activity, 2131231560, 0);
        return false;
    }

    static {
        a = -1;
        b = new Hashtable();
    }

    public static synchronized void e() {
        synchronized (aup.class) {
            b.clear();
        }
    }

    public static synchronized void c() {
        synchronized (aup.class) {
            a = -1;
        }
    }

    public static synchronized void a() {
        synchronized (aup.class) {
            if (!b.isEmpty()) {
                App.a(b.values());
            }
            a = System.currentTimeMillis();
            h.b().a(new az7());
        }
    }

    public static synchronized void b(String str) {
        synchronized (aup.class) {
            b.remove(str);
        }
    }

    public static synchronized boolean d() {
        boolean z;
        synchronized (aup.class) {
            z = a != -1;
        }
        return z;
    }
}
