package com.whatsapp;

import com.whatsapp.protocol.c3;
import com.whatsapp.protocol.co;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;

public class a25 {
    public String a;
    public c3 b;
    public String[] c;

    public static void a(Collection collection) {
        boolean z = DialogToastActivity.f;
        HashMap hashMap = new HashMap();
        for (q7 q7Var : collection) {
            co coVar = q7Var.b;
            aeq com_whatsapp_aeq = new aeq(coVar.k.c, coVar.t);
            ArrayList arrayList = (ArrayList) hashMap.get(com_whatsapp_aeq);
            if (arrayList == null) {
                arrayList = new ArrayList();
                hashMap.put(com_whatsapp_aeq, arrayList);
            }
            arrayList.add(coVar.k.b);
            if (z) {
                break;
            }
        }
        for (Entry entry : hashMap.entrySet()) {
            App.a(((aeq) entry.getKey()).a, ((aeq) entry.getKey()).b, (String[]) ((ArrayList) entry.getValue()).toArray(new String[((ArrayList) entry.getValue()).size()]));
            if (z) {
                break;
            }
        }
        HashMap hashMap2 = new HashMap();
        for (q7 q7Var2 : collection) {
            co coVar2 = q7Var2.b;
            Long l = (Long) hashMap2.get(coVar2.k.c);
            if (l == null) {
                hashMap2.put(coVar2.k.c, Long.valueOf(q7Var2.a));
                if (!z) {
                    continue;
                    if (z) {
                        break;
                    }
                }
            }
            hashMap2.put(coVar2.k.c, Long.valueOf(Math.max(l.longValue(), q7Var2.a)));
            continue;
            if (z) {
                break;
            }
        }
        for (Entry entry2 : hashMap2.entrySet()) {
            App.aK.c((String) entry2.getKey(), ((Long) entry2.getValue()).longValue());
            if (z) {
                return;
            }
        }
    }

    public static void a(co coVar) {
        Collection arrayList = new ArrayList();
        arrayList.add(new q7(coVar, App.aK.b(coVar)));
        a(arrayList);
    }
}
