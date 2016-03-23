package com.whatsapp.gdrive;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

final class fd {
    private static final ThreadFactory a;
    private static final BlockingQueue b;
    private static final ThreadPoolExecutor c;

    static {
        b = new LinkedBlockingQueue(2);
        a = new a1();
        c = new ThreadPoolExecutor(0, 2, 1, TimeUnit.SECONDS, b, a);
        c.setRejectedExecutionHandler(new bn());
    }

    public static void a(Runnable runnable) {
        c.execute(runnable);
    }
}
