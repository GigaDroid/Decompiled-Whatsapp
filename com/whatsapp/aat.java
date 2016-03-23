package com.whatsapp;

import android.graphics.Point;
import android.util.Pair;
import java.util.Comparator;

class aat implements Comparator {
    final GroupChatLiveLocationsActivity2 a;

    public int compare(Object obj, Object obj2) {
        return a((Pair) obj, (Pair) obj2);
    }

    public int a(Pair pair, Pair pair2) {
        return ((Point) pair.second).y - ((Point) pair2.second).y;
    }

    aat(GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2) {
        this.a = groupChatLiveLocationsActivity2;
    }
}
