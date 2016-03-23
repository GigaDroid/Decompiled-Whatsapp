package com.whatsapp;

import java.io.File;
import java.util.Comparator;

final class av6 implements Comparator {
    public int compare(Object obj, Object obj2) {
        return a((File) obj, (File) obj2);
    }

    public int a(File file, File file2) {
        return Long.valueOf(file.lastModified()).compareTo(Long.valueOf(file2.lastModified()));
    }

    av6() {
    }
}
