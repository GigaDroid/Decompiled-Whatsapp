package com.whatsapp;

import com.whatsapp.protocol.co;
import java.util.ArrayList;
import java.util.Comparator;

class aw1 implements Comparator {
    final GroupChatRecentLocationsActivity a;

    aw1(GroupChatRecentLocationsActivity groupChatRecentLocationsActivity) {
        this.a = groupChatRecentLocationsActivity;
    }

    public int compare(Object obj, Object obj2) {
        return a((ArrayList) obj, (ArrayList) obj2);
    }

    public int a(ArrayList arrayList, ArrayList arrayList2) {
        return (int) ((((co) arrayList2.get(0)).m * 1000000.0d) - (((co) arrayList.get(0)).m * 1000000.0d));
    }
}
