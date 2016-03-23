package de.greenrobot.event;

public class q extends RuntimeException {
    private static final long serialVersionUID = -2912559384646531479L;

    public q(String str) {
        super(str);
    }

    public q(String str, Throwable th) {
        super(str, th);
    }

    public q(Throwable th) {
        super(th);
    }
}
