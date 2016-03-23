package com.whatsapp.fieldstats;

import android.content.Context;

public final class bo extends av {
    public Double a;
    public Double b;
    public Double c;
    public Double d;
    public String e;
    public Double f;
    public String g;
    public Double h;
    public Double i;

    void updateFields(Context context) {
        i.a(context, bn.EVENT, Integer.valueOf(cx.PLACES_API_QUERY.getCode()));
        i.a(context, bn.PLACES_API_SOURCE, this.b);
        i.a(context, bn.PLACES_API_SOURCE_DEFAULT, this.c);
        i.a(context, bn.PLACES_API_RESPONSE, this.d);
        i.a(context, bn.PLACES_API_FAILURE_DESCRIPTION, this.g);
        i.a(context, bn.PLACES_API_REQUEST_INDEX, this.i);
        i.a(context, bn.PLACES_API_CACHED, this.f);
        i.a(context, bn.PLACES_API_QUERY_STRING, this.e);
        if (this.a != null) {
            i.a(context, a.PLACES_API_PLACES_COUNT, this.a);
        }
        if (this.h != null) {
            i.a(context, a.PLACES_API_RESPONSE_T, this.h);
        }
        i.a(context, bn.EVENT);
    }
}
