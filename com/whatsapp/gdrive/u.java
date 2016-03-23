package com.whatsapp.gdrive;

import org.v;
import org.whispersystems.at;

class u extends t {
    private static final String z;
    final GoogleDriveActivity a;
    final String b;
    final bc c;

    static {
        char[] toCharArray = ":\r-\u000b\\/\u001c\u001b Q?\u0018/".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 91;
                    break;
                case at.g /*1*/:
                    i2 = 125;
                    break;
                case at.i /*2*/:
                    i2 = 93;
                    break;
                case at.o /*3*/:
                    i2 = 79;
                    break;
                default:
                    i2 = 61;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public Object m760a() {
        return a();
    }

    u(GoogleDriveActivity googleDriveActivity, bc bcVar, String str) {
        this.a = googleDriveActivity;
        this.c = bcVar;
        this.b = str;
    }

    public fs a() {
        return this.c.c(this.b, z);
    }
}
