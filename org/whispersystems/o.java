package org.whispersystems;

import java.io.Serializable;
import java.util.Set;

public abstract class o implements Serializable {
    public static boolean a;
    private static final long serialVersionUID = 0;

    public static o d() {
        return p.b;
    }

    public abstract Object a(b2 b2Var);

    public abstract o a(bw bwVar);

    public abstract o a(o oVar);

    public abstract boolean a();

    public abstract Set b();

    public abstract Object c();

    public abstract Object c(Object obj);

    public abstract Object e();

    public abstract boolean equals(Object obj);

    public abstract int hashCode();

    public abstract String toString();

    public static o a(Object obj) {
        return new q(br.a(obj));
    }

    o() {
    }

    public static o b(Object obj) {
        return obj == null ? d() : new q(obj);
    }
}
