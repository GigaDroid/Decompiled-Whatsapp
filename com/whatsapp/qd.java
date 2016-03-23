package com.whatsapp;

class qd implements Runnable {
    final AlarmService a;

    qd(AlarmService alarmService) {
        this.a = alarmService;
    }

    public void run() {
        AlarmService.a(this.a, null);
    }
}
