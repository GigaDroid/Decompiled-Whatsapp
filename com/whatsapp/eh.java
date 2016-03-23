package com.whatsapp;

import android.content.Context;
import java.text.Collator;
import java.util.Comparator;

public class eh implements Comparator {
    private final Context a;

    public eh(Context context) {
        this.a = context;
    }

    public int a(l5 l5Var, l5 l5Var2) {
        long d;
        long d2 = App.aK.t(l5Var.p) ? App.aK.d(l5Var.p) : 0;
        if (App.aK.t(l5Var2.p)) {
            d = App.aK.d(l5Var2.p);
        } else {
            d = 0;
        }
        if (d2 == 0 && d == 0) {
            Collator instance = Collator.getInstance();
            instance.setStrength(0);
            instance.setDecomposition(1);
            return instance.compare(l5Var.a(this.a), l5Var2.a(this.a));
        } else if (d2 == 0) {
            return 1;
        } else {
            if (d == 0) {
                return -1;
            }
            if (d2 == d) {
                return l5Var.a(this.a).compareTo(l5Var2.a(this.a));
            }
            if (d2 < d) {
                return 1;
            }
            return -1;
        }
    }

    public int compare(Object obj, Object obj2) {
        return a((l5) obj, (l5) obj2);
    }
}
