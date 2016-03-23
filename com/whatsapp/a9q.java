package com.whatsapp;

import android.text.TextUtils;
import org.v;
import org.whispersystems.at;

public class a9q {
    private static final String[] z;
    private String a;
    private long b;
    private String c;
    private boolean d;
    private boolean e;
    private boolean f;
    private String g;
    private long h;
    private String i;
    private String j;
    private String k;
    private String l;

    static {
        String[] strArr = new String[2];
        String str = "\u0004e!z5<t&n1<s+i$\u0016{:|";
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
                        i3 = 99;
                        break;
                    case at.g /*1*/:
                        i3 = 23;
                        break;
                    case at.i /*2*/:
                        i3 = 78;
                        break;
                    case at.o /*3*/:
                        i3 = 15;
                        break;
                    default:
                        i3 = 69;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    i = 1;
                    strArr2 = strArr3;
                    str = "\ny*f3\ns;n)<t&n1<s+i$\u0016{:|";
                    obj = null;
            }
        }
    }

    static boolean j(a9q com_whatsapp_a9q) {
        return com_whatsapp_a9q.f;
    }

    static boolean i(a9q com_whatsapp_a9q) {
        return com_whatsapp_a9q.e;
    }

    static String a(a9q com_whatsapp_a9q) {
        return com_whatsapp_a9q.g;
    }

    static String b(a9q com_whatsapp_a9q, String str) {
        com_whatsapp_a9q.g = str;
        return str;
    }

    static String l(a9q com_whatsapp_a9q) {
        return com_whatsapp_a9q.i;
    }

    a9q(ky kyVar) {
        this();
    }

    static boolean n(a9q com_whatsapp_a9q) {
        return com_whatsapp_a9q.d;
    }

    public long h() {
        return this.h > System.currentTimeMillis() ? this.h : 0;
    }

    static boolean a(a9q com_whatsapp_a9q, boolean z) {
        com_whatsapp_a9q.f = z;
        return z;
    }

    static long b(a9q com_whatsapp_a9q, long j) {
        com_whatsapp_a9q.b = j;
        return j;
    }

    public String b() {
        return (!this.e || TextUtils.isEmpty(this.i)) ? i().i : this.i;
    }

    public String c() {
        if (!this.e || this.j == null) {
            return i().j;
        }
        return this.j;
    }

    static String c(a9q com_whatsapp_a9q, String str) {
        com_whatsapp_a9q.j = str;
        return str;
    }

    public boolean k() {
        return this.e;
    }

    static String c(a9q com_whatsapp_a9q) {
        return com_whatsapp_a9q.l;
    }

    static long b(a9q com_whatsapp_a9q) {
        return com_whatsapp_a9q.b;
    }

    static String e(a9q com_whatsapp_a9q, String str) {
        com_whatsapp_a9q.c = str;
        return str;
    }

    static String g(a9q com_whatsapp_a9q, String str) {
        com_whatsapp_a9q.l = str;
        return str;
    }

    public String e() {
        return (!this.e || TextUtils.isEmpty(this.l)) ? i().l : this.l;
    }

    static String f(a9q com_whatsapp_a9q, String str) {
        com_whatsapp_a9q.a = str;
        return str;
    }

    static String d(a9q com_whatsapp_a9q) {
        return com_whatsapp_a9q.a;
    }

    private a9q i() {
        if (z[0].equals(this.c) || z[1].equals(this.c)) {
            return this;
        }
        return qm.i(this.c) ? a3b.a(App.z()).g() : a3b.a(App.z()).d();
    }

    static a9q h(a9q com_whatsapp_a9q) {
        return com_whatsapp_a9q.i();
    }

    public boolean a() {
        return !f() || this.d;
    }

    public String g() {
        return (!this.e || this.k == null) ? i().k : this.k;
    }

    static String a(a9q com_whatsapp_a9q, String str) {
        com_whatsapp_a9q.i = str;
        return str;
    }

    static String f(a9q com_whatsapp_a9q) {
        return com_whatsapp_a9q.c;
    }

    static String g(a9q com_whatsapp_a9q) {
        return com_whatsapp_a9q.j;
    }

    public String d() {
        return (!this.e || TextUtils.isEmpty(this.g)) ? i().g : this.g;
    }

    private a9q() {
    }

    static boolean c(a9q com_whatsapp_a9q, boolean z) {
        com_whatsapp_a9q.e = z;
        return z;
    }

    static boolean b(a9q com_whatsapp_a9q, boolean z) {
        com_whatsapp_a9q.d = z;
        return z;
    }

    static String k(a9q com_whatsapp_a9q) {
        return com_whatsapp_a9q.k;
    }

    static long a(a9q com_whatsapp_a9q, long j) {
        com_whatsapp_a9q.h = j;
        return j;
    }

    public boolean f() {
        return h() != 0;
    }

    static String d(a9q com_whatsapp_a9q, String str) {
        com_whatsapp_a9q.k = str;
        return str;
    }

    private boolean j() {
        a9q i = i();
        return TextUtils.equals(c(), i.c()) && TextUtils.equals(l(), i.l()) && TextUtils.equals(b(), i.b()) && TextUtils.equals(e(), i.e()) && TextUtils.equals(g(), i.g()) && TextUtils.equals(d(), i.d());
    }

    static long e(a9q com_whatsapp_a9q) {
        return com_whatsapp_a9q.h;
    }

    public String l() {
        return (!this.e || TextUtils.isEmpty(this.a)) ? i().a : this.a;
    }

    static boolean m(a9q com_whatsapp_a9q) {
        return com_whatsapp_a9q.j();
    }
}
