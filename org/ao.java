package org;

import com.whatsapp.proto.Wa20.HandshakeMessage.ServerHello;

class ao extends Exception {
    private final ServerHello a;

    public ao(ServerHello serverHello) {
        this.a = serverHello;
    }

    public ServerHello a() {
        return this.a;
    }
}
