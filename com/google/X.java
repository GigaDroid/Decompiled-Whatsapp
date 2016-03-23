package com.google;

import java.util.ArrayList;
import java.util.List;
import org.v;
import org.whispersystems.at;

public final class X {
    private static final String[] z;
    private final List a;
    private final aj b;

    static {
        String[] strArr = new String[2];
        String str = "^>\u000fLId0\u000fJQd4\\\bXb>YALu5";
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
                        i3 = 16;
                        break;
                    case at.g /*1*/:
                        i3 = 81;
                        break;
                    case at.i /*2*/:
                        i3 = 47;
                        break;
                    case at.o /*3*/:
                        i3 = 40;
                        break;
                    default:
                        i3 = 40;
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
                    str = "^>\u000fMZb>]\bK\u007f#]MKd8@F\br([M[";
                    obj = null;
            }
        }
    }

    public X(aj ajVar) {
        this.b = ajVar;
        this.a = new ArrayList();
        this.a.add(new ht(ajVar, new int[]{1}));
    }

    public void a(int[] iArr, int i) {
        boolean z = true;
        int i2 = aj.l;
        if (i == 0) {
            try {
                throw new IllegalArgumentException(z[1]);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        int length = iArr.length - i;
        if (length <= 0) {
            try {
                throw new IllegalArgumentException(z[0]);
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        }
        ht a = a(i);
        Object obj = new int[length];
        System.arraycopy(iArr, 0, obj, 0, length);
        obj = new ht(this.b, obj).a(i, 1).b(a)[1].b();
        int length2 = i - obj.length;
        int i3 = 0;
        while (i3 < length2) {
            iArr[length + i3] = 0;
            i3++;
            if (i2 != 0) {
                try {
                    if (aK.a) {
                        z = false;
                    }
                    aK.a = z;
                    System.arraycopy(obj, 0, iArr, length + length2, obj.length);
                } catch (IllegalArgumentException e22) {
                    throw e22;
                }
            }
        }
        System.arraycopy(obj, 0, iArr, length + length2, obj.length);
    }

    private ht a(int i) {
        int i2 = aj.l;
        if (i >= this.a.size()) {
            ht htVar = (ht) this.a.get(this.a.size() - 1);
            ht htVar2 = htVar;
            int size = this.a.size();
            while (size <= i) {
                htVar2 = htVar2.a(new ht(this.b, new int[]{1, this.b.c((size - 1) + this.b.a())}));
                this.a.add(htVar2);
                size++;
                if (i2 != 0) {
                    break;
                }
            }
        }
        return (ht) this.a.get(i);
    }
}
