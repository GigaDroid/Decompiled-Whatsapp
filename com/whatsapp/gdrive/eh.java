package com.whatsapp.gdrive;

class eh implements Runnable {
    final SettingsGoogleDrive a;
    final String b;

    public void run() {
        SettingsGoogleDrive.a(this.a, this.b);
    }

    eh(SettingsGoogleDrive settingsGoogleDrive, String str) {
        this.a = settingsGoogleDrive;
        this.b = str;
    }
}
