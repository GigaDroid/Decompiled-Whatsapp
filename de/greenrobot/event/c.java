package de.greenrobot.event;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class c {
    private static final ExecutorService e;
    boolean a;
    boolean b;
    List c;
    ExecutorService d;
    boolean f;
    boolean g;
    boolean h;
    boolean i;

    c() {
        this.h = true;
        this.f = true;
        this.i = true;
        this.a = true;
        this.g = true;
        this.d = e;
    }

    static {
        e = Executors.newCachedThreadPool();
    }
}
