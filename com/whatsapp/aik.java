package com.whatsapp;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;
import c;
import org.v;
import org.whispersystems.at;

class aik implements OnClickListener {
    private static final String[] z;
    final ViewSharedContactActivity a;

    static {
        String[] strArr = new String[2];
        String str = "\\\u0004>O=T\u000etT<I\u000f4I|\\\t.T=SD\ft\u0017j";
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
                        i3 = 61;
                        break;
                    case at.g /*1*/:
                        i3 = arj.Theme_ratingBarStyle;
                        break;
                    case at.i /*2*/:
                        i3 = 90;
                        break;
                    case at.o /*3*/:
                        i3 = 61;
                        break;
                    default:
                        i3 = 82;
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
                    str = "U\u001e.M!\u0007EuP3M\u0019tZ=R\r6X|^\u00057\u0012?\\\u001a)\u0002#\u0000";
                    obj = null;
            }
        }
    }

    aik(ViewSharedContactActivity viewSharedContactActivity) {
        this.a = viewSharedContactActivity;
    }

    public void onClick(View view) {
        if (ViewSharedContactActivity.b(this.a)) {
            ViewSharedContactActivity.a(this.a, view);
            if (!DialogToastActivity.f) {
                return;
            }
        }
        this.a.startActivity(new Intent(z[0], Uri.parse(z[1] + ((c) view.getTag()).e)));
    }
}
