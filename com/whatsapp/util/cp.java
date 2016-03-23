package com.whatsapp.util;

import java.util.concurrent.LinkedBlockingQueue;

final class cp extends LinkedBlockingQueue {
    public boolean offer(Object obj) {
        return a((Runnable) obj);
    }

    public boolean a(Runnable runnable) {
        if (size() <= 1) {
            return super.offer(runnable);
        }
        return false;
    }

    cp(int i) {
        super(i);
    }
}
