package com.whatsapp.gdrive;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class c_ implements OnCancelListener {
    private static final String z;
    final bu a;

    static {
        char[] toCharArray = "%ra@n';rJl+`z]amqcZ57xr_y+zrKt'6fZ}06wL{.\u007f}L|bb|\tq,egHt.6TFw%zv\tH.wj\tK'de@{'e=".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 66;
                    break;
                case at.g /*1*/:
                    i2 = 22;
                    break;
                case at.i /*2*/:
                    i2 = 19;
                    break;
                case at.o /*3*/:
                    i2 = 41;
                    break;
                default:
                    i2 = 24;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void onCancel(DialogInterface dialogInterface) {
        Log.i(z);
        GoogleDriveActivity.n(this.a.a.b).open();
    }

    c_(bu buVar) {
        this.a = buVar;
    }
}
