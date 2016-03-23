package com.whatsapp;

import com.whatsapp.protocol.co;
import java.util.Collection;
import java.util.Map;

class ato extends akc {
    final ListChatInfo a;

    public void a(Collection collection, Map map) {
        boolean z = DialogToastActivity.f;
        for (co coVar : collection) {
            if (coVar.k.c.equals(ListChatInfo.f(this.a).p) && App.b(coVar.c)) {
                ListChatInfo.d(this.a);
                if (!z) {
                    return;
                }
            }
            if (z) {
                return;
            }
        }
    }

    public void a(Collection collection, String str, Map map, boolean z) {
        boolean z2 = DialogToastActivity.f;
        if (!(collection == null || collection.isEmpty())) {
            for (co coVar : collection) {
                if (!coVar.k.c.equals(ListChatInfo.f(this.a).p)) {
                    if (z2) {
                        break;
                    }
                } else {
                    ListChatInfo.d(this.a);
                    return;
                }
            }
            if (!z2) {
                return;
            }
        }
        if (str == null || ListChatInfo.f(this.a).p.equals(str)) {
            ListChatInfo.d(this.a);
        }
    }

    ato(ListChatInfo listChatInfo) {
        this.a = listChatInfo;
    }
}
