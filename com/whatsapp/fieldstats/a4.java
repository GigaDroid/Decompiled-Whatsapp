package com.whatsapp.fieldstats;

import android.content.Context;

public final class a4 extends av {
    public Double a;
    public Double b;
    public Double c;
    public Double d;

    void updateFields(Context context) {
        i.a(context, bn.EVENT, Integer.valueOf(cx.ADDRESSBOOK_SYNC.getCode()));
        i.a(context, bn.ADDRESSBOOK_SYNC_IS_REG, this.d);
        i.a(context, bn.ADDRESSBOOK_SYNC_ERROR_CODE, this.a);
        i.a(context, bn.ADDRESSBOOK_SYNC_RESULT_TYPE, this.c);
        if (this.b != null) {
            i.a(context, a.ADDRESSBOOK_SYNC_T, this.b);
        }
        i.a(context, bn.EVENT);
    }
}
