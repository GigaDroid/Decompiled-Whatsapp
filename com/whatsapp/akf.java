package com.whatsapp;

import com.whatsapp.protocol.co;
import java.util.Collection;
import java.util.Map;

class akf extends akc {
    final ContactInfo a;

    public void a(Collection collection, Map map) {
        boolean z = DialogToastActivity.f;
        for (co coVar : collection) {
            if (coVar.k.c.equals(ContactInfo.h(this.a).p) && App.b(coVar.c)) {
                ContactInfo.a(this.a);
                if (!z) {
                    return;
                }
            }
            if (z) {
                return;
            }
        }
    }

    public void b(co coVar, int i) {
        if (coVar != null && coVar.k.c.equals(ContactInfo.h(this.a).p) && !coVar.k.a && App.b(coVar.c) && i == 3) {
            ContactInfo.a(this.a);
        }
    }

    public void a(Collection collection, String str, Map map, boolean z) {
        boolean z2 = DialogToastActivity.f;
        if (!(collection == null || collection.isEmpty())) {
            for (co coVar : collection) {
                if (!coVar.k.c.equals(ContactInfo.h(this.a).p)) {
                    if (z2) {
                        break;
                    }
                } else {
                    ContactInfo.a(this.a);
                    return;
                }
            }
            if (!z2) {
                return;
            }
        }
        if (str == null || ContactInfo.h(this.a).p.equals(str)) {
            ContactInfo.a(this.a);
        }
    }

    akf(ContactInfo contactInfo) {
        this.a = contactInfo;
    }
}
