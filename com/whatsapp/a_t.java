package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;
import com.whatsapp.util.Log;
import com.whatsapp.util.bq;
import org.v;
import org.whispersystems.at;

class a_t implements OnClickListener {
    private static final String z;
    final ContactPickerHelp a;

    static {
        char[] toCharArray = "\u0017\u001a\u0003\u0003e\u0017\u0001\u0005\u0012h\u0004Z\u001e\u001fk\u0003\u001c\u0003\u0001m\u0007\u001c\u000f\u001ba[\u0016\u0001\u001eg\u001f\u0010\t".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 116;
                    break;
                case at.g /*1*/:
                    i2 = 117;
                    break;
                case at.i /*2*/:
                    i2 = arj.Theme_switchStyle;
                    break;
                case at.o /*3*/:
                    i2 = 119;
                    break;
                default:
                    i2 = 4;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    a_t(ContactPickerHelp contactPickerHelp) {
        this.a = contactPickerHelp;
    }

    public void onClick(View view) {
        Log.i(z);
        bq.a(new rn(this.a, null), new Void[0]);
    }
}
