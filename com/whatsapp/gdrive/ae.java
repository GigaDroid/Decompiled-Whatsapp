package com.whatsapp.gdrive;

import com.whatsapp.arj;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class ae extends az {
    private static final String[] z;
    final String a;
    final String b;
    final GoogleDriveService c;
    final String d;
    final String e;
    final String f;

    static {
        String[] strArr = new String[4];
        String str = "b/\u001a\"B`f\u001b.Fs\"\u000b.\u001bf#\t%S`f\u0006>Yg.\u001akRd\"\u0004.P%?\u0007kF`%\t&Q%8\r([k/\t9M%)\t8Q%-\u0007'P`9H\"P?kM8\u0018%$\u0004/\u0014k*\u0005.\u000e%n\u001bg\u0014k.\u001fkZd&\rq\u0014 8";
        Object obj = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i = 0;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i2 = 0; length > i2; i2++) {
                int i3;
                char c = cArr[i2];
                switch (i2 % 5) {
                    case v.m /*0*/:
                        i3 = 5;
                        break;
                    case at.g /*1*/:
                        i3 = 75;
                        break;
                    case at.i /*2*/:
                        i3 = arj.Theme_editTextStyle;
                        break;
                    case at.o /*3*/:
                        i3 = 75;
                        break;
                    default:
                        i3 = 52;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "d;\u0018\u000fUq*.$Xa.\u001a";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "d;\u0018\b[k?\r%@";
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "b/\u001a\"B`f\u001b.Fs\"\u000b.\u001bf#\t%S`f\u0006>Yg.\u001akRd\"\u0004.P%?\u0007kF`%\t&Q%;\u001a\"Yd9\u0011kVd8\rkRj'\f.F%\"\fq\u0014 8Dk[i/H%Uh.Rk\u0011vgH%Qrk\u0006*Y`qHnG";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public Object m746a() {
        return a();
    }

    ae(GoogleDriveService googleDriveService, String str, String str2, String str3, String str4, String str5) {
        this.c = googleDriveService;
        this.d = str;
        this.a = str2;
        this.f = str3;
        this.b = str4;
        this.e = str5;
    }

    public Boolean a() {
        String f = GoogleDriveService.f(this.d);
        String g = GoogleDriveService.g(this.d);
        String g2 = GoogleDriveService.g(this.a);
        if (!GoogleDriveService.m(this.c).b(this.f, f, z[2])) {
            Log.e(String.format(z[1], new Object[]{this.f, this.e, f}));
            return null;
        } else if (this.b != null && GoogleDriveService.m(this.c).b(this.b, g, z[3])) {
            return Boolean.TRUE;
        } else {
            Log.e(String.format(z[0], new Object[]{this.b, g2, g}));
            return null;
        }
    }
}
