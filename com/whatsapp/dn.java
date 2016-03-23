package com.whatsapp;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class dn implements OnClickListener {
    private static final String z;
    final ChangeNumberOverview a;

    static {
        char[] toCharArray = "}c_\"\u0001{eK!\u0004{yQ:\u0003l}W)\u00111e[4\u0012".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 30;
                    break;
                case at.g /*1*/:
                    i2 = 11;
                    break;
                case at.i /*2*/:
                    i2 = 62;
                    break;
                case at.o /*3*/:
                    i2 = 76;
                    break;
                default:
                    i2 = arj.Theme_checkboxStyle;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void onClick(View view) {
        Log.i(z);
        this.a.startActivity(new Intent(this.a, ChangeNumber.class));
        this.a.finish();
    }

    dn(ChangeNumberOverview changeNumberOverview) {
        this.a = changeNumberOverview;
    }
}
