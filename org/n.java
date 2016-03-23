package org;

public class n extends RuntimeException {
    public static boolean a = false;
    private static final long serialVersionUID = 5563335279583210658L;

    @Deprecated
    public Throwable a() {
        return super.getCause();
    }

    public n(String str, Throwable th) {
        super(str, th);
    }

    public n(String str) {
        super(str);
    }
}
