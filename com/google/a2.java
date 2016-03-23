package com.google;

import java.util.BitSet;

final class a2 extends aX {
    a2() {
    }

    public void a(eE eEVar, Object obj) {
        a(eEVar, (BitSet) obj);
    }

    public void a(eE eEVar, BitSet bitSet) {
        int i = bG.l;
        if (bitSet == null) {
            eEVar.b();
            return;
        }
        eEVar.c();
        int i2 = 0;
        while (i2 < bitSet.length()) {
            int i3;
            if (bitSet.get(i2)) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            eEVar.a((long) i3);
            i2++;
            if (i != 0) {
                break;
            }
        }
        eEVar.e();
    }
}
