package com.whatsapp;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import c;
import org.v;
import org.whispersystems.at;

class als implements OnClickListener {
    private static final String[] z;
    final ViewSharedContactActivity a;

    static {
        String[] strArr = new String[3];
        String str = "=u(\u0002H5\u007fb\u0019I(~\"\u0004\t=x8\u0019H25\u001f5i\u0018";
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
                        i3 = 92;
                        break;
                    case at.g /*1*/:
                        i3 = 27;
                        break;
                    case at.i /*2*/:
                        i3 = 76;
                        break;
                    case at.o /*3*/:
                        i3 = 112;
                        break;
                    default:
                        i3 = 39;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    strArr2 = strArr3;
                    str = "=u(\u0002H5\u007fb\u0019I(~\"\u0004\t9c8\u0002Fr^\u00011n\u0010";
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = ",w-\u0019Iso)\bS";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void onClick(View view) {
        if (ViewSharedContactActivity.b(this.a)) {
            ViewSharedContactActivity.a(this.a, view);
            if (!DialogToastActivity.f) {
                return;
            }
        }
        String str = ((c) view.getTag()).e;
        Intent intent = new Intent(z[0]);
        intent.setType(z[1]);
        intent.putExtra(z[2], new String[]{str});
        this.a.startActivity(intent);
    }

    als(ViewSharedContactActivity viewSharedContactActivity) {
        this.a = viewSharedContactActivity;
    }
}
