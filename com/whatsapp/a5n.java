package com.whatsapp;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class a5n implements OnClickListener {
    private static final String z;
    final ai0 a;

    static {
        char[] toCharArray = "+\u007fe\u0002>-\u007fp\u0005,4\u007f-\u001847y-\u000f\"7\u007f-\b!0yi\u000e)".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 89;
                    break;
                case at.g /*1*/:
                    i2 = 26;
                    break;
                case at.i /*2*/:
                    i2 = 2;
                    break;
                case at.o /*3*/:
                    i2 = arj.Theme_seekBarStyle;
                    break;
                default:
                    i2 = 77;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    a5n(ai0 com_whatsapp_ai0) {
        this.a = com_whatsapp_ai0;
    }

    public void onClick(View view) {
        Log.i(z);
        this.a.d.startActivity(new Intent(this.a.d, Main.class));
        this.a.d.finish();
        RegisterName.a(null);
        this.a.d.removeDialog(0);
    }
}
