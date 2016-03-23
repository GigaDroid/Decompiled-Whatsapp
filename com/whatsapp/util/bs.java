package com.whatsapp.util;

import android.widget.ImageView;
import java.util.Stack;

class bs {
    private final Stack a;

    public void a(ImageView imageView) {
        int i = Log.h;
        int i2 = 0;
        while (i2 < this.a.size()) {
            if (((v) this.a.get(i2)).b == imageView) {
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

    bs(by byVar) {
        this();
    }

    static Stack a(bs bsVar) {
        return bsVar.a;
    }

    private bs() {
        this.a = new Stack();
    }
}
