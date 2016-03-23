package com.whatsapp.messaging;

import android.os.Binder;

public final class n extends Binder {
    final MessageService a;

    public final MessageService a() {
        return this.a;
    }

    public n(MessageService messageService) {
        this.a = messageService;
    }
}
