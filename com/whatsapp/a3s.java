package com.whatsapp;

import android.content.Context;

class a3s extends a3d {
    final ar8 b;

    public int compare(Object obj, Object obj2) {
        return a((l5) obj, (l5) obj2);
    }

    a3s(ar8 com_whatsapp_ar8, Context context) {
        this.b = com_whatsapp_ar8;
        super(context);
    }

    public int a(l5 l5Var, l5 l5Var2) {
        if (l5Var.m && !l5Var2.m) {
            return -1;
        }
        if (l5Var.m || !l5Var2.m) {
            return super.a(l5Var, l5Var2);
        }
        return 1;
    }
}
