package com.google;

import java.net.URI;

final class a5 extends aX {
    public void a(eE eEVar, URI uri) {
        eEVar.b(uri == null ? null : uri.toASCIIString());
    }

    public void a(eE eEVar, Object obj) {
        a(eEVar, (URI) obj);
    }

    a5() {
    }
}
