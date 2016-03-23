package com.whatsapp;

import android.content.Intent;
import android.view.View;
import com.whatsapp.protocol.co;
import com.whatsapp.util.ap;
import org.v;
import org.whispersystems.at;

class zn extends ap {
    private static final String[] z;
    final w6 b;
    final co c;

    static {
        String[] strArr = new String[2];
        String str = "\u001c\u00049";
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
                        i3 = 119;
                        break;
                    case at.g /*1*/:
                        i3 = 97;
                        break;
                    case at.i /*2*/:
                        i3 = 64;
                        break;
                    case at.o /*3*/:
                        i3 = 124;
                        break;
                    default:
                        i3 = 32;
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
                    str = "\u0005\u000e7#I\u0013";
                    obj = null;
            }
        }
    }

    zn(w6 w6Var, co coVar) {
        this.b = w6Var;
        this.c = coVar;
    }

    public void a(View view) {
        long b = App.aK.b(this.c);
        Intent g = Conversation.g(this.c.k.c);
        g.putExtra(z[1], b);
        g.putExtra(z[0], new a4p(this.c.k));
        this.b.b.startActivity(g);
    }
}
