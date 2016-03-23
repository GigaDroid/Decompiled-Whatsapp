package com.whatsapp;

import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;
import org.v;
import org.whispersystems.at;

class c3 implements OnClickListener {
    private static final String[] z;
    final QuickContactActivity a;

    static {
        String[] strArr = new String[2];
        String str = "/T8j{f";
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
                        i3 = 57;
                        break;
                    case at.i /*2*/:
                        i3 = 75;
                        break;
                    case at.o /*3*/:
                        i3 = 30;
                        break;
                    default:
                        i3 = 20;
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
                    str = "4M?ngf\u0016di|=M8\u007fd,\u0017(qys]'1";
                    obj = null;
            }
        }
    }

    public void onClick(View view) {
        App.a(this.a, Uri.parse(z[0] + QuickContactActivity.a(this.a).l.a()), this.a.getString(2131232144, new Object[]{z[1]}));
        QuickContactActivity.a(this.a, false);
    }

    c3(QuickContactActivity quickContactActivity) {
        this.a = quickContactActivity;
    }
}
