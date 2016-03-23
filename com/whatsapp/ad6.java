package com.whatsapp;

import com.whatsapp.protocol.co;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;
import org.whispersystems.az;

final class ad6 implements az {
    private static final String z;
    private final co a;
    private final l5 b;
    private final ana c;
    final dt d;

    static {
        char[] toCharArray = ",\u0003e\u000e29\u0017*\u000f8>\bk\u00058m\u001fo\u0001/4\u000b~\u000b2#[b\u00039m\u0015eB9,\u000fkY}.\u0012z\n8?\u000fo\u001a)m\u0014d\u000e$".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 77;
                    break;
                case at.g /*1*/:
                    i2 = 123;
                    break;
                case at.i /*2*/:
                    i2 = 10;
                    break;
                case at.o /*3*/:
                    i2 = 98;
                    break;
                default:
                    i2 = 93;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void a(byte[] bArr) {
        if (!this.a.a()) {
            Log.i(z);
            this.a.a(bArr);
        }
        App.aK.a(this.a, -1, this.c.a, this.b.d);
    }

    public ad6(dt dtVar, co coVar, ana com_whatsapp_ana, l5 l5Var) {
        this.d = dtVar;
        this.a = coVar;
        this.c = com_whatsapp_ana;
        this.b = l5Var;
    }
}
