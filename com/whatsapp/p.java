package com.whatsapp;

import com.whatsapp.protocol.bz;
import org.whispersystems.aw;

final class p implements Runnable {
    private final bz a;
    private final int b;
    private final byte[] c;
    private final bz[] d;
    final ai4 e;

    p(ai4 com_whatsapp_ai4, int i, byte[] bArr, bz[] bzVarArr, bz bzVar) {
        this.e = com_whatsapp_ai4;
        this.b = i;
        this.c = bArr;
        this.d = bzVarArr;
        this.a = bzVar;
    }

    public void run() {
        App.a(this.c, aw.c(this.b), (byte) 5, this.d, this.a);
        if (this.e.b != null) {
            App.b(this.e.b);
        }
    }
}
