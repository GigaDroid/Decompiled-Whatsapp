package com.whatsapp.gdrive;

import java.io.File;
import org.v;
import org.whispersystems.at;

class h extends g {
    private static final String z;
    final String a;
    final String b;
    final GoogleDriveService c;
    final File d;

    static {
        char[] toCharArray = "z0\u0010$<x\u000b\u0004$&x\u000b\u000f,:".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 29;
                    break;
                case at.g /*1*/:
                    i2 = 84;
                    break;
                case at.i /*2*/:
                    i2 = 98;
                    break;
                case at.o /*3*/:
                    i2 = 77;
                    break;
                default:
                    i2 = 74;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public Object m755a() {
        return a();
    }

    public fs a() {
        return GoogleDriveService.m(this.c).a(this.a, this.d.getAbsolutePath(), z, GoogleDriveService.g(this.c), null, this.b);
    }

    h(GoogleDriveService googleDriveService, String str, File file, String str2) {
        this.c = googleDriveService;
        this.a = str;
        this.d = file;
        this.b = str2;
    }
}
