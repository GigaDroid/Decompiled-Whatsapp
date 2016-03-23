package com.whatsapp.gdrive;

import org.v;
import org.whispersystems.at;

class x extends t {
    private static final String z;
    final GoogleDriveService a;

    static {
        char[] toCharArray = "\u0010U\u000ei*\u001fQ\u001bD1".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 113;
                    break;
                case at.g /*1*/:
                    i2 = 37;
                    break;
                case at.i /*2*/:
                    i2 = 126;
                    break;
                case at.o /*3*/:
                    i2 = 42;
                    break;
                default:
                    i2 = 69;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public fs a() {
        return GoogleDriveService.m(this.a).a(GoogleDriveService.j(this.a), z);
    }

    public Object m763a() {
        return a();
    }

    x(GoogleDriveService googleDriveService) {
        this.a = googleDriveService;
    }
}
