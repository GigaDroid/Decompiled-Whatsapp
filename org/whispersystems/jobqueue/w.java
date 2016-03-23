package org.whispersystems.jobqueue;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

class w {
    private final LinkedList a;
    private final Set b;

    synchronized v a() {
        v c;
        boolean z = h.c;
        do {
            try {
                c = c();
                if (c != null) {
                    break;
                }
                wait();
            } catch (InterruptedException e) {
                throw new AssertionError(e);
            }
        } while (!z);
        return c;
    }

    synchronized void b(v vVar) {
        this.a.addFirst(vVar);
    }

    synchronized void a(List list) {
        this.a.addAll(list);
        notifyAll();
    }

    private boolean c(String str) {
        return str == null || !this.b.contains(str);
    }

    w() {
        this.b = new HashSet();
        this.a = new LinkedList();
    }

    synchronized void b() {
        notifyAll();
    }

    private void a(String str) {
        if (str != null) {
            this.b.add(str);
        }
    }

    synchronized void a(v vVar) {
        this.a.add(vVar);
        notifyAll();
    }

    synchronized void b(String str) {
        if (str != null) {
            this.b.remove(str);
            notifyAll();
        }
    }

    private v c() {
        boolean z = h.c;
        if (this.a.isEmpty()) {
            return null;
        }
        ListIterator listIterator = this.a.listIterator();
        while (listIterator.hasNext()) {
            v vVar = (v) listIterator.next();
            if (!vVar.g() || !c(vVar.j())) {
                if (z) {
                    break;
                }
            }
            listIterator.remove();
            a(vVar.j());
            return vVar;
        }
        return null;
    }
}
