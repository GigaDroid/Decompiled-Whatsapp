package com.whatsapp;

import android.os.ConditionVariable;
import android.util.Pair;
import com.whatsapp.protocol.c2;
import com.whatsapp.protocol.c3;
import com.whatsapp.protocol.co;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

final class w3 implements Runnable {
    final String a;
    final ConditionVariable b;
    final ConditionVariable c;
    final HashMap d;
    final boolean e;

    public void run() {
        boolean z = DialogToastActivity.f;
        List arrayList = new ArrayList();
        long currentTimeMillis = System.currentTimeMillis();
        List<Pair> arrayList2 = new ArrayList();
        try {
            for (Entry entry : this.d.entrySet()) {
                String str = (String) entry.getKey();
                co coVar = (co) entry.getValue();
                c2 E = App.E(str);
                if (E != null) {
                    arrayList.add(E);
                }
                if (coVar != null && l5.e(str) && coVar.d == 6) {
                    App.a(str, true);
                }
                if (!(E == null || currentTimeMillis - 86400000 >= E.m || coVar == null)) {
                    arrayList2.add(Pair.create(coVar.k, Integer.valueOf(E.r + 20)));
                    continue;
                }
                if (z) {
                    break;
                }
            }
            App.a(this.a, arrayList, this.e ? 7 : 0, this.e, null);
            this.c.open();
            for (Pair pair : arrayList2) {
                App.a(1, App.aK.a((c3) pair.first, ((Integer) pair.second).intValue()), false, this.e, null, this.b);
                if (z) {
                    return;
                }
            }
        } catch (Throwable th) {
            Throwable th2 = th;
            App.a(this.a, arrayList, this.e ? 7 : 0, this.e, null);
            this.c.open();
        }
    }

    w3(HashMap hashMap, String str, boolean z, ConditionVariable conditionVariable, ConditionVariable conditionVariable2) {
        this.d = hashMap;
        this.a = str;
        this.e = z;
        this.c = conditionVariable;
        this.b = conditionVariable2;
    }
}
