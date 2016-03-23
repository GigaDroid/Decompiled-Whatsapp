package com.whatsapp.fieldstats;

import android.content.Context;

public final class bw extends av {
    public Double a;
    public Double b;

    void updateFields(Context context) {
        i.a(context, bn.EVENT, Integer.valueOf(cx.PTT.getCode()));
        i.a(context, bn.PTT_RESULT, this.a);
        if (this.b != null) {
            i.a(context, a.PTT_SIZE, this.b);
        }
        i.a(context, bn.EVENT);
    }
}
