package com.whatsapp;

import com.whatsapp.protocol.co;

class om implements x5 {
    final co a;
    final tw b;
    final MediaData c;
    Runnable d;

    public boolean a(int i) {
        this.c.progress = (long) i;
        tw.b(this.b).post(this.d);
        return false;
    }

    om(tw twVar, co coVar, MediaData mediaData) {
        this.b = twVar;
        this.a = coVar;
        this.c = mediaData;
        this.d = new pu(this);
    }
}
