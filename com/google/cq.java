package com.google;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class cq implements cO, i0 {
    private static int b(fI[] fIVarArr) {
        return Math.min(Math.min(b(fIVarArr[0], fIVarArr[4]), (b(fIVarArr[6], fIVarArr[2]) * 17) / 18), Math.min(b(fIVarArr[1], fIVarArr[5]), (b(fIVarArr[7], fIVarArr[3]) * 17) / 18));
    }

    private static int b(fI fIVar, fI fIVar2) {
        if (fIVar == null || fIVar2 == null) {
            return Integer.MAX_VALUE;
        }
        return (int) Math.abs(fIVar.a() - fIVar2.a());
    }

    public void a() {
    }

    private static f6[] a(b1 b1Var, Map map, boolean z) {
        boolean z2 = Q.b;
        List arrayList = new ArrayList();
        U a = iY.a(b1Var, map, z);
        for (fI[] fIVarArr : a.a()) {
            am a2 = g0.a(a.b(), fIVarArr[4], fIVarArr[5], fIVarArr[6], fIVarArr[7], b(fIVarArr), a(fIVarArr));
            f6 f6Var = new f6(a2.f(), a2.b(), fIVarArr, gg.PDF_417);
            f6Var.a(eD.ERROR_CORRECTION_LEVEL, a2.e());
            cH cHVar = (cH) a2.d();
            if (cHVar != null) {
                f6Var.a(eD.PDF417_EXTRA_METADATA, cHVar);
            }
            arrayList.add(f6Var);
            if (z2) {
                break;
            }
        }
        return (f6[]) arrayList.toArray(new f6[arrayList.size()]);
    }

    public f6 a(b1 b1Var, Map map) {
        boolean z = false;
        boolean z2 = Q.b;
        f6[] a = a(b1Var, map, false);
        if (a == null || a.length == 0 || a[0] == null) {
            throw aN.a();
        }
        f6 f6Var = a[0];
        if (z2) {
            if (!aK.a) {
                z = true;
            }
            aK.a = z;
        }
        return f6Var;
    }

    private static int a(fI[] fIVarArr) {
        return Math.max(Math.max(a(fIVarArr[0], fIVarArr[4]), (a(fIVarArr[6], fIVarArr[2]) * 17) / 18), Math.max(a(fIVarArr[1], fIVarArr[5]), (a(fIVarArr[7], fIVarArr[3]) * 17) / 18));
    }

    private static int a(fI fIVar, fI fIVar2) {
        if (fIVar == null || fIVar2 == null) {
            return 0;
        }
        return (int) Math.abs(fIVar.a() - fIVar2.a());
    }
}
