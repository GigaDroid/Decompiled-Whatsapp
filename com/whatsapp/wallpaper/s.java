package com.whatsapp.wallpaper;

import android.view.LayoutInflater;
import android.widget.BaseAdapter;
import org.v;
import org.whispersystems.at;

class s extends BaseAdapter {
    private static final String[] z;
    private LayoutInflater a;
    final WallpaperPicker b;

    static {
        String[] strArr = new String[2];
        String str = "Q\u00074$\r4\u0011#(\u0010p\u001c(,_`\u001d3&\u001dz\u0014/'_f\u00105\u0002\u001b)";
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
                        i3 = 20;
                        break;
                    case at.g /*1*/:
                        i3 = 117;
                        break;
                    case at.i /*2*/:
                        i3 = 70;
                        break;
                    case at.o /*3*/:
                        i3 = 75;
                        break;
                    default:
                        i3 = 127;
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
                    str = "4\u0013)9_c\u0014*'\u000fu\u0005#9_7";
                    obj = null;
            }
        }
    }

    public Object getItem(int i) {
        return Integer.valueOf(i);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
        /*
        r5 = this;
        r4 = 1;
        r3 = 0;
        r1 = com.whatsapp.wallpaper.CropImage.c;
        if (r7 != 0) goto L_0x0013;
    L_0x0006:
        r0 = r5.a;
        r2 = 2130903292; // 0x7f0300fc float:1.7413398E38 double:1.052806111E-314;
        r0 = r0.inflate(r2, r8, r3);
        r0 = (android.widget.ImageView) r0;
        if (r1 == 0) goto L_0x0060;
    L_0x0013:
        r7 = (android.widget.ImageView) r7;
    L_0x0015:
        r0 = r5.b;
        r0 = com.whatsapp.wallpaper.WallpaperPicker.c(r0);
        r0 = r0.get(r6);
        r0 = (java.lang.Integer) r0;
        r0 = r0.intValue();
        r2 = r5.b;
        r2 = r2.e;
        r2 = r2.getDrawable(r0);
        r7.setImageDrawable(r2);
        r2 = r7.getDrawable();
        if (r2 == 0) goto L_0x003b;
    L_0x0036:
        r2.setDither(r4);
        if (r1 == 0) goto L_0x005f;
    L_0x003b:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r0 = r1.append(r0);
        r1 = z;
        r1 = r1[r4];
        r0 = r0.append(r1);
        r0 = r0.append(r6);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
    L_0x005f:
        return r7;
    L_0x0060:
        r7 = r0;
        goto L_0x0015;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wallpaper.s.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    s(WallpaperPicker wallpaperPicker, WallpaperPicker wallpaperPicker2) {
        this.b = wallpaperPicker;
        this.a = wallpaperPicker2.getLayoutInflater();
    }

    public int getCount() {
        return WallpaperPicker.c(this.b).size();
    }

    public long getItemId(int i) {
        return (long) i;
    }
}
