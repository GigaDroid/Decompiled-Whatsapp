package com.whatsapp.messaging;

class ca implements Runnable {
    final MessageService a;

    ca(MessageService messageService) {
        this.a = messageService;
    }

    public void run() {
        MessageService.a(this.a, false);
    }
}
