package org;

import java.io.Serializable;
import java.util.EventListener;
import java.util.Iterator;

public class I implements Serializable {
    private static final long serialVersionUID = -8017692739988399978L;
    private final Object a;
    private final w b;

    public int a() {
        return this.b.a();
    }

    public void b(y yVar) {
        this.b.b(yVar);
    }

    public void a(String str, String str2) {
        boolean z = B.f;
        E e = new E(this.a, str, str2);
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((y) ((EventListener) it.next())).a(e);
            if (z) {
                return;
            }
        }
    }

    public I(Object obj) {
        this.b = new w();
        this.a = obj;
    }

    public void a(int i, String str) {
        boolean z = B.f;
        E e = new E(this.a, i, str);
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((y) ((EventListener) it.next())).b(e);
            if (z) {
                return;
            }
        }
    }

    public void a(y yVar) {
        this.b.a(yVar);
    }
}
