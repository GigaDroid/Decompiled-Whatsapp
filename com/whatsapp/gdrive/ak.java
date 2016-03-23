package com.whatsapp.gdrive;

import com.whatsapp.azf;
import java.io.File;
import java.util.concurrent.atomic.AtomicReference;

class ak extends a3 {
    final AtomicReference a;
    final GoogleDriveService b;

    ak(GoogleDriveService googleDriveService, AtomicReference atomicReference) {
        this.b = googleDriveService;
        this.a = atomicReference;
    }

    public Object m748a() {
        return a();
    }

    public Boolean a() {
        this.a.set(azf.c());
        return ((File) this.a.get()).exists() ? Boolean.valueOf(true) : null;
    }
}
