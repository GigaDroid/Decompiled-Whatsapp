package com.whatsapp;

import android.content.Context;
import java.util.Comparator;

public class t2 implements Comparator {
    private final Context a;

    public int compare(Object obj, Object obj2) {
        return a((l5) obj, (l5) obj2);
    }

    public int a(l5 l5Var, l5 l5Var2) {
        int i = 0;
        String a = l5Var.a(this.a);
        String a2 = l5Var2.a(this.a);
        int i2 = (a.length() <= 0 || !Character.isLetter(a.charAt(0))) ? 0 : 1;
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

    public t2(Context context) {
        this.a = context;
    }
}
