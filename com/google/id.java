package com.google;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.v;
import org.whispersystems.at;

class id extends hx {
    private static final int[] h;
    private static final String[] z;
    private int c;
    private final hx d;
    private final hx e;
    private final int f;
    private final int g;

    static {
        int i;
        int i2;
        int i3 = 1;
        int i4 = 0;
        String[] strArr = new String[3];
        char[] toCharArray = "u 0\u0012<\u001crtG~\u001c".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 60;
                    break;
                case at.g /*1*/:
                    i2 = 78;
                    break;
                case at.i /*2*/:
                    i2 = 84;
                    break;
                case at.o /*3*/:
                    i2 = 119;
                    break;
                default:
                    i2 = 68;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "u 0\u0012<\u001cpt\u001b!R) \u001f~\u001c".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 60;
                    break;
                case at.g /*1*/:
                    i2 = 78;
                    break;
                case at.i /*2*/:
                    i2 = 84;
                    break;
                case at.o /*3*/:
                    i2 = 119;
                    break;
                default:
                    i2 = 68;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[1] = new String(cArr).intern();
        toCharArray = "\u0010n".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 60;
                    break;
                case at.g /*1*/:
                    i2 = 78;
                    break;
                case at.i /*2*/:
                    i2 = 84;
                    break;
                case at.o /*3*/:
                    i2 = 119;
                    break;
                default:
                    i2 = 68;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[2] = new String(cArr).intern();
        z = strArr;
        List arrayList = new ArrayList();
        i2 = 1;
        while (i2 > 0) {
            arrayList.add(Integer.valueOf(i2));
            int i5 = i3 + i2;
            i3 = i2;
            i2 = i5;
        }
        arrayList.add(Integer.valueOf(Integer.MAX_VALUE));
        h = new int[arrayList.size()];
        while (i4 < h.length) {
            try {
                h[i4] = ((Integer) arrayList.get(i4)).intValue();
                i4++;
            } catch (ArrayIndexOutOfBoundsException e) {
                throw e;
            }
        }
    }

    protected int c() {
        return this.c;
    }

    public int a() {
        return this.g;
    }

    protected void a(byte[] bArr, int i, int i2, int i3) {
        boolean z = bA.b;
        try {
            if (i + i3 <= this.f) {
                this.d.a(bArr, i, i2, i3);
                if (!z) {
                    return;
                }
            }
            try {
                if (i >= this.f) {
                    this.e.a(bArr, i - this.f, i2, i3);
                    if (!z) {
                        return;
                    }
                }
                int i4 = this.f - i;
                this.d.a(bArr, i, i2, i4);
                this.e.a(bArr, 0, i2 + i4, i3 - i4);
            } catch (ArrayIndexOutOfBoundsException e) {
                throw e;
            }
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw e2;
        } catch (ArrayIndexOutOfBoundsException e22) {
            throw e22;
        }
    }

    public Iterator iterator() {
        return i();
    }

    public String b(String str) {
        return new String(h(), str);
    }

    public ad f() {
        return ad.a(new e7(this));
    }

    public InputStream b() {
        return new e7(this);
    }

    static hx b(id idVar) {
        return idVar.e;
    }

    protected int a(int i, int i2, int i3) {
        try {
            if (i2 + i3 <= this.f) {
                return this.d.a(i, i2, i3);
            }
            try {
                if (i2 >= this.f) {
                    return this.e.a(i, i2 - this.f, i3);
                }
                int i4 = this.f - i2;
                return this.e.a(this.d.a(i, i2, i4), 0, i3 - i4);
            } catch (ArrayIndexOutOfBoundsException e) {
                throw e;
            }
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw e2;
        }
    }

    public byte b(int i) {
        if (i < 0) {
            try {
                throw new ArrayIndexOutOfBoundsException(z[0] + i);
            } catch (ArrayIndexOutOfBoundsException e) {
                throw e;
            }
        }
        try {
            if (i > this.g) {
                throw new ArrayIndexOutOfBoundsException(z[1] + i + z[2] + this.g);
            }
            if (i < this.f) {
                byte b = this.d.b(i);
                if (!bA.b) {
                    return b;
                }
            }
            return this.e.b(i - this.f);
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw e2;
        }
    }

    public int hashCode() {
        int i = this.c;
        if (i == 0) {
            i = a(this.g, 0, this.g);
            if (i == 0) {
                i = 1;
            }
            this.c = i;
        }
        return i;
    }

    public boolean d() {
        if (this.e.b(this.d.b(0, 0, this.f), 0, this.e.a()) == 0) {
            return true;
        }
        return false;
    }

    private boolean a(hx hxVar) {
        boolean z = bA.b;
        Iterator hNVar = new hN(this, null);
        hg hgVar = (hg) hNVar.next();
        Iterator hNVar2 = new hN(hxVar, null);
        hg hgVar2 = (hg) hNVar2.next();
        int i = 0;
        hg hgVar3 = hgVar;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int a = hgVar3.a() - i2;
            int a2 = hgVar2.a() - i;
            int min = Math.min(a, a2);
            if (i2 == 0) {
                try {
                    boolean a3 = hgVar3.a(hgVar2, i, min);
                } catch (ArrayIndexOutOfBoundsException e) {
                    throw e;
                }
            }
            a3 = hgVar2.a(hgVar3, i2, min);
            if (!a3) {
                return false;
            }
            int i4 = i3 + min;
            try {
                if (i4 >= this.g) {
                    break;
                }
                int i5;
                if (min == a) {
                    hgVar = (hg) hNVar.next();
                    if (z) {
                        i2 = 0;
                    } else {
                        hgVar3 = hgVar;
                        i2 = 0;
                        if (min != a2) {
                            hgVar = (hg) hNVar2.next();
                            if (z) {
                                i5 = 0;
                                i = i5;
                                hgVar2 = hgVar;
                                i3 = i4;
                            } else {
                                i = 0;
                            }
                        } else {
                            hgVar = hgVar2;
                        }
                        i5 = i + min;
                        i = i5;
                        hgVar2 = hgVar;
                        i3 = i4;
                    }
                } else {
                    hgVar = hgVar3;
                }
                i2 += min;
                hgVar3 = hgVar;
                if (min != a2) {
                    hgVar = hgVar2;
                } else {
                    hgVar = (hg) hNVar2.next();
                    if (z) {
                        i5 = 0;
                        i = i5;
                        hgVar2 = hgVar;
                        i3 = i4;
                    } else {
                        i = 0;
                    }
                }
                i5 = i + min;
                i = i5;
                hgVar2 = hgVar;
                i3 = i4;
            } catch (ArrayIndexOutOfBoundsException e2) {
                throw e2;
            } catch (ArrayIndexOutOfBoundsException e22) {
                throw e22;
            }
        }
        if (i4 == this.g) {
            return true;
        }
        throw new IllegalStateException();
    }

    static hx a(id idVar) {
        return idVar.d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        try {
            if (!(obj instanceof hx)) {
                return false;
            }
            hx hxVar = (hx) obj;
            try {
                if (this.g != hxVar.a()) {
                    return false;
                }
                try {
                    if (this.g == 0) {
                        return true;
                    }
                    if (this.c != 0) {
                        int c = hxVar.c();
                        if (c != 0) {
                            try {
                                if (this.c != c) {
                                    return false;
                                }
                            } catch (ArrayIndexOutOfBoundsException e) {
                                throw e;
                            }
                        }
                    }
                    return a(hxVar);
                } catch (ArrayIndexOutOfBoundsException e2) {
                    throw e2;
                }
            } catch (ArrayIndexOutOfBoundsException e22) {
                throw e22;
            }
        } catch (ArrayIndexOutOfBoundsException e222) {
            throw e222;
        }
    }

    protected int b(int i, int i2, int i3) {
        try {
            if (i2 + i3 <= this.f) {
                return this.d.b(i, i2, i3);
            }
            try {
                if (i2 >= this.f) {
                    return this.e.b(i, i2 - this.f, i3);
                }
                int i4 = this.f - i2;
                return this.e.b(this.d.b(i, i2, i4), 0, i3 - i4);
            } catch (ArrayIndexOutOfBoundsException e) {
                throw e;
            }
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw e2;
        }
    }

    public d8 i() {
        return new gP(this, null);
    }
}
