package com.google;

public final class Y {
    private static final boolean a;
    private static final String b;
    private static final String[] z;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(byte[] r26, java.util.Map r27) {
        /*
        r20 = com.google.d_.a;
        if (r27 == 0) goto L_0x0011;
    L_0x0004:
        r2 = com.google.b3.CHARACTER_SET;
        r0 = r27;
        r2 = r0.get(r2);
        r2 = (java.lang.String) r2;
        if (r2 == 0) goto L_0x0011;
    L_0x0010:
        return r2;
    L_0x0011:
        r0 = r26;
        r0 = r0.length;
        r21 = r0;
        r16 = 1;
        r15 = 1;
        r14 = 1;
        r11 = 0;
        r12 = 0;
        r6 = 0;
        r10 = 0;
        r9 = 0;
        r8 = 0;
        r18 = 0;
        r17 = 0;
        r7 = 0;
        r4 = 0;
        r5 = 0;
        r0 = r26;
        r2 = r0.length;
        r3 = 3;
        if (r2 <= r3) goto L_0x015c;
    L_0x002d:
        r2 = 0;
        r2 = r26[r2];
        r3 = -17;
        if (r2 != r3) goto L_0x015c;
    L_0x0034:
        r2 = 1;
        r2 = r26[r2];
        r3 = -69;
        if (r2 != r3) goto L_0x015c;
    L_0x003b:
        r2 = 2;
        r2 = r26[r2];
        r3 = -65;
        if (r2 != r3) goto L_0x015c;
    L_0x0042:
        r2 = 1;
    L_0x0043:
        r3 = 0;
        r19 = r3;
        r3 = r10;
        r10 = r12;
        r12 = r14;
    L_0x0049:
        r0 = r19;
        r1 = r21;
        if (r0 >= r1) goto L_0x0231;
    L_0x004f:
        if (r16 != 0) goto L_0x0055;
    L_0x0051:
        if (r15 != 0) goto L_0x0055;
    L_0x0053:
        if (r12 == 0) goto L_0x0231;
    L_0x0055:
        r13 = r26[r19];
        r0 = r13 & 255;
        r22 = r0;
        if (r12 == 0) goto L_0x022a;
    L_0x005d:
        if (r11 <= 0) goto L_0x0227;
    L_0x005f:
        r0 = r22;
        r13 = r0 & 128;
        if (r13 != 0) goto L_0x0224;
    L_0x0065:
        r14 = 0;
        if (r20 == 0) goto L_0x021e;
    L_0x0068:
        r11 = r11 + -1;
        if (r20 == 0) goto L_0x021e;
    L_0x006c:
        r0 = r22;
        r12 = r0 & 128;
        if (r12 == 0) goto L_0x021e;
    L_0x0072:
        r12 = r22 & 64;
        if (r12 != 0) goto L_0x0079;
    L_0x0076:
        r14 = 0;
        if (r20 == 0) goto L_0x021e;
    L_0x0079:
        r11 = r11 + 1;
        r12 = r22 & 32;
        if (r12 != 0) goto L_0x0083;
    L_0x007f:
        r10 = r10 + 1;
        if (r20 == 0) goto L_0x021e;
    L_0x0083:
        r11 = r11 + 1;
        r12 = r22 & 16;
        if (r12 != 0) goto L_0x008d;
    L_0x0089:
        r6 = r6 + 1;
        if (r20 == 0) goto L_0x021e;
    L_0x008d:
        r11 = r11 + 1;
        r12 = r22 & 8;
        if (r12 != 0) goto L_0x0097;
    L_0x0093:
        r3 = r3 + 1;
        if (r20 == 0) goto L_0x021e;
    L_0x0097:
        r14 = 0;
        r12 = r10;
        r13 = r11;
        r10 = r3;
        r11 = r6;
    L_0x009c:
        if (r16 == 0) goto L_0x021b;
    L_0x009e:
        r3 = 127; // 0x7f float:1.78E-43 double:6.27E-322;
        r0 = r22;
        if (r0 <= r3) goto L_0x00ae;
    L_0x00a4:
        r3 = 160; // 0xa0 float:2.24E-43 double:7.9E-322;
        r0 = r22;
        if (r0 >= r3) goto L_0x00ae;
    L_0x00aa:
        r16 = 0;
        if (r20 == 0) goto L_0x021b;
    L_0x00ae:
        r3 = 159; // 0x9f float:2.23E-43 double:7.86E-322;
        r0 = r22;
        if (r0 <= r3) goto L_0x021b;
    L_0x00b4:
        r3 = 192; // 0xc0 float:2.69E-43 double:9.5E-322;
        r0 = r22;
        if (r0 < r3) goto L_0x00c6;
    L_0x00ba:
        r3 = 215; // 0xd7 float:3.01E-43 double:1.06E-321;
        r0 = r22;
        if (r0 == r3) goto L_0x00c6;
    L_0x00c0:
        r3 = 247; // 0xf7 float:3.46E-43 double:1.22E-321;
        r0 = r22;
        if (r0 != r3) goto L_0x021b;
    L_0x00c6:
        r5 = r5 + 1;
        r6 = r5;
    L_0x00c9:
        if (r15 == 0) goto L_0x020e;
    L_0x00cb:
        if (r9 <= 0) goto L_0x0218;
    L_0x00cd:
        r3 = 64;
        r0 = r22;
        if (r0 < r3) goto L_0x00df;
    L_0x00d3:
        r3 = 127; // 0x7f float:1.78E-43 double:6.27E-322;
        r0 = r22;
        if (r0 == r3) goto L_0x00df;
    L_0x00d9:
        r3 = 252; // 0xfc float:3.53E-43 double:1.245E-321;
        r0 = r22;
        if (r0 <= r3) goto L_0x00e2;
    L_0x00df:
        r15 = 0;
        if (r20 == 0) goto L_0x020e;
    L_0x00e2:
        r3 = r9 + -1;
        if (r20 == 0) goto L_0x0201;
    L_0x00e6:
        r5 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        r0 = r22;
        if (r0 == r5) goto L_0x00f8;
    L_0x00ec:
        r5 = 160; // 0xa0 float:2.24E-43 double:7.9E-322;
        r0 = r22;
        if (r0 == r5) goto L_0x00f8;
    L_0x00f2:
        r5 = 239; // 0xef float:3.35E-43 double:1.18E-321;
        r0 = r22;
        if (r0 <= r5) goto L_0x00fb;
    L_0x00f8:
        r15 = 0;
        if (r20 == 0) goto L_0x0201;
    L_0x00fb:
        r5 = 160; // 0xa0 float:2.24E-43 double:7.9E-322;
        r0 = r22;
        if (r0 <= r5) goto L_0x01fe;
    L_0x0101:
        r5 = 224; // 0xe0 float:3.14E-43 double:1.107E-321;
        r0 = r22;
        if (r0 >= r5) goto L_0x01fe;
    L_0x0107:
        r9 = r8 + 1;
        r8 = 0;
        r5 = r18 + 1;
        if (r5 <= r7) goto L_0x01f0;
    L_0x010e:
        if (r20 == 0) goto L_0x01e5;
    L_0x0110:
        r7 = r5;
        r17 = r8;
    L_0x0113:
        r5 = 127; // 0x7f float:1.78E-43 double:6.27E-322;
        r0 = r22;
        if (r0 <= r5) goto L_0x01de;
    L_0x0119:
        r5 = r3 + 1;
        r8 = 0;
        r3 = r17 + 1;
        if (r3 <= r4) goto L_0x01d0;
    L_0x0120:
        if (r20 == 0) goto L_0x01c1;
    L_0x0122:
        r4 = r5;
    L_0x0123:
        r8 = 0;
        r5 = 0;
        r23 = r3;
        r3 = r7;
        r7 = r4;
        r4 = r23;
        r24 = r8;
        r8 = r15;
        r15 = r24;
        r25 = r5;
        r5 = r9;
        r9 = r25;
    L_0x0135:
        r17 = r19 + 1;
        if (r20 == 0) goto L_0x01af;
    L_0x0139:
        r9 = r7;
        r7 = r3;
        r3 = r8;
        r8 = r5;
        r5 = r6;
        r6 = r4;
        r4 = r14;
        r14 = r16;
    L_0x0142:
        if (r4 == 0) goto L_0x0147;
    L_0x0144:
        if (r13 <= 0) goto L_0x0147;
    L_0x0146:
        r4 = 0;
    L_0x0147:
        if (r3 == 0) goto L_0x014c;
    L_0x0149:
        if (r9 <= 0) goto L_0x014c;
    L_0x014b:
        r3 = 0;
    L_0x014c:
        if (r4 == 0) goto L_0x015f;
    L_0x014e:
        if (r2 != 0) goto L_0x0155;
    L_0x0150:
        r2 = r12 + r11;
        r2 = r2 + r10;
        if (r2 <= 0) goto L_0x015f;
    L_0x0155:
        r2 = z;
        r3 = 2;
        r2 = r2[r3];
        goto L_0x0010;
    L_0x015c:
        r2 = 0;
        goto L_0x0043;
    L_0x015f:
        if (r3 == 0) goto L_0x0172;
    L_0x0161:
        r2 = a;
        if (r2 != 0) goto L_0x016b;
    L_0x0165:
        r2 = 3;
        if (r7 >= r2) goto L_0x016b;
    L_0x0168:
        r2 = 3;
        if (r6 < r2) goto L_0x0172;
    L_0x016b:
        r2 = z;
        r3 = 1;
        r2 = r2[r3];
        goto L_0x0010;
    L_0x0172:
        if (r14 == 0) goto L_0x0190;
    L_0x0174:
        if (r3 == 0) goto L_0x0190;
    L_0x0176:
        r2 = 2;
        if (r7 != r2) goto L_0x017c;
    L_0x0179:
        r2 = 2;
        if (r8 == r2) goto L_0x0182;
    L_0x017c:
        r2 = r5 * 10;
        r0 = r21;
        if (r2 < r0) goto L_0x0189;
    L_0x0182:
        r2 = z;
        r3 = 6;
        r2 = r2[r3];
        goto L_0x0010;
    L_0x0189:
        r2 = z;
        r3 = 3;
        r2 = r2[r3];
        goto L_0x0010;
    L_0x0190:
        if (r14 == 0) goto L_0x0199;
    L_0x0192:
        r2 = z;
        r3 = 0;
        r2 = r2[r3];
        goto L_0x0010;
    L_0x0199:
        if (r3 == 0) goto L_0x01a2;
    L_0x019b:
        r2 = z;
        r3 = 5;
        r2 = r2[r3];
        goto L_0x0010;
    L_0x01a2:
        if (r4 == 0) goto L_0x01ab;
    L_0x01a4:
        r2 = z;
        r3 = 4;
        r2 = r2[r3];
        goto L_0x0010;
    L_0x01ab:
        r2 = b;
        goto L_0x0010;
    L_0x01af:
        r19 = r17;
        r18 = r15;
        r17 = r9;
        r15 = r8;
        r8 = r5;
        r9 = r7;
        r5 = r6;
        r7 = r3;
        r6 = r11;
        r3 = r10;
        r11 = r13;
        r10 = r12;
        r12 = r14;
        goto L_0x0049;
    L_0x01c1:
        r4 = r3;
        r23 = r7;
        r7 = r5;
        r5 = r9;
        r9 = r3;
        r3 = r23;
        r24 = r8;
        r8 = r15;
        r15 = r24;
        goto L_0x0135;
    L_0x01d0:
        r23 = r7;
        r7 = r5;
        r5 = r9;
        r9 = r3;
        r3 = r23;
        r24 = r8;
        r8 = r15;
        r15 = r24;
        goto L_0x0135;
    L_0x01de:
        r23 = r4;
        r4 = r3;
        r3 = r23;
        goto L_0x0123;
    L_0x01e5:
        r7 = r3;
        r3 = r5;
        r23 = r5;
        r5 = r9;
        r9 = r8;
        r8 = r15;
        r15 = r23;
        goto L_0x0135;
    L_0x01f0:
        r23 = r7;
        r7 = r3;
        r3 = r23;
        r24 = r5;
        r5 = r9;
        r9 = r8;
        r8 = r15;
        r15 = r24;
        goto L_0x0135;
    L_0x01fe:
        r9 = r8;
        goto L_0x0113;
    L_0x0201:
        r9 = r17;
        r5 = r8;
        r8 = r15;
        r15 = r18;
        r23 = r3;
        r3 = r7;
        r7 = r23;
        goto L_0x0135;
    L_0x020e:
        r3 = r7;
        r5 = r8;
        r7 = r9;
        r8 = r15;
        r15 = r18;
        r9 = r17;
        goto L_0x0135;
    L_0x0218:
        r3 = r9;
        goto L_0x00e6;
    L_0x021b:
        r6 = r5;
        goto L_0x00c9;
    L_0x021e:
        r12 = r10;
        r13 = r11;
        r10 = r3;
        r11 = r6;
        goto L_0x009c;
    L_0x0224:
        r14 = r12;
        goto L_0x0068;
    L_0x0227:
        r14 = r12;
        goto L_0x006c;
    L_0x022a:
        r13 = r11;
        r14 = r12;
        r12 = r10;
        r11 = r6;
        r10 = r3;
        goto L_0x009c;
    L_0x0231:
        r13 = r11;
        r14 = r16;
        r11 = r6;
        r6 = r4;
        r4 = r12;
        r12 = r10;
        r10 = r3;
        r3 = r15;
        goto L_0x0142;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.Y.a(byte[], java.util.Map):java.lang.String");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static {
        /*
        r4 = 2;
        r1 = -1;
        r3 = 1;
        r5 = 5;
        r2 = 0;
        r0 = 7;
        r6 = new java.lang.String[r0];
        r0 = "v@q=M\n*a4";
        r7 = r2;
        r8 = r6;
        r9 = r6;
        r6 = r0;
        r0 = r1;
    L_0x0010:
        r6 = r6.toCharArray();
        r10 = r6.length;
        r11 = r10;
        r12 = r2;
        r10 = r6;
    L_0x0018:
        if (r11 > r12) goto L_0x0096;
    L_0x001a:
        r6 = new java.lang.String;
        r6.<init>(r10);
        r6 = r6.intern();
        switch(r0) {
            case 0: goto L_0x0030;
            case 1: goto L_0x003a;
            case 2: goto L_0x0045;
            case 3: goto L_0x004e;
            case 4: goto L_0x0057;
            case 5: goto L_0x0062;
            default: goto L_0x0026;
        };
    L_0x0026:
        r8[r7] = r6;
        r0 = "lYwV";
        r6 = r0;
        r7 = r3;
        r8 = r9;
        r0 = r2;
        goto L_0x0010;
    L_0x0030:
        r8[r7] = r6;
        r0 = "jGx=";
        r6 = r0;
        r7 = r4;
        r8 = r9;
        r0 = r3;
        goto L_0x0010;
    L_0x003a:
        r8[r7] = r6;
        r6 = 3;
        r0 = "v@q=M\n*a4";
        r7 = r6;
        r8 = r9;
        r6 = r0;
        r0 = r4;
        goto L_0x0010;
    L_0x0045:
        r8[r7] = r6;
        r7 = 4;
        r6 = "jGx=";
        r0 = 3;
        r8 = r9;
        goto L_0x0010;
    L_0x004e:
        r8[r7] = r6;
        r6 = "lYwV";
        r0 = 4;
        r7 = r5;
        r8 = r9;
        goto L_0x0010;
    L_0x0057:
        r8[r7] = r6;
        r6 = 6;
        r0 = "lYwV";
        r7 = r6;
        r8 = r9;
        r6 = r0;
        r0 = r5;
        goto L_0x0010;
    L_0x0062:
        r8[r7] = r6;
        z = r9;
        r0 = java.nio.charset.Charset.defaultCharset();
        r0 = r0.name();
        b = r0;
        r0 = "lYwV";
    L_0x0073:
        r0 = r0.toCharArray();
        r4 = r0.length;
        r6 = r4;
        r7 = r2;
        r4 = r0;
    L_0x007b:
        if (r6 > r7) goto L_0x00b3;
    L_0x007d:
        r0 = new java.lang.String;
        r0.<init>(r4);
        r0 = r0.intern();
        switch(r1) {
            case 0: goto L_0x00cf;
            default: goto L_0x0089;
        };
    L_0x0089:
        r1 = b;
        r0 = r0.equalsIgnoreCase(r1);
        if (r0 != 0) goto L_0x00d7;
    L_0x0091:
        r0 = "zF}Z?o";
        r1 = r2;
        goto L_0x0073;
    L_0x0096:
        r13 = r10[r12];
        r6 = r12 % 5;
        switch(r6) {
            case 0: goto L_0x00a8;
            case 1: goto L_0x00ab;
            case 2: goto L_0x00ae;
            case 3: goto L_0x00b1;
            default: goto L_0x009d;
        };
    L_0x009d:
        r6 = 117; // 0x75 float:1.64E-43 double:5.8E-322;
    L_0x009f:
        r6 = r6 ^ r13;
        r6 = (char) r6;
        r10[r12] = r6;
        r6 = r12 + 1;
        r12 = r6;
        goto L_0x0018;
    L_0x00a8:
        r6 = 63;
        goto L_0x009f;
    L_0x00ab:
        r6 = 19;
        goto L_0x009f;
    L_0x00ae:
        r6 = 62;
        goto L_0x009f;
    L_0x00b1:
        r6 = r5;
        goto L_0x009f;
    L_0x00b3:
        r8 = r4[r7];
        r0 = r7 % 5;
        switch(r0) {
            case 0: goto L_0x00c4;
            case 1: goto L_0x00c7;
            case 2: goto L_0x00ca;
            case 3: goto L_0x00cd;
            default: goto L_0x00ba;
        };
    L_0x00ba:
        r0 = 117; // 0x75 float:1.64E-43 double:5.8E-322;
    L_0x00bc:
        r0 = r0 ^ r8;
        r0 = (char) r0;
        r4[r7] = r0;
        r0 = r7 + 1;
        r7 = r0;
        goto L_0x007b;
    L_0x00c4:
        r0 = 63;
        goto L_0x00bc;
    L_0x00c7:
        r0 = 19;
        goto L_0x00bc;
    L_0x00ca:
        r0 = 62;
        goto L_0x00bc;
    L_0x00cd:
        r0 = r5;
        goto L_0x00bc;
    L_0x00cf:
        r1 = b;
        r0 = r0.equalsIgnoreCase(r1);
        if (r0 == 0) goto L_0x00d8;
    L_0x00d7:
        r2 = r3;
    L_0x00d8:
        a = r2;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.Y.<clinit>():void");
    }
}
