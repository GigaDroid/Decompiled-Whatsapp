package com.whatsapp.fieldstats;

import android.content.Context;

public final class a1 extends av {
    public String a;
    public String b;

    void updateFields(Context context) {
        i.a(context, bn.EVENT, Integer.valueOf(cx.CRASH_LOG.getCode()));
        i.a(context, bn.CRASH_EXCEPTION, this.a);
        i.a(context, bn.CRASH_REASON, this.b);
        i.a(context, bn.EVENT);
    }
}
