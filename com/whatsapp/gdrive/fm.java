package com.whatsapp.gdrive;

import java.util.Comparator;

final class fm implements Comparator {
    public int a(fs fsVar, fs fsVar2) {
        return Long.signum(fsVar2.c() - fsVar.c());
    }

    fm() {
    }

    public int compare(Object obj, Object obj2) {
        return a((fs) obj, (fs) obj2);
    }
}
