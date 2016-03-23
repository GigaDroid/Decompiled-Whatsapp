package org;

import java.io.IOException;

public class aj extends IOException {
    public static int a = 0;
    private static final long serialVersionUID = -2602899129433221532L;
    private final long b;

    public long a() {
        return this.b;
    }

    public aj(String str, long j, IOException iOException) {
        super(str);
        initCause(iOException);
        this.b = j;
    }

    public IOException b() {
        return (IOException) getCause();
    }
}
