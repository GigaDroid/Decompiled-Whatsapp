package com.whatsapp.util;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

final class a extends ThreadPoolExecutor {
    protected void beforeExecute(Thread thread, Runnable runnable) {
        if (bq.a()) {
            bq.d().a(thread, runnable);
        }
    }

    protected void afterExecute(Runnable runnable, Throwable th) {
        if (bq.a()) {
            bq.d().b(runnable);
        }
    }

    a(int i, int i2, long j, TimeUnit timeUnit, BlockingQueue blockingQueue, ThreadFactory threadFactory) {
        super(i, i2, j, timeUnit, blockingQueue, threadFactory);
    }
}
