package org.whispersystems.curve25519;

public class e extends RuntimeException {
    private final Throwable a;

    public Throwable a() {
        return this.a;
    }

    public e(String str) {
        super(str);
        this.a = null;
    }

    public e(Throwable th) {
        this.a = th;
    }
}
