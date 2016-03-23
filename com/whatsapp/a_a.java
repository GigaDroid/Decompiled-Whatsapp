package com.whatsapp;

import java.io.File;
import java.util.Comparator;

final class a_a implements Comparator {
    public int compare(Object obj, Object obj2) {
        return a((File) obj, (File) obj2);
    }

    public int a(File file, File file2) {
        return (int) (file2.lastModified() - file.lastModified());
    }

    a_a() {
    }
}
