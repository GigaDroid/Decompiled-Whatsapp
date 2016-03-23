package com.whatsapp;

import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import org.v;
import org.whispersystems.at;

public class qa {
    private static final ArrayList a;
    private static final c_ b;
    private static final Comparator c;
    private static final String[] z;

    public static void a() {
        App.aK.a(b);
    }

    public static ArrayList i() {
        ArrayList arrayList;
        boolean z = DialogToastActivity.f;
        synchronized (a) {
            arrayList = new ArrayList(a.size());
            Iterator it = a.iterator();
            while (it.hasNext()) {
                f8 f8Var = (f8) it.next();
                if (qm.i(f8Var.b) || l5.g(f8Var.b)) {
                    arrayList.add(f8Var.b);
                    continue;
                }
                if (z) {
                    break;
                }
            }
        }
        return arrayList;
    }

    public static void l() {
        synchronized (a) {
            a.clear();
        }
    }

    public static String k() {
        boolean z = DialogToastActivity.f;
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        synchronized (a) {
            do {
                if (!c(Long.toString(currentTimeMillis) + z[6])) {
                    break;
                }
                currentTimeMillis++;
            } while (!z);
        }
        return Long.toString(currentTimeMillis) + z[5];
    }

    private static int a(f8 f8Var) {
        return Collections.binarySearch(a, f8Var, c);
    }

    static boolean a(String str) {
        return f(str);
    }

    public static ArrayList j() {
        boolean z = DialogToastActivity.f;
        ArrayList arrayList = new ArrayList(a.size());
        synchronized (a) {
            Iterator it = a.iterator();
            while (it.hasNext()) {
                f8 f8Var = (f8) it.next();
                if (App.aK.b(f8Var.b)) {
                    arrayList.add(f8Var.b);
                    continue;
                }
                if (z) {
                    break;
                }
            }
        }
        return arrayList;
    }

    public static l5 d(String str) {
        if (!qm.i(str)) {
            return App.as.b(str);
        }
        l5 c = App.as.c(str);
        if (c == null) {
            Log.e(z[1] + str);
            c = new l5(str);
            App.as.g(c);
            if (l5.b(str)) {
                return c;
            }
            App.c(str, null);
            return c;
        } else if ((!c.n() && !TextUtils.isEmpty(c.j)) || c.A()) {
            return c;
        } else {
            Log.e(z[0] + c.p);
            App.c(str, null);
            return c;
        }
    }

    static {
        String[] strArr = new String[7];
        String str = "9\u00105\u007fY(\f:}U5\u0011tzY4\u001b<lH\u001d\r4|L\u0013\u0011=f\u0006z";
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
                        i3 = 90;
                        break;
                    case at.g /*1*/:
                        i3 = 127;
                        break;
                    case at.i /*2*/:
                        i3 = 91;
                        break;
                    case at.o /*3*/:
                        i3 = 9;
                        break;
                    default:
                        i3 = 60;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = ";\u001b?NN5\n+JT;\u000b\u0018fR.\u001e8}";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "9\u00105\u007fY(\f:}U5\u0011(d[(P)lL6\u001e8l_5\u0011/h_.E";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "zRe)";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "\u001a\u001d)f]>\u001c:zH";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\u001a\u001d)f]>\u001c:zH";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    z = strArr3;
                    a = new ArrayList();
                    b = new cv();
                    c = new ako();
                    return;
                default:
                    strArr2[i] = str;
                    str = "9\u00105\u007fQ=\rtnY.\u001c4gJ?\r(hH3\u00105jS4\u000b:jHu\u0018)fI*\u001c3hHu\u001c)l].\u001avjS4\u000b:jHz";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public static boolean c() {
        boolean z = DialogToastActivity.f;
        synchronized (a) {
            Iterator it = a.iterator();
            while (it.hasNext()) {
                if (!qm.i(((f8) it.next()).b)) {
                    if (z) {
                        break;
                    }
                }
                return true;
            }
            return false;
        }
    }

    static int b(String str) {
        return e(str);
    }

    public static l5 a(String str, String str2, long j) {
        Log.i(z[2]);
        l5 l5Var = new l5(str);
        l5Var.q = str2;
        l5Var.j = Long.toString(j);
        App.as.e(l5Var);
        return l5Var;
    }

    private static boolean f(String str) {
        boolean z;
        synchronized (a) {
            f8 g = g(str);
            if (g == null) {
                g = new f8(null);
                g.b = str;
            }
            g.a = App.aK.d(str);
            int e = e(str);
            int a = a(g);
            a.add((-a) - 1, g);
            z = (-a) + -1 != e;
        }
        return z;
    }

    public static ArrayList h() {
        boolean z = DialogToastActivity.f;
        ArrayList arrayList = new ArrayList(a.size());
        synchronized (a) {
            Iterator it = a.iterator();
            while (it.hasNext()) {
                f8 f8Var = (f8) it.next();
                if (!App.aK.b(f8Var.b)) {
                    arrayList.add(f8Var.b);
                    continue;
                }
                if (z) {
                    break;
                }
            }
        }
        return arrayList;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int e(java.lang.String r5) {
        /*
        r3 = com.whatsapp.DialogToastActivity.f;
        r1 = -1;
        r4 = a;
        monitor-enter(r4);
        r2 = 0;
    L_0x0007:
        r0 = a;	 Catch:{ all -> 0x002b }
        r0 = r0.size();	 Catch:{ all -> 0x002b }
        if (r2 >= r0) goto L_0x0032;
    L_0x000f:
        r0 = a;	 Catch:{ all -> 0x002b }
        r0 = r0.get(r2);	 Catch:{ all -> 0x002b }
        r0 = (com.whatsapp.f8) r0;	 Catch:{ all -> 0x002b }
        r0 = r0.b;	 Catch:{ all -> 0x002b }
        r0 = r0.equals(r5);	 Catch:{ all -> 0x002b }
        if (r0 == 0) goto L_0x0030;
    L_0x001f:
        r0 = a;	 Catch:{ all -> 0x002b }
        r0.remove(r2);	 Catch:{ all -> 0x002b }
        r0 = r2;
    L_0x0025:
        r2 = r2 + 1;
        if (r3 == 0) goto L_0x002e;
    L_0x0029:
        monitor-exit(r4);	 Catch:{ all -> 0x002b }
        return r0;
    L_0x002b:
        r0 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x002b }
        throw r0;
    L_0x002e:
        r1 = r0;
        goto L_0x0007;
    L_0x0030:
        r0 = r1;
        goto L_0x0025;
    L_0x0032:
        r0 = r1;
        goto L_0x0029;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.qa.e(java.lang.String):int");
    }

    public static int d() {
        int i;
        boolean z = DialogToastActivity.f;
        int i2 = 0;
        synchronized (a) {
            Iterator it = a.iterator();
            while (it.hasNext()) {
                if (App.aK.b(((f8) it.next()).b)) {
                    i = i2;
                } else {
                    i = i2 + 1;
                }
                if (z) {
                    break;
                }
                i2 = i;
            }
            i = i2;
        }
        return i;
    }

    public static int f() {
        int i;
        boolean z = DialogToastActivity.f;
        int i2 = 0;
        synchronized (a) {
            Iterator it = a.iterator();
            while (it.hasNext()) {
                if (App.aK.b(((f8) it.next()).b)) {
                    i = i2 + 1;
                } else {
                    i = i2;
                }
                if (z) {
                    break;
                }
                i2 = i;
            }
            i = i2;
        }
        return i;
    }

    public static ArrayList g() {
        ArrayList arrayList;
        boolean z = DialogToastActivity.f;
        synchronized (a) {
            arrayList = new ArrayList(a.size());
            Iterator it = a.iterator();
            while (it.hasNext()) {
                arrayList.add(((f8) it.next()).b);
                if (z) {
                    break;
                }
            }
        }
        return arrayList;
    }

    public static ArrayList a(Collection collection) {
        Object arrayList = new ArrayList(collection);
        Collections.sort(arrayList, new e1());
        return arrayList;
    }

    public static ArrayList a(int i) {
        ArrayList arrayList;
        boolean z = DialogToastActivity.f;
        synchronized (a) {
            arrayList = new ArrayList(Math.min(a.size(), i));
            int i2 = 0;
            while (i2 < a.size() && arrayList.size() < i) {
                l5 d = d(((f8) a.get(i2)).b);
                if (!(d == null || TextUtils.isEmpty(d.q))) {
                    arrayList.add(d);
                }
                int i3 = i2 + 1;
                if (z) {
                    break;
                }
                i2 = i3;
            }
        }
        return arrayList;
    }

    public static boolean c(String str) {
        return g(str) != null;
    }

    public static void a(String str, String str2, String str3) {
        Log.i(z[3] + str + z[4] + str2);
        synchronized (a) {
            f8 g = g(str);
            if (g == null) {
                g = new f8(null);
                g.b = str2;
            }
            a.remove(g);
            g.b = str2;
            a.add(0, g);
        }
    }

    private static f8 g(String str) {
        boolean z = DialogToastActivity.f;
        synchronized (a) {
            Iterator it = a.iterator();
            while (it.hasNext()) {
                f8 f8Var = (f8) it.next();
                if (!f8Var.b.equals(str)) {
                    if (z) {
                        break;
                    }
                }
                return f8Var;
            }
            return null;
        }
    }

    public static void b() {
        App.a1.a();
    }

    public static int e() {
        int size;
        synchronized (a) {
            size = a.size();
        }
        return size;
    }
}
