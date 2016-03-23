package com.whatsapp;

import com.whatsapp.util.Log;
import de.greenrobot.event.h;
import org.v;
import org.whispersystems.at;

final class anj implements Runnable {
    private static final String z;
    private final boolean a;
    final q_ b;

    static {
        char[] toCharArray = "8\boh\">\u0013kw {\u0004ct\"9\u0006asn=\bp8!5 gl\u001e)\u0002I}7\b\u0012a{+(\u001488".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 91;
                    break;
                case at.g /*1*/:
                    i2 = arj.Theme_checkedTextViewStyle;
                    break;
                case at.i /*2*/:
                    i2 = 2;
                    break;
                case at.o /*3*/:
                    i2 = 24;
                    break;
                default:
                    i2 = 78;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    anj(q_ q_Var, boolean z) {
        this.b = q_Var;
        this.a = z;
    }

    public void run() {
        Log.i(z + this.a);
        i1.b(this.b.d).aW.remove(this.b.f);
        h.b().a(new ji(this.b.f));
        if (this.a) {
            App.aM();
        }
    }
}
