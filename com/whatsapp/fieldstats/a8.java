package com.whatsapp.fieldstats;

import android.content.Context;

public final class a8 extends av {
    public Double a;
    public Double b;
    public Double c;

    void updateFields(Context context) {
        i.a(context, bn.EVENT, Integer.valueOf(cx.NETWORK_CHANGE.getCode()));
        i.a(context, bn.NETWORK_RADIO_TYPE, this.a);
        i.a(context, bn.NETWORK_IS_WIFI, this.c);
        i.a(context, bn.NETWORK_IS_ROAMING, this.b);
        i.a(context, bn.EVENT);
    }
}
