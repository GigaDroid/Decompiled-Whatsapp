package com.whatsapp.messaging;

import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import com.whatsapp.protocol.b9;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class a7 implements b9 {
    private static final String[] z;
    final bt a;
    final Messenger b;
    final Bundle c;

    static {
        String[] strArr = new String[6];
        String str = " e'Lp0+2A<&n(J<!dfM}9g$O\u007f>++Ko&j!K";
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
                        i3 = 85;
                        break;
                    case at.g /*1*/:
                        i3 = 11;
                        break;
                    case at.i /*2*/:
                        i3 = 70;
                        break;
                    case at.o /*3*/:
                        i3 = 46;
                        break;
                    default:
                        i3 = 28;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = " e'Lp0+2A<&n(J<!dfM}9g$O\u007f>++Ko&j!K";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = " e'Lp0+2A<&n(J<!dfM}9g$O\u007f>++Ko&j!K";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "&\u007f'Zi&";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "!b+Ko!j+^";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = " e'Lp0+2A<&n(J<!dfM}9g$O\u007f>++Ko&j!K";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void a(long j, String str) {
        try {
            this.c.putString(z[4], str);
            this.c.putLong(z[5], j);
            this.b.send(Message.obtain(null, 1, this.c));
        } catch (Throwable e) {
            Log.b(z[3], e);
        }
    }

    public void a(int i) {
        try {
            this.b.send(Message.obtain(null, 0, i, 0, this.c));
        } catch (Throwable e) {
            Log.b(z[1], e);
        }
    }

    public void a() {
        try {
            this.b.send(Message.obtain(null, 2, this.c));
        } catch (Throwable e) {
            Log.b(z[0], e);
        }
    }

    a7(bt btVar, Bundle bundle, Messenger messenger) {
        this.a = btVar;
        this.c = bundle;
        this.b = messenger;
    }

    public void b() {
        try {
            this.b.send(Message.obtain(null, 3, this.c));
        } catch (Throwable e) {
            Log.b(z[2], e);
        }
    }
}
