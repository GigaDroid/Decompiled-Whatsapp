package com.whatsapp.fieldstats;

import android.content.Context;

public final class a7 extends av {
    public Double a;
    public Double b;
    public Double c;
    public String d;
    public Double e;
    public Double f;
    public String g;
    public Double h;
    public Double i;
    public Double j;
    public Double k;

    void updateFields(Context context) {
        i.a(context, bn.EVENT, Integer.valueOf(cx.LOCATION_PICKER.getCode()));
        i.a(context, bn.LOCATION_PICKER_PLACES_SOURCE, this.a);
        i.a(context, bn.LOCATION_PICKER_PLACES_SOURCE_DEFAULT, this.k);
        i.a(context, bn.LOCATION_PICKER_RESULT_TYPE, this.f);
        i.a(context, bn.LOCATION_PICKER_PLACES_RESPONSE, this.b);
        i.a(context, bn.LOCATION_PICKER_FAILURE_DESCRIPTION, this.g);
        i.a(context, bn.LOCATION_PICKER_FULL_SCREEN, this.e);
        i.a(context, bn.LOCATION_PICKER_QUERY_STRING, this.d);
        if (this.j != null) {
            i.a(context, a.LOCATION_PICKER_REQUESTS_COUNT, this.j);
        }
        if (this.i != null) {
            i.a(context, a.LOCATION_PICKER_PLACES_COUNT, this.i);
        }
        if (this.h != null) {
            i.a(context, a.LOCATION_PICKER_SELECTED_PLACE_INDEX, this.h);
        }
        if (this.c != null) {
            i.a(context, a.LOCATION_PICKER_SPEND_T, this.c);
        }
        i.a(context, bn.EVENT);
    }
}
