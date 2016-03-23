package com.whatsapp;

import java.io.File;
import java.text.Collator;
import java.util.Comparator;

final class aai implements Comparator {
    public int a(File file, File file2) {
        Collator instance = Collator.getInstance();
        instance.setStrength(0);
        instance.setDecomposition(1);
        return instance.compare(file.getName(), file2.getName());
    }

    public int compare(Object obj, Object obj2) {
        return a((File) obj, (File) obj2);
    }

    aai() {
    }
}
