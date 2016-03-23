package com.google;

public class ip extends Exception {
    private static final long serialVersionUID = -1219262335729891920L;

    public ip(String str) {
        super(str);
    }

    public ip(Throwable th) {
        super(th);
    }

    public ip(String str, Throwable th) {
        super(str, th);
    }
}
