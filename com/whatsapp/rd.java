package com.whatsapp;

import com.whatsapp.protocol.co;
import com.whatsapp.util.cs;
import java.util.ArrayList;
import org.whispersystems.at;

class rd {
    final CallsFragment a;
    private final ArrayList b;

    long c() {
        if (b()) {
            return 0;
        }
        return App.o((co) this.b.get(0));
    }

    l5 f() {
        if (b()) {
            return null;
        }
        return App.as.b(((co) this.b.get(0)).k.c);
    }

    int e() {
        switch (ar1.a[d().ordinal()]) {
            case at.g /*1*/:
                return 2130837706;
            case at.i /*2*/:
                return 2130837704;
            case at.o /*3*/:
                return 2130837705;
            default:
                return 0;
        }
    }

    public boolean a(co coVar) {
        return this.b.isEmpty() || a(coVar, (co) this.b.get(this.b.size() - 1));
    }

    int a() {
        return this.b.size();
    }

    static ArrayList a(rd rdVar) {
        return rdVar.b;
    }

    public boolean b(co coVar) {
        boolean a = a(coVar);
        if (a) {
            this.b.add(coVar);
        }
        return a;
    }

    public String toString() {
        if (b()) {
            return null;
        }
        return f().a(this.a.getActivity());
    }

    public rd(CallsFragment callsFragment, co coVar) {
        this.a = callsFragment;
        this.b = new ArrayList();
        this.b.add(coVar);
    }

    public rd(CallsFragment callsFragment) {
        this.a = callsFragment;
        this.b = new ArrayList();
    }

    public boolean a(co coVar, co coVar2) {
        if (!coVar.k.c.equals(coVar2.k.c) || !cs.a(coVar.b, coVar2.b)) {
            return false;
        }
        boolean z;
        boolean z2;
        if (coVar.k.a || coVar.H != 0) {
            z = false;
        } else {
            z = true;
        }
        if (coVar2.k.a || coVar2.H != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z == z2) {
            return true;
        }
        return false;
    }

    ao1 d() {
        if (b()) {
            return ao1.UNKNOWN;
        }
        co coVar = (co) this.b.get(0);
        if (coVar.k.a) {
            return ao1.OUTGOING;
        }
        if (coVar.H > 0) {
            return ao1.INCOMING;
        }
        return ao1.MISSED;
    }

    boolean b() {
        return this.b.isEmpty();
    }
}
