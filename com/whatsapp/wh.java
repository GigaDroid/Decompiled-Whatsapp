package com.whatsapp;

import android.os.SystemClock;
import com.whatsapp.fieldstats.ar;
import com.whatsapp.fieldstats.i;
import java.util.HashMap;
import java.util.Map;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class wh implements ce {
    private static final String[] z;
    private final String a;
    private long b;
    private ds c;
    private Map d;
    private Map e;
    private long f;
    private final long g;
    private Map h;
    private Map i;
    private Map j;

    static {
        String[] strArr = new String[12];
        String str = "Ect\u0003)yia\u0002`{a&\fz5hi\u0011)soh\fz}cbI)frg\u0011l/";
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
                        i3 = 21;
                        break;
                    case at.g /*1*/:
                        i3 = 6;
                        break;
                    case at.i /*2*/:
                        i3 = 6;
                        break;
                    case at.o /*3*/:
                        i3 = arj.Theme_buttonStyleSmall;
                        break;
                    default:
                        i3 = 9;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "ect\u0003)yia\u0002`{a&\rhf&g\t{pgb\u001c)|ho\u0011`trc\u0001)zt&\u0000gqcbI)frg\u0011l/";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "Ect\u0003)yia\u0002`{a&\fz5hi\u0011)gsh\u000b`{a*Ezagr\u00003";
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    str = "Ano\u0016)fsdEdttm\u0000{5ouEgzr&\u0017|{ho\u000bn";
                    obj = 3;
                    strArr2 = strArr3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "Ano\u0016)fsdEdttm\u0000{5ng\u0016)tjt\u0000hq\u007f&\u0007lph&\u0006fxvj\u0000}pb";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    str = "Ect\u0003)yia\u0002`{a&\fz5hi\u0011)gsh\u000b`{a*Ezagr\u00003";
                    obj = 5;
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    strArr2 = strArr3;
                    str = "Fik\u0000)fsdEypt`Edttm\u0000{f&n\u0004\u007fp&h\n}5`o\u000b`fnc\u0001%5uo\u001fl/";
                    obj = 6;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "Ect\u0003)yia\u0002`{a&\fz5gj\u0017ltb\u007fEzagt\u0011lq*&\u0016}trc_";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    str = "Ano\u0016)fsdEdttm\u0000{5ng\u0016)tjt\u0000hq\u007f&\u0007lph&\u0006fxvj\u0000}pb";
                    obj = 8;
                    i = 9;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    strArr2 = strArr3;
                    str = "Ano\u0016)fsdEdttm\u0000{5ouEhytc\u0004ml&t\u0010g{oh\u0002";
                    obj = 9;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "Ect\u0003)yia\u0002`{a&\fz5hi\u0011)gsh\u000b`{a*Ezagr\u00003";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "Ect\u0003)yia\u0002`{a&\fz5hi\u0011)gsh\u000b`{a*Ezagr\u00003";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void b(t4 t4Var) {
        a(t4Var, b());
    }

    public void d() {
        a(b());
    }

    public void a(t4 t4Var) {
        if (this.c != ds.ENDED) {
            if (this.c != ds.RUNNING) {
                throw new AssertionError(z[3] + this.c.name());
            } else if (!this.d.containsKey(t4Var)) {
                throw new AssertionError(z[4]);
            } else if (this.j.containsKey(t4Var)) {
                throw new AssertionError(z[5]);
            } else {
                long b = b() - ((Long) this.d.get(t4Var)).longValue();
                this.d.remove(t4Var);
                this.j.put(t4Var, Long.valueOf(b));
            }
        }
    }

    wh(String str) {
        this(str, 1);
    }

    public void a(tb tbVar, boolean z) {
        if (this.c != ds.ENDED) {
            this.e.put(tbVar, Boolean.valueOf(z));
        }
    }

    public void a(long j) {
        if (this.c != ds.ENDED) {
            if (this.c != ds.RUNNING) {
                throw new AssertionError(z[6] + this.c.name());
            } else if (this.d.isEmpty()) {
                long j2 = j - this.b;
                this.c = ds.ENDED;
                this.f = j2;
                d(j2);
            } else {
                throw new AssertionError(z[7] + this.d.size());
            }
        }
    }

    public boolean c() {
        return this.c == ds.RUNNING;
    }

    public void m1034b() {
        if (this.c != ds.ENDED) {
            if (this.c != ds.RUNNING) {
                throw new AssertionError(z[1] + this.c.name());
            }
            this.c = ds.ENDED;
        }
    }

    public void a(a5a com_whatsapp_a5a, int i) {
        if (this.c != ds.ENDED) {
            this.i.put(com_whatsapp_a5a, Integer.valueOf(i));
        }
    }

    public void c(long j) {
        if (this.c != ds.NOT_INITIATED) {
            throw new AssertionError(z[8] + this.c.name());
        }
        this.c = ds.ENDED;
        this.f = j;
        d(j);
    }

    public long a() {
        if (this.c == ds.ENDED) {
            return this.f;
        }
        throw new AssertionError(z[0] + this.c.name());
    }

    private static long b() {
        return SystemClock.elapsedRealtime();
    }

    wh(String str, long j) {
        boolean z = tp.d;
        this.a = str;
        this.d = new HashMap();
        this.j = new HashMap();
        this.e = new HashMap();
        this.i = new HashMap();
        this.h = new HashMap();
        this.c = ds.NOT_INITIATED;
        this.g = j;
        if (z) {
            WAAppCompatActivity.c++;
        }
    }

    public void a(t4 t4Var, long j) {
        if (this.c != ds.ENDED) {
            if (this.c != ds.RUNNING) {
                throw new AssertionError(z[11] + this.c.name());
            } else if (this.d.containsKey(t4Var)) {
                throw new AssertionError(z[10]);
            } else if (this.j.containsKey(t4Var)) {
                throw new AssertionError(z[9]);
            } else {
                this.d.put(t4Var, Long.valueOf(j));
            }
        }
    }

    public void e() {
        b(b());
    }

    private void d(long j) {
        double d;
        double d2 = 1.0d;
        av arVar = new ar();
        arVar.a = this.a;
        arVar.f = Double.valueOf((double) j);
        if (this.j.containsKey(t4.PRE_CREATE)) {
            arVar.u = Double.valueOf((double) ((Long) this.j.get(t4.PRE_CREATE)).longValue());
        }
        if (this.j.containsKey(t4.ON_CREATE)) {
            arVar.v = Double.valueOf((double) ((Long) this.j.get(t4.ON_CREATE)).longValue());
        }
        if (this.j.containsKey(t4.ON_CREATE_VIEW)) {
            arVar.q = Double.valueOf((double) ((Long) this.j.get(t4.ON_CREATE_VIEW)).longValue());
        }
        if (this.j.containsKey(t4.ON_ACTIVITY_CREATED)) {
            arVar.c = Double.valueOf((double) ((Long) this.j.get(t4.ON_ACTIVITY_CREATED)).longValue());
        }
        if (this.j.containsKey(t4.ON_START)) {
            arVar.n = Double.valueOf((double) ((Long) this.j.get(t4.ON_START)).longValue());
        }
        if (this.j.containsKey(t4.ON_LAYOUT)) {
            arVar.i = Double.valueOf((double) ((Long) this.j.get(t4.ON_LAYOUT)).longValue());
        }
        if (this.j.containsKey(t4.ON_RESUME)) {
            arVar.b = Double.valueOf((double) ((Long) this.j.get(t4.ON_RESUME)).longValue());
        }
        if (this.j.containsKey(t4.INFLATE)) {
            arVar.o = Double.valueOf((double) ((Long) this.j.get(t4.INFLATE)).longValue());
        }
        if (this.j.containsKey(t4.FILL)) {
            arVar.h = Double.valueOf((double) ((Long) this.j.get(t4.FILL)).longValue());
        }
        if (this.j.containsKey(t4.REFRESH)) {
            arVar.g = Double.valueOf((double) ((Long) this.j.get(t4.REFRESH)).longValue());
        }
        if (App.s()) {
            d = 1.0d;
        } else {
            d = 0.0d;
        }
        arVar.r = Double.valueOf(d);
        if (this.e.containsKey(tb.FIRST_INIT)) {
            if (((Boolean) this.e.get(tb.FIRST_INIT)).booleanValue()) {
                d = 1.0d;
            } else {
                d = 0.0d;
            }
            arVar.e = Double.valueOf(d);
        }
        if (this.e.containsKey(tb.FROM_SAVED_STATE)) {
            if (((Boolean) this.e.get(tb.FROM_SAVED_STATE)).booleanValue()) {
                d = 1.0d;
            } else {
                d = 0.0d;
            }
            arVar.m = Double.valueOf(d);
        }
        if (this.e.containsKey(tb.REQUIRES_INFLATE)) {
            if (!((Boolean) this.e.get(tb.REQUIRES_INFLATE)).booleanValue()) {
                d2 = 0.0d;
            }
            arVar.l = Double.valueOf(d2);
        }
        if (this.i.containsKey(a5a.POSITION)) {
            arVar.t = Double.valueOf((double) ((Integer) this.i.get(a5a.POSITION)).intValue());
        }
        if (this.i.containsKey(a5a.COUNT)) {
            arVar.s = Double.valueOf((double) ((Integer) this.i.get(a5a.COUNT)).intValue());
        }
        if (this.i.containsKey(a5a.COUNT_2)) {
            arVar.j = Double.valueOf((double) ((Integer) this.i.get(a5a.COUNT_2)).intValue());
        }
        if (this.i.containsKey(a5a.COUNT_3)) {
            arVar.d = Double.valueOf((double) ((Integer) this.i.get(a5a.COUNT_3)).intValue());
        }
        arVar.k = (String) this.h.get(lx.ITEM_TYPE);
        arVar.p = Double.valueOf((double) this.g);
        i.a(App.z(), arVar);
    }

    public void b(long j) {
        if (this.c != ds.ENDED) {
            if (this.c != ds.NOT_INITIATED) {
                throw new AssertionError(z[2] + this.c.name());
            }
            this.b = j;
            this.c = ds.RUNNING;
        }
    }

    public void a(lx lxVar, String str) {
        if (this.c != ds.ENDED) {
            this.h.put(lxVar, str);
        }
    }
}
