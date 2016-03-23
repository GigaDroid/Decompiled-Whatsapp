package com.whatsapp.util;

import java.io.InputStream;

class cu extends InputStream {
    int a;
    InputStream b;

    public int read() {
        if (this.a <= 0) {
            return -1;
        }
        this.a--;
        return this.b.read();
    }

    cu(InputStream inputStream, int i) {
        this.b = inputStream;
        this.a = i;
    }
}
