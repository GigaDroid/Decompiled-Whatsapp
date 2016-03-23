package com.whatsapp.memory.dump;

import java.util.Arrays;

public class c {
    static final /* synthetic */ boolean a;
    private int[] b;

    public final void a(int i) {
        int i2 = 0;
        int i3 = d.a;
        int i4 = 0;
        int i5 = -1;
        while (i4 < d.values().length) {
            i5 = Math.max(d.values()[i4].getTypeId(), i5);
            i4++;
            if (i3 != 0) {
                break;
            }
        }
        if (a || (i5 > 0 && i5 <= d.LONG.getTypeId())) {
            this.b = new int[(i5 + 1)];
            Arrays.fill(this.b, -1);
            while (i2 < d.values().length) {
                this.b[d.values()[i2].getTypeId()] = d.values()[i2].getSize();
                i2++;
                if (i3 != 0) {
                    break;
                }
            }
            this.b[d.OBJECT.getTypeId()] = i;
            return;
        }
        throw new AssertionError();
    }

    static {
        a = !c.class.desiredAssertionStatus();
    }

    public final int a(d dVar) {
        return this.b[dVar.getTypeId()];
    }
}
