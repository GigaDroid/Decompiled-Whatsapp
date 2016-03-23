package com.google;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

public final class ee implements cO {
    private Map a;
    private cO[] b;

    public void a() {
        int i = fI.a;
        if (this.b != null) {
            cO[] cOVarArr = this.b;
            int length = cOVarArr.length;
            int i2 = 0;
            while (i2 < length) {
                cOVarArr[i2].a();
                i2++;
                if (i != 0) {
                    return;
                }
            }
        }
    }

    public void a(Map map) {
        Collection collection;
        Object obj = null;
        int i = fI.a;
        this.a = map;
        Object obj2 = (map == null || !map.containsKey(b3.TRY_HARDER)) ? null : 1;
        if (map == null) {
            collection = null;
        } else {
            collection = (Collection) map.get(b3.POSSIBLE_FORMATS);
        }
        Collection arrayList = new ArrayList();
        if (collection != null) {
            if (collection.contains(gg.UPC_A) || collection.contains(gg.UPC_E) || collection.contains(gg.EAN_13) || collection.contains(gg.EAN_8) || collection.contains(gg.CODABAR) || collection.contains(gg.CODE_39) || collection.contains(gg.CODE_93) || collection.contains(gg.CODE_128) || collection.contains(gg.ITF) || collection.contains(gg.RSS_14) || collection.contains(gg.RSS_EXPANDED)) {
                obj = 1;
            }
            if (obj != null && obj2 == null) {
                arrayList.add(new a0(map));
            }
            if (collection.contains(gg.QR_CODE)) {
                arrayList.add(new L());
            }
            if (collection.contains(gg.DATA_MATRIX)) {
                arrayList.add(new cp());
            }
            if (collection.contains(gg.AZTEC)) {
                arrayList.add(new fr());
            }
            if (collection.contains(gg.PDF_417)) {
                arrayList.add(new cq());
            }
            if (collection.contains(gg.MAXICODE)) {
                arrayList.add(new t());
            }
            if (!(obj == null || obj2 == null)) {
                arrayList.add(new a0(map));
            }
        }
        if (arrayList.isEmpty()) {
            if (obj2 == null) {
                arrayList.add(new a0(map));
            }
            arrayList.add(new L());
            arrayList.add(new cp());
            arrayList.add(new fr());
            arrayList.add(new cq());
            arrayList.add(new t());
            if (obj2 != null) {
                arrayList.add(new a0(map));
            }
        }
        this.b = (cO[]) arrayList.toArray(new cO[arrayList.size()]);
        if (aK.a) {
            fI.a = i + 1;
        }
    }

    public f6 a(b1 b1Var) {
        if (this.b == null) {
            a(null);
        }
        return b(b1Var);
    }

    private f6 b(b1 b1Var) {
        if (this.b != null) {
            cO[] cOVarArr = this.b;
            int length = cOVarArr.length;
            int i = 0;
            while (i < length) {
                try {
                    return cOVarArr[i].a(b1Var, this.a);
                } catch (aK e) {
                    i++;
                    if (fI.a != 0) {
                        break;
                    }
                }
            }
        }
        throw aN.a();
    }

    public f6 a(b1 b1Var, Map map) {
        a(map);
        return b(b1Var);
    }
}
