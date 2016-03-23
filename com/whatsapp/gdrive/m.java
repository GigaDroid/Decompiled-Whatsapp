package com.whatsapp.gdrive;

import java.io.File;

class m extends j {
    final GoogleDriveService a;
    final fs b;
    final File c;

    public Object m752a() {
        return a();
    }

    m(GoogleDriveService googleDriveService, File file, fs fsVar) {
        this.a = googleDriveService;
        this.c = file;
        this.b = fsVar;
    }

    public Boolean a() {
        if (GoogleDriveService.m(this.a).a(this.c, this.b, new c5(this))) {
            return Boolean.TRUE;
        }
        return null;
    }
}
