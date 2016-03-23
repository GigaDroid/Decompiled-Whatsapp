package com.whatsapp;

import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import com.whatsapp.util.Log;
import com.whatsapp.util.bq;
import org.v;
import org.whispersystems.at;

class nn implements OnCheckedChangeListener {
    private static final String[] z;
    final ContactPickerHelp a;

    static {
        String[] strArr = new String[3];
        String str = "@3+\u0005m@(-\u0014`Ss&\u0013#@0,\u0012gF8j";
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
                        i3 = 35;
                        break;
                    case at.g /*1*/:
                        i3 = 92;
                        break;
                    case at.i /*2*/:
                        i3 = 69;
                        break;
                    case at.o /*3*/:
                        i3 = 113;
                        break;
                    default:
                        i3 = 12;
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
                    str = "V2&\u0019i@7 \u0015";
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "@4 \u0012gF8";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (this.a.v) {
            this.a.v = false;
            if (!DialogToastActivity.f) {
                return;
            }
        }
        Log.i(z[0] + (z ? z[1] : z[2]));
        App.a(this.a, this.a.w.isChecked());
        bq.a(new qe(this.a, null), new Void[0]);
    }

    nn(ContactPickerHelp contactPickerHelp) {
        this.a = contactPickerHelp;
    }
}
