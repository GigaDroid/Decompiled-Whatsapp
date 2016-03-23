package com.whatsapp.gdrive;

import java.util.List;

class y extends t {
    final GoogleDriveService a;
    final List b;

    public Object m764a() {
        return a();
    }

    public Boolean a() {
        return GoogleDriveService.m(this.a).a(this.b) ? Boolean.TRUE : null;
    }

    y(GoogleDriveService googleDriveService, List list) {
        this.a = googleDriveService;
        this.b = list;
    }
}
