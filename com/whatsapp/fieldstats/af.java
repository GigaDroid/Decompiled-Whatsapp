package com.whatsapp.fieldstats;

import android.content.Context;

public final class af extends av {
    public Double a;
    public Double b;
    public Double c;

    void updateFields(Context context) {
        i.a(context, bn.EVENT, Integer.valueOf(cx.LOGIN.getCode()));
        i.a(context, bn.LOGIN_RESULT, this.c);
        i.a(context, bn.RETRY_COUNT, this.a);
        if (this.b != null) {
            i.a(context, a.LOGIN_T, this.b);
        }
        i.a(context, bn.EVENT);
    }
}
