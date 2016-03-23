package com.whatsapp.gdrive;

class cx implements Runnable {
    final ds a;

    cx(ds dsVar) {
        this.a = dsVar;
    }

    public void run() {
        SettingsGoogleDrive.k(this.a.a).b(SettingsGoogleDrive.s(this.a.a));
    }
}
