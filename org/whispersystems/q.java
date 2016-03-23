package org.whispersystems;

import java.util.Collections;
import java.util.Set;
import org.v;

final class q extends o {
    private static final long serialVersionUID = 0;
    private static final String[] z;
    private final Object b;

    static {
        String[] strArr = new String[3];
        String str = "\u000fPTJ6.AL\r6&\b";
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
                        i3 = 64;
                        break;
                    case at.g /*1*/:
                        i3 = 32;
                        break;
                    case at.i /*2*/:
                        i3 = 32;
                        break;
                    case at.o /*3*/:
                        i3 = 35;
                        break;
                    default:
                        i3 = 89;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    strArr2 = strArr3;
                    str = "5SE\u000362nUO5h\t\u0000J73TEB=`OF\u000362\bNV5,\t";
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u0014RAM*&ORN84IOMy&UN@-)ON\u0003:!NNL-`REW,2N\u0000M,,L\u000e";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        return this.b.equals(((q) obj).b);
    }

    public Object e() {
        return this.b;
    }

    public Object a(b2 b2Var) {
        br.a(b2Var);
        return this.b;
    }

    public Object c(Object obj) {
        br.a(obj, z[2]);
        return this.b;
    }

    public o a(o oVar) {
        br.a(oVar);
        return this;
    }

    public Set b() {
        return Collections.singleton(this.b);
    }

    public int hashCode() {
        return 1502476572 + this.b.hashCode();
    }

    public boolean a() {
        return true;
    }

    q(Object obj) {
        this.b = obj;
    }

    public Object c() {
        return this.b;
    }

    public o a(bw bwVar) {
        boolean z = true;
        boolean z2 = o.a;
        o qVar = new q(br.a(bwVar.a(this.b), z[1]));
        if (a5.o) {
            if (z2) {
                z = false;
            }
            o.a = z;
        }
        return qVar;
    }

    public String toString() {
        boolean z = false;
        boolean z2 = o.a;
        String str = z[0] + this.b + ")";
        if (z2) {
            if (!a5.o) {
                z = true;
            }
            a5.o = z;
        }
        return str;
    }
}
