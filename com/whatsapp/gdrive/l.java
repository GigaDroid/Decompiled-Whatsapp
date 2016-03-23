package com.whatsapp.gdrive;

import java.io.File;

class l extends j {
    final fs a;
    final File b;
    final GoogleDriveService c;

    public Object m753a() {
        return a();
    }

    public Boolean a() {
        return GoogleDriveService.m(this.c).a(this.b, this.a, new d8(this)) ? Boolean.TRUE : null;
    }

    l(GoogleDriveService googleDriveService, fs fsVar, File file) {
        this.c = googleDriveService;
        this.a = fsVar;
        this.b = file;
    }
}
