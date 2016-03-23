package com.whatsapp.gdrive;

import org.v;
import org.whispersystems.at;

class aw extends az {
    private static final String z;
    final String a;
    final fs b;
    final GoogleDriveService c;

    static {
        char[] toCharArray = "TG+q1AV\u001dZ<QR)".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 53;
                    break;
                case at.g /*1*/:
                    i2 = 55;
                    break;
                case at.i /*2*/:
                    i2 = 91;
                    break;
                case at.o /*3*/:
                    i2 = 53;
                    break;
                default:
                    i2 = 80;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    aw(GoogleDriveService googleDriveService, fs fsVar, String str) {
        this.c = googleDriveService;
        this.b = fsVar;
        this.a = str;
    }

    public Object m750a() {
        return a();
    }

    public Boolean a() {
        return GoogleDriveService.m(this.c).b(this.b.g(), this.a, z) ? Boolean.TRUE : null;
    }
}
