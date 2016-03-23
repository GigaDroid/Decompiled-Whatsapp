package com.whatsapp.gallerypicker;

import android.database.ContentObserver;
import android.os.Handler;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class aj extends ContentObserver {
    private static final String[] z;
    final GalleryPickerFragment a;

    static {
        String[] strArr = new String[2];
        String str = "_\u0010=JNJ\b!OHS\u0014#\t";
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
                        i3 = 56;
                        break;
                    case at.g /*1*/:
                        i3 = 113;
                        break;
                    case at.i /*2*/:
                        i3 = 81;
                        break;
                    case at.o /*3*/:
                        i3 = 38;
                        break;
                    default:
                        i3 = 43;
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
                    str = "\u0018\u001f>\u0006HW\u001f%CELQ#CXW\u001d'CY";
                    obj = null;
            }
        }
    }

    aj(GalleryPickerFragment galleryPickerFragment, Handler handler) {
        this.a = galleryPickerFragment;
        super(handler);
    }

    public void onChange(boolean z) {
        if (GalleryPickerFragment.g(this.a) != null) {
            GalleryPickerFragment.a(this.a, false, b3.a(GalleryPickerFragment.g(this.a)));
            if (MediaGalleryFragmentBase.e == 0) {
                return;
            }
        }
        Log.i(z[0] + GalleryPickerFragment.c(this.a) + z[1]);
    }
}
