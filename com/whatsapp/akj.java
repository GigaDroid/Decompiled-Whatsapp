package com.whatsapp;

import com.whatsapp.protocol.co;
import com.whatsapp.util.ax;

class akj extends akc {
    final BroadcastDetails a;

    public void b(co coVar, int i) {
        if (coVar != null && coVar.k.b.equals(BroadcastDetails.a(this.a).k.b) && ax.a(BroadcastDetails.d(this.a), coVar.k.c) && coVar.k.a) {
            BroadcastDetails.c(this.a).notifyDataSetChanged();
        }
    }

    akj(BroadcastDetails broadcastDetails) {
        this.a = broadcastDetails;
    }
}
