package com.google;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

public final class a0 extends aU {
    private final aU[] b;

    public void a() {
        int i = aU.a;
        aU[] aUVarArr = this.b;
        int length = aUVarArr.length;
        int i2 = 0;
        while (i2 < length) {
            aUVarArr[i2].a();
            i2++;
            if (i != 0) {
                return;
            }
        }
    }

    public f6 a(int i, d_ d_Var, Map map) {
        aU[] aUVarArr = this.b;
        int length = aUVarArr.length;
        int i2 = 0;
        while (i2 < length) {
            try {
                return aUVarArr[i2].a(i, d_Var, map);
            } catch (aK e) {
                i2++;
                if (aU.a != 0) {
                    break;
                }
            }
        }
        throw aN.a();
    }

    public a0(Map map) {
        boolean z;
        Collection collection = map == null ? null : (Collection) map.get(b3.POSSIBLE_FORMATS);
        if (map == null || map.get(b3.ASSUME_CODE_39_CHECK_DIGIT) == null) {
            z = false;
        } else {
            z = true;
        }
        Collection arrayList = new ArrayList();
        if (collection != null) {
            if (collection.contains(gg.EAN_13) || collection.contains(gg.UPC_A) || collection.contains(gg.EAN_8) || collection.contains(gg.UPC_E)) {
                arrayList.add(new ap(map));
            }
            if (collection.contains(gg.CODE_39)) {
                arrayList.add(new au(z));
            }
            if (collection.contains(gg.CODE_93)) {
                arrayList.add(new a9());
            }
            if (collection.contains(gg.CODE_128)) {
                arrayList.add(new aV());
            }
            if (collection.contains(gg.ITF)) {
                arrayList.add(new aq());
            }
            if (collection.contains(gg.CODABAR)) {
                arrayList.add(new al());
            }
            if (collection.contains(gg.RSS_14)) {
                arrayList.add(new ac());
            }
            if (collection.contains(gg.RSS_EXPANDED)) {
                arrayList.add(new aJ());
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new ap(map));
            arrayList.add(new au());
            arrayList.add(new al());
            arrayList.add(new a9());
            arrayList.add(new aV());
            arrayList.add(new aq());
            arrayList.add(new ac());
            arrayList.add(new aJ());
        }
        this.b = (aU[]) arrayList.toArray(new aU[arrayList.size()]);
    }
}
