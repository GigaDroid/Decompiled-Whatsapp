package com.whatsapp;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import org.v;
import org.whispersystems.at;

public class g3 extends ge {
    private static final String[] z;
    private final String f;
    private Runnable g;

    static {
        String[] strArr = new String[5];
        String str = "L|.qK";
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
                        i3 = 36;
                        break;
                    case at.g /*1*/:
                        i3 = 8;
                        break;
                    case at.i /*2*/:
                        i3 = 90;
                        break;
                    case at.o /*3*/:
                        i3 = 1;
                        break;
                    default:
                        i3 = 56;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "L|.q";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "Ef>sWMlthVPm4u\u0016Ek.hWJ&\fH}s";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "Gg7/YJl(nQ@&8sWS{?s\u0016Ex*mQGi.hWJW3e";
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "V|)q";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void a(View view) {
        if (this.b) {
            Uri parse = Uri.parse(this.f);
            Context context = view.getContext();
            Intent intent = new Intent(z[3], parse);
            intent.putExtra(z[4], context.getPackageName());
            App.a(context, intent);
        }
    }

    public g3(String str, int i) {
        super(i, -65536, 1711315404);
        this.f = str;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(android.view.View r6, android.view.MotionEvent r7) {
        /*
        r5 = this;
        r4 = 0;
        super.a(r6, r7);
        r0 = r5.b;
        if (r0 == 0) goto L_0x0051;
    L_0x0008:
        r0 = r5.f;
        r0 = android.net.Uri.parse(r0);
        r0 = r0.getScheme();
        r1 = z;
        r2 = 2;
        r1 = r1[r2];
        r1 = r1.equals(r0);
        if (r1 != 0) goto L_0x0032;
    L_0x001d:
        r1 = z;
        r1 = r1[r4];
        r1 = r1.equals(r0);
        if (r1 != 0) goto L_0x0032;
    L_0x0027:
        r1 = z;
        r2 = 1;
        r1 = r1[r2];
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x004d;
    L_0x0032:
        r0 = r5.g;
        if (r0 != 0) goto L_0x003d;
    L_0x0036:
        r0 = new com.whatsapp.em;
        r0.<init>(r5, r6);
        r5.g = r0;
    L_0x003d:
        r0 = com.whatsapp.App.p;
        r0 = r0.M();
        r1 = r5.g;
        r2 = android.view.ViewConfiguration.getLongPressTimeout();
        r2 = (long) r2;
        r0.postDelayed(r1, r2);
    L_0x004d:
        r0 = com.whatsapp.DialogToastActivity.f;
        if (r0 == 0) goto L_0x0060;
    L_0x0051:
        r0 = r5.g;
        if (r0 == 0) goto L_0x0060;
    L_0x0055:
        r0 = com.whatsapp.App.p;
        r0 = r0.M();
        r1 = r5.g;
        r0.removeCallbacks(r1);
    L_0x0060:
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.g3.a(android.view.View, android.view.MotionEvent):boolean");
    }

    static String a(g3 g3Var) {
        return g3Var.f;
    }
}
