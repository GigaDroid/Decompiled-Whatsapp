package com.whatsapp.gdrive;

import android.view.View;
import android.view.View.OnClickListener;
import com.whatsapp.App;
import com.whatsapp.util.Log;
import com.whatsapp.util.bq;
import org.v;
import org.whispersystems.at;

class a7 implements OnClickListener {
    private static final String[] z;
    final int a;
    final SettingsGoogleDrive b;

    static {
        String[] strArr = new String[2];
        String str = ">]\u001a!O#_\u001dxA)J\u0007#Cb\\\u0007&V!Y\u0017xK(\\\u00074\u000b?]\u001d!I?]C0T?W\u001cz";
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
                        i3 = 56;
                        break;
                    case at.i /*2*/:
                        i3 = 110;
                        break;
                    case at.o /*3*/:
                        i3 = 85;
                        break;
                    default:
                        i3 = 38;
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
                    str = "m^\u001c0C\u001eH\u000f6Cw";
                    obj = null;
            }
        }
    }

    a7(SettingsGoogleDrive settingsGoogleDrive, int i) {
        this.b = settingsGoogleDrive;
        this.a = i;
    }

    public void onClick(View view) {
        long T = App.T();
        Log.i(z[0] + this.a + z[1] + T);
        if (T > 0) {
            bq.a(new e_(this));
        }
    }
}
