package org.whispersystems.jobqueue;

import android.content.Context;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import org.v;
import org.whispersystems.at;
import org.whispersystems.jobqueue.requirements.a;
import org.whispersystems.jobqueue.requirements.b;

public class h implements b {
    public static boolean c;
    private static final String[] z;
    private final e a;
    private final AtomicBoolean b;
    private final List d;
    private final u e;
    private final Context f;
    private final w g;
    private final Executor h;

    static {
        String[] strArr = new String[2];
        String str = "I\u000eaNo";
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
                        i3 = 57;
                        break;
                    case at.g /*1*/:
                        i3 = 97;
                        break;
                    case at.i /*2*/:
                        i3 = 22;
                        break;
                    case at.o /*3*/:
                        i3 = 43;
                        break;
                    default:
                        i3 = 29;
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
                    str = "s\u000ethrW\u0012cFxKL";
                    obj = null;
            }
        }
    }

    static Context b(h hVar) {
        return hVar.f;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.os.PowerManager.WakeLock a(android.content.Context r6, java.lang.String r7, long r8) {
        /*
        r5 = this;
        r0 = z;
        r1 = 0;
        r0 = r0[r1];
        r0 = r6.getSystemService(r0);
        r0 = (android.os.PowerManager) r0;
        r1 = 1;
        r0 = r0.newWakeLock(r1, r7);
        r2 = 0;
        r1 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1));
        if (r1 != 0) goto L_0x001d;
    L_0x0016:
        r0.acquire();
        r1 = c;
        if (r1 == 0) goto L_0x0020;
    L_0x001d:
        r0.acquire(r8);
    L_0x0020:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.jobqueue.h.a(android.content.Context, java.lang.String, long):android.os.PowerManager$WakeLock");
    }

    public void a(v vVar) {
        if (vVar.m()) {
            vVar.a(a(this.f, vVar.toString(), vVar.l()));
        }
        this.h.execute(new x(this, vVar));
    }

    h(Context context, String str, List list, o oVar, t tVar, int i, x xVar) {
        this(context, str, list, oVar, tVar, i);
    }

    static e d(h hVar) {
        return hVar.a;
    }

    static u a(h hVar) {
        return hVar.e;
    }

    public void a() {
        this.h.execute(new i(this));
    }

    static w c(h hVar) {
        return hVar.g;
    }

    public static q a(Context context) {
        return new q(context);
    }

    private h(Context context, String str, List list, o oVar, t tVar, int i) {
        boolean z = c;
        this.g = new w();
        this.h = Executors.newSingleThreadExecutor();
        this.b = new AtomicBoolean(false);
        this.f = context;
        this.e = new u(oVar);
        this.a = new e(context, str, tVar, this.e);
        this.d = list;
        this.h.execute(new a(this, null));
        if (!(list == null || list.isEmpty())) {
            for (a a : list) {
                a.a(this);
                if (z) {
                    break;
                }
            }
        }
        int i2 = 0;
        while (i2 < i) {
            new f(z[1] + i2, this.g, this.a).start();
            i2++;
            if (z) {
                return;
            }
        }
    }
}
