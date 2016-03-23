package com.whatsapp;

import com.whatsapp.protocol.cx;
import java.util.ArrayList;
import java.util.Comparator;

class aiy implements Comparator {
    final GroupChatLiveLocationsActivity a;

    public int compare(Object obj, Object obj2) {
        return a((ArrayList) obj, (ArrayList) obj2);
    }

    aiy(GroupChatLiveLocationsActivity groupChatLiveLocationsActivity) {
        this.a = groupChatLiveLocationsActivity;
    }

    public int a(ArrayList arrayList, ArrayList arrayList2) {
        return (int) ((((cx) arrayList2.get(0)).a * 1000000.0d) - (((cx) arrayList.get(0)).a * 1000000.0d));
    }
}
