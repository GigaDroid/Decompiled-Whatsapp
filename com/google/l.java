package com.google;

import java.io.Serializable;
import java.util.Comparator;

final class l implements Comparator, Serializable {
    l(r rVar) {
        this();
    }

    public int a(f6 f6Var, f6 f6Var2) {
        boolean z = M.d;
        int intValue = ((Integer) f6Var.b().get(eD.STRUCTURED_APPEND_SEQUENCE)).intValue();
        int intValue2 = ((Integer) f6Var2.b().get(eD.STRUCTURED_APPEND_SEQUENCE)).intValue();
        if (intValue < intValue2) {
            return -1;
        }
        if (intValue > intValue2) {
            return 1;
        }
        if (z) {
            aK.a = !aK.a;
        }
        return 0;
    }

    private l() {
    }

    public int compare(Object obj, Object obj2) {
        return a((f6) obj, (f6) obj2);
    }
}
