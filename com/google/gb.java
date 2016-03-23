package com.google;

import java.io.IOException;

public final class gb extends gH {
    public eV a(ad adVar, h hVar) {
        c6 g = eV.g();
        try {
            g.a(adVar);
            return g.c();
        } catch (fN e) {
            throw e.a(g.c());
        } catch (IOException e2) {
            throw new fN(e2.getMessage()).a(g.c());
        }
    }

    public Object parsePartialFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }
}
