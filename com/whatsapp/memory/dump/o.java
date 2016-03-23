package com.whatsapp.memory.dump;

import java.io.File;
import java.io.FilenameFilter;

class o implements FilenameFilter {
    final k a;

    o(k kVar) {
        this.a = kVar;
    }

    public boolean accept(File file, String str) {
        return k.a.matcher(str).matches();
    }
}
