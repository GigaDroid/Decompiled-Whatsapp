package com.whatsapp.gdrive;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import org.v;
import org.whispersystems.at;

class e1 implements OnClickListener {
    private static final String z;
    final bf a;

    static {
        char[] toCharArray = "c\u0015!n}l)%b`d\u0019'jMo\u00131ns]\u00040tfm\u00040X}t\u0013'Xqg\u001a9r~c\u0004".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 2;
                    break;
                case at.g /*1*/:
                    i2 = 118;
                    break;
                case at.i /*2*/:
                    i2 = 85;
                    break;
                case at.o /*3*/:
                    i2 = 7;
                    break;
                default:
                    i2 = 18;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void onClick(View view) {
        this.a.c.onNewIntent(new Intent(z));
    }

    e1(bf bfVar) {
        this.a = bfVar;
    }
}
