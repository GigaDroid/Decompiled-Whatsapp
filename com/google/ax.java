package com.google;

import java.util.UUID;

final class ax extends aX {
    ax() {
    }

    public void a(eE eEVar, Object obj) {
        a(eEVar, (UUID) obj);
    }

    public void a(eE eEVar, UUID uuid) {
        eEVar.b(uuid == null ? null : uuid.toString());
    }
}
