package org;

import com.whatsapp.protocol.bo;
import java.io.OutputStream;

public class j implements bo {
    final g a;
    private final OutputStream b;

    public void a(byte[] bArr, int i, int i2) {
        this.b.write(g.a(this.a).a(g.c(this.a).getAndIncrement(), new byte[0], bArr, i, i2));
    }

    public void a() {
        this.b.flush();
    }

    j(g gVar, OutputStream outputStream) {
        this.a = gVar;
        this.b = outputStream;
    }
}
