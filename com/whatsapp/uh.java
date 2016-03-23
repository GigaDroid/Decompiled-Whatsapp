package com.whatsapp;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.whatsapp.protocol.co;
import org.v;
import org.whispersystems.at;

class uh implements OnClickListener {
    private static final String[] z;
    final co a;
    final w0 b;

    static {
        String[] strArr = new String[2];
        String str = "?*$\u007fp)";
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
                        i3 = 69;
                        break;
                    case at.i /*2*/:
                        i3 = 83;
                        break;
                    case at.o /*3*/:
                        i3 = 32;
                        break;
                    default:
                        i3 = 25;
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
                    str = "& *";
                    obj = null;
            }
        }
    }

    uh(w0 w0Var, co coVar) {
        this.b = w0Var;
        this.a = coVar;
    }

    public void onClick(View view) {
        long b = App.aK.b(this.a);
        Intent g = Conversation.g(this.a.k.c);
        g.putExtra(z[0], b);
        g.putExtra(z[1], new a4p(this.a.k));
        this.b.b.startActivity(g);
    }
}
