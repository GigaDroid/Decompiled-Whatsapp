package com.whatsapp.gdrive;

import org.v;
import org.whispersystems.at;

class ai extends az {
    private static final String z;
    final GoogleDriveService a;

    static {
        char[] toCharArray = "o8\u0007U.z)1~#j-\u0005".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 14;
                    break;
                case at.g /*1*/:
                    i2 = 72;
                    break;
                case at.i /*2*/:
                    i2 = 119;
                    break;
                case at.o /*3*/:
                    i2 = 17;
                    break;
                default:
                    i2 = 79;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public Object m747a() {
        return a();
    }

    ai(GoogleDriveService googleDriveService) {
        this.a = googleDriveService;
    }

    public fs a() {
        return GoogleDriveService.m(this.a).a(GoogleDriveService.n(this.a), z);
    }
}
