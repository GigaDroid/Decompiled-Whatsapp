package com.whatsapp;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.support.v4.util.LruCache;
import com.whatsapp.gallerypicker.e;
import com.whatsapp.gallerypicker.f;
import com.whatsapp.gallerypicker.r;
import com.whatsapp.protocol.co;
import java.util.HashMap;

class d3 implements e {
    private final String a;
    private final ContentResolver b;
    private final LruCache c;
    private final a9u d;

    public void b(ContentObserver contentObserver) {
        if (this.d != null) {
            this.d.registerContentObserver(contentObserver);
        }
    }

    public void a(ContentObserver contentObserver) {
        if (this.d != null) {
            this.d.unregisterContentObserver(contentObserver);
        }
    }

    public int e() {
        return this.d.getCount();
    }

    public void a() {
        this.d.close();
    }

    public HashMap c() {
        return null;
    }

    public void d() {
        if (this.d != null) {
            this.d.a(App.aK.e(this.a));
        }
        this.c.evictAll();
    }

    public boolean b() {
        return e() == 0;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected com.whatsapp.gallerypicker.r a(com.whatsapp.a9u r12) {
        /*
        r11 = this;
        r9 = com.whatsapp.DialogToastActivity.f;
        r10 = r12.e();
        r0 = r10.Q;
        r0 = (com.whatsapp.MediaData) r0;
        r3 = 0;
        if (r0 == 0) goto L_0x0017;
    L_0x000d:
        r1 = r0.file;
        if (r1 == 0) goto L_0x0017;
    L_0x0011:
        r0 = r0.file;
        r3 = r0.getAbsolutePath();
    L_0x0017:
        r0 = r10.c;
        switch(r0) {
            case 1: goto L_0x0024;
            case 2: goto L_0x003f;
            case 3: goto L_0x0030;
            case 4: goto L_0x001c;
            case 5: goto L_0x001c;
            case 6: goto L_0x001c;
            case 7: goto L_0x001c;
            case 8: goto L_0x001c;
            case 9: goto L_0x004e;
            default: goto L_0x001c;
        };
    L_0x001c:
        r0 = new com.whatsapp.dm;
        r0.<init>(r11);
    L_0x0021:
        r0.a = r10;
        return r0;
    L_0x0024:
        r0 = new com.whatsapp.gallerypicker.u;
        r2 = r11.b;
        r4 = r10.b;
        r1 = r11;
        r0.<init>(r1, r2, r3, r4);
        if (r9 == 0) goto L_0x0021;
    L_0x0030:
        r0 = new com.whatsapp.gallerypicker.v;
        r2 = r11.b;
        r4 = r10.b;
        r1 = r10.H;
        r6 = (long) r1;
        r1 = r11;
        r0.<init>(r1, r2, r3, r4, r6);
        if (r9 == 0) goto L_0x0021;
    L_0x003f:
        r0 = new com.whatsapp.gallerypicker.s;
        r2 = r11.b;
        r4 = r10.b;
        r1 = r10.H;
        r6 = (long) r1;
        r1 = r11;
        r0.<init>(r1, r2, r3, r4, r6);
        if (r9 == 0) goto L_0x0021;
    L_0x004e:
        r0 = new com.whatsapp.gallerypicker.t;
        r2 = r11.b;
        r4 = r10.b;
        r1 = r10.R;
        r6 = (long) r1;
        r8 = r10.n;
        r1 = r11;
        r0.<init>(r1, r2, r3, r4, r6, r8);
        if (r9 == 0) goto L_0x0021;
    L_0x005f:
        goto L_0x001c;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.d3.a(com.whatsapp.a9u):com.whatsapp.gallerypicker.r");
    }

    public r m479a(int i) {
        r rVar = (r) this.c.get(Integer.valueOf(i));
        if (rVar == null) {
            synchronized (this) {
                if (this.d.moveToPosition(i)) {
                    rVar = a(this.d);
                } else {
                    rVar = null;
                }
                if (rVar != null) {
                    this.c.put(Integer.valueOf(i), rVar);
                }
            }
        }
        return rVar;
    }

    public co b(int i) {
        return a(i).a;
    }

    public d3(ContentResolver contentResolver, String str) {
        this.c = new LruCache(512);
        this.b = contentResolver;
        this.a = str;
        this.d = new a9u(str, App.aK.e(str));
    }

    public f a(int i) {
        return a(i);
    }
}
