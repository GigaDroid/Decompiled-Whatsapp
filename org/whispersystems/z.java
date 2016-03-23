package org.whispersystems;

import java.util.Iterator;
import java.util.LinkedList;
import org.v;

public class z {
    public static int a;
    private static final String[] z;
    private LinkedList b;

    static {
        String[] strArr = new String[2];
        String str = "\u0002\u0000\u0005?15OV 58\n\u0005=:l\u001d@7;>\u000b\u0004";
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
                        i3 = 76;
                        break;
                    case at.g /*1*/:
                        i3 = 111;
                        break;
                    case at.i /*2*/:
                        i3 = 37;
                        break;
                    case at.o /*3*/:
                        i3 = 84;
                        break;
                    default:
                        i3 = 84;
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
                    str = "\u0002\u0000\u0005?15\u001c\u00052;>U\u0005";
                    obj = null;
            }
        }
    }

    public z(byte[] bArr) {
        int i = a;
        this.b = new LinkedList();
        for (U bRVar : T.a(bArr).h()) {
            this.b.add(new bR(bRVar));
            if (i != 0) {
                return;
            }
        }
    }

    public bR c() {
        if (!this.b.isEmpty()) {
            return (bR) this.b.get(0);
        }
        throw new y(z[0]);
    }

    public boolean a() {
        return this.b.isEmpty();
    }

    public void a(int i, int i2, byte[] bArr, e eVar) {
        this.b.clear();
        this.b.add(new bR(i, i2, bArr, eVar));
    }

    public byte[] b() {
        int i = a;
        aH f = T.f();
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            f.a(((bR) it.next()).e());
            if (i != 0) {
                break;
            }
        }
        return f.a().b();
    }

    public bR a(int i) {
        int i2 = a;
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            bR bRVar = (bR) it.next();
            if (bRVar.c() != i) {
                if (i2 != 0) {
                    break;
                }
            }
            return bRVar;
        }
        throw new y(z[1] + i);
    }

    public void a(int i, int i2, byte[] bArr, E e) {
        this.b.addFirst(new bR(i, i2, bArr, e));
        if (this.b.size() > 5) {
            this.b.removeLast();
        }
    }

    public z() {
        this.b = new LinkedList();
    }
}
