package com.whatsapp.contact;

import android.text.TextUtils;
import com.whatsapp.l5;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class e {
    private final List a;
    private final List b;
    private final List c;
    private final List d;
    private final List e;

    public List g() {
        return this.c;
    }

    public List b() {
        return this.b;
    }

    public void a(l5 l5Var) {
        this.e.add(l5Var);
    }

    public l5[] i() {
        ArrayList arrayList = new ArrayList();
        b(arrayList, this.b);
        b(arrayList, this.d);
        return (l5[]) arrayList.toArray(new l5[arrayList.size()]);
    }

    public List e() {
        return this.a;
    }

    public List d() {
        return this.d;
    }

    public ArrayList h() {
        boolean z = i.d;
        ArrayList arrayList = new ArrayList();
        for (l5 l5Var : this.c) {
            if (!TextUtils.isEmpty(l5Var.p)) {
                arrayList.add(l5Var.p);
                continue;
            }
            if (z) {
                break;
            }
        }
        return arrayList;
    }

    private void b(Collection collection, Collection collection2) {
        boolean z = i.d;
        for (l5 l5Var : collection2) {
            if (l5Var.m && !TextUtils.isEmpty(l5Var.p)) {
                collection.add(l5Var);
                continue;
            }
            if (z) {
                return;
            }
        }
    }

    public void e(l5 l5Var) {
        this.c.add(l5Var);
    }

    private void a(Collection collection, Collection collection2) {
        boolean z = i.d;
        for (l5 l5Var : collection2) {
            if (!(l5Var.l == null || TextUtils.isEmpty(l5Var.l.a()))) {
                collection.add(l5Var.l.a());
                continue;
            }
            if (z) {
                return;
            }
        }
    }

    public void b(l5 l5Var) {
        this.d.add(l5Var);
    }

    public List j() {
        return this.e;
    }

    public boolean f() {
        return this.b.isEmpty() && this.e.isEmpty() && this.c.isEmpty();
    }

    public void c(l5 l5Var) {
        this.b.add(l5Var);
    }

    public ArrayList a() {
        Object arrayList = new ArrayList();
        a(arrayList, this.b);
        a(arrayList, this.e);
        a(arrayList, this.a);
        return arrayList;
    }

    e(a aVar) {
        this();
    }

    public void d(l5 l5Var) {
        this.a.add(l5Var);
    }

    private e() {
        this.b = new ArrayList();
        this.e = new ArrayList();
        this.c = new ArrayList();
        this.a = new ArrayList();
        this.d = new ArrayList();
    }

    public ArrayList c() {
        Object arrayList = new ArrayList();
        a(arrayList, this.b);
        a(arrayList, this.d);
        return arrayList;
    }

    public l5[] k() {
        ArrayList arrayList = new ArrayList();
        b(arrayList, this.b);
        b(arrayList, this.e);
        b(arrayList, this.a);
        return (l5[]) arrayList.toArray(new l5[arrayList.size()]);
    }
}
