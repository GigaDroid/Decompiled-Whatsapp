package com.whatsapp.memory.dump;

import com.whatsapp.ui;
import java.io.File;
import java.util.Map;

class m implements ui {
    final MemoryDumpUploadService a;
    final File b;
    final File c;
    final File d;

    public void a(Map map, String str) {
        n.b();
    }

    m(MemoryDumpUploadService memoryDumpUploadService, File file, File file2, File file3) {
        this.a = memoryDumpUploadService;
        this.d = file;
        this.c = file2;
        this.b = file3;
    }

    public void a(long j) {
        this.d.delete();
        this.c.delete();
        this.b.delete();
    }
}
