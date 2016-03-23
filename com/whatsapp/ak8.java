package com.whatsapp;

import com.whatsapp.protocol.co;

class ak8 extends akc {
    final GroupChatRecentLocationsActivity a;

    ak8(GroupChatRecentLocationsActivity groupChatRecentLocationsActivity) {
        this.a = groupChatRecentLocationsActivity;
    }

    public void a(co coVar, int i) {
        if (coVar != null && coVar.k.c.equals(GroupChatRecentLocationsActivity.h(this.a)) && !coVar.k.a && coVar.c == 5) {
            co a = GroupChatRecentLocationsActivity.a(this.a, coVar.t);
            if (a != null) {
                GroupChatRecentLocationsActivity.f(this.a).remove(a);
            }
            GroupChatRecentLocationsActivity.f(this.a).add(coVar);
            GroupChatRecentLocationsActivity.g(this.a);
            GroupChatRecentLocationsActivity.b(this.a).a();
        }
    }
}
