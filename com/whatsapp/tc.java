package com.whatsapp;

import android.backport.util.Base64;
import com.whatsapp.protocol.bq;
import com.whatsapp.util.Log;
import de.greenrobot.event.h;
import java.security.MessageDigest;
import java.util.Random;
import org.v;
import org.whispersystems.at;

class tc implements bq {
    private static final String[] z;
    final App a;
    private final Random b;

    static {
        String[] strArr = new String[2];
        String str = "{4`\u0007xkzu\n4~(n\u0013}j?!\bq})`\u0002q.3eE|o)iEp{?!\u0011{.7h\u0016gg4fEyjo!\u0004xi5s\f`f7";
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
                        i3 = 14;
                        break;
                    case at.g /*1*/:
                        i3 = 90;
                        break;
                    case at.i /*2*/:
                        i3 = 1;
                        break;
                    case at.o /*3*/:
                        i3 = arj.Theme_buttonStyleSmall;
                        break;
                    default:
                        i3 = 20;
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
                    str = "C\u001e4";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
            }
        }
    }

    public String a(byte[] bArr) {
        return Base64.encodeToString(bArr, 3);
    }

    public byte[] a(String str) {
        return Base64.decode(str, 0);
    }

    public String b(byte[] bArr) {
        int i = 0;
        boolean z = DialogToastActivity.f;
        char[] cArr = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        char[] cArr2 = new char[(bArr.length * 2)];
        int length = bArr.length;
        int i2 = 0;
        while (i < length) {
            int i3 = bArr[i] & 255;
            int i4 = i2 + 1;
            cArr2[i2] = cArr[i3 >>> 4];
            i2 = i4 + 1;
            cArr2[i4] = cArr[i3 & 15];
            i++;
            if (z) {
                break;
            }
        }
        return new String(cArr2);
    }

    public long b() {
        return ((amm) h.b().b(amm.class)).a();
    }

    tc(App app) {
        this.a = app;
        this.b = new Random();
    }

    public byte[] a() {
        boolean z = DialogToastActivity.f;
        try {
            MessageDigest instance = MessageDigest.getInstance(z[1]);
            long b = b();
            byte[] bArr = new byte[8];
            int i = 7;
            while (i >= 0) {
                bArr[i] = (byte) ((int) b);
                b >>= 8;
                i--;
                if (z) {
                    break;
                }
            }
            instance.update(bArr);
            instance.update(App.as.e().p.getBytes());
            byte[] bArr2 = new byte[16];
            this.b.nextBytes(bArr2);
            instance.update(bArr2);
            Object obj = new byte[15];
            System.arraycopy(instance.digest(), 0, obj, 0, obj.length);
            return obj;
        } catch (Throwable e) {
            Log.c(z[0], e);
            return null;
        }
    }
}
