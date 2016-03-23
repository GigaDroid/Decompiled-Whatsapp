package org.whispersystems;

import java.util.Collections;
import java.util.Set;
import org.v;

final class p extends o {
    static final p b;
    private static final long serialVersionUID = 0;
    private static final String[] z;

    public boolean equals(Object obj) {
        return obj == this;
    }

    public Object e() {
        return null;
    }

    public int hashCode() {
        return 1502476572;
    }

    public Object a(b2 b2Var) {
        return br.a(b2Var.a(), z[1]);
    }

    p() {
    }

    static {
        String[] strArr = new String[4];
        String str = "\\!U\\h}0M\u001bfq\"D[s;x";
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
                        i3 = 19;
                        break;
                    case at.g /*1*/:
                        i3 = 81;
                        break;
                    case at.i /*2*/:
                        i3 = 33;
                        break;
                    case at.o /*3*/:
                        i3 = 53;
                        break;
                    default:
                        i3 = 7;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "f\"D\u0015ha\u001fTYk;x\u0001\\i`%DTc3>G\u0015hayO@k\u007fx";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "e0M@b38R\u0015fq\"D[s";
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                    b = new p();
                    return;
                default:
                    strArr2[i] = str;
                    str = "f\"D\u0015ha\u001fTYk;x\u0001\\i`%DTc3>G\u0015f3\u0002TEw\u007f8DG'g9@A'a4U@u}\"\u0001[r\u007f=";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    private Object readResolve() {
        return b;
    }

    public o a(bw bwVar) {
        br.a(bwVar);
        return o.d();
    }

    public String toString() {
        return z[0];
    }

    public Object c() {
        throw new IllegalStateException(z[3]);
    }

    public boolean a() {
        return false;
    }

    public Set b() {
        return Collections.emptySet();
    }

    public o a(o oVar) {
        return (o) br.a(oVar);
    }

    public Object c(Object obj) {
        return br.a(obj, z[2]);
    }
}
