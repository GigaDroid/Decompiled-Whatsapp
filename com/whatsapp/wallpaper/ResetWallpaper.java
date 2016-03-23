package com.whatsapp.wallpaper;

import android.app.Activity;
import com.whatsapp.arj;
import org.v;
import org.whispersystems.at;

public class ResetWallpaper extends Activity {
    private static final String[] z;

    static {
        String[] strArr = new String[3];
        String str = "$\b:\br>\u001e\u0011";
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
                        i3 = 77;
                        break;
                    case at.g /*1*/:
                        i3 = 123;
                        break;
                    case at.i /*2*/:
                        i3 = arj.Theme_buttonStyleSmall;
                        break;
                    case at.o /*3*/:
                        i3 = 122;
                        break;
                    default:
                        i3 = 23;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    strArr2 = strArr3;
                    str = ".\u0014\bT`%\u001a\u0011\tv=\u000bK\u0013y9\u001e\u000b\u000e9,\u0018\u0011\u0013x#U7?D\b/:-V\u000175;G\b)";
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "$\b:\u001er+\u001a\u0010\u0016c";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r5) {
        /*
        r4 = this;
        r3 = 1;
        super.onCreate(r5);
        r0 = new android.content.Intent;
        r0.<init>();
        r1 = z;
        r2 = 2;
        r1 = r1[r2];
        r2 = r4.getIntent();
        r2 = r2.getAction();
        r1 = r1.equals(r2);
        if (r1 == 0) goto L_0x0028;
    L_0x001c:
        r1 = z;
        r2 = 0;
        r1 = r1[r2];
        r0.putExtra(r1, r3);
        r1 = com.whatsapp.wallpaper.CropImage.c;
        if (r1 == 0) goto L_0x002f;
    L_0x0028:
        r1 = z;
        r1 = r1[r3];
        r0.putExtra(r1, r3);
    L_0x002f:
        r1 = -1;
        r4.setResult(r1, r0);
        r4.finish();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wallpaper.ResetWallpaper.onCreate(android.os.Bundle):void");
    }
}
