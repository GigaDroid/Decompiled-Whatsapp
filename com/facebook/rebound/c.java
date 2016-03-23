package com.facebook.rebound;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import org.v;
import org.whispersystems.at;

public class c {
    private static final String[] z;
    private final Map a;
    private final g b;
    private final Set c;
    private final CopyOnWriteArraySet d;
    private boolean e;

    static {
        String[] strArr = new String[5];
        String str = "bn9m\u0016vW/$";
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
                        i3 = 17;
                        break;
                    case at.g /*1*/:
                        i3 = 30;
                        break;
                    case at.i /*2*/:
                        i3 = 75;
                        break;
                    case at.o /*3*/:
                        i3 = 4;
                        break;
                    default:
                        i3 = 120;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "bn9m\u0016vR$k\btlkm\u000b1l.u\rxl.`";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "bn9m\u0016v>\"wXpr9a\u0019ugkv\u001dvw8p\u001dc{/";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "bn9m\u0016v>\"wXc{:q\u0011c{/";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "1z$a\u000b1p$pXc{-a\ntp(aXp>9a\u001fxm?a\ntzkw\bcw%c";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(double r4) {
        /*
        r3 = this;
        r1 = com.facebook.rebound.m.f;
        r0 = r3.d;
        r2 = r0.iterator();
    L_0x0008:
        r0 = r2.hasNext();
        if (r0 == 0) goto L_0x0019;
    L_0x000e:
        r0 = r2.next();
        r0 = (com.facebook.rebound.a) r0;
        r0.b(r3);
        if (r1 == 0) goto L_0x0008;
    L_0x0019:
        r3.a(r4);	 Catch:{ IllegalArgumentException -> 0x0048 }
        r0 = r3.c;	 Catch:{ IllegalArgumentException -> 0x0048 }
        r0 = r0.isEmpty();	 Catch:{ IllegalArgumentException -> 0x0048 }
        if (r0 == 0) goto L_0x0027;
    L_0x0024:
        r0 = 1;
        r3.e = r0;	 Catch:{ IllegalArgumentException -> 0x0048 }
    L_0x0027:
        r0 = r3.d;
        r2 = r0.iterator();
    L_0x002d:
        r0 = r2.hasNext();
        if (r0 == 0) goto L_0x003e;
    L_0x0033:
        r0 = r2.next();
        r0 = (com.facebook.rebound.a) r0;
        r0.a(r3);
        if (r1 == 0) goto L_0x002d;
    L_0x003e:
        r0 = r3.e;	 Catch:{ IllegalArgumentException -> 0x004a }
        if (r0 == 0) goto L_0x0047;
    L_0x0042:
        r0 = r3.b;	 Catch:{ IllegalArgumentException -> 0x004a }
        r0.b();	 Catch:{ IllegalArgumentException -> 0x004a }
    L_0x0047:
        return;
    L_0x0048:
        r0 = move-exception;
        throw r0;
    L_0x004a:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.rebound.c.b(double):void");
    }

    void a(double d) {
        int i = m.f;
        for (m mVar : this.c) {
            try {
                if (mVar.b()) {
                    mVar.d(d / 1000.0d);
                    if (i == 0) {
                        continue;
                        if (i != 0) {
                            return;
                        }
                    }
                }
                this.c.remove(mVar);
                continue;
                if (i != 0) {
                    return;
                }
            } catch (IllegalArgumentException e) {
                throw e;
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        }
    }

    public boolean b() {
        return this.e;
    }

    public c(g gVar) {
        int i = m.f;
        this.a = new HashMap();
        this.c = new CopyOnWriteArraySet();
        this.d = new CopyOnWriteArraySet();
        this.e = true;
        if (gVar == null) {
            throw new IllegalArgumentException(z[2]);
        }
        try {
            this.b = gVar;
            this.b.a(this);
            if (g.b != 0) {
                m.f = i + 1;
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    void a(m mVar) {
        if (mVar == null) {
            try {
                throw new IllegalArgumentException(z[4]);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        try {
            if (this.a.containsKey(mVar.g())) {
                throw new IllegalArgumentException(z[3]);
            }
            this.a.put(mVar.g(), mVar);
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    public m a() {
        m mVar = new m(this);
        a(mVar);
        return mVar;
    }

    void a(String str) {
        m mVar = (m) this.a.get(str);
        if (mVar == null) {
            try {
                throw new IllegalArgumentException(z[0] + str + z[1]);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        try {
            this.c.add(mVar);
            if (b()) {
                this.e = false;
                this.b.a();
            }
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }
}
