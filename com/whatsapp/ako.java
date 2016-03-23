package com.whatsapp;

import java.util.Comparator;

final class ako implements Comparator {
    ako() {
    }

    public int a(f8 f8Var, f8 f8Var2) {
        long j = f8Var.a;
        long j2 = f8Var2.a;
        if (j == j2) {
            return f8Var.b.compareTo(f8Var2.b);
        }
        if (j < j2) {
            return 1;
        }
        return -1;
    }

    public int compare(Object obj, Object obj2) {
        return a((f8) obj, (f8) obj2);
    }
}
