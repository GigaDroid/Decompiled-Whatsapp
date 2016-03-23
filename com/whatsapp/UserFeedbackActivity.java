package com.whatsapp;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AlertDialog.Builder;
import com.whatsapp.util.bq;
import org.v;
import org.whispersystems.at;

public class UserFeedbackActivity extends DialogToastActivity {
    private static final String[] z;

    static {
        String[] strArr = new String[3];
        String str = "`T(WHkZ1\n^sKk=ZpX7\u0010]fk7\u0016]o^(8\\wR3\u0010Kz\u00151\u0000Of";
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
                        i3 = 3;
                        break;
                    case at.g /*1*/:
                        i3 = 59;
                        break;
                    case at.i /*2*/:
                        i3 = 69;
                        break;
                    case at.o /*3*/:
                        i3 = 121;
                        break;
                    default:
                        i3 = 63;
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
                    str = "`T(WHkZ1\n^sKk=ZpX7\u0010]fk7\u0016]o^(8\\wR3\u0010Kz\u0015#\u000bPn";
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "`T(WHkZ1\n^sKk=ZpX7\u0010]fk7\u0016]o^(8\\wR3\u0010Kz\u00156\u001cMu^7\nKbO0\n";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public static void a(Context context, String str, String str2, Integer num) {
        Intent intent = new Intent(context, DescribeProblemActivity.class);
        intent.putExtra(z[2], str);
        intent.putExtra(z[1], str2);
        if (num != null) {
            intent.putExtra(z[0], num);
        }
        context.startActivity(intent);
    }

    protected void e(String str) {
        bq.a(new m5(this, this, false, false, str), new String[0]);
    }

    protected Dialog onCreateDialog(int i) {
        switch (i) {
            case 122:
                Dialog progressDialog = new ProgressDialog(this);
                progressDialog.setMessage(getString(2131231749));
                progressDialog.setIndeterminate(true);
                progressDialog.setCancelable(false);
                return progressDialog;
            case 123:
                return new Builder(this).setMessage(2131231979).setPositiveButton(2131231582, new am2(this)).create();
            default:
                return super.onCreateDialog(i);
        }
    }
}
