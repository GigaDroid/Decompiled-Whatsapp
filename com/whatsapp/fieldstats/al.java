package com.whatsapp.fieldstats;

import android.content.Context;

public final class al extends av {
    public Double a;
    public Double b;
    public Double c;
    public Double d;
    public Double e;
    public Double f;
    public String g;
    public Double h;
    public Double i;
    public Double j;
    public Double k;
    public Double l;
    public Double m;
    public Double n;
    public Double o;
    public Double p;
    public Double q;
    public Double r;
    public Double s;

    void updateFields(Context context) {
        i.a(context, bn.EVENT, Integer.valueOf(cx.CONTACT_US_SESSION.getCode()));
        i.a(context, bn.CONTACT_US_EXIT_STATE, this.m);
        i.a(context, bn.CONTACT_US_FAQ, this.d);
        i.a(context, bn.CONTACT_US_AUTOMATIC_EMAIL, this.l);
        i.a(context, bn.CONTACT_US_LOGS, this.q);
        i.a(context, bn.CONTACT_US_OUTAGE, this.k);
        i.a(context, bn.CONTACT_US_OUTAGE_EMAIL, this.i);
        i.a(context, bn.CONTACT_US_PROBLEM_DESCRIPTION, this.g);
        i.a(context, bn.SEARCH_FAQ_RESULTS_BEST_ID, this.j);
        i.a(context, bn.SEARCH_FAQ_RESULTS_BEST_ID_2, this.b);
        i.a(context, bn.SEARCH_FAQ_RESULTS_BEST_ID_3, this.n);
        if (this.a != null) {
            i.a(context, a.CONTACT_US_T, this.a);
        }
        if (this.p != null) {
            i.a(context, a.CONTACT_US_MENU_FAQ_T, this.p);
        }
        if (this.e != null) {
            i.a(context, a.SEARCH_FAQ_RESULTS_GENERATED_C, this.e);
        }
        if (this.c != null) {
            i.a(context, a.SEARCH_FAQ_RESULTS_READ_C, this.c);
        }
        if (this.r != null) {
            i.a(context, a.SEARCH_FAQ_RESULTS_BEST_READ_T, this.r);
        }
        if (this.f != null) {
            i.a(context, a.SEARCH_FAQ_RESULTS_BEST_READ_T_2, this.f);
        }
        if (this.s != null) {
            i.a(context, a.SEARCH_FAQ_RESULTS_BEST_READ_T_3, this.s);
        }
        if (this.o != null) {
            i.a(context, a.SEARCH_FAQ_RESULTS_READ_T, this.o);
        }
        if (this.h != null) {
            i.a(context, a.CONTACT_US_SCREENSHOT_C, this.h);
        }
        i.a(context, bn.EVENT);
    }
}
