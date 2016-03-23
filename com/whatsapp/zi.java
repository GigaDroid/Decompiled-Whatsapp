package com.whatsapp;

import android.content.Intent;
import android.view.View;
import com.whatsapp.util.Log;
import com.whatsapp.util.ap;
import org.v;
import org.whispersystems.at;

class zi extends ap {
    private static final String[] z;
    final RegisterPhone b;

    static {
        String[] strArr = new String[4];
        String str = "16!90764\u007f3+<(5l <3>71*69 (64\u007f /:%;&'s(m";
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
                        i3 = 67;
                        break;
                    case at.g /*1*/:
                        i3 = 83;
                        break;
                    case at.i /*2*/:
                        i3 = 70;
                        break;
                    case at.o /*3*/:
                        i3 = 80;
                        break;
                    default:
                        i3 = 67;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "c#{";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "16!90764\u007f3+<(5l <3>71*69 (64\u007f /:%;&'|\"9\"/<!}5* /2/&|5;*3s(m";
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "c#{";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void a(View view) {
        Log.i(z[0] + RegisterPhone.a(this.b) + z[2] + this.b.x);
        if (RegisterPhone.a(this.b) == null && this.b.x == null) {
            Intent intent = new Intent(this.b, CountryPicker.class);
            intent.putExtra(CountryPicker.w, this.b.v.g.getText().toString());
            this.b.startActivityForResult(intent, 0);
            this.b.v.e.removeTextChangedListener(this.b.v.a);
            RegisterPhone.b(this.b, true);
            if (!DialogToastActivity.f) {
                return;
            }
        }
        Log.i(z[3] + RegisterPhone.a(this.b) + z[1] + this.b.x);
    }

    zi(RegisterPhone registerPhone) {
        this.b = registerPhone;
    }
}
