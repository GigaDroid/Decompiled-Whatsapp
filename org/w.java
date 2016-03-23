package org;

import java.io.Serializable;
import java.util.EventListener;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class w implements Serializable, Iterable {
    public static boolean b = false;
    private static final long serialVersionUID = -1934227607974228213L;
    private final CopyOnWriteArrayList a;

    public Iterator iterator() {
        return this.a.iterator();
    }

    public void b(EventListener eventListener) {
        this.a.add(eventListener);
    }

    public void a(EventListener eventListener) {
        this.a.remove(eventListener);
    }

    public int a() {
        return this.a.size();
    }

    public w() {
        boolean z = b;
        this.a = new CopyOnWriteArrayList();
        if (z) {
            K.b++;
        }
    }
}
