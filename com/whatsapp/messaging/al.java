package com.whatsapp.messaging;

import android.os.Handler.Callback;
import android.os.Message;

class al implements Callback {
    final MessageService a;

    public boolean handleMessage(Message message) {
        MessageService.a(this.a, message.arg1);
        MessageService.c(this.a, message.arg2 != 0);
        return true;
    }

    al(MessageService messageService) {
        this.a = messageService;
    }
}
