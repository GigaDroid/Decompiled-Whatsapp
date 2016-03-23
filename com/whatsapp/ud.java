package com.whatsapp;

import android.content.Intent;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.ActivityOptionsCompat;
import android.view.View;
import android.view.View.OnClickListener;
import org.v;
import org.whispersystems.at;

class ud implements OnClickListener {
    private static final String[] z;
    final ProfileInfoActivity a;

    static {
        String[] strArr = new String[2];
        String str = "S\u0019!O~\\\u0011!s\u007fB\u0011=_bD\u0019<B";
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
                        i3 = 48;
                        break;
                    case at.g /*1*/:
                        i3 = 112;
                        break;
                    case at.i /*2*/:
                        i3 = 83;
                        break;
                    case at.o /*3*/:
                        i3 = 44;
                        break;
                    default:
                        i3 = 11;
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
                    str = "Z\u00197";
                    obj = null;
            }
        }
    }

    public void onClick(View view) {
        if (ProfileInfoActivity.a(this.a)) {
            Intent intent = new Intent(this.a, ViewProfilePhoto.class);
            intent.putExtra(z[1], ProfileInfoActivity.b(this.a).p);
            intent.putExtra(z[0], true);
            ActivityCompat.startActivity(this.a, intent, ActivityOptionsCompat.makeSceneTransitionAnimation(this.a, ProfileInfoActivity.d(this.a), this.a.getString(2131232335)).toBundle());
            if (!DialogToastActivity.f) {
                return;
            }
        }
        r.a(ProfileInfoActivity.b(this.a), this.a, 12);
    }

    ud(ProfileInfoActivity profileInfoActivity) {
        this.a = profileInfoActivity;
    }
}
