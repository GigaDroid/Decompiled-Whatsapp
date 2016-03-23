package com.whatsapp.gdrive;

import java.io.File;
import org.v;
import org.whispersystems.at;

class i extends g {
    private static final String z;
    final boolean a;
    final String b;
    final File c;
    final String d;
    final GoogleDriveService e;

    static {
        char[] toCharArray = "\u0011#\u0019*CzP\u0019*F\u000f ".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 74;
                    break;
                case at.g /*1*/:
                    i2 = 125;
                    break;
                case at.i /*2*/:
                    i2 = 69;
                    break;
                case at.o /*3*/:
                    i2 = 82;
                    break;
                default:
                    i2 = 113;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    i(GoogleDriveService googleDriveService, boolean z, String str, String str2, File file) {
        this.e = googleDriveService;
        this.a = z;
        this.b = str;
        this.d = str2;
        this.c = file;
    }

    public fs a() {
        er bpVar = new bp(this);
        return GoogleDriveService.m(this.e).a(this.d, this.c.getAbsolutePath(), this.b.replaceAll(z, ""), GoogleDriveService.g(this.e), bpVar, null);
    }

    public Object m751a() {
        return a();
    }
}
