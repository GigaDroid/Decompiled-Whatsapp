package com.google;

import com.whatsapp.arj;
import org.v;
import org.whispersystems.at;

public final class aV extends aU {
    static final int[][] b;
    private static final String[] z;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int[] a(com.google.d_ r13) {
        /*
        r8 = com.google.aU.a;
        r9 = r13.d();
        r0 = 0;
        r0 = r13.c(r0);
        r1 = 0;
        r2 = 6;
        r10 = new int[r2];
        r2 = 0;
        r11 = r10.length;
        r7 = r0;
    L_0x0012:
        if (r7 >= r9) goto L_0x008e;
    L_0x0014:
        r3 = r13.f(r7);
        r3 = r3 ^ r2;
        if (r3 == 0) goto L_0x0023;
    L_0x001b:
        r3 = r10[r1];
        r3 = r3 + 1;
        r10[r1] = r3;
        if (r8 == 0) goto L_0x008a;
    L_0x0023:
        r3 = r11 + -1;
        if (r1 != r3) goto L_0x0082;
    L_0x0027:
        r6 = 1048576000; // 0x3e800000 float:0.25 double:5.180653787E-315;
        r3 = -1;
        r4 = 103; // 0x67 float:1.44E-43 double:5.1E-322;
    L_0x002c:
        r5 = 105; // 0x69 float:1.47E-43 double:5.2E-322;
        if (r4 > r5) goto L_0x0044;
    L_0x0030:
        r5 = b;
        r5 = r5[r4];
        r12 = 1060320051; // 0x3f333333 float:0.7 double:5.23867711E-315;
        r5 = com.google.aU.a(r10, r5, r12);
        r12 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1));
        if (r12 >= 0) goto L_0x009a;
    L_0x003f:
        r3 = r4;
    L_0x0040:
        r4 = r4 + 1;
        if (r8 == 0) goto L_0x0098;
    L_0x0044:
        if (r3 < 0) goto L_0x0065;
    L_0x0046:
        r4 = 0;
        r5 = r7 - r0;
        r5 = r5 / 2;
        r5 = r0 - r5;
        r4 = java.lang.Math.max(r4, r5);
        r5 = 0;
        r4 = r13.a(r4, r0, r5);
        if (r4 == 0) goto L_0x0065;
    L_0x0058:
        r1 = 3;
        r1 = new int[r1];
        r2 = 0;
        r1[r2] = r0;
        r0 = 1;
        r1[r0] = r7;
        r0 = 2;
        r1[r0] = r3;
        return r1;
    L_0x0065:
        r3 = 0;
        r3 = r10[r3];
        r4 = 1;
        r4 = r10[r4];
        r3 = r3 + r4;
        r0 = r0 + r3;
        r3 = 2;
        r4 = 0;
        r5 = r11 + -2;
        java.lang.System.arraycopy(r10, r3, r10, r4, r5);
        r3 = r11 + -2;
        r4 = 0;
        r10[r3] = r4;
        r3 = r11 + -1;
        r4 = 0;
        r10[r3] = r4;
        r1 = r1 + -1;
        if (r8 == 0) goto L_0x0084;
    L_0x0082:
        r1 = r1 + 1;
    L_0x0084:
        r3 = 1;
        r10[r1] = r3;
        if (r2 != 0) goto L_0x0093;
    L_0x0089:
        r2 = 1;
    L_0x008a:
        r3 = r7 + 1;
        if (r8 == 0) goto L_0x0095;
    L_0x008e:
        r0 = com.google.aN.a();
        throw r0;
    L_0x0093:
        r2 = 0;
        goto L_0x008a;
    L_0x0095:
        r7 = r3;
        goto L_0x0012;
    L_0x0098:
        r6 = r5;
        goto L_0x002c;
    L_0x009a:
        r5 = r6;
        goto L_0x0040;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.aV.a(com.google.d_):int[]");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.f6 a(int r26, com.google.d_ r27, java.util.Map r28) {
        /*
        r25 = this;
        r17 = com.google.aU.a;
        if (r28 == 0) goto L_0x0031;
    L_0x0004:
        r2 = com.google.b3.ASSUME_GS1;
        r0 = r28;
        r2 = r0.containsKey(r2);
        if (r2 == 0) goto L_0x0031;
    L_0x000e:
        r2 = 1;
    L_0x000f:
        r18 = a(r27);
        r3 = 2;
        r7 = r18[r3];
        r19 = new java.util.ArrayList;
        r3 = 20;
        r0 = r19;
        r0.<init>(r3);
        r3 = (byte) r7;
        r3 = java.lang.Byte.valueOf(r3);
        r0 = r19;
        r0.add(r3);
        switch(r7) {
            case 103: goto L_0x0033;
            case 104: goto L_0x003e;
            case 105: goto L_0x0042;
            default: goto L_0x002c;
        };
    L_0x002c:
        r2 = com.google.aG.a();
        throw r2;
    L_0x0031:
        r2 = 0;
        goto L_0x000f;
    L_0x0033:
        r3 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
        if (r17 == 0) goto L_0x0046;
    L_0x0037:
        r3 = com.google.aK.a;
        if (r3 == 0) goto L_0x00df;
    L_0x003b:
        r3 = 0;
    L_0x003c:
        com.google.aK.a = r3;
    L_0x003e:
        r3 = 100;
        if (r17 == 0) goto L_0x0046;
    L_0x0042:
        r3 = 99;
        if (r17 != 0) goto L_0x002c;
    L_0x0046:
        r14 = 0;
        r13 = 0;
        r20 = new java.lang.StringBuilder;
        r4 = 20;
        r0 = r20;
        r0.<init>(r4);
        r4 = 0;
        r10 = r18[r4];
        r4 = 1;
        r11 = r18[r4];
        r4 = 6;
        r0 = new int[r4];
        r21 = r0;
        r8 = 0;
        r9 = 0;
        r4 = 0;
        r5 = 1;
        r6 = 0;
        r12 = 0;
        r16 = r13;
        r24 = r7;
        r7 = r8;
        r8 = r3;
        r3 = r4;
        r4 = r24;
    L_0x006b:
        if (r14 != 0) goto L_0x0312;
    L_0x006d:
        r7 = 0;
        r0 = r27;
        r1 = r21;
        r15 = a(r0, r1, r11);
        r10 = (byte) r15;
        r10 = java.lang.Byte.valueOf(r10);
        r0 = r19;
        r0.add(r10);
        r10 = 106; // 0x6a float:1.49E-43 double:5.24E-322;
        if (r15 == r10) goto L_0x030f;
    L_0x0084:
        r13 = 1;
    L_0x0085:
        r5 = 106; // 0x6a float:1.49E-43 double:5.24E-322;
        if (r15 == r5) goto L_0x008e;
    L_0x0089:
        r3 = r3 + 1;
        r5 = r3 * r15;
        r4 = r4 + r5;
    L_0x008e:
        r0 = r21;
        r0 = r0.length;
        r22 = r0;
        r5 = 0;
        r10 = r11;
    L_0x0095:
        r0 = r22;
        if (r5 >= r0) goto L_0x00a1;
    L_0x0099:
        r23 = r21[r5];
        r10 = r10 + r23;
        r5 = r5 + 1;
        if (r17 == 0) goto L_0x0095;
    L_0x00a1:
        switch(r15) {
            case 103: goto L_0x00e2;
            case 104: goto L_0x00e2;
            case 105: goto L_0x00e2;
            default: goto L_0x00a4;
        };
    L_0x00a4:
        switch(r8) {
            case 99: goto L_0x02ff;
            case 100: goto L_0x030a;
            case 101: goto L_0x00e7;
            default: goto L_0x00a7;
        };
    L_0x00a7:
        r24 = r12;
        r12 = r6;
        r6 = r13;
        r13 = r7;
        r7 = r24;
    L_0x00ae:
        if (r16 == 0) goto L_0x00b7;
    L_0x00b0:
        r5 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
        if (r8 != r5) goto L_0x0247;
    L_0x00b4:
        r5 = 100;
    L_0x00b6:
        r8 = r5;
    L_0x00b7:
        if (r17 == 0) goto L_0x02d0;
    L_0x00b9:
        r2 = r6;
        r5 = r9;
        r6 = r10;
    L_0x00bc:
        r7 = r6 - r11;
        r0 = r27;
        r6 = r0.d(r6);
        r9 = r27.d();
        r10 = r6 - r11;
        r10 = r10 / 2;
        r10 = r10 + r6;
        r9 = java.lang.Math.min(r9, r10);
        r10 = 0;
        r0 = r27;
        r6 = r0.a(r6, r9, r10);
        if (r6 != 0) goto L_0x024b;
    L_0x00da:
        r2 = com.google.aN.a();
        throw r2;
    L_0x00df:
        r3 = 1;
        goto L_0x003c;
    L_0x00e2:
        r2 = com.google.aG.a();
        throw r2;
    L_0x00e7:
        r5 = 64;
        if (r15 >= r5) goto L_0x02fc;
    L_0x00eb:
        if (r12 != r6) goto L_0x00f7;
    L_0x00ed:
        r5 = r15 + 32;
        r5 = (char) r5;
        r0 = r20;
        r0.append(r5);
        if (r17 == 0) goto L_0x0101;
    L_0x00f7:
        r5 = r15 + 32;
        r5 = r5 + 128;
        r5 = (char) r5;
        r0 = r20;
        r0.append(r5);
    L_0x0101:
        r5 = 0;
        if (r17 == 0) goto L_0x02f6;
    L_0x0104:
        r12 = 96;
        if (r15 >= r12) goto L_0x011f;
    L_0x0108:
        if (r5 != r6) goto L_0x0114;
    L_0x010a:
        r5 = r15 + -64;
        r5 = (char) r5;
        r0 = r20;
        r0.append(r5);
        if (r17 == 0) goto L_0x011c;
    L_0x0114:
        r5 = r15 + 64;
        r5 = (char) r5;
        r0 = r20;
        r0.append(r5);
    L_0x011c:
        r5 = 0;
        if (r17 == 0) goto L_0x02f6;
    L_0x011f:
        r12 = 106; // 0x6a float:1.49E-43 double:5.24E-322;
        if (r15 == r12) goto L_0x02f3;
    L_0x0123:
        r12 = 0;
    L_0x0124:
        switch(r15) {
            case 96: goto L_0x01a9;
            case 97: goto L_0x01a9;
            case 98: goto L_0x01be;
            case 99: goto L_0x01c7;
            case 100: goto L_0x01c3;
            case 101: goto L_0x01ab;
            case 102: goto L_0x018b;
            case 103: goto L_0x0127;
            case 104: goto L_0x0127;
            case 105: goto L_0x0127;
            case 106: goto L_0x01cb;
            default: goto L_0x0127;
        };
    L_0x0127:
        r13 = r8;
        r8 = r14;
    L_0x0129:
        if (r17 == 0) goto L_0x02de;
    L_0x012b:
        r24 = r8;
        r8 = r13;
        r13 = r24;
    L_0x0130:
        r14 = 96;
        if (r15 >= r14) goto L_0x014d;
    L_0x0134:
        if (r5 != r6) goto L_0x0140;
    L_0x0136:
        r5 = r15 + 32;
        r5 = (char) r5;
        r0 = r20;
        r0.append(r5);
        if (r17 == 0) goto L_0x014a;
    L_0x0140:
        r5 = r15 + 32;
        r5 = r5 + 128;
        r5 = (char) r5;
        r0 = r20;
        r0.append(r5);
    L_0x014a:
        r5 = 0;
        if (r17 == 0) goto L_0x02e9;
    L_0x014d:
        r14 = 106; // 0x6a float:1.49E-43 double:5.24E-322;
        if (r15 == r14) goto L_0x0152;
    L_0x0151:
        r12 = 0;
    L_0x0152:
        switch(r15) {
            case 96: goto L_0x01ee;
            case 97: goto L_0x01ee;
            case 98: goto L_0x0203;
            case 99: goto L_0x020c;
            case 100: goto L_0x01f0;
            case 101: goto L_0x0208;
            case 102: goto L_0x01d0;
            case 103: goto L_0x0155;
            case 104: goto L_0x0155;
            case 105: goto L_0x0155;
            case 106: goto L_0x0210;
            default: goto L_0x0155;
        };
    L_0x0155:
        r24 = r13;
        r13 = r8;
        r8 = r24;
    L_0x015a:
        if (r17 == 0) goto L_0x02de;
    L_0x015c:
        r24 = r5;
        r5 = r13;
        r13 = r8;
        r8 = r12;
        r12 = r7;
        r7 = r6;
        r6 = r24;
    L_0x0165:
        r14 = 100;
        if (r15 >= r14) goto L_0x017b;
    L_0x0169:
        r14 = 10;
        if (r15 >= r14) goto L_0x0174;
    L_0x016d:
        r14 = 48;
        r0 = r20;
        r0.append(r14);
    L_0x0174:
        r0 = r20;
        r0.append(r15);
        if (r17 == 0) goto L_0x0183;
    L_0x017b:
        r14 = 106; // 0x6a float:1.49E-43 double:5.24E-322;
        if (r15 == r14) goto L_0x0180;
    L_0x017f:
        r8 = 0;
    L_0x0180:
        switch(r15) {
            case 100: goto L_0x023a;
            case 101: goto L_0x0236;
            case 102: goto L_0x0218;
            case 103: goto L_0x0183;
            case 104: goto L_0x0183;
            case 105: goto L_0x0183;
            case 106: goto L_0x023e;
            default: goto L_0x0183;
        };
    L_0x0183:
        r14 = r13;
        r13 = r12;
        r12 = r7;
        r7 = r6;
        r6 = r8;
        r8 = r5;
        goto L_0x00ae;
    L_0x018b:
        if (r2 == 0) goto L_0x0127;
    L_0x018d:
        r13 = r20.length();
        if (r13 != 0) goto L_0x01a0;
    L_0x0193:
        r13 = z;
        r22 = 1;
        r13 = r13[r22];
        r0 = r20;
        r0.append(r13);
        if (r17 == 0) goto L_0x0127;
    L_0x01a0:
        r13 = 29;
        r0 = r20;
        r0.append(r13);
        if (r17 == 0) goto L_0x0127;
    L_0x01a9:
        if (r17 == 0) goto L_0x0127;
    L_0x01ab:
        if (r6 != 0) goto L_0x01b3;
    L_0x01ad:
        if (r5 == 0) goto L_0x01b3;
    L_0x01af:
        r6 = 1;
        r5 = 0;
        if (r17 == 0) goto L_0x0127;
    L_0x01b3:
        if (r6 == 0) goto L_0x01bb;
    L_0x01b5:
        if (r5 == 0) goto L_0x01bb;
    L_0x01b7:
        r6 = 0;
        r5 = 0;
        if (r17 == 0) goto L_0x0127;
    L_0x01bb:
        r5 = 1;
        if (r17 == 0) goto L_0x0127;
    L_0x01be:
        r7 = 1;
        r8 = 100;
        if (r17 == 0) goto L_0x0127;
    L_0x01c3:
        r8 = 100;
        if (r17 == 0) goto L_0x0127;
    L_0x01c7:
        r8 = 99;
        if (r17 == 0) goto L_0x0127;
    L_0x01cb:
        r14 = 1;
        r13 = r8;
        r8 = r14;
        goto L_0x0129;
    L_0x01d0:
        if (r2 == 0) goto L_0x0155;
    L_0x01d2:
        r14 = r20.length();
        if (r14 != 0) goto L_0x01e5;
    L_0x01d8:
        r14 = z;
        r22 = 0;
        r14 = r14[r22];
        r0 = r20;
        r0.append(r14);
        if (r17 == 0) goto L_0x0155;
    L_0x01e5:
        r14 = 29;
        r0 = r20;
        r0.append(r14);
        if (r17 == 0) goto L_0x0155;
    L_0x01ee:
        if (r17 == 0) goto L_0x0155;
    L_0x01f0:
        if (r6 != 0) goto L_0x01f8;
    L_0x01f2:
        if (r5 == 0) goto L_0x01f8;
    L_0x01f4:
        r6 = 1;
        r5 = 0;
        if (r17 == 0) goto L_0x0155;
    L_0x01f8:
        if (r6 == 0) goto L_0x0200;
    L_0x01fa:
        if (r5 == 0) goto L_0x0200;
    L_0x01fc:
        r6 = 0;
        r5 = 0;
        if (r17 == 0) goto L_0x0155;
    L_0x0200:
        r5 = 1;
        if (r17 == 0) goto L_0x0155;
    L_0x0203:
        r7 = 1;
        r8 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
        if (r17 == 0) goto L_0x0155;
    L_0x0208:
        r8 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
        if (r17 == 0) goto L_0x0155;
    L_0x020c:
        r8 = 99;
        if (r17 == 0) goto L_0x0155;
    L_0x0210:
        r13 = 1;
        r24 = r13;
        r13 = r8;
        r8 = r24;
        goto L_0x015a;
    L_0x0218:
        if (r2 == 0) goto L_0x0183;
    L_0x021a:
        r14 = r20.length();
        if (r14 != 0) goto L_0x022d;
    L_0x0220:
        r14 = z;
        r22 = 2;
        r14 = r14[r22];
        r0 = r20;
        r0.append(r14);
        if (r17 == 0) goto L_0x0183;
    L_0x022d:
        r14 = 29;
        r0 = r20;
        r0.append(r14);
        if (r17 == 0) goto L_0x0183;
    L_0x0236:
        r5 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
        if (r17 == 0) goto L_0x0183;
    L_0x023a:
        r5 = 100;
        if (r17 == 0) goto L_0x0183;
    L_0x023e:
        r13 = 1;
        r14 = r13;
        r13 = r12;
        r12 = r7;
        r7 = r6;
        r6 = r8;
        r8 = r5;
        goto L_0x00ae;
    L_0x0247:
        r5 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
        goto L_0x00b6;
    L_0x024b:
        r3 = r3 * r5;
        r3 = r4 - r3;
        r3 = r3 % 103;
        if (r3 == r5) goto L_0x0257;
    L_0x0252:
        r2 = com.google.aC.a();
        throw r2;
    L_0x0257:
        r3 = r20.length();
        if (r3 != 0) goto L_0x0262;
    L_0x025d:
        r2 = com.google.aN.a();
        throw r2;
    L_0x0262:
        if (r3 <= 0) goto L_0x027a;
    L_0x0264:
        if (r2 == 0) goto L_0x027a;
    L_0x0266:
        r2 = 99;
        if (r8 != r2) goto L_0x0273;
    L_0x026a:
        r2 = r3 + -2;
        r0 = r20;
        r0.delete(r2, r3);
        if (r17 == 0) goto L_0x027a;
    L_0x0273:
        r2 = r3 + -1;
        r0 = r20;
        r0.delete(r2, r3);
    L_0x027a:
        r2 = 1;
        r2 = r18[r2];
        r3 = 0;
        r3 = r18[r3];
        r2 = r2 + r3;
        r2 = (float) r2;
        r3 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r4 = r2 / r3;
        r2 = (float) r11;
        r3 = (float) r7;
        r5 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r3 = r3 / r5;
        r5 = r2 + r3;
        r6 = r19.size();
        r7 = new byte[r6];
        r2 = 0;
        r3 = r2;
    L_0x0295:
        if (r3 >= r6) goto L_0x02a9;
    L_0x0297:
        r0 = r19;
        r2 = r0.get(r3);
        r2 = (java.lang.Byte) r2;
        r2 = r2.byteValue();
        r7[r3] = r2;
        r2 = r3 + 1;
        if (r17 == 0) goto L_0x02ce;
    L_0x02a9:
        r2 = new com.google.f6;
        r3 = r20.toString();
        r6 = 2;
        r6 = new com.google.fI[r6];
        r8 = 0;
        r9 = new com.google.fI;
        r0 = r26;
        r10 = (float) r0;
        r9.<init>(r4, r10);
        r6[r8] = r9;
        r4 = 1;
        r8 = new com.google.fI;
        r0 = r26;
        r9 = (float) r0;
        r8.<init>(r5, r9);
        r6[r4] = r8;
        r4 = com.google.gg.CODE_128;
        r2.<init>(r3, r7, r6, r4);
        return r2;
    L_0x02ce:
        r3 = r2;
        goto L_0x0295;
    L_0x02d0:
        r5 = r6;
        r16 = r13;
        r6 = r12;
        r12 = r7;
        r7 = r9;
        r9 = r15;
        r24 = r11;
        r11 = r10;
        r10 = r24;
        goto L_0x006b;
    L_0x02de:
        r14 = r8;
        r8 = r13;
        r13 = r7;
        r7 = r5;
        r24 = r12;
        r12 = r6;
        r6 = r24;
        goto L_0x00ae;
    L_0x02e9:
        r14 = r13;
        r13 = r7;
        r7 = r5;
        r24 = r6;
        r6 = r12;
        r12 = r24;
        goto L_0x00ae;
    L_0x02f3:
        r12 = r13;
        goto L_0x0124;
    L_0x02f6:
        r12 = r6;
        r6 = r13;
        r13 = r7;
        r7 = r5;
        goto L_0x00ae;
    L_0x02fc:
        r5 = r12;
        goto L_0x0104;
    L_0x02ff:
        r5 = r8;
        r8 = r13;
        r13 = r14;
        r24 = r7;
        r7 = r6;
        r6 = r12;
        r12 = r24;
        goto L_0x0165;
    L_0x030a:
        r5 = r12;
        r12 = r13;
        r13 = r14;
        goto L_0x0130;
    L_0x030f:
        r13 = r5;
        goto L_0x0085;
    L_0x0312:
        r2 = r5;
        r6 = r11;
        r5 = r7;
        r11 = r10;
        goto L_0x00bc;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.aV.a(int, com.google.d_, java.util.Map):com.google.f6");
    }

    private static int a(d_ d_Var, int[] iArr, int i) {
        int i2 = aU.a;
        aU.a(d_Var, i, iArr);
        float f = 0.25f;
        int i3 = -1;
        int i4 = 0;
        while (i4 < b.length) {
            float a = aU.a(iArr, b[i4], 0.7f);
            if (a < f) {
                i3 = i4;
                f = a;
            }
            i4++;
            if (i2 != 0) {
                break;
            }
        }
        if (i3 >= 0) {
            return i3;
        }
        throw aN.a();
    }

    static {
        String[] strArr = new String[3];
        String str = "I/\u0013";
        int i = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i2 = 0;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i3 = 0; length > i3; i3++) {
                int i4;
                char c = cArr[i3];
                switch (i3 % 5) {
                    case v.m /*0*/:
                        i4 = 20;
                        break;
                    case at.g /*1*/:
                        i4 = arj.Theme_spinnerStyle;
                        break;
                    case at.i /*2*/:
                        i4 = 34;
                        break;
                    case at.o /*3*/:
                        i4 = 18;
                        break;
                    default:
                        i4 = 70;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "I/\u0013";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    int[][] iArr = new int[arj.Theme_seekBarStyle][];
                    iArr[0] = new int[]{2, 1, 2, 2, 2, 2};
                    iArr[1] = new int[]{2, 2, 2, 1, 2, 2};
                    iArr[2] = new int[]{2, 2, 2, 2, 2, 1};
                    iArr[3] = new int[]{1, 2, 1, 2, 2, 3};
                    iArr[4] = new int[]{1, 2, 1, 3, 2, 2};
                    iArr[5] = new int[]{1, 3, 1, 2, 2, 2};
                    iArr[6] = new int[]{1, 2, 2, 2, 1, 3};
                    iArr[7] = new int[]{1, 2, 2, 3, 1, 2};
                    iArr[8] = new int[]{1, 3, 2, 2, 1, 2};
                    iArr[9] = new int[]{2, 2, 1, 2, 1, 3};
                    iArr[10] = new int[]{2, 2, 1, 3, 1, 2};
                    iArr[11] = new int[]{2, 3, 1, 2, 1, 2};
                    iArr[12] = new int[]{1, 1, 2, 2, 3, 2};
                    iArr[13] = new int[]{1, 2, 2, 1, 3, 2};
                    iArr[14] = new int[]{1, 2, 2, 2, 3, 1};
                    iArr[15] = new int[]{1, 1, 3, 2, 2, 2};
                    iArr[16] = new int[]{1, 2, 3, 1, 2, 2};
                    iArr[17] = new int[]{1, 2, 3, 2, 2, 1};
                    iArr[18] = new int[]{2, 2, 3, 2, 1, 1};
                    iArr[19] = new int[]{2, 2, 1, 1, 3, 2};
                    iArr[20] = new int[]{2, 2, 1, 2, 3, 1};
                    iArr[21] = new int[]{2, 1, 3, 2, 1, 2};
                    iArr[22] = new int[]{2, 2, 3, 1, 1, 2};
                    iArr[23] = new int[]{3, 1, 2, 1, 3, 1};
                    iArr[24] = new int[]{3, 1, 1, 2, 2, 2};
                    iArr[25] = new int[]{3, 2, 1, 1, 2, 2};
                    iArr[26] = new int[]{3, 2, 1, 2, 2, 1};
                    iArr[27] = new int[]{3, 1, 2, 2, 1, 2};
                    iArr[28] = new int[]{3, 2, 2, 1, 1, 2};
                    iArr[29] = new int[]{3, 2, 2, 2, 1, 1};
                    iArr[30] = new int[]{2, 1, 2, 1, 2, 3};
                    iArr[31] = new int[]{2, 1, 2, 3, 2, 1};
                    iArr[32] = new int[]{2, 3, 2, 1, 2, 1};
                    iArr[33] = new int[]{1, 1, 1, 3, 2, 3};
                    iArr[34] = new int[]{1, 3, 1, 1, 2, 3};
                    iArr[35] = new int[]{1, 3, 1, 3, 2, 1};
                    iArr[36] = new int[]{1, 1, 2, 3, 1, 3};
                    iArr[37] = new int[]{1, 3, 2, 1, 1, 3};
                    iArr[38] = new int[]{1, 3, 2, 3, 1, 1};
                    iArr[39] = new int[]{2, 1, 1, 3, 1, 3};
                    iArr[40] = new int[]{2, 3, 1, 1, 1, 3};
                    iArr[41] = new int[]{2, 3, 1, 3, 1, 1};
                    iArr[42] = new int[]{1, 1, 2, 1, 3, 3};
                    iArr[43] = new int[]{1, 1, 2, 3, 3, 1};
                    iArr[44] = new int[]{1, 3, 2, 1, 3, 1};
                    iArr[45] = new int[]{1, 1, 3, 1, 2, 3};
                    iArr[46] = new int[]{1, 1, 3, 3, 2, 1};
                    iArr[47] = new int[]{1, 3, 3, 1, 2, 1};
                    iArr[48] = new int[]{3, 1, 3, 1, 2, 1};
                    iArr[49] = new int[]{2, 1, 1, 3, 3, 1};
                    iArr[50] = new int[]{2, 3, 1, 1, 3, 1};
                    iArr[51] = new int[]{2, 1, 3, 1, 1, 3};
                    iArr[52] = new int[]{2, 1, 3, 3, 1, 1};
                    iArr[53] = new int[]{2, 1, 3, 1, 3, 1};
                    iArr[54] = new int[]{3, 1, 1, 1, 2, 3};
                    iArr[55] = new int[]{3, 1, 1, 3, 2, 1};
                    iArr[56] = new int[]{3, 3, 1, 1, 2, 1};
                    iArr[57] = new int[]{3, 1, 2, 1, 1, 3};
                    iArr[58] = new int[]{3, 1, 2, 3, 1, 1};
                    iArr[59] = new int[]{3, 3, 2, 1, 1, 1};
                    iArr[60] = new int[]{3, 1, 4, 1, 1, 1};
                    iArr[61] = new int[]{2, 2, 1, 4, 1, 1};
                    iArr[62] = new int[]{4, 3, 1, 1, 1, 1};
                    iArr[63] = new int[]{1, 1, 1, 2, 2, 4};
                    iArr[64] = new int[]{1, 1, 1, 4, 2, 2};
                    iArr[65] = new int[]{1, 2, 1, 1, 2, 4};
                    iArr[66] = new int[]{1, 2, 1, 4, 2, 1};
                    iArr[67] = new int[]{1, 4, 1, 1, 2, 2};
                    iArr[68] = new int[]{1, 4, 1, 2, 2, 1};
                    iArr[69] = new int[]{1, 1, 2, 2, 1, 4};
                    iArr[70] = new int[]{1, 1, 2, 4, 1, 2};
                    iArr[71] = new int[]{1, 2, 2, 1, 1, 4};
                    iArr[72] = new int[]{1, 2, 2, 4, 1, 1};
                    iArr[73] = new int[]{1, 4, 2, 1, 1, 2};
                    iArr[74] = new int[]{1, 4, 2, 2, 1, 1};
                    iArr[75] = new int[]{2, 4, 1, 2, 1, 1};
                    iArr[76] = new int[]{2, 2, 1, 1, 1, 4};
                    iArr[77] = new int[]{4, 1, 3, 1, 1, 1};
                    iArr[78] = new int[]{2, 4, 1, 1, 1, 2};
                    iArr[79] = new int[]{1, 3, 4, 1, 1, 1};
                    iArr[80] = new int[]{1, 1, 1, 2, 4, 2};
                    iArr[81] = new int[]{1, 2, 1, 1, 4, 2};
                    iArr[82] = new int[]{1, 2, 1, 2, 4, 1};
                    iArr[83] = new int[]{1, 1, 4, 2, 1, 2};
                    iArr[84] = new int[]{1, 2, 4, 1, 1, 2};
                    iArr[85] = new int[]{1, 2, 4, 2, 1, 1};
                    iArr[86] = new int[]{4, 1, 1, 2, 1, 2};
                    iArr[87] = new int[]{4, 2, 1, 1, 1, 2};
                    iArr[88] = new int[]{4, 2, 1, 2, 1, 1};
                    iArr[89] = new int[]{2, 1, 2, 1, 4, 1};
                    iArr[90] = new int[]{2, 1, 4, 1, 2, 1};
                    iArr[91] = new int[]{4, 1, 2, 1, 2, 1};
                    iArr[92] = new int[]{1, 1, 1, 1, 4, 3};
                    iArr[93] = new int[]{1, 1, 1, 3, 4, 1};
                    iArr[94] = new int[]{1, 3, 1, 1, 4, 1};
                    iArr[95] = new int[]{1, 1, 4, 1, 1, 3};
                    iArr[96] = new int[]{1, 1, 4, 3, 1, 1};
                    iArr[97] = new int[]{4, 1, 1, 1, 1, 3};
                    iArr[98] = new int[]{4, 1, 1, 3, 1, 1};
                    iArr[99] = new int[]{1, 1, 3, 1, 4, 1};
                    iArr[100] = new int[]{1, 1, 4, 1, 3, 1};
                    iArr[arj.Theme_buttonStyleSmall] = new int[]{3, 1, 1, 1, 4, 1};
                    iArr[arj.Theme_checkboxStyle] = new int[]{4, 1, 1, 1, 3, 1};
                    iArr[arj.Theme_checkedTextViewStyle] = new int[]{2, 1, 1, 4, 1, 2};
                    iArr[arj.Theme_editTextStyle] = new int[]{2, 1, 1, 2, 1, 4};
                    iArr[arj.Theme_radioButtonStyle] = new int[]{2, 1, 1, 2, 3, 2};
                    iArr[arj.Theme_ratingBarStyle] = new int[]{2, 3, 3, 1, 1, 1, 2};
                    b = iArr;
                    return;
                default:
                    strArr2[i2] = str;
                    str = "I/\u0013";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
