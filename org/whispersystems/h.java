package org.whispersystems;

import com.whatsapp.arj;
import org.v;

public class h {
    private static final String z;
    private final ag a;
    private final byte[] b;

    static {
        char[] toCharArray = "2$P\u001f0\u0000>k\r4\u0006$\\\u0018".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = arj.Theme_buttonStyleSmall;
                    break;
                case at.g /*1*/:
                    i2 = 76;
                    break;
                case at.i /*2*/:
                    i2 = 57;
                    break;
                case at.o /*3*/:
                    i2 = arj.Theme_spinnerStyle;
                    break;
                default:
                    i2 = 64;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public byte[] a() {
        return this.b;
    }

    public h(ag agVar, byte[] bArr) {
        this.a = agVar;
        this.b = bArr;
    }

    public C a(E e, e eVar) {
        a_ a_Var = new a_(this.a.a(bx.a(e, eVar.a()), this.b, z.getBytes(), 64));
        return new C(new h(this.a, a_Var.b()), new cd(this.a, a_Var.a(), 0));
    }
}
