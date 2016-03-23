package com.google;

import java.io.IOException;

class gs extends gH {
    final bb b;

    gs(bb bbVar) {
        this.b = bbVar;
    }

    public Object parsePartialFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    public bb a(ad adVar, h hVar) {
        cc a = bb.a(bb.b(this.b));
        try {
            a.mergeFrom(adVar, hVar);
            return a.c();
        } catch (fN e) {
            throw e.a(a.c());
        } catch (IOException e2) {
            throw new fN(e2.getMessage()).a(a.c());
        }
    }
}
