package com.whatsapp.fieldstats;

import android.content.Context;

public final class a6 extends av {
    public Double a;
    public Double b;
    public Double c;
    public Double d;
    public Double e;
    public Double f;
    public Double g;
    public Double h;

    void updateFields(Context context) {
        i.a(context, bn.EVENT, Integer.valueOf(cx.MEDIA_UPLOAD.getCode()));
        i.a(context, bn.MEDIA_TYPE, this.g);
        i.a(context, bn.MEDIA_UPLOAD_RESULT, this.a);
        i.a(context, bn.MESSAGE_IS_FORWARD, this.f);
        i.a(context, bn.RETRY_COUNT, this.e);
        i.a(context, bn.TRANSCODED, this.h);
        i.a(context, bn.E2E_MEDIA_ENCRYPTION, this.d);
        if (this.c != null) {
            i.a(context, a.MEDIA_UPLOAD_T, this.c);
        }
        if (this.b != null) {
            i.a(context, a.MEDIA_SIZE, this.b);
        }
        i.a(context, bn.EVENT);
    }
}
