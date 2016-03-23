package com.whatsapp;

import android.text.TextUtils;
import org.v;
import org.whispersystems.at;

class ale implements Runnable {
    private static final String z;
    final SetStatus a;
    final String b;

    static {
        char[] toCharArray = "yx?/\u0016X\u007fb9\u000eI%\u007f=\n".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 57;
                    break;
                case at.g /*1*/:
                    i2 = 11;
                    break;
                case at.i /*2*/:
                    i2 = 17;
                    break;
                case at.o /*3*/:
                    i2 = 88;
                    break;
                default:
                    i2 = 126;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    ale(SetStatus setStatus, String str) {
        this.a = setStatus;
        this.b = str;
    }

    public void run() {
        if (TextUtils.equals(this.b, App.ad() + z)) {
            this.a.p.setText(a28.a(App.v, this.a.getBaseContext(), this.a.p.getPaint()));
            this.a.n.notifyDataSetInvalidated();
            this.a.findViewById(2131755580).setVisibility(8);
            this.a.findViewById(2131755890).setVisibility(0);
            SetStatus.c(this.a).setOnClickListener(new av8(this));
        }
    }
}
