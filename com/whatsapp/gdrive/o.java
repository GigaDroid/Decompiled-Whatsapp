package com.whatsapp.gdrive;

import org.v;
import org.whispersystems.at;

class o extends n {
    private static final String z;
    final String a;
    final fs b;
    final GoogleDriveService c;

    static {
        char[] toCharArray = "\u001bF\f&\u0006\u0019}\u0018&\u001c\u0019}\u0013.\u0000#K\u001a".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 124;
                    break;
                case at.g /*1*/:
                    i2 = 34;
                    break;
                case at.i /*2*/:
                    i2 = 126;
                    break;
                case at.o /*3*/:
                    i2 = 79;
                    break;
                default:
                    i2 = 112;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    o(GoogleDriveService googleDriveService, String str, fs fsVar) {
        this.c = googleDriveService;
        this.a = str;
        this.b = fsVar;
    }

    public Object m757a() {
        return a();
    }

    public Boolean a() {
        if (GoogleDriveService.m(this.c).a(this.a, z, this.b.g())) {
            return Boolean.TRUE;
        }
        return null;
    }
}
