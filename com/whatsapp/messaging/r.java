package com.whatsapp.messaging;

import android.support.annotation.NonNull;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.v;
import org.whispersystems.at;

class r implements b7, Future {
    private static final String z;
    private final CountDownLatch a;
    private boolean b;
    private Object c;

    static {
        char[] toCharArray = "\u001f|\u0011b\u0004\u001ek\u0004+\u0014\u001ap\u0011n\u0016".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 123;
                    break;
                case at.g /*1*/:
                    i2 = 25;
                    break;
                case at.i /*2*/:
                    i2 = 125;
                    break;
                case at.o /*3*/:
                    i2 = 11;
                    break;
                default:
                    i2 = 114;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public boolean cancel(boolean z) {
        return false;
    }

    public r() {
        this.a = new CountDownLatch(1);
    }

    public boolean isCancelled() {
        return false;
    }

    public boolean isDone() {
        return this.a.getCount() == 0;
    }

    public void m772a() {
        this.c = null;
        this.b = true;
        this.a.countDown();
    }

    private Object a() {
        if (this.b) {
            return this.c;
        }
        throw new ExecutionException(new Exception(z));
    }

    public Object get(long j, @NonNull TimeUnit timeUnit) {
        if (this.a.await(j, timeUnit)) {
            return a();
        }
        throw new TimeoutException();
    }

    public Object get() {
        this.a.await();
        return a();
    }

    public void b() {
        this.c = null;
        this.b = false;
        this.a.countDown();
    }
}
