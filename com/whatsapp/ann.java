package com.whatsapp;

import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import org.v;
import org.whispersystems.at;

class ann extends CursorAdapter {
    private static final String[] z;
    final Broadcasts a;

    static {
        String[] strArr = new String[4];
        String str = ">E~1U?Vb$";
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
                        i3 = 92;
                        break;
                    case at.g /*1*/:
                        i3 = 55;
                        break;
                    case at.i /*2*/:
                        i3 = 17;
                        break;
                    case at.o /*3*/:
                        i3 = 80;
                        break;
                    default:
                        i3 = 49;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "p\u0017";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = ">E~1U?Vb$BsUx>U*^t'\u001e.R|?E9hc5B3Bc3T|Yd<]";
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "p\u0017";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void bindView(android.view.View r18, android.content.Context r19, android.database.Cursor r20) {
        /*
        r17 = this;
        r8 = com.whatsapp.DialogToastActivity.f;
        r2 = com.whatsapp.App.aK;
        r3 = z;
        r4 = 0;
        r3 = r3[r4];
        r0 = r20;
        r5 = r2.a(r0, r3);
        r0 = r18;
        r0.setTag(r5);
        r2 = 2131755585; // 0x7f100241 float:1.9142053E38 double:1.0532272E-314;
        r0 = r18;
        r2 = r0.findViewById(r2);
        r2 = (com.whatsapp.TextEmojiLabel) r2;
        r3 = "";
        r4 = r5.c;
        switch(r4) {
            case 0: goto L_0x027e;
            case 1: goto L_0x0284;
            case 2: goto L_0x0291;
            case 3: goto L_0x029e;
            case 4: goto L_0x02c5;
            case 5: goto L_0x02b8;
            case 6: goto L_0x0027;
            case 7: goto L_0x0027;
            case 8: goto L_0x0027;
            case 9: goto L_0x02ab;
            default: goto L_0x0027;
        };
    L_0x0027:
        r2.a(r3);
        r2 = 2131755583; // 0x7f10023f float:1.914205E38 double:1.053227199E-314;
        r0 = r18;
        r2 = r0.findViewById(r2);
        r2 = (android.widget.ImageView) r2;
        r3 = 8;
        r2.setVisibility(r3);
        r2 = 2131755582; // 0x7f10023e float:1.9142047E38 double:1.0532271984E-314;
        r0 = r18;
        r2 = r0.findViewById(r2);
        r2 = (android.widget.TextView) r2;
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r0 = r17;
        r4 = r0.a;
        r6 = com.whatsapp.App.o(r5);
        r4 = com.whatsapp.util.cs.j(r4, r6);
        r3 = r3.append(r4);
        r4 = " ";
        r3 = r3.append(r4);
        r3 = r3.toString();
        r2.setText(r3);
        r2 = r5.t;
        if (r2 == 0) goto L_0x0077;
    L_0x006c:
        r2 = r5.t;
        r3 = ",";
        r2 = r2.split(r3);
        if (r8 == 0) goto L_0x0082;
    L_0x0077:
        r2 = 0;
        r2 = new java.lang.String[r2];
        r3 = z;
        r4 = 3;
        r3 = r3[r4];
        com.whatsapp.util.Log.e(r3);
    L_0x0082:
        r3 = r2;
        r4 = 0;
        r6 = r3.length;
        r2 = 0;
        r16 = r2;
        r2 = r4;
        r4 = r16;
    L_0x008b:
        if (r4 >= r6) goto L_0x00b0;
    L_0x008d:
        r7 = r3[r4];
        r9 = com.whatsapp.App.aK;
        r10 = new com.whatsapp.protocol.c3;
        r11 = 1;
        r12 = r5.k;
        r12 = r12.b;
        r10.<init>(r7, r11, r12);
        r7 = r9.a(r10);
        if (r7 == 0) goto L_0x00ac;
    L_0x00a1:
        r7 = r7.d;
        r9 = 5;
        r7 = com.whatsapp.protocol.b7.a(r7, r9);
        if (r7 < 0) goto L_0x00ac;
    L_0x00aa:
        r2 = r2 + 1;
    L_0x00ac:
        r4 = r4 + 1;
        if (r8 == 0) goto L_0x008b;
    L_0x00b0:
        r4 = r2;
        r2 = 2131755351; // 0x7f100157 float:1.9141579E38 double:1.0532270843E-314;
        r0 = r18;
        r2 = r0.findViewById(r2);
        r2 = (android.widget.ImageView) r2;
        r6 = new com.whatsapp.vx;
        r0 = r17;
        r7 = r0.a;
        r9 = r5.L;
        if (r9 != 0) goto L_0x02d2;
    L_0x00c6:
        r5 = r3.length;
    L_0x00c7:
        r6.<init>(r7, r4, r5);
        r2.setImageDrawable(r6);
        r0 = r17;
        r2 = r0.a;
        r2 = r2.getWindow();
        r2 = r2.getDecorView();
        r2 = r2.getWidth();
        r4 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r4);
        r4 = -2;
        r5 = 0;
        r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r5);
        r0 = r18;
        r0.measure(r2, r4);
        r2 = 2131755581; // 0x7f10023d float:1.9142045E38 double:1.053227198E-314;
        r0 = r18;
        r2 = r0.findViewById(r2);
        r4 = r2.getMeasuredWidth();
        r5 = r2.getPaddingRight();
        r4 = r4 - r5;
        r2 = r2.getPaddingLeft();
        r9 = r4 + r2;
        r10 = new java.util.ArrayList;
        r10.<init>();
        r4 = new java.util.ArrayList;
        r4.<init>();
        r5 = new java.util.ArrayList;
        r5.<init>();
        r6 = r3.length;
        r2 = 0;
    L_0x0117:
        if (r2 >= r6) goto L_0x015a;
    L_0x0119:
        r7 = r3[r2];
        r11 = com.whatsapp.App.as;
        r7 = r11.b(r7);
        r5.add(r7);
        r11 = r7.l;
        if (r11 != 0) goto L_0x0131;
    L_0x0128:
        r11 = r7.s();
        r4.add(r11);
        if (r8 == 0) goto L_0x0156;
    L_0x0131:
        r11 = r7.b;
        r11 = android.text.TextUtils.isEmpty(r11);
        if (r11 != 0) goto L_0x0140;
    L_0x0139:
        r11 = r7.b;
        r10.add(r11);
        if (r8 == 0) goto L_0x0156;
    L_0x0140:
        r11 = r7.q;
        r11 = android.text.TextUtils.isEmpty(r11);
        if (r11 != 0) goto L_0x014f;
    L_0x0148:
        r11 = r7.q;
        r10.add(r11);
        if (r8 == 0) goto L_0x0156;
    L_0x014f:
        r7 = r7.s();
        r4.add(r7);
    L_0x0156:
        r2 = r2 + 1;
        if (r8 == 0) goto L_0x0117;
    L_0x015a:
        java.util.Collections.sort(r10);
        java.util.Collections.sort(r4);
        r10.addAll(r4);
        r2 = 2131755573; // 0x7f100235 float:1.914203E38 double:1.053227194E-314;
        r0 = r18;
        r2 = r0.findViewById(r2);
        r2 = (android.widget.TextView) r2;
        r5 = "";
        r4 = 0;
        r3 = "";
        r11 = r10.iterator();
        r6 = r4;
        r4 = r5;
        r5 = r3;
    L_0x017c:
        r3 = r11.hasNext();
        if (r3 == 0) goto L_0x026c;
    L_0x0182:
        r3 = r11.next();
        r3 = (java.lang.String) r3;
        r7 = r2.getPaint();
        r12 = new java.lang.StringBuilder;
        r12.<init>();
        r12 = r12.append(r4);
        r13 = z;
        r14 = 2;
        r13 = r13[r14];
        r12 = r12.append(r13);
        r12 = r12.append(r3);
        r12 = r12.toString();
        r12 = r7.measureText(r12);
        r7 = r4.length();
        if (r7 == 0) goto L_0x01dd;
    L_0x01b0:
        r7 = r10.size();
        r7 = r7 - r6;
        r13 = com.whatsapp.App.az;
        r14 = 2131296263; // 0x7f090007 float:1.8210438E38 double:1.0530002647E-314;
        r13 = r13.a(r14, r7);
        r14 = 2;
        r14 = new java.lang.Object[r14];
        r15 = 0;
        r14[r15] = r4;
        r15 = 1;
        r7 = java.lang.Integer.valueOf(r7);
        r14[r15] = r7;
        r7 = java.lang.String.format(r13, r14);
        r13 = r2.getPaint();
        r13 = r13.measureText(r7);
        r14 = (float) r9;
        r13 = (r13 > r14 ? 1 : (r13 == r14 ? 0 : -1));
        if (r13 >= 0) goto L_0x01dd;
    L_0x01dc:
        r5 = r7;
    L_0x01dd:
        r7 = (float) r9;
        r7 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1));
        if (r7 <= 0) goto L_0x023b;
    L_0x01e2:
        r4 = r4.length();
        if (r4 != 0) goto L_0x0212;
    L_0x01e8:
        r4 = r10.size();
        r7 = 1;
        if (r4 != r7) goto L_0x01f1;
    L_0x01ef:
        if (r8 == 0) goto L_0x02d6;
    L_0x01f1:
        r4 = com.whatsapp.App.az;
        r7 = 2131296262; // 0x7f090006 float:1.8210436E38 double:1.053000264E-314;
        r12 = r10.size();
        r4 = r4.a(r7, r12);
        r7 = 1;
        r7 = new java.lang.Object[r7];
        r12 = 0;
        r13 = r10.size();
        r13 = java.lang.Integer.valueOf(r13);
        r7[r12] = r13;
        r4 = java.lang.String.format(r4, r7);
        if (r8 == 0) goto L_0x026c;
    L_0x0212:
        r4 = r5.length();
        if (r4 <= 0) goto L_0x021a;
    L_0x0218:
        if (r8 == 0) goto L_0x02db;
    L_0x021a:
        r4 = com.whatsapp.App.az;
        r7 = 2131296262; // 0x7f090006 float:1.8210436E38 double:1.053000264E-314;
        r12 = r10.size();
        r4 = r4.a(r7, r12);
        r7 = 1;
        r7 = new java.lang.Object[r7];
        r12 = 0;
        r13 = r10.size();
        r13 = java.lang.Integer.valueOf(r13);
        r7[r12] = r13;
        r4 = java.lang.String.format(r4, r7);
        if (r8 == 0) goto L_0x026c;
    L_0x023b:
        r7 = r4.length();
        if (r7 <= 0) goto L_0x0257;
    L_0x0241:
        r7 = new java.lang.StringBuilder;
        r7.<init>();
        r4 = r7.append(r4);
        r7 = z;
        r12 = 1;
        r7 = r7[r12];
        r4 = r4.append(r7);
        r4 = r4.toString();
    L_0x0257:
        r7 = new java.lang.StringBuilder;
        r7.<init>();
        r4 = r7.append(r4);
        r3 = r4.append(r3);
        r4 = r3.toString();
        r3 = r6 + 1;
        if (r8 == 0) goto L_0x02d8;
    L_0x026c:
        r2.setText(r4);
        r2 = 2131755589; // 0x7f100245 float:1.9142062E38 double:1.053227202E-314;
        r0 = r18;
        r2 = r0.findViewById(r2);
        r3 = 8;
        r2.setVisibility(r3);
        return;
    L_0x027e:
        r3 = r5.c();
        if (r8 == 0) goto L_0x0027;
    L_0x0284:
        r0 = r17;
        r3 = r0.a;
        r4 = 2131231000; // 0x7f080118 float:1.8078069E38 double:1.0529680205E-314;
        r3 = r3.getString(r4);
        if (r8 == 0) goto L_0x0027;
    L_0x0291:
        r0 = r17;
        r3 = r0.a;
        r4 = 2131230993; // 0x7f080111 float:1.8078054E38 double:1.052968017E-314;
        r3 = r3.getString(r4);
        if (r8 == 0) goto L_0x0027;
    L_0x029e:
        r0 = r17;
        r3 = r0.a;
        r4 = 2131231003; // 0x7f08011b float:1.8078075E38 double:1.052968022E-314;
        r3 = r3.getString(r4);
        if (r8 == 0) goto L_0x0027;
    L_0x02ab:
        r0 = r17;
        r3 = r0.a;
        r4 = 2131230999; // 0x7f080117 float:1.8078067E38 double:1.05296802E-314;
        r3 = r3.getString(r4);
        if (r8 == 0) goto L_0x0027;
    L_0x02b8:
        r0 = r17;
        r3 = r0.a;
        r4 = 2131231001; // 0x7f080119 float:1.807807E38 double:1.052968021E-314;
        r3 = r3.getString(r4);
        if (r8 == 0) goto L_0x0027;
    L_0x02c5:
        r0 = r17;
        r3 = r0.a;
        r4 = 2131230998; // 0x7f080116 float:1.8078065E38 double:1.0529680195E-314;
        r3 = r3.getString(r4);
        goto L_0x0027;
    L_0x02d2:
        r5 = r5.L;
        goto L_0x00c7;
    L_0x02d6:
        r4 = r3;
        goto L_0x026c;
    L_0x02d8:
        r6 = r3;
        goto L_0x017c;
    L_0x02db:
        r4 = r5;
        goto L_0x026c;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ann.bindView(android.view.View, android.content.Context, android.database.Cursor):void");
    }

    public ann(Broadcasts broadcasts) {
        this.a = broadcasts;
        super(broadcasts, App.aK.w());
    }

    public void a() {
        changeCursor(App.aK.w());
    }

    public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        return aam.a(this.a.getLayoutInflater(), 2130903148, viewGroup, false);
    }
}
