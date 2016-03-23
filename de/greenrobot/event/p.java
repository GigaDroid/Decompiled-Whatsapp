package de.greenrobot.event;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import org.v;
import org.whispersystems.at;

final class p extends Handler {
    private static final String[] z;
    private final int a;
    private final h b;
    private final f c;
    private boolean d;

    static {
        String[] strArr = new String[2];
        String str = "rMW\u007f(\u0011LMglBGLwlYCLw TP\u0002~)BQCt)";
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
                        i3 = 49;
                        break;
                    case at.g /*1*/:
                        i3 = 34;
                        break;
                    case at.i /*2*/:
                        i3 = 34;
                        break;
                    case at.o /*3*/:
                        i3 = 19;
                        break;
                    default:
                        i3 = 76;
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
                    str = "rMW\u007f(\u0011LMglBGLwlYCLw TP\u0002~)BQCt)";
                    obj = null;
            }
        }
    }

    p(h hVar, Looper looper, int i) {
        super(looper);
        this.b = hVar;
        this.a = i;
        this.c = new f();
    }

    void a(k kVar, Object obj) {
        b a = b.a(kVar, obj);
        synchronized (this) {
            this.c.a(a);
            if (!this.d) {
                try {
                    this.d = true;
                    if (!sendMessage(obtainMessage())) {
                        throw new q(z[1]);
                    }
                } catch (q e) {
                    throw e;
                }
            }
        }
    }

    public void handleMessage(Message message) {
        int i = n.b;
        try {
            long uptimeMillis = SystemClock.uptimeMillis();
            do {
                b a = this.c.a();
                if (a == null) {
                    synchronized (this) {
                        a = this.c.a();
                        if (a == null) {
                            this.d = false;
                            this.d = false;
                            return;
                        }
                    }
                }
                this.b.a(a);
            } while (SystemClock.uptimeMillis() - uptimeMillis < ((long) this.a));
            if (sendMessage(obtainMessage())) {
                this.d = true;
                if (i != 0) {
                    h.p++;
                    return;
                }
                return;
            }
            throw new q(z[0]);
        } catch (q e) {
            throw e;
        } catch (q e2) {
            throw e2;
        } catch (Throwable th) {
            this.d = false;
        }
    }
}
