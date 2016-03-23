package com.google;

import java.util.ArrayList;
import java.util.Collections;

public final class hp {
    private b7 a;

    public hp a(int i) {
        if (b7.c(this.a) == null) {
            b7.e(this.a, new ArrayList());
        }
        b7.c(this.a).add(Integer.valueOf(i));
        return this;
    }

    private hp() {
    }

    public hp b(long j) {
        if (b7.d(this.a) == null) {
            b7.d(this.a, new ArrayList());
        }
        b7.d(this.a).add(Long.valueOf(j));
        return this;
    }

    private static hp a() {
        hp hpVar = new hp();
        hpVar.a = new b7(null);
        return hpVar;
    }

    public hp a(eV eVVar) {
        if (b7.e(this.a) == null) {
            b7.c(this.a, new ArrayList());
        }
        b7.e(this.a).add(eVVar);
        return this;
    }

    public b7 c() {
        if (b7.b(this.a) == null) {
            b7.a(this.a, Collections.emptyList());
        } else {
            b7.a(this.a, Collections.unmodifiableList(b7.b(this.a)));
        }
        if (b7.c(this.a) == null) {
            b7.e(this.a, Collections.emptyList());
        } else {
            b7.e(this.a, Collections.unmodifiableList(b7.c(this.a)));
        }
        if (b7.d(this.a) == null) {
            b7.d(this.a, Collections.emptyList());
        } else {
            b7.d(this.a, Collections.unmodifiableList(b7.d(this.a)));
        }
        if (b7.a(this.a) == null) {
            b7.b(this.a, Collections.emptyList());
        } else {
            b7.b(this.a, Collections.unmodifiableList(b7.a(this.a)));
        }
        if (b7.e(this.a) == null) {
            b7.c(this.a, Collections.emptyList());
        } else {
            b7.c(this.a, Collections.unmodifiableList(b7.e(this.a)));
        }
        b7 b7Var = this.a;
        this.a = null;
        return b7Var;
    }

    public hp a(long j) {
        if (b7.b(this.a) == null) {
            b7.a(this.a, new ArrayList());
        }
        b7.b(this.a).add(Long.valueOf(j));
        return this;
    }

    static hp b() {
        return a();
    }

    public hp a(hx hxVar) {
        if (b7.a(this.a) == null) {
            b7.b(this.a, new ArrayList());
        }
        b7.a(this.a).add(hxVar);
        return this;
    }

    public hp a(b7 b7Var) {
        if (!b7.b(b7Var).isEmpty()) {
            if (b7.b(this.a) == null) {
                b7.a(this.a, new ArrayList());
            }
            b7.b(this.a).addAll(b7.b(b7Var));
        }
        if (!b7.c(b7Var).isEmpty()) {
            if (b7.c(this.a) == null) {
                b7.e(this.a, new ArrayList());
            }
            b7.c(this.a).addAll(b7.c(b7Var));
        }
        if (!b7.d(b7Var).isEmpty()) {
            if (b7.d(this.a) == null) {
                b7.d(this.a, new ArrayList());
            }
            b7.d(this.a).addAll(b7.d(b7Var));
        }
        if (!b7.a(b7Var).isEmpty()) {
            if (b7.a(this.a) == null) {
                b7.b(this.a, new ArrayList());
            }
            b7.a(this.a).addAll(b7.a(b7Var));
        }
        if (!b7.e(b7Var).isEmpty()) {
            if (b7.e(this.a) == null) {
                b7.c(this.a, new ArrayList());
            }
            b7.e(this.a).addAll(b7.e(b7Var));
        }
        return this;
    }
}
