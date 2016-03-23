package com.whatsapp;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;
import org.v;
import org.whispersystems.at;

class yo implements OnClickListener {
    private static final String[] z;
    final IncorrectAppReleaseVersionActivity a;

    static {
        String[] strArr = new String[2];
        String str = "z0Mb:m4\u0014j4g\u007fYa:~\"Oy+";
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
                        i3 = 10;
                        break;
                    case at.g /*1*/:
                        i3 = 81;
                        break;
                    case at.i /*2*/:
                        i3 = 46;
                        break;
                    case at.o /*3*/:
                        i3 = 9;
                        break;
                    default:
                        i3 = 91;
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
                    str = "k?J{4c5\u0000`5~4@}uk2Z`4d\u007fjL\u0017O\u0005k";
                    obj = null;
            }
        }
    }

    yo(IncorrectAppReleaseVersionActivity incorrectAppReleaseVersionActivity) {
        this.a = incorrectAppReleaseVersionActivity;
    }

    public void onClick(View view) {
        this.a.startActivity(new Intent(z[1], Uri.parse(z[0])));
    }
}
