package com.whatsapp;

import android.content.Context;
import android.widget.ArrayAdapter;
import java.util.ArrayList;
import org.v;
import org.whispersystems.at;

class a2e extends ArrayAdapter {
    private static final String z;
    final SetStatus a;
    private ArrayList b;

    static {
        char[] toCharArray = "~*\fCif\u0014\u001cBz~*\u0001In".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 18;
                    break;
                case at.g /*1*/:
                    i2 = 75;
                    break;
                case at.i /*2*/:
                    i2 = 117;
                    break;
                case at.o /*3*/:
                    i2 = 44;
                    break;
                default:
                    i2 = 28;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public a2e(SetStatus setStatus, Context context, int i, ArrayList arrayList) {
        this.a = setStatus;
        super(context, i, arrayList);
        this.b = arrayList;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r7, android.view.View r8, android.view.ViewGroup r9) {
        /*
        r6 = this;
        if (r8 != 0) goto L_0x0014;
    L_0x0002:
        r0 = r6.a;
        r1 = z;
        r0 = r0.getSystemService(r1);
        r0 = (android.view.LayoutInflater) r0;
        r1 = 2130903268; // 0x7f0300e4 float:1.741335E38 double:1.0528060993E-314;
        r2 = 0;
        r8 = com.whatsapp.aam.a(r0, r1, r2);
    L_0x0014:
        r0 = r6.b;
        r0 = r0.get(r7);
        r0 = (java.lang.String) r0;
        if (r0 == 0) goto L_0x004c;
    L_0x001e:
        r1 = 2131755895; // 0x7f100377 float:1.9142682E38 double:1.053227353E-314;
        r1 = r8.findViewById(r1);
        r1 = (com.whatsapp.TextEmojiLabel) r1;
        if (r1 == 0) goto L_0x004c;
    L_0x0029:
        r2 = com.whatsapp.App.v;
        r2 = r0.equals(r2);
        if (r2 == 0) goto L_0x0044;
    L_0x0031:
        r2 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r3 = 51;
        r4 = 102; // 0x66 float:1.43E-43 double:5.04E-322;
        r5 = 153; // 0x99 float:2.14E-43 double:7.56E-322;
        r2 = android.graphics.Color.argb(r2, r3, r4, r5);
        r1.setTextColor(r2);
        r2 = com.whatsapp.DialogToastActivity.f;
        if (r2 == 0) goto L_0x0049;
    L_0x0044:
        r2 = -16777216; // 0xffffffffff000000 float:-1.7014118E38 double:NaN;
        r1.setTextColor(r2);
    L_0x0049:
        r1.a(r0);
    L_0x004c:
        return r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.a2e.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
