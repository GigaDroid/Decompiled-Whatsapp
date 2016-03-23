package com.whatsapp.protocol;

import com.whatsapp.WAAppCompatActivity;
import com.whatsapp.arj;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class co {
    private static final String[] T;
    public static boolean s;
    public static final int[] y;
    public String A;
    public b1 B;
    public int C;
    private boolean D;
    public b1 E;
    public long F;
    public long G;
    public int H;
    public volatile long I;
    public String J;
    public byte[] K;
    public int L;
    public boolean M;
    public String N;
    public long O;
    public boolean P;
    public Object Q;
    public int R;
    public long S;
    public String a;
    public long b;
    public byte c;
    public int d;
    public String e;
    public boolean f;
    public String g;
    public String[] h;
    public int i;
    public Integer j;
    public c3 k;
    public double l;
    public double m;
    public String n;
    public String o;
    private String p;
    public String q;
    public int r;
    public String t;
    public int u;
    public String v;
    private byte[] w;
    public boolean x;
    public long z;

    private co(String str, boolean z) {
        this.f = true;
        this.I = -1;
        this.j = null;
        this.i = 0;
        this.k = a(str, z);
    }

    public static boolean a(int i) {
        return i == 10 || i == 9 || i == 8;
    }

    public co(co coVar) {
        boolean z = s;
        this(coVar.k);
        this.t = coVar.t;
        this.g = coVar.g;
        this.p = coVar.p;
        this.w = coVar.w;
        this.B = coVar.B;
        this.E = coVar.E;
        this.u = coVar.u;
        this.b = coVar.b;
        this.r = coVar.r;
        this.q = coVar.q;
        this.N = coVar.N;
        this.n = coVar.n;
        this.c = coVar.c;
        this.z = coVar.z;
        this.o = coVar.o;
        this.H = coVar.H;
        this.R = coVar.R;
        this.A = coVar.A;
        this.a = coVar.a;
        this.M = coVar.M;
        this.m = coVar.m;
        this.l = coVar.l;
        this.e = coVar.e;
        this.x = coVar.x;
        this.L = coVar.L;
        this.G = coVar.G;
        this.v = coVar.v;
        this.S = coVar.S;
        this.O = coVar.O;
        this.F = coVar.F;
        this.J = coVar.J;
        this.Q = coVar.Q;
        this.f = coVar.f;
        this.I = coVar.I;
        this.j = coVar.j;
        this.i = coVar.i;
        if (WAAppCompatActivity.c != 0) {
            s = !z;
        }
    }

    public void b(b1 b1Var) {
        this.E = b1Var;
    }

    public static String a(byte b) {
        if (b == null) {
            return null;
        }
        if (b == 7) {
            try {
                return T[4];
            } catch (IllegalStateException e) {
                throw e;
            }
        } else if (b == 1) {
            try {
                return T[9];
            } catch (IllegalStateException e2) {
                throw e2;
            }
        } else if (b == 2) {
            try {
                return T[3];
            } catch (IllegalStateException e22) {
                throw e22;
            }
        } else if (b == 3) {
            try {
                return T[8];
            } catch (IllegalStateException e222) {
                throw e222;
            }
        } else if (b == 4) {
            try {
                return T[6];
            } catch (IllegalStateException e2222) {
                throw e2222;
            }
        } else if (b == 5) {
            try {
                return T[5];
            } catch (IllegalStateException e22222) {
                throw e22222;
            }
        } else if (b != 9) {
            return null;
        } else {
            try {
                return T[7];
            } catch (IllegalStateException e222222) {
                throw e222222;
            }
        }
    }

    public void a(byte[] bArr) {
        this.w = bArr;
        this.p = null;
    }

    static {
        String[] strArr = new String[17];
        String str = "TjZ*QpkI6D";
        int i = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i2 = 0;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i3 = 0; length > i3; i3++) {
                int i4;
                char c = cArr[i3];
                switch (i3 % 5) {
                    case v.m /*0*/:
                        i4 = 20;
                        break;
                    case at.g /*1*/:
                        i4 = 8;
                        break;
                    case at.i /*2*/:
                        i4 = 40;
                        break;
                    case at.o /*3*/:
                        i4 = 69;
                        break;
                    default:
                        i4 = 48;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "ym[6Qsm\b,T4kG0\\p(F*D4jMeSfmI1Up";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    i2 = 3;
                    strArr2 = strArr3;
                    str = "u}L,_";
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    i2 = 4;
                    str = "gq[1Uy";
                    i = 3;
                    strArr2 = strArr3;
                    break;
                case at.o /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    str = "xgK$D}gF";
                    i = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "bkI7T";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "pgK0]qf\\";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i2] = str;
                    str = "baL _";
                    i = 7;
                    i2 = 8;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i2] = str;
                    i2 = 9;
                    strArr2 = strArr3;
                    str = "}eI\"U";
                    i = 8;
                    break;
                case aF.u /*8*/:
                    strArr2[i2] = str;
                    i2 = 10;
                    str = "}eI\"U";
                    i = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i2] = str;
                    i2 = 11;
                    str = "gq[1Uy";
                    i = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i2] = str;
                    i2 = 12;
                    str = "baL _";
                    i = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i2] = str;
                    i2 = 13;
                    str = "xgK$D}gF";
                    i = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i2] = str;
                    i2 = 14;
                    str = "pgK0]qf\\";
                    i = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i2] = str;
                    str = "bkI7T";
                    i = 14;
                    i2 = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i2] = str;
                    i2 = 16;
                    strArr2 = strArr3;
                    str = "u}L,_";
                    i = 15;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i2] = str;
                    T = strArr3;
                    y = new int[]{14, 0, 1, 2, 3, 4, 5, 11, 12, 13, 8, 9, 10, 7, 6};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "`zQ,^s(\\*\u0010sm\\eTu|IeQg(\\ H`(G+\u0010fi_e]q{[$Wq";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    public int d() {
        try {
            if (this.E != null) {
                return this.E.a;
            }
            try {
                return this.B != null ? this.B.a : 0;
            } catch (IllegalStateException e) {
                throw e;
            }
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    public byte[] e() {
        try {
            if (this.w == null) {
                if (this.p != null) {
                    this.w = b7.a(this.p);
                }
            }
            return this.w;
        } catch (IllegalStateException e) {
            throw e;
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    public co(String str, byte[] bArr, Object obj) {
        this(str, true);
        this.w = bArr;
        this.Q = obj;
        this.b = bu.a().b();
    }

    public boolean f() {
        try {
            if (this.E == null) {
                if (this.B == null) {
                    return false;
                }
            }
            return true;
        } catch (IllegalStateException e) {
            throw e;
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    public boolean a() {
        try {
            if (this.p == null) {
                if (this.w == null) {
                    return false;
                }
            }
            return true;
        } catch (IllegalStateException e) {
            throw e;
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    public boolean b() {
        return this.D;
    }

    public void a(boolean z) {
        this.D = z;
    }

    public co(c3 c3Var) {
        this.f = true;
        this.I = -1;
        this.j = null;
        this.i = 0;
        this.k = c3Var;
    }

    public static boolean a(String str) {
        if (str == null) {
            return false;
        }
        try {
            return str.endsWith(T[0]);
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public void b(String str) {
        this.p = str;
        this.w = null;
    }

    public static byte c(String str) {
        if (str == null) {
            return (byte) 0;
        }
        try {
            if (str.length() == 0) {
                return (byte) 0;
            }
            try {
                if (str.equalsIgnoreCase(T[11])) {
                    return (byte) 7;
                }
                try {
                    if (str.equalsIgnoreCase(T[10])) {
                        return (byte) 1;
                    }
                    try {
                        if (str.equalsIgnoreCase(T[16])) {
                            return (byte) 2;
                        }
                        try {
                            if (str.equalsIgnoreCase(T[12])) {
                                return (byte) 3;
                            }
                            try {
                                if (str.equalsIgnoreCase(T[15])) {
                                    return (byte) 4;
                                }
                                try {
                                    if (str.equalsIgnoreCase(T[13])) {
                                        return (byte) 5;
                                    }
                                    try {
                                        if (str.equalsIgnoreCase(T[14])) {
                                            return (byte) 9;
                                        }
                                        return (byte) 0;
                                    } catch (IllegalStateException e) {
                                        throw e;
                                    }
                                } catch (IllegalStateException e2) {
                                    throw e2;
                                }
                            } catch (IllegalStateException e22) {
                                throw e22;
                            }
                        } catch (IllegalStateException e222) {
                            throw e222;
                        }
                    } catch (IllegalStateException e2222) {
                        throw e2222;
                    }
                } catch (IllegalStateException e22222) {
                    throw e22222;
                }
            } catch (IllegalStateException e222222) {
                throw e222222;
            }
        } catch (IllegalStateException e2222222) {
            throw e2222222;
        }
    }

    public co(String str, String str2, Object obj) {
        this(str, true);
        this.p = str2;
        this.Q = obj;
        this.b = bu.a().b();
    }

    public static c3 a(String str, boolean z) {
        bq a = bu.a();
        byte[] a2 = a.a();
        if (a2 != null) {
            return new c3(str, z, a.b(a2));
        }
        try {
            throw new IllegalStateException(T[2]);
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public void a(b1 b1Var) {
        this.B = b1Var;
    }

    public String c() {
        try {
            if (this.u == 1) {
                throw new RuntimeException(T[1]);
            }
            try {
                if (this.p == null) {
                    if (this.w != null) {
                        this.p = b7.a(this.w);
                    }
                }
                return this.p;
            } catch (IllegalStateException e) {
                throw e;
            } catch (IllegalStateException e2) {
                throw e2;
            }
        } catch (IllegalStateException e22) {
            throw e22;
        }
    }
}
