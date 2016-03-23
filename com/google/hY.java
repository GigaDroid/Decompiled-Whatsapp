package com.google;

import java.io.IOException;

class hY {
    private final fO a;
    private volatile boolean b;
    private final h c;
    private hx d;
    private volatile fO e;

    public hx d() {
        if (!this.b) {
            return this.d;
        }
        synchronized (this) {
            if (this.b) {
                this.d = this.e.a();
                this.b = false;
                hx hxVar = this.d;
                return hxVar;
            }
            hxVar = this.d;
            return hxVar;
        }
    }

    public fO a(fO fOVar) {
        fO fOVar2 = this.e;
        this.e = fOVar;
        this.d = null;
        this.b = true;
        return fOVar2;
    }

    public fO b() {
        a();
        return this.e;
    }

    public boolean equals(Object obj) {
        a();
        return this.e.equals(obj);
    }

    public int c() {
        return this.b ? this.e.getSerializedSize() : this.d.a();
    }

    public int hashCode() {
        a();
        return this.e.hashCode();
    }

    private void a() {
        try {
            if (this.e == null) {
                synchronized (this) {
                    if (this.e != null) {
                        return;
                    }
                    try {
                        if (this.d != null) {
                            this.e = (fO) this.a.getParserForType().b(this.d, this.c);
                        }
                    } catch (IOException e) {
                    }
                }
            }
        } catch (IOException e2) {
            throw e2;
        }
    }

    public hY(fO fOVar, h hVar, hx hxVar) {
        this.b = false;
        this.a = fOVar;
        this.c = hVar;
        this.d = hxVar;
    }

    public String toString() {
        a();
        return this.e.toString();
    }
}
