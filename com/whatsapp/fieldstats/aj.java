package com.whatsapp.fieldstats;

import android.content.Context;

public final class aj extends av {
    public Double a;
    public Double b;

    void updateFields(Context context) {
        i.a(context, bn.EVENT, Integer.valueOf(cx.GROUP_MUTE.getCode()));
        i.a(context, bn.GROUP_SIZE, this.b);
        if (this.a != null) {
            i.a(context, a.GROUP_MUTE_T, this.a);
        }
        i.a(context, bn.EVENT);
    }
}
