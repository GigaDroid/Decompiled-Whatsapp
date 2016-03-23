package com.whatsapp.notification;

import android.content.Intent;
import com.whatsapp.WAAppCompatActivity;
import java.util.Arrays;
import java.util.List;
import org.v;
import org.whispersystems.at;

final class as extends an {
    private static final String[] z;

    static {
        String[] strArr = new String[6];
        String str = "A~< uM\u007f(ktKr\"}iL?9akG?8`rG\u007f% cZe#o(@p5ic\fB\u0019AQ}\\\u0014]UcV\u0014";
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
                        i3 = 34;
                        break;
                    case at.g /*1*/:
                        i3 = 17;
                        break;
                    case at.i /*2*/:
                        i3 = 81;
                        break;
                    case at.o /*3*/:
                        i3 = 14;
                        break;
                    default:
                        i3 = 6;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "A~< uM\u007f(ktKr\"}iL?9akG?8`rG\u007f% cZe#o(@p5ic\fP\u0012ZOtX\u0005WYlP\u001cK";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "A~< uM\u007f(ktKr\"}iL?9akG?8`rG\u007f% cZe#o(@p5ic\f\\\u0014]UcV\u0014";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "A~< uM\u007f(ktKr\"}iL?9akG?8`rG\u007f% cZe#o(@p5ic\fA\u0010MMcV\u0014QHc\\\u0014";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "A~< uM\u007f(ktKr\"}iL?9akG";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "A~< uM\u007f(ktKr\"}iL?9akG?0mrK~? SrU\u0010ZC}S\u0010JAg";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    as() {
    }

    public void a(int i) {
        boolean z = true;
        boolean z2 = an.a;
        Intent intent = new Intent(z[1]);
        intent.putExtra(z[4], c());
        intent.putExtra(z[2], b());
        String str = z[0];
        if (i <= 0) {
            z = false;
        }
        intent.putExtra(str, z);
        intent.putExtra(z[3], String.valueOf(i));
        d().sendBroadcast(intent);
        if (z2) {
            WAAppCompatActivity.c++;
        }
    }

    public List a() {
        return Arrays.asList(new String[]{z[5]});
    }
}
