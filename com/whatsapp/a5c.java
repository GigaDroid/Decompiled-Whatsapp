package com.whatsapp;

import android.util.Pair;
import com.whatsapp.protocol.bv;
import com.whatsapp.protocol.c2;
import com.whatsapp.protocol.c3;
import com.whatsapp.protocol.co;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.at;

class a5c implements Runnable {
    private static final String[] z;
    final c2 a;
    final String b;
    final int c;
    final String d;
    final kd e;

    static {
        String[] strArr = new String[8];
        String str = "8,>(L,,\u0018vK,-\u00144\\f?\t<X-q";
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
                        i3 = 73;
                        break;
                    case at.g /*1*/:
                        i3 = 94;
                        break;
                    case at.i /*2*/:
                        i3 = 97;
                        break;
                    case at.o /*3*/:
                        i3 = 89;
                        break;
                    default:
                        i3 = 57;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "i=\u000e,W=d";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "8,>(L,,\u0018vK,-\u00144\\f:\u00045\\=;N";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = ">;\u0003";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "8,>(L,,\u0018vK,-\u00144\\f=\r<X;q\f6]=?\u0006v";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "8,>(L,,\u0018vK,-\u00144\\f=\u000e7O,,\u00128M 1\u000f*\u0016";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "8,>(L,,\u0018vK,-\u00144\\f=\r<X;q";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "i=\u000e,W=d";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void run() {
        boolean z;
        boolean z2 = DialogToastActivity.f;
        List arrayList = new ArrayList();
        List<Pair> arrayList2 = new ArrayList();
        HashSet hashSet = new HashSet(qa.g());
        Iterator it = this.a.q.iterator();
        while (it.hasNext()) {
            c2 c2Var;
            int i;
            bv bvVar = (bv) it.next();
            c3 c3Var = bvVar.h;
            boolean z3 = bvVar.f;
            String str = bvVar.g;
            long j = bvVar.a;
            int i2 = bvVar.e;
            boolean z4 = bvVar.d;
            boolean z5 = bvVar.b;
            if (hashSet.contains(str)) {
                co m = App.aK.m(str);
                c2 b;
                co a;
                if (App.aK.y(str) != bvVar.i) {
                    b = kd.b(str, 1);
                    a = App.aK.a(str, kd.a(b.m, bvVar.c));
                    if (a != null) {
                        arrayList2.add(Pair.create(str, a.k));
                        b.w = true;
                    }
                    Log.i(z[5] + str + z[2] + kd.a(b.m, bvVar.c));
                    c2Var = b;
                } else {
                    if (m != null) {
                        if (c3Var == null) {
                            b = kd.b(str, 0);
                            arrayList2.add(Pair.create(str, (c3) null));
                            b.w = true;
                            c2Var = b;
                        } else if (!m.k.equals(c3Var)) {
                            if (App.aK.a(c3Var) != null) {
                                c2Var = kd.b(str, 0);
                                arrayList2.add(Pair.create(str, c3Var));
                                c2Var.w = true;
                                Log.i(z[6] + str);
                            } else {
                                b = kd.b(str, 3);
                                a = App.aK.a(str, kd.a(b.m, bvVar.c));
                                if (a != null) {
                                    arrayList2.add(Pair.create(str, a.k));
                                    b.w = true;
                                }
                                Log.i(z[0] + str + z[1] + kd.a(b.m, bvVar.c));
                                c2Var = b;
                            }
                        }
                    } else if (c3Var != null) {
                        c2Var = kd.b(str, 1);
                        Log.i(z[7] + str);
                    }
                    c2Var = null;
                }
            } else {
                c2Var = new c2();
                c2Var.n = str;
                c2Var.c = 2;
                Log.i(z[3] + str);
            }
            hashSet.remove(str);
            boolean b2 = App.aK.b(str);
            long h = a3b.a(App.z()).b(str).h();
            long j2 = 1000 * (h / 1000);
            if (!qm.i(str)) {
                z = false;
            } else if (qm.h(str)) {
                z = false;
            } else {
                z = true;
            }
            l5 d = qa.d(str);
            if (d != null) {
                i = d.d;
            } else {
                i = 0;
            }
            kd.a(this.e);
            boolean z6 = App.aK.k(str) != -1;
            if (c2Var == null && !(b2 == z3 && j2 == j && z == z4 && ((d == null || i2 == i) && z6 == z5))) {
                c2Var = new c2();
                c2Var.n = str;
            }
            if (c2Var != null) {
                c2Var.o = b2;
                c2Var.e = h;
                c2Var.l = z;
                c2Var.r = i;
                c2Var.p = z6;
                arrayList.add(c2Var);
                continue;
            }
            if (z2) {
                break;
            }
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            String str2 = (String) it2.next();
            c2 b3 = kd.b(str2, 0);
            b3.o = App.aK.b(str2);
            b3.e = a3b.a(App.z()).b(str2).h();
            z = qm.i(str2) ? !qm.h(str2) : false;
            b3.l = z;
            arrayList.add(b3);
            arrayList2.add(Pair.create(str2, (c3) null));
            if (App.aK.m(str2) != null) {
                b3.w = true;
                continue;
            }
            if (z2) {
                break;
            }
        }
        StringBuilder append = new StringBuilder().append(Integer.toString(App.as.b()));
        kd.a(this.e);
        App.a(this.b, arrayList, this.c, false, append.append(App.aK.B()).toString());
        App.c(this.b, this.d, z[4]);
        for (Pair pair : arrayList2) {
            List list = null;
            co a2;
            if (pair.second != null) {
                kd.a(this.e);
                list = App.aK.a((String) pair.first, (c3) pair.second, null);
                if (list != null && list.size() == 0) {
                    kd.a(this.e);
                    a2 = App.aK.a((c3) pair.second);
                    if (a2 != null) {
                        list.add(a2);
                    }
                }
            } else {
                kd.a(this.e);
                a2 = App.aK.m((String) pair.first);
                if (a2 != null) {
                    kd.a(this.e);
                    list = App.aK.a(a2.k, 20);
                    if (list != null) {
                        list.add(a2);
                    }
                }
            }
            if (list != null) {
                App.a(2, list, false, false, null, null);
                continue;
            }
            if (z2) {
                return;
            }
        }
    }

    a5c(kd kdVar, c2 c2Var, String str, int i, String str2) {
        this.e = kdVar;
        this.a = c2Var;
        this.b = str;
        this.c = i;
        this.d = str2;
    }
}
