package de.greenrobot.event;

import org.v;
import org.whispersystems.at;

class d implements Runnable {
    private static final String z;
    private final h a;
    private final f b;

    static {
        char[] toCharArray = "!\u0000,&\u001b\u0001\u000be8\u0019O\u001fc%\nO\u000ez7\u0017\u0003\u000en:\u001b".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 111;
                    break;
                case at.g /*1*/:
                    i2 = 111;
                    break;
                case at.i /*2*/:
                    i2 = 12;
                    break;
                case at.o /*3*/:
                    i2 = 86;
                    break;
                default:
                    i2 = 126;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void run() {
        b a = this.b.a();
        if (a == null) {
            try {
                throw new IllegalStateException(z);
            } catch (IllegalStateException e) {
                throw e;
            }
        }
        this.a.a(a);
    }

    d(h hVar) {
        this.a = hVar;
        this.b = new f();
    }

    public void a(k kVar, Object obj) {
        this.b.a(b.a(kVar, obj));
        this.a.a().execute(this);
    }
}
