package com.google;

import com.whatsapp.arj;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import org.v;
import org.whispersystems.at;

public abstract class c3 extends ch implements fl {
    private static final String[] z;

    static {
        int i;
        String[] strArr = new String[2];
        char[] toCharArray = "\u0000i?]:+~\"Ww i>I>\nid\u001a<\fbmU1\u0001umW:\u001fk(\u001a2\b\u007f>[8\b\u007fmU9Mx%_\u007f\u001em _\u007f\u0019u=_q".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i2 = 0; length > i2; i2++) {
            char c = cArr[i2];
            switch (i2 % 5) {
                case v.m /*0*/:
                    i = arj.Theme_switchStyle;
                    break;
                case at.g /*1*/:
                    i = 12;
                    break;
                case at.i /*2*/:
                    i = 77;
                    break;
                case at.o /*3*/:
                    i = 58;
                    break;
                default:
                    i = 95;
                    break;
            }
            cArr[i2] = (char) (i ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = " i>I>\ni`N&\u001di)\u001a:\u0015x(T,\u0004c#\u001a3\fo&_;Mh(\\>\u0018`9\u001a6\u0003\u007f9[1\u000eiw\u001a".toCharArray();
        int length2 = toCharArray.length;
        cArr = toCharArray;
        for (length = 0; length2 > length; length++) {
            c = cArr[length];
            switch (length % 5) {
                case v.m /*0*/:
                    i = arj.Theme_switchStyle;
                    break;
                case at.g /*1*/:
                    i = 12;
                    break;
                case at.i /*2*/:
                    i = 77;
                    break;
                case at.o /*3*/:
                    i = 58;
                    break;
                default:
                    i = 95;
                    break;
            }
            cArr[length] = (char) (i ^ c);
        }
        strArr[1] = new String(cArr).intern();
        z = strArr;
    }

    public abstract c3 clone();

    public ch m193a(byte[] bArr) {
        return a(bArr);
    }

    public il m201mergeFrom(ad adVar, h hVar) {
        return mergeFrom(adVar, hVar);
    }

    public ch m192a(hx hxVar, h hVar) {
        return a(hxVar, hVar);
    }

    public Object m198clone() {
        return clone();
    }

    private static boolean a(fl flVar, iI iIVar, e0 e0Var) {
        if (flVar == null) {
            return iIVar.b((dH) e0Var);
        }
        try {
            return flVar.b(e0Var);
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(com.google.hx r4, com.google.h9 r5, com.google.h r6, com.google.fl r7, com.google.iI r8) {
        /*
        r1 = com.google.bA.b;
        r2 = r5.a;
        r0 = a(r7, r8, r2);
        if (r0 != 0) goto L_0x0010;
    L_0x000a:
        r3 = com.google.h.b();	 Catch:{ IllegalArgumentException -> 0x0045 }
        if (r3 == 0) goto L_0x0026;
    L_0x0010:
        if (r0 == 0) goto L_0x0047;
    L_0x0012:
        r0 = b(r7, r8, r2);
        r0 = r0.toBuilder();
        r0.a(r4, r6);
        r0 = r0.buildPartial();
    L_0x0021:
        a(r7, r8, r2, r0);
        if (r1 == 0) goto L_0x0044;
    L_0x0026:
        r0 = new com.google.hY;
        r3 = r5.b;
        r0.<init>(r3, r6, r4);
        if (r7 == 0) goto L_0x0041;
    L_0x002f:
        r3 = r7 instanceof com.google.c_;	 Catch:{ IllegalArgumentException -> 0x0054 }
        if (r3 == 0) goto L_0x0038;
    L_0x0033:
        r7.b(r2, r0);	 Catch:{ IllegalArgumentException -> 0x0056 }
        if (r1 == 0) goto L_0x0044;
    L_0x0038:
        r3 = r0.b();	 Catch:{ IllegalArgumentException -> 0x0058 }
        r7.b(r2, r3);	 Catch:{ IllegalArgumentException -> 0x0058 }
        if (r1 == 0) goto L_0x0044;
    L_0x0041:
        r8.b(r2, r0);	 Catch:{ IllegalArgumentException -> 0x0058 }
    L_0x0044:
        return;
    L_0x0045:
        r0 = move-exception;
        throw r0;
    L_0x0047:
        r0 = r5.b;
        r0 = r0.getParserForType();
        r0 = r0.a(r4, r6);
        r0 = (com.google.ci) r0;
        goto L_0x0021;
    L_0x0054:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0056 }
    L_0x0056:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0058 }
    L_0x0058:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.c3.a(com.google.hx, com.google.h9, com.google.h, com.google.fl, com.google.iI):void");
    }

    private static void a(fl flVar, iI iIVar, e0 e0Var, Object obj) {
        if (flVar != null) {
            try {
                flVar.b(e0Var, obj);
                if (!bA.b) {
                    return;
                }
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        iIVar.b((dH) e0Var, obj);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String a(java.lang.String r3, com.google.e0 r4, int r5) {
        /*
        r0 = new java.lang.StringBuilder;
        r0.<init>(r3);
        r1 = r4.m();	 Catch:{ IllegalArgumentException -> 0x0045 }
        if (r1 == 0) goto L_0x0022;
    L_0x000b:
        r1 = 40;
        r1 = r0.append(r1);	 Catch:{ IllegalArgumentException -> 0x0047 }
        r2 = r4.a();	 Catch:{ IllegalArgumentException -> 0x0047 }
        r1 = r1.append(r2);	 Catch:{ IllegalArgumentException -> 0x0047 }
        r2 = 41;
        r1.append(r2);	 Catch:{ IllegalArgumentException -> 0x0047 }
        r1 = com.google.bA.b;	 Catch:{ IllegalArgumentException -> 0x0047 }
        if (r1 == 0) goto L_0x0029;
    L_0x0022:
        r1 = r4.c();	 Catch:{ IllegalArgumentException -> 0x0047 }
        r0.append(r1);	 Catch:{ IllegalArgumentException -> 0x0047 }
    L_0x0029:
        r1 = -1;
        if (r5 == r1) goto L_0x003b;
    L_0x002c:
        r1 = 91;
        r1 = r0.append(r1);	 Catch:{ IllegalArgumentException -> 0x0049 }
        r1 = r1.append(r5);	 Catch:{ IllegalArgumentException -> 0x0049 }
        r2 = 93;
        r1.append(r2);	 Catch:{ IllegalArgumentException -> 0x0049 }
    L_0x003b:
        r1 = 46;
        r0.append(r1);
        r0 = r0.toString();
        return r0;
    L_0x0045:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0047 }
    L_0x0047:
        r0 = move-exception;
        throw r0;
    L_0x0049:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.c3.a(java.lang.String, com.google.e0, int):java.lang.String");
    }

    public c3 mergeFrom(ad adVar, h hVar) {
        boolean z = bA.b;
        c6 b = eV.b(getUnknownFields());
        do {
            int z2 = adVar.z();
            if (z2 == 0 && !z) {
                break;
            }
            try {
                if (!a(adVar, b, hVar, getDescriptorForType(), this, null, z2) && !z) {
                    break;
                }
            } catch (IllegalArgumentException e) {
                throw e;
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        } while (!z);
        a(b.d());
        return this;
    }

    private static List a(eY eYVar) {
        List arrayList = new ArrayList();
        a(eYVar, "", arrayList);
        return arrayList;
    }

    private static void b(fl flVar, iI iIVar, e0 e0Var, Object obj) {
        if (flVar != null) {
            try {
                flVar.a(e0Var, obj);
                if (!bA.b) {
                    return;
                }
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        iIVar.a((dH) e0Var, obj);
    }

    public fl m195a(hx hxVar, h hVar) {
        return a(hxVar, hVar);
    }

    public c3 a(byte[] bArr, int i, int i2) {
        return (c3) super.a(bArr, i, i2);
    }

    public c3 a(eV eVVar) {
        a(eV.b(getUnknownFields()).a(eVVar).d());
        return this;
    }

    private static ci b(fl flVar, iI iIVar, e0 e0Var) {
        if (flVar == null) {
            return (ci) iIVar.c((dH) e0Var);
        }
        try {
            return (ci) flVar.a(e0Var);
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public ch m197clone() {
        return clone();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean a(com.google.ad r11, com.google.c6 r12, com.google.h r13, com.google.fn r14, com.google.fl r15, com.google.iI r16, int r17) {
        /*
        r5 = com.google.bA.b;
        r1 = r14.f();	 Catch:{ IllegalArgumentException -> 0x0017 }
        r1 = r1.i();	 Catch:{ IllegalArgumentException -> 0x0017 }
        if (r1 == 0) goto L_0x001b;
    L_0x000c:
        r1 = com.google.f7.d;	 Catch:{ IllegalArgumentException -> 0x0019 }
        r0 = r17;
        if (r0 != r1) goto L_0x001b;
    L_0x0012:
        a(r11, r12, r13, r14, r15, r16);	 Catch:{ IllegalArgumentException -> 0x0019 }
        r1 = 1;
    L_0x0016:
        return r1;
    L_0x0017:
        r1 = move-exception;
        throw r1;	 Catch:{ IllegalArgumentException -> 0x0019 }
    L_0x0019:
        r1 = move-exception;
        throw r1;
    L_0x001b:
        r6 = com.google.f7.b(r17);
        r7 = com.google.f7.a(r17);
        r2 = 0;
        r1 = r14.b(r7);	 Catch:{ IllegalArgumentException -> 0x006a }
        if (r1 == 0) goto L_0x00a8;
    L_0x002a:
        r1 = r13 instanceof com.google.i;	 Catch:{ IllegalArgumentException -> 0x006a }
        if (r1 == 0) goto L_0x00a5;
    L_0x002e:
        r1 = r13;
        r1 = (com.google.i) r1;
        r3 = r1.a(r14, r7);
        if (r3 != 0) goto L_0x003a;
    L_0x0037:
        r1 = 0;
        if (r5 == 0) goto L_0x006c;
    L_0x003a:
        r2 = r3.a;
        r1 = r3.b;
        if (r1 != 0) goto L_0x006f;
    L_0x0040:
        r3 = r2.h();	 Catch:{ IllegalArgumentException -> 0x0068 }
        r4 = com.google.fD.MESSAGE;	 Catch:{ IllegalArgumentException -> 0x0068 }
        if (r3 != r4) goto L_0x006f;
    L_0x0048:
        r1 = new java.lang.IllegalStateException;	 Catch:{ IllegalArgumentException -> 0x0068 }
        r3 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0068 }
        r3.<init>();	 Catch:{ IllegalArgumentException -> 0x0068 }
        r4 = z;	 Catch:{ IllegalArgumentException -> 0x0068 }
        r5 = 1;
        r4 = r4[r5];	 Catch:{ IllegalArgumentException -> 0x0068 }
        r3 = r3.append(r4);	 Catch:{ IllegalArgumentException -> 0x0068 }
        r2 = r2.a();	 Catch:{ IllegalArgumentException -> 0x0068 }
        r2 = r3.append(r2);	 Catch:{ IllegalArgumentException -> 0x0068 }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x0068 }
        r1.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x0068 }
        throw r1;	 Catch:{ IllegalArgumentException -> 0x0068 }
    L_0x0068:
        r1 = move-exception;
        throw r1;
    L_0x006a:
        r1 = move-exception;
        throw r1;
    L_0x006c:
        r10 = r2;
        r2 = r1;
        r1 = r10;
    L_0x006f:
        r3 = r1;
        r4 = r2;
    L_0x0071:
        r2 = 0;
        r1 = 0;
        if (r4 != 0) goto L_0x0078;
    L_0x0075:
        r2 = 1;
        if (r5 == 0) goto L_0x009b;
    L_0x0078:
        r8 = r4.d();	 Catch:{ IllegalArgumentException -> 0x00b4 }
        r9 = 0;
        r8 = com.google.iI.a(r8, r9);	 Catch:{ IllegalArgumentException -> 0x00b4 }
        if (r6 != r8) goto L_0x0086;
    L_0x0083:
        r1 = 0;
        if (r5 == 0) goto L_0x009b;
    L_0x0086:
        r8 = r4.o();	 Catch:{ IllegalArgumentException -> 0x00b6 }
        if (r8 == 0) goto L_0x009a;
    L_0x008c:
        r8 = r4.d();	 Catch:{ IllegalArgumentException -> 0x00b6 }
        r9 = 1;
        r8 = com.google.iI.a(r8, r9);	 Catch:{ IllegalArgumentException -> 0x00b6 }
        if (r6 != r8) goto L_0x009a;
    L_0x0097:
        r1 = 1;
        if (r5 == 0) goto L_0x009b;
    L_0x009a:
        r2 = 1;
    L_0x009b:
        if (r2 == 0) goto L_0x00ba;
    L_0x009d:
        r0 = r17;
        r1 = r12.a(r0, r11);	 Catch:{ IllegalArgumentException -> 0x00b8 }
        goto L_0x0016;
    L_0x00a5:
        r1 = 0;
        if (r5 == 0) goto L_0x019c;
    L_0x00a8:
        if (r15 == 0) goto L_0x00b0;
    L_0x00aa:
        r1 = r14.a(r7);
        if (r5 == 0) goto L_0x0198;
    L_0x00b0:
        r1 = 0;
        r3 = r2;
        r4 = r1;
        goto L_0x0071;
    L_0x00b4:
        r1 = move-exception;
        throw r1;
    L_0x00b6:
        r1 = move-exception;
        throw r1;
    L_0x00b8:
        r1 = move-exception;
        throw r1;
    L_0x00ba:
        if (r1 == 0) goto L_0x0106;
    L_0x00bc:
        r1 = r11.n();
        r1 = r11.b(r1);
        r2 = r4.d();	 Catch:{ IllegalArgumentException -> 0x00e3 }
        r6 = com.google.eK.ENUM;	 Catch:{ IllegalArgumentException -> 0x00e3 }
        if (r2 != r6) goto L_0x00ec;
    L_0x00cc:
        r2 = r11.e();	 Catch:{ IllegalArgumentException -> 0x00e3 }
        if (r2 <= 0) goto L_0x0101;
    L_0x00d2:
        r2 = r11.b();
        r6 = r4.l();
        r2 = r6.a(r2);
        if (r2 != 0) goto L_0x00e5;
    L_0x00e0:
        r1 = 1;
        goto L_0x0016;
    L_0x00e3:
        r1 = move-exception;
        throw r1;
    L_0x00e5:
        r0 = r16;
        b(r15, r0, r4, r2);
        if (r5 == 0) goto L_0x00cc;
    L_0x00ec:
        r2 = r11.e();
        if (r2 <= 0) goto L_0x0101;
    L_0x00f2:
        r2 = r4.d();
        r2 = com.google.iI.a(r11, r2);
        r0 = r16;
        b(r15, r0, r4, r2);
        if (r5 == 0) goto L_0x00ec;
    L_0x0101:
        r11.g(r1);	 Catch:{ IllegalArgumentException -> 0x0132 }
        if (r5 == 0) goto L_0x012f;
    L_0x0106:
        r1 = com.google.fP.a;	 Catch:{ IllegalArgumentException -> 0x0134 }
        r2 = r4.g();	 Catch:{ IllegalArgumentException -> 0x0134 }
        r2 = r2.ordinal();	 Catch:{ IllegalArgumentException -> 0x0134 }
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x0134 }
        switch(r1) {
            case 1: goto L_0x0136;
            case 2: goto L_0x015a;
            case 3: goto L_0x017a;
            default: goto L_0x0115;
        };
    L_0x0115:
        r1 = r4.d();
        r1 = com.google.iI.a(r11, r1);
    L_0x011d:
        r2 = r4.c();	 Catch:{ IllegalArgumentException -> 0x0194 }
        if (r2 == 0) goto L_0x012a;
    L_0x0123:
        r0 = r16;
        b(r15, r0, r4, r1);	 Catch:{ IllegalArgumentException -> 0x0196 }
        if (r5 == 0) goto L_0x012f;
    L_0x012a:
        r0 = r16;
        a(r15, r0, r4, r1);	 Catch:{ IllegalArgumentException -> 0x0196 }
    L_0x012f:
        r1 = 1;
        goto L_0x0016;
    L_0x0132:
        r1 = move-exception;
        throw r1;	 Catch:{ IllegalArgumentException -> 0x0134 }
    L_0x0134:
        r1 = move-exception;
        throw r1;
    L_0x0136:
        if (r3 == 0) goto L_0x013e;
    L_0x0138:
        r1 = r3.newBuilderForType();
        if (r5 == 0) goto L_0x0142;
    L_0x013e:
        r1 = r15.a(r4);
    L_0x0142:
        r2 = r4.c();	 Catch:{ IllegalArgumentException -> 0x018e }
        if (r2 != 0) goto L_0x014d;
    L_0x0148:
        r0 = r16;
        a(r15, r0, r4, r1);	 Catch:{ IllegalArgumentException -> 0x018e }
    L_0x014d:
        r2 = r4.e();
        r11.a(r2, r1, r13);
        r1 = r1.buildPartial();
        if (r5 == 0) goto L_0x011d;
    L_0x015a:
        if (r3 == 0) goto L_0x0162;
    L_0x015c:
        r1 = r3.newBuilderForType();
        if (r5 == 0) goto L_0x0166;
    L_0x0162:
        r1 = r15.a(r4);
    L_0x0166:
        r2 = r4.c();	 Catch:{ IllegalArgumentException -> 0x0190 }
        if (r2 != 0) goto L_0x0171;
    L_0x016c:
        r0 = r16;
        a(r15, r0, r4, r1);	 Catch:{ IllegalArgumentException -> 0x0190 }
    L_0x0171:
        r11.a(r1, r13);
        r1 = r1.buildPartial();
        if (r5 == 0) goto L_0x011d;
    L_0x017a:
        r2 = r11.b();
        r1 = r4.l();
        r1 = r1.a(r2);
        if (r1 != 0) goto L_0x011d;
    L_0x0188:
        r12.a(r7, r2);	 Catch:{ IllegalArgumentException -> 0x0192 }
        r1 = 1;
        goto L_0x0016;
    L_0x018e:
        r1 = move-exception;
        throw r1;
    L_0x0190:
        r1 = move-exception;
        throw r1;
    L_0x0192:
        r1 = move-exception;
        throw r1;
    L_0x0194:
        r1 = move-exception;
        throw r1;	 Catch:{ IllegalArgumentException -> 0x0196 }
    L_0x0196:
        r1 = move-exception;
        throw r1;
    L_0x0198:
        r3 = r2;
        r4 = r1;
        goto L_0x0071;
    L_0x019c:
        r3 = r2;
        r4 = r1;
        goto L_0x0071;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.c3.a(com.google.ad, com.google.c6, com.google.h, com.google.fn, com.google.fl, com.google.iI, int):boolean");
    }

    private static void a(ad adVar, h9 h9Var, h hVar, fl flVar, iI iIVar) {
        Object buildPartial;
        dH dHVar = h9Var.a;
        if (a(flVar, iIVar, (e0) dHVar)) {
            il toBuilder = b(flVar, iIVar, dHVar).toBuilder();
            adVar.a(toBuilder, hVar);
            buildPartial = toBuilder.buildPartial();
        } else {
            ci ciVar = (ci) adVar.a(h9Var.b.getParserForType(), hVar);
        }
        if (flVar != null) {
            try {
                flVar.b(dHVar, buildPartial);
                if (!bA.b) {
                    return;
                }
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        iIVar.b(dHVar, buildPartial);
    }

    protected static x a(ci ciVar) {
        return new x(a((eY) ciVar));
    }

    private static void a(eY eYVar, String str, List list) {
        boolean z = bA.b;
        for (e0 e0Var : eYVar.getDescriptorForType().b()) {
            try {
                if (e0Var.n()) {
                    if (eYVar.b(e0Var)) {
                        continue;
                    } else {
                        list.add(str + e0Var.c());
                        continue;
                    }
                }
                if (z) {
                    break;
                }
            } catch (IllegalArgumentException e) {
                throw e;
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        }
        for (Entry entry : eYVar.a().entrySet()) {
            e0 e0Var2 = (e0) entry.getKey();
            Object value = entry.getValue();
            try {
                if (e0Var2.h() == fD.MESSAGE) {
                    if (e0Var2.c()) {
                        int i = 0;
                        for (eY a : (List) value) {
                            int i2 = i + 1;
                            a(a, a(str, e0Var2, i), list);
                            if (z) {
                                break;
                            }
                            i = i2;
                        }
                        if (!z) {
                            continue;
                        }
                    }
                    try {
                        if (eYVar.b(e0Var2)) {
                            a((eY) value, a(str, e0Var2, -1), list);
                            continue;
                        } else {
                            continue;
                        }
                    } catch (IllegalArgumentException e22) {
                        throw e22;
                    }
                }
                if (z) {
                    return;
                }
            } catch (IllegalArgumentException e222) {
                throw e222;
            }
        }
    }

    public c3 a(byte[] bArr) {
        return (c3) super.a(bArr);
    }

    public ch m199mergeFrom(ad adVar, h hVar) {
        return mergeFrom(adVar, hVar);
    }

    public c3 a(ad adVar) {
        return mergeFrom(adVar, i.a());
    }

    public c3 a(hx hxVar, h hVar) {
        return (c3) super.a(hxVar, hVar);
    }

    public ch m191a(ad adVar) {
        return a(adVar);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(com.google.ad r7, com.google.c6 r8, com.google.h r9, com.google.fn r10, com.google.fl r11, com.google.iI r12) {
        /*
        r1 = 0;
        r4 = com.google.bA.b;
        r0 = 0;
        r2 = r1;
        r3 = r0;
        r0 = r1;
    L_0x0007:
        r5 = r7.z();
        if (r5 != 0) goto L_0x000f;
    L_0x000d:
        if (r4 == 0) goto L_0x0053;
    L_0x000f:
        r6 = com.google.f7.c;	 Catch:{ IllegalArgumentException -> 0x0039 }
        if (r5 != r6) goto L_0x0026;
    L_0x0013:
        r3 = r7.t();
        if (r3 == 0) goto L_0x0051;
    L_0x0019:
        r6 = r9 instanceof com.google.i;	 Catch:{ IllegalArgumentException -> 0x003b }
        if (r6 == 0) goto L_0x0051;
    L_0x001d:
        r0 = r9;
        r0 = (com.google.i) r0;
        r0 = r0.a(r10, r3);
        if (r4 == 0) goto L_0x0051;
    L_0x0026:
        r6 = com.google.f7.a;	 Catch:{ IllegalArgumentException -> 0x003d }
        if (r5 != r6) goto L_0x0049;
    L_0x002a:
        if (r3 == 0) goto L_0x0043;
    L_0x002c:
        if (r0 == 0) goto L_0x0043;
    L_0x002e:
        r2 = com.google.h.b();	 Catch:{ IllegalArgumentException -> 0x0041 }
        if (r2 == 0) goto L_0x0043;
    L_0x0034:
        a(r7, r0, r9, r11, r12);
        r2 = r1;
        goto L_0x0007;
    L_0x0039:
        r0 = move-exception;
        throw r0;
    L_0x003b:
        r0 = move-exception;
        throw r0;
    L_0x003d:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x003f }
    L_0x003f:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0041 }
    L_0x0041:
        r0 = move-exception;
        throw r0;
    L_0x0043:
        r2 = r7.q();
        if (r4 == 0) goto L_0x0051;
    L_0x0049:
        r5 = r7.d(r5);	 Catch:{ IllegalArgumentException -> 0x0075 }
        if (r5 != 0) goto L_0x0051;
    L_0x004f:
        if (r4 == 0) goto L_0x0053;
    L_0x0051:
        if (r4 == 0) goto L_0x0007;
    L_0x0053:
        r1 = com.google.f7.b;	 Catch:{ IllegalArgumentException -> 0x0079 }
        r7.e(r1);	 Catch:{ IllegalArgumentException -> 0x0079 }
        if (r2 == 0) goto L_0x0074;
    L_0x005a:
        if (r3 == 0) goto L_0x0074;
    L_0x005c:
        if (r0 == 0) goto L_0x0063;
    L_0x005e:
        a(r2, r0, r9, r11, r12);	 Catch:{ IllegalArgumentException -> 0x007f }
        if (r4 == 0) goto L_0x0074;
    L_0x0063:
        if (r2 == 0) goto L_0x0074;
    L_0x0065:
        r0 = com.google.b7.c();	 Catch:{ IllegalArgumentException -> 0x0081 }
        r0 = r0.a(r2);	 Catch:{ IllegalArgumentException -> 0x0081 }
        r0 = r0.c();	 Catch:{ IllegalArgumentException -> 0x0081 }
        r8.b(r3, r0);	 Catch:{ IllegalArgumentException -> 0x0081 }
    L_0x0074:
        return;
    L_0x0075:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0077 }
    L_0x0077:
        r0 = move-exception;
        throw r0;
    L_0x0079:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x007b }
    L_0x007b:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x007d }
    L_0x007d:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x007f }
    L_0x007f:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0081 }
    L_0x0081:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.c3.a(com.google.ad, com.google.c6, com.google.h, com.google.fn, com.google.fl, com.google.iI):void");
    }

    public il m196a(byte[] bArr) {
        return a(bArr);
    }

    public ch m194a(byte[] bArr, int i, int i2) {
        return a(bArr, i, i2);
    }

    public fl m200mergeFrom(ci ciVar) {
        return mergeFrom(ciVar);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.c3 mergeFrom(com.google.ci r7) {
        /*
        r6 = this;
        r3 = com.google.bA.b;
        r0 = r7.getDescriptorForType();	 Catch:{ IllegalArgumentException -> 0x0017 }
        r1 = r6.getDescriptorForType();	 Catch:{ IllegalArgumentException -> 0x0017 }
        if (r0 == r1) goto L_0x0019;
    L_0x000c:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0017 }
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x0017 }
        r2 = 0;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x0017 }
        r0.<init>(r1);	 Catch:{ IllegalArgumentException -> 0x0017 }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0017 }
    L_0x0017:
        r0 = move-exception;
        throw r0;
    L_0x0019:
        r0 = r7.a();
        r0 = r0.entrySet();
        r4 = r0.iterator();
    L_0x0025:
        r0 = r4.hasNext();
        if (r0 == 0) goto L_0x0099;
    L_0x002b:
        r0 = r4.next();
        r0 = (java.util.Map.Entry) r0;
        r1 = r0.getKey();
        r1 = (com.google.e0) r1;
        r2 = r1.c();
        if (r2 == 0) goto L_0x0058;
    L_0x003d:
        r2 = r0.getValue();
        r2 = (java.util.List) r2;
        r2 = r2.iterator();
    L_0x0047:
        r5 = r2.hasNext();
        if (r5 == 0) goto L_0x0056;
    L_0x004d:
        r5 = r2.next();
        r6.a(r1, r5);
        if (r3 == 0) goto L_0x0047;
    L_0x0056:
        if (r3 == 0) goto L_0x0097;
    L_0x0058:
        r2 = r1.h();	 Catch:{ IllegalArgumentException -> 0x00a1 }
        r5 = com.google.fD.MESSAGE;	 Catch:{ IllegalArgumentException -> 0x00a1 }
        if (r2 != r5) goto L_0x0090;
    L_0x0060:
        r2 = r6.a(r1);
        r2 = (com.google.ci) r2;
        r5 = r2.getDefaultInstanceForType();	 Catch:{ IllegalArgumentException -> 0x00a3 }
        if (r2 != r5) goto L_0x0075;
    L_0x006c:
        r5 = r0.getValue();	 Catch:{ IllegalArgumentException -> 0x00a5 }
        r6.b(r1, r5);	 Catch:{ IllegalArgumentException -> 0x00a5 }
        if (r3 == 0) goto L_0x008e;
    L_0x0075:
        r5 = r2.newBuilderForType();	 Catch:{ IllegalArgumentException -> 0x00a5 }
        r5 = r5.mergeFrom(r2);	 Catch:{ IllegalArgumentException -> 0x00a5 }
        r2 = r0.getValue();	 Catch:{ IllegalArgumentException -> 0x00a5 }
        r2 = (com.google.ci) r2;	 Catch:{ IllegalArgumentException -> 0x00a5 }
        r2 = r5.mergeFrom(r2);	 Catch:{ IllegalArgumentException -> 0x00a5 }
        r2 = r2.build();	 Catch:{ IllegalArgumentException -> 0x00a5 }
        r6.b(r1, r2);	 Catch:{ IllegalArgumentException -> 0x00a5 }
    L_0x008e:
        if (r3 == 0) goto L_0x0097;
    L_0x0090:
        r0 = r0.getValue();	 Catch:{ IllegalArgumentException -> 0x00a7 }
        r6.b(r1, r0);	 Catch:{ IllegalArgumentException -> 0x00a7 }
    L_0x0097:
        if (r3 == 0) goto L_0x0025;
    L_0x0099:
        r0 = r7.getUnknownFields();
        r6.a(r0);
        return r6;
    L_0x00a1:
        r0 = move-exception;
        throw r0;
    L_0x00a3:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00a5 }
    L_0x00a5:
        r0 = move-exception;
        throw r0;
    L_0x00a7:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.c3.mergeFrom(com.google.ci):com.google.c3");
    }

    private static void a(fl flVar, iI iIVar, e0 e0Var, fl flVar2) {
        ci b = b(flVar, iIVar, e0Var);
        if (b != null) {
            try {
                flVar2.mergeFrom(b);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
    }
}
