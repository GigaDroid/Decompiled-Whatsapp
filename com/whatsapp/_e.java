package com.whatsapp;

import java.io.File;
import java.io.FileFilter;
import org.v;
import org.whispersystems.at;

final class _e implements FileFilter {
    private static final String z;

    static {
        char[] toCharArray = "\u000ffN".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = arj.Theme_spinnerStyle;
                    break;
                case at.g /*1*/:
                    i2 = 22;
                    break;
                case at.i /*2*/:
                    i2 = 59;
                    break;
                case at.o /*3*/:
                    i2 = 16;
                    break;
                default:
                    i2 = 120;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    _e() {
    }

    public boolean accept(File file) {
        boolean z = awm.b;
        String name = file.getName();
        if (name.startsWith(z)) {
            int i = 3;
            while (i < name.length()) {
                if (name.charAt(i) >= '0' && name.charAt(i) <= '9') {
                    i++;
                    if (z) {
                        break;
                    }
                }
                return false;
            }
            return true;
        } else if (WAAppCompatActivity.c == 0) {
            return false;
        } else {
            awm.b = !z;
            return false;
        }
    }
}
