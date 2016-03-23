package com.whatsapp;

import android.os.Handler;
import android.os.Looper;
import com.whatsapp.protocol.co;
import com.whatsapp.util.Log;
import com.whatsapp.util.ag;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Stack;
import org.v;
import org.whispersystems.at;

public class u1 {
    private static u1 e;
    private static final String[] z;
    private Runnable a;
    private final Stack b;
    private boolean c;
    private Handler d;

    static {
        String[] strArr = new String[4];
        String str = "\u001a\u0016S#H\u0016\u0006C%M\u0018\u0004Y&F\u0016\u0017\u0018;\\\u0012\u0006Rj";
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
                        i3 = 119;
                        break;
                    case at.g /*1*/:
                        i3 = 115;
                        break;
                    case at.i /*2*/:
                        i3 = 55;
                        break;
                    case at.o /*3*/:
                        i3 = 74;
                        break;
                    default:
                        i3 = 41;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\u001a\u0016S#H\u0016\u0006C%M\u0018\u0004Y&F\u0016\u0017\u0018?Y\u0013\u0012C/X\u0002\u0016B/\t";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "\u001a\u0016S#H\u0016\u0006C%M\u0018\u0004Y&F\u0016\u0017\u0018)H\u0019\u0010R&\t";
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u001a\u0016S#H\u0016\u0006C%M\u0018\u0004Y&F\u0016\u0017\u0018?Y\u0013\u0012C/Z\u0003\u0012C/\t";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void b() {
        boolean z = DialogToastActivity.f;
        synchronized (this.b) {
            Log.i(z[2] + this.b.size());
            int az = App.az();
            Collection arrayList = new ArrayList();
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                co coVar = (co) it.next();
                if (!App.a(az, coVar)) {
                    arrayList.add(coVar);
                    continue;
                }
                if (z) {
                    break;
                }
            }
            this.b.removeAll(arrayList);
        }
    }

    static boolean b(u1 u1Var) {
        return u1Var.c;
    }

    public static synchronized u1 a() {
        u1 u1Var;
        synchronized (u1.class) {
            if (e == null) {
                e = new u1();
            }
            u1Var = e;
        }
        return u1Var;
    }

    static Stack a(u1 u1Var) {
        return u1Var.b;
    }

    private u1() {
        this.b = new Stack();
        this.d = new Handler(Looper.getMainLooper());
        this.a = new aq6(this);
        aav com_whatsapp_aav = new aav(this, null);
        com_whatsapp_aav.setPriority(1);
        com_whatsapp_aav.start();
    }

    public void b(co coVar) {
        boolean z = DialogToastActivity.f;
        synchronized (this.b) {
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                co coVar2 = (co) it.next();
                if (coVar.k.equals(coVar2.k)) {
                    Log.i(z[3] + ag.g(coVar.q));
                    this.b.remove(coVar2);
                    if (!z) {
                        break;
                    }
                }
                if (z) {
                    break;
                }
            }
        }
    }

    public void a(co coVar) {
        if (coVar.c == null || v.a(coVar, true, null) != null) {
            synchronized (this.b) {
                Log.i(z[0] + ag.g(coVar.q));
                this.b.add(coVar);
                if (!this.c) {
                    this.b.notifyAll();
                }
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(boolean r7) {
        /*
        r6 = this;
        r1 = r6.b;
        monitor-enter(r1);
        r0 = new java.lang.StringBuilder;	 Catch:{ all -> 0x004c }
        r0.<init>();	 Catch:{ all -> 0x004c }
        r2 = z;	 Catch:{ all -> 0x004c }
        r3 = 1;
        r2 = r2[r3];	 Catch:{ all -> 0x004c }
        r0 = r0.append(r2);	 Catch:{ all -> 0x004c }
        r2 = r6.c;	 Catch:{ all -> 0x004c }
        r0 = r0.append(r2);	 Catch:{ all -> 0x004c }
        r2 = " ";
        r0 = r0.append(r2);	 Catch:{ all -> 0x004c }
        r0 = r0.append(r7);	 Catch:{ all -> 0x004c }
        r0 = r0.toString();	 Catch:{ all -> 0x004c }
        com.whatsapp.util.Log.i(r0);	 Catch:{ all -> 0x004c }
        r0 = r6.d;	 Catch:{ all -> 0x004c }
        r2 = r6.a;	 Catch:{ all -> 0x004c }
        r0.removeCallbacks(r2);	 Catch:{ all -> 0x004c }
        if (r7 == 0) goto L_0x003f;
    L_0x0032:
        r0 = r6.d;	 Catch:{ all -> 0x004c }
        r2 = r6.a;	 Catch:{ all -> 0x004c }
        r4 = 15000; // 0x3a98 float:2.102E-41 double:7.411E-320;
        r0.postDelayed(r2, r4);	 Catch:{ all -> 0x004c }
        r0 = com.whatsapp.DialogToastActivity.f;	 Catch:{ all -> 0x004c }
        if (r0 == 0) goto L_0x0048;
    L_0x003f:
        r0 = r6.c;	 Catch:{ all -> 0x004c }
        if (r0 == 0) goto L_0x0048;
    L_0x0043:
        r0 = r6.b;	 Catch:{ all -> 0x004c }
        r0.notifyAll();	 Catch:{ all -> 0x004c }
    L_0x0048:
        r6.c = r7;	 Catch:{ all -> 0x004c }
        monitor-exit(r1);	 Catch:{ all -> 0x004c }
        return;
    L_0x004c:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x004c }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.u1.a(boolean):void");
    }
}
