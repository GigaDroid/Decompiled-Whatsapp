package com.whatsapp.fieldstats;

import android.content.Context;

public final class b3 extends av {
    public Double a;
    public Double b;

    void updateFields(Context context) {
        i.a(context, bn.EVENT, Integer.valueOf(cx.UI_USAGE.getCode()));
        i.a(context, bn.UI_USAGE_TYPE, this.a);
        i.a(context, bn.ENTRY_POINT, this.b);
        i.a(context, bn.EVENT);
    }
}
