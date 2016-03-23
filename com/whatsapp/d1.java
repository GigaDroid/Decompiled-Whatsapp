package com.whatsapp;

import com.whatsapp.util.a1;
import com.whatsapp.util.ag;
import java.io.File;
import java.io.FileFilter;

class d1 implements FileFilter {
    final an6 a;

    public boolean accept(File file) {
        String f = ag.f(a1.b(file.getAbsolutePath()));
        return f != null && a59.b(f);
    }

    d1(an6 com_whatsapp_an6) {
        this.a = com_whatsapp_an6;
    }
}
