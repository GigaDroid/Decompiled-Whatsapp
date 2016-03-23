package com.whatsapp.gdrive;

import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class b_ extends bs {
    private static final String[] z;
    final GoogleDriveActivity a;

    static {
        String[] strArr = new String[2];
        String str = "A\u0006u`eCOfjgO\u0014n}j\t\ril>R\u000bjl>U\u0007s|c\u000b\u0016fzx\t\u0001fgpC\u000eklw";
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
                        i3 = 38;
                        break;
                    case at.g /*1*/:
                        i3 = 98;
                        break;
                    case at.i /*2*/:
                        i3 = 7;
                        break;
                    case at.o /*3*/:
                        i3 = 9;
                        break;
                    default:
                        i3 = 19;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    i = 1;
                    strArr2 = strArr3;
                    str = "I\fb$gO\u000fb$`C\u0016ry>E\rimzR\u000bhg";
                    obj = null;
            }
        }
    }

    public String toString() {
        return z[1];
    }

    public boolean a() {
        if (!GoogleDriveActivity.x(this.a).get()) {
            return GoogleDriveService.v.a();
        }
        Log.i(z[0]);
        return false;
    }

    b_(GoogleDriveActivity googleDriveActivity) {
        this.a = googleDriveActivity;
    }
}
