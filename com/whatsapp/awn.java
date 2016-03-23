package com.whatsapp;

import android.content.Context;
import java.util.Comparator;

public class awn implements Comparator {
    private final Context a;

    public awn(Context context) {
        this.a = context;
    }

    public int a(l5 l5Var, l5 l5Var2) {
        int i = 0;
        if (App.as.d(l5Var.p)) {
            return 1;
        }
        if (App.as.d(l5Var2.p)) {
            return -1;
        }
        int i2;
        String a = l5Var.a(this.a);
        String a2 = l5Var2.a(this.a);
        if (a.length() <= 0 || !Character.isLetter(a.charAt(0))) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        if (a2.length() > 0 && Character.isLetter(a2.charAt(0))) {
            i = 1;
        }
        if (i2 == i) {
            return a.compareToIgnoreCase(a2);
        }
        if (i2 != 0) {
            return -1;
        }
        return 1;
    }

    public int compare(Object obj, Object obj2) {
        return a((l5) obj, (l5) obj2);
    }
}
