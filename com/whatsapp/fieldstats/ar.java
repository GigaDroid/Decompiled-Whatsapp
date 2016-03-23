package com.whatsapp.fieldstats;

import android.content.Context;
import com.whatsapp.WAAppCompatActivity;

public final class ar extends av {
    public String a;
    public Double b;
    public Double c;
    public Double d;
    public Double e;
    public Double f;
    public Double g;
    public Double h;
    public Double i;
    public Double j;
    public String k;
    public Double l;
    public Double m;
    public Double n;
    public Double o;
    public Double p;
    public Double q;
    public Double r;
    public Double s;
    public Double t;
    public Double u;
    public Double v;

    void updateFields(Context context) {
        int i = b7.a;
        i.a(context, bn.EVENT, Integer.valueOf(cx.ANDROID_PERF_EVENT.getCode()));
        i.a(context, bn.ANDROID_PERF_NAME, this.a);
        i.a(context, bn.ANDROID_PERF_TAG_FIRST_INIT, this.e);
        i.a(context, bn.ANDROID_PERF_TAG_FROM_SAVED_STATE, this.m);
        i.a(context, bn.ANDROID_PERF_TAG_APP_INIT_IN_BACKGROUND, this.r);
        i.a(context, bn.ANDROID_PERF_TAG_REQUIRES_INFLATE, this.l);
        i.a(context, bn.ANDROID_PERF_TAG_ITEM_TYPE, this.k);
        i.a(context, bn.ANDROID_PERF_TAG_POSITION, this.t);
        i.a(context, bn.ANDROID_PERF_TAG_COUNT, this.s);
        i.a(context, bn.ANDROID_PERF_TAG_COUNT_2, this.j);
        i.a(context, bn.ANDROID_PERF_TAG_COUNT_3, this.d);
        if (this.f != null) {
            i.a(context, a.ANDROID_PERF_DURATION, this.f);
        }
        if (this.u != null) {
            i.a(context, a.ANDROID_PERF_PRE_CREATE, this.u);
        }
        if (this.v != null) {
            i.a(context, a.ANDROID_PERF_ON_CREATE, this.v);
        }
        if (this.n != null) {
            i.a(context, a.ANDROID_PERF_ON_START, this.n);
        }
        if (this.b != null) {
            i.a(context, a.ANDROID_PERF_ON_RESUME, this.b);
        }
        if (this.q != null) {
            i.a(context, a.ANDROID_PERF_ON_CREATE_VIEW, this.q);
        }
        if (this.c != null) {
            i.a(context, a.ANDROID_PERF_ON_ACTIVITY_CREATED, this.c);
        }
        if (this.i != null) {
            i.a(context, a.ANDROID_PERF_ON_LAYOUT, this.i);
        }
        if (this.o != null) {
            i.a(context, a.ANDROID_PERF_INFLATE, this.o);
        }
        if (this.h != null) {
            i.a(context, a.ANDROID_PERF_FILL, this.h);
        }
        if (this.g != null) {
            i.a(context, a.ANDROID_PERF_REFRESH, this.g);
        }
        if (this.p != null) {
            i.a(context, a.WEIGHT, this.p);
        }
        i.a(context, bn.EVENT);
        if (WAAppCompatActivity.c != 0) {
            b7.a = i + 1;
        }
    }
}
