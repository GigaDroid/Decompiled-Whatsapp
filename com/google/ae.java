package com.google;

import com.whatsapp.arj;
import java.io.Serializable;
import org.v;
import org.whispersystems.at;

public class ae implements Serializable {
    private static final long serialVersionUID = 1;
    private static final String[] z;
    private String a;
    private boolean b;
    private aw c;
    private int d;
    private boolean e;
    private boolean f;
    private String g;
    private long h;
    private boolean i;
    private boolean j;
    private String k;
    private boolean l;
    private boolean m;
    private boolean n;

    static {
        String[] strArr = new String[6];
        String str = "m\u000f\u001f;k#9\u000e `wj";
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
                        i3 = 77;
                        break;
                    case at.g /*1*/:
                        i3 = 74;
                        break;
                    case at.i /*2*/:
                        i3 = arj.Theme_checkedTextViewStyle;
                        break;
                    case at.o /*3*/:
                        i3 = 79;
                        break;
                    default:
                        i3 = 14;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "m\u001a\u0015*h(8\u0015*jm\u000e\b\"k>>\u000e,.\u000e+\u0015=g(8G\fa)/]o";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "m\u0004\u0006;g\"$\u0006#.\u0003?\n-k?pG";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "m\t\b:`98\u001eoM\".\u0002o]\"?\u0015,kwj";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "\u000e%\u0012!z?3G\fa)/]o";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "m\u0006\u0002.j$$\u0000oT(8\bu.98\u0012*";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public ae c(String str) {
        if (str == null) {
            try {
                throw new NullPointerException();
            } catch (NullPointerException e) {
                throw e;
            }
        }
        this.b = true;
        this.k = str;
        return this;
    }

    public String q() {
        return this.a;
    }

    public boolean b(ae aeVar) {
        if (aeVar == null) {
            return false;
        }
        if (this == aeVar) {
            return true;
        }
        try {
            if (this.d == aeVar.d) {
                if (this.h == aeVar.h) {
                    try {
                        if (this.g.equals(aeVar.g)) {
                            try {
                                if (this.e == aeVar.e) {
                                    try {
                                        if (this.a.equals(aeVar.a)) {
                                            try {
                                                if (this.c == aeVar.c) {
                                                    try {
                                                        if (this.k.equals(aeVar.k)) {
                                                            try {
                                                                if (b() == aeVar.b()) {
                                                                    return true;
                                                                }
                                                            } catch (NullPointerException e) {
                                                                throw e;
                                                            }
                                                        }
                                                    } catch (NullPointerException e2) {
                                                        throw e2;
                                                    }
                                                }
                                            } catch (NullPointerException e22) {
                                                throw e22;
                                            }
                                        }
                                    } catch (NullPointerException e222) {
                                        throw e222;
                                    }
                                }
                            } catch (NullPointerException e2222) {
                                throw e2222;
                            }
                        }
                    } catch (NullPointerException e22222) {
                        throw e22222;
                    }
                }
            }
            return false;
        } catch (NullPointerException e222222) {
            throw e222222;
        } catch (NullPointerException e2222222) {
            throw e2222222;
        }
    }

    public final ae p() {
        t();
        c();
        d();
        j();
        v();
        l();
        s();
        return this;
    }

    public ae c() {
        this.f = false;
        this.h = 0;
        return this;
    }

    public String f() {
        return this.k;
    }

    public ae t() {
        this.i = false;
        this.d = 0;
        return this;
    }

    public ae l() {
        this.n = false;
        this.c = aw.FROM_NUMBER_WITH_PLUS_SIGN;
        return this;
    }

    public int hashCode() {
        int i = 1231;
        int n = (((((n() + 2173) * 53) + Long.valueOf(u()).hashCode()) * 53) + r().hashCode()) * 53;
        try {
            int i2;
            if (g()) {
                i2 = 1231;
            } else {
                i2 = 1237;
            }
            i2 = (((((((i2 + n) * 53) + q().hashCode()) * 53) + k().hashCode()) * 53) + f().hashCode()) * 53;
            try {
                if (!b()) {
                    i = 1237;
                }
                return i2 + i;
            } catch (NullPointerException e) {
                throw e;
            }
        } catch (NullPointerException e2) {
            throw e2;
        }
    }

    public boolean h() {
        return this.f;
    }

    public boolean b() {
        return this.b;
    }

    public long u() {
        return this.h;
    }

    public ae v() {
        this.j = false;
        this.a = "";
        return this;
    }

    public ae d() {
        this.m = false;
        this.g = "";
        return this;
    }

    public ae b(String str) {
        if (str == null) {
            try {
                throw new NullPointerException();
            } catch (NullPointerException e) {
                throw e;
            }
        }
        this.j = true;
        this.a = str;
        return this;
    }

    public ae a(long j) {
        this.f = true;
        this.h = j;
        return this;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        try {
            stringBuilder.append(z[5]).append(this.d);
            stringBuilder.append(z[3]).append(this.h);
            if (e()) {
                if (g()) {
                    stringBuilder.append(z[1]);
                }
            }
            try {
                if (o()) {
                    stringBuilder.append(z[0]).append(this.g);
                }
                try {
                    if (m()) {
                        stringBuilder.append(z[4]).append(this.c);
                    }
                    try {
                        if (b()) {
                            stringBuilder.append(z[2]).append(this.k);
                        }
                        return stringBuilder.toString();
                    } catch (NullPointerException e) {
                        throw e;
                    }
                } catch (NullPointerException e2) {
                    throw e2;
                }
            } catch (NullPointerException e22) {
                throw e22;
            }
        } catch (NullPointerException e222) {
            throw e222;
        } catch (NullPointerException e2222) {
            throw e2222;
        }
    }

    public String r() {
        return this.g;
    }

    public ae s() {
        this.b = false;
        this.k = "";
        return this;
    }

    public ae() {
        this.d = 0;
        this.h = 0;
        this.g = "";
        this.e = false;
        this.a = "";
        this.k = "";
        this.c = aw.FROM_NUMBER_WITH_PLUS_SIGN;
    }

    public ae a(String str) {
        if (str == null) {
            try {
                throw new NullPointerException();
            } catch (NullPointerException e) {
                throw e;
            }
        }
        this.m = true;
        this.g = str;
        return this;
    }

    public ae a(aw awVar) {
        if (awVar == null) {
            try {
                throw new NullPointerException();
            } catch (NullPointerException e) {
                throw e;
            }
        }
        this.n = true;
        this.c = awVar;
        return this;
    }

    public ae a(boolean z) {
        this.l = true;
        this.e = z;
        return this;
    }

    public boolean equals(Object obj) {
        try {
            if (obj instanceof ae) {
                if (b((ae) obj)) {
                    return true;
                }
            }
            return false;
        } catch (NullPointerException e) {
            throw e;
        } catch (NullPointerException e2) {
            throw e2;
        }
    }

    public boolean m() {
        return this.n;
    }

    public int n() {
        return this.d;
    }

    public aw k() {
        return this.c;
    }

    public boolean e() {
        return this.l;
    }

    public ae j() {
        this.l = false;
        this.e = false;
        return this;
    }

    public boolean o() {
        return this.m;
    }

    public boolean i() {
        return this.j;
    }

    public boolean g() {
        return this.e;
    }

    public boolean a() {
        return this.i;
    }

    public ae a(ae aeVar) {
        try {
            if (aeVar.a()) {
                a(aeVar.n());
            }
            try {
                if (aeVar.h()) {
                    a(aeVar.u());
                }
                try {
                    if (aeVar.o()) {
                        a(aeVar.r());
                    }
                    try {
                        if (aeVar.e()) {
                            a(aeVar.g());
                        }
                        try {
                            if (aeVar.i()) {
                                b(aeVar.q());
                            }
                            try {
                                if (aeVar.m()) {
                                    a(aeVar.k());
                                }
                                try {
                                    if (aeVar.b()) {
                                        c(aeVar.f());
                                    }
                                    return this;
                                } catch (NullPointerException e) {
                                    throw e;
                                }
                            } catch (NullPointerException e2) {
                                throw e2;
                            }
                        } catch (NullPointerException e22) {
                            throw e22;
                        }
                    } catch (NullPointerException e222) {
                        throw e222;
                    }
                } catch (NullPointerException e2222) {
                    throw e2222;
                }
            } catch (NullPointerException e22222) {
                throw e22222;
            }
        } catch (NullPointerException e222222) {
            throw e222222;
        }
    }

    public ae a(int i) {
        this.i = true;
        this.d = i;
        return this;
    }
}
