package com.google;

import com.whatsapp.arj;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

final class iI {
    private static final iI a;
    private static final String[] z;
    private boolean b;
    private final h4 c;
    private boolean d;

    public Object clone() {
        return c();
    }

    private iI() {
        this.b = false;
        this.c = h4.a(16);
    }

    private static int b(eK eKVar, Object obj) {
        try {
            switch (d4.b[eKVar.ordinal()]) {
                case at.g /*1*/:
                    return eb.a(((Double) obj).doubleValue());
                case at.i /*2*/:
                    return eb.b(((Float) obj).floatValue());
                case at.o /*3*/:
                    return eb.a(((Long) obj).longValue());
                case at.p /*4*/:
                    return eb.f(((Long) obj).longValue());
                case at.m /*5*/:
                    return eb.d(((Integer) obj).intValue());
                case Y.f /*6*/:
                    return eb.c(((Long) obj).longValue());
                case aF.v /*7*/:
                    return eb.f(((Integer) obj).intValue());
                case aF.u /*8*/:
                    return eb.a(((Boolean) obj).booleanValue());
                case Y.l /*9*/:
                    return eb.a((String) obj);
                case Y.t /*10*/:
                    return eb.c((hx) obj);
                case Y.j /*11*/:
                    return eb.c(((Integer) obj).intValue());
                case Y.p /*12*/:
                    return eb.o(((Integer) obj).intValue());
                case Y.q /*13*/:
                    return eb.g(((Long) obj).longValue());
                case arj.Toolbar_titleMarginEnd /*14*/:
                    return eb.p(((Integer) obj).intValue());
                case arj.Toolbar_titleMarginTop /*15*/:
                    return eb.h(((Long) obj).longValue());
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    return eb.b((fO) obj);
                case arj.Toolbar_maxButtonHeight /*17*/:
                    try {
                        if (obj instanceof hY) {
                            return eb.a((hY) obj);
                        }
                        return eb.c((fO) obj);
                    } catch (IllegalArgumentException e) {
                        throw e;
                    }
                case arj.Toolbar_collapseIcon /*18*/:
                    return eb.h(((dJ) obj).getNumber());
                default:
                    throw new RuntimeException(z[11]);
            }
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
        throw e2;
    }

    public void a(eb ebVar) {
        boolean z = bA.b;
        int i = 0;
        while (i < this.c.f()) {
            Entry c = this.c.c(i);
            a((dH) c.getKey(), c.getValue(), ebVar);
            int i2 = i + 1;
            if (z) {
                break;
            }
            i = i2;
        }
        for (Entry entry : this.c.d()) {
            a((dH) entry.getKey(), entry.getValue(), ebVar);
            if (z) {
                return;
            }
        }
    }

    public int a() {
        boolean z = bA.b;
        int i = 0;
        int i2 = 0;
        while (i < this.c.f()) {
            Entry c = this.c.c(i);
            i2 += c((dH) c.getKey(), c.getValue());
            int i3 = i + 1;
            if (z) {
                break;
            }
            i = i3;
        }
        for (Entry entry : this.c.d()) {
            i2 += c((dH) entry.getKey(), entry.getValue());
            if (z) {
                break;
            }
        }
        return i2;
    }

    public static Object a(ad adVar, eK eKVar) {
        try {
            switch (d4.b[eKVar.ordinal()]) {
                case at.g /*1*/:
                    return Double.valueOf(adVar.x());
                case at.i /*2*/:
                    return Float.valueOf(adVar.p());
                case at.o /*3*/:
                    return Long.valueOf(adVar.y());
                case at.p /*4*/:
                    return Long.valueOf(adVar.a());
                case at.m /*5*/:
                    return Integer.valueOf(adVar.i());
                case Y.f /*6*/:
                    return Long.valueOf(adVar.s());
                case aF.v /*7*/:
                    return Integer.valueOf(adVar.c());
                case aF.u /*8*/:
                    return Boolean.valueOf(adVar.w());
                case Y.l /*9*/:
                    return adVar.v();
                case Y.t /*10*/:
                    return adVar.q();
                case Y.j /*11*/:
                    return Integer.valueOf(adVar.t());
                case Y.p /*12*/:
                    return Integer.valueOf(adVar.f());
                case Y.q /*13*/:
                    return Long.valueOf(adVar.m());
                case arj.Toolbar_titleMarginEnd /*14*/:
                    return Integer.valueOf(adVar.g());
                case arj.Toolbar_titleMarginTop /*15*/:
                    return Long.valueOf(adVar.r());
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    throw new IllegalArgumentException(z[8]);
                case arj.Toolbar_maxButtonHeight /*17*/:
                    throw new IllegalArgumentException(z[6]);
                case arj.Toolbar_collapseIcon /*18*/:
                    throw new IllegalArgumentException(z[7]);
                default:
                    throw new RuntimeException(z[5]);
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
        throw e;
    }

    public void e() {
        try {
            if (!this.d) {
                this.c.g();
                this.d = true;
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    private static int a(eK eKVar, int i, Object obj) {
        int n = eb.n(i);
        if (eKVar == eK.GROUP) {
            n *= 2;
        }
        return n + b(eKVar, obj);
    }

    private void a(Map map, Entry entry) {
        dH dHVar = (dH) entry.getKey();
        Object value = entry.getValue();
        try {
            if (value instanceof hY) {
                map.put(dHVar, ((hY) value).b());
                if (!bA.b) {
                    return;
                }
            }
            map.put(dHVar, value);
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(com.google.eb r6, com.google.eK r7, java.lang.Object r8) {
        /*
        r3 = com.google.bA.b;
        r2 = com.google.d4.b;	 Catch:{ IllegalArgumentException -> 0x00e8 }
        r4 = r7.ordinal();	 Catch:{ IllegalArgumentException -> 0x00e8 }
        r2 = r2[r4];	 Catch:{ IllegalArgumentException -> 0x00e8 }
        switch(r2) {
            case 1: goto L_0x000e;
            case 2: goto L_0x001b;
            case 3: goto L_0x0028;
            case 4: goto L_0x0035;
            case 5: goto L_0x0042;
            case 6: goto L_0x004f;
            case 7: goto L_0x005c;
            case 8: goto L_0x0069;
            case 9: goto L_0x0076;
            case 10: goto L_0x0091;
            case 11: goto L_0x009a;
            case 12: goto L_0x00a7;
            case 13: goto L_0x00b4;
            case 14: goto L_0x00c1;
            case 15: goto L_0x00ce;
            case 16: goto L_0x007f;
            case 17: goto L_0x0088;
            case 18: goto L_0x00db;
            default: goto L_0x000d;
        };
    L_0x000d:
        return;
    L_0x000e:
        r0 = r8;
        r0 = (java.lang.Double) r0;	 Catch:{ IllegalArgumentException -> 0x00ea }
        r2 = r0;
        r4 = r2.doubleValue();	 Catch:{ IllegalArgumentException -> 0x00ea }
        r6.b(r4);	 Catch:{ IllegalArgumentException -> 0x00ea }
        if (r3 == 0) goto L_0x000d;
    L_0x001b:
        r0 = r8;
        r0 = (java.lang.Float) r0;	 Catch:{ IllegalArgumentException -> 0x00ec }
        r2 = r0;
        r2 = r2.floatValue();	 Catch:{ IllegalArgumentException -> 0x00ec }
        r6.a(r2);	 Catch:{ IllegalArgumentException -> 0x00ec }
        if (r3 == 0) goto L_0x000d;
    L_0x0028:
        r0 = r8;
        r0 = (java.lang.Long) r0;	 Catch:{ IllegalArgumentException -> 0x00ee }
        r2 = r0;
        r4 = r2.longValue();	 Catch:{ IllegalArgumentException -> 0x00ee }
        r6.j(r4);	 Catch:{ IllegalArgumentException -> 0x00ee }
        if (r3 == 0) goto L_0x000d;
    L_0x0035:
        r0 = r8;
        r0 = (java.lang.Long) r0;	 Catch:{ IllegalArgumentException -> 0x00f0 }
        r2 = r0;
        r4 = r2.longValue();	 Catch:{ IllegalArgumentException -> 0x00f0 }
        r6.d(r4);	 Catch:{ IllegalArgumentException -> 0x00f0 }
        if (r3 == 0) goto L_0x000d;
    L_0x0042:
        r0 = r8;
        r0 = (java.lang.Integer) r0;	 Catch:{ IllegalArgumentException -> 0x00f2 }
        r2 = r0;
        r2 = r2.intValue();	 Catch:{ IllegalArgumentException -> 0x00f2 }
        r6.j(r2);	 Catch:{ IllegalArgumentException -> 0x00f2 }
        if (r3 == 0) goto L_0x000d;
    L_0x004f:
        r0 = r8;
        r0 = (java.lang.Long) r0;	 Catch:{ IllegalArgumentException -> 0x00f4 }
        r2 = r0;
        r4 = r2.longValue();	 Catch:{ IllegalArgumentException -> 0x00f4 }
        r6.m(r4);	 Catch:{ IllegalArgumentException -> 0x00f4 }
        if (r3 == 0) goto L_0x000d;
    L_0x005c:
        r0 = r8;
        r0 = (java.lang.Integer) r0;	 Catch:{ IllegalArgumentException -> 0x00f6 }
        r2 = r0;
        r2 = r2.intValue();	 Catch:{ IllegalArgumentException -> 0x00f6 }
        r6.q(r2);	 Catch:{ IllegalArgumentException -> 0x00f6 }
        if (r3 == 0) goto L_0x000d;
    L_0x0069:
        r0 = r8;
        r0 = (java.lang.Boolean) r0;	 Catch:{ IllegalArgumentException -> 0x00f8 }
        r2 = r0;
        r2 = r2.booleanValue();	 Catch:{ IllegalArgumentException -> 0x00f8 }
        r6.b(r2);	 Catch:{ IllegalArgumentException -> 0x00f8 }
        if (r3 == 0) goto L_0x000d;
    L_0x0076:
        r0 = r8;
        r0 = (java.lang.String) r0;	 Catch:{ IllegalArgumentException -> 0x00fa }
        r2 = r0;
        r6.b(r2);	 Catch:{ IllegalArgumentException -> 0x00fa }
        if (r3 == 0) goto L_0x000d;
    L_0x007f:
        r0 = r8;
        r0 = (com.google.fO) r0;	 Catch:{ IllegalArgumentException -> 0x00fc }
        r2 = r0;
        r6.d(r2);	 Catch:{ IllegalArgumentException -> 0x00fc }
        if (r3 == 0) goto L_0x000d;
    L_0x0088:
        r0 = r8;
        r0 = (com.google.fO) r0;	 Catch:{ IllegalArgumentException -> 0x00fe }
        r2 = r0;
        r6.a(r2);	 Catch:{ IllegalArgumentException -> 0x00fe }
        if (r3 == 0) goto L_0x000d;
    L_0x0091:
        r0 = r8;
        r0 = (com.google.hx) r0;	 Catch:{ IllegalArgumentException -> 0x0100 }
        r2 = r0;
        r6.a(r2);	 Catch:{ IllegalArgumentException -> 0x0100 }
        if (r3 == 0) goto L_0x000d;
    L_0x009a:
        r0 = r8;
        r0 = (java.lang.Integer) r0;	 Catch:{ IllegalArgumentException -> 0x0102 }
        r2 = r0;
        r2 = r2.intValue();	 Catch:{ IllegalArgumentException -> 0x0102 }
        r6.a(r2);	 Catch:{ IllegalArgumentException -> 0x0102 }
        if (r3 == 0) goto L_0x000d;
    L_0x00a7:
        r0 = r8;
        r0 = (java.lang.Integer) r0;	 Catch:{ IllegalArgumentException -> 0x0104 }
        r2 = r0;
        r2 = r2.intValue();	 Catch:{ IllegalArgumentException -> 0x0104 }
        r6.b(r2);	 Catch:{ IllegalArgumentException -> 0x0104 }
        if (r3 == 0) goto L_0x000d;
    L_0x00b4:
        r0 = r8;
        r0 = (java.lang.Long) r0;	 Catch:{ IllegalArgumentException -> 0x0106 }
        r2 = r0;
        r4 = r2.longValue();	 Catch:{ IllegalArgumentException -> 0x0106 }
        r6.l(r4);	 Catch:{ IllegalArgumentException -> 0x0106 }
        if (r3 == 0) goto L_0x000d;
    L_0x00c1:
        r0 = r8;
        r0 = (java.lang.Integer) r0;	 Catch:{ IllegalArgumentException -> 0x0108 }
        r2 = r0;
        r2 = r2.intValue();	 Catch:{ IllegalArgumentException -> 0x0108 }
        r6.e(r2);	 Catch:{ IllegalArgumentException -> 0x0108 }
        if (r3 == 0) goto L_0x000d;
    L_0x00ce:
        r0 = r8;
        r0 = (java.lang.Long) r0;	 Catch:{ IllegalArgumentException -> 0x00e6 }
        r2 = r0;
        r4 = r2.longValue();	 Catch:{ IllegalArgumentException -> 0x00e6 }
        r6.b(r4);	 Catch:{ IllegalArgumentException -> 0x00e6 }
        if (r3 == 0) goto L_0x000d;
    L_0x00db:
        r8 = (com.google.dJ) r8;	 Catch:{ IllegalArgumentException -> 0x00e6 }
        r2 = r8.getNumber();	 Catch:{ IllegalArgumentException -> 0x00e6 }
        r6.i(r2);	 Catch:{ IllegalArgumentException -> 0x00e6 }
        goto L_0x000d;
    L_0x00e6:
        r2 = move-exception;
        throw r2;
    L_0x00e8:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalArgumentException -> 0x00ea }
    L_0x00ea:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalArgumentException -> 0x00ec }
    L_0x00ec:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalArgumentException -> 0x00ee }
    L_0x00ee:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalArgumentException -> 0x00f0 }
    L_0x00f0:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalArgumentException -> 0x00f2 }
    L_0x00f2:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalArgumentException -> 0x00f4 }
    L_0x00f4:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalArgumentException -> 0x00f6 }
    L_0x00f6:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalArgumentException -> 0x00f8 }
    L_0x00f8:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalArgumentException -> 0x00fa }
    L_0x00fa:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalArgumentException -> 0x00fc }
    L_0x00fc:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalArgumentException -> 0x00fe }
    L_0x00fe:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalArgumentException -> 0x0100 }
    L_0x0100:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalArgumentException -> 0x0102 }
    L_0x0102:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalArgumentException -> 0x0104 }
    L_0x0104:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalArgumentException -> 0x0106 }
    L_0x0106:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalArgumentException -> 0x0108 }
    L_0x0108:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalArgumentException -> 0x00e6 }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.iI.a(com.google.eb, com.google.eK, java.lang.Object):void");
    }

    public boolean h() {
        boolean z = bA.b;
        int i = 0;
        while (i < this.c.f()) {
            try {
                if (c(this.c.c(i))) {
                    i++;
                    if (z) {
                        break;
                    }
                }
                return false;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        for (Entry c : this.c.d()) {
            try {
                if (c(c)) {
                    if (z) {
                        break;
                    }
                }
                return false;
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        }
        return true;
    }

    public static int c(dH dHVar, Object obj) {
        int i = 0;
        boolean z = bA.b;
        eK d = dHVar.d();
        int e = dHVar.e();
        try {
            if (!dHVar.c()) {
                return a(d, e, obj);
            }
            if (dHVar.a()) {
                for (Object b : (List) obj) {
                    i += b(d, b);
                    if (z) {
                        break;
                    }
                }
                return eb.l(i) + (eb.n(e) + i);
            }
            for (Object b2 : (List) obj) {
                i += a(d, e, b2);
                if (z) {
                    return i;
                }
            }
            return i;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    private iI(boolean z) {
        this.b = false;
        this.c = h4.a(0);
        e();
    }

    public void a(iI iIVar) {
        boolean z = bA.b;
        int i = 0;
        while (i < iIVar.c.f()) {
            b(iIVar.c.c(i));
            i++;
            if (z) {
                break;
            }
        }
        for (Entry b : iIVar.c.d()) {
            b(b);
            if (z) {
                return;
            }
        }
    }

    public Object a(dH dHVar, int i) {
        try {
            if (dHVar.c()) {
                Object c = c(dHVar);
                if (c != null) {
                    return ((List) c).get(i);
                }
                try {
                    throw new IndexOutOfBoundsException();
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            }
            throw new IllegalArgumentException(z[1]);
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    public boolean b(dH dHVar) {
        try {
            if (dHVar.c()) {
                throw new IllegalArgumentException(z[0]);
            }
            try {
                if (this.c.get(dHVar) != null) {
                    return true;
                }
                return false;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    public iI c() {
        boolean z = bA.b;
        iI g = g();
        int i = 0;
        while (i < this.c.f()) {
            Entry c = this.c.c(i);
            g.b((dH) c.getKey(), c.getValue());
            int i2 = i + 1;
            if (z) {
                break;
            }
            i = i2;
        }
        for (Entry entry : this.c.d()) {
            g.b((dH) entry.getKey(), entry.getValue());
            if (z) {
                break;
            }
        }
        g.b = this.b;
        return g;
    }

    public boolean f() {
        return this.d;
    }

    public static iI g() {
        return new iI();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(com.google.dH r6, java.lang.Object r7) {
        /*
        r5 = this;
        r1 = com.google.bA.b;
        r0 = r6.c();	 Catch:{ IllegalArgumentException -> 0x0019 }
        if (r0 == 0) goto L_0x0056;
    L_0x0008:
        r0 = r7 instanceof java.util.List;	 Catch:{ IllegalArgumentException -> 0x0017 }
        if (r0 != 0) goto L_0x001b;
    L_0x000c:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0017 }
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x0017 }
        r2 = 4;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x0017 }
        r0.<init>(r1);	 Catch:{ IllegalArgumentException -> 0x0017 }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0017 }
    L_0x0017:
        r0 = move-exception;
        throw r0;
    L_0x0019:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0017 }
    L_0x001b:
        r0 = new java.util.ArrayList;
        r0.<init>();
        r7 = (java.util.List) r7;
        r0.addAll(r7);
        r2 = r0.iterator();
    L_0x0029:
        r3 = r2.hasNext();
        if (r3 == 0) goto L_0x003c;
    L_0x002f:
        r3 = r2.next();
        r4 = r6.d();
        a(r4, r3);
        if (r1 == 0) goto L_0x0029;
    L_0x003c:
        if (r1 == 0) goto L_0x0045;
    L_0x003e:
        r1 = r6.d();	 Catch:{ IllegalArgumentException -> 0x0052 }
        a(r1, r0);	 Catch:{ IllegalArgumentException -> 0x0052 }
    L_0x0045:
        r1 = r0 instanceof com.google.hY;	 Catch:{ IllegalArgumentException -> 0x0054 }
        if (r1 == 0) goto L_0x004c;
    L_0x0049:
        r1 = 1;
        r5.b = r1;	 Catch:{ IllegalArgumentException -> 0x0054 }
    L_0x004c:
        r1 = r5.c;
        r1.a(r6, r0);
        return;
    L_0x0052:
        r0 = move-exception;
        throw r0;
    L_0x0054:
        r0 = move-exception;
        throw r0;
    L_0x0056:
        r0 = r7;
        goto L_0x003e;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.iI.b(com.google.dH, java.lang.Object):void");
    }

    public int a(dH dHVar) {
        try {
            if (dHVar.c()) {
                Object c = c(dHVar);
                if (c == null) {
                    return 0;
                }
                return ((List) c).size();
            }
            throw new IllegalArgumentException(z[9]);
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(com.google.dH r8, java.lang.Object r9, com.google.eb r10) {
        /*
        r3 = com.google.bA.b;
        r4 = r8.d();
        r5 = r8.e();
        r1 = r8.c();
        if (r1 == 0) goto L_0x0060;
    L_0x0010:
        r1 = r9;
        r1 = (java.util.List) r1;
        r2 = r8.a();
        if (r2 == 0) goto L_0x004b;
    L_0x0019:
        r2 = 2;
        r10.h(r5, r2);
        r2 = 0;
        r6 = r1.iterator();
    L_0x0022:
        r7 = r6.hasNext();
        if (r7 == 0) goto L_0x0033;
    L_0x0028:
        r7 = r6.next();
        r7 = b(r4, r7);
        r2 = r2 + r7;
        if (r3 == 0) goto L_0x0022;
    L_0x0033:
        r10.k(r2);
        r2 = r1.iterator();
    L_0x003a:
        r6 = r2.hasNext();
        if (r6 == 0) goto L_0x0049;
    L_0x0040:
        r6 = r2.next();
        a(r10, r4, r6);
        if (r3 == 0) goto L_0x003a;
    L_0x0049:
        if (r3 == 0) goto L_0x005e;
    L_0x004b:
        r1 = r1.iterator();
    L_0x004f:
        r2 = r1.hasNext();
        if (r2 == 0) goto L_0x005e;
    L_0x0055:
        r2 = r1.next();
        a(r10, r4, r5, r2);
        if (r3 == 0) goto L_0x004f;
    L_0x005e:
        if (r3 == 0) goto L_0x0074;
    L_0x0060:
        r1 = r9 instanceof com.google.hY;	 Catch:{ IllegalArgumentException -> 0x0075 }
        if (r1 == 0) goto L_0x0071;
    L_0x0064:
        r0 = r9;
        r0 = (com.google.hY) r0;	 Catch:{ IllegalArgumentException -> 0x0077 }
        r1 = r0;
        r1 = r1.b();	 Catch:{ IllegalArgumentException -> 0x0077 }
        a(r10, r4, r5, r1);	 Catch:{ IllegalArgumentException -> 0x0077 }
        if (r3 == 0) goto L_0x0074;
    L_0x0071:
        a(r10, r4, r5, r9);	 Catch:{ IllegalArgumentException -> 0x0077 }
    L_0x0074:
        return;
    L_0x0075:
        r1 = move-exception;
        throw r1;	 Catch:{ IllegalArgumentException -> 0x0077 }
    L_0x0077:
        r1 = move-exception;
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.iI.a(com.google.dH, java.lang.Object, com.google.eb):void");
    }

    public Object c(dH dHVar) {
        Object obj = this.c.get(dHVar);
        try {
            if (obj instanceof hY) {
                obj = ((hY) obj).b();
            }
            return obj;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    static int a(eK eKVar, boolean z) {
        if (z) {
            return 2;
        }
        return eKVar.getWireType();
    }

    public void b(eb ebVar) {
        boolean z = bA.b;
        int i = 0;
        while (i < this.c.f()) {
            a(this.c.c(i), ebVar);
            i++;
            if (z) {
                break;
            }
        }
        for (Entry a : this.c.d()) {
            a(a, ebVar);
            if (z) {
                return;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Map i() {
        /*
        r4 = this;
        r2 = com.google.bA.b;
        r0 = r4.b;
        if (r0 == 0) goto L_0x004c;
    L_0x0006:
        r0 = 16;
        r1 = com.google.h4.a(r0);
        r0 = 0;
    L_0x000d:
        r3 = r4.c;
        r3 = r3.f();
        if (r0 >= r3) goto L_0x0022;
    L_0x0015:
        r3 = r4.c;
        r3 = r3.c(r0);
        r4.a(r1, r3);
        r0 = r0 + 1;
        if (r2 == 0) goto L_0x000d;
    L_0x0022:
        r0 = r4.c;
        r0 = r0.d();
        r3 = r0.iterator();
    L_0x002c:
        r0 = r3.hasNext();
        if (r0 == 0) goto L_0x003d;
    L_0x0032:
        r0 = r3.next();
        r0 = (java.util.Map.Entry) r0;
        r4.a(r1, r0);
        if (r2 == 0) goto L_0x002c;
    L_0x003d:
        r0 = r4.c;	 Catch:{ IllegalArgumentException -> 0x004a }
        r0 = r0.e();	 Catch:{ IllegalArgumentException -> 0x004a }
        if (r0 == 0) goto L_0x0048;
    L_0x0045:
        r1.g();	 Catch:{ IllegalArgumentException -> 0x004a }
    L_0x0048:
        r0 = r1;
    L_0x0049:
        return r0;
    L_0x004a:
        r0 = move-exception;
        throw r0;
    L_0x004c:
        r0 = r4.c;	 Catch:{ IllegalArgumentException -> 0x0057 }
        r0 = r0.e();	 Catch:{ IllegalArgumentException -> 0x0057 }
        if (r0 == 0) goto L_0x0059;
    L_0x0054:
        r0 = r4.c;	 Catch:{ IllegalArgumentException -> 0x0057 }
        goto L_0x0049;
    L_0x0057:
        r0 = move-exception;
        throw r0;
    L_0x0059:
        r0 = r4.c;
        r0 = java.util.Collections.unmodifiableMap(r0);
        goto L_0x0049;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.iI.i():java.util.Map");
    }

    public static iI d() {
        return a;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(com.google.eK r4, java.lang.Object r5) {
        /*
        r0 = 0;
        r2 = com.google.bA.b;
        if (r5 != 0) goto L_0x000d;
    L_0x0005:
        r0 = new java.lang.NullPointerException;	 Catch:{ IllegalArgumentException -> 0x000b }
        r0.<init>();	 Catch:{ IllegalArgumentException -> 0x000b }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x000b }
    L_0x000b:
        r0 = move-exception;
        throw r0;
    L_0x000d:
        r1 = com.google.d4.a;
        r3 = r4.getJavaType();
        r3 = r3.ordinal();
        r1 = r1[r3];
        switch(r1) {
            case 1: goto L_0x002b;
            case 2: goto L_0x002f;
            case 3: goto L_0x0033;
            case 4: goto L_0x0037;
            case 5: goto L_0x003b;
            case 6: goto L_0x003f;
            case 7: goto L_0x0043;
            case 8: goto L_0x0047;
            case 9: goto L_0x004b;
            default: goto L_0x001c;
        };
    L_0x001c:
        if (r0 != 0) goto L_0x0059;
    L_0x001e:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0029 }
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x0029 }
        r2 = 2;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x0029 }
        r0.<init>(r1);	 Catch:{ IllegalArgumentException -> 0x0029 }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0029 }
    L_0x0029:
        r0 = move-exception;
        throw r0;
    L_0x002b:
        r1 = r5 instanceof java.lang.Integer;
        if (r2 == 0) goto L_0x005a;
    L_0x002f:
        r1 = r5 instanceof java.lang.Long;
        if (r2 == 0) goto L_0x005a;
    L_0x0033:
        r1 = r5 instanceof java.lang.Float;
        if (r2 == 0) goto L_0x005a;
    L_0x0037:
        r1 = r5 instanceof java.lang.Double;
        if (r2 == 0) goto L_0x005a;
    L_0x003b:
        r1 = r5 instanceof java.lang.Boolean;
        if (r2 == 0) goto L_0x005a;
    L_0x003f:
        r1 = r5 instanceof java.lang.String;
        if (r2 == 0) goto L_0x005a;
    L_0x0043:
        r1 = r5 instanceof com.google.hx;
        if (r2 == 0) goto L_0x005a;
    L_0x0047:
        r1 = r5 instanceof com.google.dJ;
        if (r2 == 0) goto L_0x005a;
    L_0x004b:
        r1 = r5 instanceof com.google.fO;	 Catch:{ IllegalArgumentException -> 0x0055 }
        if (r1 != 0) goto L_0x0053;
    L_0x004f:
        r1 = r5 instanceof com.google.hY;	 Catch:{ IllegalArgumentException -> 0x0057 }
        if (r1 == 0) goto L_0x001c;
    L_0x0053:
        r0 = 1;
        goto L_0x001c;
    L_0x0055:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0057 }
    L_0x0057:
        r0 = move-exception;
        throw r0;
    L_0x0059:
        return;
    L_0x005a:
        r0 = r1;
        goto L_0x001c;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.iI.a(com.google.eK, java.lang.Object):void");
    }

    private static void a(eb ebVar, eK eKVar, int i, Object obj) {
        try {
            if (eKVar == eK.GROUP) {
                ebVar.c(i, (fO) obj);
                if (!bA.b) {
                    return;
                }
            }
            ebVar.h(i, a(eKVar, false));
            a(ebVar, eKVar, obj);
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean c(java.util.Map.Entry r7) {
        /*
        r6 = this;
        r2 = 1;
        r1 = 0;
        r3 = com.google.bA.b;
        r0 = r7.getKey();
        r0 = (com.google.dH) r0;
        r4 = r0.b();	 Catch:{ IllegalArgumentException -> 0x0036 }
        r5 = com.google.d0.MESSAGE;	 Catch:{ IllegalArgumentException -> 0x0036 }
        if (r4 != r5) goto L_0x0068;
    L_0x0012:
        r0 = r0.c();	 Catch:{ IllegalArgumentException -> 0x0036 }
        if (r0 == 0) goto L_0x003e;
    L_0x0018:
        r0 = r7.getValue();
        r0 = (java.util.List) r0;
        r4 = r0.iterator();
    L_0x0022:
        r0 = r4.hasNext();
        if (r0 == 0) goto L_0x003c;
    L_0x0028:
        r0 = r4.next();
        r0 = (com.google.fO) r0;
        r0 = r0.isInitialized();	 Catch:{ IllegalArgumentException -> 0x0038 }
        if (r0 != 0) goto L_0x003a;
    L_0x0034:
        r0 = r1;
    L_0x0035:
        return r0;
    L_0x0036:
        r0 = move-exception;
        throw r0;
    L_0x0038:
        r0 = move-exception;
        throw r0;
    L_0x003a:
        if (r3 == 0) goto L_0x0022;
    L_0x003c:
        if (r3 == 0) goto L_0x0068;
    L_0x003e:
        r0 = r7.getValue();
        r3 = r0 instanceof com.google.fO;	 Catch:{ IllegalArgumentException -> 0x0050 }
        if (r3 == 0) goto L_0x0054;
    L_0x0046:
        r0 = (com.google.fO) r0;	 Catch:{ IllegalArgumentException -> 0x0052 }
        r0 = r0.isInitialized();	 Catch:{ IllegalArgumentException -> 0x0052 }
        if (r0 != 0) goto L_0x0068;
    L_0x004e:
        r0 = r1;
        goto L_0x0035;
    L_0x0050:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0052 }
    L_0x0052:
        r0 = move-exception;
        throw r0;
    L_0x0054:
        r0 = r0 instanceof com.google.hY;	 Catch:{ IllegalArgumentException -> 0x005a }
        if (r0 == 0) goto L_0x005c;
    L_0x0058:
        r0 = r2;
        goto L_0x0035;
    L_0x005a:
        r0 = move-exception;
        throw r0;
    L_0x005c:
        r0 = new java.lang.IllegalArgumentException;
        r1 = z;
        r2 = 10;
        r1 = r1[r2];
        r0.<init>(r1);
        throw r0;
    L_0x0068:
        r0 = r2;
        goto L_0x0035;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.iI.c(java.util.Map$Entry):boolean");
    }

    public int b() {
        int i = 0;
        boolean z = bA.b;
        int i2 = 0;
        while (i < this.c.f()) {
            i2 += a(this.c.c(i));
            i++;
            if (z) {
                break;
            }
        }
        for (Entry a : this.c.d()) {
            i2 += a(a);
            if (z) {
                break;
            }
        }
        return i2;
    }

    private int a(Entry entry) {
        dH dHVar = (dH) entry.getKey();
        Object value = entry.getValue();
        try {
            if (dHVar.b() == d0.MESSAGE) {
                if (!dHVar.c()) {
                    try {
                        if (!dHVar.a()) {
                            try {
                                if (!(value instanceof hY)) {
                                    return eb.d(((dH) entry.getKey()).e(), (fO) value);
                                }
                                return eb.a(((dH) entry.getKey()).e(), (hY) value);
                            } catch (IllegalArgumentException e) {
                                throw e;
                            }
                        }
                    } catch (IllegalArgumentException e2) {
                        throw e2;
                    }
                }
            }
            return c(dHVar, value);
        } catch (IllegalArgumentException e22) {
            throw e22;
        } catch (IllegalArgumentException e222) {
            throw e222;
        }
    }

    public void a(dH dHVar, Object obj) {
        try {
            if (dHVar.c()) {
                List list;
                a(dHVar.d(), obj);
                Object c = c(dHVar);
                if (c == null) {
                    List arrayList = new ArrayList();
                    this.c.a((Comparable) dHVar, (Object) arrayList);
                    if (!bA.b) {
                        list = arrayList;
                        list.add(obj);
                        return;
                    }
                }
                list = (List) c;
                list.add(obj);
                return;
            }
            throw new IllegalArgumentException(z[3]);
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b(java.util.Map.Entry r9) {
        /*
        r8 = this;
        r5 = com.google.bA.b;
        r1 = r9.getKey();
        r1 = (com.google.dH) r1;
        r2 = r9.getValue();
        r3 = r2 instanceof com.google.hY;
        if (r3 == 0) goto L_0x007b;
    L_0x0010:
        r2 = (com.google.hY) r2;
        r3 = r2.b();
    L_0x0016:
        r2 = r1.c();
        if (r2 == 0) goto L_0x003f;
    L_0x001c:
        r4 = r8.c(r1);
        if (r4 != 0) goto L_0x0032;
    L_0x0022:
        r6 = r8.c;	 Catch:{ IllegalArgumentException -> 0x0073 }
        r7 = new java.util.ArrayList;	 Catch:{ IllegalArgumentException -> 0x0073 }
        r0 = r3;
        r0 = (java.util.List) r0;	 Catch:{ IllegalArgumentException -> 0x0073 }
        r2 = r0;
        r7.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x0073 }
        r6.a(r1, r7);	 Catch:{ IllegalArgumentException -> 0x0073 }
        if (r5 == 0) goto L_0x003d;
    L_0x0032:
        r0 = r4;
        r0 = (java.util.List) r0;	 Catch:{ IllegalArgumentException -> 0x0073 }
        r2 = r0;
        r0 = r3;
        r0 = (java.util.List) r0;	 Catch:{ IllegalArgumentException -> 0x0073 }
        r4 = r0;
        r2.addAll(r4);	 Catch:{ IllegalArgumentException -> 0x0073 }
    L_0x003d:
        if (r5 == 0) goto L_0x0072;
    L_0x003f:
        r2 = r1.b();	 Catch:{ IllegalArgumentException -> 0x0075 }
        r4 = com.google.d0.MESSAGE;	 Catch:{ IllegalArgumentException -> 0x0075 }
        if (r2 != r4) goto L_0x006d;
    L_0x0047:
        r2 = r8.c(r1);
        if (r2 != 0) goto L_0x0054;
    L_0x004d:
        r4 = r8.c;	 Catch:{ IllegalArgumentException -> 0x0077 }
        r4.a(r1, r3);	 Catch:{ IllegalArgumentException -> 0x0077 }
        if (r5 == 0) goto L_0x006b;
    L_0x0054:
        r4 = r8.c;	 Catch:{ IllegalArgumentException -> 0x0077 }
        r2 = (com.google.fO) r2;	 Catch:{ IllegalArgumentException -> 0x0077 }
        r6 = r2.toBuilder();	 Catch:{ IllegalArgumentException -> 0x0077 }
        r0 = r3;
        r0 = (com.google.fO) r0;	 Catch:{ IllegalArgumentException -> 0x0077 }
        r2 = r0;
        r2 = r1.a(r6, r2);	 Catch:{ IllegalArgumentException -> 0x0077 }
        r2 = r2.build();	 Catch:{ IllegalArgumentException -> 0x0077 }
        r4.a(r1, r2);	 Catch:{ IllegalArgumentException -> 0x0077 }
    L_0x006b:
        if (r5 == 0) goto L_0x0072;
    L_0x006d:
        r2 = r8.c;	 Catch:{ IllegalArgumentException -> 0x0079 }
        r2.a(r1, r3);	 Catch:{ IllegalArgumentException -> 0x0079 }
    L_0x0072:
        return;
    L_0x0073:
        r1 = move-exception;
        throw r1;
    L_0x0075:
        r1 = move-exception;
        throw r1;
    L_0x0077:
        r1 = move-exception;
        throw r1;
    L_0x0079:
        r1 = move-exception;
        throw r1;
    L_0x007b:
        r3 = r2;
        goto L_0x0016;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.iI.b(java.util.Map$Entry):void");
    }

    public Iterator j() {
        try {
            return this.b ? new g9(this.c.entrySet().iterator()) : this.c.entrySet().iterator();
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    private void a(Entry entry, eb ebVar) {
        dH dHVar = (dH) entry.getKey();
        try {
            if (dHVar.b() == d0.MESSAGE) {
                if (!dHVar.c()) {
                    try {
                        if (!dHVar.a()) {
                            try {
                                ebVar.b(((dH) entry.getKey()).e(), (fO) entry.getValue());
                                if (!bA.b) {
                                    return;
                                }
                            } catch (IllegalArgumentException e) {
                                throw e;
                            }
                        }
                    } catch (IllegalArgumentException e2) {
                        throw e2;
                    }
                }
            }
            a(dHVar, entry.getValue(), ebVar);
        } catch (IllegalArgumentException e22) {
            throw e22;
        } catch (IllegalArgumentException e222) {
            throw e222;
        }
    }

    static {
        int i;
        int i2;
        String[] strArr = new String[12];
        char[] toCharArray = " \nQ&l-\u0007FH,h\bC\u000e%'\u0005N\u0019%*\u000e\u0002\u0003d$\u0007G\u0004%'\u0005\u0002\u000ej&FP\u0005u-\nV\u0005ah\rK\u0005i,\u0018\f".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 72;
                    break;
                case at.g /*1*/:
                    i2 = arj.Theme_seekBarStyle;
                    break;
                case at.i /*2*/:
                    i2 = 34;
                    break;
                case at.o /*3*/:
                    i2 = 96;
                    break;
                default:
                    i2 = 5;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "/\u000eV2`8\u000eC\u0014`,-K\u0005i,C\u000b@f)\u0005\u0002\u000fk$\u0012\u0002\u0002`h\bC\fi-\u000f\u0002\u000fkh\u0019G\u0010`)\u001fG\u0004%.\u0002G\fa;E".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 72;
                    break;
                case at.g /*1*/:
                    i2 = arj.Theme_seekBarStyle;
                    break;
                case at.i /*2*/:
                    i2 = 34;
                    break;
                case at.o /*3*/:
                    i2 = 96;
                    break;
                default:
                    i2 = 5;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[1] = new String(cArr).intern();
        toCharArray = "\u001f\u0019M\u000ebh\u0004@\n`+\u001f\u0002\u0014|8\u000e\u0002\u0015v-\u000f\u0002\u0017l<\u0003\u0002\u0010w'\u001fM\u0003j$KO\u0005v;\nE\u0005%:\u000eD\f`+\u001fK\u000fkf".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 72;
                    break;
                case at.g /*1*/:
                    i2 = arj.Theme_seekBarStyle;
                    break;
                case at.i /*2*/:
                    i2 = 34;
                    break;
                case at.o /*3*/:
                    i2 = 96;
                    break;
                default:
                    i2 = 5;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[2] = new String(cArr).intern();
        toCharArray = ")\u000fF2`8\u000eC\u0014`,-K\u0005i,C\u000b@f)\u0005\u0002\u000fk$\u0012\u0002\u0002`h\bC\fi-\u000f\u0002\u000fkh\u0019G\u0010`)\u001fG\u0004%.\u0002G\fa;E".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 72;
                    break;
                case at.g /*1*/:
                    i2 = arj.Theme_seekBarStyle;
                    break;
                case at.i /*2*/:
                    i2 = 34;
                    break;
                case at.o /*3*/:
                    i2 = 96;
                    break;
                default:
                    i2 = 5;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[3] = new String(cArr).intern();
        toCharArray = "\u001f\u0019M\u000ebh\u0004@\n`+\u001f\u0002\u0014|8\u000e\u0002\u0015v-\u000f\u0002\u0017l<\u0003\u0002\u0010w'\u001fM\u0003j$KO\u0005v;\nE\u0005%:\u000eD\f`+\u001fK\u000fkf".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 72;
                    break;
                case at.g /*1*/:
                    i2 = arj.Theme_seekBarStyle;
                    break;
                case at.i /*2*/:
                    i2 = 34;
                    break;
                case at.o /*3*/:
                    i2 = 96;
                    break;
                default:
                    i2 = 5;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[4] = new String(cArr).intern();
        toCharArray = "\u001c\u0003G\u0012`h\u0002Q@k'KU\u0001|h\u001fM@b-\u001f\u0002\b`:\u000e\u000e@g=\u001f\u0002\u0014m-KA\u000fh8\u0002N\u0005wh\u001fJ\tk#\u0018\u0002\u000fq \u000eP\u0017l;\u000e\f".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 72;
                    break;
                case at.g /*1*/:
                    i2 = arj.Theme_seekBarStyle;
                    break;
                case at.i /*2*/:
                    i2 = 34;
                    break;
                case at.o /*3*/:
                    i2 = 96;
                    break;
                default:
                    i2 = 5;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[5] = new String(cArr).intern();
        toCharArray = ":\u000eC\u0004U:\u0002O\tq!\u001dG&l-\u0007FH,h\bC\u000ek'\u001f\u0002\bd&\u000fN\u0005%-\u0006@\u0005a,\u000eF@h-\u0018Q\u0001b-\u0018\f".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 72;
                    break;
                case at.g /*1*/:
                    i2 = arj.Theme_seekBarStyle;
                    break;
                case at.i /*2*/:
                    i2 = 34;
                    break;
                case at.o /*3*/:
                    i2 = 96;
                    break;
                default:
                    i2 = 5;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[6] = new String(cArr).intern();
        toCharArray = ":\u000eC\u0004U:\u0002O\tq!\u001dG&l-\u0007FH,h\bC\u000ek'\u001f\u0002\bd&\u000fN\u0005%-\u0005W\rvf".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 72;
                    break;
                case at.g /*1*/:
                    i2 = arj.Theme_seekBarStyle;
                    break;
                case at.i /*2*/:
                    i2 = 34;
                    break;
                case at.o /*3*/:
                    i2 = 96;
                    break;
                default:
                    i2 = 5;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[7] = new String(cArr).intern();
        toCharArray = ":\u000eC\u0004U:\u0002O\tq!\u001dG&l-\u0007FH,h\bC\u000ek'\u001f\u0002\bd&\u000fN\u0005%&\u000eQ\u0014`,KE\u0012j=\u001bQN".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 72;
                    break;
                case at.g /*1*/:
                    i2 = arj.Theme_seekBarStyle;
                    break;
                case at.i /*2*/:
                    i2 = 34;
                    break;
                case at.o /*3*/:
                    i2 = 96;
                    break;
                default:
                    i2 = 5;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[8] = new String(cArr).intern();
        toCharArray = "/\u000eV2`8\u000eC\u0014`,-K\u0005i,C\u000b@f)\u0005\u0002\u000fk$\u0012\u0002\u0002`h\bC\fi-\u000f\u0002\u000fkh\u0019G\u0010`)\u001fG\u0004%.\u0002G\fa;E".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 72;
                    break;
                case at.g /*1*/:
                    i2 = arj.Theme_seekBarStyle;
                    break;
                case at.i /*2*/:
                    i2 = 34;
                    break;
                case at.o /*3*/:
                    i2 = 96;
                    break;
                default:
                    i2 = 5;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[9] = new String(cArr).intern();
        toCharArray = "\u001f\u0019M\u000ebh\u0004@\n`+\u001f\u0002\u0014|8\u000e\u0002\u0015v-\u000f\u0002\u0017l<\u0003\u0002\u0010w'\u001fM\u0003j$KO\u0005v;\nE\u0005%:\u000eD\f`+\u001fK\u000fkf".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 72;
                    break;
                case at.g /*1*/:
                    i2 = arj.Theme_seekBarStyle;
                    break;
                case at.i /*2*/:
                    i2 = 34;
                    break;
                case at.o /*3*/:
                    i2 = 96;
                    break;
                default:
                    i2 = 5;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[10] = new String(cArr).intern();
        toCharArray = "\u001c\u0003G\u0012`h\u0002Q@k'KU\u0001|h\u001fM@b-\u001f\u0002\b`:\u000e\u000e@g=\u001f\u0002\u0014m-KA\u000fh8\u0002N\u0005wh\u001fJ\tk#\u0018\u0002\u000fq \u000eP\u0017l;\u000e\f".toCharArray();
        int length2 = toCharArray.length;
        cArr = toCharArray;
        for (length = 0; length2 > length; length++) {
            c = cArr[length];
            switch (length % 5) {
                case v.m /*0*/:
                    i2 = 72;
                    break;
                case at.g /*1*/:
                    i2 = arj.Theme_seekBarStyle;
                    break;
                case at.i /*2*/:
                    i2 = 34;
                    break;
                case at.o /*3*/:
                    i2 = 96;
                    break;
                default:
                    i2 = 5;
                    break;
            }
            cArr[length] = (char) (i2 ^ c);
        }
        strArr[11] = new String(cArr).intern();
        z = strArr;
        a = new iI(true);
    }
}
