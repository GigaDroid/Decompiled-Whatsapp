package com.whatsapp;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.util.HashMap;
import java.util.Map.Entry;

public class fs {
    private final HashMap a;
    private final Handler b;
    private final HashMap c;

    public long e(String str) {
        x8 x8Var = (x8) this.c.get(str);
        if (x8Var == null) {
            return 0;
        }
        return x8Var.b;
    }

    public int a(String str, String str2) {
        x8 x8Var = (x8) this.c.get(str);
        if (x8Var == null) {
            return -1;
        }
        if (str2 == null || !qm.i(str)) {
            if (a(x8Var.e)) {
                return x8Var.c;
            }
            return -1;
        } else if (x8Var.d == null) {
            return -1;
        } else {
            a4z com_whatsapp_a4z = (a4z) x8Var.d.get(str2);
            if (com_whatsapp_a4z == null) {
                return -1;
            }
            return a(com_whatsapp_a4z.b) ? com_whatsapp_a4z.a : -1;
        }
    }

    public void a(String str, boolean z) {
        x8 x8Var = (x8) this.c.get(str);
        if (x8Var == null) {
            x8Var = new x8(null);
            this.c.put(str, x8Var);
        }
        x8Var.a = z;
        if (!z) {
            x8Var.b = 0;
        }
    }

    public aus b(String str) {
        boolean z = DialogToastActivity.f;
        x8 x8Var = (x8) this.c.get(str);
        if (x8Var == null) {
            return null;
        }
        int i;
        if (qm.i(str)) {
            if (x8Var.d == null) {
                return null;
            }
            String str2;
            Object obj;
            long j = 0;
            int i2 = -1;
            aus com_whatsapp_aus = null;
            for (Entry entry : x8Var.d.entrySet()) {
                if (((a4z) entry.getValue()).b > j) {
                    String str3 = (String) entry.getKey();
                    j = ((a4z) entry.getValue()).b;
                    i = ((a4z) entry.getValue()).a;
                    str2 = str3;
                } else {
                    i = i2;
                    obj = com_whatsapp_aus;
                }
                if (z) {
                    break;
                }
                i2 = i;
                Object obj2 = str2;
            }
            i = i2;
            obj = com_whatsapp_aus;
            if (a(j)) {
                return new aus(str2, i);
            }
            if (!z) {
                return null;
            }
        }
        i = a(str, null);
        if (i != -1) {
            return new aus(str, i);
        }
        return null;
    }

    public void b(String str, String str2) {
        x8 x8Var;
        x8 x8Var2 = (x8) this.c.get(str);
        if (x8Var2 == null) {
            x8Var2 = new x8(null);
            this.c.put(str, x8Var2);
            x8Var = x8Var2;
        } else {
            x8Var = x8Var2;
        }
        if (str2 != null && qm.i(str)) {
            if (x8Var.d == null) {
                x8Var.d = new HashMap();
            }
            a4z com_whatsapp_a4z = (a4z) x8Var.d.get(str2);
            if (com_whatsapp_a4z == null) {
                com_whatsapp_a4z = new a4z(null);
                x8Var.d.put(str2, com_whatsapp_a4z);
            }
            com_whatsapp_a4z.b = 0;
        }
        x8Var.e = 0;
        aaz com_whatsapp_aaz = (aaz) this.a.get(str + str2);
        if (com_whatsapp_aaz != null) {
            this.b.removeCallbacks(com_whatsapp_aaz);
        }
    }

    private static boolean a(long j) {
        return j != 0 && 25000 + j > SystemClock.elapsedRealtime();
    }

    public fs() {
        this.b = new Handler(Looper.getMainLooper());
        this.a = new HashMap();
        this.c = new HashMap();
    }

    public void c(String str) {
        x8 x8Var = (x8) this.c.get(str);
        if (x8Var == null) {
            x8Var = new x8(null);
            this.c.put(str, x8Var);
        }
        x8Var.b = 1;
    }

    public void a(String str, String str2, int i) {
        x8 x8Var;
        x8 x8Var2 = (x8) this.c.get(str);
        if (x8Var2 == null) {
            x8Var2 = new x8(null);
            this.c.put(str, x8Var2);
            x8Var = x8Var2;
        } else {
            x8Var = x8Var2;
        }
        if (str2 != null && qm.i(str)) {
            if (x8Var.d == null) {
                x8Var.d = new HashMap();
            }
            a4z com_whatsapp_a4z = (a4z) x8Var.d.get(str2);
            if (com_whatsapp_a4z == null) {
                com_whatsapp_a4z = new a4z(null);
                x8Var.d.put(str2, com_whatsapp_a4z);
            }
            com_whatsapp_a4z.b = SystemClock.elapsedRealtime();
            com_whatsapp_a4z.a = i;
        }
        x8Var.e = SystemClock.elapsedRealtime();
        x8Var.c = i;
        String str3 = str + str2;
        Runnable runnable = (aaz) this.a.get(str3);
        if (runnable == null) {
            runnable = new aaz(this, str, str2);
            this.a.put(str3, runnable);
        }
        this.b.removeCallbacks(runnable);
        this.b.postDelayed(runnable, 25000);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String a(java.lang.String r9, long r10) {
        /*
        r8 = this;
        r2 = 0;
        r6 = 0;
        r1 = com.whatsapp.DialogToastActivity.f;
        r0 = r8.c;
        r0 = r0.get(r9);
        r0 = (com.whatsapp.x8) r0;
        if (r0 != 0) goto L_0x0019;
    L_0x000f:
        r0 = new com.whatsapp.x8;
        r0.<init>(r2);
        r3 = r8.c;
        r3.put(r9, r0);
    L_0x0019:
        r3 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1));
        if (r3 != 0) goto L_0x0021;
    L_0x001d:
        r0.b = r6;
        if (r1 == 0) goto L_0x0023;
    L_0x0021:
        r0.b = r10;
    L_0x0023:
        r0.e = r6;
        r0 = r8.c;
        r0 = r0.entrySet();
        r3 = r0.iterator();
    L_0x002f:
        r0 = r3.hasNext();
        if (r0 == 0) goto L_0x0064;
    L_0x0035:
        r0 = r3.next();
        r0 = (java.util.Map.Entry) r0;
        r1 = r0.getKey();
        r1 = (java.lang.String) r1;
        r1 = com.whatsapp.qm.i(r1);
        if (r1 == 0) goto L_0x002f;
    L_0x0047:
        r1 = r0.getValue();
        r1 = (com.whatsapp.x8) r1;
        r4 = r1.d;
        if (r4 == 0) goto L_0x002f;
    L_0x0051:
        r1 = r1.d;
        r1 = r1.get(r9);
        r1 = (com.whatsapp.a4z) r1;
        if (r1 == 0) goto L_0x002f;
    L_0x005b:
        r1.b = r6;
        r0 = r0.getKey();
        r0 = (java.lang.String) r0;
    L_0x0063:
        return r0;
    L_0x0064:
        r0 = r2;
        goto L_0x0063;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.fs.a(java.lang.String, long):java.lang.String");
    }

    public boolean d(String str) {
        x8 x8Var = (x8) this.c.get(str);
        if (x8Var == null || !x8Var.a) {
            return false;
        }
        return true;
    }

    public boolean a(String str) {
        if (qm.i(str)) {
            return true;
        }
        boolean z;
        x8 x8Var = (x8) this.c.get(str);
        if (x8Var == null || x8Var.b != 1) {
            z = false;
        } else {
            z = true;
        }
        return z;
    }

    static HashMap a(fs fsVar) {
        return fsVar.c;
    }

    public void a() {
        boolean z = DialogToastActivity.f;
        this.c.clear();
        for (aaz removeCallbacks : this.a.values()) {
            this.b.removeCallbacks(removeCallbacks);
            if (z) {
                break;
            }
        }
        this.a.clear();
    }
}
