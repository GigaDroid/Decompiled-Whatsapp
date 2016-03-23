package com.google;

import java.io.IOException;

public final class fK extends IOException {
    private static final long serialVersionUID = 1;

    public fK(String str) {
        super(str);
    }

    public fK(Throwable th) {
        initCause(th);
    }

    public fK(String str, Throwable th) {
        super(str);
        initCause(th);
    }
}
