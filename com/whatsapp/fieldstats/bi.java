package com.whatsapp.fieldstats;

import android.content.Context;

public final class bi extends av {
    public Double a;
    public Double b;
    public Double c;
    public Double d;

    void updateFields(Context context) {
        i.a(context, bn.EVENT, Integer.valueOf(cx.PROFILE_PIC_UPLOAD.getCode()));
        i.a(context, bn.PROFILE_PIC_UPLOAD_RESULT, this.a);
        i.a(context, bn.RETRY_COUNT, this.b);
        if (this.d != null) {
            i.a(context, a.PROFILE_PIC_UPLOAD_T, this.d);
        }
        if (this.c != null) {
            i.a(context, a.PROFILE_PIC_SIZE, this.c);
        }
        i.a(context, bn.EVENT);
    }
}
