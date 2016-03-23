package com.whatsapp.fieldstats;

import android.content.Context;

public final class ba extends av {
    public Double a;
    public Double b;
    public Double c;
    public Double d;

    void updateFields(Context context) {
        i.a(context, bn.EVENT, Integer.valueOf(cx.PROFILE_PIC_DOWNLOAD.getCode()));
        i.a(context, bn.PROFILE_PIC_DOWNLOAD_RESULT, this.a);
        i.a(context, bn.PROFILE_PIC_TYPE, this.d);
        if (this.b != null) {
            i.a(context, a.PROFILE_PIC_DOWNLOAD_T, this.b);
        }
        if (this.c != null) {
            i.a(context, a.PROFILE_PIC_DOWNLOAD_SIZE, this.c);
        }
        i.a(context, bn.EVENT);
    }
}
