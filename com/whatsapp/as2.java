package com.whatsapp;

import com.whatsapp.protocol.bz;
import org.whispersystems.aw;

final class as2 implements Runnable {
    private final int a;
    private final bz b;
    private final byte[] c;
    private final bz[] d;
    final az9 e;

    public void run() {
        App.a(this.c, aw.c(this.a), (byte) 5, this.d, this.b);
    }

    as2(az9 com_whatsapp_az9, byte[] bArr, int i, bz[] bzVarArr, bz bzVar) {
        this.e = com_whatsapp_az9;
        this.c = bArr;
        this.a = i;
        this.d = bzVarArr;
        this.b = bzVar;
    }
}
