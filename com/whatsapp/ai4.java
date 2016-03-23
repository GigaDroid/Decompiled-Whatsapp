package com.whatsapp;

import com.whatsapp.protocol.ct;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class ai4 implements Runnable {
    private static final String[] z;
    final i1 a;
    final ct b;

    static {
        String[] strArr = new String[2];
        String str = "mY7n\u001axMxj\u0014h\u00016mUyO+g\u001bx\u0001(p\u0010gD!qN,F=l\u0010~@,k\u001bk\u0001+m\u0018i\u00016g\u0002,N6g\u0006";
        Object obj = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i = 0;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i2 = 0; length > i2; i2++) {
                int i3;
                char c = cArr[i2];
                switch (i2 % 5) {
                    case v.m /*0*/:
                        i3 = 12;
                        break;
                    case at.g /*1*/:
                        i3 = 33;
                        break;
                    case at.i /*2*/:
                        i3 = 88;
                        break;
                    case at.o /*3*/:
                        i3 = 2;
                        break;
                    default:
                        i3 = 117;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    i = 1;
                    strArr2 = strArr3;
                    str = "mY7n\u001axMxc\u0005|D6f\u001cbFxc\u0011hH,k\u001ab@4\"\u0005~D3g\f\u007f";
                    obj = null;
            }
        }
    }

    ai4(i1 i1Var, ct ctVar) {
        this.a = i1Var;
        this.b = ctVar;
    }

    public void run() {
        Log.i(z[1]);
        if (!i1.a(this.a).h()) {
            Log.i(z[0]);
            i1.a(this.a).b();
        }
        i1.b(this.a).M().post(new p(this, i1.a(this.a).a(), i1.a(this.a).f(), i1.a(this.a).g(), i1.a(this.a).i().b()));
    }
}
