package com.google;

public final class h0 {
    private final eF a;

    public h0() {
        this.a = eF.c;
    }

    private int[] a(ey eyVar, ey eyVar2, int[] iArr) {
        boolean z = eF.e;
        int c = eyVar2.c();
        int[] iArr2 = new int[c];
        int i = 1;
        while (i <= c) {
            iArr2[c - i] = this.a.c(i, eyVar2.c(i));
            i++;
            if (z) {
                break;
            }
        }
        ey eyVar3 = new ey(this.a, iArr2);
        int length = iArr.length;
        int[] iArr3 = new int[length];
        i = 0;
        while (i < length) {
            int a = this.a.a(iArr[i]);
            iArr3[i] = this.a.c(this.a.b(0, eyVar.b(a)), this.a.a(eyVar3.b(a)));
            i++;
            if (z) {
                break;
            }
        }
        return iArr3;
    }

    private int[] a(ey eyVar) {
        boolean z = eF.e;
        int c = eyVar.c();
        int[] iArr = new int[c];
        int i = 0;
        int i2 = 1;
        while (i2 < this.a.a() && i < c) {
            if (eyVar.b(i2) == 0) {
                iArr[i] = this.a.a(i2);
                i++;
            }
            i2++;
            if (z) {
                break;
            }
        }
        if (i == c) {
            return iArr;
        }
        throw aC.a();
    }

    public int a(int[] iArr, int i, int[] iArr2) {
        ey eyVar;
        int[] a;
        int i2 = 0;
        boolean z = eF.e;
        ey eyVar2 = new ey(this.a, iArr);
        int[] iArr3 = new int[i];
        int i3 = i;
        int i4 = 0;
        while (i3 > 0) {
            int b = eyVar2.b(this.a.b(i3));
            iArr3[i - i3] = b;
            if (b != 0) {
                b = 1;
            } else {
                b = i4;
            }
            i4 = i3 - 1;
            ey c;
            int[] a2;
            if (z) {
                boolean z2;
                if (aK.a) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                aK.a = z2;
                i4 = b;
                if (i4 == 0) {
                    return 0;
                }
                c = this.a.c();
                if (iArr2 != null) {
                    i3 = iArr2.length;
                    eyVar = c;
                    i4 = 0;
                    while (i4 < i3) {
                        int b2 = this.a.b((iArr.length - 1) - iArr2[i4]);
                        eyVar = eyVar.a(new ey(this.a, new int[]{this.a.b(0, b2), 1}));
                        i4++;
                        if (z) {
                            break;
                        }
                    }
                }
                ey[] a3 = a(this.a.d(i, 1), new ey(this.a, iArr3), i);
                eyVar = a3[0];
                c = a3[1];
                a2 = a(eyVar);
                a = a(c, eyVar, a2);
                while (i2 < a2.length) {
                    b = (iArr.length - 1) - this.a.c(a2[i2]);
                    if (b < 0) {
                        iArr[b] = this.a.b(iArr[b], a[i2]);
                        i2++;
                        if (z) {
                            break;
                        }
                    }
                    throw aC.a();
                }
                return a2.length;
            }
            i3 = i4;
            i4 = b;
        }
        if (i4 == 0) {
            return 0;
        }
        c = this.a.c();
        if (iArr2 != null) {
            i3 = iArr2.length;
            eyVar = c;
            i4 = 0;
            while (i4 < i3) {
                int b22 = this.a.b((iArr.length - 1) - iArr2[i4]);
                eyVar = eyVar.a(new ey(this.a, new int[]{this.a.b(0, b22), 1}));
                i4++;
                if (z) {
                    break;
                }
            }
        }
        ey[] a32 = a(this.a.d(i, 1), new ey(this.a, iArr3), i);
        eyVar = a32[0];
        c = a32[1];
        a2 = a(eyVar);
        a = a(c, eyVar, a2);
        while (i2 < a2.length) {
            b = (iArr.length - 1) - this.a.c(a2[i2]);
            if (b < 0) {
                iArr[b] = this.a.b(iArr[b], a[i2]);
                i2++;
                if (z) {
                    break;
                    return a2.length;
                }
            }
            throw aC.a();
        }
        return a2.length;
    }

    private ey[] a(ey eyVar, ey eyVar2, int i) {
        ey b;
        boolean z = eF.e;
        if (eyVar.c() >= eyVar2.c()) {
            ey eyVar3 = eyVar2;
            eyVar2 = eyVar;
            eyVar = eyVar3;
        }
        ey b2 = this.a.b();
        ey c = this.a.c();
        while (eyVar.c() >= i / 2) {
            if (eyVar.a()) {
                throw aC.a();
            }
            b = this.a.b();
            int a = this.a.a(eyVar.c(eyVar.c()));
            while (eyVar2.c() >= eyVar.c() && !eyVar2.a()) {
                int c2 = eyVar2.c() - eyVar.c();
                int c3 = this.a.c(eyVar2.c(eyVar2.c()), a);
                b = b.b(this.a.d(c2, c3));
                eyVar2 = eyVar2.c(eyVar.a(c2, c3));
                if (z) {
                    break;
                }
            }
            ey eyVar4 = b;
            b = eyVar2;
            b2 = eyVar4.a(c).c(b2).b();
            if (z) {
                break;
            }
            eyVar2 = eyVar;
            eyVar = b;
            eyVar3 = c;
            c = b2;
            b2 = eyVar3;
        }
        b2 = c;
        b = eyVar;
        int c4 = b2.c(0);
        if (c4 == 0) {
            throw aC.a();
        }
        c4 = this.a.a(c4);
        b2 = b2.a(c4);
        c = b.a(c4);
        return new ey[]{b2, c};
    }
}
