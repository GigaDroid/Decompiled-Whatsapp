package org.whispersystems.jobqueue;

import java.util.LinkedList;
import java.util.List;
import org.whispersystems.jobqueue.requirements.d;

public class m {
    private j a;
    private boolean b;
    private long c;
    private int d;
    private String e;
    private boolean f;
    private List g;

    public m a(String str) {
        this.e = str;
        return this;
    }

    public s b() {
        return new s(this.g, this.b, this.e, this.a, this.d, this.f, this.c, null);
    }

    public m a(d dVar) {
        this.g.add(dVar);
        return this;
    }

    public m() {
        boolean z = h.c;
        this.g = new LinkedList();
        this.b = false;
        this.a = null;
        this.d = 100;
        this.e = null;
        this.f = false;
        this.c = 0;
        if (z) {
            v.d++;
        }
    }

    public m a() {
        this.b = true;
        return this;
    }
}
