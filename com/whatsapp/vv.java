package com.whatsapp;

import com.whatsapp.protocol.co;
import java.util.Comparator;

class vv implements Comparator {
    final GroupChatRecentLocationsActivity a;

    public int a(co coVar, co coVar2) {
        return (int) ((coVar2.m * 1000000.0d) - (coVar.m * 1000000.0d));
    }

    vv(GroupChatRecentLocationsActivity groupChatRecentLocationsActivity) {
        this.a = groupChatRecentLocationsActivity;
    }

    public int compare(Object obj, Object obj2) {
        return a((co) obj, (co) obj2);
    }
}
