package com.whatsapp.gallerypicker;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import org.v;
import org.whispersystems.at;

class n implements OnMenuItemClickListener {
    private static final String[] z;
    final Intent a;
    final ResolveInfo b;
    final GalleryPicker c;

    static {
        String[] strArr = new String[2];
        String str = "-]o\u001cW8E";
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
                        i3 = 74;
                        break;
                    case at.g /*1*/:
                        i3 = 60;
                        break;
                    case at.i /*2*/:
                        i3 = 3;
                        break;
                    case at.o /*3*/:
                        i3 = 112;
                        break;
                    default:
                        i3 = 50;
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
                    str = ")Sn^E\"]w\u0003S:L\\\u0000@/Zf\u0002W$_f\u0003";
                    obj = null;
            }
        }
    }

    n(GalleryPicker galleryPicker, ResolveInfo resolveInfo, Intent intent) {
        this.c = galleryPicker;
        this.b = resolveInfo;
        this.a = intent;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        this.c.getSharedPreferences(z[1], 0).edit().putString(z[0] + GalleryPicker.b(this.c), this.b.activityInfo.packageName + "_" + this.b.activityInfo.name).commit();
        this.a.setComponent(new ComponentName(this.b.activityInfo.packageName, this.b.activityInfo.name));
        this.c.startActivityForResult(this.a, 1);
        return false;
    }
}
