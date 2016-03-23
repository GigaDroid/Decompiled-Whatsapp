package com.whatsapp.wallpaper;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import android.provider.Settings.Secure;
import android.provider.Settings.SettingNotFoundException;
import com.whatsapp.App;
import org.v;
import org.whispersystems.at;

class c implements OnClickListener {
    private static final String[] z;
    final WallpaperPicker a;

    static {
        String[] strArr = new String[5];
        String str = "4\u001dGXFz_\\F\f&_\\X\u0018'\u001fTRC%M^Y\u0011{\u0007UW\b&\u0011MFR\"\u0011QZ\f4\u0000XD";
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
                        i3 = 85;
                        break;
                    case at.g /*1*/:
                        i3 = 112;
                        break;
                    case at.i /*2*/:
                        i3 = 61;
                        break;
                    case at.o /*3*/:
                        i3 = 54;
                        break;
                    default:
                        i3 = 124;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "8\u0011O]\u0019!J\u0012\u0019\u00180\u0004\\_\u0010&OTRA6\u001fP\u0018\u000b=\u0011IE\u001d%\u0000\u0013A\u001d9\u001cMW\f0\u0002";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "<\u001eNB\u001d9\u001cbX\u0013;/PW\u000e>\u0015Ii\u001d%\u0000N";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "=\u0004IF\u000fo_\u0012A\u000b\"^J^\u001d!\u0003\\F\f{\u0013R[S4\u001eYD\u0013<\u0014\u0012a\u00144\u0004Nw\f%'\\Z\u0010%\u0011MS\u000e{\u0011M]";
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "4\u001eYD\u0013<\u0014\u0013_\u0012!\u0015SBR4\u0013I_\u0013;^k\u007f9\u0002";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Uri uri = null;
        if (App.j == 2) {
            uri = Uri.parse(z[0]);
        } else if (App.j == 0) {
            uri = Uri.parse(z[2]);
        } else {
            try {
                int i2 = Secure.getInt(App.at, z[3]);
                uri = Uri.parse(z[4]);
                if (i2 != 1) {
                    this.a.removeDialog(1);
                    this.a.showDialog(2);
                    return;
                }
            } catch (SettingNotFoundException e) {
            }
        }
        this.a.startActivity(new Intent(z[1], uri));
        this.a.removeDialog(1);
        this.a.finish();
    }

    c(WallpaperPicker wallpaperPicker) {
        this.a = wallpaperPicker;
    }
}
