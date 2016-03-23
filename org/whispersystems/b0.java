package org.whispersystems;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class b0 {
    private t a;
    private boolean b;
    private LinkedList c;

    public void c() {
        a(new t());
    }

    public boolean a(int i, byte[] bArr) {
        int i2 = Y.r;
        if (this.a.p() == i && Arrays.equals(bArr, this.a.j())) {
            return true;
        }
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            t tVar = (t) it.next();
            if (tVar.p() != i || !Arrays.equals(bArr, tVar.j())) {
                if (i2 != 0) {
                    break;
                }
            }
            return true;
        }
        return false;
    }

    public b0() {
        this.a = new t();
        this.c = new LinkedList();
        this.b = false;
        this.b = true;
    }

    public void b(t tVar) {
        this.a = tVar;
    }

    public void a(t tVar) {
        this.c.addFirst(this.a);
        this.a = tVar;
        if (this.c.size() > 40) {
            this.c.removeLast();
        }
    }

    public byte[] d() {
        int i = Y.r;
        Iterable linkedList = new LinkedList();
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            linkedList.add(((t) it.next()).c());
            if (i != 0) {
                break;
            }
        }
        return S.a().a(this.a.c()).a(linkedList).j().b();
    }

    public boolean b() {
        return this.b;
    }

    public List e() {
        return this.c;
    }

    public t a() {
        return this.a;
    }

    public b0(byte[] bArr) {
        int i = Y.r;
        this.a = new t();
        this.c = new LinkedList();
        this.b = false;
        S a = S.a(bArr);
        this.a = new t(a.k());
        this.b = false;
        for (Y tVar : a.m()) {
            this.c.add(new t(tVar));
            if (i != 0) {
                return;
            }
        }
    }
}
