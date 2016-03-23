package com.whatsapp.gdrive;

class ce implements Runnable {
    final a8 a;

    ce(a8 a8Var) {
        this.a = a8Var;
    }

    public void run() {
        boolean z = GoogleDriveService.c;
        String string = this.a.a.c.getString(2131231944);
        String string2 = this.a.a.c.getString(2131231943);
        String string3 = this.a.a.c.getString(2131231961);
        if (SettingsGoogleDrive.u(this.a.a.c).getText().equals(string)) {
            this.a.a.j(0, 0);
            if (!z) {
                return;
            }
        }
        if (SettingsGoogleDrive.u(this.a.a.c).getText().equals(string2)) {
            this.a.a.j(0, 0);
            if (!z) {
                return;
            }
        }
        if (SettingsGoogleDrive.u(this.a.a.c).getText().equals(string3)) {
            this.a.a.d(0, 0);
            if (!z) {
                return;
            }
        }
        if (SettingsGoogleDrive.u(this.a.a.c).getText().equals(string3)) {
            this.a.a.d(0, 0);
        }
    }
}
