package com.google;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class fv implements ec {
    private eB a;
    private iV b;
    private boolean c;
    private List d;
    private ec e;
    private List f;
    private eq g;
    private boolean h;

    public void a() {
        g();
    }

    public int d() {
        return this.f.size();
    }

    public void d(int i) {
        h();
        this.f.remove(i);
        if (this.d != null) {
            k kVar = (k) this.d.remove(i);
            if (kVar != null) {
                try {
                    kVar.b();
                } catch (NullPointerException e) {
                    throw e;
                }
            }
        }
        g();
        e();
    }

    public boolean i() {
        return this.f.isEmpty();
    }

    public cJ a(int i) {
        c();
        k kVar = (k) this.d.get(i);
        if (kVar == null) {
            k kVar2 = new k((bL) this.f.get(i), this, this.c);
            this.d.set(i, kVar2);
            kVar = kVar2;
        }
        return kVar.d();
    }

    private bL a(int i, boolean z) {
        try {
            if (this.d == null) {
                return (bL) this.f.get(i);
            }
            k kVar = (k) this.d.get(i);
            if (kVar == null) {
                try {
                    return (bL) this.f.get(i);
                } catch (NullPointerException e) {
                    throw e;
                }
            } else if (!z) {
                return kVar.c();
            } else {
                try {
                    return kVar.e();
                } catch (NullPointerException e2) {
                    throw e2;
                }
            }
        } catch (NullPointerException e22) {
            throw e22;
        }
    }

    public fv(List list, boolean z, ec ecVar, boolean z2) {
        this.f = list;
        this.h = z;
        this.e = ecVar;
        this.c = z2;
    }

    private void h() {
        try {
            if (!this.h) {
                this.f = new ArrayList(this.f);
                this.h = true;
            }
        } catch (NullPointerException e) {
            throw e;
        }
    }

    private void e() {
        try {
            if (this.g != null) {
                this.g.a();
            }
            try {
                if (this.b != null) {
                    this.b.a();
                }
                try {
                    if (this.a != null) {
                        this.a.a();
                    }
                } catch (NullPointerException e) {
                    throw e;
                }
            } catch (NullPointerException e2) {
                throw e2;
            }
        } catch (NullPointerException e22) {
            throw e22;
        }
    }

    public fv a(Iterable iterable) {
        boolean z = bA.b;
        for (bL bLVar : iterable) {
            if (bLVar != null) {
                if (z) {
                    break;
                }
            }
            try {
                throw new NullPointerException();
            } catch (NullPointerException e) {
                throw e;
            }
        }
        if (iterable instanceof Collection) {
            try {
                if (((Collection) iterable).size() != 0) {
                    h();
                    for (bL bLVar2 : iterable) {
                        a(bLVar2);
                        if (z) {
                            break;
                        }
                    }
                    g();
                    e();
                }
            } catch (NullPointerException e2) {
                throw e2;
            }
        }
        h();
        for (bL bLVar22 : iterable) {
            a(bLVar22);
            if (z) {
                break;
            }
        }
        g();
        e();
        return this;
    }

    public fv a(bL bLVar) {
        if (bLVar == null) {
            try {
                throw new NullPointerException();
            } catch (NullPointerException e) {
                throw e;
            }
        }
        try {
            h();
            this.f.add(bLVar);
            if (this.d != null) {
                this.d.add(null);
            }
            g();
            e();
            return this;
        } catch (NullPointerException e2) {
            throw e2;
        }
    }

    public void j() {
        boolean z = bA.b;
        this.f = Collections.emptyList();
        this.h = false;
        if (this.d != null) {
            for (k kVar : this.d) {
                if (kVar != null) {
                    try {
                        kVar.b();
                    } catch (NullPointerException e) {
                        throw e;
                    }
                }
                if (z) {
                    break;
                }
            }
            this.d = null;
        }
        g();
        e();
    }

    public fv a(int i, bL bLVar) {
        if (bLVar == null) {
            try {
                throw new NullPointerException();
            } catch (NullPointerException e) {
                throw e;
            }
        }
        h();
        this.f.set(i, bLVar);
        if (this.d != null) {
            k kVar = (k) this.d.set(i, null);
            if (kVar != null) {
                try {
                    kVar.b();
                } catch (NullPointerException e2) {
                    throw e2;
                }
            }
        }
        g();
        e();
        return this;
    }

    public void b() {
        this.e = null;
    }

    public eY b(int i) {
        try {
            if (this.d == null) {
                return (eY) this.f.get(i);
            }
            k kVar = (k) this.d.get(i);
            if (kVar != null) {
                return kVar.h();
            }
            try {
                return (eY) this.f.get(i);
            } catch (NullPointerException e) {
                throw e;
            }
        } catch (NullPointerException e2) {
            throw e2;
        }
    }

    public List f() {
        boolean z = bA.b;
        try {
            int i;
            this.c = true;
            if (!this.h) {
                if (this.d == null) {
                    return this.f;
                }
            }
            if (!this.h) {
                boolean z2;
                int i2 = 0;
                boolean z3 = true;
                while (i2 < this.f.size()) {
                    Object obj = (ci) this.f.get(i2);
                    k kVar = (k) this.d.get(i2);
                    if (kVar != null) {
                        try {
                            if (kVar.e() != obj) {
                                if (!z) {
                                    z2 = false;
                                    break;
                                }
                                z2 = false;
                                i = i2 + 1;
                                if (z) {
                                    break;
                                }
                                i2 = i;
                                z3 = z2;
                            }
                        } catch (NullPointerException e) {
                            throw e;
                        }
                    }
                    z2 = z3;
                    i = i2 + 1;
                    if (z) {
                        break;
                    }
                    i2 = i;
                    z3 = z2;
                }
                z2 = z3;
                if (z2) {
                    try {
                        return this.f;
                    } catch (NullPointerException e2) {
                        throw e2;
                    }
                }
            }
            h();
            i = 0;
            while (i < this.f.size()) {
                this.f.set(i, a(i, true));
                i++;
                if (z) {
                    break;
                }
            }
            this.f = Collections.unmodifiableList(this.f);
            this.h = false;
            return this.f;
        } catch (NullPointerException e22) {
            throw e22;
        } catch (NullPointerException e222) {
            throw e222;
        }
    }

    private void g() {
        try {
            if (!this.c) {
                return;
            }
            if (this.e != null) {
                this.e.a();
                this.c = false;
            }
        } catch (NullPointerException e) {
            throw e;
        } catch (NullPointerException e2) {
            throw e2;
        }
    }

    public bL c(int i) {
        return a(i, false);
    }

    private void c() {
        boolean z = bA.b;
        if (this.d == null) {
            this.d = new ArrayList(this.f.size());
            int i = 0;
            while (i < this.f.size()) {
                this.d.add(null);
                i++;
                if (z) {
                    return;
                }
            }
        }
    }
}
