package com.whatsapp;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;
import org.v;
import org.whispersystems.at;

class n5 implements OnClickListener {
    private static final String[] z;
    final DescribeProblemActivity a;

    static {
        String[] strArr = new String[2];
        String str = "X]P-LPW\u001a6MMVZ+\rXP@6LW\u001db\u0016fn";
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
                        i3 = 57;
                        break;
                    case at.g /*1*/:
                        i3 = 51;
                        break;
                    case at.i /*2*/:
                        i3 = 52;
                        break;
                    case at.o /*3*/:
                        i3 = 95;
                        break;
                    default:
                        i3 = 35;
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
                    str = "QG@/P\u0003\u001c\u001b(TN\u001dC7BM@U/S\u0017P[2\f_REp";
                    obj = null;
            }
        }
    }

    public void onClick(View view) {
        this.a.startActivity(new Intent(z[0], Uri.parse(z[1])));
    }

    n5(DescribeProblemActivity describeProblemActivity) {
        this.a = describeProblemActivity;
    }
}
