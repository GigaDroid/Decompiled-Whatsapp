package com.whatsapp;

import android.content.Context;
import android.widget.ArrayAdapter;
import java.util.List;
import org.v;
import org.whispersystems.at;

class aee extends ArrayAdapter {
    private static final String[] z;
    final MultipleContactPicker a;

    static {
        String[] strArr = new String[4];
        String str = "P\u001d";
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
                        i3 = 112;
                        break;
                    case at.g /*1*/:
                        i3 = 61;
                        break;
                    case at.i /*2*/:
                        i3 = 3;
                        break;
                    case at.o /*3*/:
                        i3 = 93;
                        break;
                    default:
                        i3 = 48;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "P\u001d";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "P\u001d";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "P\u001d";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public aee(MultipleContactPicker multipleContactPicker, Context context, int i, List list) {
        this.a = multipleContactPicker;
        super(context, i, list);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r11, android.view.View r12, android.view.ViewGroup r13) {
        /*
        r10 = this;
        r9 = 2;
        r8 = 2131755791; // 0x7f10030f float:1.9142471E38 double:1.0532273017E-314;
        r7 = 1;
        r6 = 0;
        r4 = com.whatsapp.DialogToastActivity.f;
        r0 = r10.getItem(r11);
        r0 = (com.whatsapp.l5) r0;
        r1 = com.whatsapp.MultipleContactPicker.b(r0);
        if (r1 == 0) goto L_0x0029;
    L_0x0014:
        r0 = r10.a;
        r0 = r0.getLayoutInflater();
        r1 = 2130903231; // 0x7f0300bf float:1.7413274E38 double:1.052806081E-314;
        r12 = com.whatsapp.aam.a(r0, r1, r13, r6);
        r0 = java.lang.Integer.valueOf(r9);
        r12.setTag(r0);
    L_0x0028:
        return r12;
    L_0x0029:
        if (r12 == 0) goto L_0x0039;
    L_0x002b:
        r1 = r12.getTag();
        r1 = (java.lang.Integer) r1;
        r1 = (java.lang.Integer) r1;
        r1 = r1.intValue();
        if (r1 == r7) goto L_0x0048;
    L_0x0039:
        r1 = r10.a;
        r1 = r1.getLayoutInflater();
        r2 = 2130903230; // 0x7f0300be float:1.7413272E38 double:1.0528060806E-314;
        r1 = com.whatsapp.aam.a(r1, r2, r13, r6);
        if (r4 == 0) goto L_0x0112;
    L_0x0048:
        r1 = java.lang.Integer.valueOf(r7);
        r12.setTag(r1);
        r1 = 2131755351; // 0x7f100157 float:1.9141579E38 double:1.0532270843E-314;
        r1 = r12.findViewById(r1);
        r1 = (android.widget.ImageView) r1;
        r2 = r10.a;
        r2 = com.whatsapp.MultipleContactPicker.j(r2);
        r2.b(r0, r1);
        r1 = 2131755792; // 0x7f100310 float:1.9142473E38 double:1.053227302E-314;
        r1 = r12.findViewById(r1);
        r1 = (com.whatsapp.TextEmojiLabel) r1;
        com.whatsapp.a4d.a(r1);
        r2 = r10.a;
        r2 = com.whatsapp.MultipleContactPicker.b(r2);
        r1.setContact(r0, r2);
        r2 = 2131755793; // 0x7f100311 float:1.9142475E38 double:1.0532273026E-314;
        r2 = r12.findViewById(r2);
        r2 = (com.whatsapp.TextEmojiLabel) r2;
        r3 = r0.w;
        if (r3 == 0) goto L_0x0107;
    L_0x0083:
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r5 = r0.w;
        r3 = r3.append(r5);
        r5 = z;
        r5 = r5[r6];
        r3 = r3.append(r5);
        r3 = r3.toString();
    L_0x009a:
        r2.setText(r3);
        r3 = r0.p;
        r3 = com.whatsapp.aup.a(r3);
        if (r3 == 0) goto L_0x00bf;
    L_0x00a5:
        r3 = 2131232137; // 0x7f080589 float:1.8080375E38 double:1.052968582E-314;
        r2.setText(r3);
        r3 = -7829368; // 0xffffffffff888888 float:NaN double:NaN;
        r1.setTextColor(r3);
        r12.setLongClickable(r7);
        r3 = r12.findViewById(r8);
        r5 = 8;
        r3.setVisibility(r5);
        if (r4 == 0) goto L_0x00ec;
    L_0x00bf:
        r3 = r0.w;
        if (r3 == 0) goto L_0x010c;
    L_0x00c3:
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = r0.w;
        r3 = r3.append(r4);
        r4 = z;
        r4 = r4[r9];
        r3 = r3.append(r4);
        r3 = r3.toString();
    L_0x00da:
        r2.a(r3);
        r2 = -16777216; // 0xffffffffff000000 float:-1.7014118E38 double:NaN;
        r1.setTextColor(r2);
        r12.setLongClickable(r6);
        r1 = r12.findViewById(r8);
        r1.setVisibility(r6);
    L_0x00ec:
        r1 = r12.findViewById(r8);
        r1 = (android.widget.CheckBox) r1;
        r1.setFocusable(r6);
        r2 = new com.whatsapp.cx;
        r2.<init>(r10);
        r1.setOnClickListener(r2);
        r2 = r0.e;
        r1.setChecked(r2);
        r1.setTag(r0);
        goto L_0x0028;
    L_0x0107:
        r3 = z;
        r3 = r3[r7];
        goto L_0x009a;
    L_0x010c:
        r3 = z;
        r4 = 3;
        r3 = r3[r4];
        goto L_0x00da;
    L_0x0112:
        r12 = r1;
        goto L_0x0048;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.aee.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
