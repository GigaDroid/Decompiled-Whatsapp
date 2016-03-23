package com.google;

public class cB extends RuntimeException {
    static final long serialVersionUID = -4086729973971783390L;

    public cB(String str, Throwable th) {
        super(str, th);
    }

    public cB(Throwable th) {
        super(th);
    }

    public cB(String str) {
        super(str);
    }
}
