package com.whatsapp.gdrive;

import org.v;
import org.whispersystems.at;

class bq extends bs {
    private static final String z;
    final GoogleDriveService a;

    static {
        char[] toCharArray = "#\razl2\u0014m#n?\u0016lgy9\u0017f".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 80;
                    break;
                case at.g /*1*/:
                    i2 = 120;
                    break;
                case at.i /*2*/:
                    i2 = 8;
                    break;
                case at.o /*3*/:
                    i2 = 14;
                    break;
                default:
                    i2 = 13;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public String toString() {
        return z;
    }

    public boolean a() {
        return GoogleDriveService.s(this.a);
    }

    bq(GoogleDriveService googleDriveService) {
        this.a = googleDriveService;
    }
}
