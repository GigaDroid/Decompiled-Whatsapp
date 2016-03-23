package com.whatsapp;

import android.content.Context;
import android.widget.ArrayAdapter;
import java.util.List;
import org.v;
import org.whispersystems.at;

final class _z extends ArrayAdapter {
    private static final String[] z;
    private final String a;
    private final String b;

    static {
        String[] strArr = new String[4];
        String str = "Y}[yH\u00069\u0005h^\\#\u0014bS\u0005>\u0014m\u0007\u001a$QtR\u001f;P";
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
                        i3 = 115;
                        break;
                    case at.g /*1*/:
                        i3 = 87;
                        break;
                    case at.i /*2*/:
                        i3 = 113;
                        break;
                    case at.o /*3*/:
                        i3 = 26;
                        break;
                    default:
                        i3 = 39;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\u001f6\buR\u0007\b\u0018tA\u001f6\u0005\u007fU";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "Y}[yH\u00069\u0005h^\u00108\u0015\u007f\b\u00072\tnQ\u001a2\u0006:N\u0000w\u001foK\u001fv";
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u001f6\buR\u0007\b\u0018tA\u001f6\u0005\u007fU";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r10, android.view.View r11, android.view.ViewGroup r12) {
        /*
        r9 = this;
        r8 = 0;
        r7 = 2131755591; // 0x7f100247 float:1.9142066E38 double:1.053227203E-314;
        r6 = 0;
        r5 = 1;
        r3 = com.whatsapp.DialogToastActivity.f;
        r0 = super.getCount();
        if (r0 != 0) goto L_0x003d;
    L_0x000e:
        if (r11 == 0) goto L_0x0019;
    L_0x0010:
        r0 = 2131755472; // 0x7f1001d0 float:1.9141824E38 double:1.053227144E-314;
        r0 = r11.findViewById(r0);
        if (r0 != 0) goto L_0x003c;
    L_0x0019:
        r0 = r9.getContext();
        r1 = z;
        r1 = r1[r5];
        r11 = new android.widget.LinearLayout;
        r11.<init>(r0);
        r0 = r0.getSystemService(r1);
        r0 = (android.view.LayoutInflater) r0;
        r1 = 2130903231; // 0x7f0300bf float:1.7413274E38 double:1.052806081E-314;
        com.whatsapp.aam.a(r0, r1, r11, r5);
        r0 = 2131755794; // 0x7f100312 float:1.9142477E38 double:1.053227303E-314;
        r0 = r11.findViewById(r0);
        r0.setClickable(r5);
    L_0x003c:
        return r11;
    L_0x003d:
        r0 = r9.getItem(r10);
        r0 = (com.whatsapp.cj) r0;
        if (r11 == 0) goto L_0x004b;
    L_0x0045:
        r1 = r11.findViewById(r7);
        if (r1 != 0) goto L_0x0067;
    L_0x004b:
        r1 = r9.getContext();
        r2 = z;
        r4 = 2;
        r4 = r2[r4];
        r2 = new android.widget.LinearLayout;
        r2.<init>(r1);
        r1 = r1.getSystemService(r4);
        r1 = (android.view.LayoutInflater) r1;
        r4 = 2130903152; // 0x7f030070 float:1.7413114E38 double:1.052806042E-314;
        com.whatsapp.aam.a(r1, r4, r2, r5);
        if (r3 == 0) goto L_0x011e;
    L_0x0067:
        r11 = (android.widget.LinearLayout) r11;
    L_0x0069:
        r1 = r11.findViewById(r7);
        r1 = (android.widget.TextView) r1;
        if (r1 != 0) goto L_0x0078;
    L_0x0071:
        r2 = z;
        r2 = r2[r6];
        com.whatsapp.util.Log.w(r2);
    L_0x0078:
        r2 = r0.b;
        r1.setText(r2);
        r2 = 2131755592; // 0x7f100248 float:1.9142068E38 double:1.0532272033E-314;
        r2 = r11.findViewById(r2);
        r2 = (android.widget.TextView) r2;
        r4 = r0.b;
        r5 = r0.c;
        r4 = android.text.TextUtils.equals(r4, r5);
        if (r4 != 0) goto L_0x009a;
    L_0x0090:
        r4 = r0.c;
        r2.setText(r4);
        r2.setVisibility(r6);
        if (r3 == 0) goto L_0x00a2;
    L_0x009a:
        r4 = 8;
        r2.setVisibility(r4);
        r2.setText(r8);
    L_0x00a2:
        com.whatsapp.a4d.a(r1);
        r2 = 2131755593; // 0x7f100249 float:1.914207E38 double:1.053227204E-314;
        r2 = r11.findViewById(r2);
        r2 = (android.widget.TextView) r2;
        if (r2 != 0) goto L_0x00b8;
    L_0x00b0:
        r4 = z;
        r5 = 3;
        r4 = r4[r5];
        com.whatsapp.util.Log.w(r4);
    L_0x00b8:
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = "+";
        r4 = r4.append(r5);
        r5 = r0.d;
        r4 = r4.append(r5);
        r4 = r4.toString();
        r2.setText(r4);
        r2 = 2131755594; // 0x7f10024a float:1.9142072E38 double:1.0532272043E-314;
        r2 = r11.findViewById(r2);
        r2 = (android.widget.ImageView) r2;
        r4 = r0.a;
        r5 = r9.a;
        r4 = android.text.TextUtils.equals(r4, r5);
        if (r4 != 0) goto L_0x00ee;
    L_0x00e4:
        r0 = r0.b;
        r4 = r9.b;
        r0 = android.text.TextUtils.equals(r0, r4);
        if (r0 == 0) goto L_0x0114;
    L_0x00ee:
        r0 = r9.getContext();
        r0 = r0.getResources();
        r4 = 2131624050; // 0x7f0e0072 float:1.8875269E38 double:1.053162213E-314;
        r0 = r0.getColor(r4);
        r1.setTextColor(r0);
        r0 = r9.getContext();
        r0 = r0.getResources();
        r4 = 2130837748; // 0x7f0200f4 float:1.7280459E38 double:1.052773728E-314;
        r0 = r0.getDrawable(r4);
        r2.setBackgroundDrawable(r0);
        if (r3 == 0) goto L_0x003c;
    L_0x0114:
        r0 = -16777216; // 0xffffffffff000000 float:-1.7014118E38 double:NaN;
        r1.setTextColor(r0);
        r2.setBackgroundDrawable(r8);
        goto L_0x003c;
    L_0x011e:
        r11 = r2;
        goto L_0x0069;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp._z.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public _z(Context context, int i, List list, String str, String str2) {
        super(context, i, list);
        this.a = str;
        this.b = str2;
    }

    public int getCount() {
        return Math.max(1, super.getCount());
    }
}
