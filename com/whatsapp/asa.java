package com.whatsapp;

class asa implements Runnable {
    final AlarmService a;

    asa(AlarmService alarmService) {
        this.a = alarmService;
    }

    public void run() {
        ContactChooserTargetService.a();
    }
}
