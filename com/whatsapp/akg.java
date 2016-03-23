package com.whatsapp;

import com.whatsapp.protocol.co;
import java.util.Collection;
import java.util.Map;

class akg extends akc {
    final GroupChatInfo a;

    public void a(Collection collection, Map map) {
        boolean z = DialogToastActivity.f;
        for (co coVar : collection) {
            if (coVar.k.c.equals(GroupChatInfo.q(this.a)) && App.b(coVar.c)) {
                GroupChatInfo.x(this.a);
                if (!z) {
                    return;
                }
            }
            if (z) {
                return;
            }
        }
    }

    public void a(co coVar, int i) {
        if (coVar != null && coVar.k.c.equals(GroupChatInfo.q(this.a)) && !coVar.k.a && coVar.c == 5) {
            GroupChatInfo.x(this.a);
        }
    }

    public void a(Collection collection, String str, Map map, boolean z) {
        boolean z2 = DialogToastActivity.f;
        if (!(collection == null || collection.isEmpty())) {
            for (co coVar : collection) {
                if (!coVar.k.c.equals(GroupChatInfo.q(this.a))) {
                    if (z2) {
                        break;
                    }
                } else {
                    GroupChatInfo.x(this.a);
                    return;
                }
            }
            if (!z2) {
                return;
            }
        }
        if (str == null || GroupChatInfo.q(this.a).equals(str)) {
            GroupChatInfo.x(this.a);
        }
    }

    akg(GroupChatInfo groupChatInfo) {
        this.a = groupChatInfo;
    }

    public void b(co coVar, int i) {
        if (coVar != null && coVar.k.c.equals(GroupChatInfo.q(this.a)) && !coVar.k.a && App.b(coVar.c) && i == 3) {
            GroupChatInfo.x(this.a);
        }
    }
}
