package com.google;

import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;

final class hm extends h4 {
    public void g() {
        boolean z = bA.b;
        if (!e()) {
            int i = 0;
            while (i < f()) {
                Entry c = c(i);
                if (((dH) c.getKey()).c()) {
                    c.setValue(Collections.unmodifiableList((List) c.getValue()));
                }
                int i2 = i + 1;
                if (z) {
                    break;
                }
                i = i2;
            }
            for (Entry entry : d()) {
                if (((dH) entry.getKey()).c()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    continue;
                }
                if (z) {
                    break;
                }
            }
        }
        super.g();
    }

    public Object put(Object obj, Object obj2) {
        return super.a((dH) obj, obj2);
    }

    hm(int i) {
        super(i, null);
    }
}
