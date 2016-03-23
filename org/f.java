package org;

import java.io.IOException;

public class f extends IOException {
    public f(String str, Throwable th) {
        super(str);
        initCause(th);
    }

    public f(Throwable th) {
        initCause(th);
    }

    public f(String str) {
        super(str);
    }
}
