package com.whatsapp.gdrive;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class ag implements OnCancelListener {
    private static final String z;
    final ed a;

    static {
        char[] toCharArray = "\blg_'\u0015n`\u0006)\u001f{z]+TncXc\u000egr]/\u0012erI\"\u001e$rE*V|`N<VmvH\"\u0012gvOc\u0012g`_/\u0017e".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 123;
                    break;
                case at.g /*1*/:
                    i2 = 9;
                    break;
                case at.i /*2*/:
                    i2 = 19;
                    break;
                case at.o /*3*/:
                    i2 = 43;
                    break;
                default:
                    i2 = 78;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    ag(ed edVar) {
        this.a = edVar;
    }

    public void onCancel(DialogInterface dialogInterface) {
        Log.i(z);
        SettingsGoogleDrive.t(this.a.a.a).open();
    }
}
