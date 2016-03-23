package com.whatsapp;

import android.widget.ImageView;
import java.util.Stack;

final class axv {
    private final Stack a;

    static Stack a(axv com_whatsapp_axv) {
        return com_whatsapp_axv.a;
    }

    public void a(ImageView imageView) {
        boolean z = DialogToastActivity.f;
        int i = 0;
        while (i < this.a.size()) {
            if (((at9) this.a.get(i)).b == imageView) {
                this.a.remove(i);
                if (!z) {
                    continue;
                }
            }
            int i2 = i + 1;
            if (!z) {
                i = i2;
            } else {
                return;
            }
        }
    }

    axv(oi oiVar) {
        this();
    }

    private axv() {
        this.a = new Stack();
    }
}
