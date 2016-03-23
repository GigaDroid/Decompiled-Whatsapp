package com.whatsapp;

import android.content.Intent;
import android.net.Uri;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.v;
import org.whispersystems.at;

class a3 extends ClickableSpan {
    private static final String[] z;
    final EULA a;

    static {
        String[] strArr = new String[2];
        String str = "+[R\u0012=y\u0000\t\u001594\u0001Q\n/7\\G\u0012>mLI\u000fa/JA\u0003\"l";
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
                        i3 = 67;
                        break;
                    case at.g /*1*/:
                        i3 = 47;
                        break;
                    case at.i /*2*/:
                        i3 = 38;
                        break;
                    case at.o /*3*/:
                        i3 = 98;
                        break;
                    default:
                        i3 = 78;
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
                    i = 1;
                    strArr2 = strArr3;
                    str = "\"AB\u0010!*K\b\u000b 7JH\u0016`\"LR\u000b!-\u0001p+\u000b\u0014";
                    obj = null;
            }
        }
    }

    public void onClick(View view) {
        this.a.startActivity(new Intent(z[1], Uri.parse(z[0])));
    }

    public void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(-13243944);
    }

    a3(EULA eula) {
        this.a = eula;
    }
}
