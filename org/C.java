package org;

import java.net.DatagramPacket;
import java.net.InetAddress;

public final class C extends B {
    private int h;

    public C() {
        this.h = 3;
    }

    public s a(InetAddress inetAddress) {
        return a(inetAddress, 123);
    }

    public s a(InetAddress inetAddress, int i) {
        boolean z = l.f;
        if (!b()) {
            a();
        }
        at qVar = new q();
        qVar.a(3);
        qVar.b(this.h);
        DatagramPacket b = qVar.b();
        b.setAddress(inetAddress);
        b.setPort(i);
        at qVar2 = new q();
        DatagramPacket b2 = qVar2.b();
        qVar.a(l.g());
        this.g.send(b);
        this.g.receive(b2);
        s sVar = new s(qVar2, System.currentTimeMillis(), false);
        if (z) {
            K.b++;
        }
        return sVar;
    }
}
