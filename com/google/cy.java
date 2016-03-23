package com.google;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public class cy extends AbstractList implements fs, RandomAccess {
    public static final fs a;
    private final List b;

    public boolean addAll(int i, Collection collection) {
        if (collection instanceof fs) {
            collection = ((fs) collection).a();
        }
        boolean addAll = this.b.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    public void a(hx hxVar) {
        this.b.add(hxVar);
        this.modCount++;
    }

    public String m148a(int i) {
        Object remove = this.b.remove(i);
        this.modCount++;
        return a(remove);
    }

    public boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    private String a(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        return ((hx) obj).e();
    }

    public void add(int i, Object obj) {
        b(i, (String) obj);
    }

    public List a() {
        return Collections.unmodifiableList(this.b);
    }

    static {
        a = new Z(new cy());
    }

    public void b(int i, String str) {
        this.b.add(i, str);
        this.modCount++;
    }

    public String b(int i) {
        Object obj = this.b.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        hx hxVar = (hx) obj;
        String e = hxVar.e();
        if (hxVar.d()) {
            this.b.set(i, e);
        }
        return e;
    }

    public void clear() {
        this.b.clear();
        this.modCount++;
    }

    public int size() {
        return this.b.size();
    }

    public cy(fs fsVar) {
        this.b = new ArrayList(fsVar.size());
        addAll(fsVar);
    }

    public String a(int i, String str) {
        return a(this.b.set(i, str));
    }

    public hx a(int i) {
        Object obj = this.b.get(i);
        if (!(obj instanceof String)) {
            return (hx) obj;
        }
        hx a = hx.a((String) obj);
        this.b.set(i, a);
        return a;
    }

    public Object get(int i) {
        return b(i);
    }

    public cy() {
        this.b = new ArrayList();
    }

    public Object set(int i, Object obj) {
        return a(i, (String) obj);
    }

    public Object remove(int i) {
        return a(i);
    }
}
