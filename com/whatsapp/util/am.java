package com.whatsapp.util;

import android.widget.ImageView;
import com.whatsapp.protocol.co;
import java.util.Iterator;
import java.util.Stack;

class am {
    private Stack a;
    final bd b;

    public void a(ImageView imageView) {
        int i = Log.h;
        int i2 = 0;
        while (i2 < this.a.size()) {
            if (((bh) this.a.get(i2)).d == imageView) {
                this.a.remove(i2);
                if (i == 0) {
                    continue;
                }
            }
            int i3 = i2 + 1;
            if (i == 0) {
                i2 = i3;
            } else {
                return;
            }
        }
    }

    am(bd bdVar) {
        this.b = bdVar;
        this.a = new Stack();
    }

    static Stack a(am amVar) {
        return amVar.a;
    }

    public boolean a(co coVar) {
        int i = Log.h;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            if (!((bh) it.next()).b.k.equals(coVar.k)) {
                if (i != 0) {
                    break;
                }
            }
            return true;
        }
        return false;
    }
}
