package com.whatsapp.gdrive;

import java.util.List;

class p extends n {
    final List a;
    final GoogleDriveService b;

    public Boolean a() {
        return GoogleDriveService.m(this.b).a(this.a) ? Boolean.TRUE : null;
    }

    p(GoogleDriveService googleDriveService, List list) {
        this.b = googleDriveService;
        this.a = list;
    }

    public Object m756a() {
        return a();
    }
}
