package com.whatsapp.fieldstats;

import android.content.Context;

public final class be extends av {
    public Double a;
    public Double b;
    public Double c;

    void updateFields(Context context) {
        i.a(context, bn.EVENT, Integer.valueOf(cx.PUSH_RECEIVE.getCode()));
        i.a(context, bn.PUSH_RECEIVE_WHILE_OFFLINE, this.b);
        if (this.c != null) {
            i.a(context, a.PUSH_RECEIVE_DELAY_T, this.c);
        }
        if (this.a != null) {
            i.a(context, a.NETWORK_CHANGE_DELAY_T, this.a);
        }
        i.a(context, bn.EVENT);
    }
}
