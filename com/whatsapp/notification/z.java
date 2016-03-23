package com.whatsapp.notification;

import com.whatsapp.arj;
import com.whatsapp.protocol.co;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;
import org.v;
import org.whispersystems.at;

class z implements Runnable {
    private static final String z;
    final co a;
    final String b;
    final ao c;

    static {
        char[] toCharArray = "\u0006m\u0012Al\fm/]y\u0002n\bQl\u001fa\u000e\\\"\u0019m\u0012Wy&m\u0012Al\fm\u0012tb\u0019F\u000eFd\ra\u0002Sy\u0002g\u000f\u001d|\u0019(\r[~\u001f(\u000fGa\u0007(\u0007]\u007fK".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = arj.Theme_seekBarStyle;
                    break;
                case at.g /*1*/:
                    i2 = 8;
                    break;
                case at.i /*2*/:
                    i2 = 97;
                    break;
                case at.o /*3*/:
                    i2 = 50;
                    break;
                default:
                    i2 = 13;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void run() {
        int i = PopupNotification.p;
        if (this.a == null) {
            ao.a(this.c).put(this.b, new ArrayList());
            if (i == 0) {
                return;
            }
        }
        List list = (List) ao.a(this.c).get(this.b);
        if (list != null) {
            int i2;
            int size = list.size();
            int i3 = 0;
            int i4 = -1;
            while (i3 < size) {
                if (this.a.k.equals(((co) list.get(i3)).k)) {
                    if (i == 0) {
                        i2 = i3;
                        break;
                    }
                    i2 = i3;
                } else {
                    i2 = i4;
                }
                i3++;
                if (i != 0) {
                    break;
                }
                i4 = i2;
            }
            i2 = i4;
            if (i2 > -1) {
                list.subList(i2, list.size()).clear();
            }
            if (i == 0) {
                return;
            }
        }
        Log.e(z + this.b);
    }

    z(ao aoVar, co coVar, String str) {
        this.c = aoVar;
        this.a = coVar;
        this.b = str;
    }
}
