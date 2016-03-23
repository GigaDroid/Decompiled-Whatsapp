package com.whatsapp;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import org.v;
import org.whispersystems.at;

class a4s implements OnClickListener {
    private static final String[] z;
    final MultipleContactsSelector a;

    static {
        String[] strArr = new String[4];
        String str = "\u0007*\u0012=\"";
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
                        i3 = arj.Theme_seekBarStyle;
                        break;
                    case at.g /*1*/:
                        i3 = 67;
                        break;
                    case at.i /*2*/:
                        i3 = 127;
                        break;
                    case at.o /*3*/:
                        i3 = 84;
                        break;
                    default:
                        i3 = 86;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\u0007*\u0012=\"44\u001e&8\u0002-\u0018\u000b$\u000e0\u0010!$\b& '\"\u0019";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "\u001f*\u000b83";
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u0018&\u001315\u001f&\u001b";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void onClick(View view) {
        if (this.a.e() > 0 && this.a.w.size() >= this.a.e()) {
            this.a.f(String.format(this.a.getString(this.a.k()), new Object[]{Integer.valueOf(this.a.e())}));
            if (!DialogToastActivity.f) {
                return;
            }
        }
        Intent intent = new Intent(this.a, MultipleContactPicker.class);
        intent.putExtra(z[0], this.a.e());
        intent.putExtra(z[2], this.a.k());
        intent.putExtra(z[1], this.a.b());
        intent.putExtra(z[3], this.a.j());
        this.a.startActivityForResult(intent, 1);
    }

    a4s(MultipleContactsSelector multipleContactsSelector) {
        this.a = multipleContactsSelector;
    }
}
