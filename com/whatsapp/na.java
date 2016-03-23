package com.whatsapp;

import android.graphics.Point;
import android.util.Pair;
import java.util.Comparator;

class na implements Comparator {
    final GroupChatLiveLocationsActivity2 a;

    na(GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2) {
        this.a = groupChatLiveLocationsActivity2;
    }

    public int compare(Object obj, Object obj2) {
        return a((Pair) obj, (Pair) obj2);
    }

    public int a(Pair pair, Pair pair2) {
        return ((Point) pair.second).x - ((Point) pair2.second).x;
    }
}
