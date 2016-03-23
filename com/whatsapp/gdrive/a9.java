package com.whatsapp.gdrive;

class a9 extends az {
    final GoogleDriveService a;
    final String b;

    public Object m744a() {
        return a();
    }

    public Boolean a() {
        return GoogleDriveService.m(this.a).d(this.b) ? Boolean.TRUE : null;
    }

    a9(GoogleDriveService googleDriveService, String str) {
        this.a = googleDriveService;
        this.b = str;
    }
}
