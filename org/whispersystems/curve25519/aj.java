package org.whispersystems.curve25519;

public class aj {
    static J[] a;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(byte[] r8, byte[] r9) {
        /*
        r2 = 1;
        r7 = 256; // 0x100 float:3.59E-43 double:1.265E-321;
        r4 = 0;
        r5 = org.whispersystems.curve25519.J.c;
        r0 = r4;
    L_0x0007:
        if (r0 >= r7) goto L_0x0019;
    L_0x0009:
        r1 = r0 >> 3;
        r1 = r9[r1];
        r3 = r0 & 7;
        r1 = r1 >>> r3;
        r1 = r1 & 1;
        r1 = (byte) r1;
        r8[r0] = r1;
        r0 = r0 + 1;
        if (r5 == 0) goto L_0x0007;
    L_0x0019:
        r3 = r4;
    L_0x001a:
        if (r3 >= r7) goto L_0x007c;
    L_0x001c:
        r0 = r8[r3];
        if (r0 == 0) goto L_0x0078;
    L_0x0020:
        r1 = r2;
    L_0x0021:
        r0 = 6;
        if (r1 > r0) goto L_0x0078;
    L_0x0024:
        r0 = r3 + r1;
        if (r0 >= r7) goto L_0x0078;
    L_0x0028:
        r0 = r3 + r1;
        r0 = r8[r0];
        if (r0 == 0) goto L_0x0074;
    L_0x002e:
        r0 = r8[r3];
        r6 = r3 + r1;
        r6 = r8[r6];
        r6 = r6 << r1;
        r0 = r0 + r6;
        r6 = 15;
        if (r0 > r6) goto L_0x004b;
    L_0x003a:
        r0 = r8[r3];
        r6 = r3 + r1;
        r6 = r8[r6];
        r6 = r6 << r1;
        r0 = r0 + r6;
        r0 = (byte) r0;
        r8[r3] = r0;
        r0 = r3 + r1;
        r8[r0] = r4;
        if (r5 == 0) goto L_0x0074;
    L_0x004b:
        r0 = r8[r3];
        r6 = r3 + r1;
        r6 = r8[r6];
        r6 = r6 << r1;
        r0 = r0 - r6;
        r6 = -15;
        if (r0 < r6) goto L_0x0078;
    L_0x0057:
        r0 = r8[r3];
        r6 = r3 + r1;
        r6 = r8[r6];
        r6 = r6 << r1;
        r0 = r0 - r6;
        r0 = (byte) r0;
        r8[r3] = r0;
        r0 = r3 + r1;
    L_0x0064:
        if (r0 >= r7) goto L_0x0074;
    L_0x0066:
        r6 = r8[r0];
        if (r6 != 0) goto L_0x006e;
    L_0x006a:
        r8[r0] = r2;
        if (r5 == 0) goto L_0x0074;
    L_0x006e:
        r8[r0] = r4;
        r0 = r0 + 1;
        if (r5 == 0) goto L_0x0064;
    L_0x0074:
        r0 = r1 + 1;
        if (r5 == 0) goto L_0x007f;
    L_0x0078:
        r0 = r3 + 1;
        if (r5 == 0) goto L_0x007d;
    L_0x007c:
        return;
    L_0x007d:
        r3 = r0;
        goto L_0x001a;
    L_0x007f:
        r1 = r0;
        goto L_0x0021;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.curve25519.aj.a(byte[], byte[]):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(org.whispersystems.curve25519.L r9, byte[] r10, org.whispersystems.curve25519.Z r11, byte[] r12) {
        /*
        r1 = org.whispersystems.curve25519.J.c;
        r0 = 256; // 0x100 float:3.59E-43 double:1.265E-321;
        r2 = new byte[r0];
        r0 = 256; // 0x100 float:3.59E-43 double:1.265E-321;
        r3 = new byte[r0];
        r0 = 8;
        r4 = new org.whispersystems.curve25519.p[r0];
        r0 = 0;
    L_0x000f:
        r5 = 8;
        if (r0 >= r5) goto L_0x001e;
    L_0x0013:
        r5 = new org.whispersystems.curve25519.p;
        r5.<init>();
        r4[r0] = r5;
        r0 = r0 + 1;
        if (r1 == 0) goto L_0x000f;
    L_0x001e:
        r5 = new org.whispersystems.curve25519.H;
        r5.<init>();
        r6 = new org.whispersystems.curve25519.Z;
        r6.<init>();
        r0 = new org.whispersystems.curve25519.Z;
        r0.<init>();
        a(r2, r10);
        a(r3, r12);
        r7 = 0;
        r7 = r4[r7];
        org.whispersystems.curve25519.F.a(r7, r11);
        org.whispersystems.curve25519.P.a(r5, r11);
        org.whispersystems.curve25519.D.a(r0, r5);
        r7 = 0;
        r7 = r4[r7];
        org.whispersystems.curve25519.c.a(r5, r0, r7);
        org.whispersystems.curve25519.D.a(r6, r5);
        r7 = 1;
        r7 = r4[r7];
        org.whispersystems.curve25519.F.a(r7, r6);
        r7 = 1;
        r7 = r4[r7];
        org.whispersystems.curve25519.c.a(r5, r0, r7);
        org.whispersystems.curve25519.D.a(r6, r5);
        r7 = 2;
        r7 = r4[r7];
        org.whispersystems.curve25519.F.a(r7, r6);
        r7 = 2;
        r7 = r4[r7];
        org.whispersystems.curve25519.c.a(r5, r0, r7);
        org.whispersystems.curve25519.D.a(r6, r5);
        r7 = 3;
        r7 = r4[r7];
        org.whispersystems.curve25519.F.a(r7, r6);
        r7 = 3;
        r7 = r4[r7];
        org.whispersystems.curve25519.c.a(r5, r0, r7);
        org.whispersystems.curve25519.D.a(r6, r5);
        r7 = 4;
        r7 = r4[r7];
        org.whispersystems.curve25519.F.a(r7, r6);
        r7 = 4;
        r7 = r4[r7];
        org.whispersystems.curve25519.c.a(r5, r0, r7);
        org.whispersystems.curve25519.D.a(r6, r5);
        r7 = 5;
        r7 = r4[r7];
        org.whispersystems.curve25519.F.a(r7, r6);
        r7 = 5;
        r7 = r4[r7];
        org.whispersystems.curve25519.c.a(r5, r0, r7);
        org.whispersystems.curve25519.D.a(r6, r5);
        r7 = 6;
        r7 = r4[r7];
        org.whispersystems.curve25519.F.a(r7, r6);
        r7 = 6;
        r7 = r4[r7];
        org.whispersystems.curve25519.c.a(r5, r0, r7);
        org.whispersystems.curve25519.D.a(r6, r5);
        r0 = 7;
        r0 = r4[r0];
        org.whispersystems.curve25519.F.a(r0, r6);
        org.whispersystems.curve25519.aF.a(r9);
        r0 = 255; // 0xff float:3.57E-43 double:1.26E-321;
    L_0x00ad:
        if (r0 < 0) goto L_0x00b7;
    L_0x00af:
        r7 = r2[r0];
        if (r7 != 0) goto L_0x00b7;
    L_0x00b3:
        r7 = r3[r0];
        if (r7 == 0) goto L_0x010e;
    L_0x00b7:
        if (r0 < 0) goto L_0x010d;
    L_0x00b9:
        org.whispersystems.curve25519.T.a(r5, r9);
        r7 = r2[r0];
        if (r7 <= 0) goto L_0x00ce;
    L_0x00c0:
        org.whispersystems.curve25519.D.a(r6, r5);
        r7 = r2[r0];
        r7 = r7 / 2;
        r7 = r4[r7];
        org.whispersystems.curve25519.c.a(r5, r6, r7);
        if (r1 == 0) goto L_0x00df;
    L_0x00ce:
        r7 = r2[r0];
        if (r7 >= 0) goto L_0x00df;
    L_0x00d2:
        org.whispersystems.curve25519.D.a(r6, r5);
        r7 = r2[r0];
        r7 = -r7;
        r7 = r7 / 2;
        r7 = r4[r7];
        org.whispersystems.curve25519.S.a(r5, r6, r7);
    L_0x00df:
        r7 = r3[r0];
        if (r7 <= 0) goto L_0x00f3;
    L_0x00e3:
        org.whispersystems.curve25519.D.a(r6, r5);
        r7 = a;
        r8 = r3[r0];
        r8 = r8 / 2;
        r7 = r7[r8];
        org.whispersystems.curve25519.A.a(r5, r6, r7);
        if (r1 == 0) goto L_0x0106;
    L_0x00f3:
        r7 = r3[r0];
        if (r7 >= 0) goto L_0x0106;
    L_0x00f7:
        org.whispersystems.curve25519.D.a(r6, r5);
        r7 = a;
        r8 = r3[r0];
        r8 = -r8;
        r8 = r8 / 2;
        r7 = r7[r8];
        org.whispersystems.curve25519.o.a(r5, r6, r7);
    L_0x0106:
        org.whispersystems.curve25519.q.a(r9, r5);
        r0 = r0 + -1;
        if (r1 == 0) goto L_0x00b7;
    L_0x010d:
        return;
    L_0x010e:
        r0 = r0 + -1;
        if (r1 == 0) goto L_0x00ad;
    L_0x0112:
        goto L_0x00b7;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.curve25519.aj.a(org.whispersystems.curve25519.L, byte[], org.whispersystems.curve25519.Z, byte[]):void");
    }

    static {
        a = new J[8];
        a[0] = new J(new int[]{25967493, -14356035, 29566456, 3660896, -12694345, 4014787, 27544626, -11754271, -6079156, 2047605}, new int[]{-12545711, 934262, -2722910, 3049990, -727428, 9406986, 12720692, 5043384, 19500929, -15469378}, new int[]{-8738181, 4489570, 9688441, -14785194, 10184609, -12363380, 29287919, 11864899, -24514362, -4438546});
        a[1] = new J(new int[]{15636291, -9688557, 24204773, -7912398, 616977, -16685262, 27787600, -14772189, 28944400, -1550024}, new int[]{16568933, 4717097, -11556148, -1102322, 15682896, -11807043, 16354577, -11775962, 7689662, 11199574}, new int[]{30464156, -5976125, -11779434, -15670865, 23220365, 15915852, 7512774, 10017326, -17749093, -9920357});
        a[2] = new J(new int[]{10861363, 11473154, 27284546, 1981175, -30064349, 12577861, 32867885, 14515107, -15438304, 10819380}, new int[]{4708026, 6336745, 20377586, 9066809, -11272109, 6594696, -25653668, 12483688, -12668491, 5581306}, new int[]{19563160, 16186464, -29386857, 4097519, 10237984, -4348115, 28542350, 13850243, -23678021, -15815942});
        a[3] = new J(new int[]{5153746, 9909285, 1723747, -2777874, 30523605, 5516873, 19480852, 5230134, -23952439, -15175766}, new int[]{-30269007, -3463509, 7665486, 10083793, 28475525, 1649722, 20654025, 16520125, 30598449, 7715701}, new int[]{28881845, 14381568, 9657904, 3680757, -20181635, 7843316, -31400660, 1370708, 29794553, -1409300});
        a[4] = new J(new int[]{-22518993, -6692182, 14201702, -8745502, -23510406, 8844726, 18474211, -1361450, -13062696, 13821877}, new int[]{-6455177, -7839871, 3374702, -4740862, -27098617, -10571707, 31655028, -7212327, 18853322, -14220951}, new int[]{4566830, -12963868, -28974889, -12240689, -7602672, -2830569, -8514358, -10431137, 2207753, -3209784});
        a[5] = new J(new int[]{-25154831, -4185821, 29681144, 7868801, -6854661, -9423865, -12437364, -663000, -31111463, -16132436}, new int[]{25576264, -2703214, 7349804, -11814844, 16472782, 9300885, 3844789, 15725684, 171356, 6466918}, new int[]{23103977, 13316479, 9739013, -16149481, 817875, -15038942, 8965339, -14088058, -30714912, 16193877});
        a[6] = new J(new int[]{-33521811, 3180713, -2394130, 14003687, -16903474, -16270840, 17238398, 4729455, -18074513, 9256800}, new int[]{-25182317, -4174131, 32336398, 5036987, -21236817, 11360617, 22616405, 9761698, -19827198, 630305}, new int[]{-13720693, 2639453, -24237460, -7406481, 9494427, -5774029, -6554551, -15960994, -2449256, -14291300});
        a[7] = new J(new int[]{-3151181, -5046075, 9282714, 6866145, -31907062, -863023, -18940575, 15033784, 25105118, -7894876}, new int[]{-24326370, 15950226, -31801215, -14592823, -11662737, -5090925, 1573892, -2625887, 2198790, -15804619}, new int[]{-3099351, 10324967, -2241613, 7453183, -5446979, -2735503, -13812022, -16236442, -32461234, -12290683});
    }
}
