package com.whatsapp.fieldstats;

import android.content.Context;

public final class ah extends av {
    public Double a;
    public Double b;
    public Double c;
    public Double d;
    public Double e;
    public Double f;
    public Double g;
    public Double h;
    public Double i;
    public Double j;
    public Double k;

    void updateFields(Context context) {
        i.a(context, bn.EVENT, Integer.valueOf(cx.MESSAGE_SEND.getCode()));
        i.a(context, bn.MESSAGE_SEND_RESULT, this.j);
        i.a(context, bn.MESSAGE_TYPE, this.k);
        i.a(context, bn.MESSAGE_MEDIA_TYPE, this.d);
        i.a(context, bn.MESSAGE_IS_FORWARD, this.g);
        i.a(context, bn.MESSAGE_IS_FANOUT, this.h);
        i.a(context, bn.RETRY_COUNT, this.b);
        i.a(context, bn.MESSAGE_IS_INTERNATIONAL, this.a);
        i.a(context, bn.MEDIA_CAPTION_PRESENT, this.e);
        i.a(context, bn.E2E_CIPHERTEXT_VERSION, this.f);
        i.a(context, bn.E2E_CIPHERTEXT_TYPE, this.i);
        if (this.c != null) {
            i.a(context, a.MESSAGE_SEND_T, this.c);
        }
        i.a(context, bn.EVENT);
    }
}
