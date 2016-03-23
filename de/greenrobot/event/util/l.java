package de.greenrobot.event.util;

import android.util.Log;
import de.greenrobot.event.h;
import org.v;
import org.whispersystems.at;

class l implements Runnable {
    private static final String[] z;
    final e a;
    final m b;

    static {
        String[] strArr = new String[2];
        String str = "{-\u0010\u001dAZ>\u0015ZML<\u001c\n\\]0\u0017@";
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
                        i3 = 52;
                        break;
                    case at.g /*1*/:
                        i3 = 95;
                        break;
                    case at.i /*2*/:
                        i3 = 121;
                        break;
                    case at.o /*3*/:
                        i3 = 122;
                        break;
                    default:
                        i3 = 40;
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
                    str = "w0\f\u0016L\u00141\u0016\u000e\bW-\u001c\u001b\\Q\u007f\u001f\u001bAX*\u000b\u001f\bQ)\u001c\u0014\\";
                    obj = null;
            }
        }
    }

    l(e eVar, m mVar) {
        this.a = eVar;
        this.b = mVar;
    }

    public void run() {
        try {
            this.b.a();
        } catch (Throwable e) {
            try {
                Object newInstance = e.b(this.a).newInstance(new Object[]{e});
                try {
                    if (newInstance instanceof b) {
                        ((b) newInstance).a(e.a(this.a));
                    }
                    e.c(this.a).a(newInstance);
                } catch (Exception e2) {
                    throw e2;
                }
            } catch (Throwable e3) {
                Log.e(h.q, z[0], e);
                throw new RuntimeException(z[1], e3);
            }
        }
    }
}
