package com.whatsapp.gdrive;

class dy implements Runnable {
    final SettingsGoogleDrive a;
    final String b;

    public void run() {
        SettingsGoogleDrive.b(this.a).setText(this.b);
        SettingsGoogleDrive.r(this.a);
    }

    dy(SettingsGoogleDrive settingsGoogleDrive, String str) {
        this.a = settingsGoogleDrive;
        this.b = str;
    }
}
