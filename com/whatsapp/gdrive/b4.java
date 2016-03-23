package com.whatsapp.gdrive;

import org.v;
import org.whispersystems.at;

class b4 extends bs {
    private static final String z;
    final GoogleDriveService a;

    static {
        char[] toCharArray = "+U*uD9\u0019*q_-]=w^'".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 73;
                    break;
                case at.g /*1*/:
                    i2 = 52;
                    break;
                case at.i /*2*/:
                    i2 = 73;
                    break;
                case at.o /*3*/:
                    i2 = 30;
                    break;
                default:
                    i2 = 49;
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
        return GoogleDriveService.r() && GoogleDriveService.s(this.a) && GoogleDriveService.r();
    }

    b4(GoogleDriveService googleDriveService) {
        this.a = googleDriveService;
    }
}
