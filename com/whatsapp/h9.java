package com.whatsapp;

import android.content.Context;
import android.support.annotation.Nullable;
import android.widget.Toast;
import org.v;
import org.whispersystems.at;

class h9 implements as8 {
    private static final String[] z;
    final WebImagePicker a;

    static {
        String[] strArr = new String[2];
        String str = " oKOb#uL\u001b (:[Z.!\u007f\\";
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
                        i3 = 77;
                        break;
                    case at.g /*1*/:
                        i3 = 26;
                        break;
                    case at.i /*2*/:
                        i3 = 56;
                        break;
                    case at.o /*3*/:
                        i3 = 59;
                        break;
                    default:
                        i3 = 66;
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
                    str = " oKOb#uL\u001b (:[Z.!\u007f\\";
                    obj = null;
            }
        }
    }

    public void b() {
        RequestPermissionActivity.a(this.a, 2131231676, 2131231675);
    }

    public void a() {
        throw new IllegalStateException(z[0]);
    }

    public void b(@Nullable String str) {
        throw new IllegalStateException(z[1]);
    }

    public void a(@Nullable String str) {
        try {
            int i;
            Context applicationContext = this.a.getApplicationContext();
            if (App.V()) {
                i = 2131231516;
            } else {
                i = 2131231517;
            }
            Toast.makeText(applicationContext, i, 1).show();
            this.a.finish();
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    h9(WebImagePicker webImagePicker) {
        this.a = webImagePicker;
    }
}
