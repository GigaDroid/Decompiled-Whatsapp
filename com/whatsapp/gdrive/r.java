package com.whatsapp.gdrive;

import com.whatsapp.arj;
import org.v;
import org.whispersystems.at;

class r extends n {
    private static final String z;
    final String a;
    final GoogleDriveService b;

    static {
        char[] toCharArray = "\u0014E +\n\rG&0\u0002\"I\"'\f\b[\u001c)\u0006\u000f@&6".toCharArray();
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
                    i2 = 43;
                    break;
                case at.i /*2*/:
                    i2 = 67;
                    break;
                case at.o /*3*/:
                    i2 = 68;
                    break;
                default:
                    i2 = arj.Theme_checkedTextViewStyle;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    r(GoogleDriveService googleDriveService, String str) {
        this.b = googleDriveService;
        this.a = str;
    }

    public Boolean a() {
        return GoogleDriveService.m(this.b).a(this.a, z, String.valueOf(true)) ? Boolean.TRUE : null;
    }

    public Object m758a() {
        return a();
    }
}
