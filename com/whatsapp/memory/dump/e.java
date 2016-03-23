package com.whatsapp.memory.dump;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class e {
    private Map a;

    public e() {
        this.a = new HashMap();
    }

    public List a(long j) {
        int i = d.a;
        List arrayList = new ArrayList();
        l lVar = (l) this.a.get(Long.valueOf(j));
        arrayList.add(lVar);
        while (lVar.b()) {
            lVar = (l) this.a.get(Long.valueOf(lVar.a()));
            arrayList.add(lVar);
            if (i != 0) {
                break;
            }
        }
        return arrayList;
    }

    public void a(l lVar) {
        this.a.put(Long.valueOf(lVar.d()), lVar);
    }
}
