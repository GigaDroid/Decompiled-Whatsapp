package com.whatsapp.protocol;

import org.v;
import org.whispersystems.at;

public class c9 {
    private static final String H;
    private String A;
    private String B;
    private String C;
    private co D;
    private b1 E;
    private byte[] F;
    private Byte G;
    private Boolean a;
    private Integer b;
    private String c;
    private Integer d;
    private Object e;
    private String f;
    private String g;
    private String h;
    private Long i;
    private Double j;
    private Integer k;
    private Boolean l;
    private String m;
    private Long n;
    private String o;
    private byte[] p;
    private Double q;
    private Boolean r;
    private String s;
    private String t;
    private Integer u;
    private String v;
    private String w;
    private b1 x;
    private Integer y;
    private Integer z;

    static {
        char[] toCharArray = "b6+b\u001da8xc\u0011~*1c\u0011k\u007f(c\u001b\u007f:*e\r/==w\u001b}:xx\u001a|+9\u007f\u0000f>,x\u001ah\u007f6t\u0003/66r\u001bb66vTb:+b\u0015h:".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 15;
                    break;
                case at.g /*1*/:
                    i2 = 95;
                    break;
                case at.i /*2*/:
                    i2 = 88;
                    break;
                case at.o /*3*/:
                    i2 = 17;
                    break;
                default:
                    i2 = 116;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        H = new String(cArr).intern();
    }

    public c9 a(Double d) {
        this.q = d;
        return this;
    }

    public c9 e(int i) {
        this.y = new Integer(i);
        return this;
    }

    public c9 h(String str) {
        this.o = str;
        return this;
    }

    public c9 g(String str) {
        this.f = str;
        return this;
    }

    public c9 k(String str) {
        this.s = str;
        return this;
    }

    public c9 a() {
        try {
            if (this.g != null) {
                if (this.a != null) {
                    try {
                        if (this.s != null) {
                            this.D = new co(new c3(this.g, this.a.booleanValue(), this.s));
                            return this;
                        }
                    } catch (UnsupportedOperationException e) {
                        throw e;
                    }
                }
            }
            throw new UnsupportedOperationException(H);
        } catch (UnsupportedOperationException e2) {
            throw e2;
        } catch (UnsupportedOperationException e22) {
            throw e22;
        }
    }

    public c9 c(int i) {
        this.u = new Integer(i);
        return this;
    }

    public b1 g() {
        return this.E;
    }

    public c9 b(Boolean bool) {
        this.l = bool;
        return this;
    }

    public c9 c(byte[] bArr) {
        this.p = bArr;
        return this;
    }

    public c9 d(int i) {
        this.d = new Integer(i);
        return this;
    }

    public Boolean c() {
        return this.r;
    }

    public c9 a(String str) {
        this.g = str;
        return this;
    }

    public c9 b(byte[] bArr) {
        this.F = bArr;
        return this;
    }

    public c9 a(byte[] bArr) {
        this.e = bArr;
        return this;
    }

    public c9 l(String str) {
        this.A = str;
        return this;
    }

    public c9 a(long j) {
        this.n = new Long(j);
        return this;
    }

    public Byte h() {
        return this.G;
    }

    public c9 a(boolean z) {
        Boolean bool;
        if (z) {
            try {
                bool = Boolean.TRUE;
            } catch (UnsupportedOperationException e) {
                throw e;
            }
        }
        bool = Boolean.FALSE;
        this.a = bool;
        return this;
    }

    public c9 c(String str) {
        this.h = str;
        return this;
    }

    public Integer e() {
        return this.d;
    }

    public c9 a(b1 b1Var) {
        this.E = b1Var;
        return this;
    }

    public c9 b(Double d) {
        this.j = d;
        return this;
    }

    public c9 b(int i) {
        this.z = new Integer(i);
        return this;
    }

    public c9 b(String str) {
        this.B = str;
        return this;
    }

    public c9 a(Integer num) {
        this.k = num;
        return this;
    }

    public c9 b(long j) {
        this.i = new Long(j);
        return this;
    }

    public c9 f(String str) {
        this.m = str;
        return this;
    }

    public c9 i(String str) {
        this.v = str;
        return this;
    }

    public c9 a(byte b) {
        this.G = new Byte(b);
        return this;
    }

    public c9 a(Boolean bool) {
        this.r = bool;
        return this;
    }

    public Integer f() {
        return this.u;
    }

    public c9 j(String str) {
        this.t = str;
        return this;
    }

    public b1 d() {
        return this.x;
    }

    public c9 e(String str) {
        this.c = str;
        return this;
    }

    public c9 b(b1 b1Var) {
        this.x = b1Var;
        return this;
    }

    public co b() {
        try {
            if (this.D == null) {
                return null;
            }
            try {
                if (this.g != null) {
                    if (this.a != null) {
                        try {
                            if (this.s != null) {
                                this.D.k = new c3(this.g, this.a.booleanValue(), this.s);
                            }
                        } catch (UnsupportedOperationException e) {
                            throw e;
                        }
                    }
                }
                try {
                    if (this.m != null) {
                        this.D.t = this.m;
                    }
                    try {
                        if (this.w != null) {
                            this.D.g = this.w;
                        }
                        try {
                            if (this.A != null) {
                                this.D.b(this.A);
                            }
                            try {
                                if (this.F != null) {
                                    this.D.a(this.F);
                                }
                                try {
                                    if (this.x != null) {
                                        this.D.a(this.x);
                                    }
                                    try {
                                        if (this.E != null) {
                                            this.D.b(this.E);
                                        }
                                        try {
                                            if (this.u != null) {
                                                this.D.C = this.u.intValue();
                                            }
                                            try {
                                                if (this.d != null) {
                                                    this.D.u = this.d.intValue();
                                                }
                                                try {
                                                    if (this.y != null) {
                                                        this.D.r = this.y.intValue();
                                                    }
                                                    try {
                                                        if (this.n != null) {
                                                            this.D.b = this.n.longValue();
                                                        }
                                                        try {
                                                            if (this.k != null) {
                                                                this.D.j = this.k;
                                                            }
                                                            try {
                                                                if (this.G != null) {
                                                                    this.D.c = this.G.byteValue();
                                                                }
                                                                try {
                                                                    if (this.i != null) {
                                                                        this.D.z = this.i.longValue();
                                                                    }
                                                                    try {
                                                                        if (this.c != null) {
                                                                            this.D.o = this.c;
                                                                        }
                                                                        try {
                                                                            if (this.b != null) {
                                                                                this.D.H = this.b.intValue();
                                                                            }
                                                                            try {
                                                                                if (this.z != null) {
                                                                                    this.D.R = this.z.intValue();
                                                                                }
                                                                                try {
                                                                                    if (this.C != null) {
                                                                                        this.D.q = this.C;
                                                                                    }
                                                                                    try {
                                                                                        if (this.t != null) {
                                                                                            this.D.N = this.t;
                                                                                        }
                                                                                        try {
                                                                                            if (this.v != null) {
                                                                                                this.D.n = this.v;
                                                                                            }
                                                                                            try {
                                                                                                if (this.f != null) {
                                                                                                    this.D.A = this.f;
                                                                                                }
                                                                                                try {
                                                                                                    if (this.o != null) {
                                                                                                        this.D.a = this.o;
                                                                                                    }
                                                                                                    try {
                                                                                                        if (this.r != null) {
                                                                                                            this.D.M = this.r.booleanValue();
                                                                                                        }
                                                                                                        try {
                                                                                                            if (this.q != null) {
                                                                                                                this.D.m = this.q.doubleValue();
                                                                                                            }
                                                                                                            try {
                                                                                                                if (this.j != null) {
                                                                                                                    this.D.l = this.j.doubleValue();
                                                                                                                }
                                                                                                                try {
                                                                                                                    if (this.B != null) {
                                                                                                                        this.D.e = this.B;
                                                                                                                    }
                                                                                                                    try {
                                                                                                                        if (this.l != null) {
                                                                                                                            this.D.x = this.l.booleanValue();
                                                                                                                        }
                                                                                                                        try {
                                                                                                                            if (this.h != null) {
                                                                                                                                this.D.J = this.h;
                                                                                                                            }
                                                                                                                            try {
                                                                                                                                if (this.e != null) {
                                                                                                                                    this.D.Q = this.e;
                                                                                                                                }
                                                                                                                                try {
                                                                                                                                    if (this.p != null) {
                                                                                                                                        this.D.K = this.p;
                                                                                                                                    }
                                                                                                                                    return this.D;
                                                                                                                                } catch (UnsupportedOperationException e2) {
                                                                                                                                    throw e2;
                                                                                                                                }
                                                                                                                            } catch (UnsupportedOperationException e22) {
                                                                                                                                throw e22;
                                                                                                                            }
                                                                                                                        } catch (UnsupportedOperationException e222) {
                                                                                                                            throw e222;
                                                                                                                        }
                                                                                                                    } catch (UnsupportedOperationException e2222) {
                                                                                                                        throw e2222;
                                                                                                                    }
                                                                                                                } catch (UnsupportedOperationException e22222) {
                                                                                                                    throw e22222;
                                                                                                                }
                                                                                                            } catch (UnsupportedOperationException e222222) {
                                                                                                                throw e222222;
                                                                                                            }
                                                                                                        } catch (UnsupportedOperationException e2222222) {
                                                                                                            throw e2222222;
                                                                                                        }
                                                                                                    } catch (UnsupportedOperationException e22222222) {
                                                                                                        throw e22222222;
                                                                                                    }
                                                                                                } catch (UnsupportedOperationException e222222222) {
                                                                                                    throw e222222222;
                                                                                                }
                                                                                            } catch (UnsupportedOperationException e2222222222) {
                                                                                                throw e2222222222;
                                                                                            }
                                                                                        } catch (UnsupportedOperationException e22222222222) {
                                                                                            throw e22222222222;
                                                                                        }
                                                                                    } catch (UnsupportedOperationException e222222222222) {
                                                                                        throw e222222222222;
                                                                                    }
                                                                                } catch (UnsupportedOperationException e2222222222222) {
                                                                                    throw e2222222222222;
                                                                                }
                                                                            } catch (UnsupportedOperationException e22222222222222) {
                                                                                throw e22222222222222;
                                                                            }
                                                                        } catch (UnsupportedOperationException e222222222222222) {
                                                                            throw e222222222222222;
                                                                        }
                                                                    } catch (UnsupportedOperationException e2222222222222222) {
                                                                        throw e2222222222222222;
                                                                    }
                                                                } catch (UnsupportedOperationException e22222222222222222) {
                                                                    throw e22222222222222222;
                                                                }
                                                            } catch (UnsupportedOperationException e222222222222222222) {
                                                                throw e222222222222222222;
                                                            }
                                                        } catch (UnsupportedOperationException e2222222222222222222) {
                                                            throw e2222222222222222222;
                                                        }
                                                    } catch (UnsupportedOperationException e22222222222222222222) {
                                                        throw e22222222222222222222;
                                                    }
                                                } catch (UnsupportedOperationException e222222222222222222222) {
                                                    throw e222222222222222222222;
                                                }
                                            } catch (UnsupportedOperationException e2222222222222222222222) {
                                                throw e2222222222222222222222;
                                            }
                                        } catch (UnsupportedOperationException e22222222222222222222222) {
                                            throw e22222222222222222222222;
                                        }
                                    } catch (UnsupportedOperationException e222222222222222222222222) {
                                        throw e222222222222222222222222;
                                    }
                                } catch (UnsupportedOperationException e2222222222222222222222222) {
                                    throw e2222222222222222222222222;
                                }
                            } catch (UnsupportedOperationException e22222222222222222222222222) {
                                throw e22222222222222222222222222;
                            }
                        } catch (UnsupportedOperationException e222222222222222222222222222) {
                            throw e222222222222222222222222222;
                        }
                    } catch (UnsupportedOperationException e2222222222222222222222222222) {
                        throw e2222222222222222222222222222;
                    }
                } catch (UnsupportedOperationException e22222222222222222222222222222) {
                    throw e22222222222222222222222222222;
                }
            } catch (UnsupportedOperationException e222222222222222222222222222222) {
                throw e222222222222222222222222222222;
            } catch (UnsupportedOperationException e2222222222222222222222222222222) {
                throw e2222222222222222222222222222222;
            }
        } catch (UnsupportedOperationException e22222222222222222222222222222222) {
            throw e22222222222222222222222222222222;
        }
    }

    public c9 d(String str) {
        this.C = str;
        return this;
    }

    public c9 a(int i) {
        this.b = new Integer(i);
        return this;
    }
}
