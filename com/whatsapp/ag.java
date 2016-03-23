package com.whatsapp;

import android.content.Context;
import android.widget.ArrayAdapter;
import com.whatsapp.protocol.cx;
import java.util.List;
import org.v;
import org.whispersystems.at;

class ag extends ArrayAdapter {
    private static final String[] z;
    final aox a;

    static {
        String[] strArr = new String[4];
        String str = ".5";
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
                        i3 = 2;
                        break;
                    case at.g /*1*/:
                        i3 = 21;
                        break;
                    case at.i /*2*/:
                        i3 = arj.Theme_switchStyle;
                        break;
                    case at.o /*3*/:
                        i3 = 24;
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
                    str = ".5";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "'$I4\u00163s";
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "'$I4\u00163s";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public int getViewTypeCount() {
        return 1;
    }

    public cx a(int i) {
        return (cx) this.a.j.get(i);
    }

    public ag(aox com_whatsapp_aox, Context context, List list) {
        this.a = com_whatsapp_aox;
        super(context, 2130903247, list);
    }

    public Object getItem(int i) {
        return a(i);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r19, android.view.View r20, android.view.ViewGroup r21) {
        /*
        r18 = this;
        r10 = com.whatsapp.DialogToastActivity.f;
        if (r20 != 0) goto L_0x001c;
    L_0x0004:
        r0 = r18;
        r2 = r0.a;
        r2 = com.whatsapp.aox.c(r2);
        r2 = r2.getLayoutInflater();
        r3 = 2130903247; // 0x7f0300cf float:1.7413307E38 double:1.052806089E-314;
        r4 = 0;
        r0 = r21;
        r2 = com.whatsapp.aam.a(r2, r3, r0, r4);
        if (r10 == 0) goto L_0x01b2;
    L_0x001c:
        r2 = 2130839767; // 0x7f0208d7 float:1.7284554E38 double:1.0527747257E-314;
        r0 = r20;
        r0.setBackgroundResource(r2);
        r2 = 1;
        r0 = r20;
        r0.setSelected(r2);
        r2 = 2131755466; // 0x7f1001ca float:1.9141812E38 double:1.053227141E-314;
        r0 = r20;
        r2 = r0.findViewById(r2);
        r2 = (android.widget.TextView) r2;
        r3 = 2131755352; // 0x7f100158 float:1.914158E38 double:1.053227085E-314;
        r0 = r20;
        r3 = r0.findViewById(r3);
        r9 = r3;
        r9 = (android.widget.TextView) r9;
        r3 = 2131755675; // 0x7f10029b float:1.9142236E38 double:1.0532272443E-314;
        r0 = r20;
        r3 = r0.findViewById(r3);
        r3 = (android.widget.ImageView) r3;
        r11 = r18.a(r19);
        r4 = com.whatsapp.App.as;
        r5 = r11.f;
        r4 = r4.b(r5);
        r0 = r18;
        r5 = r0.a;
        r5 = r5.i;
        r5 = r5.contains(r11);
        if (r5 == 0) goto L_0x006e;
    L_0x0064:
        r5 = -3151373; // 0xffffffffffcfe9f3 float:NaN double:NaN;
        r0 = r20;
        r0.setBackgroundColor(r5);
        if (r10 == 0) goto L_0x0074;
    L_0x006e:
        r5 = 0;
        r0 = r20;
        r0.setBackgroundResource(r5);
    L_0x0074:
        r0 = r20;
        r0.setTag(r11);
        r5 = r18.getContext();
        r5 = r4.a(r5);
        r2.setText(r5);
        r0 = r18;
        r2 = r0.a;
        r2 = com.whatsapp.aox.b(r2);
        r2.b(r4, r3);
        r2 = java.lang.System.currentTimeMillis();
        r4 = r11.g;
        r2 = r2 - r4;
        r4 = 60000; // 0xea60 float:8.4078E-41 double:2.9644E-319;
        r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r2 >= 0) goto L_0x00ae;
    L_0x009d:
        r0 = r18;
        r2 = r0.a;
        r2 = com.whatsapp.aox.c(r2);
        r3 = 2131231407; // 0x7f0802af float:1.8078894E38 double:1.0529682215E-314;
        r2 = r2.getString(r3);
        if (r10 == 0) goto L_0x00c0;
    L_0x00ae:
        r2 = r11.g;
        r4 = java.lang.System.currentTimeMillis();
        r6 = 60000; // 0xea60 float:8.4078E-41 double:2.9644E-319;
        r8 = 0;
        r2 = android.text.format.DateUtils.getRelativeTimeSpanString(r2, r4, r6, r8);
        r2 = r2.toString();
    L_0x00c0:
        r3 = r11.c;
        if (r3 == 0) goto L_0x00f9;
    L_0x00c4:
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r2 = r3.append(r2);
        r3 = z;
        r4 = 2;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r0 = r18;
        r3 = r0.a;
        r3 = com.whatsapp.aox.c(r3);
        r4 = 2131231404; // 0x7f0802ac float:1.8078888E38 double:1.05296822E-314;
        r5 = 1;
        r5 = new java.lang.Object[r5];
        r6 = 0;
        r7 = r11.c;
        r7 = java.lang.Integer.valueOf(r7);
        r5[r6] = r7;
        r3 = r3.getString(r4, r5);
        r2 = r2.append(r3);
        r2 = r2.toString();
    L_0x00f9:
        r3 = r11.i;
        r4 = (double) r3;
        r6 = 4601724776627584746; // 0x3fdc9c4da9003eea float:-2.847628E-14 double:0.44704;
        r3 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r3 <= 0) goto L_0x01ae;
    L_0x0105:
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r2 = r3.append(r2);
        r3 = z;
        r4 = 0;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r2 = r2.toString();
        r3 = java.util.Locale.US;
        r4 = com.whatsapp.aqu.f();
        r3 = r3.equals(r4);
        if (r3 == 0) goto L_0x016c;
    L_0x0127:
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r2 = r3.append(r2);
        r0 = r18;
        r3 = r0.a;
        r3 = com.whatsapp.aox.c(r3);
        r4 = 2131231412; // 0x7f0802b4 float:1.8078904E38 double:1.052968224E-314;
        r5 = 1;
        r5 = new java.lang.Object[r5];
        r6 = 0;
        r7 = z;
        r8 = 1;
        r7 = r7[r8];
        r8 = 1;
        r8 = new java.lang.Object[r8];
        r12 = 0;
        r13 = r11.i;
        r14 = (double) r13;
        r16 = 4612219559875242487; // 0x4001e540cc78e9f7 float:-6.5251292E7 double:2.23694;
        r14 = r14 * r16;
        r13 = java.lang.Double.valueOf(r14);
        r8[r12] = r13;
        r7 = java.lang.String.format(r7, r8);
        r5[r6] = r7;
        r3 = r3.getString(r4, r5);
        r2 = r2.append(r3);
        r2 = r2.toString();
        if (r10 == 0) goto L_0x01ae;
    L_0x016c:
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r2 = r3.append(r2);
        r0 = r18;
        r3 = r0.a;
        r3 = com.whatsapp.aox.c(r3);
        r4 = 2131231411; // 0x7f0802b3 float:1.8078902E38 double:1.0529682235E-314;
        r5 = 1;
        r5 = new java.lang.Object[r5];
        r6 = 0;
        r7 = z;
        r8 = 3;
        r7 = r7[r8];
        r8 = 1;
        r8 = new java.lang.Object[r8];
        r10 = 0;
        r11 = r11.i;
        r12 = (double) r11;
        r14 = 4615288898129284301; // 0x400ccccccccccccd float:-1.07374184E8 double:3.6;
        r12 = r12 * r14;
        r11 = java.lang.Double.valueOf(r12);
        r8[r10] = r11;
        r7 = java.lang.String.format(r7, r8);
        r5[r6] = r7;
        r3 = r3.getString(r4, r5);
        r2 = r2.append(r3);
        r2 = r2.toString();
    L_0x01ae:
        r9.setText(r2);
        return r20;
    L_0x01b2:
        r20 = r2;
        goto L_0x001c;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ag.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public int getCount() {
        return this.a.j.size();
    }

    public int getItemViewType(int i) {
        return 0;
    }
}
