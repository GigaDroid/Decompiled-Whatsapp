package com.whatsapp.contact;

import android.text.TextUtils;
import java.text.Collator;
import java.util.Comparator;

public class k implements Comparator {
    public int compare(Object obj, Object obj2) {
        return a((d) obj, (d) obj2);
    }

    public int a(d dVar, d dVar2) {
        String a = a(dVar);
        String a2 = a(dVar2);
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
        if (dVar.a() == null && dVar2.a() == null) {
            return 0;
        }
        if (dVar.a() == null) {
            return 1;
        }
        if (dVar2.a() == null) {
            return -1;
        }
        return dVar.a().compareTo(dVar2.a());
    }

    private String a(d dVar) {
        if (dVar == null) {
            return null;
        }
        return TextUtils.isEmpty(dVar.e()) ? dVar.g() : dVar.e();
    }
}
