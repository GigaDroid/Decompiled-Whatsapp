package com.whatsapp.gdrive;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

final class c0 {
    private static final ThreadFactory a;
    private static final ThreadPoolExecutor b;
    private static final BlockingQueue c;

    static {
        c = new LinkedBlockingQueue(4);
        a = new d1();
        b = new ThreadPoolExecutor(0, 4, 1, TimeUnit.SECONDS, c, a);
        b.setRejectedExecutionHandler(new ch());
    }

    public static void a(Runnable runnable) {
        b.execute(runnable);
    }
}
