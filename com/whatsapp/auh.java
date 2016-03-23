package com.whatsapp;

import com.whatsapp.protocol.c3;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class auh implements Runnable {
    private static final String[] z;
    final c3 a;
    final int b;
    final adn c;
    final int d;
    final long e;

    static {
        String[] strArr = new String[5];
        String str = "M12S\u0000X%}R\u000e^\"8[O_&0ZO\\;8T\nU:}O\u001dI?4P\u001a_%$\u001f\u001cI')\u001f\u000e_i(Q\u001cI')\u0005O";
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
                        i3 = 44;
                        break;
                    case at.g /*1*/:
                        i3 = 73;
                        break;
                    case at.i /*2*/:
                        i3 = 93;
                        break;
                    case at.o /*3*/:
                        i3 = 63;
                        break;
                    default:
                        i3 = 111;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "M12S\u0000X%}S\u0000O(1\u001f\u001dI.4L\u001b^()V\u0000Bi4[O";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "\f$<K\fD,9\u001f\u001cI;+Z\u001d\f;8X\u0006_=/^\u001bE&3\u001f\u0006Hi";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "M12S\u0000X%}Y\u0000Y'9\u001f\u0001Ci-M\nG,$LOM?<V\u0003M+1ZOX&}L\nB-}K\u0000\f=5ZO_,/I\n^";
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\f 3\u001f\u001dI#8\\\u001bI-}M\nX;$";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    auh(adn com_whatsapp_adn, int i, c3 c3Var, long j, int i2) {
        this.c = com_whatsapp_adn;
        this.b = i;
        this.a = c3Var;
        this.e = j;
        this.d = i2;
    }

    public void run() {
        int a = adn.b(this.c).a();
        if (a == this.d) {
            Log.i(z[2] + a + z[3] + this.d + z[1]);
            adn.c(this.c).M().post(new adi(this, adn.b(this.c).f(), a, adn.b(this.c).g(), adn.b(this.c).i().b(), false));
            return;
        }
        Log.i(z[0] + adn.b(this.c).a());
        if (!adn.b(this.c).h()) {
            Log.i(z[4]);
            adn.b(this.c).b();
        }
        adn.c(this.c).M().post(new adi(this, adn.b(this.c).f(), a, adn.b(this.c).g(), adn.b(this.c).i().b(), true));
    }
}
