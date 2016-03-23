package com.whatsapp.gallerypicker;

import android.database.ContentObserver;
import android.os.Handler;
import com.whatsapp.arj;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class ao extends ContentObserver {
    private static final String z;
    final MediaGalleryFragmentBase a;

    static {
        char[] toCharArray = "9P&h\u00063T.m\u0002&L$s\u00063X'o\u00136T1dH;[!i\u0006:R'!".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 84;
                    break;
                case at.g /*1*/:
                    i2 = 53;
                    break;
                case at.i /*2*/:
                    i2 = 66;
                    break;
                case at.o /*3*/:
                    i2 = 1;
                    break;
                default:
                    i2 = arj.Theme_checkedTextViewStyle;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public boolean deliverSelfNotifications() {
        return true;
    }

    public void onChange(boolean z) {
        Log.i(z + z);
        if (this.a.f != null) {
            if (!z) {
                this.a.f.d();
            }
            this.a.p = this.a.f.e();
        }
        this.a.k.notifyDataSetChanged();
    }

    ao(MediaGalleryFragmentBase mediaGalleryFragmentBase, Handler handler) {
        this.a = mediaGalleryFragmentBase;
        super(handler);
    }
}
