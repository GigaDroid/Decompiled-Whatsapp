package com.whatsapp;

import java.io.File;
import java.util.Comparator;

final class a9n implements Comparator {
    public int compare(Object obj, Object obj2) {
        return a((File) obj, (File) obj2);
    }

    a9n() {
    }

    public int a(File file, File file2) {
        long lastModified = file.lastModified();
        long lastModified2 = file2.lastModified();
        if (lastModified > lastModified2) {
            return -1;
        }
        return lastModified == lastModified2 ? 0 : 1;
    }
}
