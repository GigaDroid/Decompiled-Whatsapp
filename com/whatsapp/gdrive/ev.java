package com.whatsapp.gdrive;

import android.view.View.OnClickListener;
import org.v;
import org.whispersystems.at;

class ev implements Runnable {
    private static final String z;
    final OnClickListener a;
    final bf b;

    static {
        char[] toCharArray = "\u001d$\u0005:d\u0000&\u0002cj\n3\u00188hA2\u0014: \u0003$\u0002=l\t$^=e\u00016\\*h\u001a$\u0003#d\u0000 \u0005+".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 110;
                    break;
                case at.g /*1*/:
                    i2 = 65;
                    break;
                case at.i /*2*/:
                    i2 = 113;
                    break;
                case at.o /*3*/:
                    i2 = 78;
                    break;
                default:
                    i2 = 13;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    ev(bf bfVar, OnClickListener onClickListener) {
        this.b = bfVar;
        this.a = onClickListener;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
        r4 = this;
        r3 = 8;
        r2 = 0;
        r0 = z;
        com.whatsapp.util.Log.i(r0);
        r0 = r4.b;
        r0 = r0.c;
        r0 = com.whatsapp.gdrive.SettingsGoogleDrive.q(r0);
        r0.setVisibility(r3);
        r0 = r4.b;
        r0 = r0.c;
        r0 = com.whatsapp.gdrive.SettingsGoogleDrive.p(r0);
        r0.setVisibility(r2);
        r0 = r4.b;
        r0 = r0.c;
        r0 = com.whatsapp.gdrive.SettingsGoogleDrive.p(r0);
        r0.setIndeterminate(r2);
        r0 = r4.b;
        r0 = r0.c;
        r0 = com.whatsapp.gdrive.SettingsGoogleDrive.e(r0);
        r1 = r4.a;
        r0.setOnClickListener(r1);
        r0 = r4.a;
        if (r0 == 0) goto L_0x0049;
    L_0x003a:
        r0 = r4.b;
        r0 = r0.c;
        r0 = com.whatsapp.gdrive.SettingsGoogleDrive.e(r0);
        r0.setVisibility(r2);
        r0 = com.whatsapp.gdrive.GoogleDriveService.c;
        if (r0 == 0) goto L_0x0054;
    L_0x0049:
        r0 = r4.b;
        r0 = r0.c;
        r0 = com.whatsapp.gdrive.SettingsGoogleDrive.e(r0);
        r0.setVisibility(r3);
    L_0x0054:
        r0 = r4.b;
        r0 = r0.c;
        r0 = com.whatsapp.gdrive.SettingsGoogleDrive.u(r0);
        r0.setVisibility(r2);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gdrive.ev.run():void");
    }
}
