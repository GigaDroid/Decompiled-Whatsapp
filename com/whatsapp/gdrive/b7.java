package com.whatsapp.gdrive;

import com.whatsapp.util.Log;
import com.whatsapp.util.ab;
import java.util.TimerTask;
import org.v;
import org.whispersystems.at;

class b7 extends TimerTask {
    private static final String[] z;
    final GoogleDriveActivity a;
    final ab b;

    static {
        String[] strArr = new String[2];
        String str = "\u0004O-zkGX;";
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
                        i3 = 41;
                        break;
                    case at.g /*1*/:
                        i3 = 60;
                        break;
                    case at.i /*2*/:
                        i3 = 72;
                        break;
                    case at.o /*3*/:
                        i3 = 25;
                        break;
                    default:
                        i3 = 4;
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
                    str = "NX:prL\u0011)zp@J!m}\u0006S&|)]U%|)ZY<lt\u0006R'm)OU&pwAY,4mG\u0011";
                    obj = null;
            }
        }
    }

    public void run() {
        Log.i(z[1] + (this.b.d() / 1000) + z[0]);
        this.a.runOnUiThread(new au(this));
    }

    b7(GoogleDriveActivity googleDriveActivity, ab abVar) {
        this.a = googleDriveActivity;
        this.b = abVar;
    }
}
