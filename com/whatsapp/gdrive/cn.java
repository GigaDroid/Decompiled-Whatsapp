package com.whatsapp.gdrive;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.whatsapp.App;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class cn implements OnCancelListener {
    private static final String z;
    final GoogleDriveActivity a;

    static {
        char[] toCharArray = "Lxs\u0007&N1`\r$Bjh\u001a)\u0004\u007fs\u000b1_y!\u001b#Nn!\n5Hph\u00005O<u\u0001pBrr\u001a1Gp!)?D{m\u000bp{p`\u0017pxys\u00189Hyr@".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 43;
                    break;
                case at.g /*1*/:
                    i2 = 28;
                    break;
                case at.i /*2*/:
                    i2 = 1;
                    break;
                case at.o /*3*/:
                    i2 = 110;
                    break;
                default:
                    i2 = 80;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    cn(GoogleDriveActivity googleDriveActivity) {
        this.a = googleDriveActivity;
    }

    public void onCancel(DialogInterface dialogInterface) {
        Log.i(z);
        if (App.aK.F() > 0) {
            GoogleDriveActivity.g(this.a);
            if (!GoogleDriveService.c) {
                return;
            }
        }
        GoogleDriveActivity.b(this.a, true);
        GoogleDriveActivity.c(this.a, false);
    }
}
