package com.google;

import java.util.List;

final class hC {
    static d_ a(List list) {
        int i;
        boolean z = aJ.q;
        int size = (list.size() * 2) - 1;
        if (((dA) list.get(list.size() - 1)).d() == null) {
            i = size - 1;
        } else {
            i = size;
        }
        d_ d_Var = new d_(i * 12);
        int a = ((dA) list.get(0)).d().a();
        size = 11;
        i = 0;
        while (size >= 0) {
            if (((1 << size) & a) != 0) {
                d_Var.e(i);
            }
            i++;
            size--;
            if (z) {
                break;
            }
        }
        size = 1;
        int i2 = i;
        while (size < list.size()) {
            dA dAVar = (dA) list.get(size);
            int a2 = dAVar.c().a();
            a = 11;
            while (a >= 0) {
                if (((1 << a) & a2) != 0) {
                    d_Var.e(i2);
                }
                i2++;
                a--;
                if (z) {
                    break;
                }
            }
            if (dAVar.d() != null) {
                a = dAVar.d().a();
                i = 11;
                while (i >= 0) {
                    if (((1 << i) & a) != 0) {
                        d_Var.e(i2);
                    }
                    i2++;
                    i--;
                    if (z) {
                        break;
                    }
                }
            }
            i = size + 1;
            if (z) {
                break;
            }
            size = i;
        }
        return d_Var;
    }
}
