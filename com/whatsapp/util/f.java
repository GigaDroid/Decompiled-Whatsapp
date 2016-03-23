package com.whatsapp.util;

import java.io.File;
import java.util.Comparator;

final class f implements Comparator {
    private f() {
    }

    f(a0 a0Var) {
        this();
    }

    public int a(File file, File file2) {
        if (file.lastModified() == file2.lastModified()) {
            return 0;
        }
        if (file.lastModified() < file2.lastModified()) {
            return -1;
        }
        return 1;
    }

    public int compare(Object obj, Object obj2) {
        return a((File) obj, (File) obj2);
    }
}
