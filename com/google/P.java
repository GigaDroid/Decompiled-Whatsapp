package com.google;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public final class P {
    public static boolean b;
    private final g a;
    private final hX c;

    private fI a(fI fIVar, fI fIVar2, fI fIVar3, fI fIVar4, int i, int i2) {
        float a = ((float) a(fIVar, fIVar2)) / ((float) i);
        int a2 = a(fIVar3, fIVar4);
        fI fIVar5 = new fI((((fIVar4.a() - fIVar3.a()) / ((float) a2)) * a) + fIVar4.a(), (a * ((fIVar4.b() - fIVar3.b()) / ((float) a2))) + fIVar4.b());
        float a3 = ((float) a(fIVar, fIVar3)) / ((float) i2);
        int a4 = a(fIVar2, fIVar4);
        fI fIVar6 = new fI((((fIVar4.a() - fIVar2.a()) / ((float) a4)) * a3) + fIVar4.a(), (a3 * ((fIVar4.b() - fIVar2.b()) / ((float) a4))) + fIVar4.b());
        if (a(fIVar5)) {
            if (!a(fIVar6)) {
                return fIVar5;
            }
            if (Math.abs(i - b(fIVar3, fIVar5).b()) + Math.abs(i2 - b(fIVar2, fIVar5).b()) <= Math.abs(i - b(fIVar3, fIVar6).b()) + Math.abs(i2 - b(fIVar2, fIVar6).b())) {
                return fIVar5;
            }
            return fIVar6;
        } else if (a(fIVar6)) {
            return fIVar6;
        } else {
            return null;
        }
    }

    private j b(fI fIVar, fI fIVar2) {
        Object obj;
        int i;
        int i2;
        int i3;
        boolean z = b;
        int a = (int) fIVar.a();
        int b = (int) fIVar.b();
        int a2 = (int) fIVar2.a();
        int b2 = (int) fIVar2.b();
        if (Math.abs(b2 - b) > Math.abs(a2 - a)) {
            obj = 1;
        } else {
            obj = null;
        }
        if (obj == null) {
            int i4 = b2;
            b2 = a2;
            a2 = i4;
            int i5 = b;
            b = a;
            a = i5;
        }
        int abs = Math.abs(b2 - b);
        int abs2 = Math.abs(a2 - a);
        int i6 = (-abs) / 2;
        int i7 = a < a2 ? 1 : -1;
        if (b < b2) {
            i = 1;
        } else {
            i = -1;
        }
        int i8 = 0;
        hX hXVar = this.c;
        if (obj != null) {
            i2 = a;
        } else {
            i2 = b;
        }
        if (obj != null) {
            i3 = b;
        } else {
            i3 = a;
        }
        boolean a3 = hXVar.a(i2, i3);
        i3 = a;
        int i9 = i6;
        while (b != b2) {
            boolean a4 = this.c.a(obj != null ? i3 : b, obj != null ? b : i3);
            if (a4 != a3) {
                a3 = a4;
                a = i8 + 1;
            } else {
                a = i8;
            }
            i8 = i9 + abs2;
            if (i8 > 0) {
                if (i3 == a2 && !z) {
                    a2 = a;
                    break;
                }
                i3 += i7;
                i8 -= abs;
            }
            b += i;
            if (z) {
                a2 = a;
                break;
            }
            i9 = i8;
            i8 = a;
        }
        a2 = i8;
        return new j(fIVar, fIVar2, a2, null);
    }

    private boolean a(fI fIVar) {
        return fIVar.a() >= 0.0f && fIVar.a() < ((float) this.c.c()) && fIVar.b() > 0.0f && fIVar.b() < ((float) this.c.g());
    }

    private static hX a(hX hXVar, fI fIVar, fI fIVar2, fI fIVar3, fI fIVar4, int i, int i2) {
        return e8.a().a(hXVar, i, i2, 0.5f, 0.5f, ((float) i) - 0.5f, 0.5f, ((float) i) - 0.5f, ((float) i2) - 0.5f, 0.5f, ((float) i2) - 0.5f, fIVar.a(), fIVar.b(), fIVar4.a(), fIVar4.b(), fIVar3.a(), fIVar3.b(), fIVar2.a(), fIVar2.b());
    }

    private static void a(Map map, fI fIVar) {
        int i;
        Integer num = (Integer) map.get(fIVar);
        if (num == null) {
            i = 1;
        } else {
            i = num.intValue() + 1;
        }
        map.put(fIVar, Integer.valueOf(i));
    }

    public P(hX hXVar) {
        this.c = hXVar;
        this.a = new g(hXVar);
    }

    private fI a(fI fIVar, fI fIVar2, fI fIVar3, fI fIVar4, int i) {
        float a = ((float) a(fIVar, fIVar2)) / ((float) i);
        int a2 = a(fIVar3, fIVar4);
        fI fIVar5 = new fI((((fIVar4.a() - fIVar3.a()) / ((float) a2)) * a) + fIVar4.a(), (a * ((fIVar4.b() - fIVar3.b()) / ((float) a2))) + fIVar4.b());
        float a3 = ((float) a(fIVar, fIVar3)) / ((float) i);
        int a4 = a(fIVar2, fIVar4);
        fI fIVar6 = new fI((((fIVar4.a() - fIVar2.a()) / ((float) a4)) * a3) + fIVar4.a(), (a3 * ((fIVar4.b() - fIVar2.b()) / ((float) a4))) + fIVar4.b());
        if (a(fIVar5)) {
            return (!a(fIVar6) || Math.abs(b(fIVar3, fIVar5).b() - b(fIVar2, fIVar5).b()) <= Math.abs(b(fIVar3, fIVar6).b() - b(fIVar2, fIVar6).b())) ? fIVar5 : fIVar6;
        } else {
            if (a(fIVar6)) {
                return fIVar6;
            }
            return null;
        }
    }

    private static int a(fI fIVar, fI fIVar2) {
        return h6.a(fI.a(fIVar, fIVar2));
    }

    public bE a() {
        fI fIVar;
        fI fIVar2;
        boolean z = b;
        fI[] a = this.a.a();
        fI fIVar3 = a[0];
        fI fIVar4 = a[1];
        fI fIVar5 = a[2];
        fI fIVar6 = a[3];
        List arrayList = new ArrayList(4);
        arrayList.add(b(fIVar3, fIVar4));
        arrayList.add(b(fIVar3, fIVar5));
        arrayList.add(b(fIVar4, fIVar6));
        arrayList.add(b(fIVar5, fIVar6));
        Collections.sort(arrayList, new gF(null));
        j jVar = (j) arrayList.get(0);
        j jVar2 = (j) arrayList.get(1);
        Map hashMap = new HashMap();
        a(hashMap, jVar.c());
        a(hashMap, jVar.a());
        a(hashMap, jVar2.c());
        a(hashMap, jVar2.a());
        fI fIVar7 = null;
        fI fIVar8 = null;
        fI fIVar9 = null;
        for (Entry entry : hashMap.entrySet()) {
            fIVar = (fI) entry.getKey();
            if (((Integer) entry.getValue()).intValue() == 2) {
                if (z) {
                    boolean z2;
                    if (aK.a) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    aK.a = z2;
                    fIVar7 = fIVar;
                } else {
                    fIVar2 = fIVar9;
                    fIVar9 = fIVar8;
                    if (!z) {
                        break;
                    }
                    fIVar7 = fIVar;
                    fIVar8 = fIVar9;
                    fIVar9 = fIVar2;
                }
            }
            if (fIVar8 == null) {
                if (!z) {
                    fIVar2 = fIVar9;
                    fIVar9 = fIVar;
                    fIVar = fIVar7;
                    if (!z) {
                        break;
                    }
                    fIVar7 = fIVar;
                    fIVar8 = fIVar9;
                    fIVar9 = fIVar2;
                } else {
                    fIVar8 = fIVar;
                }
            }
            fIVar2 = fIVar;
            fIVar9 = fIVar8;
            fIVar = fIVar7;
            if (!z) {
                break;
            }
            fIVar7 = fIVar;
            fIVar8 = fIVar9;
            fIVar9 = fIVar2;
        }
        fIVar2 = fIVar9;
        fIVar = fIVar7;
        fIVar9 = fIVar8;
        if (fIVar9 == null || fIVar == null || fIVar2 == null) {
            throw aN.a();
        }
        fI a2;
        hX a3;
        fI[] fIVarArr = new fI[]{fIVar9, fIVar, fIVar2};
        fI.a(fIVarArr);
        fIVar9 = fIVarArr[0];
        fIVar = fIVarArr[1];
        fIVar7 = fIVarArr[2];
        fIVar8 = (hashMap.containsKey(fIVar3) || z) ? (hashMap.containsKey(fIVar4) || z) ? (hashMap.containsKey(fIVar5) || z) ? fIVar6 : fIVar5 : fIVar4 : fIVar3;
        int b = b(fIVar7, fIVar8).b();
        int b2 = b(fIVar9, fIVar8).b();
        if ((b & 1) == 1) {
            b++;
        }
        b += 2;
        if ((b2 & 1) == 1) {
            b2++;
        }
        int i = b2 + 2;
        if (b * 4 >= i * 7 || i * 4 >= b * 7) {
            a2 = a(fIVar, fIVar9, fIVar7, fIVar8, b, i);
            if (a2 == null) {
                a2 = fIVar8;
            }
            int b3 = b(fIVar7, a2).b();
            int b4 = b(fIVar9, a2).b();
            if ((b3 & 1) == 1) {
                b3++;
            }
            if ((b4 & 1) == 1) {
                b4++;
            }
            a3 = a(this.c, fIVar7, fIVar, fIVar9, a2, b3, b4);
            if (z) {
                i = b4;
                b = b3;
            }
            return new bE(a3, new fI[]{fIVar7, fIVar, fIVar9, a2});
        }
        fIVar6 = a(fIVar, fIVar9, fIVar7, fIVar8, Math.min(i, b));
        if (fIVar6 == null) {
            fIVar6 = fIVar8;
        }
        int max = Math.max(b(fIVar7, fIVar6).b(), b(fIVar9, fIVar6).b()) + 1;
        if ((max & 1) == 1) {
            max++;
        }
        a3 = a(this.c, fIVar7, fIVar, fIVar9, fIVar6, max, max);
        a2 = fIVar6;
        return new bE(a3, new fI[]{fIVar7, fIVar, fIVar9, a2});
    }
}
