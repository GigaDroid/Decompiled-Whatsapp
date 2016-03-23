package com.whatsapp.gdrive;

import org.v;
import org.whispersystems.at;

class br extends bs {
    private static final String z;
    final GoogleDriveService a;

    static {
        char[] toCharArray = "Ks]\u0006Z\u000bd\\\u001cOId\\BXIx]\u0006OOyW".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 38;
                    break;
                case at.g /*1*/:
                    i2 = 22;
                    break;
                case at.i /*2*/:
                    i2 = 57;
                    break;
                case at.o /*3*/:
                    i2 = 111;
                    break;
                default:
                    i2 = 59;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public boolean a() {
        return GoogleDriveService.R() && GoogleDriveService.s(this.a) && GoogleDriveService.R();
    }

    br(GoogleDriveService googleDriveService) {
        this.a = googleDriveService;
    }

    public String toString() {
        return z;
    }
}
