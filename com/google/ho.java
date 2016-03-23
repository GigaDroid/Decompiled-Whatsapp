package com.google;

import com.whatsapp.WAAppCompatActivity;
import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.List;

public class ho implements Externalizable {
    private static final long serialVersionUID = 1;
    private boolean A;
    private String B;
    private boolean C;
    private boolean D;
    private boolean E;
    private boolean F;
    private ha G;
    private ha H;
    private boolean I;
    private boolean J;
    private boolean K;
    private ha L;
    private String M;
    private ha N;
    private boolean O;
    private ha P;
    private boolean Q;
    private boolean R;
    private String S;
    private boolean T;
    private boolean U;
    private boolean V;
    private boolean W;
    private ha X;
    private String Y;
    private boolean Z;
    private ha a;
    private boolean b;
    private boolean c;
    private String d;
    private List e;
    private boolean f;
    private boolean g;
    private ha h;
    private ha i;
    private boolean j;
    private boolean k;
    private boolean l;
    private String m;
    private boolean n;
    private ha o;
    private ha p;
    private List q;
    private ha r;
    private boolean s;
    private String t;
    private boolean u;
    private boolean v;
    private ha w;
    private boolean x;
    private int y;
    private String z;

    public boolean m() {
        return this.f;
    }

    public ha j() {
        return this.i;
    }

    public String h() {
        return this.B;
    }

    public ho f(String str) {
        this.f = true;
        this.S = str;
        return this;
    }

    public ha F() {
        return this.a;
    }

    public boolean n() {
        return this.E;
    }

    public ho a(b5 b5Var) {
        if (b5Var == null) {
            try {
                throw new NullPointerException();
            } catch (NullPointerException e) {
                throw e;
            }
        }
        this.e.add(b5Var);
        return this;
    }

    public ho a(ha haVar) {
        if (haVar == null) {
            try {
                throw new NullPointerException();
            } catch (NullPointerException e) {
                throw e;
            }
        }
        this.U = true;
        this.H = haVar;
        return this;
    }

    public boolean G() {
        return this.V;
    }

    public ho a(String str) {
        this.F = true;
        this.M = str;
        return this;
    }

    public boolean t() {
        return this.b;
    }

    public boolean S() {
        return this.K;
    }

    public ho j(ha haVar) {
        if (haVar == null) {
            try {
                throw new NullPointerException();
            } catch (NullPointerException e) {
                throw e;
            }
        }
        this.Q = true;
        this.N = haVar;
        return this;
    }

    public String E() {
        return this.t;
    }

    public ho m(ha haVar) {
        if (haVar == null) {
            try {
                throw new NullPointerException();
            } catch (NullPointerException e) {
                throw e;
            }
        }
        this.J = true;
        this.w = haVar;
        return this;
    }

    public b5 a(int i) {
        return (b5) this.e.get(i);
    }

    public String z() {
        return this.S;
    }

    public ha O() {
        return this.p;
    }

    public ho e(ha haVar) {
        if (haVar == null) {
            try {
                throw new NullPointerException();
            } catch (NullPointerException e) {
                throw e;
            }
        }
        this.E = true;
        this.P = haVar;
        return this;
    }

    public String U() {
        return this.d;
    }

    public int D() {
        return this.e.size();
    }

    public boolean Q() {
        return this.I;
    }

    public ho b(int i) {
        this.Z = true;
        this.y = i;
        return this;
    }

    public ho i(ha haVar) {
        if (haVar == null) {
            try {
                throw new NullPointerException();
            } catch (NullPointerException e) {
                throw e;
            }
        }
        this.c = true;
        this.i = haVar;
        return this;
    }

    public ho b(String str) {
        this.R = true;
        this.z = str;
        return this;
    }

    public boolean K() {
        return this.T;
    }

    public void readExternal(ObjectInput objectInput) {
        int i = 0;
        int i2 = e2.F;
        if (objectInput.readBoolean()) {
            ha haVar = new ha();
            haVar.readExternal(objectInput);
            g(haVar);
        }
        if (objectInput.readBoolean()) {
            haVar = new ha();
            haVar.readExternal(objectInput);
            c(haVar);
        }
        if (objectInput.readBoolean()) {
            haVar = new ha();
            haVar.readExternal(objectInput);
            m(haVar);
        }
        if (objectInput.readBoolean()) {
            haVar = new ha();
            haVar.readExternal(objectInput);
            d(haVar);
        }
        if (objectInput.readBoolean()) {
            haVar = new ha();
            haVar.readExternal(objectInput);
            e(haVar);
        }
        if (objectInput.readBoolean()) {
            haVar = new ha();
            haVar.readExternal(objectInput);
            j(haVar);
        }
        if (objectInput.readBoolean()) {
            haVar = new ha();
            haVar.readExternal(objectInput);
            k(haVar);
        }
        if (objectInput.readBoolean()) {
            haVar = new ha();
            haVar.readExternal(objectInput);
            b(haVar);
        }
        if (objectInput.readBoolean()) {
            haVar = new ha();
            haVar.readExternal(objectInput);
            i(haVar);
        }
        if (objectInput.readBoolean()) {
            haVar = new ha();
            haVar.readExternal(objectInput);
            l(haVar);
        }
        if (objectInput.readBoolean()) {
            haVar = new ha();
            haVar.readExternal(objectInput);
            f(haVar);
        }
        if (objectInput.readBoolean()) {
            haVar = new ha();
            haVar.readExternal(objectInput);
            h(haVar);
        }
        if (objectInput.readBoolean()) {
            haVar = new ha();
            haVar.readExternal(objectInput);
            a(haVar);
        }
        a(objectInput.readUTF());
        b(objectInput.readInt());
        g(objectInput.readUTF());
        if (objectInput.readBoolean()) {
            try {
                b(objectInput.readUTF());
            } catch (NullPointerException e) {
                throw e;
            }
        }
        if (objectInput.readBoolean()) {
            try {
                c(objectInput.readUTF());
            } catch (NullPointerException e2) {
                throw e2;
            }
        }
        if (objectInput.readBoolean()) {
            try {
                e(objectInput.readUTF());
            } catch (NullPointerException e22) {
                throw e22;
            }
        }
        if (objectInput.readBoolean()) {
            try {
                f(objectInput.readUTF());
            } catch (NullPointerException e222) {
                throw e222;
            }
        }
        if (objectInput.readBoolean()) {
            try {
                d(objectInput.readUTF());
            } catch (NullPointerException e2222) {
                throw e2222;
            }
        }
        b(objectInput.readBoolean());
        int readInt = objectInput.readInt();
        int i3 = 0;
        while (i3 < readInt) {
            b5 b5Var = new b5();
            b5Var.readExternal(objectInput);
            this.q.add(b5Var);
            i3++;
            if (i2 != 0) {
                break;
            }
        }
        i3 = objectInput.readInt();
        while (i < i3) {
            b5 b5Var2 = new b5();
            b5Var2.readExternal(objectInput);
            this.e.add(b5Var2);
            i++;
            if (i2 != 0) {
                break;
            }
        }
        a(objectInput.readBoolean());
        if (objectInput.readBoolean()) {
            try {
                h(objectInput.readUTF());
            } catch (NullPointerException e22222) {
                throw e22222;
            }
        }
        c(objectInput.readBoolean());
    }

    public ha w() {
        return this.P;
    }

    public ha X() {
        return this.G;
    }

    public ha T() {
        return this.h;
    }

    public boolean s() {
        return this.C;
    }

    public int H() {
        return this.q.size();
    }

    public boolean W() {
        return this.A;
    }

    public ho b(b5 b5Var) {
        if (b5Var == null) {
            try {
                throw new NullPointerException();
            } catch (NullPointerException e) {
                throw e;
            }
        }
        this.q.add(b5Var);
        return this;
    }

    public boolean Z() {
        return this.O;
    }

    public ha ae() {
        return this.r;
    }

    public boolean d() {
        return this.g;
    }

    public boolean Y() {
        return this.Z;
    }

    public boolean B() {
        return this.F;
    }

    public boolean f() {
        return this.l;
    }

    public ho c(boolean z) {
        this.j = true;
        this.V = z;
        return this;
    }

    public boolean g() {
        return this.x;
    }

    public ho c(ha haVar) {
        if (haVar == null) {
            try {
                throw new NullPointerException();
            } catch (NullPointerException e) {
                throw e;
            }
        }
        this.u = true;
        this.r = haVar;
        return this;
    }

    public boolean i() {
        return this.Q;
    }

    public List r() {
        return this.q;
    }

    public String c() {
        return this.Y;
    }

    public ha N() {
        return this.H;
    }

    public ha u() {
        return this.w;
    }

    public static hz l() {
        return new hz();
    }

    public boolean v() {
        return this.s;
    }

    public boolean A() {
        return this.v;
    }

    public void writeExternal(ObjectOutput objectOutput) {
        int i = 0;
        int i2 = e2.F;
        try {
            objectOutput.writeBoolean(this.T);
            if (this.T) {
                this.G.writeExternal(objectOutput);
            }
            try {
                objectOutput.writeBoolean(this.u);
                if (this.u) {
                    this.r.writeExternal(objectOutput);
                }
                try {
                    objectOutput.writeBoolean(this.J);
                    if (this.J) {
                        this.w.writeExternal(objectOutput);
                    }
                    try {
                        objectOutput.writeBoolean(this.K);
                        if (this.K) {
                            this.L.writeExternal(objectOutput);
                        }
                        try {
                            objectOutput.writeBoolean(this.E);
                            if (this.E) {
                                this.P.writeExternal(objectOutput);
                            }
                            try {
                                objectOutput.writeBoolean(this.Q);
                                if (this.Q) {
                                    this.N.writeExternal(objectOutput);
                                }
                                try {
                                    objectOutput.writeBoolean(this.C);
                                    if (this.C) {
                                        this.a.writeExternal(objectOutput);
                                    }
                                    try {
                                        objectOutput.writeBoolean(this.k);
                                        if (this.k) {
                                            this.h.writeExternal(objectOutput);
                                        }
                                        try {
                                            objectOutput.writeBoolean(this.c);
                                            if (this.c) {
                                                this.i.writeExternal(objectOutput);
                                            }
                                            try {
                                                objectOutput.writeBoolean(this.I);
                                                if (this.I) {
                                                    this.o.writeExternal(objectOutput);
                                                }
                                                try {
                                                    objectOutput.writeBoolean(this.l);
                                                    if (this.l) {
                                                        this.X.writeExternal(objectOutput);
                                                    }
                                                    try {
                                                        objectOutput.writeBoolean(this.n);
                                                        if (this.n) {
                                                            this.p.writeExternal(objectOutput);
                                                        }
                                                        try {
                                                            objectOutput.writeBoolean(this.U);
                                                            if (this.U) {
                                                                this.H.writeExternal(objectOutput);
                                                            }
                                                            try {
                                                                objectOutput.writeUTF(this.M);
                                                                objectOutput.writeInt(this.y);
                                                                objectOutput.writeUTF(this.m);
                                                                objectOutput.writeBoolean(this.R);
                                                                if (this.R) {
                                                                    objectOutput.writeUTF(this.z);
                                                                }
                                                                try {
                                                                    objectOutput.writeBoolean(this.b);
                                                                    if (this.b) {
                                                                        objectOutput.writeUTF(this.t);
                                                                    }
                                                                    try {
                                                                        objectOutput.writeBoolean(this.W);
                                                                        if (this.W) {
                                                                            objectOutput.writeUTF(this.d);
                                                                        }
                                                                        try {
                                                                            objectOutput.writeBoolean(this.f);
                                                                            if (this.f) {
                                                                                objectOutput.writeUTF(this.S);
                                                                            }
                                                                            try {
                                                                                int i3;
                                                                                objectOutput.writeBoolean(this.s);
                                                                                if (this.s) {
                                                                                    objectOutput.writeUTF(this.Y);
                                                                                }
                                                                                objectOutput.writeBoolean(this.v);
                                                                                int H = H();
                                                                                objectOutput.writeInt(H);
                                                                                int i4 = 0;
                                                                                while (i4 < H) {
                                                                                    ((b5) this.q.get(i4)).writeExternal(objectOutput);
                                                                                    i3 = i4 + 1;
                                                                                    if (i2 != 0) {
                                                                                        break;
                                                                                    }
                                                                                    i4 = i3;
                                                                                }
                                                                                i4 = D();
                                                                                objectOutput.writeInt(i4);
                                                                                while (i < i4) {
                                                                                    ((b5) this.e.get(i)).writeExternal(objectOutput);
                                                                                    i3 = i + 1;
                                                                                    if (i2 == 0) {
                                                                                        i = i3;
                                                                                    }
                                                                                }
                                                                                try {
                                                                                    break;
                                                                                    objectOutput.writeBoolean(this.g);
                                                                                    objectOutput.writeBoolean(this.x);
                                                                                    if (this.x) {
                                                                                        objectOutput.writeUTF(this.B);
                                                                                    }
                                                                                    try {
                                                                                        objectOutput.writeBoolean(this.V);
                                                                                        if (WAAppCompatActivity.c != 0) {
                                                                                            e2.F = i2 + 1;
                                                                                        }
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
                                                        } catch (NullPointerException e2222222) {
                                                            throw e2222222;
                                                        }
                                                    } catch (NullPointerException e22222222) {
                                                        throw e22222222;
                                                    }
                                                } catch (NullPointerException e222222222) {
                                                    throw e222222222;
                                                }
                                            } catch (NullPointerException e2222222222) {
                                                throw e2222222222;
                                            }
                                        } catch (NullPointerException e22222222222) {
                                            throw e22222222222;
                                        }
                                    } catch (NullPointerException e222222222222) {
                                        throw e222222222222;
                                    }
                                } catch (NullPointerException e2222222222222) {
                                    throw e2222222222222;
                                }
                            } catch (NullPointerException e22222222222222) {
                                throw e22222222222222;
                            }
                        } catch (NullPointerException e222222222222222) {
                            throw e222222222222222;
                        }
                    } catch (NullPointerException e2222222222222222) {
                        throw e2222222222222222;
                    }
                } catch (NullPointerException e22222222222222222) {
                    throw e22222222222222222;
                }
            } catch (NullPointerException e222222222222222222) {
                throw e222222222222222222;
            }
        } catch (NullPointerException e2222222222222222222) {
            throw e2222222222222222222;
        }
    }

    public boolean I() {
        return this.R;
    }

    public ha J() {
        return this.L;
    }

    public ho d(String str) {
        this.s = true;
        this.Y = str;
        return this;
    }

    public ho h(String str) {
        this.x = true;
        this.B = str;
        return this;
    }

    public ho h(ha haVar) {
        if (haVar == null) {
            try {
                throw new NullPointerException();
            } catch (NullPointerException e) {
                throw e;
            }
        }
        this.n = true;
        this.p = haVar;
        return this;
    }

    public ho k() {
        this.e.clear();
        return this;
    }

    public boolean V() {
        return this.k;
    }

    public List M() {
        return this.e;
    }

    public boolean P() {
        return this.g;
    }

    public boolean R() {
        return this.D;
    }

    public ho b(ha haVar) {
        if (haVar == null) {
            try {
                throw new NullPointerException();
            } catch (NullPointerException e) {
                throw e;
            }
        }
        this.k = true;
        this.h = haVar;
        return this;
    }

    public boolean o() {
        return this.j;
    }

    public ho k(ha haVar) {
        if (haVar == null) {
            try {
                throw new NullPointerException();
            } catch (NullPointerException e) {
                throw e;
            }
        }
        this.C = true;
        this.a = haVar;
        return this;
    }

    public b5 c(int i) {
        return (b5) this.q.get(i);
    }

    public int L() {
        return this.y;
    }

    public boolean aa() {
        return this.J;
    }

    public ha x() {
        return this.N;
    }

    public ho b(boolean z) {
        this.O = true;
        this.v = z;
        return this;
    }

    public boolean ad() {
        return this.W;
    }

    public boolean e() {
        return this.U;
    }

    public String p() {
        return this.M;
    }

    public ho() {
        this.G = null;
        this.r = null;
        this.w = null;
        this.L = null;
        this.P = null;
        this.N = null;
        this.a = null;
        this.h = null;
        this.i = null;
        this.o = null;
        this.X = null;
        this.p = null;
        this.H = null;
        this.M = "";
        this.y = 0;
        this.m = "";
        this.z = "";
        this.t = "";
        this.d = "";
        this.S = "";
        this.Y = "";
        this.v = false;
        this.q = new ArrayList();
        this.e = new ArrayList();
        this.g = false;
        this.B = "";
        this.V = false;
    }

    public String q() {
        return this.z;
    }

    public ho g(ha haVar) {
        if (haVar == null) {
            try {
                throw new NullPointerException();
            } catch (NullPointerException e) {
                throw e;
            }
        }
        this.T = true;
        this.G = haVar;
        return this;
    }

    public ho d(ha haVar) {
        if (haVar == null) {
            try {
                throw new NullPointerException();
            } catch (NullPointerException e) {
                throw e;
            }
        }
        this.K = true;
        this.L = haVar;
        return this;
    }

    public ho a(boolean z) {
        this.D = true;
        this.g = z;
        return this;
    }

    public ho f(ha haVar) {
        if (haVar == null) {
            try {
                throw new NullPointerException();
            } catch (NullPointerException e) {
                throw e;
            }
        }
        this.l = true;
        this.X = haVar;
        return this;
    }

    public boolean C() {
        return this.c;
    }

    public ho l(ha haVar) {
        if (haVar == null) {
            try {
                throw new NullPointerException();
            } catch (NullPointerException e) {
                throw e;
            }
        }
        this.I = true;
        this.o = haVar;
        return this;
    }

    public ha ab() {
        return this.o;
    }

    public boolean y() {
        return this.u;
    }

    public ho e(String str) {
        this.W = true;
        this.d = str;
        return this;
    }

    public ho g(String str) {
        this.A = true;
        this.m = str;
        return this;
    }

    public String a() {
        return this.m;
    }

    public ha b() {
        return this.X;
    }

    public ho c(String str) {
        this.b = true;
        this.t = str;
        return this;
    }

    public boolean ac() {
        return this.n;
    }
}
