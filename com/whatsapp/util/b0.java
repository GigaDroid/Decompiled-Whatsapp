package com.whatsapp.util;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

class b0 extends FilterOutputStream {
    final x a;

    public void write(int i) {
        try {
            this.out.write(i);
        } catch (IOException e) {
            x.a(this.a, true);
        }
    }

    public void write(byte[] bArr, int i, int i2) {
        try {
            this.out.write(bArr, i, i2);
        } catch (IOException e) {
            x.a(this.a, true);
        }
    }

    private b0(x xVar, OutputStream outputStream) {
        this.a = xVar;
        super(outputStream);
    }

    b0(x xVar, OutputStream outputStream, aa aaVar) {
        this(xVar, outputStream);
    }

    public void close() {
        try {
            this.out.close();
        } catch (IOException e) {
            x.a(this.a, true);
        }
    }

    public void flush() {
        try {
            this.out.flush();
        } catch (IOException e) {
            x.a(this.a, true);
        }
    }
}
