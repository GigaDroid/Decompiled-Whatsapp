package de.greenrobot.event;

import android.os.Looper;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class h {
    private static final Map c;
    static volatile h e;
    private static final c o;
    public static int p;
    public static String q;
    private static final String[] z;
    private final boolean a;
    private final boolean b;
    private final d d;
    private final Map f;
    private final Map g;
    private final i h;
    private final boolean i;
    private final p j;
    private final Map k;
    private final ExecutorService l;
    private final boolean m;
    private final boolean n;
    private final boolean r;
    private final o s;
    private final ThreadLocal t;

    public h() {
        this(o);
    }

    private boolean a(Object obj, j jVar, Class cls) {
        synchronized (this) {
            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.f.get(cls);
        }
        if (copyOnWriteArrayList != null) {
            try {
                if (!copyOnWriteArrayList.isEmpty()) {
                    Iterator it = copyOnWriteArrayList.iterator();
                    loop0:
                    while (it.hasNext()) {
                        Object obj2;
                        k kVar = (k) it.next();
                        jVar.b = obj;
                        jVar.c = kVar;
                        try {
                            a(kVar, obj, jVar.a);
                            obj2 = jVar.e;
                            continue;
                        } finally {
                            jVar.b = null;
                            jVar.c = null;
                            jVar.e = false;
                        }
                        if (obj2 != null) {
                            break loop0;
                        }
                    }
                    return true;
                }
            } catch (q e) {
                throw e;
            }
        }
        return false;
    }

    public void d(Object obj) {
        synchronized (this.g) {
            this.g.put(obj.getClass(), obj);
        }
        a(obj);
    }

    void a(b bVar) {
        Object obj = bVar.c;
        k kVar = bVar.a;
        try {
            b.a(bVar);
            if (kVar.d) {
                a(kVar, obj);
            }
        } catch (q e) {
            throw e;
        }
    }

    private void a(k kVar, Object obj, boolean z) {
        try {
            switch (e.a[kVar.c.d.ordinal()]) {
                case at.g /*1*/:
                    a(kVar, obj);
                    return;
                case at.i /*2*/:
                    if (z) {
                        try {
                            a(kVar, obj);
                            return;
                        } catch (q e) {
                            throw e;
                        }
                    }
                    this.j.a(kVar, obj);
                    return;
                case at.o /*3*/:
                    if (z) {
                        try {
                            this.h.a(kVar, obj);
                            return;
                        } catch (q e2) {
                            throw e2;
                        }
                    }
                    a(kVar, obj);
                    return;
                case at.p /*4*/:
                    this.d.a(kVar, obj);
                    return;
                default:
                    throw new IllegalStateException(z[1] + kVar.c.d);
            }
        } catch (q e22) {
            throw e22;
        }
        throw e22;
    }

    public Object b(Class cls) {
        Object cast;
        synchronized (this.g) {
            cast = cls.cast(this.g.get(cls));
        }
        return cast;
    }

    private List a(Class cls) {
        List list;
        synchronized (c) {
            list = (List) c.get(cls);
            if (list == null) {
                list = new ArrayList();
                for (Class cls2 = cls; cls2 != null; cls2 = cls2.getSuperclass()) {
                    list.add(cls2);
                    a(list, cls2.getInterfaces());
                }
                c.put(cls, list);
            }
        }
        return list;
    }

    ExecutorService a() {
        return this.l;
    }

    private void a(Object obj, j jVar) {
        boolean z;
        Class cls = obj.getClass();
        if (this.m) {
            List a = a(cls);
            boolean z2 = false;
            for (int i = 0; i < a.size(); i++) {
                z2 |= a(obj, jVar, (Class) a.get(i));
            }
            z = z2;
        } else {
            z = a(obj, jVar, cls);
        }
        if (!z) {
            try {
                if (this.i) {
                    Log.d(q, z[6] + cls);
                }
                try {
                    if (!this.n) {
                        return;
                    }
                    if (cls != m.class) {
                        try {
                            if (cls != a.class) {
                                a(new m(this, obj));
                            }
                        } catch (q e) {
                            throw e;
                        }
                    }
                } catch (q e2) {
                    throw e2;
                } catch (q e22) {
                    throw e22;
                }
            } catch (q e222) {
                throw e222;
            }
        }
    }

    private void a(Object obj, Class cls) {
        int i = 0;
        int i2 = n.b;
        List list = (List) this.f.get(cls);
        if (list != null) {
            int size = list.size();
            while (i < size) {
                k kVar = (k) list.get(i);
                try {
                    int i3;
                    if (kVar.a == obj) {
                        kVar.d = false;
                        list.remove(i);
                        i3 = i - 1;
                        i = size - 1;
                    } else {
                        i3 = i;
                        i = size;
                    }
                    i3++;
                    if (i2 == 0) {
                        size = i;
                        i = i3;
                    } else {
                        return;
                    }
                } catch (q e) {
                    throw e;
                }
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void c(java.lang.Object r5) {
        /*
        r4 = this;
        monitor-enter(r4);
        r1 = de.greenrobot.event.n.b;	 Catch:{ all -> 0x004c }
        r0 = r4.k;	 Catch:{ all -> 0x004c }
        r0 = r0.get(r5);	 Catch:{ all -> 0x004c }
        r0 = (java.util.List) r0;	 Catch:{ all -> 0x004c }
        if (r0 == 0) goto L_0x0029;
    L_0x000d:
        r2 = r0.iterator();	 Catch:{ all -> 0x004c }
    L_0x0011:
        r0 = r2.hasNext();	 Catch:{ all -> 0x004c }
        if (r0 == 0) goto L_0x0022;
    L_0x0017:
        r0 = r2.next();	 Catch:{ all -> 0x004c }
        r0 = (java.lang.Class) r0;	 Catch:{ all -> 0x004c }
        r4.a(r5, r0);	 Catch:{ all -> 0x004c }
        if (r1 == 0) goto L_0x0011;
    L_0x0022:
        r0 = r4.k;	 Catch:{ q -> 0x004a }
        r0.remove(r5);	 Catch:{ q -> 0x004a }
        if (r1 == 0) goto L_0x0048;
    L_0x0029:
        r0 = q;	 Catch:{ q -> 0x004a }
        r1 = new java.lang.StringBuilder;	 Catch:{ q -> 0x004a }
        r1.<init>();	 Catch:{ q -> 0x004a }
        r2 = z;	 Catch:{ q -> 0x004a }
        r3 = 0;
        r2 = r2[r3];	 Catch:{ q -> 0x004a }
        r1 = r1.append(r2);	 Catch:{ q -> 0x004a }
        r2 = r5.getClass();	 Catch:{ q -> 0x004a }
        r1 = r1.append(r2);	 Catch:{ q -> 0x004a }
        r1 = r1.toString();	 Catch:{ q -> 0x004a }
        android.util.Log.w(r0, r1);	 Catch:{ q -> 0x004a }
    L_0x0048:
        monitor-exit(r4);
        return;
    L_0x004a:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x004c }
    L_0x004c:
        r0 = move-exception;
        monitor-exit(r4);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: de.greenrobot.event.h.c(java.lang.Object):void");
    }

    static {
        String[] strArr = new String[14];
        String str = "k90B5J%0T$\u00188=\u0011#V>7V?K87CvO-!\u00118W8rC3_%!E3J)6\u00114]*=C3\u0002l";
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
                        i3 = 56;
                        break;
                    case at.g /*1*/:
                        i3 = 76;
                        break;
                    case at.i /*2*/:
                        i3 = 82;
                        break;
                    case at.o /*3*/:
                        i3 = 49;
                        break;
                    default:
                        i3 = 86;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "q\"&T$V->\u00113J>=Cx\u0018\r0^$Ll!E7L)rF7Kl<^\"\u0018>7B3L";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "k90B5J%0T$\u0018";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "\u0018->C3Y(+\u0011$]+;B\"]>7UvL#rT ]\"&\u0011";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "m\"7I&]/&T2\u0018)*R3H8;^8";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "v#rB#Z?1C?Z) BvJ)5X%L) T2\u0018*=Cv]:7_\"\u0018";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "q\"$^=Q\"5\u0011%M.!R$Q.7Cv^-;]3\\";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\u00188=\u0011%M.!R$Q.;_1\u0018/>P%Kl";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "{#']2\u0018\"=Ev\\%!A7L/:\u00113N)<El\u0018";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "\u0018/3D%](rT.[)\"E?W\"rX8\u0018";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "\u00188:C3Ol3_v]41T&L%=_";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "q\";E?Y rT ]\"&\u0011";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "k90B5J%0T$}41T&L%=_\u0013N)<EvK90B5J%0T$\u0018";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    z = strArr3;
                    char[] toCharArray2 = "}:7_\"".toCharArray();
                    int length2 = toCharArray2.length;
                    char[] cArr2 = toCharArray2;
                    for (int i4 = 0; length2 > i4; i4++) {
                        int i5;
                        char c2 = cArr2[i4];
                        switch (i4 % 5) {
                            case v.m /*0*/:
                                i5 = 56;
                                break;
                            case at.g /*1*/:
                                i5 = 76;
                                break;
                            case at.i /*2*/:
                                i5 = 82;
                                break;
                            case at.o /*3*/:
                                i5 = 49;
                                break;
                            default:
                                i5 = 86;
                                break;
                        }
                        cArr2[i4] = (char) (i5 ^ c2);
                    }
                    q = new String(cArr2).intern();
                    o = new c();
                    c = new HashMap();
                    return;
                default:
                    strArr2[i] = str;
                    str = "m\"9_9O\"rE>J)3UvU#6Tl\u0018";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    private void a(k kVar, Object obj, Throwable th) {
        try {
            if (!(obj instanceof a)) {
                try {
                    if (this.a) {
                        throw new q(z[7], th);
                    }
                    try {
                        if (this.r) {
                            Log.e(q, z[9] + obj.getClass() + z[8] + kVar.a.getClass(), th);
                        }
                        if (this.b) {
                            a(new a(this, th, obj, kVar.a));
                        }
                    } catch (q e) {
                        throw e;
                    }
                } catch (q e2) {
                    throw e2;
                }
            } else if (this.r) {
                Log.e(q, z[13] + kVar.a.getClass() + z[11], th);
                a aVar = (a) obj;
                Log.e(q, z[12] + aVar.d + z[10] + aVar.a, aVar.b);
            }
        } catch (q e22) {
            throw e22;
        }
    }

    public static h b() {
        if (e == null) {
            synchronized (h.class) {
                if (e == null) {
                    e = new h();
                }
            }
        }
        return e;
    }

    private void a(Object obj, g gVar, boolean z, int i) {
        CopyOnWriteArrayList copyOnWriteArrayList;
        Class cls = gVar.c;
        CopyOnWriteArrayList copyOnWriteArrayList2 = (CopyOnWriteArrayList) this.f.get(cls);
        k kVar = new k(obj, gVar, i);
        if (copyOnWriteArrayList2 == null) {
            copyOnWriteArrayList2 = new CopyOnWriteArrayList();
            this.f.put(cls, copyOnWriteArrayList2);
            copyOnWriteArrayList = copyOnWriteArrayList2;
        } else {
            try {
                if (copyOnWriteArrayList2.contains(kVar)) {
                    throw new q(z[3] + obj.getClass() + z[4] + cls);
                }
                copyOnWriteArrayList = copyOnWriteArrayList2;
            } catch (q e) {
                throw e;
            }
        }
        int size = copyOnWriteArrayList.size();
        int i2 = 0;
        while (i2 <= size) {
            if (i2 != size) {
                try {
                    if (kVar.b <= ((k) copyOnWriteArrayList.get(i2)).b) {
                        i2++;
                    }
                } catch (q e2) {
                    throw e2;
                } catch (q e22) {
                    throw e22;
                }
            }
            copyOnWriteArrayList.add(i2, kVar);
            break;
        }
        List list = (List) this.k.get(obj);
        if (list == null) {
            list = new ArrayList();
            this.k.put(obj, list);
        }
        list.add(cls);
        if (z) {
            Object obj2;
            synchronized (this.g) {
                obj2 = this.g.get(cls);
            }
            if (obj2 != null) {
                try {
                    boolean z2;
                    if (Looper.getMainLooper() == Looper.myLooper()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    a(kVar, obj2, z2);
                } catch (q e222) {
                    throw e222;
                }
            }
        }
    }

    private synchronized void a(Object obj, boolean z, int i) {
        for (g a : this.s.a(obj.getClass())) {
            a(obj, a, z, i);
        }
    }

    public void e(Object obj) {
        a(obj, false, 0);
    }

    public void a(Object obj) {
        boolean z = true;
        j jVar = (j) this.t.get();
        List list = jVar.d;
        try {
            list.add(obj);
            if (!jVar.f) {
                if (Looper.getMainLooper() != Looper.myLooper()) {
                    z = false;
                }
                try {
                    jVar.a = z;
                    jVar.f = true;
                    if (jVar.e) {
                        throw new q(z[2]);
                    }
                    while (!list.isEmpty()) {
                        try {
                            a(list.remove(0), jVar);
                        } finally {
                            jVar.f = false;
                            jVar.a = false;
                        }
                    }
                } catch (q e) {
                    throw e;
                }
            }
        } catch (q e2) {
            throw e2;
        } catch (q e22) {
            throw e22;
        }
    }

    void a(k kVar, Object obj) {
        try {
            kVar.c.a.invoke(kVar.a, new Object[]{obj});
        } catch (InvocationTargetException e) {
            a(kVar, obj, e.getCause());
        } catch (Throwable e2) {
            throw new IllegalStateException(z[5], e2);
        }
    }

    static void a(List list, Class[] clsArr) {
        int length = clsArr.length;
        int i = 0;
        while (i < length) {
            Class cls = clsArr[i];
            try {
                if (!list.contains(cls)) {
                    list.add(cls);
                    a(list, cls.getInterfaces());
                }
                i++;
            } catch (q e) {
                throw e;
            }
        }
    }

    h(c cVar) {
        this.t = new l(this);
        this.f = new HashMap();
        this.k = new HashMap();
        this.g = new ConcurrentHashMap();
        this.j = new p(this, Looper.getMainLooper(), 10);
        this.h = new i(this);
        this.d = new d(this);
        this.s = new o(cVar.c);
        this.r = cVar.h;
        this.i = cVar.f;
        this.b = cVar.i;
        this.n = cVar.a;
        this.a = cVar.b;
        this.m = cVar.g;
        this.l = cVar.d;
    }

    public void b(Object obj) {
        a(obj, true, 0);
    }
}
