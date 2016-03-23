package com.whatsapp.gdrive;

import android.os.Binder;

public final class dg extends Binder {
    final GoogleDriveService a;

    public final GoogleDriveService a() {
        return this.a;
    }

    public dg(GoogleDriveService googleDriveService) {
        this.a = googleDriveService;
    }
}
