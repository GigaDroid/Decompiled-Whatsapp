package com.whatsapp;

import android.content.Context;
import android.widget.RelativeLayout;

class EmojiPopupWindow$2 extends RelativeLayout {
    final k3 a;
    int b;

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int orientation = k3.b(this.a).getWindowManager().getDefaultDisplay().getOrientation();
        if (!(this.b == -1 || this.b == orientation)) {
            k3.c(this.a).post(new cb(this));
        }
        this.b = orientation;
    }

    EmojiPopupWindow$2(k3 k3Var, Context context) {
        this.a = k3Var;
        super(context);
        this.b = -1;
    }
}
