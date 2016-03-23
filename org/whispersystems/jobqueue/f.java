package org.whispersystems.jobqueue;

import android.util.Log;

class f extends Thread {
    private static final String a;
    private final w b;
    private final e c;

    private n a(v vVar) {
        int f = vVar.f();
        int h = vVar.h();
        while (h < f) {
            try {
                vVar.i();
                return n.SUCCESS;
            } catch (Exception e) {
                Log.w(a, e);
                if (e instanceof RuntimeException) {
                    throw ((RuntimeException) e);
                }
                try {
                    if (!vVar.a(e)) {
                        return n.FAILURE;
                    }
                    try {
                        if (vVar.g()) {
                            int i = h + 1;
                            if (h.c) {
                                break;
                            }
                            h = i;
                        } else {
                            vVar.a(h + 1);
                            return n.DEFERRED;
                        }
                    } catch (Exception e2) {
                        throw e2;
                    }
                } catch (Exception e22) {
                    throw e22;
                }
            } catch (Exception e222) {
                throw e222;
            }
        }
        return n.FAILURE;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
        r6 = this;
        r0 = org.whispersystems.jobqueue.h.c;
    L_0x0002:
        r1 = r6.b;
        r1 = r1.a();
        r2 = r6.a(r1);
        r3 = org.whispersystems.jobqueue.n.DEFERRED;	 Catch:{ RuntimeException -> 0x0056 }
        if (r2 != r3) goto L_0x0017;
    L_0x0010:
        r3 = r6.b;	 Catch:{ RuntimeException -> 0x0058 }
        r3.b(r1);	 Catch:{ RuntimeException -> 0x0058 }
        if (r0 == 0) goto L_0x0044;
    L_0x0017:
        r3 = org.whispersystems.jobqueue.n.FAILURE;	 Catch:{ RuntimeException -> 0x005a }
        if (r2 != r3) goto L_0x001e;
    L_0x001b:
        r1.b();	 Catch:{ RuntimeException -> 0x005a }
    L_0x001e:
        r2 = r1.d();	 Catch:{ RuntimeException -> 0x005c }
        if (r2 == 0) goto L_0x002d;
    L_0x0024:
        r2 = r6.c;	 Catch:{ RuntimeException -> 0x005c }
        r4 = r1.c();	 Catch:{ RuntimeException -> 0x005c }
        r2.a(r4);	 Catch:{ RuntimeException -> 0x005c }
    L_0x002d:
        r2 = r1.k();	 Catch:{ RuntimeException -> 0x005e }
        if (r2 == 0) goto L_0x0044;
    L_0x0033:
        r2 = r1.l();	 Catch:{ RuntimeException -> 0x0060 }
        r4 = 0;
        r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r2 != 0) goto L_0x0044;
    L_0x003d:
        r2 = r1.k();	 Catch:{ RuntimeException -> 0x0060 }
        r2.release();	 Catch:{ RuntimeException -> 0x0060 }
    L_0x0044:
        r2 = r1.j();	 Catch:{ RuntimeException -> 0x0054 }
        if (r2 == 0) goto L_0x0002;
    L_0x004a:
        r2 = r6.b;	 Catch:{ RuntimeException -> 0x0054 }
        r1 = r1.j();	 Catch:{ RuntimeException -> 0x0054 }
        r2.b(r1);	 Catch:{ RuntimeException -> 0x0054 }
        goto L_0x0002;
    L_0x0054:
        r0 = move-exception;
        throw r0;
    L_0x0056:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x0058 }
    L_0x0058:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x005a }
    L_0x005a:
        r0 = move-exception;
        throw r0;
    L_0x005c:
        r0 = move-exception;
        throw r0;
    L_0x005e:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x0060 }
    L_0x0060:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.jobqueue.f.run():void");
    }

    public f(String str, w wVar, e eVar) {
        super(str);
        this.b = wVar;
        this.c = eVar;
    }

    static {
        a = f.class.getSimpleName();
    }
}
