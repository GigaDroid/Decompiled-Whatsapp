package org.whispersystems.jobqueue;

import android.os.PowerManager.WakeLock;
import java.io.Serializable;
import java.util.List;
import org.whispersystems.jobqueue.requirements.d;

public abstract class v implements Serializable {
    public static int d;
    private transient long a;
    private final s b;
    private transient int c;
    private transient WakeLock e;

    public abstract boolean a(Exception exception);

    public abstract void b();

    public abstract void i();

    public String j() {
        return this.b.g();
    }

    public abstract void n();

    public long c() {
        return this.a;
    }

    public int f() {
        return this.b.e();
    }

    public WakeLock k() {
        return this.e;
    }

    public int h() {
        return this.c;
    }

    public void a(long j) {
        this.a = j;
    }

    public long l() {
        return this.b.h();
    }

    public void a(WakeLock wakeLock) {
        this.e = wakeLock;
    }

    public boolean d() {
        return this.b.a();
    }

    public j a() {
        return this.b.d();
    }

    public v(s sVar) {
        this.b = sVar;
    }

    public boolean m() {
        return this.b.c();
    }

    public void a(j jVar) {
        this.b.a(jVar);
    }

    public boolean g() {
        boolean z = h.c;
        for (d a : this.b.b()) {
            if (a.a()) {
                if (z) {
                    break;
                }
            }
            return false;
        }
        return true;
    }

    public List e() {
        return this.b.b();
    }

    public void a(int i) {
        this.c = i;
    }
}
