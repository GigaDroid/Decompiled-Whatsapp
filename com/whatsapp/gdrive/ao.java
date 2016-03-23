package com.whatsapp.gdrive;

import org.v;
import org.whispersystems.at;

class ao extends t {
    private static final String z;
    final String a;
    final GoogleDriveService b;

    static {
        char[] toCharArray = "\u001c\u001eW\u0001O\t\u000fa*B\u0019\u000bU".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 125;
                    break;
                case at.g /*1*/:
                    i2 = 110;
                    break;
                case at.i /*2*/:
                    i2 = 39;
                    break;
                case at.o /*3*/:
                    i2 = 69;
                    break;
                default:
                    i2 = 46;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public Object m749a() {
        return a();
    }

    ao(GoogleDriveService googleDriveService, String str) {
        this.b = googleDriveService;
        this.a = str;
    }

    public fs a() {
        return GoogleDriveService.m(this.b).c(this.a, z);
    }
}
