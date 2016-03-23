package com.whatsapp.fieldstats;

import android.content.Context;

public final class ag extends av {
    public Double a;
    public Double b;
    public Double c;
    public Double d;
    public Double e;
    public Double f;
    public Double g;

    void updateFields(Context context) {
        i.a(context, bn.EVENT, Integer.valueOf(cx.MESSAGE_RECEIVE.getCode()));
        i.a(context, bn.MESSAGE_TYPE, this.c);
        i.a(context, bn.MESSAGE_MEDIA_TYPE, this.a);
        i.a(context, bn.NUM_OF_WEB_URLS_IN_TEXT_MESSAGE, this.e);
        i.a(context, bn.MESSAGE_IS_INTERNATIONAL, this.f);
        i.a(context, bn.MESSAGE_IS_OFFLINE, this.g);
        if (this.d != null) {
            i.a(context, a.MESSAGE_RECEIVE_T0, this.d);
        }
        if (this.b != null) {
            i.a(context, a.MESSAGE_RECEIVE_T1, this.b);
        }
        i.a(context, bn.EVENT);
    }
}
