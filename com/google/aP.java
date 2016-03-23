package com.google;

import java.net.InetAddress;

final class aP extends aX {
    aP() {
    }

    public void a(eE eEVar, Object obj) {
        a(eEVar, (InetAddress) obj);
    }

    public void a(eE eEVar, InetAddress inetAddress) {
        eEVar.b(inetAddress == null ? null : inetAddress.getHostAddress());
    }
}
