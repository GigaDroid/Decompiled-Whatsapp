package com.whatsapp.gdrive;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import com.whatsapp.util.Log;
import com.whatsapp.util.bq;
import org.v;
import org.whispersystems.at;

class dt implements OnClickListener {
    private static final String[] z;
    final GoogleDriveNewUserSetupActivity a;

    static {
        String[] strArr = new String[5];
        String str = "\u007fnf_l}'zSm5\u007fgSh5yqBoh%pYt}'wZs{aqR:yiwYov~4_i8";
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
                        i3 = 24;
                        break;
                    case at.g /*1*/:
                        i3 = 10;
                        break;
                    case at.i /*2*/:
                        i3 = 20;
                        break;
                    case at.o /*3*/:
                        i3 = 54;
                        break;
                    default:
                        i3 = 26;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "8kzR:zkw]oh*rD\u007fi\u007fqXya*}E:";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "\u007fnf_l}'zSm5\u007fgSh5yqBoh%pYt}'wZs{aqR5kb{A7yiwYov~9E\u007ftowBuj";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "\u007fnf_l}'zSm5\u007fgSh5yqBoh%pYt}'wZs{aqR5ko`Cj5l}XskbqR";
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u007fnf_l}'zSm5\u007fgSh5yqBoh%pYt}'wZs{aqR5kb{A7leuEn8(1E8";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void onClick(View view) {
        boolean z = GoogleDriveService.c;
        String g = GoogleDriveService.g();
        Log.i(z[0] + fn.a(g) + z[2] + GoogleDriveNewUserSetupActivity.a(this.a));
        if (GoogleDriveNewUserSetupActivity.a(this.a) == -1) {
            Log.i(String.format(z[1], new Object[]{this.a.getString(2131231233)}));
            Toast.makeText(this.a, 2131231233, 1).show();
            if (!z) {
                return;
            }
        }
        if (GoogleDriveNewUserSetupActivity.a(this.a) != 0 && g == null) {
            Log.i(z[3]);
            this.a.a();
            if (!z) {
                return;
            }
        }
        Log.i(z[4]);
        GoogleDriveService.c(GoogleDriveNewUserSetupActivity.a(this.a));
        bq.a(new fz(this));
        this.a.setResult(-1);
        this.a.finish();
    }

    dt(GoogleDriveNewUserSetupActivity googleDriveNewUserSetupActivity) {
        this.a = googleDriveNewUserSetupActivity;
    }
}
