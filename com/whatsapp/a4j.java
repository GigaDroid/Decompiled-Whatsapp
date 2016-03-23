package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;
import com.whatsapp.fieldstats.cd;
import g;
import org.v;
import org.whispersystems.at;

class a4j implements OnClickListener {
    private static final String z;
    final ViewSharedContactActivity a;
    final g b;

    static {
        char[] toCharArray = "Xb?\u001cDyeb\n\\h?\u007f\u000eX".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 24;
                    break;
                case at.g /*1*/:
                    i2 = 17;
                    break;
                case at.i /*2*/:
                    i2 = 17;
                    break;
                case at.o /*3*/:
                    i2 = arj.Theme_seekBarStyle;
                    break;
                default:
                    i2 = 44;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    a4j(ViewSharedContactActivity viewSharedContactActivity, g gVar) {
        this.a = viewSharedContactActivity;
        this.b = gVar;
    }

    public void onClick(View view) {
        l5 b = App.as.b(this.b.b + z);
        if (b != null) {
            App.a(b, this.a, cd.CONTACT_VCARD, true);
        }
    }
}
