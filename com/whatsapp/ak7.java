package com.whatsapp;

import com.whatsapp.protocol.co;

class ak7 extends akc {
    final Broadcasts a;

    ak7(Broadcasts broadcasts) {
        this.a = broadcasts;
    }

    public void b(co coVar, int i) {
        if (coVar != null && coVar.x && coVar.k.a) {
            Broadcasts.a(this.a).notifyDataSetChanged();
        }
    }

    public void a(String str) {
        if (l5.f(str)) {
            Broadcasts.a(this.a).a();
        }
    }

    public void a(co coVar, int i) {
        if (coVar != null && coVar.x && coVar.k.a) {
            Broadcasts.a(this.a).a();
        }
    }
}
