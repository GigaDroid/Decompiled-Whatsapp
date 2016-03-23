package com.whatsapp.protocol;

import com.whatsapp.arj;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

class am extends a {
    private static final String[] z;
    final String[] a;
    final by b;

    static {
        String[] strArr = new String[17];
        String str = ";-j";
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
                        i3 = 81;
                        break;
                    case at.g /*1*/:
                        i3 = 68;
                        break;
                    case at.i /*2*/:
                        i3 = 14;
                        break;
                    case at.o /*3*/:
                        i3 = 72;
                        break;
                    default:
                        i3 = 26;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "8 k&n80w";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "\"-i&{%1|-";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "=-}<";
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "'%b=\u007f";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "#!i!i%6o<s>*";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "46|'hq*a,\u007fq7f'o= . {'!.&o<!|!yq'a,\u007fq%z<h8&{<\u007fkd";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "8 ";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "'%b=\u007f";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "%=~-:?+j-:\",a=v5dm't%%g&:4<o+n==.y:3=z-";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "<-};s?#.\"s5da&:$7k::?+j-";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "2+j-";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "46|'h";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    str = "%=~-";
                    obj = 13;
                    i = 14;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    strArr2 = strArr3;
                    str = "8 ";
                    obj = 14;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "\"/k1";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = ":!w";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    am(by byVar, String[] strArr) {
        this.b = byVar;
        this.a = strArr;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.whatsapp.protocol.cw r17, java.lang.String r18) {
        /*
        r16 = this;
        r9 = com.whatsapp.protocol.co.s;
        r1 = z;
        r2 = 4;
        r1 = r1[r2];
        r0 = r17;
        r1 = r0.f(r1);
        r10 = com.whatsapp.protocol.cw.a(r1);
        r11 = new java.util.Vector;
        r0 = r16;
        r1 = r0.a;
        r1 = r1.length;
        r11.<init>(r1);
        r12 = new java.util.Hashtable;
        r0 = r16;
        r1 = r0.a;
        r1 = r1.length;
        r12.<init>(r1);
        r1 = r10.d;
        if (r1 == 0) goto L_0x0163;
    L_0x0029:
        r1 = 0;
        r8 = r1;
    L_0x002b:
        r1 = r10.d;
        r1 = r1.length;
        if (r8 >= r1) goto L_0x0163;
    L_0x0030:
        r1 = r10.d;
        r1 = r1[r8];
        r2 = z;
        r3 = 0;
        r2 = r2[r3];
        r2 = r1.b(r2);
        if (r2 != 0) goto L_0x004d;
    L_0x003f:
        r1 = new com.whatsapp.protocol.cz;	 Catch:{ NumberFormatException -> 0x004b }
        r2 = z;	 Catch:{ NumberFormatException -> 0x004b }
        r3 = 11;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x004b }
        r1.<init>(r2);	 Catch:{ NumberFormatException -> 0x004b }
        throw r1;	 Catch:{ NumberFormatException -> 0x004b }
    L_0x004b:
        r1 = move-exception;
        throw r1;
    L_0x004d:
        r3 = z;
        r4 = 13;
        r3 = r3[r4];
        r3 = r1.f(r3);
        if (r3 == 0) goto L_0x0074;
    L_0x0059:
        r3 = z;
        r4 = 12;
        r3 = r3[r4];
        r3 = r1.d(r3);
        r4 = new java.lang.Integer;	 Catch:{ NumberFormatException -> 0x00b4 }
        r5 = java.lang.Integer.parseInt(r3);	 Catch:{ NumberFormatException -> 0x00b4 }
        r4.<init>(r5);	 Catch:{ NumberFormatException -> 0x00b4 }
        r11.addElement(r2);
        r12.put(r2, r4);
        if (r9 == 0) goto L_0x015f;
    L_0x0074:
        r3 = z;
        r4 = 2;
        r3 = r3[r4];
        r3 = r1.f(r3);
        r3 = com.whatsapp.protocol.cw.a(r3);
        r4 = z;
        r5 = 6;
        r4 = r4[r5];
        r4 = r1.f(r4);
        r4 = com.whatsapp.protocol.cw.a(r4);
        r5 = z;
        r6 = 14;
        r5 = r5[r6];
        r5 = r1.f(r5);
        r5 = com.whatsapp.protocol.cw.a(r5);
        r6 = r5.a;	 Catch:{ NumberFormatException -> 0x00d1 }
        if (r6 == 0) goto L_0x00a6;
    L_0x00a0:
        r6 = r5.a;	 Catch:{ NumberFormatException -> 0x00b2 }
        r6 = r6.length;	 Catch:{ NumberFormatException -> 0x00b2 }
        r7 = 1;
        if (r6 == r7) goto L_0x00d3;
    L_0x00a6:
        r1 = new com.whatsapp.protocol.cz;	 Catch:{ NumberFormatException -> 0x00b2 }
        r2 = z;	 Catch:{ NumberFormatException -> 0x00b2 }
        r3 = 10;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x00b2 }
        r1.<init>(r2);	 Catch:{ NumberFormatException -> 0x00b2 }
        throw r1;	 Catch:{ NumberFormatException -> 0x00b2 }
    L_0x00b2:
        r1 = move-exception;
        throw r1;
    L_0x00b4:
        r1 = move-exception;
        r1 = new com.whatsapp.protocol.cz;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r4 = z;
        r5 = 7;
        r4 = r4[r5];
        r2 = r2.append(r4);
        r2 = r2.append(r3);
        r2 = r2.toString();
        r1.<init>(r2);
        throw r1;
    L_0x00d1:
        r1 = move-exception;
        throw r1;	 Catch:{ NumberFormatException -> 0x00b2 }
    L_0x00d3:
        r6 = z;
        r7 = 1;
        r6 = r6[r7];
        r6 = r1.f(r6);
        if (r6 == 0) goto L_0x0105;
    L_0x00de:
        r7 = z;
        r13 = 15;
        r7 = r7[r13];
        r7 = r6.f(r7);
        r7 = com.whatsapp.protocol.cw.a(r7);
        r13 = z;
        r14 = 5;
        r13 = r13[r14];
        r6 = r6.f(r13);
        r13 = com.whatsapp.protocol.cw.a(r6);
        r6 = new com.whatsapp.protocol.bz;
        r7 = r7.a;
        r13 = r13.a;
        r14 = 0;
        r6.<init>(r7, r13, r14);
        if (r9 == 0) goto L_0x0106;
    L_0x0105:
        r6 = 0;
    L_0x0106:
        r7 = z;
        r13 = 16;
        r7 = r7[r13];
        r1 = r1.f(r7);
        r1 = com.whatsapp.protocol.cw.a(r1);
        r7 = z;
        r13 = 8;
        r7 = r7[r13];
        r7 = r1.f(r7);
        r13 = com.whatsapp.protocol.cw.a(r7);
        r7 = z;
        r14 = 9;
        r7 = r7[r14];
        r7 = r1.f(r7);
        r14 = com.whatsapp.protocol.cw.a(r7);
        r7 = z;
        r15 = 3;
        r7 = r7[r15];
        r1 = r1.f(r7);
        r15 = com.whatsapp.protocol.cw.a(r1);
        r0 = r16;
        r1 = r0.b;
        r1 = com.whatsapp.protocol.by.a(r1);
        r3 = r3.a;
        r4 = r4.a;
        r5 = r5.a;
        r7 = 0;
        r5 = r5[r7];
        r7 = new com.whatsapp.protocol.bz;
        r13 = r13.a;
        r14 = r14.a;
        r15 = r15.a;
        r7.<init>(r13, r14, r15);
        r1.a(r2, r3, r4, r5, r6, r7);
        r11.addElement(r2);
    L_0x015f:
        r1 = r8 + 1;
        if (r9 == 0) goto L_0x01c1;
    L_0x0163:
        r1 = 0;
        r2 = r1;
    L_0x0165:
        r0 = r16;
        r1 = r0.a;
        r1 = r1.length;
        if (r2 >= r1) goto L_0x01ba;
    L_0x016c:
        r0 = r16;
        r1 = r0.a;	 Catch:{ NumberFormatException -> 0x01bb }
        r1 = r1[r2];	 Catch:{ NumberFormatException -> 0x01bb }
        r1 = r11.contains(r1);	 Catch:{ NumberFormatException -> 0x01bb }
        if (r1 != 0) goto L_0x0189;
    L_0x0178:
        r0 = r16;
        r1 = r0.b;	 Catch:{ NumberFormatException -> 0x01bb }
        r1 = com.whatsapp.protocol.by.a(r1);	 Catch:{ NumberFormatException -> 0x01bb }
        r0 = r16;
        r3 = r0.a;	 Catch:{ NumberFormatException -> 0x01bb }
        r3 = r3[r2];	 Catch:{ NumberFormatException -> 0x01bb }
        r1.a(r3);	 Catch:{ NumberFormatException -> 0x01bb }
    L_0x0189:
        r0 = r16;
        r1 = r0.a;	 Catch:{ NumberFormatException -> 0x01bd }
        r1 = r1[r2];	 Catch:{ NumberFormatException -> 0x01bd }
        r1 = r12.containsKey(r1);	 Catch:{ NumberFormatException -> 0x01bd }
        if (r1 == 0) goto L_0x01b6;
    L_0x0195:
        r0 = r16;
        r1 = r0.b;	 Catch:{ NumberFormatException -> 0x01bd }
        r3 = com.whatsapp.protocol.by.a(r1);	 Catch:{ NumberFormatException -> 0x01bd }
        r0 = r16;
        r1 = r0.a;	 Catch:{ NumberFormatException -> 0x01bd }
        r4 = r1[r2];	 Catch:{ NumberFormatException -> 0x01bd }
        r0 = r16;
        r1 = r0.a;	 Catch:{ NumberFormatException -> 0x01bd }
        r1 = r1[r2];	 Catch:{ NumberFormatException -> 0x01bd }
        r1 = r12.get(r1);	 Catch:{ NumberFormatException -> 0x01bd }
        r1 = (java.lang.Integer) r1;	 Catch:{ NumberFormatException -> 0x01bd }
        r1 = r1.intValue();	 Catch:{ NumberFormatException -> 0x01bd }
        r3.a(r4, r1);	 Catch:{ NumberFormatException -> 0x01bd }
    L_0x01b6:
        r1 = r2 + 1;
        if (r9 == 0) goto L_0x01bf;
    L_0x01ba:
        return;
    L_0x01bb:
        r1 = move-exception;
        throw r1;
    L_0x01bd:
        r1 = move-exception;
        throw r1;
    L_0x01bf:
        r2 = r1;
        goto L_0x0165;
    L_0x01c1:
        r8 = r1;
        goto L_0x002b;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.protocol.am.a(com.whatsapp.protocol.cw, java.lang.String):void");
    }
}
