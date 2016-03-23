package com.whatsapp;

import java.util.TimerTask;

class ap extends TimerTask {
    final SettingsNetworkUsage a;

    ap(SettingsNetworkUsage settingsNetworkUsage) {
        this.a = settingsNetworkUsage;
    }

    public void run() {
        SettingsNetworkUsage.a(this.a).post(new t9(this));
    }
}
