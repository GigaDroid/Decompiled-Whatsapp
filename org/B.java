package org;

import java.net.DatagramSocket;
import java.nio.charset.Charset;

public abstract class B {
    private static final aF c;
    public static boolean f;
    protected aF a;
    protected int b;
    protected boolean d;
    private Charset e;
    protected DatagramSocket g;

    public boolean b() {
        return this.d;
    }

    public void a(int i) {
        this.b = i;
    }

    public void a() {
        this.g = this.a.a();
        this.g.setSoTimeout(this.b);
        this.d = true;
    }

    public B() {
        boolean z = f;
        this.e = Charset.defaultCharset();
        this.g = null;
        this.b = 0;
        this.d = false;
        this.a = c;
        if (z) {
            K.b++;
        }
    }

    public void c() {
        if (this.g != null) {
            this.g.close();
        }
        this.g = null;
        this.d = false;
    }

    static {
        c = new A();
    }
}
