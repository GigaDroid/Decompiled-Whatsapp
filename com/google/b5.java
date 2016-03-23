package com.google;

import java.io.Externalizable;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.List;

public class b5 implements Externalizable {
    private static final long serialVersionUID = 1;
    private boolean a;
    private String b;
    private String c;
    private boolean d;
    private boolean e;
    private boolean f;
    private String g;
    private boolean h;
    private boolean i;
    private String j;
    private List k;

    public b5 a(boolean z) {
        this.a = true;
        this.e = z;
        return this;
    }

    public String k() {
        return this.j;
    }

    public boolean m() {
        return this.a;
    }

    public boolean a() {
        return this.i;
    }

    public b5 c(String str) {
        if (str == null) {
            try {
                throw new NullPointerException();
            } catch (NullPointerException e) {
                throw e;
            }
        }
        this.k.add(str);
        return this;
    }

    public String i() {
        return this.b;
    }

    public b5 a(String str) {
        this.h = true;
        this.g = str;
        return this;
    }

    public boolean b() {
        return this.h;
    }

    public b5 d(String str) {
        this.d = true;
        this.b = str;
        return this;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void readExternal(java.io.ObjectInput r6) {
        /*
        r5 = this;
        r1 = com.google.e2.F;
        r0 = r6.readUTF();
        r5.d(r0);
        r0 = r6.readUTF();
        r5.a(r0);
        r2 = r6.readInt();
        r0 = 0;
    L_0x0015:
        if (r0 >= r2) goto L_0x0024;
    L_0x0017:
        r3 = r5.k;
        r4 = r6.readUTF();
        r3.add(r4);
        r0 = r0 + 1;
        if (r1 == 0) goto L_0x0015;
    L_0x0024:
        r0 = r6.readBoolean();	 Catch:{ NullPointerException -> 0x0046 }
        if (r0 == 0) goto L_0x0031;
    L_0x002a:
        r0 = r6.readUTF();	 Catch:{ NullPointerException -> 0x0046 }
        r5.e(r0);	 Catch:{ NullPointerException -> 0x0046 }
    L_0x0031:
        r0 = r6.readBoolean();	 Catch:{ NullPointerException -> 0x0048 }
        if (r0 == 0) goto L_0x003e;
    L_0x0037:
        r0 = r6.readUTF();	 Catch:{ NullPointerException -> 0x0048 }
        r5.b(r0);	 Catch:{ NullPointerException -> 0x0048 }
    L_0x003e:
        r0 = r6.readBoolean();
        r5.a(r0);
        return;
    L_0x0046:
        r0 = move-exception;
        throw r0;
    L_0x0048:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.b5.readExternal(java.io.ObjectInput):void");
    }

    public int g() {
        return this.k.size();
    }

    public String a(int i) {
        return (String) this.k.get(i);
    }

    public String d() {
        return this.c;
    }

    public static bn n() {
        return new bn();
    }

    public b5 b(String str) {
        this.i = true;
        this.c = str;
        return this;
    }

    public boolean c() {
        return this.f;
    }

    public void writeExternal(ObjectOutput objectOutput) {
        int i = e2.F;
        objectOutput.writeUTF(this.b);
        objectOutput.writeUTF(this.g);
        int g = g();
        objectOutput.writeInt(g);
        int i2 = 0;
        while (i2 < g) {
            objectOutput.writeUTF((String) this.k.get(i2));
            int i3 = i2 + 1;
            if (i == 0) {
                i2 = i3;
            }
        }
        try {
            break;
            objectOutput.writeBoolean(this.f);
            if (this.f) {
                objectOutput.writeUTF(this.j);
            }
            try {
                objectOutput.writeBoolean(this.i);
                if (this.i) {
                    objectOutput.writeUTF(this.c);
                }
                objectOutput.writeBoolean(this.e);
            } catch (NullPointerException e) {
                throw e;
            }
        } catch (NullPointerException e2) {
            throw e2;
        }
    }

    public b5() {
        this.b = "";
        this.g = "";
        this.k = new ArrayList();
        this.j = "";
        this.e = false;
        this.c = "";
    }

    public b5 l() {
        this.f = false;
        this.j = "";
        return this;
    }

    public boolean j() {
        return this.d;
    }

    public boolean f() {
        return this.e;
    }

    public b5 e(String str) {
        this.f = true;
        this.j = str;
        return this;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.b5 a(com.google.b5 r5) {
        /*
        r4 = this;
        r1 = com.google.e2.F;
        r0 = r5.j();	 Catch:{ NullPointerException -> 0x0050 }
        if (r0 == 0) goto L_0x000f;
    L_0x0008:
        r0 = r5.i();	 Catch:{ NullPointerException -> 0x0050 }
        r4.d(r0);	 Catch:{ NullPointerException -> 0x0050 }
    L_0x000f:
        r0 = r5.b();	 Catch:{ NullPointerException -> 0x0052 }
        if (r0 == 0) goto L_0x001c;
    L_0x0015:
        r0 = r5.e();	 Catch:{ NullPointerException -> 0x0052 }
        r4.a(r0);	 Catch:{ NullPointerException -> 0x0052 }
    L_0x001c:
        r2 = r5.g();
        r0 = 0;
    L_0x0021:
        if (r0 >= r2) goto L_0x002e;
    L_0x0023:
        r3 = r5.a(r0);
        r4.c(r3);
        r0 = r0 + 1;
        if (r1 == 0) goto L_0x0021;
    L_0x002e:
        r0 = r5.c();	 Catch:{ NullPointerException -> 0x0054 }
        if (r0 == 0) goto L_0x003b;
    L_0x0034:
        r0 = r5.k();	 Catch:{ NullPointerException -> 0x0054 }
        r4.e(r0);	 Catch:{ NullPointerException -> 0x0054 }
    L_0x003b:
        r0 = r5.a();	 Catch:{ NullPointerException -> 0x0056 }
        if (r0 == 0) goto L_0x0048;
    L_0x0041:
        r0 = r5.d();	 Catch:{ NullPointerException -> 0x0056 }
        r4.b(r0);	 Catch:{ NullPointerException -> 0x0056 }
    L_0x0048:
        r0 = r5.f();
        r4.a(r0);
        return r4;
    L_0x0050:
        r0 = move-exception;
        throw r0;
    L_0x0052:
        r0 = move-exception;
        throw r0;
    L_0x0054:
        r0 = move-exception;
        throw r0;
    L_0x0056:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.b5.a(com.google.b5):com.google.b5");
    }

    public List h() {
        return this.k;
    }

    public String e() {
        return this.g;
    }
}
