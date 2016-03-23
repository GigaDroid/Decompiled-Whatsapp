package com.google;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.v;
import org.whispersystems.at;

public abstract class cJ extends c3 {
    private static final String z;
    private boolean a;
    private hJ b;
    private ec c;
    private eV d;

    static {
        char[] toCharArray = "m\u0017-FzP\fdF/I\u000f+F?]_0Zz[\u001adZ,\\\r6\\>]\u001a*\u00158@_7@8Z\u0013%F)\\\fj".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 57;
                    break;
                case at.g /*1*/:
                    i2 = 127;
                    break;
                case at.i /*2*/:
                    i2 = 68;
                    break;
                case at.o /*3*/:
                    i2 = 53;
                    break;
                default:
                    i2 = 90;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    protected abstract bJ internalGetFieldAccessorTable();

    public cJ a(e0 e0Var, Object obj) {
        bJ.a(internalGetFieldAccessorTable(), e0Var).a(this, obj);
        return this;
    }

    void b() {
        this.c = null;
    }

    public c3 clone() {
        return clone();
    }

    protected void f() {
        try {
            if (this.c != null) {
                c();
            }
        } catch (UnsupportedOperationException e) {
            throw e;
        }
    }

    public Object m137clone() {
        return clone();
    }

    public Map a() {
        return Collections.unmodifiableMap(d());
    }

    protected cJ() {
        this(null);
    }

    public final cJ m129a(eV eVVar) {
        this.d = eV.b(this.d).a(eVVar).d();
        g();
        return this;
    }

    public boolean isInitialized() {
        boolean z = bA.b;
        for (e0 e0Var : getDescriptorForType().b()) {
            try {
                if (e0Var.n()) {
                    if (!b(e0Var)) {
                        return false;
                    }
                }
                try {
                    if (e0Var.h() == fD.MESSAGE) {
                        if (e0Var.c()) {
                            for (ci isInitialized : (List) a(e0Var)) {
                                try {
                                    if (isInitialized.isInitialized()) {
                                        if (z) {
                                            break;
                                        }
                                    }
                                    return false;
                                } catch (UnsupportedOperationException e) {
                                    throw e;
                                }
                            }
                            if (!z) {
                                continue;
                            }
                        }
                        try {
                            if (!b(e0Var)) {
                                continue;
                            } else if (!((ci) a(e0Var)).isInitialized()) {
                                return false;
                            }
                        } catch (UnsupportedOperationException e2) {
                            throw e2;
                        } catch (UnsupportedOperationException e22) {
                            throw e22;
                        }
                    }
                    if (z) {
                        break;
                    }
                } catch (UnsupportedOperationException e222) {
                    throw e222;
                }
            } catch (UnsupportedOperationException e2222) {
                throw e2222;
            } catch (UnsupportedOperationException e22222) {
                throw e22222;
            }
        }
        return true;
    }

    public fl m131a(eV eVVar) {
        return b(eVVar);
    }

    private Map d() {
        boolean z = bA.b;
        Map treeMap = new TreeMap();
        for (e0 e0Var : bJ.a(internalGetFieldAccessorTable()).b()) {
            if (e0Var.c()) {
                List list = (List) a(e0Var);
                try {
                    if (!list.isEmpty()) {
                        treeMap.put(e0Var, list);
                    }
                    if (!z) {
                        continue;
                        if (z) {
                            break;
                        }
                    }
                } catch (UnsupportedOperationException e) {
                    throw e;
                }
            }
            try {
                if (b(e0Var)) {
                    treeMap.put(e0Var, a(e0Var));
                    continue;
                } else {
                    continue;
                }
                if (z) {
                    break;
                }
            } catch (UnsupportedOperationException e2) {
                throw e2;
            }
        }
        return treeMap;
    }

    static Map a(cJ cJVar) {
        return cJVar.d();
    }

    protected cJ(ec ecVar) {
        this.d = eV.h();
        this.c = ecVar;
    }

    public c3 a(eV eVVar) {
        return a(eVVar);
    }

    protected boolean m133a() {
        return this.a;
    }

    public final eV getUnknownFields() {
        return this.d;
    }

    public boolean b(e0 e0Var) {
        return bJ.a(internalGetFieldAccessorTable(), e0Var).a(this);
    }

    public cJ m135clone() {
        throw new UnsupportedOperationException(z);
    }

    public fn getDescriptorForType() {
        return bJ.a(internalGetFieldAccessorTable());
    }

    public fl m130a(e0 e0Var, Object obj) {
        return a(e0Var, obj);
    }

    public final cJ b(eV eVVar) {
        this.d = eVVar;
        g();
        return this;
    }

    protected final void g() {
        try {
            if (!this.a) {
                return;
            }
            if (this.c != null) {
                this.c.a();
                this.a = false;
            }
        } catch (UnsupportedOperationException e) {
            throw e;
        } catch (UnsupportedOperationException e2) {
            throw e2;
        }
    }

    public fl m134b(e0 e0Var, Object obj) {
        return b(e0Var, obj);
    }

    public Object m132a(e0 e0Var) {
        Object b = bJ.a(internalGetFieldAccessorTable(), e0Var).b(this);
        try {
            if (e0Var.c()) {
                b = Collections.unmodifiableList((List) b);
            }
            return b;
        } catch (UnsupportedOperationException e) {
            throw e;
        }
    }

    protected ec e() {
        try {
            if (this.b == null) {
                this.b = new hJ(this, null);
            }
            return this.b;
        } catch (UnsupportedOperationException e) {
            throw e;
        }
    }

    protected void c() {
        this.a = true;
    }

    public cJ b(e0 e0Var, Object obj) {
        bJ.a(internalGetFieldAccessorTable(), e0Var).b(this, obj);
        return this;
    }

    public ch m136clone() {
        return clone();
    }

    public fl a(e0 e0Var) {
        return bJ.a(internalGetFieldAccessorTable(), e0Var).a();
    }
}
