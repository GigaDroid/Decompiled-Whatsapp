package com.whatsapp.gallerypicker;

import android.database.ContentObserver;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;
import org.v;
import org.whispersystems.at;

public class b5 implements e {
    private static final String[] z;
    private int a;
    private long[] b;
    private int c;
    private final PriorityQueue d;
    private int[] e;
    private final e[] f;

    static {
        String[] strArr = new String[2];
        String str = "W0\u0010@m\u001e";
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
                        i3 = 62;
                        break;
                    case at.g /*1*/:
                        i3 = 94;
                        break;
                    case at.i /*2*/:
                        i3 = 116;
                        break;
                    case at.o /*3*/:
                        i3 = 37;
                        break;
                    default:
                        i3 = 21;
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
                    str = "\u001e1\u0001Q5Q8TWtP9\u0011\u0005x_&TLf\u001e";
                    obj = null;
            }
        }
    }

    public void m736a() {
        int i = MediaGalleryFragmentBase.e;
        int i2 = 0;
        int length = this.f.length;
        while (i2 < length) {
            this.f[i2].a();
            i2++;
            if (i != 0) {
                return;
            }
        }
    }

    public b5(e[] eVarArr, int i) {
        Comparator a5Var;
        int i2 = MediaGalleryFragmentBase.e;
        this.f = (e[]) eVarArr.clone();
        if (i == 1) {
            a5Var = new a5(null);
        } else {
            a5Var = new d(null);
        }
        this.d = new PriorityQueue(4, a5Var);
        this.b = new long[16];
        this.c = 0;
        this.e = new int[this.f.length];
        this.a = -1;
        this.d.clear();
        int length = this.f.length;
        int i3 = 0;
        while (i3 < length) {
            aa aaVar = new aa(this.f[i3], i3);
            try {
                if (aaVar.a()) {
                    this.d.add(aaVar);
                }
                i3++;
                if (i2 != 0) {
                    return;
                }
            } catch (IndexOutOfBoundsException e) {
                throw e;
            }
        }
    }

    public HashMap c() {
        int i = MediaGalleryFragmentBase.e;
        HashMap hashMap = new HashMap();
        e[] eVarArr = this.f;
        int length = eVarArr.length;
        int i2 = 0;
        while (i2 < length) {
            hashMap.putAll(eVarArr[i2].c());
            i2++;
            if (i != 0) {
                break;
            }
        }
        return hashMap;
    }

    public void d() {
        int i = MediaGalleryFragmentBase.e;
        e[] eVarArr = this.f;
        int length = eVarArr.length;
        int i2 = 0;
        while (i2 < length) {
            eVarArr[i2].d();
            i2++;
            if (i != 0) {
                return;
            }
        }
    }

    public boolean b() {
        int i = MediaGalleryFragmentBase.e;
        e[] eVarArr = this.f;
        int length = eVarArr.length;
        int i2 = 0;
        while (i2 < length) {
            try {
                if (eVarArr[i2].b()) {
                    i2++;
                    if (i != 0) {
                        break;
                    }
                }
                return false;
            } catch (IndexOutOfBoundsException e) {
                throw e;
            }
        }
        return true;
    }

    public void a(ContentObserver contentObserver) {
        int i = MediaGalleryFragmentBase.e;
        e[] eVarArr = this.f;
        int length = eVarArr.length;
        int i2 = 0;
        while (i2 < length) {
            eVarArr[i2].a(contentObserver);
            i2++;
            if (i != 0) {
                return;
            }
        }
    }

    public f a(int i) {
        int i2 = 0;
        int i3 = MediaGalleryFragmentBase.e;
        if (i >= 0) {
            try {
                if (i <= e()) {
                    aa a;
                    Arrays.fill(this.e, 0);
                    int i4 = this.c;
                    int i5 = 0;
                    while (i5 < i4) {
                        long j = this.b[i5];
                        int i6 = (int) (-1 & j);
                        int i7 = (int) (j >> 32);
                        if (i2 + i6 <= i) {
                            i2 += i6;
                            int[] iArr = this.e;
                            iArr[i7] = i6 + iArr[i7];
                            i5++;
                            if (i3 != 0) {
                                break;
                            }
                        }
                        return this.f[i7].a((i - i2) + this.e[i7]);
                    }
                    while (true) {
                        a = a();
                        if (a == null) {
                            return null;
                        }
                        if (i2 == i) {
                            break;
                        }
                        try {
                            if (a.a()) {
                                this.d.add(a);
                            }
                            i2++;
                        } catch (IndexOutOfBoundsException e) {
                            throw e;
                        }
                    }
                    f fVar = a.d;
                    try {
                        if (!a.a()) {
                            return fVar;
                        }
                        this.d.add(a);
                        return fVar;
                    } catch (IndexOutOfBoundsException e2) {
                        throw e2;
                    }
                }
            } catch (IndexOutOfBoundsException e22) {
                throw e22;
            }
        }
        throw new IndexOutOfBoundsException(z[0] + i + z[1] + e());
    }

    private aa a() {
        aa aaVar = (aa) this.d.poll();
        if (aaVar == null) {
            return null;
        }
        if (aaVar.b == this.a) {
            int i = this.c - 1;
            try {
                long[] jArr = this.b;
                jArr[i] = jArr[i] + 1;
                if (MediaGalleryFragmentBase.e == 0) {
                    return aaVar;
                }
            } catch (IndexOutOfBoundsException e) {
                throw e;
            }
        }
        this.a = aaVar.b;
        if (this.b.length == this.c) {
            Object obj = new long[(this.c * 2)];
            System.arraycopy(this.b, 0, obj, 0, this.c);
            this.b = obj;
        }
        long[] jArr2 = this.b;
        int i2 = this.c;
        this.c = i2 + 1;
        jArr2[i2] = (((long) this.a) << 32) | 1;
        return aaVar;
    }

    public void b(ContentObserver contentObserver) {
        int i = MediaGalleryFragmentBase.e;
        e[] eVarArr = this.f;
        int length = eVarArr.length;
        int i2 = 0;
        while (i2 < length) {
            eVarArr[i2].b(contentObserver);
            i2++;
            if (i != 0) {
                return;
            }
        }
    }

    public int e() {
        int i = 0;
        int i2 = MediaGalleryFragmentBase.e;
        e[] eVarArr = this.f;
        int length = eVarArr.length;
        int i3 = 0;
        while (i3 < length) {
            i += eVarArr[i3].e();
            i3++;
            if (i2 != 0) {
                break;
            }
        }
        return i;
    }
}
