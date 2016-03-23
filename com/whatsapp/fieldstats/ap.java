package com.whatsapp.fieldstats;

import android.content.Context;

public final class ap extends av {
    public Double a;
    public Double b;
    public Double c;
    public Double d;
    public Double e;
    public Double f;
    public Double g;

    void updateFields(Context context) {
        i.a(context, bn.EVENT, Integer.valueOf(cx.E2E_MESSAGE_RECV.getCode()));
        i.a(context, bn.E2E_SUCCESSFUL, this.g);
        i.a(context, bn.E2E_FAILURE_REASON, this.e);
        i.a(context, bn.RETRY_COUNT, this.c);
        i.a(context, bn.E2E_DESTINATION, this.d);
        i.a(context, bn.E2E_CIPHERTEXT_TYPE, this.a);
        i.a(context, bn.E2E_CIPHERTEXT_VERSION, this.f);
        i.a(context, bn.MESSAGE_MEDIA_TYPE, this.b);
        i.a(context, bn.EVENT);
    }
}
