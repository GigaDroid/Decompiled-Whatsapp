package com.whatsapp;

import com.whatsapp.protocol.co;
import com.whatsapp.util.Log;
import java.util.Vector;
import org.v;
import org.whispersystems.at;

class pv implements Runnable {
    private static final String[] z;
    final String a;
    final ar6 b;
    final co c;

    static {
        String[] strArr = new String[3];
        String str = "\u0013Ih\u0016e\u001a";
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
                        i3 = 125;
                        break;
                    case at.g /*1*/:
                        i3 = 38;
                        break;
                    case at.i /*2*/:
                        i3 = 72;
                        break;
                    case at.o /*3*/:
                        i3 = 123;
                        break;
                    default:
                        i3 = 22;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    strArr2 = strArr3;
                    str = "\u001aT'\u000efRE:\u001ew\tCh\u001aq\u001cO&W6\u0017O,A";
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "]U=\u0019|\u0018E<A";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void run() {
        try {
            String str;
            Thread.sleep(300);
            StringBuilder append = new StringBuilder().append(z[2]).append(this.a).append(z[1]);
            if (this.c == null) {
                str = z[0];
            } else {
                str = this.c.c();
            }
            Log.w(append.append(str).toString());
            App.b(new a3i(this.a, this.c.c(), (Vector) this.c.Q, 14));
        } catch (InterruptedException e) {
            throw e;
        } catch (InterruptedException e2) {
        }
    }

    pv(ar6 com_whatsapp_ar6, String str, co coVar) {
        this.b = com_whatsapp_ar6;
        this.a = str;
        this.c = coVar;
    }
}
