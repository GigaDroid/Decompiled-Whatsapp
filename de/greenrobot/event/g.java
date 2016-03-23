package de.greenrobot.event;

import java.lang.reflect.Method;

final class g {
    final Method a;
    String b;
    final Class c;
    final n d;

    g(Method method, n nVar, Class cls) {
        this.a = method;
        this.d = nVar;
        this.c = cls;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        a();
        g gVar = (g) obj;
        gVar.a();
        return this.b.equals(gVar.b);
    }

    private synchronized void a() {
        if (this.b == null) {
            StringBuilder stringBuilder = new StringBuilder(64);
            stringBuilder.append(this.a.getDeclaringClass().getName());
            stringBuilder.append('#').append(this.a.getName());
            stringBuilder.append('(').append(this.c.getName());
            this.b = stringBuilder.toString();
        }
    }

    public int hashCode() {
        return this.a.hashCode();
    }
}
