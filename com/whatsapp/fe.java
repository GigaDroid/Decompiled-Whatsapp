package com.whatsapp;

import org.v;
import org.whispersystems.at;

class fe implements Runnable {
    private static final String z;
    final aqc a;
    final String b;

    static {
        char[] toCharArray = "\u0016<]Q\u000090\u0018".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 88;
                    break;
                case at.g /*1*/:
                    i2 = 83;
                    break;
                case at.i /*2*/:
                    i2 = 125;
                    break;
                case at.o /*3*/:
                    i2 = 34;
                    break;
                default:
                    i2 = 112;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    fe(aqc com_whatsapp_aqc, String str) {
        this.a = com_whatsapp_aqc;
        this.b = str;
    }

    public void run() {
        this.a.d.e();
        if (this.b != null && this.b.contains(z)) {
            String str;
            by byVar = this.a.d;
            if (App.V()) {
                str = App.z().getString(2131231089) + " " + App.z().getString(2131231821);
            } else {
                str = App.z().getString(2131231090) + " " + App.z().getString(2131231822);
            }
            byVar.f(str);
            if (!DialogToastActivity.f) {
                return;
            }
        }
        this.a.d.a(2131231088);
    }
}
