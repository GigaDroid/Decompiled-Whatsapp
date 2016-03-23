package com.whatsapp;

class rx implements Runnable {
    final AlarmService a;

    public void run() {
        AlarmService.a(this.a);
    }

    rx(AlarmService alarmService) {
        this.a = alarmService;
    }
}
