package com.whatsapp;

import java.util.Comparator;

class ay implements Comparator {
    final k1 a;

    public int compare(Object obj, Object obj2) {
        return a((PlaceInfo) obj, (PlaceInfo) obj2);
    }

    public int a(PlaceInfo placeInfo, PlaceInfo placeInfo2) {
        return placeInfo.dist < placeInfo2.dist ? -1 : 1;
    }

    ay(k1 k1Var) {
        this.a = k1Var;
    }
}
