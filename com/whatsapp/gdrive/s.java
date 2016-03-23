package com.whatsapp.gdrive;

import org.v;
import org.whispersystems.at;

class s extends n {
    private static final String z;
    final GoogleDriveService a;
    final String b;

    static {
        char[] toCharArray = "\u001e\\,Q:\u0007^*J2(P.]<\u0002B\u0010S6\u0005Y*L".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 119;
                    break;
                case at.g /*1*/:
                    i2 = 50;
                    break;
                case at.i /*2*/:
                    i2 = 79;
                    break;
                case at.o /*3*/:
                    i2 = 62;
                    break;
                default:
                    i2 = 87;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public Boolean a() {
        return GoogleDriveService.m(this.a).a(this.b, z, String.valueOf(false)) ? Boolean.TRUE : null;
    }

    public Object m759a() {
        return a();
    }

    s(GoogleDriveService googleDriveService, String str) {
        this.a = googleDriveService;
        this.b = str;
    }
}
