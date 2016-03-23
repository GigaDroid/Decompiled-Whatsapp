package com.google;

import java.io.UnsupportedEncodingException;
import java.util.Collection;
import org.v;
import org.whispersystems.at;

final class eU {
    private static final char[] a;
    private static final char[] b;
    private static final char[] c;
    private static final char[] d;
    private static final String[] z;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void b(com.google.eT r7, java.lang.StringBuilder r8) {
        /*
        r6 = 8;
        r5 = 3;
        r1 = com.google.a.f;
        r2 = new int[r5];
    L_0x0007:
        r0 = r7.a();
        if (r0 != r6) goto L_0x000e;
    L_0x000d:
        return;
    L_0x000e:
        r0 = r7.a(r6);
        r3 = 254; // 0xfe float:3.56E-43 double:1.255E-321;
        if (r0 == r3) goto L_0x000d;
    L_0x0016:
        r3 = r7.a(r6);
        a(r0, r3, r2);
        r0 = 0;
    L_0x001e:
        if (r0 >= r5) goto L_0x007f;
    L_0x0020:
        r3 = r2[r0];
        if (r3 != 0) goto L_0x002b;
    L_0x0024:
        r4 = 13;
        r8.append(r4);	 Catch:{ IllegalStateException -> 0x0067 }
        if (r1 == 0) goto L_0x007b;
    L_0x002b:
        r4 = 1;
        if (r3 != r4) goto L_0x0035;
    L_0x002e:
        r4 = 42;
        r8.append(r4);	 Catch:{ IllegalStateException -> 0x006b }
        if (r1 == 0) goto L_0x007b;
    L_0x0035:
        r4 = 2;
        if (r3 != r4) goto L_0x003f;
    L_0x0038:
        r4 = 62;
        r8.append(r4);	 Catch:{ IllegalStateException -> 0x006f }
        if (r1 == 0) goto L_0x007b;
    L_0x003f:
        if (r3 != r5) goto L_0x0048;
    L_0x0041:
        r4 = 32;
        r8.append(r4);	 Catch:{ IllegalStateException -> 0x0073 }
        if (r1 == 0) goto L_0x007b;
    L_0x0048:
        r4 = 14;
        if (r3 >= r4) goto L_0x0054;
    L_0x004c:
        r4 = r3 + 44;
        r4 = (char) r4;
        r8.append(r4);	 Catch:{ IllegalStateException -> 0x0077 }
        if (r1 == 0) goto L_0x007b;
    L_0x0054:
        r4 = 40;
        if (r3 >= r4) goto L_0x0060;
    L_0x0058:
        r3 = r3 + 51;
        r3 = (char) r3;
        r8.append(r3);	 Catch:{ IllegalStateException -> 0x0065 }
        if (r1 == 0) goto L_0x007b;
    L_0x0060:
        r0 = com.google.aG.a();	 Catch:{ IllegalStateException -> 0x0065 }
        throw r0;	 Catch:{ IllegalStateException -> 0x0065 }
    L_0x0065:
        r0 = move-exception;
        throw r0;
    L_0x0067:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0069 }
    L_0x0069:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x006b }
    L_0x006b:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x006d }
    L_0x006d:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x006f }
    L_0x006f:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0071 }
    L_0x0071:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0073 }
    L_0x0073:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0075 }
    L_0x0075:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0077 }
    L_0x0077:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0079 }
    L_0x0079:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0065 }
    L_0x007b:
        r0 = r0 + 1;
        if (r1 == 0) goto L_0x001e;
    L_0x007f:
        r0 = r7.a();
        if (r0 > 0) goto L_0x0007;
    L_0x0085:
        goto L_0x000d;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.eU.b(com.google.eT, java.lang.StringBuilder):void");
    }

    private static void c(eT eTVar, StringBuilder stringBuilder) {
        int i = a.f;
        while (eTVar.a() > 16) {
            int i2 = 0;
            while (i2 < 4) {
                int a = eTVar.a(6);
                if (a == 31) {
                    a = 8 - eTVar.c();
                    if (a != 8) {
                        try {
                            eTVar.a(a);
                            return;
                        } catch (IllegalStateException e) {
                            throw e;
                        }
                    }
                    return;
                }
                if ((a & 32) == 0) {
                    a |= 64;
                }
                stringBuilder.append((char) a);
                a = i2 + 1;
                if (i != 0) {
                    break;
                }
                i2 = a;
            }
            if (eTVar.a() <= 0) {
                return;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(com.google.eT r10, java.lang.StringBuilder r11) {
        /*
        r9 = 8;
        r8 = 3;
        r1 = 0;
        r4 = com.google.a.f;
        r5 = new int[r8];
        r0 = r1;
        r2 = r1;
    L_0x000a:
        r3 = r10.a();
        if (r3 != r9) goto L_0x0011;
    L_0x0010:
        return;
    L_0x0011:
        r3 = r10.a(r9);
        r6 = 254; // 0xfe float:3.56E-43 double:1.255E-321;
        if (r3 == r6) goto L_0x0010;
    L_0x0019:
        r6 = r10.a(r9);
        a(r3, r6, r5);
        r3 = r1;
    L_0x0021:
        if (r3 >= r8) goto L_0x00ce;
    L_0x0023:
        r6 = r5[r3];
        switch(r0) {
            case 0: goto L_0x002d;
            case 1: goto L_0x0057;
            case 2: goto L_0x00e3;
            case 3: goto L_0x00e1;
            default: goto L_0x0028;
        };
    L_0x0028:
        r0 = com.google.aG.a();
        throw r0;
    L_0x002d:
        if (r6 >= r8) goto L_0x0033;
    L_0x002f:
        r0 = r6 + 1;
        if (r4 == 0) goto L_0x00ca;
    L_0x0033:
        r7 = b;	 Catch:{ IllegalStateException -> 0x0053 }
        r7 = r7.length;	 Catch:{ IllegalStateException -> 0x0053 }
        if (r6 >= r7) goto L_0x004c;
    L_0x0038:
        r7 = b;
        r6 = r7[r6];
        if (r2 == 0) goto L_0x0047;
    L_0x003e:
        r2 = r6 + 128;
        r2 = (char) r2;
        r11.append(r2);
        if (r4 == 0) goto L_0x00de;
    L_0x0046:
        r2 = r1;
    L_0x0047:
        r11.append(r6);	 Catch:{ IllegalStateException -> 0x0055 }
    L_0x004a:
        if (r4 == 0) goto L_0x00ca;
    L_0x004c:
        r0 = com.google.aG.a();	 Catch:{ IllegalStateException -> 0x0051 }
        throw r0;	 Catch:{ IllegalStateException -> 0x0051 }
    L_0x0051:
        r0 = move-exception;
        throw r0;
    L_0x0053:
        r0 = move-exception;
        throw r0;
    L_0x0055:
        r0 = move-exception;
        throw r0;
    L_0x0057:
        if (r2 == 0) goto L_0x00dc;
    L_0x0059:
        r0 = r6 + 128;
        r0 = (char) r0;
        r11.append(r0);
        if (r4 == 0) goto L_0x00da;
    L_0x0061:
        r0 = r1;
    L_0x0062:
        r2 = (char) r6;
        r11.append(r2);	 Catch:{ IllegalStateException -> 0x009a }
    L_0x0066:
        if (r4 == 0) goto L_0x00c8;
    L_0x0068:
        r2 = d;	 Catch:{ IllegalStateException -> 0x009c }
        r2 = r2.length;	 Catch:{ IllegalStateException -> 0x009c }
        if (r6 >= r2) goto L_0x0081;
    L_0x006d:
        r2 = d;
        r2 = r2[r6];
        if (r0 == 0) goto L_0x007c;
    L_0x0073:
        r0 = r2 + 128;
        r0 = (char) r0;
        r11.append(r0);
        if (r4 == 0) goto L_0x00d8;
    L_0x007b:
        r0 = r1;
    L_0x007c:
        r11.append(r2);	 Catch:{ IllegalStateException -> 0x009e }
    L_0x007f:
        if (r4 == 0) goto L_0x00a2;
    L_0x0081:
        r2 = 27;
        if (r6 != r2) goto L_0x008c;
    L_0x0085:
        r2 = 29;
        r11.append(r2);	 Catch:{ IllegalStateException -> 0x00a0 }
        if (r4 == 0) goto L_0x00a2;
    L_0x008c:
        r0 = 30;
        if (r6 != r0) goto L_0x0093;
    L_0x0090:
        r0 = 1;
        if (r4 == 0) goto L_0x00a2;
    L_0x0093:
        r0 = com.google.aG.a();	 Catch:{ IllegalStateException -> 0x0098 }
        throw r0;	 Catch:{ IllegalStateException -> 0x0098 }
    L_0x0098:
        r0 = move-exception;
        throw r0;
    L_0x009a:
        r0 = move-exception;
        throw r0;
    L_0x009c:
        r0 = move-exception;
        throw r0;
    L_0x009e:
        r0 = move-exception;
        throw r0;
    L_0x00a0:
        r0 = move-exception;
        throw r0;
    L_0x00a2:
        if (r4 == 0) goto L_0x00c8;
    L_0x00a4:
        r2 = a;	 Catch:{ IllegalStateException -> 0x00c4 }
        r2 = r2.length;	 Catch:{ IllegalStateException -> 0x00c4 }
        if (r6 >= r2) goto L_0x00bd;
    L_0x00a9:
        r2 = a;
        r2 = r2[r6];
        if (r0 == 0) goto L_0x00b8;
    L_0x00af:
        r0 = r2 + 128;
        r0 = (char) r0;
        r11.append(r0);
        if (r4 == 0) goto L_0x00d6;
    L_0x00b7:
        r0 = r1;
    L_0x00b8:
        r11.append(r2);	 Catch:{ IllegalStateException -> 0x00c6 }
    L_0x00bb:
        if (r4 == 0) goto L_0x00c8;
    L_0x00bd:
        r0 = com.google.aG.a();	 Catch:{ IllegalStateException -> 0x00c2 }
        throw r0;	 Catch:{ IllegalStateException -> 0x00c2 }
    L_0x00c2:
        r0 = move-exception;
        throw r0;
    L_0x00c4:
        r0 = move-exception;
        throw r0;
    L_0x00c6:
        r0 = move-exception;
        throw r0;
    L_0x00c8:
        r2 = r0;
        r0 = r1;
    L_0x00ca:
        r3 = r3 + 1;
        if (r4 == 0) goto L_0x0021;
    L_0x00ce:
        r3 = r10.a();
        if (r3 > 0) goto L_0x000a;
    L_0x00d4:
        goto L_0x0010;
    L_0x00d6:
        r0 = r1;
        goto L_0x00bb;
    L_0x00d8:
        r0 = r1;
        goto L_0x007f;
    L_0x00da:
        r0 = r1;
        goto L_0x0066;
    L_0x00dc:
        r0 = r2;
        goto L_0x0062;
    L_0x00de:
        r2 = r1;
        goto L_0x004a;
    L_0x00e1:
        r0 = r2;
        goto L_0x00a4;
    L_0x00e3:
        r0 = r2;
        goto L_0x0068;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.eU.a(com.google.eT, java.lang.StringBuilder):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void d(com.google.eT r10, java.lang.StringBuilder r11) {
        /*
        r9 = 8;
        r8 = 3;
        r1 = 0;
        r4 = com.google.a.f;
        r5 = new int[r8];
        r0 = r1;
        r2 = r1;
    L_0x000a:
        r3 = r10.a();
        if (r3 != r9) goto L_0x0011;
    L_0x0010:
        return;
    L_0x0011:
        r3 = r10.a(r9);
        r6 = 254; // 0xfe float:3.56E-43 double:1.255E-321;
        if (r3 == r6) goto L_0x0010;
    L_0x0019:
        r6 = r10.a(r9);
        a(r3, r6, r5);
        r3 = r1;
    L_0x0021:
        if (r3 >= r8) goto L_0x00bf;
    L_0x0023:
        r6 = r5[r3];
        switch(r0) {
            case 0: goto L_0x002f;
            case 1: goto L_0x0059;
            case 2: goto L_0x00d6;
            case 3: goto L_0x00d4;
            default: goto L_0x0028;
        };
    L_0x0028:
        r0 = com.google.aG.a();	 Catch:{ IllegalStateException -> 0x002d }
        throw r0;	 Catch:{ IllegalStateException -> 0x002d }
    L_0x002d:
        r0 = move-exception;
        throw r0;
    L_0x002f:
        if (r6 >= r8) goto L_0x0035;
    L_0x0031:
        r0 = r6 + 1;
        if (r4 == 0) goto L_0x00bb;
    L_0x0035:
        r7 = c;	 Catch:{ IllegalStateException -> 0x0055 }
        r7 = r7.length;	 Catch:{ IllegalStateException -> 0x0055 }
        if (r6 >= r7) goto L_0x004e;
    L_0x003a:
        r7 = c;
        r6 = r7[r6];
        if (r2 == 0) goto L_0x0049;
    L_0x0040:
        r2 = r6 + 128;
        r2 = (char) r2;
        r11.append(r2);
        if (r4 == 0) goto L_0x00d1;
    L_0x0048:
        r2 = r1;
    L_0x0049:
        r11.append(r6);	 Catch:{ IllegalStateException -> 0x0057 }
    L_0x004c:
        if (r4 == 0) goto L_0x00bb;
    L_0x004e:
        r0 = com.google.aG.a();	 Catch:{ IllegalStateException -> 0x0053 }
        throw r0;	 Catch:{ IllegalStateException -> 0x0053 }
    L_0x0053:
        r0 = move-exception;
        throw r0;
    L_0x0055:
        r0 = move-exception;
        throw r0;
    L_0x0057:
        r0 = move-exception;
        throw r0;
    L_0x0059:
        if (r2 == 0) goto L_0x00cf;
    L_0x005b:
        r0 = r6 + 128;
        r0 = (char) r0;
        r11.append(r0);
        if (r4 == 0) goto L_0x00cd;
    L_0x0063:
        r0 = r1;
    L_0x0064:
        r2 = (char) r6;
        r11.append(r2);	 Catch:{ IllegalStateException -> 0x009c }
    L_0x0068:
        if (r4 == 0) goto L_0x00b9;
    L_0x006a:
        r2 = d;	 Catch:{ IllegalStateException -> 0x009e }
        r2 = r2.length;	 Catch:{ IllegalStateException -> 0x009e }
        if (r6 >= r2) goto L_0x0083;
    L_0x006f:
        r2 = d;
        r2 = r2[r6];
        if (r0 == 0) goto L_0x007e;
    L_0x0075:
        r0 = r2 + 128;
        r0 = (char) r0;
        r11.append(r0);
        if (r4 == 0) goto L_0x00cb;
    L_0x007d:
        r0 = r1;
    L_0x007e:
        r11.append(r2);	 Catch:{ IllegalStateException -> 0x00a0 }
    L_0x0081:
        if (r4 == 0) goto L_0x00a4;
    L_0x0083:
        r2 = 27;
        if (r6 != r2) goto L_0x008e;
    L_0x0087:
        r2 = 29;
        r11.append(r2);	 Catch:{ IllegalStateException -> 0x00a2 }
        if (r4 == 0) goto L_0x00a4;
    L_0x008e:
        r0 = 30;
        if (r6 != r0) goto L_0x0095;
    L_0x0092:
        r0 = 1;
        if (r4 == 0) goto L_0x00a4;
    L_0x0095:
        r0 = com.google.aG.a();	 Catch:{ IllegalStateException -> 0x009a }
        throw r0;	 Catch:{ IllegalStateException -> 0x009a }
    L_0x009a:
        r0 = move-exception;
        throw r0;
    L_0x009c:
        r0 = move-exception;
        throw r0;
    L_0x009e:
        r0 = move-exception;
        throw r0;
    L_0x00a0:
        r0 = move-exception;
        throw r0;
    L_0x00a2:
        r0 = move-exception;
        throw r0;
    L_0x00a4:
        if (r4 == 0) goto L_0x00b9;
    L_0x00a6:
        if (r0 == 0) goto L_0x00b1;
    L_0x00a8:
        r0 = r6 + 224;
        r0 = (char) r0;
        r11.append(r0);
        if (r4 == 0) goto L_0x00c9;
    L_0x00b0:
        r0 = r1;
    L_0x00b1:
        r2 = r6 + 96;
        r2 = (char) r2;
        r11.append(r2);	 Catch:{ IllegalStateException -> 0x00c7 }
    L_0x00b7:
        if (r4 != 0) goto L_0x0028;
    L_0x00b9:
        r2 = r0;
        r0 = r1;
    L_0x00bb:
        r3 = r3 + 1;
        if (r4 == 0) goto L_0x0021;
    L_0x00bf:
        r3 = r10.a();
        if (r3 > 0) goto L_0x000a;
    L_0x00c5:
        goto L_0x0010;
    L_0x00c7:
        r0 = move-exception;
        throw r0;
    L_0x00c9:
        r0 = r1;
        goto L_0x00b7;
    L_0x00cb:
        r0 = r1;
        goto L_0x0081;
    L_0x00cd:
        r0 = r1;
        goto L_0x0068;
    L_0x00cf:
        r0 = r2;
        goto L_0x0064;
    L_0x00d1:
        r2 = r1;
        goto L_0x004c;
    L_0x00d4:
        r0 = r2;
        goto L_0x00a6;
    L_0x00d6:
        r0 = r2;
        goto L_0x006a;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.eU.d(com.google.eT, java.lang.StringBuilder):void");
    }

    private static void a(eT eTVar, StringBuilder stringBuilder, Collection collection) {
        int i;
        Object obj;
        int i2 = a.f;
        int b = eTVar.b() + 1;
        int i3 = b + 1;
        int a = a(eTVar.a(8), b);
        if (a == 0) {
            b = eTVar.a() / 8;
            if (i2 == 0) {
                i = b;
                a = i3;
                if (i >= 0) {
                    try {
                        throw aG.a();
                    } catch (UnsupportedEncodingException e) {
                        throw e;
                    }
                }
                obj = new byte[i];
                b = 0;
                while (b < i) {
                    try {
                        if (eTVar.a() >= 8) {
                            throw aG.a();
                        }
                        i3 = a + 1;
                        obj[b] = (byte) a(eTVar.a(8), a);
                        b++;
                        if (i2 == 0) {
                            break;
                        }
                        a = i3;
                    } catch (UnsupportedEncodingException e2) {
                        throw e2;
                    }
                }
                collection.add(obj);
                try {
                    stringBuilder.append(new String(obj, z[4]));
                    return;
                } catch (UnsupportedEncodingException e22) {
                    throw new IllegalStateException(z[5] + e22);
                }
            }
        }
        if (a >= 250 || i2 != 0) {
            a = i3 + 1;
            i = ((a - 249) * 250) + a(eTVar.a(8), i3);
        } else {
            i = a;
            a = i3;
        }
        if (i >= 0) {
            obj = new byte[i];
            b = 0;
            while (b < i) {
                if (eTVar.a() >= 8) {
                    i3 = a + 1;
                    obj[b] = (byte) a(eTVar.a(8), a);
                    b++;
                    if (i2 == 0) {
                        a = i3;
                    } else {
                        break;
                        collection.add(obj);
                        stringBuilder.append(new String(obj, z[4]));
                        return;
                    }
                }
                throw aG.a();
            }
            collection.add(obj);
            stringBuilder.append(new String(obj, z[4]));
            return;
        }
        throw aG.a();
    }

    static {
        String[] strArr = new String[6];
        String str = "\u0018oAp\u0007u[";
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
                        i3 = 67;
                        break;
                    case at.g /*1*/:
                        i3 = 70;
                        break;
                    case at.i /*2*/:
                        i3 = 127;
                        break;
                    case at.o /*3*/:
                        i3 = 110;
                        break;
                    default:
                        i3 = 55;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "]B";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "]B";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "\n\u00150V\u000fv\u007f _";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "\u0013*\u001e\u001aQ,4\u0012NS,#\fNY,2_\u001dB36\u0010\u001cCc4\u001a\u001fB*4\u001a\n\u0017&(\u001c\u0001S*(\u0018T\u0017";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    z = strArr3;
                    c = new char[]{'*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
                    d = new char[]{'!', '\"', '#', '$', '%', '&', '\'', '(', ')', '*', '+', ',', '-', '.', '/', ':', ';', '<', '=', '>', '?', '@', '[', '\\', ']', '^', '_'};
                    b = new char[]{'*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
                    a = new char[]{'`', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '{', '|', '}', '~', '\u007f'};
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u0018oAp\u0007v[";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    private static int a(int i, int i2) {
        int i3 = i - (((i2 * 149) % 255) + 1);
        return i3 >= 0 ? i3 : i3 + 256;
    }

    private static void a(int i, int i2, int[] iArr) {
        int i3 = ((i << 8) + i2) - 1;
        int i4 = i3 / 1600;
        iArr[0] = i4;
        i3 -= i4 * 1600;
        i4 = i3 / 40;
        iArr[1] = i4;
        iArr[2] = i3 - (i4 * 40);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.google.am a(byte[] r8) {
        /*
        r1 = 0;
        r3 = com.google.a.f;
        r4 = new com.google.eT;
        r4.<init>(r8);
        r5 = new java.lang.StringBuilder;
        r0 = 100;
        r5.<init>(r0);
        r6 = new java.lang.StringBuilder;
        r0 = 0;
        r6.<init>(r0);
        r2 = new java.util.ArrayList;
        r0 = 1;
        r2.<init>(r0);
        r0 = com.google.gt.ASCII_ENCODE;
    L_0x001d:
        r7 = com.google.gt.ASCII_ENCODE;
        if (r0 != r7) goto L_0x0027;
    L_0x0021:
        r0 = a(r4, r5, r6);
        if (r3 == 0) goto L_0x0054;
    L_0x0027:
        r7 = com.google.ea.a;	 Catch:{ IllegalStateException -> 0x0078 }
        r0 = r0.ordinal();	 Catch:{ IllegalStateException -> 0x0078 }
        r0 = r7[r0];	 Catch:{ IllegalStateException -> 0x0078 }
        switch(r0) {
            case 1: goto L_0x0039;
            case 2: goto L_0x003e;
            case 3: goto L_0x0043;
            case 4: goto L_0x0048;
            case 5: goto L_0x004d;
            default: goto L_0x0032;
        };
    L_0x0032:
        r0 = com.google.aG.a();	 Catch:{ IllegalStateException -> 0x0037 }
        throw r0;	 Catch:{ IllegalStateException -> 0x0037 }
    L_0x0037:
        r0 = move-exception;
        throw r0;
    L_0x0039:
        d(r4, r5);	 Catch:{ IllegalStateException -> 0x007a }
        if (r3 == 0) goto L_0x0052;
    L_0x003e:
        a(r4, r5);	 Catch:{ IllegalStateException -> 0x007c }
        if (r3 == 0) goto L_0x0052;
    L_0x0043:
        b(r4, r5);	 Catch:{ IllegalStateException -> 0x007e }
        if (r3 == 0) goto L_0x0052;
    L_0x0048:
        c(r4, r5);	 Catch:{ IllegalStateException -> 0x0080 }
        if (r3 == 0) goto L_0x0052;
    L_0x004d:
        a(r4, r5, r2);	 Catch:{ IllegalStateException -> 0x0037 }
        if (r3 != 0) goto L_0x0032;
    L_0x0052:
        r0 = com.google.gt.ASCII_ENCODE;
    L_0x0054:
        r7 = com.google.gt.PAD_ENCODE;	 Catch:{ IllegalStateException -> 0x0082 }
        if (r0 == r7) goto L_0x005e;
    L_0x0058:
        r7 = r4.a();	 Catch:{ IllegalStateException -> 0x0082 }
        if (r7 > 0) goto L_0x001d;
    L_0x005e:
        r0 = r6.length();	 Catch:{ IllegalStateException -> 0x0084 }
        if (r0 <= 0) goto L_0x0067;
    L_0x0064:
        r5.append(r6);	 Catch:{ IllegalStateException -> 0x0084 }
    L_0x0067:
        r3 = new com.google.am;	 Catch:{ IllegalStateException -> 0x0086 }
        r4 = r5.toString();	 Catch:{ IllegalStateException -> 0x0086 }
        r0 = r2.isEmpty();	 Catch:{ IllegalStateException -> 0x0086 }
        if (r0 == 0) goto L_0x0088;
    L_0x0073:
        r0 = r1;
    L_0x0074:
        r3.<init>(r8, r4, r0, r1);
        return r3;
    L_0x0078:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x007a }
    L_0x007a:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x007c }
    L_0x007c:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x007e }
    L_0x007e:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0080 }
    L_0x0080:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0037 }
    L_0x0082:
        r0 = move-exception;
        throw r0;
    L_0x0084:
        r0 = move-exception;
        throw r0;
    L_0x0086:
        r0 = move-exception;
        throw r0;
    L_0x0088:
        r0 = r2;
        goto L_0x0074;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.eU.a(byte[]):com.google.am");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.gt a(com.google.eT r7, java.lang.StringBuilder r8, java.lang.StringBuilder r9) {
        /*
        r2 = 1;
        r0 = 0;
        r3 = com.google.a.f;
    L_0x0004:
        r1 = 8;
        r1 = r7.a(r1);
        if (r1 != 0) goto L_0x0011;
    L_0x000c:
        r0 = com.google.aG.a();
        throw r0;
    L_0x0011:
        r4 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        if (r1 > r4) goto L_0x0022;
    L_0x0015:
        if (r0 == 0) goto L_0x00ec;
    L_0x0017:
        r0 = r1 + 128;
    L_0x0019:
        r0 = r0 + -1;
        r0 = (char) r0;
        r8.append(r0);
        r0 = com.google.gt.ASCII_ENCODE;
    L_0x0021:
        return r0;
    L_0x0022:
        r4 = 129; // 0x81 float:1.81E-43 double:6.37E-322;
        if (r1 != r4) goto L_0x002b;
    L_0x0026:
        r0 = com.google.gt.PAD_ENCODE;	 Catch:{ IllegalStateException -> 0x0029 }
        goto L_0x0021;
    L_0x0029:
        r0 = move-exception;
        throw r0;
    L_0x002b:
        r4 = 229; // 0xe5 float:3.21E-43 double:1.13E-321;
        if (r1 > r4) goto L_0x003f;
    L_0x002f:
        r4 = r1 + -130;
        r5 = 10;
        if (r4 >= r5) goto L_0x003a;
    L_0x0035:
        r5 = 48;
        r8.append(r5);	 Catch:{ IllegalStateException -> 0x0046 }
    L_0x003a:
        r8.append(r4);	 Catch:{ IllegalStateException -> 0x0048 }
        if (r3 == 0) goto L_0x0068;
    L_0x003f:
        r4 = 230; // 0xe6 float:3.22E-43 double:1.136E-321;
        if (r1 != r4) goto L_0x004c;
    L_0x0043:
        r0 = com.google.gt.C40_ENCODE;	 Catch:{ IllegalStateException -> 0x004a }
        goto L_0x0021;
    L_0x0046:
        r0 = move-exception;
        throw r0;
    L_0x0048:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x004a }
    L_0x004a:
        r0 = move-exception;
        throw r0;
    L_0x004c:
        r4 = 231; // 0xe7 float:3.24E-43 double:1.14E-321;
        if (r1 != r4) goto L_0x0055;
    L_0x0050:
        r0 = com.google.gt.BASE256_ENCODE;	 Catch:{ IllegalStateException -> 0x0053 }
        goto L_0x0021;
    L_0x0053:
        r0 = move-exception;
        throw r0;
    L_0x0055:
        r4 = 232; // 0xe8 float:3.25E-43 double:1.146E-321;
        if (r1 != r4) goto L_0x0060;
    L_0x0059:
        r4 = 29;
        r8.append(r4);	 Catch:{ IllegalStateException -> 0x0071 }
        if (r3 == 0) goto L_0x0068;
    L_0x0060:
        r4 = 233; // 0xe9 float:3.27E-43 double:1.15E-321;
        if (r1 == r4) goto L_0x0068;
    L_0x0064:
        r4 = 234; // 0xea float:3.28E-43 double:1.156E-321;
        if (r1 != r4) goto L_0x0077;
    L_0x0068:
        r1 = r7.a();
        if (r1 > 0) goto L_0x0004;
    L_0x006e:
        r0 = com.google.gt.ASCII_ENCODE;
        goto L_0x0021;
    L_0x0071:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0073 }
    L_0x0073:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0075 }
    L_0x0075:
        r0 = move-exception;
        throw r0;
    L_0x0077:
        r4 = 235; // 0xeb float:3.3E-43 double:1.16E-321;
        if (r1 != r4) goto L_0x007e;
    L_0x007b:
        if (r3 == 0) goto L_0x00e9;
    L_0x007d:
        r0 = r2;
    L_0x007e:
        r4 = 236; // 0xec float:3.31E-43 double:1.166E-321;
        if (r1 != r4) goto L_0x0095;
    L_0x0082:
        r4 = z;	 Catch:{ IllegalStateException -> 0x00b4 }
        r5 = 1;
        r4 = r4[r5];	 Catch:{ IllegalStateException -> 0x00b4 }
        r8.append(r4);	 Catch:{ IllegalStateException -> 0x00b4 }
        r4 = 0;
        r5 = z;	 Catch:{ IllegalStateException -> 0x00b4 }
        r6 = 2;
        r5 = r5[r6];	 Catch:{ IllegalStateException -> 0x00b4 }
        r9.insert(r4, r5);	 Catch:{ IllegalStateException -> 0x00b4 }
        if (r3 == 0) goto L_0x0068;
    L_0x0095:
        r4 = 237; // 0xed float:3.32E-43 double:1.17E-321;
        if (r1 != r4) goto L_0x00ac;
    L_0x0099:
        r4 = z;	 Catch:{ IllegalStateException -> 0x00b8 }
        r5 = 0;
        r4 = r4[r5];	 Catch:{ IllegalStateException -> 0x00b8 }
        r8.append(r4);	 Catch:{ IllegalStateException -> 0x00b8 }
        r4 = 0;
        r5 = z;	 Catch:{ IllegalStateException -> 0x00b8 }
        r6 = 3;
        r5 = r5[r6];	 Catch:{ IllegalStateException -> 0x00b8 }
        r9.insert(r4, r5);	 Catch:{ IllegalStateException -> 0x00b8 }
        if (r3 == 0) goto L_0x0068;
    L_0x00ac:
        r4 = 238; // 0xee float:3.34E-43 double:1.176E-321;
        if (r1 != r4) goto L_0x00bc;
    L_0x00b0:
        r0 = com.google.gt.ANSIX12_ENCODE;	 Catch:{ IllegalStateException -> 0x00ba }
        goto L_0x0021;
    L_0x00b4:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00b6 }
    L_0x00b6:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00b8 }
    L_0x00b8:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00ba }
    L_0x00ba:
        r0 = move-exception;
        throw r0;
    L_0x00bc:
        r4 = 239; // 0xef float:3.35E-43 double:1.18E-321;
        if (r1 != r4) goto L_0x00c6;
    L_0x00c0:
        r0 = com.google.gt.TEXT_ENCODE;	 Catch:{ IllegalStateException -> 0x00c4 }
        goto L_0x0021;
    L_0x00c4:
        r0 = move-exception;
        throw r0;
    L_0x00c6:
        r4 = 240; // 0xf0 float:3.36E-43 double:1.186E-321;
        if (r1 != r4) goto L_0x00d0;
    L_0x00ca:
        r0 = com.google.gt.EDIFACT_ENCODE;	 Catch:{ IllegalStateException -> 0x00ce }
        goto L_0x0021;
    L_0x00ce:
        r0 = move-exception;
        throw r0;
    L_0x00d0:
        r4 = 241; // 0xf1 float:3.38E-43 double:1.19E-321;
        if (r1 == r4) goto L_0x0068;
    L_0x00d4:
        r4 = 242; // 0xf2 float:3.39E-43 double:1.196E-321;
        if (r1 < r4) goto L_0x0068;
    L_0x00d8:
        r4 = 254; // 0xfe float:3.56E-43 double:1.255E-321;
        if (r1 != r4) goto L_0x00e2;
    L_0x00dc:
        r1 = r7.a();	 Catch:{ IllegalStateException -> 0x00e7 }
        if (r1 == 0) goto L_0x0068;
    L_0x00e2:
        r0 = com.google.aG.a();	 Catch:{ IllegalStateException -> 0x00e7 }
        throw r0;	 Catch:{ IllegalStateException -> 0x00e7 }
    L_0x00e7:
        r0 = move-exception;
        throw r0;
    L_0x00e9:
        r0 = r2;
        goto L_0x0068;
    L_0x00ec:
        r0 = r1;
        goto L_0x0019;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.eU.a(com.google.eT, java.lang.StringBuilder, java.lang.StringBuilder):com.google.gt");
    }
}
