package com.whatsapp;

import android.content.Context;
import java.text.Collator;
import java.util.Comparator;

public class a3d implements Comparator {
    private final Context a;

    public a3d(Context context) {
        this.a = context;
    }

    public int a(l5 l5Var, l5 l5Var2) {
        String a = a(this.a, l5Var);
        String a2 = a(this.a, l5Var2);
        if (a == null && a2 == null) {
            return 0;
        }
        if (a == null) {
            return 1;
        }
        if (a2 == null) {
            return -1;
        }
        Collator instance = Collator.getInstance();
        instance.setStrength(0);
        instance.setDecomposition(1);
        int compare = instance.compare(a, a2);
        if (compare != 0) {
            return compare;
        }
        if (l5Var.p == null && l5Var2.p == null) {
            return 0;
        }
        if (l5Var.p == null) {
            return 1;
        }
        if (l5Var2.p == null) {
            return -1;
        }
        return l5Var.p.compareTo(l5Var2.p);
    }

    public int compare(Object obj, Object obj2) {
        return a((l5) obj, (l5) obj2);
    }

    private static String a(Context context, l5 l5Var) {
        if (l5Var == null) {
            return null;
        }
        if (l5Var.k == null || l5Var.k.length() <= 0) {
            return l5Var.a(context);
        }
        return l5Var.k;
    }
}
