package com.whatsapp;

import android.app.Activity;
import android.location.Location;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.ListView;
import com.whatsapp.protocol.cx;
import java.util.ArrayList;
import org.v;
import org.whispersystems.at;

public abstract class aox {
    private static final String z;
    private ag a;
    private a4f b;
    private int c;
    private final tm d;
    private long e;
    private Runnable f;
    private ListView g;
    private View h;
    protected ArrayList i;
    protected ArrayList j;
    private final akc k;
    private Activity l;
    private String m;
    private a2_ n;
    private Handler o;

    static {
        char[] toCharArray = "\u0018zx".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 114;
                    break;
                case at.g /*1*/:
                    i2 = 19;
                    break;
                case at.i /*2*/:
                    i2 = 28;
                    break;
                case at.o /*3*/:
                    i2 = 31;
                    break;
                default:
                    i2 = 38;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public abstract void a();

    public abstract void a(cx cxVar, boolean z);

    public abstract Location f();

    static Handler e(aox com_whatsapp_aox) {
        return com_whatsapp_aox.o;
    }

    static long a(aox com_whatsapp_aox, long j) {
        com_whatsapp_aox.e = j;
        return j;
    }

    public void a(ArrayList arrayList) {
        this.i = arrayList;
        this.a.notifyDataSetChanged();
        int indexOf = this.j.indexOf(this.i.get(0));
        if (VERSION.SDK_INT >= 8) {
            this.g.smoothScrollToPosition(indexOf);
            if (!DialogToastActivity.f) {
                return;
            }
        }
        this.g.setSelection(indexOf);
    }

    public void e() {
        d_ d4Var = new d4(this, this.m, true);
        this.o.removeCallbacks(this.f);
        this.o.postDelayed(this.f, this.e);
        App.a(d4Var);
        c();
    }

    private void c() {
        this.l.runOnUiThread(new xc(this));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean g() {
        /*
        r4 = this;
        r0 = 0;
        r1 = r4.l;
        r1 = r1.getResources();
        r2 = 2131427494; // 0x7f0b00a6 float:1.8476606E38 double:1.0530651014E-314;
        r1 = r1.getDimension(r2);
        r2 = r4.l;
        r2 = r2.getResources();
        r2 = r2.getDisplayMetrics();
        r2 = r2.density;
        r1 = r1 + r2;
        r2 = r4.l;
        r2 = r2.getResources();
        r3 = 2131427517; // 0x7f0b00bd float:1.8476652E38 double:1.0530651128E-314;
        r2 = r2.getDimension(r3);
        r3 = r4.j;
        r3 = r3.size();
        r3 = (float) r3;
        r1 = r1 * r3;
        r1 = java.lang.Math.min(r1, r2);
        r1 = (int) r1;
        r2 = r4.c;
        if (r1 == r2) goto L_0x0059;
    L_0x0039:
        r4.c = r1;
        if (r1 != 0) goto L_0x0048;
    L_0x003d:
        r2 = r4.h;
        r3 = 8;
        r2.setVisibility(r3);
        r2 = com.whatsapp.DialogToastActivity.f;
        if (r2 == 0) goto L_0x0058;
    L_0x0048:
        r2 = r4.h;
        r2.setVisibility(r0);
        r0 = r4.h;
        r2 = new android.widget.LinearLayout$LayoutParams;
        r3 = -1;
        r2.<init>(r3, r1);
        r0.setLayoutParams(r2);
    L_0x0058:
        r0 = 1;
    L_0x0059:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.aox.g():boolean");
    }

    static Activity c(aox com_whatsapp_aox) {
        return com_whatsapp_aox.l;
    }

    static ag d(aox com_whatsapp_aox) {
        return com_whatsapp_aox.a;
    }

    public void a(Activity activity) {
        this.l = activity;
        this.m = activity.getIntent().getStringExtra(z);
        this.j = j2.a.c(this.m);
        this.g = (ListView) activity.findViewById(16908298);
        this.g.setOnItemClickListener(new ath(this));
        this.h = activity.findViewById(2131755691);
        this.h.setVisibility(8);
        this.a = new ag(this, activity, this.j);
        this.g.setAdapter(this.a);
        g();
        j2.a.a(this.b);
        App.aK.b(this.k);
        App.b(this.d);
    }

    static Runnable g(aox com_whatsapp_aox) {
        return com_whatsapp_aox.f;
    }

    static void f(aox com_whatsapp_aox) {
        com_whatsapp_aox.c();
    }

    public void d() {
        this.i.clear();
        this.a.notifyDataSetChanged();
    }

    public aox() {
        this.n = new a2_();
        this.i = new ArrayList();
        this.o = new Handler(Looper.getMainLooper());
        this.e = 30000;
        this.b = new s(this);
        this.f = new hh(this);
        this.k = new akh(this);
        this.d = new fn(this);
    }

    public void b() {
        this.n.a();
        j2.a.b(this.b);
        App.aK.a(this.k);
        App.a(this.d);
    }

    static long i(aox com_whatsapp_aox) {
        return com_whatsapp_aox.e;
    }

    public void h() {
        this.o.removeCallbacks(this.f);
        App.a(new f4(this.m));
    }

    static String a(aox com_whatsapp_aox) {
        return com_whatsapp_aox.m;
    }

    static boolean h(aox com_whatsapp_aox) {
        return com_whatsapp_aox.g();
    }

    static a2_ b(aox com_whatsapp_aox) {
        return com_whatsapp_aox.n;
    }
}
