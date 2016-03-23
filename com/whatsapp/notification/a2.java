package com.whatsapp.notification;

import android.content.Intent;
import com.whatsapp.WAAppCompatActivity;
import java.util.Arrays;
import java.util.List;
import org.v;
import org.whispersystems.at;

final class a2 extends an {
    private static final String[] z;

    static {
        String[] strArr = new String[6];
        String str = "#-\u0007rN\u001e/\f`E5";
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
                        i3 = 65;
                        break;
                    case at.g /*1*/:
                        i3 = 76;
                        break;
                    case at.i /*2*/:
                        i3 = 99;
                        break;
                    case at.o /*3*/:
                        i3 = 21;
                        break;
                    default:
                        i3 = 43;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "#-\u0007rN\u001e/\f`E5\u0013\u0000yJ2?<{J,)";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "#-\u0007rN\u001e/\f`E5\u0013\u0013tH*-\u0004pt/-\u000ep";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "\"#\u000e;G&)MyJ4\"\u0000}N3";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "\"#\u000e;G&)MyJ4\"\u0000}N3~";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = " \"\u0007gD((M|E5)\ra\u0005 /\u0017|D/b!To\u0006\t<Vd\u0014\u00027J~\u0011\b\"An";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void a(int i) {
        boolean z = false;
        boolean z2 = an.a;
        Intent intent = new Intent(z[1]);
        intent.putExtra(z[0], i);
        intent.putExtra(z[3], c());
        intent.putExtra(z[2], b());
        d().sendBroadcast(intent);
        if (WAAppCompatActivity.c != 0) {
            if (!z2) {
                z = true;
            }
            an.a = z;
        }
    }

    a2() {
    }

    public List a() {
        return Arrays.asList(new String[]{z[4], z[5]});
    }
}
