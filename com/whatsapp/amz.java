package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class amz implements OnClickListener {
    private static final String[] z;
    final DeleteAccountConfirmation a;

    static {
        String[] strArr = new String[3];
        String str = "Sh!'\nR_(#\rXc";
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
                        i3 = 55;
                        break;
                    case at.g /*1*/:
                        i3 = 13;
                        break;
                    case at.i /*2*/:
                        i3 = 77;
                        break;
                    case at.o /*3*/:
                        i3 = 66;
                        break;
                    default:
                        i3 = 126;
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
                    str = "Sh!'\nRl.!\nTb#$\u0017E`b,\u0011\u001an\",\u0010Rn9+\b^y4";
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "Vi)+\n^b##\u0012tb /\u001bYy>";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    amz(DeleteAccountConfirmation deleteAccountConfirmation) {
        this.a = deleteAccountConfirmation;
    }

    public void onClick(View view) {
        if (App.Q()) {
            this.a.showDialog(1);
            DeleteAccountConfirmation.a(this.a).sendEmptyMessageDelayed(0, 60000);
            App.a(aqu.g(), aqu.c(), this.a.getIntent().getStringExtra(z[1]), this.a.getIntent().getIntExtra(z[0], -1));
            return;
        }
        Log.i(z[2]);
        this.a.showDialog(2);
    }
}
