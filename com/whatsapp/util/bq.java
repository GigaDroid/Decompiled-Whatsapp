package com.whatsapp.util;

import android.os.AsyncTask;
import android.os.Build.VERSION;
import com.whatsapp.App;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class bq {
    private static final ThreadPoolExecutor a;
    private static final b_ b;
    private static final ThreadFactory c;
    private static final BlockingQueue d;

    static b_ d() {
        return b;
    }

    public static String b() {
        return a.toString();
    }

    private static boolean c() {
        return App.j == 1 || App.am >= 1;
    }

    static boolean a() {
        return c();
    }

    public static void a(Runnable runnable) {
        if (c()) {
            b.a(runnable);
        }
        a.execute(runnable);
    }

    @SafeVarargs
    public static AsyncTask a(AsyncTask asyncTask, Object[] objArr) {
        if (VERSION.SDK_INT >= 11) {
            return asyncTask.executeOnExecutor(a, objArr);
        }
        return asyncTask.execute(objArr);
    }

    static {
        d = new cp(2048);
        c = new cx();
        a = new a(5, 128, 1, TimeUnit.SECONDS, d, c);
        a.setRejectedExecutionHandler(new t());
        b = new b_(a, d);
    }
}
