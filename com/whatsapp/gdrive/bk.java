package com.whatsapp.gdrive;

import android.support.annotation.NonNull;
import java.io.File;

final class bk implements d9 {
    public Boolean a(@NonNull File file) {
        return Boolean.valueOf(GoogleDriveService.a(file));
    }

    public Object a(@NonNull Object obj) {
        return a((File) obj);
    }

    bk() {
    }
}
